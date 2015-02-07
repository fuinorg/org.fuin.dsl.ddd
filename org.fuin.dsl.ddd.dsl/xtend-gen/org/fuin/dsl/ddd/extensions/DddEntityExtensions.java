package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EntityId;

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
      return entity.getEntityId();
    }
    return entity.getIdType();
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
