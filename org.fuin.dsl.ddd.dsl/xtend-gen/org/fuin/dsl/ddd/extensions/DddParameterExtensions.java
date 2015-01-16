package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Parameter;

/**
 * Provides extension methods for Parameters.
 */
@SuppressWarnings("all")
public class DddParameterExtensions {
  /**
   * Returns a list of names from all parameters.
   * 
   * @param parameters Parameter list.
   * 
   * @return List with names in the same order as the parameters.
   */
  public static List<String> asNames(final List<Parameter> parameters) {
    boolean _equals = Objects.equal(parameters, null);
    if (_equals) {
      return null;
    }
    final List<String> result = new ArrayList<String>();
    boolean _notEquals = (!Objects.equal(parameters, null));
    if (_notEquals) {
      for (final Parameter parameter : parameters) {
        String _name = parameter.getName();
        result.add(_name);
      }
    }
    return result;
  }
}
