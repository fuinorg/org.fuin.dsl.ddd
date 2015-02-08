/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ExternalTypeImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ExternalTypeImpl#getGenerics <em>Generics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalTypeImpl extends TypeImpl implements ExternalType
{
  /**
   * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected static final String ELEMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected String element = ELEMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getGenerics() <em>Generics</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenerics()
   * @generated
   * @ordered
   */
  protected static final int GENERICS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getGenerics() <em>Generics</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenerics()
   * @generated
   * @ordered
   */
  protected int generics = GENERICS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExternalTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DomainDrivenDesignDslPackage.Literals.EXTERNAL_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(String newElement)
  {
    String oldElement = element;
    element = newElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.EXTERNAL_TYPE__ELEMENT, oldElement, element));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getGenerics()
  {
    return generics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenerics(int newGenerics)
  {
    int oldGenerics = generics;
    generics = newGenerics;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.EXTERNAL_TYPE__GENERICS, oldGenerics, generics));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DomainDrivenDesignDslPackage.EXTERNAL_TYPE__ELEMENT:
        return getElement();
      case DomainDrivenDesignDslPackage.EXTERNAL_TYPE__GENERICS:
        return getGenerics();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainDrivenDesignDslPackage.EXTERNAL_TYPE__ELEMENT:
        setElement((String)newValue);
        return;
      case DomainDrivenDesignDslPackage.EXTERNAL_TYPE__GENERICS:
        setGenerics((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DomainDrivenDesignDslPackage.EXTERNAL_TYPE__ELEMENT:
        setElement(ELEMENT_EDEFAULT);
        return;
      case DomainDrivenDesignDslPackage.EXTERNAL_TYPE__GENERICS:
        setGenerics(GENERICS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DomainDrivenDesignDslPackage.EXTERNAL_TYPE__ELEMENT:
        return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
      case DomainDrivenDesignDslPackage.EXTERNAL_TYPE__GENERICS:
        return generics != GENERICS_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (element: ");
    result.append(element);
    result.append(", generics: ");
    result.append(generics);
    result.append(')');
    return result.toString();
  }

} //ExternalTypeImpl
