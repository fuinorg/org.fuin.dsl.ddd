package org.fuin.dsl.ddd.extensions

import java.util.Collections
import java.util.List
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintInstance
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Invariants

import static extension org.fuin.dsl.ddd.extensions.DddCollectionExtensions.*

/**
 * Provides extension methods for Invariants.
 */
class DddInvariantsExtensions {

	/**
	 * Returns a list of invariants instances in a null safe way.
	 * 
	 * @param invariants List of invariants or <code>null</code>.
	 * 
	 * @return List or <code>null</code>.
	 */
	def static List<ConstraintInstance> nullSafeInstances(Invariants invariants) {
		if (invariants == null) {
			return Collections.EMPTY_LIST
		}
		return invariants.instances.nullSafe
	}

}
