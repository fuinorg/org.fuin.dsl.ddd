package org.fuin.dsl.ddd.validation

import com.google.inject.Inject
import java.util.HashSet
import java.util.Iterator
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.resource.IContainer
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import org.eclipse.xtext.validation.Check
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AggregateId
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Attribute
import org.fuin.dsl.ddd.domainDrivenDesignDsl.BusinessRules
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Consistency
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConsistencyLevel
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Event
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception
import org.fuin.dsl.ddd.domainDrivenDesignDsl.InternalType
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Method
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Parameter
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Service
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable

import static extension org.fuin.dsl.ddd.extensions.DddAbstractElementExtensions.*
import static extension org.fuin.dsl.ddd.extensions.DddAggregateExtensions.*
import static extension org.fuin.dsl.ddd.extensions.DddAttributeExtensions.*
import static extension org.fuin.dsl.ddd.extensions.DddConstraintExtension.*
import static extension org.fuin.dsl.ddd.extensions.DddEObjectExtensions.*
import static extension org.fuin.dsl.ddd.extensions.DddEntityExtensions.*
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EntityId

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

	public static val BUSINESS_RULE_REQUIRES_EXCEPTION = "businessRuleRequiresException"

	public static val BUSINESS_RULE_REQUIRES_CONSISTENCY = "businessRuleRequiresConsistency"

	public static val ATTRIBUTE_INVARIANT_WRONG_TARGET_TYPE = "attributeInvariantWrongTargetType"

	public static val PARAMETER_CONSTRAINT_WRONG_TARGET_TYPE = "parameterConstraintWrongTargetType"

	public static val INTERNAL_TYPE_INVARIANT_WRONG_TARGET_TYPE = "internalTypeInvariantWrongTargetType"

	public static val SERVICE_NOT_ALLOWED_AS_CONSTRAINT_INPUT = "serviceNotAllowedAsConstraintInput"

	public static val WEAK_CONSISTENCY_REQUIRES_DETAILS = "weakConsistencyRequiresDetails"

	public static val STRONG_CONSISTENCY_DOES_NOT_ALLOW_DETAILS = "strongConsistencyDoesNotAllowDetails"

	public static val WRONG_IDENTIFIES_AGGREGATE = "wrongIdentifiesAggregate"

	public static val IDENTIFIES_AGGREGATE_NULL = "identifiesAggregateNull"

	public static val WRONG_IDENTIFIES_ENTITY = "wrongIdentifiesEntity"

	public static val IDENTIFIES_ENTITY_NULL = "identifiesEntityNull"

	public static val WRONG_ROOT_AGGREGATE = "wrongRootAggregate"

	public static val ROOT_NULL = "rootNull"
	
	public static val AGGREGATE_WITHOUT_ID = "aggregateWithoutId"

	public static val AGGREGATE_WITH_DUPLICATE_ID = "aggregateWithDuplicateId"

	public static val ENTITY_WITHOUT_ID = "entityWithoutId"

	public static val ENTITY_WITH_DUPLICATE_ID = "entityWithDuplicateId"

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
		val name = findUnknownVar(constraint.allAllowedVariables.asNames, constraint.message);
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
		val name = findUnknownVar(ex.attributes.asNames, ex.message);
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
			if ((parentEntity == null) || !aggregate.same(parentEntity.root)) {
				error(
					MSG_DIRECT_REF_AGGREGATE,
					variable,
					DomainDrivenDesignDslPackage.Literals::VARIABLE__TYPE,
					REF_TO_AGGREGATE_NOT_ALLOWED,
					aggregate.idTypeNullsafe.name
				)
			}
		}

		if (variable.type instanceof Entity) {
			val Entity entity = (variable.type as Entity);
			val Aggregate aggregateOfVariable = getAggregate(variable)
			if ((aggregateOfVariable == null) || !aggregateOfVariable.same(entity.root)) {
				error(
					MSG_DIRECT_REF_ENTITY,
					variable,
					DomainDrivenDesignDslPackage.Literals::VARIABLE__TYPE,
					REF_TO_ENTITY_NOT_ALLOWED,
					entity.idTypeNullsafe.name
				)
			}
		}

	}

	@Check
	def checkNoRefToAggregate(Method method) {

		if (method.returnType.type instanceof Aggregate) {

			val Aggregate aggregate = (method.returnType.type as Aggregate);
			val Entity parentEntity = getParent(Entity, method)
			if ((parentEntity == null) || !aggregate.same(parentEntity.root)) {
				error(
					MSG_DIRECT_REF_AGGREGATE,
					method,
					DomainDrivenDesignDslPackage.Literals::METHOD__RETURN_TYPE,
					REF_TO_AGGREGATE_NOT_ALLOWED,
					aggregate.idTypeNullsafe.name
				)
			}

		} else if (method.returnType.type instanceof Entity) {

			val Entity entity = (method.returnType.type as Entity);
			val Entity parentEntity = getParent(Entity, method)
			if ((parentEntity == null) || !entity.root.same(parentEntity.root)) {
				error(
					MSG_DIRECT_REF_ENTITY,
					method,
					DomainDrivenDesignDslPackage.Literals::METHOD__RETURN_TYPE,
					REF_TO_ENTITY_NOT_ALLOWED,
					entity.idTypeNullsafe.name
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
			val name = findUnknownVar(event.attributes.asNames, event.message);
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

	@Check
	def checkBusinessRulesHaveConsistencyAndExceptions(BusinessRules businessRules) {

		if (businessRules.constraintInstances != null) {
			for (constraintInstance : businessRules.constraintInstances) {
				if (constraintInstance.constraint.exception == null) {
					error(
						"A constraint used as a business rule must declare an exception",
						constraintInstance,
						DomainDrivenDesignDslPackage.Literals::CONSTRAINT_INSTANCE__CONSTRAINT,
						BUSINESS_RULE_REQUIRES_EXCEPTION
					)
				}
				if (constraintInstance.constraint.consistency == null) {
					error(
						"A constraint used as a business rule must specify the consistency",
						constraintInstance,
						DomainDrivenDesignDslPackage.Literals::CONSTRAINT_INSTANCE__CONSTRAINT,
						BUSINESS_RULE_REQUIRES_CONSISTENCY
					)
				}
			}
		}

	}

	@Check
	def checkAttributeInvariantsTargetType(Attribute attribute) {

		if ((attribute.invariants != null) && (attribute.invariants.constraintInstances != null)) {
			if (attribute.multiplicity == null) {

				// TODO Find a  way to handle collections
				for (constraintInstance : attribute.invariants.constraintInstances) {
					if (!attribute.type.equals(constraintInstance.constraint.input)) {
						error(
							"The input type of the constraint (" + constraintInstance.constraint.input.name +
								") does not match the attribute type",
							constraintInstance,
							DomainDrivenDesignDslPackage.Literals::CONSTRAINT_INSTANCE__CONSTRAINT,
							ATTRIBUTE_INVARIANT_WRONG_TARGET_TYPE
						)
					}
				}

			}
		}

	}

	@Check
	def checkParameterConstraintsTargetType(Parameter parameter) {

		if ((parameter.preconditions != null) && (parameter.preconditions.constraintInstances != null)) {
			if (parameter.multiplicity == null) {

				// TODO Find a way to handle collections
				for (constraintInstance : parameter.preconditions.constraintInstances) {
					if (!parameter.type.equals(constraintInstance.constraint.input)) {
						error(
							"The input type of the constraint (" + constraintInstance.constraint.input.name +
								") does not match the parameter type",
							constraintInstance,
							DomainDrivenDesignDslPackage.Literals::CONSTRAINT_INSTANCE__CONSTRAINT,
							PARAMETER_CONSTRAINT_WRONG_TARGET_TYPE
						)
					}
				}

			}
		}

		if ((parameter.businessRules != null) && (parameter.businessRules.constraintInstances != null)) {
			if (parameter.multiplicity == null) {

				// TODO Find a way to handle collections
				for (constraintInstance : parameter.businessRules.constraintInstances) {
					if (!parameter.type.equals(constraintInstance.constraint.input)) {
						error(
							"The input type of the constraint (" + constraintInstance.constraint.input.name +
								") does not match the parameter type",
							constraintInstance,
							DomainDrivenDesignDslPackage.Literals::CONSTRAINT_INSTANCE__CONSTRAINT,
							PARAMETER_CONSTRAINT_WRONG_TARGET_TYPE
						)
					}
				}

			}
		}

	}

	@Check
	def checkInternalTypeInvariantsTargetType(InternalType internalType) {

		if ((internalType.invariants != null) && (internalType.invariants.constraintInstances != null)) {

			for (constraintInstance : internalType.invariants.constraintInstances) {
				if (!internalType.equals(constraintInstance.constraint.input)) {
					error(
						"The input type of the constraint (" + constraintInstance.constraint.input.name +
							") does not match this type",
						constraintInstance,
						DomainDrivenDesignDslPackage.Literals::CONSTRAINT_INSTANCE__CONSTRAINT,
						INTERNAL_TYPE_INVARIANT_WRONG_TARGET_TYPE
					)
				}
			}

		}

	}

	@Check
	def checkConstraintInputNotService(Constraint constraint) {

		if (constraint.input instanceof Service) {
			error(
				"A service is not allowed as input for a constraint",
				constraint,
				DomainDrivenDesignDslPackage.Literals::CONSTRAINT__INPUT,
				SERVICE_NOT_ALLOWED_AS_CONSTRAINT_INPUT
			)
		}

	}
	
	@Check
	def checkWeakConsistency(Consistency consistency) {
		
		if ((consistency.level == ConsistencyLevel.WEAK) && (consistency.weakConsistency == null)) {
			error(
				"You must define the details for weak consistency",
				consistency,
				DomainDrivenDesignDslPackage.Literals::CONSISTENCY__WEAK_CONSISTENCY,
				WEAK_CONSISTENCY_REQUIRES_DETAILS
			)
		}
		
		if ((consistency.level == ConsistencyLevel.STRONG) && (consistency.weakConsistency != null)) {
			error(
				"No details required for strong consistency",
				consistency,
				DomainDrivenDesignDslPackage.Literals::CONSISTENCY__WEAK_CONSISTENCY,
				STRONG_CONSISTENCY_DOES_NOT_ALLOW_DETAILS
			)
		}
		
	}
	
	@Check
	def checkAggregateIdIdentifies(AggregateId aggregateId) {
		
		if (aggregateId.eContainer instanceof Aggregate) {
			if ((aggregateId.aggregate != null) && (aggregateId.aggregate != aggregateId.eContainer)) {
				error(
					"An ID defined in an aggregate can only identify the parent aggregate",
					aggregateId,
					DomainDrivenDesignDslPackage.Literals::AGGREGATE_ID__AGGREGATE,
					WRONG_IDENTIFIES_AGGREGATE
				)
			}
		} else {
			if (aggregateId.aggregate == null) {
				error(
					"An ID defined outside an aggregate must use the 'identifies' expression",
					aggregateId,
					DomainDrivenDesignDslPackage.Literals::AGGREGATE_ID__AGGREGATE,
					IDENTIFIES_AGGREGATE_NULL
				)
			}
		}
		
	}
	
	@Check
	def checkEntityIdIdentifies(EntityId entityId) {
		
		if (entityId.eContainer instanceof Entity) {
			if ((entityId.entity != null) && (entityId.entity != entityId.eContainer)) {
				error(
					"An ID defined in an entity can only identify the parent entity",
					entityId,
					DomainDrivenDesignDslPackage.Literals::ENTITY_ID__ENTITY,
					WRONG_IDENTIFIES_ENTITY
				)
			}
		} else {
			if (entityId.entity == null) {
				error(
					"An ID defined outside an entity must use the 'identifies' expression",
					entityId,
					DomainDrivenDesignDslPackage.Literals::ENTITY_ID__ENTITY,
					IDENTIFIES_ENTITY_NULL
				)
			}
		}
		
	}

	@Check
	def checkEntityRoot(Entity entity) {
		
		if (entity.eContainer instanceof Aggregate) {
			if ((entity.root != null) && (entity.root != entity.eContainer)) {
				error(
					"An entity defined in an aggregate can only reference the parent aggregate",
					entity,
					DomainDrivenDesignDslPackage.Literals::ENTITY__ROOT,
					WRONG_ROOT_AGGREGATE
				)
			}
		} else {
			if (entity.root == null) {
				error(
					"An entity defined outside an aggregate must use the 'root' expression",
					entity,
					DomainDrivenDesignDslPackage.Literals::ENTITY__ROOT,
					ROOT_NULL
				)
			}			
		}	
		
	}
	
	@Check
	def checkEntityHasId(Entity entity) {
		
		if (entity.idType == null) {
			if (entity.entityId == null) {
				error(
					"Entity does not define an ID",
					entity,
					DomainDrivenDesignDslPackage.Literals::ENTITY__ID_TYPE,
					ENTITY_WITHOUT_ID
				)
			}
		} else {
			if (entity.entityId != null) {
				error(
					"Entity cannot not reference an ID using 'identifier' and define another inside the aggregate",
					entity,
					DomainDrivenDesignDslPackage.Literals::ENTITY__ENTITY_ID,
					ENTITY_WITH_DUPLICATE_ID
				)
			}
		}
		
	}	
	
	@Check
	def checkAggregateHasId(Aggregate aggregate) {
		
		if (aggregate.idType == null) {
			if (aggregate.aggregateId == null) {
				error(
					"Aggregate does not define an ID",
					aggregate,
					DomainDrivenDesignDslPackage.Literals::AGGREGATE__ID_TYPE,
					AGGREGATE_WITHOUT_ID
				)
			}
		} else {
			if (aggregate.aggregateId != null) {
				error(
					"Aggregate cannot not reference an ID using 'identifier' and define another inside the aggregate",
					aggregate,
					DomainDrivenDesignDslPackage.Literals::AGGREGATE__AGGREGATE_ID,
					AGGREGATE_WITH_DUPLICATE_ID
				)
			}
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

	private static def String findUnknownVar(List<String> vars, String msg) {
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

}
