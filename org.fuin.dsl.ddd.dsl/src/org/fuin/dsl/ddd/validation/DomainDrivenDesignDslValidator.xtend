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
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractElement
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
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Method
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Namespace
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Service

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class DomainDrivenDesignDslValidator extends AbstractDomainDrivenDesignDslValidator {

	private static val MSG_DIRECT_REF_AGGREGATE = "A direct reference to an aggregate is only allowed from entities in the same aggregate"

	private static val MSG_DIRECT_REF_ENTITY = "A direct reference to an entity is only allowed from entities in the same aggregate"

	public static val INVALID_VAR_NAME = 'invalidVarName'

	public static val EVENT_ONLY_ALLOWED_FOR_ENTITY = 'eventOnlyAllowedForEntity'

	public static val CONSTRAINT_MSG_UNKNOWN_VAR = 'constraintMsgUnknownVar'

	public static val EXCEPTION_MSG_UNKNOWN_VAR = 'exceptionMsgUnknownVar'

	public static val REF_TO_AGGREGATE_NOT_ALLOWED = 'refToAggregateNotAllowed'

	public static val REF_TO_ENTITY_NOT_ALLOWED = 'refToEntityNotAllowed'

	public static val MISSING_DOC = 'missingDOC'

	public static val EVENT_MSG_UNKNOWN_VAR = 'eventMsgUnknownVar'

	public static val EXCEPTION_DUPLICATE_CID = 'exceptionDuplicateCID'

	public static val SERVICE_METHOD_CANNOT_FIRE_EVENTS = "serviceMethodCannotFireEvents"

	public static val SERVICE_METHOD_CANNOT_DECLARE_EVENTS = "serviceMethodCannotDeclareEvents"

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
			val Aggregate aggregate = (variable.type as Aggregate);
			val Entity parentEntity = getParent(Entity, variable)
			if ((parentEntity == null) || !same(aggregate, parentEntity.root)) {
				error(
					MSG_DIRECT_REF_AGGREGATE,
					variable,
					DomainDrivenDesignDslPackage.Literals::VARIABLE__TYPE,
					REF_TO_AGGREGATE_NOT_ALLOWED,
					aggregate.idType.name
				)
			}
		}

		if (variable.type instanceof Entity) {
			val Entity entity = (variable.type as Entity);
			val Aggregate aggregateOfVariable = getAggregate(variable)
			if ((aggregateOfVariable == null) || !same(aggregateOfVariable, entity.root)) {
				error(
					MSG_DIRECT_REF_ENTITY,
					variable,
					DomainDrivenDesignDslPackage.Literals::VARIABLE__TYPE,
					REF_TO_ENTITY_NOT_ALLOWED,
					entity.idType.name
				)
			}
		}

	}

	@Check
	def checkNoRefToAggregate(Method method) {

		if (method.returnType.type instanceof Aggregate) {

			val Aggregate aggregate = (method.returnType.type as Aggregate);
			val Entity parentEntity = getParent(Entity, method)
			if ((parentEntity == null) || !same(aggregate, parentEntity.root)) {
				error(
					MSG_DIRECT_REF_AGGREGATE,
					method,
					DomainDrivenDesignDslPackage.Literals::METHOD__RETURN_TYPE,
					REF_TO_AGGREGATE_NOT_ALLOWED,
					aggregate.idType.name
				)
			}

		} else if (method.returnType.type instanceof Entity) {

			val Entity entity = (method.returnType.type as Entity);
			val Entity parentEntity = getParent(Entity, method)
			if ((parentEntity == null) || !same(entity.root, parentEntity.root)) {
				error(
					MSG_DIRECT_REF_ENTITY,
					method,
					DomainDrivenDesignDslPackage.Literals::METHOD__RETURN_TYPE,
					REF_TO_ENTITY_NOT_ALLOWED,
					entity.idType.name
				)
			}

		}

	}
	
	@Check
	def checkNoEventsInService(Method method) {
		
		if (method.eContainer instanceof Service) {
			
			// No fired events
			if ((method.firedEvents != null) && (method.firedEvents.size() > 0)) {			
				error(
					"A service method cannot fire events",
					method,
					DomainDrivenDesignDslPackage.Literals::ABSTRACT_METHOD__FIRED_EVENTS,
					SERVICE_METHOD_CANNOT_FIRE_EVENTS
				)
			}

			// No declared events
			if ((method.events != null) && (method.events.size() > 0)) {			
				error(
					"A service method cannot declare events",
					method,
					DomainDrivenDesignDslPackage.Literals::ABSTRACT_METHOD__EVENTS,
					SERVICE_METHOD_CANNOT_DECLARE_EVENTS
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

	private static def EObject getRoot(EObject obj) {
		if (obj.eContainer == null) {
			return obj
		}
		return getRoot(obj.eContainer)
	}

	private static def String findUnknownVar(Set<String> vars, String msg) {
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

	private static def Set<String> allVariables(Event event) {
		var Set<String> vars = new HashSet<String>();
		if (event.variables != null) {
			for (v : event.variables) {
				vars.add(v.name);
			}
		}
		return vars;
	}

	private static def Set<String> allVariables(Exception ex) {
		var Set<String> vars = new HashSet<String>();
		if (ex.variables != null) {
			for (v : ex.variables) {
				vars.add(v.name);
			}
		}
		return vars;
	}

	private static def Set<String> allVariables(Constraint constraint) {
		var Set<String> vars = new HashSet<String>();
		if (constraint.variables != null) {
			for (v : constraint.variables) {
				vars.add(v.name);
			}
		}
		vars.add("vv");
		var ConstraintTarget target = constraint.target;
		if (target instanceof AbstractVO) {
			if (target.variables != null) {
				for (v : target.variables) {
					vars.add("vv_" + v.name);
				}
			}
		}
		return vars;
	}

	/**
	 * Returns the aggregate an object belongs to. All objects directly defined inside 
	 * an aggregate will be found and also entities that belong to the aggregate.
	 * 
	 * @param obj Object to return the aggregate for.
	 * 
	 * @return Aggregate or null if the object does not belong to an aggregate.
	 */
	private def static Aggregate getAggregate(EObject obj) {
		val AbstractEntity ae = getParent(AbstractEntity, obj)
		if (ae instanceof Aggregate) {
			return ae as Aggregate
		}
		if (ae instanceof Entity) {
			return (ae as Entity).root
		}
		return null
	}

	/**
	 * Returns the first parent with a given type for an object.
	 * 
	 * @param obj Object to return the parent for.
	 * 
	 * @return Parent or null if the object is not inside the requested type.
	 */
	private def static <T> T getParent(Class<T> clasz, EObject obj) {
		if (obj == null) {
			return null
		}
		if (clasz.isAssignableFrom(obj.class)) {
			return (obj as T)
		}
		return getParent(clasz, obj.eContainer)
	}

	/**
	 * Returns the namespace for an object.
	 * 
	 * @param obj Object to return the namespace for.
	 * 
	 * @return Namespace or null if the object is not inside one.
	 */
	private def static Namespace getNamespace(EObject obj) {
		return getParent(Namespace, obj)
	}

	/**
	 * Returns the context for an object.
	 * 
	 * @param obj Object to return the context for.
	 * 
	 * @return Context or null if the object is not inside one.
	 */
	private def static Context getContext(EObject obj) {
		return getParent(Context, obj)
	}

	/**
	 * Compares two abstract elements by their unique name.
	 * 
	 * @param a1 Element 1.
	 * @param a2 Element 2.
	 * 
	 * @return TRUE if both elements have the same unique name (context/namespace/name).
	 */
	private def static boolean same(AbstractElement a1, AbstractElement a2) {
		if (a1 == null) {
			if (a2 == null) {
				return true
			}
			return false
		} else {
			if (a2 == null) {
				return false
			}
			return a1.uniqueName.equals(a2.uniqueName)
		}
	}

	/**
	 * Returns the unique name .
	 * 
	 * @param el Element to return a unique name for.
	 * 
	 * @return Unique name in the context/namespace.
	 */
	private def static String uniqueName(AbstractElement el) {
		if (el == null) {
			throw new IllegalArgumentException("argument 'el' cannot be null")
		}
		if (el.context == null) {
			throw new IllegalArgumentException("argument 'el.context' cannot be null: " + el.path)
		}
		if (el.namespace == null) {
			throw new IllegalArgumentException("argument 'el.namespace' cannot be null: " + el.path)
		}
		return separated(".", el.context.name, el.namespace.name, el.name)
	}

	/**
	 * Returns a string containing all tokens separated by a separator string.
	 * 
	 * @param separator Separator to use.
	 * @param tokens Array of tokens, empty array or null.
	 * 
	 * @return Tokens in the same order as in the array separated by the given separator. 
	 *         An empty array or null will return an empty string. 
	 */
	private def static String separated(String separator, String... tokens) {
		if (tokens == null) {
			return ""
		}
		val StringBuilder sb = new StringBuilder()
		var int count = 0
		for (String token : tokens) {
			if (count > 0) {
				sb.append(separator)
			}
			sb.append(token)
			count = count + 1
		}
		return sb.toString
	}

	/**
	 * Returns the path in the model to the object.
	 * 
	 * @param obj Object to return the path for.
	 * 
	 * @return Path or empty string if the object is not inside one.
	 */
	private def static String getPath(EObject obj) {
		if (obj == null) {
			return ""
		}
		return getPath(obj.eContainer) + "/" + obj
	}

}
