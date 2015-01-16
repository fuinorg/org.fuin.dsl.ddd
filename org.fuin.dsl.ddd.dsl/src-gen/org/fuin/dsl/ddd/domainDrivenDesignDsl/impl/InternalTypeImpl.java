/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.fuin.dsl.ddd.domainDrivenDesignDsl.Attribute;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.InternalType;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Invariants;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.InternalTypeImpl#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.InternalTypeImpl#getMetaInfo <em>Meta Info</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.InternalTypeImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InternalTypeImpl extends TypeImpl implements InternalType
{
  /**
   * The cached value of the '{@link #getInvariants() <em>Invariants</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvariants()
   * @generated
   * @ordered
   */
  protected Invariants invariants;

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
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InternalTypeImpl()
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
    return DomainDrivenDesignDslPackage.Literals.INTERNAL_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Invariants getInvariants()
  {
    return invariants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInvariants(Invariants newInvariants, NotificationChain msgs)
  {
    Invariants oldInvariants = invariants;
    invariants = newInvariants;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.INTERNAL_TYPE__INVARIANTS, oldInvariants, newInvariants);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInvariants(Invariants newInvariants)
  {
    if (newInvariants != invariants)
    {
      NotificationChain msgs = null;
      if (invariants != null)
        msgs = ((InternalEObject)invariants).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.INTERNAL_TYPE__INVARIANTS, null, msgs);
      if (newInvariants != null)
        msgs = ((InternalEObject)newInvariants).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.INTERNAL_TYPE__INVARIANTS, null, msgs);
      msgs = basicSetInvariants(newInvariants, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.INTERNAL_TYPE__INVARIANTS, newInvariants, newInvariants));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.INTERNAL_TYPE__META_INFO, oldMetaInfo, newMetaInfo);
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
        msgs = ((InternalEObject)metaInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.INTERNAL_TYPE__META_INFO, null, msgs);
      if (newMetaInfo != null)
        msgs = ((InternalEObject)newMetaInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.INTERNAL_TYPE__META_INFO, null, msgs);
      msgs = basicSetMetaInfo(newMetaInfo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.INTERNAL_TYPE__META_INFO, newMetaInfo, newMetaInfo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, DomainDrivenDesignDslPackage.INTERNAL_TYPE__ATTRIBUTES);
    }
    return attributes;
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
      case DomainDrivenDesignDslPackage.INTERNAL_TYPE__INVARIANTS:
        return basicSetInvariants(null, msgs);
      case DomainDrivenDesignDslPackage.INTERNAL_TYPE__META_INFO:
        return basicSetMetaInfo(null, msgs);
      case DomainDrivenDesignDslPackage.INTERNAL_TYPE__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
      case DomainDrivenDesignDslPackage.INTERNAL_TYPE__INVARIANTS:
        return getInvariants();
      case DomainDrivenDesignDslPackage.INTERNAL_TYPE__META_INFO:
        return getMetaInfo();
      case DomainDrivenDesignDslPackage.INTERNAL_TYPE__ATTRIBUTES:
        return getAttributes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainDrivenDesignDslPackage.INTERNAL_TYPE__INVARIANTS:
        setInvariants((Invariants)newValue);
        return;
      case DomainDrivenDesignDslPackage.INTERNAL_TYPE__META_INFO:
        setMetaInfo((TypeMetaInfo)newValue);
        return;
      case DomainDrivenDesignDslPackage.INTERNAL_TYPE__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
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
      case DomainDrivenDesignDslPackage.INTERNAL_TYPE__INVARIANTS:
        setInvariants((Invariants)null);
        return;
      case DomainDrivenDesignDslPackage.INTERNAL_TYPE__META_INFO:
        setMetaInfo((TypeMetaInfo)null);
        return;
      case DomainDrivenDesignDslPackage.INTERNAL_TYPE__ATTRIBUTES:
        getAttributes().clear();
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
      case DomainDrivenDesignDslPackage.INTERNAL_TYPE__INVARIANTS:
        return invariants != null;
      case DomainDrivenDesignDslPackage.INTERNAL_TYPE__META_INFO:
        return metaInfo != null;
      case DomainDrivenDesignDslPackage.INTERNAL_TYPE__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InternalTypeImpl
