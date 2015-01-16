package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.BusinessRules;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintInstance;

@SuppressWarnings("all")
public class DddBusinessRulesExtensions {
  /**
   * Returns a non-null constraint list.
   * 
   * @param businessRules Container with constraints.
   * 
   * @return List of constraints that is never <code<null</code>.
   */
  public static List<ConstraintInstance> nullSafe(final BusinessRules businessRules) {
    boolean _or = false;
    boolean _equals = Objects.equal(businessRules, null);
    if (_equals) {
      _or = true;
    } else {
      EList<ConstraintInstance> _constraintInstances = businessRules.getConstraintInstances();
      boolean _equals_1 = Objects.equal(_constraintInstances, null);
      _or = _equals_1;
    }
    if (_or) {
      return new ArrayList<ConstraintInstance>();
    }
    return businessRules.getConstraintInstances();
  }
}
