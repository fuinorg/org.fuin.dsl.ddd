package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintCall;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Invariants;
import org.fuin.dsl.ddd.extensions.DddCollectionExtensions;

/**
 * Provides extension methods for Invariants.
 */
@SuppressWarnings("all")
public class DddInvariantsExtensions {
  /**
   * Returns a list of invariant calls in a null safe way.
   * 
   * @param invariants Map with registry or <code>null</code>.
   * 
   * @return Registry or <code>null</code>.
   */
  public static List<ConstraintCall> nullSafeCalls(final Invariants invariants) {
    boolean _equals = Objects.equal(invariants, null);
    if (_equals) {
      return Collections.EMPTY_LIST;
    }
    EList<ConstraintCall> _calls = invariants.getCalls();
    return DddCollectionExtensions.<ConstraintCall>nullSafe(_calls);
  }
}
