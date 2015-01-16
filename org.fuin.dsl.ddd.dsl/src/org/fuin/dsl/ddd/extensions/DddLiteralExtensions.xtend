package org.fuin.dsl.ddd.extensions

import java.util.ArrayList
import java.util.List
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Literal
import org.fuin.dsl.ddd.domainDrivenDesignDsl.StringLiteral

/**
 * Provides extension methods for Literal.
 */
class DddLiteralExtensions {

	/**
	 * Returns the value of the literal with leading and trailing double quote.
	 * 
	 * @param literal Literal to enhance with double quotes.
	 * 
	 * @return Original value or string with double quotes. 
	 */
	def static String str(Literal literal) {
		if (literal == null) {
			return null
		}
		if (literal instanceof StringLiteral) {
			return "\"" + literal.value + "\"";
		}
		return literal.value;
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
