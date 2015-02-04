package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntityId;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate;
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
    EList<Event> _events_1 = entity.getEvents();
    List<Event> _nullSafe_1 = DddCollectionExtensions.<Event>nullSafe(_events_1);
    for (final Event v : _nullSafe_1) {
      events.add(v);
    }
    return events;
  }
  
  /**
   * Returns the entity identifier type regardless if it's
   * defined inside the aggregate or somewhere outside.
   * 
   * @param entity Entity to return the identifier type for.
   * 
   * @return Entity identifier type.
   */
  public static AbstractEntityId getIdTypeNullsafe(final AbstractEntity entity) {
    AbstractEntityId _idType = entity.getIdType();
    boolean _equals = Objects.equal(_idType, null);
    if (_equals) {
      if ((entity instanceof Aggregate)) {
        return ((Aggregate)entity).getAggregateId();
      }
      if ((entity instanceof Entity)) {
        return ((Entity)entity).getEntityId();
      }
      throw new IllegalArgumentException(("Unknown entity type: " + entity));
    }
    return entity.getIdType();
  }
}
