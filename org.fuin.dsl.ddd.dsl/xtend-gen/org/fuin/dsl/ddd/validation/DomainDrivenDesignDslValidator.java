package org.fuin.dsl.ddd.validation;

import com.google.common.base.Objects;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage.Literals;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Event;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Message;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Method;
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
  
  public final static String INVALID_TECHNICAL_ID = "invalidTechnicalId";
  
  public final static String INVALID_BUSINESS_KEY = "invalidBusinessKey";
  
  public final static String INVALID_BUSINESS_NAME = "invalidBusinessName";
  
  public final static String DUPLICATE_TECHNICAL_ID = "duplicateTechnicalId";
  
  public final static String DUPLICATE_BUSINESS_KEY = "duplicateBusinessKey";
  
  public final static String DUPLICATE_BUSINESS_NAME = "duplicateBusinessName";
  
  public final static String EVENT_NOT_ALLOWED_FOR_VO = "eventNotAllowedForVO";
  
  public final static String CONSTRAINT_MSG_UNKNOWN_VAR = "constraintMsgUnknownVar";
  
  private final static String ERROR_MULTIPLE_ID_KEY_NAME = "Only one of \'techicalId\', \'businessKey\' or \'businessName\' at a time is allowed for an attribute";
  
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
  public void checkIdBusinessKeyAndNameOnlyForEntity(final Variable variable) {
    EObject _eContainer = variable.eContainer();
    boolean _not = (!(_eContainer instanceof AbstractEntity));
    if (_not) {
      String _technicalId = variable.getTechnicalId();
      boolean _notEquals = (!Objects.equal(_technicalId, null));
      if (_notEquals) {
        this.error("A technical id is only allowed for entities", variable, 
          Literals.VARIABLE__TECHNICAL_ID, DomainDrivenDesignDslValidator.INVALID_TECHNICAL_ID);
      } else {
        String _businessKey = variable.getBusinessKey();
        boolean _notEquals_1 = (!Objects.equal(_businessKey, null));
        if (_notEquals_1) {
          this.error("A business key is only allowed for entities", variable, 
            Literals.VARIABLE__BUSINESS_KEY, DomainDrivenDesignDslValidator.INVALID_BUSINESS_KEY);
        } else {
          String _businessName = variable.getBusinessName();
          boolean _notEquals_2 = (!Objects.equal(_businessName, null));
          if (_notEquals_2) {
            this.error("A business name is only allowed for entities", variable, 
              Literals.VARIABLE__BUSINESS_NAME, DomainDrivenDesignDslValidator.INVALID_BUSINESS_NAME);
          }
        }
      }
    }
  }
  
  @Check
  public void checkIdBusinessKeyAndName(final AbstractEntity entity) {
    String technicalId = null;
    String businessKey = null;
    String businessName = null;
    EList<Variable> _variables = entity.getVariables();
    for (final Variable v : _variables) {
      String _technicalId = v.getTechnicalId();
      boolean _equals = Objects.equal(_technicalId, null);
      if (_equals) {
        String _businessKey = v.getBusinessKey();
        boolean _equals_1 = Objects.equal(_businessKey, null);
        if (_equals_1) {
          String _businessName = v.getBusinessName();
          boolean _notEquals = (!Objects.equal(_businessName, null));
          if (_notEquals) {
            boolean _equals_2 = Objects.equal(businessName, null);
            if (_equals_2) {
              String _name = v.getName();
              businessName = _name;
            } else {
              String _plus = ("You can only define one business name within an entity (" + businessName);
              String _plus_1 = (_plus + ")");
              this.error(_plus_1, v, 
                Literals.VARIABLE__BUSINESS_NAME, DomainDrivenDesignDslValidator.DUPLICATE_BUSINESS_NAME);
            }
          }
        } else {
          boolean _equals_3 = Objects.equal(businessKey, null);
          if (_equals_3) {
            String _name_1 = v.getName();
            businessKey = _name_1;
            String _businessName_1 = v.getBusinessName();
            boolean _notEquals_1 = (!Objects.equal(_businessName_1, null));
            if (_notEquals_1) {
              this.error(DomainDrivenDesignDslValidator.ERROR_MULTIPLE_ID_KEY_NAME, v, 
                Literals.VARIABLE__BUSINESS_NAME, DomainDrivenDesignDslValidator.DUPLICATE_BUSINESS_NAME);
            }
          } else {
            String _plus_2 = ("You can only define one business key within an entity (" + businessKey);
            String _plus_3 = (_plus_2 + ")");
            this.error(_plus_3, v, 
              Literals.VARIABLE__BUSINESS_NAME, DomainDrivenDesignDslValidator.DUPLICATE_BUSINESS_KEY);
          }
        }
      } else {
        boolean _equals_4 = Objects.equal(technicalId, null);
        if (_equals_4) {
          String _name_2 = v.getName();
          technicalId = _name_2;
          String _businessKey_1 = v.getBusinessKey();
          boolean _notEquals_2 = (!Objects.equal(_businessKey_1, null));
          if (_notEquals_2) {
            this.error(DomainDrivenDesignDslValidator.ERROR_MULTIPLE_ID_KEY_NAME, v, 
              Literals.VARIABLE__BUSINESS_KEY, DomainDrivenDesignDslValidator.DUPLICATE_BUSINESS_KEY);
          }
          String _businessName_2 = v.getBusinessName();
          boolean _notEquals_3 = (!Objects.equal(_businessName_2, null));
          if (_notEquals_3) {
            this.error(DomainDrivenDesignDslValidator.ERROR_MULTIPLE_ID_KEY_NAME, v, 
              Literals.VARIABLE__BUSINESS_NAME, DomainDrivenDesignDslValidator.DUPLICATE_BUSINESS_NAME);
          }
        } else {
          String _plus_4 = ("You can only define one technical id within an entity (" + technicalId);
          String _plus_5 = (_plus_4 + ")");
          this.error(_plus_5, v, 
            Literals.VARIABLE__TECHNICAL_ID, DomainDrivenDesignDslValidator.DUPLICATE_TECHNICAL_ID);
        }
      }
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
    Message _message = constraint.getMessage();
    String str = _message.getText();
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
            Message _message_1 = constraint.getMessage();
            this.error(_plus_3, _message_1, 
              Literals.MESSAGE__TEXT, DomainDrivenDesignDslValidator.CONSTRAINT_MSG_UNKNOWN_VAR);
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
    Message _message = constraint.getMessage();
    EList<Variable> _variables_2 = _message.getVariables();
    boolean _notEquals_1 = (!Objects.equal(_variables_2, null));
    if (_notEquals_1) {
      Message _message_1 = constraint.getMessage();
      EList<Variable> _variables_3 = _message_1.getVariables();
      for (final Variable v_1 : _variables_3) {
        String _name_1 = v_1.getName();
        vars.add(_name_1);
      }
    }
    return vars;
  }
}
