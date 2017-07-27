package org.fuin.dsl.ddd.extensions

import org.eclipse.emf.ecore.EObject
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Event

import static org.fuin.dsl.ddd.extensions.DddExtensionUtils.*

import static extension org.fuin.dsl.ddd.extensions.DddEObjectExtensions.*

/**
 * Provides extension methods for Event.
 */
class DddEventExtensions {
	
	/**
	 * Returns the unique name of the event.
	 * 
	 * @param el Event to return a unique name for.
	 * 
	 * @return Unique name in the context/namespace.
	 */
	def static String uniqueName(Event event) {
		if (event === null) {
			throw new IllegalArgumentException("argument 'event' cannot be null")
		}
		if (event.context === null) {
			throw new IllegalArgumentException("argument 'event.context' cannot be null")
		}
		if (event.namespace === null) {
			throw new IllegalArgumentException("argument 'event.namespace' cannot be null")
		}
		return separated(".", event.context.name, event.namespace.name, event.name)
	}


	/**
	 * Returns the aggregate or entity for an event if it is a domain event.
	 * 
	 * @param event Event to return the parent entity for.
	 * 
	 * @return Aggregate or Entity or null if the event is not inside one.
	 */
	def static AbstractEntity getEntity(Event event) {		
		return getAbstractEntity(event)
	}

	private def static AbstractEntity getAbstractEntity(EObject obj) {
		if (obj === null) {
			return null
		}
		if (obj instanceof AbstractEntity) {
			return obj
		}
		return getAbstractEntity(obj.eContainer)
	}

}
