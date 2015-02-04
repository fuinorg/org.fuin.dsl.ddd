/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AggregateId#getAggregate <em>Aggregate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getAggregateId()
 * @model
 * @generated
 */
public interface AggregateId extends AbstractEntityId
{
  /**
   * Returns the value of the '<em><b>Aggregate</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregate</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggregate</em>' reference.
   * @see #setAggregate(Aggregate)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getAggregateId_Aggregate()
   * @model
   * @generated
   */
  Aggregate getAggregate();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AggregateId#getAggregate <em>Aggregate</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aggregate</em>' reference.
   * @see #getAggregate()
   * @generated
   */
  void setAggregate(Aggregate value);

} // AggregateId
