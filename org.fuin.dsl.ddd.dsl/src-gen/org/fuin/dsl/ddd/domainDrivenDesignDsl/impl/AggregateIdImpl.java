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
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AggregateIdImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregateIdImpl extends AbstractEntityIdImpl implements AggregateId
{
  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected Aggregate entity;

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
  public Aggregate getEntity()
  {
    if (entity != null && entity.eIsProxy())
    {
      InternalEObject oldEntity = (InternalEObject)entity;
      entity = (Aggregate)eResolveProxy(oldEntity);
      if (entity != oldEntity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainDrivenDesignDslPackage.AGGREGATE_ID__ENTITY, oldEntity, entity));
      }
    }
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aggregate basicGetEntity()
  {
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntity(Aggregate newEntity)
  {
    Aggregate oldEntity = entity;
    entity = newEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.AGGREGATE_ID__ENTITY, oldEntity, entity));
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
      case DomainDrivenDesignDslPackage.AGGREGATE_ID__ENTITY:
        if (resolve) return getEntity();
        return basicGetEntity();
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
      case DomainDrivenDesignDslPackage.AGGREGATE_ID__ENTITY:
        setEntity((Aggregate)newValue);
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
      case DomainDrivenDesignDslPackage.AGGREGATE_ID__ENTITY:
        setEntity((Aggregate)null);
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
      case DomainDrivenDesignDslPackage.AGGREGATE_ID__ENTITY:
        return entity != null;
    }
    return super.eIsSet(featureID);
  }

} //AggregateIdImpl
