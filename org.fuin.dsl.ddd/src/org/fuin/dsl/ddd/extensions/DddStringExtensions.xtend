package org.fuin.dsl.ddd.extensions

import java.util.StringTokenizer

/**
 * Provides extension methods for String.
 */
class DddStringExtensions {

	/**
	 * Returns the pure doc message without slashes and stars in one line.
	 * 
	 * @param str JavaDoc comment. 
	 * 
	 * @return Plain single line text.
	 */
	def static String text(String str) {
		if (str === null) {
			return "";
		}
		var StringBuilder sb = new StringBuilder();
		var StringTokenizer tok = new StringTokenizer(str, "\r\n");
		while (tok.hasMoreTokens) {
			var String line = tok.nextToken();
			line = line.replace("/**", "");
			line = line.replace(" * ", "");
			line = line.replace("*/", "");
			sb.append(line);
			sb.append(" ");
		}
		var String result = sb.toString().replace("  ", " ").trim();
		return result;
	}


	def static String toXmlName(String name) {
		name.replaceAll('(.)(\\p{Upper})', '$1-$2').toLowerCase;
	}

	def static String toSqlUpper(String name) {
		name.replaceAll('(.)(\\p{Upper})', '$1_$2').toUpperCase;
	}

	def static String toSqlLower(String name) {
		name.replaceAll('(.)(\\p{Upper})', '$1_$2').toLowerCase;
	}

	def static String toSqlInitials(String name) {
		if (name === null || name.length == 0) {
			return name
		}
		val sb = new StringBuilder();
		val lname = toSqlLower(name)
		for (i : 0 .. lname.length - 1) {
			val ch = lname.charAt(i)
			if (i == 0) {
				sb.append(ch)
			} else if ((ch.compareTo('_') == 0) && (i < lname.length - 1)) {
				sb.append('_')
				sb.append(lname.charAt(i + 1))
			}
		}
		return sb.toString();
	}

	/**
	 * Returns the package without the class name.
	 * 
	 * @param packageAndClassName Package and name (like 'a.b.c.MyClass')
	 * 
	 * @return Package without class (like 'MyClass')
	 */
	def static String onlyPackage(String packageAndClassName) {
		val p = packageAndClassName.lastIndexOf('.')
		if (p == -1) {
			return packageAndClassName
		}
		return packageAndClassName.substring(0, p)
	} 


}
