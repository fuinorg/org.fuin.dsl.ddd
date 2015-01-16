package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Provides extension methods for collections.
 */
@SuppressWarnings("all")
public class DddCollectionExtensions {
  /**
   * Returns a null safe version of the list.
   * 
   * @return Original or empty list.
   */
  public static <T extends Object> List<T> nullSafe(final List<T> list) {
    boolean _equals = Objects.equal(list, null);
    if (_equals) {
      return Collections.<T>emptyList();
    }
    return list;
  }
  
  /**
   * Returns the first element of the list.
   * 
   * @param list List to return the first element.
   * 
   * @return First element or null if the list is null or empty.
   */
  public static <T extends Object> T first(final List<T> list) {
    boolean _or = false;
    boolean _equals = Objects.equal(list, null);
    if (_equals) {
      _or = true;
    } else {
      int _size = list.size();
      boolean _equals_1 = (_size == 0);
      _or = _equals_1;
    }
    if (_or) {
      return null;
    }
    return list.get(0);
  }
  
  /**
   * Returns the list without the first element.
   * 
   * @param list List to return the rest for.
   * 
   * @return Elements without the first one.
   */
  public static <T extends Object> List<T> rest(final List<T> list) {
    boolean _equals = Objects.equal(list, null);
    if (_equals) {
      return null;
    }
    List<T> rest = new ArrayList<T>();
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(list, null));
    if (!_notEquals) {
      _and = false;
    } else {
      int _size = list.size();
      boolean _greaterThan = (_size > 0);
      _and = _greaterThan;
    }
    if (_and) {
      int count = 0;
      for (final T v : list) {
        {
          if ((count > 0)) {
            rest.add(v);
          }
          count = (count + 1);
        }
      }
    }
    return rest;
  }
  
  /**
   * Returns a null safe version of the map.
   * 
   * @return Original or empty map.
   */
  public static <K extends Object, V extends Object> Map<K, V> nullSafe(final Map<K, V> map) {
    boolean _equals = Objects.equal(map, null);
    if (_equals) {
      return Collections.<K, V>emptyMap();
    }
    return map;
  }
}
