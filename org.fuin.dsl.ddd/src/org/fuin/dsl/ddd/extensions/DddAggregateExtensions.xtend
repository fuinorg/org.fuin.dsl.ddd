package org.fuin.dsl.ddd.extensions

import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AggregateId

import static extension org.fuin.dsl.ddd.extensions.DddCollectionExtensions.*

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
		if (aggregate.idType === null) {
			return aggregate.aggregateId
		}
		return aggregate.idType
	}

	/**
	 * Returns the aggregate identifier that may be defined inside the aggregate.
	 * 
	 * @param aggregate Aggregate to return the identifier for.
	 * 
	 * @return Identifier or NULL if no such type is defined inside the aggregate.
	 */
	def static AggregateId getAggregateId(Aggregate aggregate) {
		val types = aggregate.elements.nullSafe.filter(typeof(AggregateId))
		if (types.length == 0) {
			return null
		}
		return types.get(0)
	}

}
