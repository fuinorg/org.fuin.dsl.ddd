/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.fuin.dsl.ddd.domainDrivenDesignDsl.BusinessRules;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Parameter;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Preconditions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ParameterImpl#getPreconditions <em>Preconditions</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ParameterImpl#getBusinessRules <em>Business Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends VariableImpl implements Parameter
{
  /**
   * The cached value of the '{@link #getPreconditions() <em>Preconditions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreconditions()
   * @generated
   * @ordered
   */
  protected Preconditions preconditions;

  /**
   * The cached value of the '{@link #getBusinessRules() <em>Business Rules</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBusinessRules()
   * @generated
   * @ordered
   */
  protected BusinessRules businessRules;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterImpl()
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
    return DomainDrivenDesignDslPackage.Literals.PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Preconditions getPreconditions()
  {
    return preconditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreconditions(Preconditions newPreconditions, NotificationChain msgs)
  {
    Preconditions oldPreconditions = preconditions;
    preconditions = newPreconditions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.PARAMETER__PRECONDITIONS, oldPreconditions, newPreconditions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreconditions(Preconditions newPreconditions)
  {
    if (newPreconditions != preconditions)
    {
      NotificationChain msgs = null;
      if (preconditions != null)
        msgs = ((InternalEObject)preconditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.PARAMETER__PRECONDITIONS, null, msgs);
      if (newPreconditions != null)
        msgs = ((InternalEObject)newPreconditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.PARAMETER__PRECONDITIONS, null, msgs);
      msgs = basicSetPreconditions(newPreconditions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.PARAMETER__PRECONDITIONS, newPreconditions, newPreconditions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessRules getBusinessRules()
  {
    return businessRules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBusinessRules(BusinessRules newBusinessRules, NotificationChain msgs)
  {
    BusinessRules oldBusinessRules = businessRules;
    businessRules = newBusinessRules;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.PARAMETER__BUSINESS_RULES, oldBusinessRules, newBusinessRules);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBusinessRules(BusinessRules newBusinessRules)
  {
    if (newBusinessRules != businessRules)
    {
      NotificationChain msgs = null;
      if (businessRules != null)
        msgs = ((InternalEObject)businessRules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.PARAMETER__BUSINESS_RULES, null, msgs);
      if (newBusinessRules != null)
        msgs = ((InternalEObject)newBusinessRules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.PARAMETER__BUSINESS_RULES, null, msgs);
      msgs = basicSetBusinessRules(newBusinessRules, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.PARAMETER__BUSINESS_RULES, newBusinessRules, newBusinessRules));
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
      case DomainDrivenDesignDslPackage.PARAMETER__PRECONDITIONS:
        return basicSetPreconditions(null, msgs);
      case DomainDrivenDesignDslPackage.PARAMETER__BUSINESS_RULES:
        return basicSetBusinessRules(null, msgs);
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
      case DomainDrivenDesignDslPackage.PARAMETER__PRECONDITIONS:
        return getPreconditions();
      case DomainDrivenDesignDslPackage.PARAMETER__BUSINESS_RULES:
        return getBusinessRules();
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
      case DomainDrivenDesignDslPackage.PARAMETER__PRECONDITIONS:
        setPreconditions((Preconditions)newValue);
        return;
      case DomainDrivenDesignDslPackage.PARAMETER__BUSINESS_RULES:
        setBusinessRules((BusinessRules)newValue);
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
      case DomainDrivenDesignDslPackage.PARAMETER__PRECONDITIONS:
        setPreconditions((Preconditions)null);
        return;
      case DomainDrivenDesignDslPackage.PARAMETER__BUSINESS_RULES:
        setBusinessRules((BusinessRules)null);
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
      case DomainDrivenDesignDslPackage.PARAMETER__PRECONDITIONS:
        return preconditions != null;
      case DomainDrivenDesignDslPackage.PARAMETER__BUSINESS_RULES:
        return businessRules != null;
    }
    return super.eIsSet(featureID);
  }

} //ParameterImpl
