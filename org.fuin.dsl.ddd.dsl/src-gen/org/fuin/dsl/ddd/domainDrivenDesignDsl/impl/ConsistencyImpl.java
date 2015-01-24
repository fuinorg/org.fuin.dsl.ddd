/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.fuin.dsl.ddd.domainDrivenDesignDsl.Consistency;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConsistencyLevel;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.WeakConsistency;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consistency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ConsistencyImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ConsistencyImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.ConsistencyImpl#getWeakConsistency <em>Weak Consistency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConsistencyImpl extends MinimalEObjectImpl.Container implements Consistency
{
  /**
   * The default value of the '{@link #getDoc() <em>Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoc()
   * @generated
   * @ordered
   */
  protected static final String DOC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDoc() <em>Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoc()
   * @generated
   * @ordered
   */
  protected String doc = DOC_EDEFAULT;

  /**
   * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected static final ConsistencyLevel LEVEL_EDEFAULT = ConsistencyLevel.WEAK;

  /**
   * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected ConsistencyLevel level = LEVEL_EDEFAULT;

  /**
   * The cached value of the '{@link #getWeakConsistency() <em>Weak Consistency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeakConsistency()
   * @generated
   * @ordered
   */
  protected WeakConsistency weakConsistency;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConsistencyImpl()
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
    return DomainDrivenDesignDslPackage.Literals.CONSISTENCY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDoc()
  {
    return doc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoc(String newDoc)
  {
    String oldDoc = doc;
    doc = newDoc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.CONSISTENCY__DOC, oldDoc, doc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConsistencyLevel getLevel()
  {
    return level;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLevel(ConsistencyLevel newLevel)
  {
    ConsistencyLevel oldLevel = level;
    level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.CONSISTENCY__LEVEL, oldLevel, level));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeakConsistency getWeakConsistency()
  {
    return weakConsistency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWeakConsistency(WeakConsistency newWeakConsistency, NotificationChain msgs)
  {
    WeakConsistency oldWeakConsistency = weakConsistency;
    weakConsistency = newWeakConsistency;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.CONSISTENCY__WEAK_CONSISTENCY, oldWeakConsistency, newWeakConsistency);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeakConsistency(WeakConsistency newWeakConsistency)
  {
    if (newWeakConsistency != weakConsistency)
    {
      NotificationChain msgs = null;
      if (weakConsistency != null)
        msgs = ((InternalEObject)weakConsistency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.CONSISTENCY__WEAK_CONSISTENCY, null, msgs);
      if (newWeakConsistency != null)
        msgs = ((InternalEObject)newWeakConsistency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.CONSISTENCY__WEAK_CONSISTENCY, null, msgs);
      msgs = basicSetWeakConsistency(newWeakConsistency, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.CONSISTENCY__WEAK_CONSISTENCY, newWeakConsistency, newWeakConsistency));
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
      case DomainDrivenDesignDslPackage.CONSISTENCY__WEAK_CONSISTENCY:
        return basicSetWeakConsistency(null, msgs);
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
      case DomainDrivenDesignDslPackage.CONSISTENCY__DOC:
        return getDoc();
      case DomainDrivenDesignDslPackage.CONSISTENCY__LEVEL:
        return getLevel();
      case DomainDrivenDesignDslPackage.CONSISTENCY__WEAK_CONSISTENCY:
        return getWeakConsistency();
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
      case DomainDrivenDesignDslPackage.CONSISTENCY__DOC:
        setDoc((String)newValue);
        return;
      case DomainDrivenDesignDslPackage.CONSISTENCY__LEVEL:
        setLevel((ConsistencyLevel)newValue);
        return;
      case DomainDrivenDesignDslPackage.CONSISTENCY__WEAK_CONSISTENCY:
        setWeakConsistency((WeakConsistency)newValue);
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
      case DomainDrivenDesignDslPackage.CONSISTENCY__DOC:
        setDoc(DOC_EDEFAULT);
        return;
      case DomainDrivenDesignDslPackage.CONSISTENCY__LEVEL:
        setLevel(LEVEL_EDEFAULT);
        return;
      case DomainDrivenDesignDslPackage.CONSISTENCY__WEAK_CONSISTENCY:
        setWeakConsistency((WeakConsistency)null);
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
      case DomainDrivenDesignDslPackage.CONSISTENCY__DOC:
        return DOC_EDEFAULT == null ? doc != null : !DOC_EDEFAULT.equals(doc);
      case DomainDrivenDesignDslPackage.CONSISTENCY__LEVEL:
        return level != LEVEL_EDEFAULT;
      case DomainDrivenDesignDslPackage.CONSISTENCY__WEAK_CONSISTENCY:
        return weakConsistency != null;
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
    result.append(" (doc: ");
    result.append(doc);
    result.append(", level: ");
    result.append(level);
    result.append(')');
    return result.toString();
  }

} //ConsistencyImpl
