package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Attribute;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintTarget;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.InternalType;

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
    boolean _equals = Objects.equal(target, null);
    if (_equals) {
      return null;
    }
    if ((target instanceof InternalType)) {
      return ((InternalType)target).getName();
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
   * Returns the attributes of a constraint target.
   * 
   * @param target Target to return a list of attributes for.
   * 
   * @return Attributes - Never null.
   */
  public static List<Attribute> getAttributes(final ConstraintTarget target) {
    boolean _equals = Objects.equal(target, null);
    if (_equals) {
      return new ArrayList<Attribute>();
    }
    if ((target instanceof InternalType)) {
      return ((InternalType)target).getAttributes();
    } else {
      if ((target instanceof ExternalType)) {
        return new ArrayList<Attribute>();
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
