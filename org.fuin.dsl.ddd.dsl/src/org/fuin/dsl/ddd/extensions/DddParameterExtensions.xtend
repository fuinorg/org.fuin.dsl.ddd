package org.fuin.dsl.ddd.extensions

import java.util.ArrayList
import java.util.List
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Parameter

/**
 * Provides extension methods for Parameters.
 */
class DddParameterExtensions {

	/**
	 * Returns a list of names from all parameters.
	 * 
	 * @param parameters Parameter list.
	 * 
	 * @return List with names in the same order as the parameters.
	 */
	def static List<String> asNames(List<Parameter> parameters) {
		if (parameters == null) {
			return null
		}
		val List<String> result = new ArrayList<String>()
		if (parameters != null) {
			for (parameter : parameters) {
				result.add(parameter.name)
			}
		}
		return result
	}

	
	
}
