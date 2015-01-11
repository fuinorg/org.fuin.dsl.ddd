package org.fuin.dsl.ddd.extensions

import java.util.ArrayList
import java.util.Collections
import java.util.List
import java.util.Map
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Literal
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable

/**
 * Provides extension methods for collections.
 */
class DddCollectionExtensions {

	/**
	 * Returns a null safe version of the list.
	 * 
	 * @return Original or empty list.
	 */
	def static <T> List<T> nullSafe(List<T> list) {
		if (list == null) {
			return Collections.emptyList;
		}
		return list
	}

	/**
	 * Returns the first element of the list.
	 * 
	 * @param list List to return the first element.
	 * 
	 * @return First element or null if the list is null or empty.
	 */
	def static <T> T first(List<T> list) {
		if ((list == null) || (list.size() == 0)) {
			return null;
		}
		return list.get(0);
	}

	/**
	 * Returns the list without the first element.
	 * 
	 * @param list List to return the rest for. 
	 * 
	 * @return Elements without the first one.
	 */
	def static <T> List<T> rest(List<T> list) {
		if (list == null) {
			return null
		}
		var List<T> rest = new ArrayList<T>();
		if ((list != null) && (list.size() > 0)) {
			var count = 0;
			for (T v : list) {
				if (count > 0) {
					rest.add(v);
				}
				count = count + 1;
			}
		}
		return rest;
	}

	/**
	 * Returns a null safe version of the map.
	 * 
	 * @return Original or empty map.
	 */
	def static <K, V> Map<K, V> nullSafe(Map<K, V> map) {
		if (map == null) {
			return Collections.emptyMap;
		}
		return map
	}

	/**
	 * Returns a list of names from all variables.
	 * 
	 * @param vars Variable list.
	 * 
	 * @return List with names in the same order as the variables.
	 */
	def static List<String> varNames(List<Variable> vars) {
		if (vars == null) {
			return null
		}
		val List<String> result = new ArrayList<String>()
		if (vars != null) {
			for (v : vars) {
				result.add(v.name)
			}
		}
		return result
	}

	/**
	 * Returns a list of names from all variables.
	 * 
	 * @param vars Variable list.
	 * 
	 * @return List with names in the same order as the variables.
	 */
	def static List<String> litNames(List<Literal> literals) {
		if (literals == null) {
			return null
		}
		val List<String> result = new ArrayList<String>()
		if (literals != null) {
			for (literal : literals) {
				result.add(literal.value)
			}
		}
		return result
	}

}
