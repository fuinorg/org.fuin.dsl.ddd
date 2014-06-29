package org.fuin.dsl.ddd.validation;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.validation.Check;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AggregateId;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintTarget;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Context;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EntityId;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Event;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Method;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ReturnType;
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
  private final static String MSG_DIRECT_REF_AGGREGATE = "A direct reference to an aggregate is only allowed from entities in the same aggregate";
  
  private final static String MSG_DIRECT_REF_ENTITY = "A direct reference to an entity is only allowed from entities in the same aggregate";
  
  public final static String INVALID_VAR_NAME = "invalidVarName";
  
  public final static String EVENT_ONLY_ALLOWED_FOR_ENTITY = "eventOnlyAllowedForEntity";
  
  public final static String CONSTRAINT_MSG_UNKNOWN_VAR = "constraintMsgUnknownVar";
  
  public final static String EXCEPTION_MSG_UNKNOWN_VAR = "exceptionMsgUnknownVar";
  
  public final static String REF_TO_AGGREGATE_NOT_ALLOWED = "refToAggregateNotAllowed";
  
  public final static String REF_TO_ENTITY_NOT_ALLOWED = "refToEntityNotAllowed";
  
  public final static String MISSING_DOC = "missingDOC";
  
  public final static String EVENT_MSG_UNKNOWN_VAR = "eventMsgUnknownVar";
  
  public final static String EXCEPTION_DUPLICATE_CID = "exceptionDuplicateCID";
  
  @Inject
  private IContainer.Manager containerManager;
  
  @Inject
  private ResourceDescriptionsProvider resourceDescriptionsProvider;
  
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
  public void checkEventsOnlyAllowedInEntities(final Event event) {
    boolean _isChildOfAbstractEntity = DomainDrivenDesignDslValidator.isChildOfAbstractEntity(event);
    boolean _not = (!_isChildOfAbstractEntity);
    if (_not) {
      this.error("Events are only allowed within entity methods", event, 
        DomainDrivenDesignDslPackage.Literals.EVENT__NAME, DomainDrivenDesignDslValidator.EVENT_ONLY_ALLOWED_FOR_ENTITY);
    }
  }
  
  @Check
  public void checkVariablesInConstraintMessage(final Constraint constraint) {
    Set<String> _allVariables = DomainDrivenDesignDslValidator.allVariables(constraint);
    String _message = constraint.getMessage();
    final String name = DomainDrivenDesignDslValidator.findUnknownVar(_allVariables, _message);
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
    Set<String> _allVariables = DomainDrivenDesignDslValidator.allVariables(ex);
    String _message = ex.getMessage();
    final String name = DomainDrivenDesignDslValidator.findUnknownVar(_allVariables, _message);
    boolean _notEquals = (!Objects.equal(name, null));
    if (_notEquals) {
      this.error(
        (("A variable \'" + name) + "\' is not defined in the exception"), ex, 
        DomainDrivenDesignDslPackage.Literals.EXCEPTION__MESSAGE, 
        DomainDrivenDesignDslValidator.EXCEPTION_MSG_UNKNOWN_VAR);
    }
  }
  
  @Check
  public void checkForbiddenTypeRefs(final Variable variable) {
    Type _type = variable.getType();
    if ((_type instanceof Aggregate)) {
      Type _type_1 = variable.getType();
      final Aggregate aggregate = ((Aggregate) _type_1);
      final Entity parentEntity = DomainDrivenDesignDslValidator.<Entity>getParent(Entity.class, variable);
      boolean _or = false;
      boolean _equals = Objects.equal(parentEntity, null);
      if (_equals) {
        _or = true;
      } else {
        Aggregate _root = parentEntity.getRoot();
        boolean _notEquals = (!Objects.equal(aggregate, _root));
        _or = _notEquals;
      }
      if (_or) {
        AggregateId _idType = aggregate.getIdType();
        String _name = _idType.getName();
        this.error(
          DomainDrivenDesignDslValidator.MSG_DIRECT_REF_AGGREGATE, variable, 
          DomainDrivenDesignDslPackage.Literals.VARIABLE__TYPE, 
          DomainDrivenDesignDslValidator.REF_TO_AGGREGATE_NOT_ALLOWED, _name);
      }
    }
    Type _type_2 = variable.getType();
    if ((_type_2 instanceof Entity)) {
      Type _type_3 = variable.getType();
      final Entity entity = ((Entity) _type_3);
      final Aggregate aggregateOfVariable = DomainDrivenDesignDslValidator.getAggregate(variable);
      boolean _or_1 = false;
      boolean _equals_1 = Objects.equal(aggregateOfVariable, null);
      if (_equals_1) {
        _or_1 = true;
      } else {
        Aggregate _root_1 = entity.getRoot();
        boolean _notEquals_1 = (!Objects.equal(aggregateOfVariable, _root_1));
        _or_1 = _notEquals_1;
      }
      if (_or_1) {
        EntityId _idType_1 = entity.getIdType();
        String _name_1 = _idType_1.getName();
        this.error(
          DomainDrivenDesignDslValidator.MSG_DIRECT_REF_ENTITY, variable, 
          DomainDrivenDesignDslPackage.Literals.VARIABLE__TYPE, 
          DomainDrivenDesignDslValidator.REF_TO_ENTITY_NOT_ALLOWED, _name_1);
      }
    }
  }
  
  @Check
  public void checkNoRefToAggregate(final Method method) {
    ReturnType _returnType = method.getReturnType();
    Type _type = _returnType.getType();
    if ((_type instanceof Aggregate)) {
      ReturnType _returnType_1 = method.getReturnType();
      Type _type_1 = _returnType_1.getType();
      final Aggregate aggregate = ((Aggregate) _type_1);
      final Entity parentEntity = DomainDrivenDesignDslValidator.<Entity>getParent(Entity.class, method);
      boolean _or = false;
      boolean _equals = Objects.equal(parentEntity, null);
      if (_equals) {
        _or = true;
      } else {
        Aggregate _root = parentEntity.getRoot();
        boolean _notEquals = (!Objects.equal(aggregate, _root));
        _or = _notEquals;
      }
      if (_or) {
        AggregateId _idType = aggregate.getIdType();
        String _name = _idType.getName();
        this.error(
          DomainDrivenDesignDslValidator.MSG_DIRECT_REF_AGGREGATE, method, 
          DomainDrivenDesignDslPackage.Literals.METHOD__RETURN_TYPE, 
          DomainDrivenDesignDslValidator.REF_TO_AGGREGATE_NOT_ALLOWED, _name);
      }
    } else {
      ReturnType _returnType_2 = method.getReturnType();
      Type _type_2 = _returnType_2.getType();
      if ((_type_2 instanceof Entity)) {
        ReturnType _returnType_3 = method.getReturnType();
        Type _type_3 = _returnType_3.getType();
        final Entity entity = ((Entity) _type_3);
        final Entity parentEntity_1 = DomainDrivenDesignDslValidator.<Entity>getParent(Entity.class, method);
        boolean _or_1 = false;
        boolean _equals_1 = Objects.equal(parentEntity_1, null);
        if (_equals_1) {
          _or_1 = true;
        } else {
          Aggregate _root_1 = entity.getRoot();
          Aggregate _root_2 = parentEntity_1.getRoot();
          boolean _notEquals_1 = (!Objects.equal(_root_1, _root_2));
          _or_1 = _notEquals_1;
        }
        if (_or_1) {
          EntityId _idType_1 = entity.getIdType();
          String _name_1 = _idType_1.getName();
          this.error(
            DomainDrivenDesignDslValidator.MSG_DIRECT_REF_ENTITY, method, 
            DomainDrivenDesignDslPackage.Literals.METHOD__RETURN_TYPE, 
            DomainDrivenDesignDslValidator.REF_TO_ENTITY_NOT_ALLOWED, _name_1);
        }
      }
    }
  }
  
  @Check
  public void checkVariablesInEventMessage(final Event event) {
    String _message = event.getMessage();
    boolean _notEquals = (!Objects.equal(_message, null));
    if (_notEquals) {
      Set<String> _allVariables = DomainDrivenDesignDslValidator.allVariables(event);
      String _message_1 = event.getMessage();
      final String name = DomainDrivenDesignDslValidator.findUnknownVar(_allVariables, _message_1);
      boolean _notEquals_1 = (!Objects.equal(name, null));
      if (_notEquals_1) {
        this.error(
          (("A variable with the name \'" + name) + "\' is unknown"), event, 
          DomainDrivenDesignDslPackage.Literals.EVENT__MESSAGE, 
          DomainDrivenDesignDslValidator.EVENT_MSG_UNKNOWN_VAR);
      }
    }
  }
  
  @Check
  public void checkUniqueExceptionUID(final org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception ex) {
    String name = null;
    int max = 0;
    Set<org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception> _allExceptions = this.getAllExceptions(ex);
    final Iterator<org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception> allExceptions = _allExceptions.iterator();
    boolean _hasNext = allExceptions.hasNext();
    boolean _while = _hasNext;
    while (_while) {
      {
        org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception _next = allExceptions.next();
        final org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception other = ((org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception) _next);
        boolean _and = false;
        int _cid = other.getCid();
        boolean _greaterThan = (_cid > max);
        if (!_greaterThan) {
          _and = false;
        } else {
          Context _context = DomainDrivenDesignDslValidator.getContext(ex);
          String _name = _context.getName();
          Context _context_1 = DomainDrivenDesignDslValidator.getContext(other);
          String _name_1 = _context_1.getName();
          boolean _equals = _name.equals(_name_1);
          _and = _equals;
        }
        if (_and) {
          int _cid_1 = other.getCid();
          max = _cid_1;
        }
        boolean _and_1 = false;
        boolean _and_2 = false;
        boolean _and_3 = false;
        boolean _and_4 = false;
        boolean _equals_1 = Objects.equal(name, null);
        if (!_equals_1) {
          _and_4 = false;
        } else {
          boolean _notEquals = (!Objects.equal(ex, other));
          _and_4 = _notEquals;
        }
        if (!_and_4) {
          _and_3 = false;
        } else {
          int _cid_2 = ex.getCid();
          boolean _greaterThan_1 = (_cid_2 > 0);
          _and_3 = _greaterThan_1;
        }
        if (!_and_3) {
          _and_2 = false;
        } else {
          int _cid_3 = ex.getCid();
          int _cid_4 = other.getCid();
          boolean _equals_2 = (_cid_3 == _cid_4);
          _and_2 = _equals_2;
        }
        if (!_and_2) {
          _and_1 = false;
        } else {
          Context _context_2 = DomainDrivenDesignDslValidator.getContext(ex);
          String _name_2 = _context_2.getName();
          Context _context_3 = DomainDrivenDesignDslValidator.getContext(other);
          String _name_3 = _context_3.getName();
          boolean _equals_3 = _name_2.equals(_name_3);
          _and_1 = _equals_3;
        }
        if (_and_1) {
          String _name_4 = other.getName();
          name = _name_4;
        }
      }
      boolean _hasNext_1 = allExceptions.hasNext();
      _while = _hasNext_1;
    }
    boolean _notEquals = (!Objects.equal(name, null));
    if (_notEquals) {
      final String nextId = ("" + Integer.valueOf((max + 1)));
      this.error(
        (("The CID is already used by exception \'" + name) + "\'"), ex, 
        DomainDrivenDesignDslPackage.Literals.EXCEPTION__CID, 
        DomainDrivenDesignDslValidator.EXCEPTION_DUPLICATE_CID, nextId);
    }
  }
  
  private Set<org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception> getAllExceptions(final EObject obj) {
    final Set<org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception> list = new HashSet<org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception>();
    final Resource resource = obj.eResource();
    final IResourceDescriptions resourceDescriptions = this.resourceDescriptionsProvider.getResourceDescriptions(resource);
    URI _uRI = resource.getURI();
    final IResourceDescription resourceDescription = resourceDescriptions.getResourceDescription(_uRI);
    final List<IContainer> containers = this.containerManager.getVisibleContainers(resourceDescription, resourceDescriptions);
    for (final IContainer container : containers) {
      Iterable<IEObjectDescription> _exportedObjects = container.getExportedObjects();
      for (final IEObjectDescription descr : _exportedObjects) {
        {
          final EObject eObjectOrProxy = descr.getEObjectOrProxy();
          if ((eObjectOrProxy instanceof org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception)) {
            EObject _resolve = EcoreUtil.resolve(eObjectOrProxy, obj);
            final org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception ex = ((org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception) _resolve);
            list.add(ex);
          }
        }
      }
    }
    return list;
  }
  
  private static EObject getRoot(final EObject obj) {
    EObject _eContainer = obj.eContainer();
    boolean _equals = Objects.equal(_eContainer, null);
    if (_equals) {
      return obj;
    }
    EObject _eContainer_1 = obj.eContainer();
    return DomainDrivenDesignDslValidator.getRoot(_eContainer_1);
  }
  
  private static Context getContext(final EObject obj) {
    if ((obj instanceof Context)) {
      return ((Context)obj);
    }
    EObject _eContainer = obj.eContainer();
    return DomainDrivenDesignDslValidator.getContext(_eContainer);
  }
  
  private static String findUnknownVar(final Set<String> vars, final String msg) {
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
          boolean _and = false;
          boolean _contains = vars.contains(name);
          boolean _not = (!_contains);
          if (!_not) {
            _and = false;
          } else {
            boolean _startsWith = name.startsWith("#");
            boolean _not_1 = (!_startsWith);
            _and = _not_1;
          }
          if (_and) {
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
  
  private static Set<String> allVariables(final Event event) {
    Set<String> vars = new HashSet<String>();
    EList<Variable> _variables = event.getVariables();
    boolean _notEquals = (!Objects.equal(_variables, null));
    if (_notEquals) {
      EList<Variable> _variables_1 = event.getVariables();
      for (final Variable v : _variables_1) {
        String _name = v.getName();
        vars.add(_name);
      }
    }
    return vars;
  }
  
  private static Set<String> allVariables(final org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception ex) {
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
  
  private static Set<String> allVariables(final Constraint constraint) {
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
  
  /**
   * Returns the aggregate an object belongs to. All objects directly defined inside
   * an aggregate will be found and also entities that belong to the aggregate.
   * 
   * @param obj Object to return the aggregate for.
   * 
   * @return Aggregate or null if the object does not belong to an aggregate.
   */
  private static Aggregate getAggregate(final EObject obj) {
    final AbstractEntity ae = DomainDrivenDesignDslValidator.<AbstractEntity>getParent(AbstractEntity.class, obj);
    if ((ae instanceof Aggregate)) {
      return ((Aggregate) ae);
    }
    if ((ae instanceof Entity)) {
      return ((Entity) ae).getRoot();
    }
    return null;
  }
  
  /**
   * Returns the information if an object is defined inside an abstract entity.
   * 
   * @param obj Object to verify.
   * 
   * @return TRUE if the object is part of an Aggregate or Entity.
   */
  private static boolean isChildOfAbstractEntity(final EObject obj) {
    AbstractEntity _parent = DomainDrivenDesignDslValidator.<AbstractEntity>getParent(AbstractEntity.class, obj);
    return (!Objects.equal(_parent, null));
  }
  
  /**
   * Returns the first parent with a given type for an object.
   * 
   * @param obj Object to return the parent for.
   * 
   * @return Parent or null if the object is not inside the requested type.
   */
  private static <T extends Object> T getParent(final Class<T> clasz, final EObject obj) {
    boolean _equals = Objects.equal(obj, null);
    if (_equals) {
      return null;
    }
    Class<? extends EObject> _class = obj.getClass();
    boolean _isAssignableFrom = clasz.isAssignableFrom(_class);
    if (_isAssignableFrom) {
      return ((T) obj);
    }
    EObject _eContainer = obj.eContainer();
    return DomainDrivenDesignDslValidator.<T>getParent(clasz, _eContainer);
  }
}
