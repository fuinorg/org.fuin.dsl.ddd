/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.InternalType#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.InternalType#getMetaInfo <em>Meta Info</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.InternalType#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getInternalType()
 * @model
 * @generated
 */
public interface InternalType extends Type
{
  /**
   * Returns the value of the '<em><b>Invariants</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invariants</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Invariants</em>' containment reference.
   * @see #setInvariants(Invariants)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getInternalType_Invariants()
   * @model containment="true"
   * @generated
   */
  Invariants getInvariants();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.InternalType#getInvariants <em>Invariants</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Invariants</em>' containment reference.
   * @see #getInvariants()
   * @generated
   */
  void setInvariants(Invariants value);

  /**
   * Returns the value of the '<em><b>Meta Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta Info</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Info</em>' containment reference.
   * @see #setMetaInfo(TypeMetaInfo)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getInternalType_MetaInfo()
   * @model containment="true"
   * @generated
   */
  TypeMetaInfo getMetaInfo();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.InternalType#getMetaInfo <em>Meta Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta Info</em>' containment reference.
   * @see #getMetaInfo()
   * @generated
   */
  void setMetaInfo(TypeMetaInfo value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getInternalType_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

} // InternalType
