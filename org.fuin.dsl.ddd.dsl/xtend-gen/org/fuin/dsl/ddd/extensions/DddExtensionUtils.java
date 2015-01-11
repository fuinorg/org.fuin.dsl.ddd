package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * Provides utility methods for templates.
 */
@SuppressWarnings("all")
public class DddExtensionUtils {
  /**
   * Returns a string containing all tokens separated by a separator string.
   * 
   * @param separator Separator to use.
   * @param tokens Array of tokens, empty array or null.
   * 
   * @return Tokens in the same order as in the array separated by the given separator.
   *         An empty array or null will return an empty string.
   */
  public static String separated(final String separator, final String... tokens) {
    boolean _equals = Objects.equal(tokens, null);
    if (_equals) {
      return "";
    }
    final StringBuilder sb = new StringBuilder();
    int count = 0;
    for (final String token : tokens) {
      {
        if ((count > 0)) {
          sb.append(separator);
        }
        sb.append(token);
        count = (count + 1);
      }
    }
    return sb.toString();
  }
  
  /**
   * Combines a element and a list into a new list.
   * 
   * @param t First element of the new list.
   * @param list Rest elements of the new list.
   */
  public static <T extends Object> List<T> union(final T t, final List<T> list) {
    final ArrayList<T> result = new ArrayList<T>();
    result.add(t);
    result.addAll(list);
    return result;
  }
}
