package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.BusinessRules;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintInstance;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Method;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Parameter;
import org.fuin.dsl.ddd.extensions.DddBusinessRulesExtensions;

/**
 * Provides extension methods for Method.
 */
@SuppressWarnings("all")
public class DddMethodExtensions {
  public static List<Constraint> allBusinessRules(final Method method) {
    final List<Constraint> list = new ArrayList<Constraint>();
    boolean _and = false;
    Method _refMethod = method.getRefMethod();
    boolean _notEquals = (!Objects.equal(_refMethod, null));
    if (!_notEquals) {
      _and = false;
    } else {
      Method _refMethod_1 = method.getRefMethod();
      boolean _notEquals_1 = (!Objects.equal(method, _refMethod_1));
      _and = _notEquals_1;
    }
    if (_and) {
      Method _refMethod_2 = method.getRefMethod();
      List<Constraint> _allBusinessRules = DddMethodExtensions.allBusinessRules(_refMethod_2);
      list.addAll(_allBusinessRules);
    }
    BusinessRules _businessRules = method.getBusinessRules();
    List<ConstraintInstance> _nullSafe = DddBusinessRulesExtensions.nullSafe(_businessRules);
    for (final ConstraintInstance ci : _nullSafe) {
      Constraint _constraint = ci.getConstraint();
      list.add(_constraint);
    }
    return list;
  }
  
  public static List<org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception> allExceptions(final Method method) {
    List<org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception> list = new ArrayList<org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception>();
    boolean _and = false;
    Method _refMethod = method.getRefMethod();
    boolean _notEquals = (!Objects.equal(_refMethod, null));
    if (!_notEquals) {
      _and = false;
    } else {
      Method _refMethod_1 = method.getRefMethod();
      boolean _notEquals_1 = (!Objects.equal(method, _refMethod_1));
      _and = _notEquals_1;
    }
    if (_and) {
      Method _refMethod_2 = method.getRefMethod();
      List<org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception> _allExceptions = DddMethodExtensions.allExceptions(_refMethod_2);
      list.addAll(_allExceptions);
    }
    BusinessRules _businessRules = method.getBusinessRules();
    List<ConstraintInstance> _nullSafe = DddBusinessRulesExtensions.nullSafe(_businessRules);
    for (final ConstraintInstance ci : _nullSafe) {
      Constraint _constraint = ci.getConstraint();
      org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception _exception = _constraint.getException();
      list.add(_exception);
    }
    return list;
  }
  
  public static List<Parameter> allParameters(final Method method) {
    List<Parameter> list = new ArrayList<Parameter>();
    EList<Parameter> _parameters = method.getParameters();
    list.addAll(_parameters);
    boolean _and = false;
    Method _refMethod = method.getRefMethod();
    boolean _notEquals = (!Objects.equal(_refMethod, null));
    if (!_notEquals) {
      _and = false;
    } else {
      Method _refMethod_1 = method.getRefMethod();
      boolean _notEquals_1 = (!Objects.equal(method, _refMethod_1));
      _and = _notEquals_1;
    }
    if (_and) {
      Method _refMethod_2 = method.getRefMethod();
      List<Parameter> _allParameters = DddMethodExtensions.allParameters(_refMethod_2);
      list.addAll(_allParameters);
    }
    return list;
  }
}
