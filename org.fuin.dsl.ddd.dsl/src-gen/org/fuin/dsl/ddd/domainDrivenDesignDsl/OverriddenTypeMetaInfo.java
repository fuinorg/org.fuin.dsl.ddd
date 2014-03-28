/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Overridden Type Meta Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.OverriddenTypeMetaInfo#getMetaInfo <em>Meta Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getOverriddenTypeMetaInfo()
 * @model
 * @generated
 */
public interface OverriddenTypeMetaInfo extends EObject
{
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
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getOverriddenTypeMetaInfo_MetaInfo()
   * @model containment="true"
   * @generated
   */
  TypeMetaInfo getMetaInfo();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.OverriddenTypeMetaInfo#getMetaInfo <em>Meta Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta Info</em>' containment reference.
   * @see #getMetaInfo()
   * @generated
   */
  void setMetaInfo(TypeMetaInfo value);

} // OverriddenTypeMetaInfo
