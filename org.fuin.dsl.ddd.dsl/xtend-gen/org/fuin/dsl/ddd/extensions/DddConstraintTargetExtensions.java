package org.fuin.dsl.ddd.extensions;

import java.util.ArrayList;
import java.util.List;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintTarget;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable;

/**
 * Provides extension methods for ConstraintTarget.
 */
@SuppressWarnings("all")
public class DddConstraintTargetExtensions {
  /**
   * Returns the name of a constraint target.
   * 
   * @param target Target to return a name for.
   * 
   * @return Name.
   */
  public static String getName(final ConstraintTarget target) {
    if ((target instanceof AbstractVO)) {
      return ((AbstractVO)target).getName();
    } else {
      if ((target instanceof ExternalType)) {
        return ((ExternalType)target).getName();
      }
    }
    String _name = DddConstraintTargetExtensions.getName(target);
    String _plus = ("Unknown constraint target type: " + _name);
    String _plus_1 = (_plus + " [");
    Class<? extends ConstraintTarget> _class = target.getClass();
    String _name_1 = _class.getName();
    String _plus_2 = (_plus_1 + _name_1);
    String _plus_3 = (_plus_2 + "]");
    throw new IllegalStateException(_plus_3);
  }
  
  /**
   * Returns the variables of a constraint target.
   * 
   * @param target Target to return a list of variables for.
   * 
   * @return Variables - Never null.
   */
  public static List<Variable> getVariables(final ConstraintTarget target) {
    if ((target instanceof AbstractVO)) {
      return ((AbstractVO)target).getVariables();
    } else {
      if ((target instanceof ExternalType)) {
        return new ArrayList<Variable>();
      }
    }
    String _name = DddConstraintTargetExtensions.getName(target);
    String _plus = ("Unknown constraint target type: " + _name);
    String _plus_1 = (_plus + " [");
    Class<? extends ConstraintTarget> _class = target.getClass();
    String _name_1 = _class.getName();
    String _plus_2 = (_plus_1 + _name_1);
    String _plus_3 = (_plus_2 + "]");
    throw new IllegalStateException(_plus_3);
  }
}
