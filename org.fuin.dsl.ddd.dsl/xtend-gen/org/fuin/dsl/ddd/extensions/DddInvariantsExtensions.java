package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintInstance;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Invariants;

/**
 * Provides extension methods for Invariants.
 */
@SuppressWarnings("all")
public class DddInvariantsExtensions {
  /**
   * Returns a non-null constraint list.
   * 
   * @param invariants Container with constraints.
   * 
   * @return List of constraints that is never <code<null</code>.
   */
  public static List<ConstraintInstance> nullSafe(final Invariants invariants) {
    boolean _or = false;
    boolean _equals = Objects.equal(invariants, null);
    if (_equals) {
      _or = true;
    } else {
      EList<ConstraintInstance> _constraintInstances = invariants.getConstraintInstances();
      boolean _equals_1 = Objects.equal(_constraintInstances, null);
      _or = _equals_1;
    }
    if (_or) {
      return new ArrayList<ConstraintInstance>();
    }
    return invariants.getConstraintInstances();
  }
}
