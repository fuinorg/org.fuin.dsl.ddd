package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EObject;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Context;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Namespace;

/**
 * Provides extension methods for EObject.
 */
@SuppressWarnings("all")
public class DddEObjectExtensions {
  /**
   * Returns the namespace for an object.
   * 
   * @param obj Object to return the namespace for.
   * 
   * @return Namespace or null if the object is not inside one.
   */
  public static Namespace getNamespace(final EObject obj) {
    boolean _equals = Objects.equal(obj, null);
    if (_equals) {
      return null;
    }
    if ((obj instanceof Namespace)) {
      return ((Namespace)obj);
    }
    EObject _eContainer = obj.eContainer();
    return DddEObjectExtensions.getNamespace(_eContainer);
  }
  
  /**
   * Returns the context for an object.
   * 
   * @param obj Object to return the context for.
   * 
   * @return Context or null if the object is not inside one.
   */
  public static Context getContext(final EObject obj) {
    boolean _equals = Objects.equal(obj, null);
    if (_equals) {
      return null;
    }
    if ((obj instanceof Context)) {
      return ((Context)obj);
    }
    EObject _eContainer = obj.eContainer();
    return DddEObjectExtensions.getContext(_eContainer);
  }
  
  /**
   * Returns the path in the model to the object.
   * 
   * @param obj Object to return the path for.
   * 
   * @return Path or empty string if the object is not inside one.
   */
  public static String getPath(final EObject obj) {
    boolean _equals = Objects.equal(obj, null);
    if (_equals) {
      return "";
    }
    EObject _eContainer = obj.eContainer();
    String _path = DddEObjectExtensions.getPath(_eContainer);
    String _plus = (_path + "/");
    return (_plus + obj);
  }
  
  /**
   * Returns the parent entity for an object.
   * 
   * @param obj Object to return the parent entity for.
   * 
   * @return Context or null if the object is not inside one.
   */
  public static Aggregate getAggregate(final EObject obj) {
    boolean _equals = Objects.equal(obj, null);
    if (_equals) {
      return null;
    }
    if ((obj instanceof Entity)) {
      return ((Entity)obj).getRoot();
    }
    if ((obj instanceof Aggregate)) {
      return ((Aggregate)obj);
    }
    EObject _eContainer = obj.eContainer();
    return DddEObjectExtensions.getAggregate(_eContainer);
  }
  
  /**
   * Returns the root container for a given object.
   * 
   * @param obj Object to return the top container for.
   * 
   * @return Root container.
   */
  public static EObject getRoot(final EObject obj) {
    EObject _eContainer = obj.eContainer();
    boolean _equals = Objects.equal(_eContainer, null);
    if (_equals) {
      return obj;
    }
    EObject _eContainer_1 = obj.eContainer();
    return DddEObjectExtensions.getRoot(_eContainer_1);
  }
  
  /**
   * Returns the first parent with a given type for an object.
   * 
   * @param obj Object to return the parent for.
   * 
   * @return Parent or null if the object is not inside the requested type.
   */
  public static <T extends Object> T getParent(final Class<T> clasz, final EObject obj) {
    boolean _equals = Objects.equal(obj, null);
    if (_equals) {
      return null;
    }
    Class<? extends EObject> _class = obj.getClass();
    boolean _isAssignableFrom = clasz.isAssignableFrom(_class);
    if (_isAssignableFrom) {
      return ((T) obj);
    }
    EObject _eContainer = obj.eContainer();
    return DddEObjectExtensions.<T>getParent(clasz, _eContainer);
  }
}
