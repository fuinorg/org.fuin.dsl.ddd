package org.fuin.dsl.ddd.base;

import com.google.common.base.Objects;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Provides utility methods for tests.
 */
@SuppressWarnings("all")
public class Utils {
  /**
   * Returns the list of lines converted into a string.
   * 
   * @param lines List of strings.
   * 
   * @return String separated with line feeds.
   */
  public static String asString(final List<String> lines) {
    final StringBuffer sb = new StringBuffer();
    for (final String line : lines) {
      {
        sb.append(line);
        sb.append("\n");
      }
    }
    return sb.toString();
  }
  
  /**
   * Reads the URL and returns the content as list of lines.
   * 
   * @param url URL.
   * 
   * @return Content from the URL converted into a string list.
   */
  public static List<String> asLines(final URL url) {
    try {
      final InputStream in = url.openStream();
      try {
        return Utils.asLines(in);
      } finally {
        in.close();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Reads the stream and returns the content as list of lines.
   * 
   * @param in Stream to read.
   * 
   * @return Content from the stream converted into a string list.
   */
  public static List<String> asLines(final InputStream in) {
    try {
      final List<String> list = new ArrayList<String>();
      InputStreamReader _inputStreamReader = new InputStreamReader(in, "utf-8");
      final LineNumberReader lnr = new LineNumberReader(_inputStreamReader);
      String line = null;
      while ((!Objects.equal((line = lnr.readLine()), null))) {
        list.add(line);
      }
      return list;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
