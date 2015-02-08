/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType#getElement <em>Element</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType#getGenerics <em>Generics</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getExternalType()
 * @model
 * @generated
 */
public interface ExternalType extends Type
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' attribute.
   * @see #setElement(String)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getExternalType_Element()
   * @model
   * @generated
   */
  String getElement();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType#getElement <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' attribute.
   * @see #getElement()
   * @generated
   */
  void setElement(String value);

  /**
   * Returns the value of the '<em><b>Generics</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generics</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generics</em>' attribute.
   * @see #setGenerics(int)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getExternalType_Generics()
   * @model
   * @generated
   */
  int getGenerics();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType#getGenerics <em>Generics</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generics</em>' attribute.
   * @see #getGenerics()
   * @generated
   */
  void setGenerics(int value);

} // ExternalType
