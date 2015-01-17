package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractElement;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Context;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Namespace;
import org.fuin.dsl.ddd.extensions.DddEObjectExtensions;
import org.fuin.dsl.ddd.extensions.DddExtensionUtils;

/**
 * Provides extension methods for AbstractElement.
 */
@SuppressWarnings("all")
public class DddAbstractElementExtensions {
  /**
   * Returns the unique name .
   * 
   * @param el Element to return a unique name for.
   * 
   * @return Unique name in the context/namespace.
   */
  public static String uniqueName(final AbstractElement el) {
    boolean _equals = Objects.equal(el, null);
    if (_equals) {
      throw new IllegalArgumentException("argument \'el\' cannot be null");
    }
    Context _context = DddEObjectExtensions.getContext(el);
    boolean _equals_1 = Objects.equal(_context, null);
    if (_equals_1) {
      String _path = DddEObjectExtensions.getPath(el);
      String _plus = ("argument \'el.context\' cannot be null: " + _path);
      throw new IllegalArgumentException(_plus);
    }
    Namespace _namespace = DddEObjectExtensions.getNamespace(el);
    boolean _equals_2 = Objects.equal(_namespace, null);
    if (_equals_2) {
      String _path_1 = DddEObjectExtensions.getPath(el);
      String _plus_1 = ("argument \'el.namespace\' cannot be null: " + _path_1);
      throw new IllegalArgumentException(_plus_1);
    }
    Context _context_1 = DddEObjectExtensions.getContext(el);
    String _name = _context_1.getName();
    Namespace _namespace_1 = DddEObjectExtensions.getNamespace(el);
    String _name_1 = _namespace_1.getName();
    String _name_2 = el.getName();
    return DddExtensionUtils.separated(".", _name, _name_1, _name_2);
  }
  
  /**
   * Returns the abstract unique name.
   * 
   * @param el Element to return an abstract unique name for.
   * 
   * @return Abstract unique name in the context/namespace.
   */
  public static String uniqueAbstractName(final AbstractElement el) {
    boolean _equals = Objects.equal(el, null);
    if (_equals) {
      throw new IllegalArgumentException("argument \'el\' cannot be null");
    }
    Context _context = DddEObjectExtensions.getContext(el);
    boolean _equals_1 = Objects.equal(_context, null);
    if (_equals_1) {
      throw new IllegalArgumentException("argument \'el.context\' cannot be null");
    }
    Namespace _namespace = DddEObjectExtensions.getNamespace(el);
    boolean _equals_2 = Objects.equal(_namespace, null);
    if (_equals_2) {
      throw new IllegalArgumentException("argument \'el.namespace\' cannot be null");
    }
    Context _context_1 = DddEObjectExtensions.getContext(el);
    String _name = _context_1.getName();
    Namespace _namespace_1 = DddEObjectExtensions.getNamespace(el);
    String _name_1 = _namespace_1.getName();
    String _abstractName = DddAbstractElementExtensions.abstractName(el);
    return DddExtensionUtils.separated(".", _name, _name_1, _abstractName);
  }
  
  /**
   * Returns the unique name .
   * 
   * @param el Element to return a unique name for.
   * 
   * @return Unique name in the context/namespace.
   */
  public static String abstractName(final AbstractElement el) {
    boolean _equals = Objects.equal(el, null);
    if (_equals) {
      throw new IllegalArgumentException("argument \'el\' cannot be null");
    }
    String _name = el.getName();
    return ("Abstract" + _name);
  }
  
  /**
   * Compares two abstract elements by their unique name.
   * 
   * @param a1 Element 1.
   * @param a2 Element 2.
   * 
   * @return TRUE if both elements have the same unique name (context/namespace/name).
   */
  public static boolean same(final AbstractElement a1, final AbstractElement a2) {
    boolean _equals = Objects.equal(a1, null);
    if (_equals) {
      boolean _equals_1 = Objects.equal(a2, null);
      if (_equals_1) {
        return true;
      }
      return false;
    } else {
      boolean _equals_2 = Objects.equal(a2, null);
      if (_equals_2) {
        return false;
      }
      String _uniqueName = DddAbstractElementExtensions.uniqueName(a1);
      String _uniqueName_1 = DddAbstractElementExtensions.uniqueName(a2);
      return _uniqueName.equals(_uniqueName_1);
    }
  }
}
