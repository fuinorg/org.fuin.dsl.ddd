package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintInstance;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Invariants;
import org.fuin.dsl.ddd.extensions.DddCollectionExtensions;

/**
 * Provides extension methods for Invariants.
 */
@SuppressWarnings("all")
public class DddInvariantsExtensions {
  /**
   * Returns a list of invariants instances in a null safe way.
   * 
   * @param invariants List of invariants or <code>null</code>.
   * 
   * @return List or <code>null</code>.
   */
  public static List<ConstraintInstance> nullSafeInstances(final Invariants invariants) {
    boolean _equals = Objects.equal(invariants, null);
    if (_equals) {
      return Collections.EMPTY_LIST;
    }
    EList<ConstraintInstance> _instances = invariants.getInstances();
    return DddCollectionExtensions.<ConstraintInstance>nullSafe(_instances);
  }
}
