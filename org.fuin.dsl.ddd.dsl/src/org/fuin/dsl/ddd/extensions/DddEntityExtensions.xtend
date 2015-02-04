package org.fuin.dsl.ddd.extensions

import org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EntityId

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

}
