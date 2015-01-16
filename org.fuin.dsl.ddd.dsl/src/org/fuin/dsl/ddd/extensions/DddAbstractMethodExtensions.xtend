package org.fuin.dsl.ddd.extensions

import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod

/**
 * Provides extension methods for AbstractMethod.
 */
class DddAbstractMethodExtensions {
	
	/**
	 * Returns an attribute from the user content map.
	 * 
	 * @param method Method that contains the user content.
	 * @param name Key of the attribute.
	 * 
	 * @return Value or <code>null</code>.
	 */	
	def static <T> T getUserAttr(AbstractMethod method, String name) {
		if (method.userContent == null) {
			return null
		}
		return method.userContent.get(name) as T
	}	
	
}