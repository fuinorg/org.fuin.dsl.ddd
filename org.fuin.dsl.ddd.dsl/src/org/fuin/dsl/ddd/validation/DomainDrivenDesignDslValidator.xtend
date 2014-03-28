package org.fuin.dsl.ddd.validation

import java.util.HashSet
import java.util.Set
import org.eclipse.xtext.validation.Check
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class DomainDrivenDesignDslValidator extends AbstractDomainDrivenDesignDslValidator {

	public static val INVALID_VAR_NAME = 'invalidVarName'

	public static val INVALID_TECHNICAL_ID = 'invalidTechnicalId'
	public static val INVALID_BUSINESS_KEY = 'invalidBusinessKey'
	public static val INVALID_BUSINESS_NAME = 'invalidBusinessName'

	public static val DUPLICATE_TECHNICAL_ID = 'duplicateTechnicalId'
	public static val DUPLICATE_BUSINESS_KEY = 'duplicateBusinessKey'
	public static val DUPLICATE_BUSINESS_NAME = 'duplicateBusinessName'

	public static val EVENT_NOT_ALLOWED_FOR_VO = 'eventNotAllowedForVO'

	public static val CONSTRAINT_MSG_UNKNOWN_VAR = 'constraintMsgUnknownVar'

	private static val ERROR_MULTIPLE_ID_KEY_NAME = "Only one of 'techicalId', 'businessKey' or 'businessName' at a time is allowed for an attribute";

	@Check
	def checkNameStartsWithCapital(Variable variable) {
		if (!Character::isLowerCase(variable.name.charAt(0))) {
			warning("Variable names should start with a lower case", variable,
				DomainDrivenDesignDslPackage$Literals::VARIABLE__NAME, INVALID_VAR_NAME)
		}
	}

	@Check
	def checkIdBusinessKeyAndNameOnlyForEntity(Variable variable) {
		if (!(variable.eContainer instanceof AbstractEntity)) {
			if (variable.technicalId != null) {
				error("A technical id is only allowed for entities", variable,
					DomainDrivenDesignDslPackage$Literals::VARIABLE__TECHNICAL_ID, INVALID_TECHNICAL_ID)
			} else if (variable.businessKey != null) {
				error("A business key is only allowed for entities", variable,
					DomainDrivenDesignDslPackage$Literals::VARIABLE__BUSINESS_KEY, INVALID_BUSINESS_KEY)
			} else if (variable.businessName != null) {
				error("A business name is only allowed for entities", variable,
					DomainDrivenDesignDslPackage$Literals::VARIABLE__BUSINESS_NAME, INVALID_BUSINESS_NAME)
			}
		}
	}

	@Check
	def checkIdBusinessKeyAndName(AbstractEntity entity) {

		var String technicalId;
		var String businessKey;
		var String businessName;
		for (v : entity.variables) {
			if (v.technicalId == null) {
				if (v.businessKey == null) {
					if (v.businessName != null) {
						if (businessName == null) {
							businessName = v.name;
						} else {
							error("You can only define one business name within an entity (" + businessName + ")", v,
								DomainDrivenDesignDslPackage$Literals::VARIABLE__BUSINESS_NAME, DUPLICATE_BUSINESS_NAME)
						}
					}
				} else {
					if (businessKey == null) {
						businessKey = v.name;
						if (v.businessName != null) {
							error(ERROR_MULTIPLE_ID_KEY_NAME, v,
								DomainDrivenDesignDslPackage$Literals::VARIABLE__BUSINESS_NAME, DUPLICATE_BUSINESS_NAME)
						}
					} else {
						error("You can only define one business key within an entity (" + businessKey + ")", v,
							DomainDrivenDesignDslPackage$Literals::VARIABLE__BUSINESS_NAME, DUPLICATE_BUSINESS_KEY)
					}

				}
			} else {
				if (technicalId == null) {
					technicalId = v.name;
					if (v.businessKey != null) {
						error(ERROR_MULTIPLE_ID_KEY_NAME, v,
							DomainDrivenDesignDslPackage$Literals::VARIABLE__BUSINESS_KEY, DUPLICATE_BUSINESS_KEY)
					}
					if (v.businessName != null) {
						error(ERROR_MULTIPLE_ID_KEY_NAME, v,
							DomainDrivenDesignDslPackage$Literals::VARIABLE__BUSINESS_NAME, DUPLICATE_BUSINESS_NAME)
					}
				} else {
					error("You can only define one technical id within an entity (" + technicalId + ")", v,
						DomainDrivenDesignDslPackage$Literals::VARIABLE__TECHNICAL_ID, DUPLICATE_TECHNICAL_ID)
				}
			}
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
		var String str = constraint.message.text;
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
					error("A variable with the name '" + name + "' is unknown", constraint.message,
						DomainDrivenDesignDslPackage$Literals::MESSAGE__TEXT, CONSTRAINT_MSG_UNKNOWN_VAR)
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
		if (constraint.message.variables != null) {
			for (v : constraint.message.variables) {
				vars.add(v.name);
			}
		}
		return vars;
	}


}
