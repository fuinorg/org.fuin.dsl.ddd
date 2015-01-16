package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import java.util.Map;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod;

/**
 * Provides extension methods for AbstractMethod.
 */
@SuppressWarnings("all")
public class DddAbstractMethodExtensions {
  /**
   * Returns an attribute from the user content map.
   * 
   * @param method Method that contains the user content.
   * @param name Key of the attribute.
   * 
   * @return Value or <code>null</code>.
   */
  public static <T extends Object> T getUserAttr(final AbstractMethod method, final String name) {
    Map _userContent = method.getUserContent();
    boolean _equals = Objects.equal(_userContent, null);
    if (_equals) {
      return null;
    }
    Map _userContent_1 = method.getUserContent();
    Object _get = _userContent_1.get(name);
    return ((T) _get);
  }
}
