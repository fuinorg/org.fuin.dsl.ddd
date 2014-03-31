package org.fuin.dsl.ddd.validation

import java.util.HashSet
import java.util.Set
import org.eclipse.xtext.validation.Check
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variableimport org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintTarget
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ValueObject
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class DomainDrivenDesignDslValidator extends AbstractDomainDrivenDesignDslValidator {

	public static val INVALID_VAR_NAME = 'invalidVarName'

	public static val EVENT_NOT_ALLOWED_FOR_VO = 'eventNotAllowedForVO'

	public static val CONSTRAINT_MSG_UNKNOWN_VAR = 'constraintMsgUnknownVar'

	public static val REF_TO_AGGREGATE_NOT_ALLOWED = 'refToAggregateNotAllowed'

	public static val VO_CANNOT_REF_ENTITY = 'voCannotRefEntity'

	@Check
	def checkNameStartsWithCapital(Variable variable) {
		if (!Character::isLowerCase(variable.name.charAt(0))) {
			warning("Variable names should start with a lower case", variable,
				DomainDrivenDesignDslPackage$Literals::VARIABLE__NAME, INVALID_VAR_NAME)
		}
	}

	@Check
	def checkNoEventsInValueObjects(AbstractVO vo) {

		for (method : vo.methods) {
			if (method.events != null) {
				for (event : method.events) {

					error("Events are only allowed within entity methods", event,
						DomainDrivenDesignDslPackage$Literals::EVENT__NAME, EVENT_NOT_ALLOWED_FOR_VO)

				}
			}
		}

	}

	@Check
	def checkVariablesInConstraintMessage(Constraint constraint) {
		var Set<String> vars = constraint.allVariables;
		var String str = constraint.message;
		var int end = -1;
		var int from = 0;
		var int start = -1;
		while ((start = str.indexOf("${", from)) > -1) {
			end = str.indexOf('}', start + 1);
			if (end == -1) {
				// No closing bracket found...
				from = str.length();
			} else {
				var String name = str.substring(start + 2, end);
				if (!vars.contains(name)) {
					error(
						"A variable with the name '" + name + "' is unknown", 
						constraint,
						DomainDrivenDesignDslPackage$Literals::CONSTRAINT__MESSAGE, 
						CONSTRAINT_MSG_UNKNOWN_VAR
						)
					// Break
					return
				}
				from = end + 1;
			}
		}

	}

	def Set<String> allVariables(Constraint constraint) {
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

	@Check
	def checkNoRefToAggregate(Variable variable) {
		
		if (variable.type instanceof Aggregate) {
			var Aggregate aggregate = (variable.type as Aggregate);
			
			error("A direct reference to an aggregates is not allowed", 
					variable,
					DomainDrivenDesignDslPackage$Literals::VARIABLE__TYPE, 
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
				}  else {
					// Aggregate
					idTypeName = (v.type as Aggregate).idType.name
				}
				error("A reference from a value object to an entity is not allowed", 
						v,
						DomainDrivenDesignDslPackage$Literals::VARIABLE__TYPE, 
						VO_CANNOT_REF_ENTITY,
						idTypeName 
					  )
			}
		}		
	}
	
}
