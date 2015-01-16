package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Literal;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.StringLiteral;

/**
 * Provides extension methods for Literal.
 */
@SuppressWarnings("all")
public class DddLiteralExtensions {
  /**
   * Returns the value of the literal with leading and trailing double quote.
   * 
   * @param literal Literal to enhance with double quotes.
   * 
   * @return Original value or string with double quotes.
   */
  public static String str(final Literal literal) {
    boolean _equals = Objects.equal(literal, null);
    if (_equals) {
      return null;
    }
    if ((literal instanceof StringLiteral)) {
      String _value = ((StringLiteral)literal).getValue();
      String _plus = ("\"" + _value);
      return (_plus + "\"");
    }
    return literal.getValue();
  }
  
  /**
   * Returns a list of names from all variables.
   * 
   * @param vars Variable list.
   * 
   * @return List with names in the same order as the variables.
   */
  public static List<String> litNames(final List<Literal> literals) {
    boolean _equals = Objects.equal(literals, null);
    if (_equals) {
      return null;
    }
    final List<String> result = new ArrayList<String>();
    boolean _notEquals = (!Objects.equal(literals, null));
    if (_notEquals) {
      for (final Literal literal : literals) {
        String _value = literal.getValue();
        result.add(_value);
      }
    }
    return result;
  }
}
