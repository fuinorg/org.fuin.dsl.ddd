package org.fuin.dsl.ddd.extensions

import java.util.ArrayList
import java.util.List
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintInstance
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Invariants

/**
 * Provides extension methods for Invariants.
 */
class DddInvariantsExtensions {

	/**
	 * Returns a non-null constraint list.
	 * 
	 * @param invariants Container with constraints.
	 * 
	 * @return List of constraints that is never <code<null</code>.
	 */
	public static def List<ConstraintInstance> nullSafe(Invariants invariants) {
		if ((invariants === null) || (invariants.constraintInstances === null)) {
			return new ArrayList<ConstraintInstance>()
		}
		return invariants.constraintInstances
	}

}
