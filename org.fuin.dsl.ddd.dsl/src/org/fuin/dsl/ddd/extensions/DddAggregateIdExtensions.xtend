package org.fuin.dsl.ddd.extensions

import org.fuin.dsl.ddd.domainDrivenDesignDsl.AggregateId
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate

/**
 * Provides extension methods for AggregateId.
 */
class DddAggregateIdExtensions {

	/**
	 * Returns the aggregate type regardless if it's defined as parent 
	 * of the aggregate identifier or somewhere else.
	 * 
	 * @param aggregateId Aggregate ID to return the aggregate type for.
	 * 
	 * @return Aggregate type.
	 */
	def static Aggregate getAggregateNullsafe(AggregateId aggregateId) {
		if (aggregateId.aggregate == null) {
			return aggregateId.eContainer as Aggregate
		}
		return aggregateId.aggregate
	}

}
