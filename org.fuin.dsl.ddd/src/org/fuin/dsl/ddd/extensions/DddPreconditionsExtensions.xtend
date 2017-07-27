package org.fuin.dsl.ddd.extensions

import java.util.ArrayList
import java.util.List
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintInstance
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Preconditions

/**
 * Provides extension methods for Preconditions.
 */
class DddPreconditionsExtensions {

	/**
	 * Returns a non-null constraint list.
	 * 
	 * @param preconditions Container with constraints.
	 * 
	 * @return List of constraints that is never <code<null</code>.
	 */
	public static def List<ConstraintInstance> nullSafe(Preconditions preconditions) {
		if ((preconditions === null) || (preconditions.constraintInstances === null)) {
			return new ArrayList<ConstraintInstance>()
		}
		return preconditions.constraintInstances
	}

}
