/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Parameter#getPreconditions <em>Preconditions</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Parameter#getBusinessRules <em>Business Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Variable
{
  /**
   * Returns the value of the '<em><b>Preconditions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preconditions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preconditions</em>' containment reference.
   * @see #setPreconditions(Preconditions)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getParameter_Preconditions()
   * @model containment="true"
   * @generated
   */
  Preconditions getPreconditions();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Parameter#getPreconditions <em>Preconditions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preconditions</em>' containment reference.
   * @see #getPreconditions()
   * @generated
   */
  void setPreconditions(Preconditions value);

  /**
   * Returns the value of the '<em><b>Business Rules</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Business Rules</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Business Rules</em>' containment reference.
   * @see #setBusinessRules(BusinessRules)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getParameter_BusinessRules()
   * @model containment="true"
   * @generated
   */
  BusinessRules getBusinessRules();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Parameter#getBusinessRules <em>Business Rules</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Business Rules</em>' containment reference.
   * @see #getBusinessRules()
   * @generated
   */
  void setBusinessRules(BusinessRules value);

} // Parameter
