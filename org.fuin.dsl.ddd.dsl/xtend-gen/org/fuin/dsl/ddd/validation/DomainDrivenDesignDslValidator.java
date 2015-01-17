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
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AggregateId;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Attribute;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Context;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EntityId;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Event;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Method;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ReturnType;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Service;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Type;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable;
import org.fuin.dsl.ddd.extensions.DddAbstractElementExtensions;
import org.fuin.dsl.ddd.extensions.DddAttributeExtensions;
import org.fuin.dsl.ddd.extensions.DddConstraintExtension;
import org.fuin.dsl.ddd.extensions.DddEObjectExtensions;
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
  
  public final static String SERVICE_METHOD_CANNOT_FIRE_EVENTS = "serviceMethodCannotFireEvents";
  
  public final static String SERVICE_METHOD_CANNOT_DECLARE_EVENTS = "serviceMethodCannotDeclareEvents";
  
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
  public void checkVariablesInConstraintMessage(final Constraint constraint) {
    List<Attribute> _allAllowedVariables = DddConstraintExtension.allAllowedVariables(constraint);
    List<String> _asNames = DddAttributeExtensions.asNames(_allAllowedVariables);
    String _message = constraint.getMessage();
    final String name = DomainDrivenDesignDslValidator.findUnknownVar(_asNames, _message);
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
    EList<Attribute> _attributes = ex.getAttributes();
    List<String> _asNames = DddAttributeExtensions.asNames(_attributes);
    String _message = ex.getMessage();
    final String name = DomainDrivenDesignDslValidator.findUnknownVar(_asNames, _message);
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
      final Entity parentEntity = DddEObjectExtensions.<Entity>getParent(Entity.class, variable);
      boolean _or = false;
      boolean _equals = Objects.equal(parentEntity, null);
      if (_equals) {
        _or = true;
      } else {
        Aggregate _root = parentEntity.getRoot();
        boolean _same = DddAbstractElementExtensions.same(aggregate, _root);
        boolean _not = (!_same);
        _or = _not;
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
      final Aggregate aggregateOfVariable = DddEObjectExtensions.getAggregate(variable);
      boolean _or_1 = false;
      boolean _equals_1 = Objects.equal(aggregateOfVariable, null);
      if (_equals_1) {
        _or_1 = true;
      } else {
        Aggregate _root_1 = entity.getRoot();
        boolean _same_1 = DddAbstractElementExtensions.same(aggregateOfVariable, _root_1);
        boolean _not_1 = (!_same_1);
        _or_1 = _not_1;
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
      final Entity parentEntity = DddEObjectExtensions.<Entity>getParent(Entity.class, method);
      boolean _or = false;
      boolean _equals = Objects.equal(parentEntity, null);
      if (_equals) {
        _or = true;
      } else {
        Aggregate _root = parentEntity.getRoot();
        boolean _same = DddAbstractElementExtensions.same(aggregate, _root);
        boolean _not = (!_same);
        _or = _not;
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
        final Entity parentEntity_1 = DddEObjectExtensions.<Entity>getParent(Entity.class, method);
        boolean _or_1 = false;
        boolean _equals_1 = Objects.equal(parentEntity_1, null);
        if (_equals_1) {
          _or_1 = true;
        } else {
          Aggregate _root_1 = entity.getRoot();
          Aggregate _root_2 = parentEntity_1.getRoot();
          boolean _same_1 = DddAbstractElementExtensions.same(_root_1, _root_2);
          boolean _not_1 = (!_same_1);
          _or_1 = _not_1;
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
  public void checkNoEventsInService(final Method method) {
    EObject _eContainer = method.eContainer();
    if ((_eContainer instanceof Service)) {
      boolean _and = false;
      EList<Event> _firedEvents = method.getFiredEvents();
      boolean _notEquals = (!Objects.equal(_firedEvents, null));
      if (!_notEquals) {
        _and = false;
      } else {
        EList<Event> _firedEvents_1 = method.getFiredEvents();
        int _size = _firedEvents_1.size();
        boolean _greaterThan = (_size > 0);
        _and = _greaterThan;
      }
      if (_and) {
        this.error(
          "A service method cannot fire events", method, 
          DomainDrivenDesignDslPackage.Literals.ABSTRACT_METHOD__FIRED_EVENTS, 
          DomainDrivenDesignDslValidator.SERVICE_METHOD_CANNOT_FIRE_EVENTS);
      }
      boolean _and_1 = false;
      EList<Event> _events = method.getEvents();
      boolean _notEquals_1 = (!Objects.equal(_events, null));
      if (!_notEquals_1) {
        _and_1 = false;
      } else {
        EList<Event> _events_1 = method.getEvents();
        int _size_1 = _events_1.size();
        boolean _greaterThan_1 = (_size_1 > 0);
        _and_1 = _greaterThan_1;
      }
      if (_and_1) {
        this.error(
          "A service method cannot declare events", method, 
          DomainDrivenDesignDslPackage.Literals.ABSTRACT_METHOD__EVENTS, 
          DomainDrivenDesignDslValidator.SERVICE_METHOD_CANNOT_DECLARE_EVENTS);
      }
    }
  }
  
  @Check
  public void checkVariablesInEventMessage(final Event event) {
    String _message = event.getMessage();
    boolean _notEquals = (!Objects.equal(_message, null));
    if (_notEquals) {
      EList<Attribute> _attributes = event.getAttributes();
      List<String> _asNames = DddAttributeExtensions.asNames(_attributes);
      String _message_1 = event.getMessage();
      final String name = DomainDrivenDesignDslValidator.findUnknownVar(_asNames, _message_1);
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
    while (allExceptions.hasNext()) {
      {
        org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception _next = allExceptions.next();
        final org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception other = ((org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception) _next);
        boolean _and = false;
        int _cid = other.getCid();
        boolean _greaterThan = (_cid > max);
        if (!_greaterThan) {
          _and = false;
        } else {
          Context _context = DddEObjectExtensions.getContext(ex);
          String _name = _context.getName();
          Context _context_1 = DddEObjectExtensions.getContext(other);
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
          Context _context_2 = DddEObjectExtensions.getContext(ex);
          String _name_2 = _context_2.getName();
          Context _context_3 = DddEObjectExtensions.getContext(other);
          String _name_3 = _context_3.getName();
          boolean _equals_3 = _name_2.equals(_name_3);
          _and_1 = _equals_3;
        }
        if (_and_1) {
          String _name_4 = other.getName();
          name = _name_4;
        }
      }
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
  
  private static String findUnknownVar(final List<String> vars, final String msg) {
    int end = (-1);
    int from = 0;
    int start = (-1);
    while (((start = msg.indexOf("${", from)) > (-1))) {
      {
        int _indexOf = msg.indexOf("}", (start + 1));
        end = _indexOf;
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
    }
    return null;
  }
}
