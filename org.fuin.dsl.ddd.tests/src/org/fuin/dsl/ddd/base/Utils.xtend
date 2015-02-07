package org.fuin.dsl.ddd.base

import java.io.InputStream
import java.io.InputStreamReader
import java.io.LineNumberReader
import java.net.URL
import java.util.ArrayList
import java.util.List

/**
 * Provides utility methods for tests.
 */
class Utils {

	/**
	 * Returns the list of lines converted into a string.
	 * 
	 * @param lines List of strings.
	 * 
	 * @return String separated with line feeds.
	 */
	def static String asString(List<String> lines) {
		val StringBuffer sb = new StringBuffer()
		for (line : lines) {
			sb.append(line)
			sb.append("\n")
		}
		return sb.toString()
	}

	/**
	 * Reads the URL and returns the content as list of lines.
	 * 
	 * @param url URL.
	 * 
	 * @return Content from the URL converted into a string list. 
	 */
	def static List<String> asLines(URL url) {
		val InputStream in = url.openStream()
		try {
			return asLines(in)
		} finally {
			in.close()
		}
	}

	/**
	 * Reads the stream and returns the content as list of lines.
	 * 
	 * @param in Stream to read.
	 * 
	 * @return Content from the stream converted into a string list. 
	 */
	def static List<String> asLines(InputStream in) {
		val List<String> list = new ArrayList<String>()
		val LineNumberReader lnr = new LineNumberReader(new InputStreamReader(in, "utf-8"))
		var String line
		while ((line = lnr.readLine) != null) {
			list.add(line);
		}
		return list
	}

}
