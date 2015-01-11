package org.fuin.dsl.ddd.extensions

import java.util.ArrayList
import java.util.List

/**
 * Provides utility methods for templates.
 */
class DddExtensionUtils {

	/**
	 * Returns a string containing all tokens separated by a separator string.
	 * 
	 * @param separator Separator to use.
	 * @param tokens Array of tokens, empty array or null.
	 * 
	 * @return Tokens in the same order as in the array separated by the given separator. 
	 *         An empty array or null will return an empty string. 
	 */
	def static String separated(String separator, String... tokens) {
		if (tokens == null) {
			return ""
		}
		val StringBuilder sb = new StringBuilder()
		var int count = 0
		for (String token : tokens) {
			if (count > 0) {
				sb.append(separator)
			}
			sb.append(token)
			count = count + 1
		}
		return sb.toString
	}

	/**
	 * Combines a element and a list into a new list.
	 * 
	 * @param t First element of the new list.
	 * @param list Rest elements of the new list.
	 */
	def static <T> List<T> union(T t, List<T> list) {
		val result = new ArrayList<T>()
		result.add(t)
		result.addAll(list)
		return result
	}

}
