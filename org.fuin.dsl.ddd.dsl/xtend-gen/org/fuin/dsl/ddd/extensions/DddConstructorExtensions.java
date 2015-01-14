package org.fuin.dsl.ddd.extensions;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintInstance;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constructor;
import org.fuin.dsl.ddd.extensions.DddCollectionExtensions;

/**
 * Provides extension methods for Constructor.
 */
@SuppressWarnings("all")
public class DddConstructorExtensions {
  public static List<org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception> allExceptions(final Constructor constructor) {
    List<org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception> list = new ArrayList<org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception>();
    EList<ConstraintInstance> _constraintCalls = constructor.getConstraintCalls();
    List<ConstraintInstance> _nullSafe = DddCollectionExtensions.<ConstraintInstance>nullSafe(_constraintCalls);
    for (final ConstraintInstance cc : _nullSafe) {
      Constraint _constraint = cc.getConstraint();
      org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception _exception = _constraint.getException();
      list.add(_exception);
    }
    return list;
  }
  
  public static List<Constraint> allConstraints(final Constructor constructor) {
    final List<Constraint> list = new ArrayList<Constraint>();
    EList<ConstraintInstance> _constraintCalls = constructor.getConstraintCalls();
    List<ConstraintInstance> _nullSafe = DddCollectionExtensions.<ConstraintInstance>nullSafe(_constraintCalls);
    for (final ConstraintInstance cc : _nullSafe) {
      Constraint _constraint = cc.getConstraint();
      list.add(_constraint);
    }
    return list;
  }
}
