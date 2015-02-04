/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate#getIdType <em>Id Type</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate#getAggregateId <em>Aggregate Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getAggregate()
 * @model
 * @generated
 */
public interface Aggregate extends AbstractEntity
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
   * @see #setIdType(AggregateId)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getAggregate_IdType()
   * @model
   * @generated
   */
  AggregateId getIdType();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate#getIdType <em>Id Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id Type</em>' reference.
   * @see #getIdType()
   * @generated
   */
  void setIdType(AggregateId value);

  /**
   * Returns the value of the '<em><b>Aggregate Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregate Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggregate Id</em>' containment reference.
   * @see #setAggregateId(AggregateId)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getAggregate_AggregateId()
   * @model containment="true"
   * @generated
   */
  AggregateId getAggregateId();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate#getAggregateId <em>Aggregate Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aggregate Id</em>' containment reference.
   * @see #getAggregateId()
   * @generated
   */
  void setAggregateId(AggregateId value);

} // Aggregate
