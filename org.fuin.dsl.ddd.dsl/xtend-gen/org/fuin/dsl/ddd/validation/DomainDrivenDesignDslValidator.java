package org.fuin.dsl.ddd.validation;

import com.google.common.base.Objects;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AggregateId;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintTarget;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EntityId;
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
  
  public final static String EXCEPTION_MSG_UNKNOWN_VAR = "exceptionMsgUnknownVar";
  
  public final static String REF_TO_AGGREGATE_NOT_ALLOWED = "refToAggregateNotAllowed";
  
  public final static String VO_CANNOT_REF_ENTITY = "voCannotRefEntity";
  
  @Check
  public void checkNameStartsWithCapital(final Variable variable) {
    String _name = variable.getName();
    char _charAt = _name.charAt(0);
    boolean _isLowerCase = Character.isLowerCase(_charAt);
    boolean _not = (!_isLowerCase);
    if (_not) {
      this.warning("Variable names should start with a lower case", variable, 
        DomainDrivenDesignDslPackage.Literals.VARIABLE__NAME, DomainDrivenDesignDslValidator.INVALID_VAR_NAME);
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
            DomainDrivenDesignDslPackage.Literals.EVENT__NAME, DomainDrivenDesignDslValidator.EVENT_NOT_ALLOWED_FOR_VO);
        }
      }
    }
  }
  
  @Check
  public void checkVariablesInConstraintMessage(final Constraint constraint) {
    Set<String> _allVariables = this.allVariables(constraint);
    String _message = constraint.getMessage();
    final String name = this.findUnknownVar(_allVariables, _message);
    boolean _notEquals = (!Objects.equal(name, null));
    if (_notEquals) {
      this.error(
        (("A variable with the name \'" + name) + "\' is unknown"), constraint, 
        DomainDrivenDesignDslPackage.Literals.CONSTRAINT__MESSAGE, 
        DomainDrivenDesignDslValidator.CONSTRAINT_MSG_UNKNOWN_VAR);
    }
  }
  
  @Check
  public void checkVariablesInExceptionMessage(final org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception ex) {
    Set<String> _allVariables = this.allVariables(ex);
    String _message = ex.getMessage();
    final String name = this.findUnknownVar(_allVariables, _message);
    boolean _notEquals = (!Objects.equal(name, null));
    if (_notEquals) {
      this.error(
        (("A variable \'" + name) + "\' is not defined in the exception"), ex, 
        DomainDrivenDesignDslPackage.Literals.EXCEPTION__MESSAGE, 
        DomainDrivenDesignDslValidator.EXCEPTION_MSG_UNKNOWN_VAR);
    }
  }
  
  @Check
  public void checkNoRefToAggregate(final Variable variable) {
    Type _type = variable.getType();
    if ((_type instanceof Aggregate)) {
      Type _type_1 = variable.getType();
      Aggregate aggregate = ((Aggregate) _type_1);
      AggregateId _idType = aggregate.getIdType();
      String _name = _idType.getName();
      this.error(
        "A direct reference to an aggregates is not allowed", variable, 
        DomainDrivenDesignDslPackage.Literals.VARIABLE__TYPE, 
        DomainDrivenDesignDslValidator.REF_TO_AGGREGATE_NOT_ALLOWED, _name);
    }
  }
  
  @Check
  public void checkNoRefToEntity(final ValueObject vo) {
    EList<Variable> _variables = vo.getVariables();
    for (final Variable v : _variables) {
      Type _type = v.getType();
      if ((_type instanceof AbstractEntity)) {
        String idTypeName = null;
        Type _type_1 = v.getType();
        if ((_type_1 instanceof Entity)) {
          Type _type_2 = v.getType();
          EntityId _idType = ((Entity) _type_2).getIdType();
          String _name = _idType.getName();
          idTypeName = _name;
        } else {
          Type _type_3 = v.getType();
          AggregateId _idType_1 = ((Aggregate) _type_3).getIdType();
          String _name_1 = _idType_1.getName();
          idTypeName = _name_1;
        }
        this.error(
          "A reference from a value object to an entity is not allowed", v, 
          DomainDrivenDesignDslPackage.Literals.VARIABLE__TYPE, 
          DomainDrivenDesignDslValidator.VO_CANNOT_REF_ENTITY, idTypeName);
      }
    }
  }
  
  private String findUnknownVar(final Set<String> vars, final String msg) {
    int end = (-1);
    int from = 0;
    int start = (-1);
    int _indexOf = msg.indexOf("${", from);
    int _start = start = _indexOf;
    boolean _greaterThan = (_start > (-1));
    boolean _while = _greaterThan;
    while (_while) {
      {
        int _indexOf_1 = msg.indexOf("}", (start + 1));
        end = _indexOf_1;
        if ((end == (-1))) {
          int _length = msg.length();
          from = _length;
        } else {
          String name = msg.substring((start + 2), end);
          boolean _contains = vars.contains(name);
          boolean _not = (!_contains);
          if (_not) {
            return name;
          }
          from = (end + 1);
        }
      }
      int _indexOf_1 = msg.indexOf("${", from);
      int _start_1 = start = _indexOf_1;
      boolean _greaterThan_1 = (_start_1 > (-1));
      _while = _greaterThan_1;
    }
    return null;
  }
  
  private Set<String> allVariables(final org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception ex) {
    Set<String> vars = new HashSet<String>();
    EList<Variable> _variables = ex.getVariables();
    boolean _notEquals = (!Objects.equal(_variables, null));
    if (_notEquals) {
      EList<Variable> _variables_1 = ex.getVariables();
      for (final Variable v : _variables_1) {
        String _name = v.getName();
        vars.add(_name);
      }
    }
    return vars;
  }
  
  private Set<String> allVariables(final Constraint constraint) {
    Set<String> vars = new HashSet<String>();
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
}
