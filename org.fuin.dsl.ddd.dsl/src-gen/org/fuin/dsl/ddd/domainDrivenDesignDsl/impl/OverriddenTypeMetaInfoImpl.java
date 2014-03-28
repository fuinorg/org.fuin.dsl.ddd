/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.OverriddenTypeMetaInfo;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Overridden Type Meta Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.OverriddenTypeMetaInfoImpl#getMetaInfo <em>Meta Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OverriddenTypeMetaInfoImpl extends MinimalEObjectImpl.Container implements OverriddenTypeMetaInfo
{
  /**
   * The cached value of the '{@link #getMetaInfo() <em>Meta Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetaInfo()
   * @generated
   * @ordered
   */
  protected TypeMetaInfo metaInfo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OverriddenTypeMetaInfoImpl()
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
    return DomainDrivenDesignDslPackage.Literals.OVERRIDDEN_TYPE_META_INFO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeMetaInfo getMetaInfo()
  {
    return metaInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMetaInfo(TypeMetaInfo newMetaInfo, NotificationChain msgs)
  {
    TypeMetaInfo oldMetaInfo = metaInfo;
    metaInfo = newMetaInfo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.OVERRIDDEN_TYPE_META_INFO__META_INFO, oldMetaInfo, newMetaInfo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetaInfo(TypeMetaInfo newMetaInfo)
  {
    if (newMetaInfo != metaInfo)
    {
      NotificationChain msgs = null;
      if (metaInfo != null)
        msgs = ((InternalEObject)metaInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.OVERRIDDEN_TYPE_META_INFO__META_INFO, null, msgs);
      if (newMetaInfo != null)
        msgs = ((InternalEObject)newMetaInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.OVERRIDDEN_TYPE_META_INFO__META_INFO, null, msgs);
      msgs = basicSetMetaInfo(newMetaInfo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.OVERRIDDEN_TYPE_META_INFO__META_INFO, newMetaInfo, newMetaInfo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainDrivenDesignDslPackage.OVERRIDDEN_TYPE_META_INFO__META_INFO:
        return basicSetMetaInfo(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DomainDrivenDesignDslPackage.OVERRIDDEN_TYPE_META_INFO__META_INFO:
        return getMetaInfo();
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
      case DomainDrivenDesignDslPackage.OVERRIDDEN_TYPE_META_INFO__META_INFO:
        setMetaInfo((TypeMetaInfo)newValue);
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
      case DomainDrivenDesignDslPackage.OVERRIDDEN_TYPE_META_INFO__META_INFO:
        setMetaInfo((TypeMetaInfo)null);
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
      case DomainDrivenDesignDslPackage.OVERRIDDEN_TYPE_META_INFO__META_INFO:
        return metaInfo != null;
    }
    return super.eIsSet(featureID);
  }

} //OverriddenTypeMetaInfoImpl
