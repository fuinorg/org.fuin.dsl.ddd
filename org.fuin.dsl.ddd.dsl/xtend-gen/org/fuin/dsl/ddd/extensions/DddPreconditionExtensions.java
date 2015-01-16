package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintInstance;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Preconditions;

/**
 * Provides extension methods for Preconditions.
 */
@SuppressWarnings("all")
public class DddPreconditionExtensions {
  /**
   * Returns a non-null constraint list.
   * 
   * @param preconditions Container with constraints.
   * 
   * @return List of constraints that is never <code<null</code>.
   */
  public static List<ConstraintInstance> nullSafe(final Preconditions preconditions) {
    boolean _or = false;
    boolean _equals = Objects.equal(preconditions, null);
    if (_equals) {
      _or = true;
    } else {
      EList<ConstraintInstance> _constraintInstances = preconditions.getConstraintInstances();
      boolean _equals_1 = Objects.equal(_constraintInstances, null);
      _or = _equals_1;
    }
    if (_or) {
      return new ArrayList<ConstraintInstance>();
    }
    return preconditions.getConstraintInstances();
  }
}
