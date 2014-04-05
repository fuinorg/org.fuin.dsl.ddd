/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslFactory
 * @model kind="package"
 * @generated
 */
public interface DomainDrivenDesignDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "domainDrivenDesignDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.fuin.org/dsl/ddd/DomainDrivenDesignDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "domainDrivenDesignDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DomainDrivenDesignDslPackage eINSTANCE = org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainModelImpl <em>Domain Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainModelImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getDomainModel()
   * @generated
   */
  int DOMAIN_MODEL = 0;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL__NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Domain Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.NamespaceImpl <em>Namespace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.NamespaceImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getNamespace()
   * @generated
   */
  int NAMESPACE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__ELEMENTS = 2;

  /**
   * The number of structural features of the '<em>Namespace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ImportImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractElementImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getAbstractElement()
   * @generated
   */
  int ABSTRACT_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Abstract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.TypeImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = ABSTRACT_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractVOImpl <em>Abstract VO</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractVOImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getAbstractVO()
   * @generated
   */
  int ABSTRACT_VO = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_VO__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_VO__DOC = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Meta Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_VO__META_INFO = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_VO__VARIABLES = TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_VO__CONSTRUCTORS = TYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_VO__METHODS = TYPE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Abstract VO</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_VO_FEATURE_COUNT = TYPE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractEntityIdImpl <em>Abstract Entity Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractEntityIdImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getAbstractEntityId()
   * @generated
   */
  int ABSTRACT_ENTITY_ID = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTITY_ID__NAME = ABSTRACT_VO__NAME;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTITY_ID__DOC = ABSTRACT_VO__DOC;

  /**
   * The feature id for the '<em><b>Meta Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTITY_ID__META_INFO = ABSTRACT_VO__META_INFO;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTITY_ID__VARIABLES = ABSTRACT_VO__VARIABLES;

  /**
   * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTITY_ID__CONSTRUCTORS = ABSTRACT_VO__CONSTRUCTORS;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTITY_ID__METHODS = ABSTRACT_VO__METHODS;

  /**
   * The feature id for the '<em><b>Base</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTITY_ID__BASE = ABSTRACT_VO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Abstract Entity Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTITY_ID_FEATURE_COUNT = ABSTRACT_VO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractEntityImpl <em>Abstract Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractEntityImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getAbstractEntity()
   * @generated
   */
  int ABSTRACT_ENTITY = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTITY__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTITY__DOC = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Meta Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTITY__META_INFO = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTITY__VARIABLES = TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTITY__CONSTRUCTORS = TYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTITY__METHODS = TYPE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Abstract Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ENTITY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ConstraintTargetImpl <em>Constraint Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ConstraintTargetImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getConstraintTarget()
   * @generated
   */
  int CONSTRAINT_TARGET = 8;

  /**
   * The number of structural features of the '<em>Constraint Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_TARGET_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ExternalTypeImpl <em>External Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ExternalTypeImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getExternalType()
   * @generated
   */
  int EXTERNAL_TYPE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_TYPE__NAME = TYPE__NAME;

  /**
   * The number of structural features of the '<em>External Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ConstraintImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__NAME = ABSTRACT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__DOC = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__TARGET = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Exception</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__EXCEPTION = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__VARIABLES = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__MESSAGE = ABSTRACT_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ValueObjectImpl <em>Value Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ValueObjectImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getValueObject()
   * @generated
   */
  int VALUE_OBJECT = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_OBJECT__NAME = ABSTRACT_VO__NAME;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_OBJECT__DOC = ABSTRACT_VO__DOC;

  /**
   * The feature id for the '<em><b>Meta Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_OBJECT__META_INFO = ABSTRACT_VO__META_INFO;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_OBJECT__VARIABLES = ABSTRACT_VO__VARIABLES;

  /**
   * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_OBJECT__CONSTRUCTORS = ABSTRACT_VO__CONSTRUCTORS;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_OBJECT__METHODS = ABSTRACT_VO__METHODS;

  /**
   * The feature id for the '<em><b>Base</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_OBJECT__BASE = ABSTRACT_VO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Value Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_OBJECT_FEATURE_COUNT = ABSTRACT_VO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.EntityIdImpl <em>Entity Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.EntityIdImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getEntityId()
   * @generated
   */
  int ENTITY_ID = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_ID__NAME = ABSTRACT_ENTITY_ID__NAME;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_ID__DOC = ABSTRACT_ENTITY_ID__DOC;

  /**
   * The feature id for the '<em><b>Meta Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_ID__META_INFO = ABSTRACT_ENTITY_ID__META_INFO;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_ID__VARIABLES = ABSTRACT_ENTITY_ID__VARIABLES;

  /**
   * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_ID__CONSTRUCTORS = ABSTRACT_ENTITY_ID__CONSTRUCTORS;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_ID__METHODS = ABSTRACT_ENTITY_ID__METHODS;

  /**
   * The feature id for the '<em><b>Base</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_ID__BASE = ABSTRACT_ENTITY_ID__BASE;

  /**
   * The number of structural features of the '<em>Entity Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_ID_FEATURE_COUNT = ABSTRACT_ENTITY_ID_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AggregateIdImpl <em>Aggregate Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AggregateIdImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getAggregateId()
   * @generated
   */
  int AGGREGATE_ID = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_ID__NAME = ABSTRACT_ENTITY_ID__NAME;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_ID__DOC = ABSTRACT_ENTITY_ID__DOC;

  /**
   * The feature id for the '<em><b>Meta Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_ID__META_INFO = ABSTRACT_ENTITY_ID__META_INFO;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_ID__VARIABLES = ABSTRACT_ENTITY_ID__VARIABLES;

  /**
   * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_ID__CONSTRUCTORS = ABSTRACT_ENTITY_ID__CONSTRUCTORS;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_ID__METHODS = ABSTRACT_ENTITY_ID__METHODS;

  /**
   * The feature id for the '<em><b>Base</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_ID__BASE = ABSTRACT_ENTITY_ID__BASE;

  /**
   * The number of structural features of the '<em>Aggregate Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_ID_FEATURE_COUNT = ABSTRACT_ENTITY_ID_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.EnumObjectImpl <em>Enum Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.EnumObjectImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getEnumObject()
   * @generated
   */
  int ENUM_OBJECT = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_OBJECT__NAME = ABSTRACT_VO__NAME;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_OBJECT__DOC = ABSTRACT_VO__DOC;

  /**
   * The feature id for the '<em><b>Meta Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_OBJECT__META_INFO = ABSTRACT_VO__META_INFO;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_OBJECT__VARIABLES = ABSTRACT_VO__VARIABLES;

  /**
   * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_OBJECT__CONSTRUCTORS = ABSTRACT_VO__CONSTRUCTORS;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_OBJECT__METHODS = ABSTRACT_VO__METHODS;

  /**
   * The feature id for the '<em><b>Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_OBJECT__INSTANCES = ABSTRACT_VO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_OBJECT_FEATURE_COUNT = ABSTRACT_VO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.EnumInstanceImpl <em>Enum Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.EnumInstanceImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getEnumInstance()
   * @generated
   */
  int ENUM_INSTANCE = 15;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_INSTANCE__DOC = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_INSTANCE__NAME = 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_INSTANCE__PARAMS = 2;

  /**
   * The number of structural features of the '<em>Enum Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_INSTANCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.EntityImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = ABSTRACT_ENTITY__NAME;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__DOC = ABSTRACT_ENTITY__DOC;

  /**
   * The feature id for the '<em><b>Meta Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__META_INFO = ABSTRACT_ENTITY__META_INFO;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__VARIABLES = ABSTRACT_ENTITY__VARIABLES;

  /**
   * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__CONSTRUCTORS = ABSTRACT_ENTITY__CONSTRUCTORS;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__METHODS = ABSTRACT_ENTITY__METHODS;

  /**
   * The feature id for the '<em><b>Id Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ID_TYPE = ABSTRACT_ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Root</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ROOT = ABSTRACT_ENTITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = ABSTRACT_ENTITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AggregateImpl <em>Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AggregateImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getAggregate()
   * @generated
   */
  int AGGREGATE = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE__NAME = ABSTRACT_ENTITY__NAME;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE__DOC = ABSTRACT_ENTITY__DOC;

  /**
   * The feature id for the '<em><b>Meta Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE__META_INFO = ABSTRACT_ENTITY__META_INFO;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE__VARIABLES = ABSTRACT_ENTITY__VARIABLES;

  /**
   * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE__CONSTRUCTORS = ABSTRACT_ENTITY__CONSTRUCTORS;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE__METHODS = ABSTRACT_ENTITY__METHODS;

  /**
   * The feature id for the '<em><b>Id Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE__ID_TYPE = ABSTRACT_ENTITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_FEATURE_COUNT = ABSTRACT_ENTITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractMethodImpl <em>Abstract Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractMethodImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getAbstractMethod()
   * @generated
   */
  int ABSTRACT_METHOD = 18;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_METHOD__DOC = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_METHOD__NAME = 1;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_METHOD__VARIABLES = 2;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_METHOD__CONSTRAINTS = 3;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_METHOD__EVENTS = 4;

  /**
   * The number of structural features of the '<em>Abstract Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_METHOD_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ConstructorImpl <em>Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ConstructorImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getConstructor()
   * @generated
   */
  int CONSTRUCTOR = 19;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__DOC = ABSTRACT_METHOD__DOC;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__NAME = ABSTRACT_METHOD__NAME;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__VARIABLES = ABSTRACT_METHOD__VARIABLES;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__CONSTRAINTS = ABSTRACT_METHOD__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__EVENTS = ABSTRACT_METHOD__EVENTS;

  /**
   * The number of structural features of the '<em>Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_FEATURE_COUNT = ABSTRACT_METHOD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.MethodImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 20;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__DOC = ABSTRACT_METHOD__DOC;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = ABSTRACT_METHOD__NAME;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__VARIABLES = ABSTRACT_METHOD__VARIABLES;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__CONSTRAINTS = ABSTRACT_METHOD__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__EVENTS = ABSTRACT_METHOD__EVENTS;

  /**
   * The feature id for the '<em><b>Ref Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__REF_METHOD = ABSTRACT_METHOD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = ABSTRACT_METHOD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.EventImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 21;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__DOC = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = 1;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__VARIABLES = 2;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.TypeMetaInfoImpl <em>Type Meta Info</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.TypeMetaInfoImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getTypeMetaInfo()
   * @generated
   */
  int TYPE_META_INFO = 22;

  /**
   * The feature id for the '<em><b>Slabel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_META_INFO__SLABEL = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_META_INFO__LABEL = 1;

  /**
   * The feature id for the '<em><b>Tooltipp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_META_INFO__TOOLTIPP = 2;

  /**
   * The feature id for the '<em><b>Prompt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_META_INFO__PROMPT = 3;

  /**
   * The feature id for the '<em><b>Examples</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_META_INFO__EXAMPLES = 4;

  /**
   * The number of structural features of the '<em>Type Meta Info</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_META_INFO_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.VariableImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 23;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__DOC = 0;

  /**
   * The feature id for the '<em><b>Nullable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NULLABLE = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__TYPE = 2;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__MULTIPLICITY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = 4;

  /**
   * The feature id for the '<em><b>Invariants</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__INVARIANTS = 5;

  /**
   * The feature id for the '<em><b>Overridden</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__OVERRIDDEN = 6;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ConstraintsImpl <em>Constraints</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ConstraintsImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getConstraints()
   * @generated
   */
  int CONSTRAINTS = 24;

  /**
   * The feature id for the '<em><b>Calls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINTS__CALLS = 0;

  /**
   * The number of structural features of the '<em>Constraints</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.InvariantsImpl <em>Invariants</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.InvariantsImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getInvariants()
   * @generated
   */
  int INVARIANTS = 25;

  /**
   * The feature id for the '<em><b>Calls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANTS__CALLS = 0;

  /**
   * The number of structural features of the '<em>Invariants</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.OverriddenTypeMetaInfoImpl <em>Overridden Type Meta Info</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.OverriddenTypeMetaInfoImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getOverriddenTypeMetaInfo()
   * @generated
   */
  int OVERRIDDEN_TYPE_META_INFO = 26;

  /**
   * The feature id for the '<em><b>Meta Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OVERRIDDEN_TYPE_META_INFO__META_INFO = 0;

  /**
   * The number of structural features of the '<em>Overridden Type Meta Info</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OVERRIDDEN_TYPE_META_INFO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ConstraintCallImpl <em>Constraint Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ConstraintCallImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getConstraintCall()
   * @generated
   */
  int CONSTRAINT_CALL = 27;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_CALL__CONSTRAINT = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_CALL__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Constraint Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_CALL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.LiteralImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 28;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__VALUE = 0;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.BooleanLiteralImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 29;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.NullLiteralImpl <em>Null Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.NullLiteralImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getNullLiteral()
   * @generated
   */
  int NULL_LITERAL = 30;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL__VALUE = LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Null Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.NumberLiteralImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 31;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE = LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.StringLiteralImpl
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 32;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Model</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainModel
   * @generated
   */
  EClass getDomainModel();

  /**
   * Returns the meta object for the containment reference '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainModel#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namespace</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainModel#getNamespace()
   * @see #getDomainModel()
   * @generated
   */
  EReference getDomainModel_Namespace();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Namespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Namespace
   * @generated
   */
  EClass getNamespace();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Namespace#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Namespace#getName()
   * @see #getNamespace()
   * @generated
   */
  EAttribute getNamespace_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Namespace#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Namespace#getImports()
   * @see #getNamespace()
   * @generated
   */
  EReference getNamespace_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Namespace#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Namespace#getElements()
   * @see #getNamespace()
   * @generated
   */
  EReference getNamespace_Elements();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractElement#getName()
   * @see #getAbstractElement()
   * @generated
   */
  EAttribute getAbstractElement_Name();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO <em>Abstract VO</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract VO</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO
   * @generated
   */
  EClass getAbstractVO();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Doc</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO#getDoc()
   * @see #getAbstractVO()
   * @generated
   */
  EAttribute getAbstractVO_Doc();

  /**
   * Returns the meta object for the containment reference '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO#getMetaInfo <em>Meta Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Meta Info</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO#getMetaInfo()
   * @see #getAbstractVO()
   * @generated
   */
  EReference getAbstractVO_MetaInfo();

  /**
   * Returns the meta object for the containment reference list '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO#getVariables()
   * @see #getAbstractVO()
   * @generated
   */
  EReference getAbstractVO_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO#getConstructors <em>Constructors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constructors</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO#getConstructors()
   * @see #getAbstractVO()
   * @generated
   */
  EReference getAbstractVO_Constructors();

  /**
   * Returns the meta object for the containment reference list '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO#getMethods()
   * @see #getAbstractVO()
   * @generated
   */
  EReference getAbstractVO_Methods();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntityId <em>Abstract Entity Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Entity Id</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntityId
   * @generated
   */
  EClass getAbstractEntityId();

  /**
   * Returns the meta object for the reference '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntityId#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Base</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntityId#getBase()
   * @see #getAbstractEntityId()
   * @generated
   */
  EReference getAbstractEntityId_Base();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity <em>Abstract Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Entity</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity
   * @generated
   */
  EClass getAbstractEntity();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Doc</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity#getDoc()
   * @see #getAbstractEntity()
   * @generated
   */
  EAttribute getAbstractEntity_Doc();

  /**
   * Returns the meta object for the containment reference '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity#getMetaInfo <em>Meta Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Meta Info</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity#getMetaInfo()
   * @see #getAbstractEntity()
   * @generated
   */
  EReference getAbstractEntity_MetaInfo();

  /**
   * Returns the meta object for the containment reference list '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity#getVariables()
   * @see #getAbstractEntity()
   * @generated
   */
  EReference getAbstractEntity_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity#getConstructors <em>Constructors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constructors</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity#getConstructors()
   * @see #getAbstractEntity()
   * @generated
   */
  EReference getAbstractEntity_Constructors();

  /**
   * Returns the meta object for the containment reference list '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity#getMethods()
   * @see #getAbstractEntity()
   * @generated
   */
  EReference getAbstractEntity_Methods();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintTarget <em>Constraint Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint Target</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintTarget
   * @generated
   */
  EClass getConstraintTarget();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType <em>External Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Type</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType
   * @generated
   */
  EClass getExternalType();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Doc</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint#getDoc()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_Doc();

  /**
   * Returns the meta object for the reference '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint#getTarget()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Target();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint#getException <em>Exception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exception</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint#getException()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_Exception();

  /**
   * Returns the meta object for the containment reference list '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint#getVariables()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Variables();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint#getMessage()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_Message();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.ValueObject <em>Value Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Object</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.ValueObject
   * @generated
   */
  EClass getValueObject();

  /**
   * Returns the meta object for the reference '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.ValueObject#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Base</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.ValueObject#getBase()
   * @see #getValueObject()
   * @generated
   */
  EReference getValueObject_Base();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.EntityId <em>Entity Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Id</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.EntityId
   * @generated
   */
  EClass getEntityId();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AggregateId <em>Aggregate Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aggregate Id</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AggregateId
   * @generated
   */
  EClass getAggregateId();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumObject <em>Enum Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Object</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumObject
   * @generated
   */
  EClass getEnumObject();

  /**
   * Returns the meta object for the containment reference list '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumObject#getInstances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instances</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumObject#getInstances()
   * @see #getEnumObject()
   * @generated
   */
  EReference getEnumObject_Instances();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumInstance <em>Enum Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Instance</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumInstance
   * @generated
   */
  EClass getEnumInstance();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumInstance#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Doc</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumInstance#getDoc()
   * @see #getEnumInstance()
   * @generated
   */
  EAttribute getEnumInstance_Doc();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumInstance#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumInstance#getName()
   * @see #getEnumInstance()
   * @generated
   */
  EAttribute getEnumInstance_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumInstance#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumInstance#getParams()
   * @see #getEnumInstance()
   * @generated
   */
  EReference getEnumInstance_Params();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the reference '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity#getIdType <em>Id Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Id Type</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity#getIdType()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_IdType();

  /**
   * Returns the meta object for the reference '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Root</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity#getRoot()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Root();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate <em>Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aggregate</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate
   * @generated
   */
  EClass getAggregate();

  /**
   * Returns the meta object for the reference '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate#getIdType <em>Id Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Id Type</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate#getIdType()
   * @see #getAggregate()
   * @generated
   */
  EReference getAggregate_IdType();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod <em>Abstract Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Method</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod
   * @generated
   */
  EClass getAbstractMethod();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Doc</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod#getDoc()
   * @see #getAbstractMethod()
   * @generated
   */
  EAttribute getAbstractMethod_Doc();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod#getName()
   * @see #getAbstractMethod()
   * @generated
   */
  EAttribute getAbstractMethod_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod#getVariables()
   * @see #getAbstractMethod()
   * @generated
   */
  EReference getAbstractMethod_Variables();

  /**
   * Returns the meta object for the containment reference '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraints</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod#getConstraints()
   * @see #getAbstractMethod()
   * @generated
   */
  EReference getAbstractMethod_Constraints();

  /**
   * Returns the meta object for the containment reference list '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod#getEvents()
   * @see #getAbstractMethod()
   * @generated
   */
  EReference getAbstractMethod_Events();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Constructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Constructor
   * @generated
   */
  EClass getConstructor();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the reference '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Method#getRefMethod <em>Ref Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Method</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Method#getRefMethod()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_RefMethod();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Event#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Doc</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Event#getDoc()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Doc();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Event#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Event#getName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Event#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Event#getVariables()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Variables();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo <em>Type Meta Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Meta Info</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo
   * @generated
   */
  EClass getTypeMetaInfo();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo#getSlabel <em>Slabel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Slabel</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo#getSlabel()
   * @see #getTypeMetaInfo()
   * @generated
   */
  EAttribute getTypeMetaInfo_Slabel();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo#getLabel()
   * @see #getTypeMetaInfo()
   * @generated
   */
  EAttribute getTypeMetaInfo_Label();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo#getTooltipp <em>Tooltipp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tooltipp</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo#getTooltipp()
   * @see #getTypeMetaInfo()
   * @generated
   */
  EAttribute getTypeMetaInfo_Tooltipp();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo#getPrompt <em>Prompt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prompt</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo#getPrompt()
   * @see #getTypeMetaInfo()
   * @generated
   */
  EAttribute getTypeMetaInfo_Prompt();

  /**
   * Returns the meta object for the attribute list '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo#getExamples <em>Examples</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Examples</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo#getExamples()
   * @see #getTypeMetaInfo()
   * @generated
   */
  EAttribute getTypeMetaInfo_Examples();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Doc</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable#getDoc()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Doc();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable#getNullable <em>Nullable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nullable</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable#getNullable()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Nullable();

  /**
   * Returns the meta object for the reference '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable#getType()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Type();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable#getMultiplicity()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Multiplicity();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable#getInvariants <em>Invariants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Invariants</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable#getInvariants()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Invariants();

  /**
   * Returns the meta object for the containment reference '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable#getOverridden <em>Overridden</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Overridden</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable#getOverridden()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Overridden();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraints</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraints
   * @generated
   */
  EClass getConstraints();

  /**
   * Returns the meta object for the containment reference list '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraints#getCalls <em>Calls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Calls</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraints#getCalls()
   * @see #getConstraints()
   * @generated
   */
  EReference getConstraints_Calls();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Invariants <em>Invariants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Invariants</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Invariants
   * @generated
   */
  EClass getInvariants();

  /**
   * Returns the meta object for the containment reference list '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Invariants#getCalls <em>Calls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Calls</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Invariants#getCalls()
   * @see #getInvariants()
   * @generated
   */
  EReference getInvariants_Calls();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.OverriddenTypeMetaInfo <em>Overridden Type Meta Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Overridden Type Meta Info</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.OverriddenTypeMetaInfo
   * @generated
   */
  EClass getOverriddenTypeMetaInfo();

  /**
   * Returns the meta object for the containment reference '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.OverriddenTypeMetaInfo#getMetaInfo <em>Meta Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Meta Info</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.OverriddenTypeMetaInfo#getMetaInfo()
   * @see #getOverriddenTypeMetaInfo()
   * @generated
   */
  EReference getOverriddenTypeMetaInfo_MetaInfo();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintCall <em>Constraint Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint Call</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintCall
   * @generated
   */
  EClass getConstraintCall();

  /**
   * Returns the meta object for the reference '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintCall#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Constraint</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintCall#getConstraint()
   * @see #getConstraintCall()
   * @generated
   */
  EReference getConstraintCall_Constraint();

  /**
   * Returns the meta object for the containment reference list '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintCall#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintCall#getParams()
   * @see #getConstraintCall()
   * @generated
   */
  EReference getConstraintCall_Params();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Literal#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Literal#getValue()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Literal</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.NullLiteral
   * @generated
   */
  EClass getNullLiteral();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DomainDrivenDesignDslFactory getDomainDrivenDesignDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainModelImpl <em>Domain Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainModelImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getDomainModel()
     * @generated
     */
    EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

    /**
     * The meta object literal for the '<em><b>Namespace</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_MODEL__NAMESPACE = eINSTANCE.getDomainModel_Namespace();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.NamespaceImpl <em>Namespace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.NamespaceImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getNamespace()
     * @generated
     */
    EClass NAMESPACE = eINSTANCE.getNamespace();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMESPACE__NAME = eINSTANCE.getNamespace_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE__IMPORTS = eINSTANCE.getNamespace_Imports();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE__ELEMENTS = eINSTANCE.getNamespace_Elements();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ImportImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractElementImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ELEMENT__NAME = eINSTANCE.getAbstractElement_Name();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.TypeImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractVOImpl <em>Abstract VO</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractVOImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getAbstractVO()
     * @generated
     */
    EClass ABSTRACT_VO = eINSTANCE.getAbstractVO();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_VO__DOC = eINSTANCE.getAbstractVO_Doc();

    /**
     * The meta object literal for the '<em><b>Meta Info</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_VO__META_INFO = eINSTANCE.getAbstractVO_MetaInfo();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_VO__VARIABLES = eINSTANCE.getAbstractVO_Variables();

    /**
     * The meta object literal for the '<em><b>Constructors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_VO__CONSTRUCTORS = eINSTANCE.getAbstractVO_Constructors();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_VO__METHODS = eINSTANCE.getAbstractVO_Methods();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractEntityIdImpl <em>Abstract Entity Id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractEntityIdImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getAbstractEntityId()
     * @generated
     */
    EClass ABSTRACT_ENTITY_ID = eINSTANCE.getAbstractEntityId();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_ENTITY_ID__BASE = eINSTANCE.getAbstractEntityId_Base();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractEntityImpl <em>Abstract Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractEntityImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getAbstractEntity()
     * @generated
     */
    EClass ABSTRACT_ENTITY = eINSTANCE.getAbstractEntity();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ENTITY__DOC = eINSTANCE.getAbstractEntity_Doc();

    /**
     * The meta object literal for the '<em><b>Meta Info</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_ENTITY__META_INFO = eINSTANCE.getAbstractEntity_MetaInfo();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_ENTITY__VARIABLES = eINSTANCE.getAbstractEntity_Variables();

    /**
     * The meta object literal for the '<em><b>Constructors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_ENTITY__CONSTRUCTORS = eINSTANCE.getAbstractEntity_Constructors();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_ENTITY__METHODS = eINSTANCE.getAbstractEntity_Methods();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ConstraintTargetImpl <em>Constraint Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ConstraintTargetImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getConstraintTarget()
     * @generated
     */
    EClass CONSTRAINT_TARGET = eINSTANCE.getConstraintTarget();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ExternalTypeImpl <em>External Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ExternalTypeImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getExternalType()
     * @generated
     */
    EClass EXTERNAL_TYPE = eINSTANCE.getExternalType();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ConstraintImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__DOC = eINSTANCE.getConstraint_Doc();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__TARGET = eINSTANCE.getConstraint_Target();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__EXCEPTION = eINSTANCE.getConstraint_Exception();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__VARIABLES = eINSTANCE.getConstraint_Variables();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__MESSAGE = eINSTANCE.getConstraint_Message();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ValueObjectImpl <em>Value Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ValueObjectImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getValueObject()
     * @generated
     */
    EClass VALUE_OBJECT = eINSTANCE.getValueObject();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_OBJECT__BASE = eINSTANCE.getValueObject_Base();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.EntityIdImpl <em>Entity Id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.EntityIdImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getEntityId()
     * @generated
     */
    EClass ENTITY_ID = eINSTANCE.getEntityId();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AggregateIdImpl <em>Aggregate Id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AggregateIdImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getAggregateId()
     * @generated
     */
    EClass AGGREGATE_ID = eINSTANCE.getAggregateId();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.EnumObjectImpl <em>Enum Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.EnumObjectImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getEnumObject()
     * @generated
     */
    EClass ENUM_OBJECT = eINSTANCE.getEnumObject();

    /**
     * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_OBJECT__INSTANCES = eINSTANCE.getEnumObject_Instances();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.EnumInstanceImpl <em>Enum Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.EnumInstanceImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getEnumInstance()
     * @generated
     */
    EClass ENUM_INSTANCE = eINSTANCE.getEnumInstance();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_INSTANCE__DOC = eINSTANCE.getEnumInstance_Doc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_INSTANCE__NAME = eINSTANCE.getEnumInstance_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_INSTANCE__PARAMS = eINSTANCE.getEnumInstance_Params();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.EntityImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Id Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ID_TYPE = eINSTANCE.getEntity_IdType();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ROOT = eINSTANCE.getEntity_Root();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AggregateImpl <em>Aggregate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AggregateImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getAggregate()
     * @generated
     */
    EClass AGGREGATE = eINSTANCE.getAggregate();

    /**
     * The meta object literal for the '<em><b>Id Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGGREGATE__ID_TYPE = eINSTANCE.getAggregate_IdType();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractMethodImpl <em>Abstract Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractMethodImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getAbstractMethod()
     * @generated
     */
    EClass ABSTRACT_METHOD = eINSTANCE.getAbstractMethod();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_METHOD__DOC = eINSTANCE.getAbstractMethod_Doc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_METHOD__NAME = eINSTANCE.getAbstractMethod_Name();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_METHOD__VARIABLES = eINSTANCE.getAbstractMethod_Variables();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_METHOD__CONSTRAINTS = eINSTANCE.getAbstractMethod_Constraints();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_METHOD__EVENTS = eINSTANCE.getAbstractMethod_Events();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ConstructorImpl <em>Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ConstructorImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getConstructor()
     * @generated
     */
    EClass CONSTRUCTOR = eINSTANCE.getConstructor();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.MethodImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Ref Method</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__REF_METHOD = eINSTANCE.getMethod_RefMethod();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.EventImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__DOC = eINSTANCE.getEvent_Doc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__VARIABLES = eINSTANCE.getEvent_Variables();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.TypeMetaInfoImpl <em>Type Meta Info</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.TypeMetaInfoImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getTypeMetaInfo()
     * @generated
     */
    EClass TYPE_META_INFO = eINSTANCE.getTypeMetaInfo();

    /**
     * The meta object literal for the '<em><b>Slabel</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_META_INFO__SLABEL = eINSTANCE.getTypeMetaInfo_Slabel();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_META_INFO__LABEL = eINSTANCE.getTypeMetaInfo_Label();

    /**
     * The meta object literal for the '<em><b>Tooltipp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_META_INFO__TOOLTIPP = eINSTANCE.getTypeMetaInfo_Tooltipp();

    /**
     * The meta object literal for the '<em><b>Prompt</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_META_INFO__PROMPT = eINSTANCE.getTypeMetaInfo_Prompt();

    /**
     * The meta object literal for the '<em><b>Examples</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_META_INFO__EXAMPLES = eINSTANCE.getTypeMetaInfo_Examples();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.VariableImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__DOC = eINSTANCE.getVariable_Doc();

    /**
     * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NULLABLE = eINSTANCE.getVariable_Nullable();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__MULTIPLICITY = eINSTANCE.getVariable_Multiplicity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '<em><b>Invariants</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__INVARIANTS = eINSTANCE.getVariable_Invariants();

    /**
     * The meta object literal for the '<em><b>Overridden</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__OVERRIDDEN = eINSTANCE.getVariable_Overridden();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ConstraintsImpl <em>Constraints</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ConstraintsImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getConstraints()
     * @generated
     */
    EClass CONSTRAINTS = eINSTANCE.getConstraints();

    /**
     * The meta object literal for the '<em><b>Calls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINTS__CALLS = eINSTANCE.getConstraints_Calls();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.InvariantsImpl <em>Invariants</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.InvariantsImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getInvariants()
     * @generated
     */
    EClass INVARIANTS = eINSTANCE.getInvariants();

    /**
     * The meta object literal for the '<em><b>Calls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVARIANTS__CALLS = eINSTANCE.getInvariants_Calls();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.OverriddenTypeMetaInfoImpl <em>Overridden Type Meta Info</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.OverriddenTypeMetaInfoImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getOverriddenTypeMetaInfo()
     * @generated
     */
    EClass OVERRIDDEN_TYPE_META_INFO = eINSTANCE.getOverriddenTypeMetaInfo();

    /**
     * The meta object literal for the '<em><b>Meta Info</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OVERRIDDEN_TYPE_META_INFO__META_INFO = eINSTANCE.getOverriddenTypeMetaInfo_MetaInfo();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ConstraintCallImpl <em>Constraint Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ConstraintCallImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getConstraintCall()
     * @generated
     */
    EClass CONSTRAINT_CALL = eINSTANCE.getConstraintCall();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT_CALL__CONSTRAINT = eINSTANCE.getConstraintCall_Constraint();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT_CALL__PARAMS = eINSTANCE.getConstraintCall_Params();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.LiteralImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.BooleanLiteralImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.NullLiteralImpl <em>Null Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.NullLiteralImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getNullLiteral()
     * @generated
     */
    EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.NumberLiteralImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.StringLiteralImpl
     * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.DomainDrivenDesignDslPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

  }

} //DomainDrivenDesignDslPackage
