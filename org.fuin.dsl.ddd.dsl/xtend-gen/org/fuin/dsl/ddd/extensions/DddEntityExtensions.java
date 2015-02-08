package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractElement;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EntityId;
import org.fuin.dsl.ddd.extensions.DddCollectionExtensions;

/**
 * Provides extension methods for Entity.
 */
@SuppressWarnings("all")
public class DddEntityExtensions {
  /**
   * Returns the entity identifier type regardless if it's
   * defined inside the entity or somewhere outside.
   * 
   * @param entity Entity to return the identifier type for.
   * 
   * @return Entity identifier type.
   */
  public static EntityId getIdTypeNullsafe(final Entity entity) {
    EntityId _idType = entity.getIdType();
    boolean _equals = Objects.equal(_idType, null);
    if (_equals) {
      return DddEntityExtensions.getEntityId(entity);
    }
    return entity.getIdType();
  }
  
  /**
   * Returns the entity identifier that may be defined inside the entity.
   * 
   * @param entity Entity to return the identifier for.
   * 
   * @return Identifier or NULL if no such type is defined inside the entity.
   */
  public static EntityId getEntityId(final Entity entity) {
    EList<AbstractElement> _elements = entity.getElements();
    List<AbstractElement> _nullSafe = DddCollectionExtensions.<AbstractElement>nullSafe(_elements);
    final Iterable<EntityId> types = Iterables.<EntityId>filter(_nullSafe, EntityId.class);
    int _length = ((Object[])Conversions.unwrapArray(types, Object.class)).length;
    boolean _equals = (_length == 0);
    if (_equals) {
      return null;
    }
    return ((EntityId[])Conversions.unwrapArray(types, EntityId.class))[0];
  }
  
  /**
   * Returns the aggregate the entity belongs to. It does not matter
   * if the aggregate is referenced by using the 'root' expression
   * or the entity is declared inside an aggregate.
   * 
   * @param entity The entity to return the aggregate for.
   * 
   * @return Aggregate of the entity.
   */
  public static Aggregate getRootNullsafe(final Entity entity) {
    Aggregate _root = entity.getRoot();
    boolean _equals = Objects.equal(_root, null);
    if (_equals) {
      entity.eContainer();
    }
    return entity.getRoot();
  }
}
