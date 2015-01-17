package org.fuin.dsl.ddd.extensions

import org.eclipse.emf.ecore.EObject
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Context
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Namespace

/**
 * Provides extension methods for EObject.
 */
class DddEObjectExtensions {

	/**
	 * Returns the namespace for an object.
	 * 
	 * @param obj Object to return the namespace for.
	 * 
	 * @return Namespace or null if the object is not inside one.
	 */
	def static Namespace getNamespace(EObject obj) {
		if (obj == null) {
			return null
		}
		if (obj instanceof Namespace) {
			return obj
		}
		return getNamespace(obj.eContainer)
	}

	/**
	 * Returns the context for an object.
	 * 
	 * @param obj Object to return the context for.
	 * 
	 * @return Context or null if the object is not inside one.
	 */
	def static Context getContext(EObject obj) {
		if (obj == null) {
			return null
		}
		if (obj instanceof Context) {
			return obj
		}
		return getContext(obj.eContainer)
	}


	/**
	 * Returns the path in the model to the object.
	 * 
	 * @param obj Object to return the path for.
	 * 
	 * @return Path or empty string if the object is not inside one.
	 */
	def static String getPath(EObject obj) {
		if (obj == null) {
			return ""
		}
		return getPath(obj.eContainer) + "/" + obj
	}

	/**
	 * Returns the parent entity for an object.
	 * 
	 * @param obj Object to return the parent entity for.
	 * 
	 * @return Context or null if the object is not inside one.
	 */
	def static Aggregate getAggregate(EObject obj) {
		if (obj == null) {
			return null
		}
		if (obj instanceof Entity) {
			return obj.root
		}
		if (obj instanceof Aggregate) {
			return obj
		}
		return getAggregate(obj.eContainer)
	}


	/**
	 * Returns the root container for a given object.
	 * 
	 * @param obj Object to return the top container for.
	 * 
	 * @return Root container.
	 */
	static def EObject getRoot(EObject obj) {
		if (obj.eContainer == null) {
			return obj
		}
		return getRoot(obj.eContainer)
	}

	/**
	 * Returns the first parent with a given type for an object.
	 * 
	 * @param obj Object to return the parent for.
	 * 
	 * @return Parent or null if the object is not inside the requested type.
	 */
	def static <T> T getParent(Class<T> clasz, EObject obj) {
		if (obj == null) {
			return null
		}
		if (clasz.isAssignableFrom(obj.class)) {
			return (obj as T)
		}
		return getParent(clasz, obj.eContainer)
	}


}
