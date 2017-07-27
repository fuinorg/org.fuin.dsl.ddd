package org.fuin.dsl.ddd.extensions

import java.util.ArrayList
import java.util.List
import org.fuin.dsl.ddd.domainDrivenDesignDsl.BusinessRules
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintInstance

class DddBusinessRulesExtensions {
	
	/**
	 * Returns a non-null constraint list.
	 * 
	 * @param businessRules Container with constraints.
	 * 
	 * @return List of constraints that is never <code<null</code>.
	 */
	public static def List<ConstraintInstance> nullSafe(BusinessRules businessRules) {
		if ((businessRules === null) || (businessRules.constraintInstances === null)) {
			return new ArrayList<ConstraintInstance>()
		}
		return businessRules.constraintInstances
	}
	
}