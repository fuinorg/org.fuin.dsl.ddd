package org.fuin.dsl.ddd.extensions;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractElement;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntityId;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Attribute;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constructor;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Event;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Method;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Service;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Type;
import org.fuin.dsl.ddd.extensions.DddCollectionExtensions;

/**
 * Provides extension methods for AbstractEntity.
 */
@SuppressWarnings("all")
public class DddAbstractEntityExtensions {
  /**
   * Returns a list of all constructors and methods.
   * 
   * @param entity Entity to return all constructors and methods for.
   * 
   * @return List of all constructors and methods.
   */
  public static List<AbstractMethod> constructorsAndMethods(final AbstractEntity entity) {
    final List<AbstractMethod> methods = new ArrayList<AbstractMethod>();
    EList<Constructor> _constructors = entity.getConstructors();
    methods.addAll(_constructors);
    EList<Method> _methods = entity.getMethods();
    methods.addAll(_methods);
    return methods;
  }
  
  /**
   * Returns a list of all constructors and methods.
   * 
   * @param entity Entity to return all constructors and methods for.
   * 
   * @return List of all constructors and methods.
   */
  public static List<Service> services(final AbstractEntity entity) {
    final List<Service> services = new ArrayList<Service>();
    final List<AbstractMethod> methods = DddAbstractEntityExtensions.constructorsAndMethods(entity);
    for (final AbstractMethod method : methods) {
      EList<Service> _services = method.getServices();
      List<Service> _nullSafe = DddCollectionExtensions.<Service>nullSafe(_services);
      services.addAll(_nullSafe);
    }
    return services;
  }
  
  /**
   * Returns a list of all direct child entities for an entity.
   * 
   * @param parent Direct parent with references to entities.
   * 
   * @return List of directly referenced child entities.
   */
  public static Set<Entity> childEntities(final AbstractEntity parent) {
    Set<Entity> childs = new HashSet<Entity>();
    EList<Attribute> _attributes = parent.getAttributes();
    for (final Attribute v : _attributes) {
      Type _type = v.getType();
      if ((_type instanceof Entity)) {
        Type _type_1 = v.getType();
        childs.add(((Entity) _type_1));
      }
    }
    return childs;
  }
  
  /**
   * Returns a list of all events for an entity.
   * 
   * @param entity Entity to return the events for.
   * 
   * @return List of events declared in the entity or in one of it's methods.
   */
  public static List<Event> allEvents(final AbstractEntity entity) {
    List<Event> events = new ArrayList<Event>();
    List<AbstractMethod> _constructorsAndMethods = DddAbstractEntityExtensions.constructorsAndMethods(entity);
    for (final AbstractMethod m : _constructorsAndMethods) {
      EList<Event> _events = m.getEvents();
      List<Event> _nullSafe = DddCollectionExtensions.<Event>nullSafe(_events);
      events.addAll(_nullSafe);
    }
    EList<AbstractElement> _elements = entity.getElements();
    List<AbstractElement> _nullSafe_1 = DddCollectionExtensions.<AbstractElement>nullSafe(_elements);
    for (final AbstractElement element : _nullSafe_1) {
      if ((element instanceof Event)) {
        events.add(((Event)element));
      }
    }
    return events;
  }
  
  /**
   * Returns the abstract entity identifier that may be defined inside the abstractEntity.
   * 
   * @param abstractEntity Abstract entity to return the identifier for.
   * 
   * @return Identifier or NULL if no such type is defined inside the abstract entity.
   */
  public static AbstractEntityId getAbstractEntityId(final AbstractEntity abstractEntity) {
    EList<AbstractElement> _elements = abstractEntity.getElements();
    List<AbstractElement> _nullSafe = DddCollectionExtensions.<AbstractElement>nullSafe(_elements);
    final Iterable<AbstractEntityId> types = Iterables.<AbstractEntityId>filter(_nullSafe, AbstractEntityId.class);
    int _length = ((Object[])Conversions.unwrapArray(types, Object.class)).length;
    boolean _equals = (_length == 0);
    if (_equals) {
      return null;
    }
    return ((AbstractEntityId[])Conversions.unwrapArray(types, AbstractEntityId.class))[0];
  }
}
