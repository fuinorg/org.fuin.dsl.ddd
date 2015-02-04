package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EObject;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EntityId;

/**
 * Provides extension methods for EntityId.
 */
@SuppressWarnings("all")
public class DddEntityIdExtensions {
  /**
   * Returns the entity type regardless if it's defined as parent
   * of the entity indentifier or somewhere else.
   * 
   * @param entityId Entity ID to return the entity type for.
   * 
   * @return Entity type.
   */
  public static Entity getEntityNullsafe(final EntityId entityId) {
    Entity _entity = entityId.getEntity();
    boolean _equals = Objects.equal(_entity, null);
    if (_equals) {
      EObject _eContainer = entityId.eContainer();
      return ((Entity) _eContainer);
    }
    return entityId.getEntity();
  }
}
