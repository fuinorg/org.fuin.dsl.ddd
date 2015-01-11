package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EObject;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Context;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Event;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Namespace;
import org.fuin.dsl.ddd.extensions.DddEObjectExtensions;
import org.fuin.dsl.ddd.extensions.DddExtensionUtils;

/**
 * Provides extension methods for Event.
 */
@SuppressWarnings("all")
public class DddEventExtensions {
  /**
   * Returns the unique name of the event.
   * 
   * @param el Event to return a unique name for.
   * 
   * @return Unique name in the context/namespace.
   */
  public static String uniqueName(final Event event) {
    boolean _equals = Objects.equal(event, null);
    if (_equals) {
      throw new IllegalArgumentException("argument \'event\' cannot be null");
    }
    Context _context = DddEObjectExtensions.getContext(event);
    boolean _equals_1 = Objects.equal(_context, null);
    if (_equals_1) {
      throw new IllegalArgumentException("argument \'event.context\' cannot be null");
    }
    Namespace _namespace = DddEObjectExtensions.getNamespace(event);
    boolean _equals_2 = Objects.equal(_namespace, null);
    if (_equals_2) {
      throw new IllegalArgumentException("argument \'event.namespace\' cannot be null");
    }
    Context _context_1 = DddEObjectExtensions.getContext(event);
    String _name = _context_1.getName();
    Namespace _namespace_1 = DddEObjectExtensions.getNamespace(event);
    String _name_1 = _namespace_1.getName();
    String _name_2 = event.getName();
    return DddExtensionUtils.separated(".", _name, _name_1, _name_2);
  }
  
  /**
   * Returns the aggregate or entity for an event if it is a domain event.
   * 
   * @param event Event to return the parent entity for.
   * 
   * @return Aggregate or Entity or null if the event is not inside one.
   */
  public static AbstractEntity getEntity(final Event event) {
    return DddEventExtensions.getAbstractEntity(event);
  }
  
  private static AbstractEntity getAbstractEntity(final EObject obj) {
    boolean _equals = Objects.equal(obj, null);
    if (_equals) {
      return null;
    }
    if ((obj instanceof AbstractEntity)) {
      return ((AbstractEntity)obj);
    }
    EObject _eContainer = obj.eContainer();
    return DddEventExtensions.getAbstractEntity(_eContainer);
  }
}
