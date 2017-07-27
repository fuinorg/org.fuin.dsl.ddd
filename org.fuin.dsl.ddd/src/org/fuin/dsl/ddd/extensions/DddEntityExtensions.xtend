package org.fuin.dsl.ddd.extensions

import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EntityId

import static extension org.fuin.dsl.ddd.extensions.DddCollectionExtensions.*

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
		if (entity.idType === null) {
			return entity.entityId
		}
		return entity.idType
	}

	/**
	 * Returns the entity identifier that may be defined inside the entity.
	 * 
	 * @param entity Entity to return the identifier for.
	 * 
	 * @return Identifier or NULL if no such type is defined inside the entity.
	 */
	def static EntityId getEntityId(Entity entity) {
		val types = entity.elements.nullSafe.filter(typeof(EntityId))
		if (types.length == 0) {
			return null
		}
		return types.get(0)
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
		if (entity.root === null) {
			entity.eContainer as Aggregate
		}
		return entity.root
	}

}
