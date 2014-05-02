/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Meta Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo#getSlabel <em>Slabel</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo#getLabel <em>Label</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo#getPrompt <em>Prompt</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo#getExamples <em>Examples</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getTypeMetaInfo()
 * @model
 * @generated
 */
public interface TypeMetaInfo extends EObject
{
  /**
   * Returns the value of the '<em><b>Slabel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Slabel</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Slabel</em>' attribute.
   * @see #setSlabel(String)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getTypeMetaInfo_Slabel()
   * @model
   * @generated
   */
  String getSlabel();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo#getSlabel <em>Slabel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Slabel</em>' attribute.
   * @see #getSlabel()
   * @generated
   */
  void setSlabel(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getTypeMetaInfo_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Tooltip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tooltip</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tooltip</em>' attribute.
   * @see #setTooltip(String)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getTypeMetaInfo_Tooltip()
   * @model
   * @generated
   */
  String getTooltip();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo#getTooltip <em>Tooltip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tooltip</em>' attribute.
   * @see #getTooltip()
   * @generated
   */
  void setTooltip(String value);

  /**
   * Returns the value of the '<em><b>Prompt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prompt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prompt</em>' attribute.
   * @see #setPrompt(String)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getTypeMetaInfo_Prompt()
   * @model
   * @generated
   */
  String getPrompt();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo#getPrompt <em>Prompt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prompt</em>' attribute.
   * @see #getPrompt()
   * @generated
   */
  void setPrompt(String value);

  /**
   * Returns the value of the '<em><b>Examples</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Examples</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Examples</em>' attribute list.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getTypeMetaInfo_Examples()
   * @model unique="false"
   * @generated
   */
  EList<String> getExamples();

} // TypeMetaInfo
