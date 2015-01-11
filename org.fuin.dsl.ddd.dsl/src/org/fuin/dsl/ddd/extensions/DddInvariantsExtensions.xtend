package org.fuin.dsl.ddd.extensions

import java.util.Collections
import java.util.List
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintCall
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Invariants

import static extension org.fuin.dsl.ddd.extensions.DddCollectionExtensions.*

/**
 * Provides extension methods for Invariants.
 */
class DddInvariantsExtensions {

	/**
	 * Returns a list of invariant calls in a null safe way.
	 * 
	 * @param invariants Map with registry or <code>null</code>.
	 * 
	 * @return Registry or <code>null</code>.
	 */
	def static List<ConstraintCall> nullSafeCalls(Invariants invariants) {
		if (invariants == null) {
			return Collections.EMPTY_LIST
		}
		return invariants.calls.nullSafe
	}

}
