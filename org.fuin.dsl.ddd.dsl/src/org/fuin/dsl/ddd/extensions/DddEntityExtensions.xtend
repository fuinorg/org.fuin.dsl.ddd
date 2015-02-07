package org.fuin.dsl.ddd.extensions

import org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EntityId
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate

/**
 * Provides extension methods for Entity.
 */
class DddEntityExtensions {

	/**
	 * Returns the entity identifier type regardless if it's 
	 * defined inside the entity or somewhere outside.
	 * 
	 * @param entity Entity to return the identifier type for.
	 * 
	 * @return Entity identifier type.
	 */
	def static EntityId getIdTypeNullsafe(Entity entity) {
		if (entity.idType == null) {
			return entity.entityId
		}
		return entity.idType
	}

	/**
	 * Returns the aggregate the entity belongs to. It does not matter
	 * if the aggregate is referenced by using the 'root' expression
	 * or the entity is declared inside an aggregate.
	 * 
	 * @param entity The entity to return the aggregate for.
	 * 
	 * @return Aggregate of the entity.
	 */
	def static Aggregate getRootNullsafe(Entity entity) {
		if (entity.root == null) {
			entity.eContainer as Aggregate
		}
		return entity.root
	}


}
