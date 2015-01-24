/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractElement;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntityId;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AggregateId;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Attribute;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.BooleanLiteral;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.BusinessRules;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Consistency;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConsistencyLevel;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintInstance;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constructor;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Context;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslFactory;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainModel;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Duration;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EntityId;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumInstance;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumObject;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Event;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Import;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.InconsistencyDetection;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.InconsistencyResolution;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.InternalType;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Invariants;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Literal;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Method;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Namespace;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.NullLiteral;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.NumberLiteral;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.OverriddenTypeMetaInfo;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Parameter;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Preconditions;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ReturnType;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Service;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.StringLiteral;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.TimeUnit;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Type;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ValueObject;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.WeakConsistency;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainDrivenDesignDslFactoryImpl extends EFactoryImpl implements DomainDrivenDesignDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DomainDrivenDesignDslFactory init()
  {
    try
    {
      DomainDrivenDesignDslFactory theDomainDrivenDesignDslFactory = (DomainDrivenDesignDslFactory)EPackage.Registry.INSTANCE.getEFactory(DomainDrivenDesignDslPackage.eNS_URI);
      if (theDomainDrivenDesignDslFactory != null)
      {
        return theDomainDrivenDesignDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DomainDrivenDesignDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainDrivenDesignDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DomainDrivenDesignDslPackage.DOMAIN_MODEL: return createDomainModel();
      case DomainDrivenDesignDslPackage.CONTEXT: return createContext();
      case DomainDrivenDesignDslPackage.NAMESPACE: return createNamespace();
      case DomainDrivenDesignDslPackage.IMPORT: return createImport();
      case DomainDrivenDesignDslPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case DomainDrivenDesignDslPackage.TYPE: return createType();
      case DomainDrivenDesignDslPackage.INTERNAL_TYPE: return createInternalType();
      case DomainDrivenDesignDslPackage.ABSTRACT_VO: return createAbstractVO();
      case DomainDrivenDesignDslPackage.ABSTRACT_ENTITY_ID: return createAbstractEntityId();
      case DomainDrivenDesignDslPackage.ABSTRACT_ENTITY: return createAbstractEntity();
      case DomainDrivenDesignDslPackage.EXTERNAL_TYPE: return createExternalType();
      case DomainDrivenDesignDslPackage.DURATION: return createDuration();
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY: return createWeakConsistency();
      case DomainDrivenDesignDslPackage.CONSISTENCY: return createConsistency();
      case DomainDrivenDesignDslPackage.CONSTRAINT: return createConstraint();
      case DomainDrivenDesignDslPackage.EXCEPTION: return createException();
      case DomainDrivenDesignDslPackage.VALUE_OBJECT: return createValueObject();
      case DomainDrivenDesignDslPackage.ENTITY_ID: return createEntityId();
      case DomainDrivenDesignDslPackage.AGGREGATE_ID: return createAggregateId();
      case DomainDrivenDesignDslPackage.ENUM_OBJECT: return createEnumObject();
      case DomainDrivenDesignDslPackage.ENUM_INSTANCE: return createEnumInstance();
      case DomainDrivenDesignDslPackage.EVENT: return createEvent();
      case DomainDrivenDesignDslPackage.ENTITY: return createEntity();
      case DomainDrivenDesignDslPackage.AGGREGATE: return createAggregate();
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD: return createAbstractMethod();
      case DomainDrivenDesignDslPackage.CONSTRUCTOR: return createConstructor();
      case DomainDrivenDesignDslPackage.RETURN_TYPE: return createReturnType();
      case DomainDrivenDesignDslPackage.METHOD: return createMethod();
      case DomainDrivenDesignDslPackage.TYPE_META_INFO: return createTypeMetaInfo();
      case DomainDrivenDesignDslPackage.VARIABLE: return createVariable();
      case DomainDrivenDesignDslPackage.ATTRIBUTE: return createAttribute();
      case DomainDrivenDesignDslPackage.PARAMETER: return createParameter();
      case DomainDrivenDesignDslPackage.INVARIANTS: return createInvariants();
      case DomainDrivenDesignDslPackage.PRECONDITIONS: return createPreconditions();
      case DomainDrivenDesignDslPackage.BUSINESS_RULES: return createBusinessRules();
      case DomainDrivenDesignDslPackage.OVERRIDDEN_TYPE_META_INFO: return createOverriddenTypeMetaInfo();
      case DomainDrivenDesignDslPackage.CONSTRAINT_INSTANCE: return createConstraintInstance();
      case DomainDrivenDesignDslPackage.SERVICE: return createService();
      case DomainDrivenDesignDslPackage.LITERAL: return createLiteral();
      case DomainDrivenDesignDslPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case DomainDrivenDesignDslPackage.NULL_LITERAL: return createNullLiteral();
      case DomainDrivenDesignDslPackage.NUMBER_LITERAL: return createNumberLiteral();
      case DomainDrivenDesignDslPackage.STRING_LITERAL: return createStringLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DomainDrivenDesignDslPackage.TIME_UNIT:
        return createTimeUnitFromString(eDataType, initialValue);
      case DomainDrivenDesignDslPackage.CONSISTENCY_LEVEL:
        return createConsistencyLevelFromString(eDataType, initialValue);
      case DomainDrivenDesignDslPackage.INCONSISTENCY_DETECTION:
        return createInconsistencyDetectionFromString(eDataType, initialValue);
      case DomainDrivenDesignDslPackage.INCONSISTENCY_RESOLUTION:
        return createInconsistencyResolutionFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DomainDrivenDesignDslPackage.TIME_UNIT:
        return convertTimeUnitToString(eDataType, instanceValue);
      case DomainDrivenDesignDslPackage.CONSISTENCY_LEVEL:
        return convertConsistencyLevelToString(eDataType, instanceValue);
      case DomainDrivenDesignDslPackage.INCONSISTENCY_DETECTION:
        return convertInconsistencyDetectionToString(eDataType, instanceValue);
      case DomainDrivenDesignDslPackage.INCONSISTENCY_RESOLUTION:
        return convertInconsistencyResolutionToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainModel createDomainModel()
  {
    DomainModelImpl domainModel = new DomainModelImpl();
    return domainModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context createContext()
  {
    ContextImpl context = new ContextImpl();
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Namespace createNamespace()
  {
    NamespaceImpl namespace = new NamespaceImpl();
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InternalType createInternalType()
  {
    InternalTypeImpl internalType = new InternalTypeImpl();
    return internalType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractVO createAbstractVO()
  {
    AbstractVOImpl abstractVO = new AbstractVOImpl();
    return abstractVO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractEntityId createAbstractEntityId()
  {
    AbstractEntityIdImpl abstractEntityId = new AbstractEntityIdImpl();
    return abstractEntityId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractEntity createAbstractEntity()
  {
    AbstractEntityImpl abstractEntity = new AbstractEntityImpl();
    return abstractEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalType createExternalType()
  {
    ExternalTypeImpl externalType = new ExternalTypeImpl();
    return externalType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Duration createDuration()
  {
    DurationImpl duration = new DurationImpl();
    return duration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeakConsistency createWeakConsistency()
  {
    WeakConsistencyImpl weakConsistency = new WeakConsistencyImpl();
    return weakConsistency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Consistency createConsistency()
  {
    ConsistencyImpl consistency = new ConsistencyImpl();
    return consistency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception createException()
  {
    ExceptionImpl exception = new ExceptionImpl();
    return exception;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueObject createValueObject()
  {
    ValueObjectImpl valueObject = new ValueObjectImpl();
    return valueObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityId createEntityId()
  {
    EntityIdImpl entityId = new EntityIdImpl();
    return entityId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AggregateId createAggregateId()
  {
    AggregateIdImpl aggregateId = new AggregateIdImpl();
    return aggregateId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumObject createEnumObject()
  {
    EnumObjectImpl enumObject = new EnumObjectImpl();
    return enumObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumInstance createEnumInstance()
  {
    EnumInstanceImpl enumInstance = new EnumInstanceImpl();
    return enumInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aggregate createAggregate()
  {
    AggregateImpl aggregate = new AggregateImpl();
    return aggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractMethod createAbstractMethod()
  {
    AbstractMethodImpl abstractMethod = new AbstractMethodImpl();
    return abstractMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constructor createConstructor()
  {
    ConstructorImpl constructor = new ConstructorImpl();
    return constructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnType createReturnType()
  {
    ReturnTypeImpl returnType = new ReturnTypeImpl();
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeMetaInfo createTypeMetaInfo()
  {
    TypeMetaInfoImpl typeMetaInfo = new TypeMetaInfoImpl();
    return typeMetaInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Invariants createInvariants()
  {
    InvariantsImpl invariants = new InvariantsImpl();
    return invariants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Preconditions createPreconditions()
  {
    PreconditionsImpl preconditions = new PreconditionsImpl();
    return preconditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessRules createBusinessRules()
  {
    BusinessRulesImpl businessRules = new BusinessRulesImpl();
    return businessRules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OverriddenTypeMetaInfo createOverriddenTypeMetaInfo()
  {
    OverriddenTypeMetaInfoImpl overriddenTypeMetaInfo = new OverriddenTypeMetaInfoImpl();
    return overriddenTypeMetaInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintInstance createConstraintInstance()
  {
    ConstraintInstanceImpl constraintInstance = new ConstraintInstanceImpl();
    return constraintInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullLiteral createNullLiteral()
  {
    NullLiteralImpl nullLiteral = new NullLiteralImpl();
    return nullLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeUnit createTimeUnitFromString(EDataType eDataType, String initialValue)
  {
    TimeUnit result = TimeUnit.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTimeUnitToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConsistencyLevel createConsistencyLevelFromString(EDataType eDataType, String initialValue)
  {
    ConsistencyLevel result = ConsistencyLevel.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConsistencyLevelToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InconsistencyDetection createInconsistencyDetectionFromString(EDataType eDataType, String initialValue)
  {
    InconsistencyDetection result = InconsistencyDetection.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertInconsistencyDetectionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InconsistencyResolution createInconsistencyResolutionFromString(EDataType eDataType, String initialValue)
  {
    InconsistencyResolution result = InconsistencyResolution.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertInconsistencyResolutionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainDrivenDesignDslPackage getDomainDrivenDesignDslPackage()
  {
    return (DomainDrivenDesignDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DomainDrivenDesignDslPackage getPackage()
  {
    return DomainDrivenDesignDslPackage.eINSTANCE;
  }

} //DomainDrivenDesignDslFactoryImpl
