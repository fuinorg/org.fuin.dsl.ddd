package org.fuin.dsl.ddd.extensions

import org.fuin.dsl.ddd.domainDrivenDesignDsl.EntityId
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity

/**
 * Provides extension methods for EntityId.
 */
class DddEntityIdExtensions {

	/**
	 * Returns the entity type regardless if it's defined as parent 
	 * of the entity indentifier or somewhere else.
	 * 
	 * @param entityId Entity ID to return the entity type for.
	 * 
	 * @return Entity type.
	 */
	def static Entity getEntityNullsafe(EntityId entityId) {
		if (entityId.entity == null) {
			return entityId.eContainer as Entity
		}
		return entityId.entity
	}

}
