/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AggregateId;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AggregateIdImpl#getAggregate <em>Aggregate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregateIdImpl extends AbstractEntityIdImpl implements AggregateId
{
  /**
   * The cached value of the '{@link #getAggregate() <em>Aggregate</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregate()
   * @generated
   * @ordered
   */
  protected Aggregate aggregate;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AggregateIdImpl()
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
    return DomainDrivenDesignDslPackage.Literals.AGGREGATE_ID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aggregate getAggregate()
  {
    if (aggregate != null && aggregate.eIsProxy())
    {
      InternalEObject oldAggregate = (InternalEObject)aggregate;
      aggregate = (Aggregate)eResolveProxy(oldAggregate);
      if (aggregate != oldAggregate)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainDrivenDesignDslPackage.AGGREGATE_ID__AGGREGATE, oldAggregate, aggregate));
      }
    }
    return aggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aggregate basicGetAggregate()
  {
    return aggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAggregate(Aggregate newAggregate)
  {
    Aggregate oldAggregate = aggregate;
    aggregate = newAggregate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.AGGREGATE_ID__AGGREGATE, oldAggregate, aggregate));
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
      case DomainDrivenDesignDslPackage.AGGREGATE_ID__AGGREGATE:
        if (resolve) return getAggregate();
        return basicGetAggregate();
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
      case DomainDrivenDesignDslPackage.AGGREGATE_ID__AGGREGATE:
        setAggregate((Aggregate)newValue);
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
      case DomainDrivenDesignDslPackage.AGGREGATE_ID__AGGREGATE:
        setAggregate((Aggregate)null);
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
      case DomainDrivenDesignDslPackage.AGGREGATE_ID__AGGREGATE:
        return aggregate != null;
    }
    return super.eIsSet(featureID);
  }

} //AggregateIdImpl
