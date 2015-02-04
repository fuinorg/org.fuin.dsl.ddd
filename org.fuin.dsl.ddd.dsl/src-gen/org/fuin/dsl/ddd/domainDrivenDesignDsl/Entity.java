/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity#getIdType <em>Id Type</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity#getRoot <em>Root</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity#getEntityId <em>Entity Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends AbstractEntity
{
  /**
   * Returns the value of the '<em><b>Id Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id Type</em>' reference.
   * @see #setIdType(EntityId)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getEntity_IdType()
   * @model
   * @generated
   */
  EntityId getIdType();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity#getIdType <em>Id Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id Type</em>' reference.
   * @see #getIdType()
   * @generated
   */
  void setIdType(EntityId value);

  /**
   * Returns the value of the '<em><b>Root</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' reference.
   * @see #setRoot(Aggregate)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getEntity_Root()
   * @model
   * @generated
   */
  Aggregate getRoot();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity#getRoot <em>Root</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root</em>' reference.
   * @see #getRoot()
   * @generated
   */
  void setRoot(Aggregate value);

  /**
   * Returns the value of the '<em><b>Entity Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Id</em>' containment reference.
   * @see #setEntityId(EntityId)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getEntity_EntityId()
   * @model containment="true"
   * @generated
   */
  EntityId getEntityId();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity#getEntityId <em>Entity Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity Id</em>' containment reference.
   * @see #getEntityId()
   * @generated
   */
  void setEntityId(EntityId value);

} // Entity
