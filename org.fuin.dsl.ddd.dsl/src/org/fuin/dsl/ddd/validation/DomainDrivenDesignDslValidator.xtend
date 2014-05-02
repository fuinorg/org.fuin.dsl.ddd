package org.fuin.dsl.ddd.validation

import com.google.inject.Inject
import java.util.HashSet
import java.util.Iterator
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.resource.IContainer
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import org.eclipse.xtext.validation.Check
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintTarget
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Context
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Event
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Function
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ValueObject
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable
import static org.fuin.dsl.ddd.validation.DomainDrivenDesignDslValidator.*

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class DomainDrivenDesignDslValidator extends AbstractDomainDrivenDesignDslValidator {

	public static val INVALID_VAR_NAME = 'invalidVarName'

	public static val EVENT_NOT_ALLOWED_FOR_VO = 'eventNotAllowedForVO'

	public static val CONSTRAINT_MSG_UNKNOWN_VAR = 'constraintMsgUnknownVar'

	public static val EXCEPTION_MSG_UNKNOWN_VAR = 'exceptionMsgUnknownVar'

	public static val REF_TO_AGGREGATE_NOT_ALLOWED = 'refToAggregateNotAllowed'

	public static val REF_TO_ENTITY_NOT_ALLOWED = 'refToEntityNotAllowed'

	public static val VO_CANNOT_REF_ENTITY = 'voCannotRefEntity'

	public static val MISSING_DOC = 'missingDOC'

	public static val EVENT_MSG_UNKNOWN_VAR = 'eventMsgUnknownVar'

	public static val EXCEPTION_DUPLICATE_CID = 'exceptionDuplicateCID'

	@Inject
	private IContainer.Manager containerManager

	@Inject
	private ResourceDescriptionsProvider resourceDescriptionsProvider;

	@Check
	def checkNameStartsWithCapital(Variable variable) {
		if (!Character::isLowerCase(variable.name.charAt(0))) {
			warning("Variable names should start with a lower case", variable,
				DomainDrivenDesignDslPackage.Literals::VARIABLE__NAME, INVALID_VAR_NAME)
		}
	}

	@Check
	def checkNoEventsInValueObjects(AbstractVO vo) {

		for (method : vo.methods) {
			if (method.events != null) {
				for (event : method.events) {

					error("Events are only allowed within entity methods", event,
						DomainDrivenDesignDslPackage.Literals::EVENT__NAME, EVENT_NOT_ALLOWED_FOR_VO)

				}
			}
		}

	}

	@Check
	def checkVariablesInConstraintMessage(Constraint constraint) {
		val name = findUnknownVar(constraint.allVariables, constraint.message);
		if (name != null) {
			error(
				"A variable with the name '" + name + "' is unknown",
				constraint,
				DomainDrivenDesignDslPackage.Literals::CONSTRAINT__MESSAGE,
				CONSTRAINT_MSG_UNKNOWN_VAR
			)
		}
	}

	@Check
	def checkVariablesInExceptionMessage(Exception ex) {
		val name = findUnknownVar(ex.allVariables, ex.message);
		if (name != null) {
			error(
				"A variable '" + name + "' is not defined in the exception",
				ex,
				DomainDrivenDesignDslPackage.Literals::EXCEPTION__MESSAGE,
				EXCEPTION_MSG_UNKNOWN_VAR
			)
		}
	}

	@Check
	def checkForbiddenTypeRefs(Variable variable) {

		if (variable.type instanceof Aggregate) {
			var Aggregate aggregate = (variable.type as Aggregate);
			error(
				"A direct reference to an aggregates is not allowed",
				variable,
				DomainDrivenDesignDslPackage.Literals::VARIABLE__TYPE,
				REF_TO_AGGREGATE_NOT_ALLOWED,
				aggregate.idType.name
			)
		}
		if ((variable.type instanceof Entity) && (variable.eContainer instanceof Function)) {
			var Entity entity = (variable.type as Entity);
			error(
				"A direct reference to an entity is not allowed in a function",
				variable,
				DomainDrivenDesignDslPackage.Literals::VARIABLE__TYPE,
				REF_TO_ENTITY_NOT_ALLOWED,
				entity.idType.name
			)
		}

	}

	@Check
	def checkNoRefToAggregate(Function func) {

		if (func.output instanceof Aggregate) {
			var Aggregate aggregate = (func.output as Aggregate);
			error(
				"A direct reference to an aggregates is not allowed in a function",
				func,
				DomainDrivenDesignDslPackage.Literals::FUNCTION__OUTPUT,
				REF_TO_AGGREGATE_NOT_ALLOWED,
				aggregate.idType.name
			)
		}

	}

	@Check
	def checkNoRefToEntity(ValueObject vo) {

		for (v : vo.variables) {
			if (v.type instanceof AbstractEntity) {
				var String idTypeName;
				if (v.type instanceof Entity) {
					idTypeName = (v.type as Entity).idType.name
				} else {

					// Aggregate
					idTypeName = (v.type as Aggregate).idType.name
				}
				error(
					"A reference from a value object to an entity is not allowed",
					v,
					DomainDrivenDesignDslPackage.Literals::VARIABLE__TYPE,
					VO_CANNOT_REF_ENTITY,
					idTypeName
				)
			}
		}
	}

	@Check
	def checkVariablesInEventMessage(Event event) {
		if (event.message != null) {
			val name = findUnknownVar(event.allVariables, event.message);
			if (name != null) {
				error(
					"A variable with the name '" + name + "' is unknown",
					event,
					DomainDrivenDesignDslPackage.Literals::EVENT__MESSAGE,
					EVENT_MSG_UNKNOWN_VAR
				)
			}
		}
	}

	@Check
	def checkUniqueExceptionUID(Exception ex) {

		var String name = null
		var int max = 0
		val Iterator<Exception> allExceptions = getAllExceptions(ex).iterator
		while (allExceptions.hasNext) {
			val Exception other = allExceptions.next as Exception

			// Find highest number
			if ((other.cid > max) && ex.context.name.equals(other.context.name)) {
				max = other.cid
			}

			// Check for duplicate
			if ((name == null) && (ex != other) && (ex.cid > 0) && (ex.cid == other.cid) &&
				ex.context.name.equals(other.context.name)) {
				name = other.name
			}
		}

		if (name != null) {
			val String nextId = "" + (max + 1)
			error(
				"The CID is already used by exception '" + name + "'",
				ex,
				DomainDrivenDesignDslPackage.Literals::EXCEPTION__CID,
				EXCEPTION_DUPLICATE_CID,
				nextId
			)
		}
	}

	private def getAllExceptions(EObject obj) {
		val Set<Exception> list = new HashSet<Exception>()
		val resource = obj.eResource
		val resourceDescriptions = resourceDescriptionsProvider.getResourceDescriptions(resource)
		val resourceDescription = resourceDescriptions.getResourceDescription(resource.URI)
		val containers = containerManager.getVisibleContainers(resourceDescription, resourceDescriptions)
		for (container : containers) {
			for (IEObjectDescription descr : container.getExportedObjects()) {
				val EObject eObjectOrProxy = descr.getEObjectOrProxy()
				if (eObjectOrProxy instanceof Exception) {
					val Exception ex = EcoreUtil.resolve(eObjectOrProxy, obj) as Exception;
					list.add(ex)
				}
			}
		}
		return list
	}

	private def EObject getRoot(EObject obj) {
		if (obj.eContainer == null) {
			return obj
		}
		return getRoot(obj.eContainer)
	}

	private def Context getContext(EObject obj) {
		if (obj instanceof Context) {
			return obj
		}
		return getContext(obj.eContainer)
	}

	private def String findUnknownVar(Set<String> vars, String msg) {
		var int end = -1;
		var int from = 0;
		var int start = -1;
		while ((start = msg.indexOf("${", from)) > -1) {
			end = msg.indexOf('}', start + 1);
			if (end == -1) {

				// No closing bracket found...
				from = msg.length();
			} else {
				var String name = msg.substring(start + 2, end);
				if (!vars.contains(name) && !name.startsWith("#")) {
					return name
				}
				from = end + 1;
			}
		}
		return null
	}

	private def Set<String> allVariables(Event event) {
		var Set<String> vars = new HashSet<String>();
		if (event.variables != null) {
			for (v : event.variables) {
				vars.add(v.name);
			}
		}
		return vars;
	}

	private def Set<String> allVariables(Exception ex) {
		var Set<String> vars = new HashSet<String>();
		if (ex.variables != null) {
			for (v : ex.variables) {
				vars.add(v.name);
			}
		}
		return vars;
	}

	private def Set<String> allVariables(Constraint constraint) {
		var Set<String> vars = new HashSet<String>();
		if (constraint.variables != null) {
			for (v : constraint.variables) {
				vars.add(v.name);
			}
		}
		var ConstraintTarget target = constraint.target;
		if (target instanceof ExternalType) {
			vars.add("vv");
		} else if (target instanceof ValueObject) {
			var ValueObject vo = (target as ValueObject);
			if (vo.variables != null) {
				for (v : vo.variables) {
					vars.add("vv_" + v.name);
				}
			}
		}
		return vars;
	}

}
