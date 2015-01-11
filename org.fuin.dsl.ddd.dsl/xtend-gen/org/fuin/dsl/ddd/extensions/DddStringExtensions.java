package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import java.util.StringTokenizer;
import org.eclipse.xtext.xbase.lib.IntegerRange;

/**
 * Provides extension methods for String.
 */
@SuppressWarnings("all")
public class DddStringExtensions {
  /**
   * Returns the pure doc message without slashes and stars in one line.
   * 
   * @param str JavaDoc comment.
   * 
   * @return Plain single line text.
   */
  public static String text(final String str) {
    boolean _equals = Objects.equal(str, null);
    if (_equals) {
      return "";
    }
    StringBuilder sb = new StringBuilder();
    StringTokenizer tok = new StringTokenizer(str, "\r\n");
    while (tok.hasMoreTokens()) {
      {
        String line = tok.nextToken();
        String _replace = line.replace("/**", "");
        line = _replace;
        String _replace_1 = line.replace(" * ", "");
        line = _replace_1;
        String _replace_2 = line.replace("*/", "");
        line = _replace_2;
        sb.append(line);
        sb.append(" ");
      }
    }
    String _string = sb.toString();
    String _replace = _string.replace("  ", " ");
    String result = _replace.trim();
    return result;
  }
  
  public static String toXmlName(final String name) {
    String _replaceAll = name.replaceAll("(.)(\\p{Upper})", "$1-$2");
    return _replaceAll.toLowerCase();
  }
  
  public static String toSqlUpper(final String name) {
    String _replaceAll = name.replaceAll("(.)(\\p{Upper})", "$1_$2");
    return _replaceAll.toUpperCase();
  }
  
  public static String toSqlLower(final String name) {
    String _replaceAll = name.replaceAll("(.)(\\p{Upper})", "$1_$2");
    return _replaceAll.toLowerCase();
  }
  
  public static String toSqlInitials(final String name) {
    boolean _or = false;
    boolean _equals = Objects.equal(name, null);
    if (_equals) {
      _or = true;
    } else {
      int _length = name.length();
      boolean _equals_1 = (_length == 0);
      _or = _equals_1;
    }
    if (_or) {
      return name;
    }
    final StringBuilder sb = new StringBuilder();
    final String lname = DddStringExtensions.toSqlLower(name);
    int _length_1 = lname.length();
    int _minus = (_length_1 - 1);
    IntegerRange _upTo = new IntegerRange(0, _minus);
    for (final Integer i : _upTo) {
      {
        final char ch = lname.charAt((i).intValue());
        if (((i).intValue() == 0)) {
          sb.append(ch);
        } else {
          boolean _and = false;
          int _compareTo = Character.valueOf(ch).compareTo(Character.valueOf('_'));
          boolean _equals_2 = (_compareTo == 0);
          if (!_equals_2) {
            _and = false;
          } else {
            int _length_2 = lname.length();
            int _minus_1 = (_length_2 - 1);
            boolean _lessThan = ((i).intValue() < _minus_1);
            _and = _lessThan;
          }
          if (_and) {
            sb.append("_");
            char _charAt = lname.charAt(((i).intValue() + 1));
            sb.append(_charAt);
          }
        }
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
  public static String onlyPackage(final String packageAndClassName) {
    final int p = packageAndClassName.lastIndexOf(".");
    if ((p == (-1))) {
      return packageAndClassName;
    }
    return packageAndClassName.substring(0, p);
  }
}
