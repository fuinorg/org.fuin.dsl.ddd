package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
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
}
