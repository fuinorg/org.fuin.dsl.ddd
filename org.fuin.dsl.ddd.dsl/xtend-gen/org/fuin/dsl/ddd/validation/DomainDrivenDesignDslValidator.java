package org.fuin.dsl.ddd.validation;

import com.google.common.base.Objects;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AggregateId;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintTarget;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage.Literals;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Event;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Method;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Type;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ValueObject;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable;
import org.fuin.dsl.ddd.validation.AbstractDomainDrivenDesignDslValidator;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class DomainDrivenDesignDslValidator extends AbstractDomainDrivenDesignDslValidator {
  public final static String INVALID_VAR_NAME = "invalidVarName";
  
  public final static String EVENT_NOT_ALLOWED_FOR_VO = "eventNotAllowedForVO";
  
  public final static String CONSTRAINT_MSG_UNKNOWN_VAR = "constraintMsgUnknownVar";
  
  public final static String REF_TO_AGGREGATE_NOT_ALLOWED = "refToAggregateNotAllowed";
  
  @Check
  public void checkNameStartsWithCapital(final Variable variable) {
    String _name = variable.getName();
    char _charAt = _name.charAt(0);
    boolean _isLowerCase = Character.isLowerCase(_charAt);
    boolean _not = (!_isLowerCase);
    if (_not) {
      this.warning("Variable names should start with a lower case", variable, 
        Literals.VARIABLE__NAME, DomainDrivenDesignDslValidator.INVALID_VAR_NAME);
    }
  }
  
  @Check
  public void checkNoEventsInValueObjects(final AbstractVO vo) {
    EList<Method> _methods = vo.getMethods();
    for (final Method method : _methods) {
      EList<Event> _events = method.getEvents();
      boolean _notEquals = (!Objects.equal(_events, null));
      if (_notEquals) {
        EList<Event> _events_1 = method.getEvents();
        for (final Event event : _events_1) {
          this.error("Events are only allowed within entity methods", event, 
            Literals.EVENT__NAME, DomainDrivenDesignDslValidator.EVENT_NOT_ALLOWED_FOR_VO);
        }
      }
    }
  }
  
  @Check
  public void checkVariablesInConstraintMessage(final Constraint constraint) {
    Set<String> vars = this.allVariables(constraint);
    String str = constraint.getMessage();
    int end = (-1);
    int from = 0;
    int start = (-1);
    int _indexOf = str.indexOf("${", from);
    int _start = start = _indexOf;
    int _minus = (-1);
    boolean _greaterThan = (_start > _minus);
    boolean _while = _greaterThan;
    while (_while) {
      {
        int _plus = (start + 1);
        int _indexOf_1 = str.indexOf("}", _plus);
        end = _indexOf_1;
        int _minus_1 = (-1);
        boolean _equals = (end == _minus_1);
        if (_equals) {
          int _length = str.length();
          from = _length;
        } else {
          int _plus_1 = (start + 2);
          String name = str.substring(_plus_1, end);
          boolean _contains = vars.contains(name);
          boolean _not = (!_contains);
          if (_not) {
            String _plus_2 = ("A variable with the name \'" + name);
            String _plus_3 = (_plus_2 + "\' is unknown");
            this.error(_plus_3, constraint, 
              Literals.CONSTRAINT__MESSAGE, 
              DomainDrivenDesignDslValidator.CONSTRAINT_MSG_UNKNOWN_VAR);
            return;
          }
          int _plus_4 = (end + 1);
          from = _plus_4;
        }
      }
      int _indexOf_1 = str.indexOf("${", from);
      int _start_1 = start = _indexOf_1;
      int _minus_1 = (-1);
      boolean _greaterThan_1 = (_start_1 > _minus_1);
      _while = _greaterThan_1;
    }
  }
  
  public Set<String> allVariables(final Constraint constraint) {
    HashSet<String> _hashSet = new HashSet<String>();
    Set<String> vars = _hashSet;
    EList<Variable> _variables = constraint.getVariables();
    boolean _notEquals = (!Objects.equal(_variables, null));
    if (_notEquals) {
      EList<Variable> _variables_1 = constraint.getVariables();
      for (final Variable v : _variables_1) {
        String _name = v.getName();
        vars.add(_name);
      }
    }
    ConstraintTarget target = constraint.getTarget();
    if ((target instanceof ExternalType)) {
      vars.add("vv");
    } else {
      if ((target instanceof ValueObject)) {
        ValueObject vo = ((ValueObject) target);
        EList<Variable> _variables_2 = vo.getVariables();
        boolean _notEquals_1 = (!Objects.equal(_variables_2, null));
        if (_notEquals_1) {
          EList<Variable> _variables_3 = vo.getVariables();
          for (final Variable v_1 : _variables_3) {
            String _name_1 = v_1.getName();
            String _plus = ("vv_" + _name_1);
            vars.add(_plus);
          }
        }
      }
    }
    return vars;
  }
  
  @Check
  public void checkNoRefToAggregate(final Variable variable) {
    Type _type = variable.getType();
    if ((_type instanceof Aggregate)) {
      Type _type_1 = variable.getType();
      Aggregate aggregate = ((Aggregate) _type_1);
      AggregateId _idType = aggregate.getIdType();
      String _name = _idType.getName();
      this.error("A direct reference to an aggregates is not allowed", variable, 
        Literals.VARIABLE__TYPE, 
        DomainDrivenDesignDslValidator.REF_TO_AGGREGATE_NOT_ALLOWED, _name);
    }
  }
}
