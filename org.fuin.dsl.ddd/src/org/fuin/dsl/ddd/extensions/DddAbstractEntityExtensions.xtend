package org.fuin.dsl.ddd.extensions

import java.util.ArrayList
import java.util.HashSet
import java.util.List
import java.util.Set
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntityId
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Event
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Service

import static extension org.fuin.dsl.ddd.extensions.DddCollectionExtensions.*
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate

/**
 * Provides extension methods for AbstractEntity.
 */
class DddAbstractEntityExtensions {

	/**
	 * Returns a list of all constructors and methods.
	 * 
	 * @param entity Entity to return all constructors and methods for.
	 * 
	 * @return List of all constructors and methods.
	 */
	def static List<AbstractMethod> constructorsAndMethods(AbstractEntity entity) {
		val List<AbstractMethod> methods = new ArrayList<AbstractMethod>()
		methods.addAll(entity.constructors)
		methods.addAll(entity.methods)
		return methods
	}

	/**
	 * Returns a list of all constructors and methods.
	 * 
	 * @param entity Entity to return all constructors and methods for.
	 * 
	 * @return List of all constructors and methods.
	 */
	def static List<Service> services(AbstractEntity entity) {
		val List<Service> services = new ArrayList<Service>()
		val methods = entity.constructorsAndMethods
		for (method : methods) {
			services.addAll(method.services.nullSafe)
		}
		return services
	}

	/**
	 * Returns a list of all direct child entities for an entity.
	 * 
	 * @param parent Direct parent with references to entities.
	 * 
	 * @return List of directly referenced child entities.
	 */
	def static Set<Entity> childEntities(AbstractEntity parent) {
		var Set<Entity> childs = new HashSet<Entity>();
		for (v : parent.attributes) {
			if (v.type instanceof Entity) {
				childs.add(v.type as Entity);
			}
		}
		return childs;
	}

	/**
	 * Returns a list of all events for an entity.
	 * 
	 * @param entity Entity to return the events for.
	 * 
	 * @return List of events declared in the entity or in one of it's methods.
	 */
	def static List<Event> allEvents(AbstractEntity entity) {
		var List<Event> events = new ArrayList<Event>();
		for (m : entity.constructorsAndMethods) {
			events.addAll(m.events.nullSafe);
		}
		for (element : entity.elements.nullSafe) {
			if (element instanceof Event) {
				events.add(element);
			}
		}
		return events;
	}

	/**
	 * Returns the abstract entity identifier that may be defined inside the abstractEntity.
	 * 
	 * @param abstractEntity Abstract entity to return the identifier for.
	 * 
	 * @return Identifier or NULL if no such type is defined inside the abstract entity.
	 */
	def static AbstractEntityId getAbstractEntityId(AbstractEntity abstractEntity) {
		val types = abstractEntity.elements.nullSafe.filter(typeof(AbstractEntityId))
		if (types.length == 0) {
			return null
		}
		return types.get(0)
	}


	/**
	 * Returns the type of the identifier for the abstract entity.
	 * 
	 * @param abstractEntity Abstract entity to return the identifier type for.
	 * 
	 * @return Identifier or NULL if no such type is defined inside the abstract entity.
	 */
	def static AbstractEntityId getIdType(AbstractEntity abstractEntity) {
		// TODO This should actually be in the generated model
		if (abstractEntity instanceof Aggregate) {
			return abstractEntity.idType
		}
		if (abstractEntity instanceof Entity) {
			return abstractEntity.idType
		}
		throw new IllegalStateException("Expected 'Aggregate' or 'Entity', but was: " + abstractEntity.class)
	}


}
