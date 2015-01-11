package org.fuin.dsl.ddd.extensions

import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractElement

import static org.fuin.dsl.ddd.extensions.DddExtensionUtils.*

import static extension org.fuin.dsl.ddd.extensions.DddEObjectExtensions.*

/**
 * Provides extension methods for AbstractElement.
 */
class DddAbstractElementExtensions {

	/**
	 * Returns the unique name .
	 * 
	 * @param el Element to return a unique name for.
	 * 
	 * @return Unique name in the context/namespace.
	 */
	def static String uniqueName(AbstractElement el) {
		if (el == null) {
			throw new IllegalArgumentException("argument 'el' cannot be null")
		}
		if (el.context == null) {
			throw new IllegalArgumentException("argument 'el.context' cannot be null: " + el.path)
		}
		if (el.namespace == null) {
			throw new IllegalArgumentException("argument 'el.namespace' cannot be null: " + el.path)
		}
		return separated(".", el.context.name, el.namespace.name, el.name)
	}

	/**
	 * Returns the abstract unique name.
	 * 
	 * @param el Element to return an abstract unique name for.
	 * 
	 * @return Abstract unique name in the context/namespace.
	 */
	def static String uniqueAbstractName(AbstractElement el) {
		if (el == null) {
			throw new IllegalArgumentException("argument 'el' cannot be null")
		}
		if (el.context == null) {
			throw new IllegalArgumentException("argument 'el.context' cannot be null")
		}
		if (el.namespace == null) {
			throw new IllegalArgumentException("argument 'el.namespace' cannot be null")
		}
		return separated(".", el.context.name, el.namespace.name, el.abstractName)		
	}


	/**
	 * Returns the unique name .
	 * 
	 * @param el Element to return a unique name for.
	 * 
	 * @return Unique name in the context/namespace.
	 */
	def static String abstractName(AbstractElement el) {
		if (el == null) {
			throw new IllegalArgumentException("argument 'el' cannot be null")
		}
		return "Abstract" + el.name
	}

}
