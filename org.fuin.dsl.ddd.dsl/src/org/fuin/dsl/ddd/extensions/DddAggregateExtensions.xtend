package org.fuin.dsl.ddd.extensions

import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AggregateId

/**
 * Provides extension methods for Aggregate.
 */
class DddAggregateExtensions {

	/**
	 * Returns the aggregate identifier type regardless if it's 
	 * defined inside the aggregate or somewhere outside.
	 * 
	 * @param aggregate Aggregate to return the identifier type for.
	 * 
	 * @return Aggregate identifier type.
	 */
	def static AggregateId getIdTypeNullsafe(Aggregate aggregate) {
		if (aggregate.idType == null) {
			return aggregate.aggregateId
		}
		return aggregate.idType
	}

}
