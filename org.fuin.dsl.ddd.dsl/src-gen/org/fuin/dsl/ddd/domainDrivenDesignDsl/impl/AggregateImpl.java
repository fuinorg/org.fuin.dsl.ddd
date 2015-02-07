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

import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AggregateId;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AggregateImpl#getIdType <em>Id Type</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AggregateImpl#getAggregateId <em>Aggregate Id</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AggregateImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregateImpl extends AbstractEntityImpl implements Aggregate
{
  /**
   * The cached value of the '{@link #getIdType() <em>Id Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdType()
   * @generated
   * @ordered
   */
  protected AggregateId idType;

  /**
   * The cached value of the '{@link #getAggregateId() <em>Aggregate Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregateId()
   * @generated
   * @ordered
   */
  protected AggregateId aggregateId;

  /**
   * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntities()
   * @generated
   * @ordered
   */
  protected EList<Entity> entities;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AggregateImpl()
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
    return DomainDrivenDesignDslPackage.Literals.AGGREGATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AggregateId getIdType()
  {
    if (idType != null && idType.eIsProxy())
    {
      InternalEObject oldIdType = (InternalEObject)idType;
      idType = (AggregateId)eResolveProxy(oldIdType);
      if (idType != oldIdType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainDrivenDesignDslPackage.AGGREGATE__ID_TYPE, oldIdType, idType));
      }
    }
    return idType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AggregateId basicGetIdType()
  {
    return idType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdType(AggregateId newIdType)
  {
    AggregateId oldIdType = idType;
    idType = newIdType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.AGGREGATE__ID_TYPE, oldIdType, idType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AggregateId getAggregateId()
  {
    return aggregateId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAggregateId(AggregateId newAggregateId, NotificationChain msgs)
  {
    AggregateId oldAggregateId = aggregateId;
    aggregateId = newAggregateId;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.AGGREGATE__AGGREGATE_ID, oldAggregateId, newAggregateId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAggregateId(AggregateId newAggregateId)
  {
    if (newAggregateId != aggregateId)
    {
      NotificationChain msgs = null;
      if (aggregateId != null)
        msgs = ((InternalEObject)aggregateId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.AGGREGATE__AGGREGATE_ID, null, msgs);
      if (newAggregateId != null)
        msgs = ((InternalEObject)newAggregateId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.AGGREGATE__AGGREGATE_ID, null, msgs);
      msgs = basicSetAggregateId(newAggregateId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.AGGREGATE__AGGREGATE_ID, newAggregateId, newAggregateId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Entity> getEntities()
  {
    if (entities == null)
    {
      entities = new EObjectContainmentEList<Entity>(Entity.class, this, DomainDrivenDesignDslPackage.AGGREGATE__ENTITIES);
    }
    return entities;
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
      case DomainDrivenDesignDslPackage.AGGREGATE__AGGREGATE_ID:
        return basicSetAggregateId(null, msgs);
      case DomainDrivenDesignDslPackage.AGGREGATE__ENTITIES:
        return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
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
      case DomainDrivenDesignDslPackage.AGGREGATE__ID_TYPE:
        if (resolve) return getIdType();
        return basicGetIdType();
      case DomainDrivenDesignDslPackage.AGGREGATE__AGGREGATE_ID:
        return getAggregateId();
      case DomainDrivenDesignDslPackage.AGGREGATE__ENTITIES:
        return getEntities();
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
      case DomainDrivenDesignDslPackage.AGGREGATE__ID_TYPE:
        setIdType((AggregateId)newValue);
        return;
      case DomainDrivenDesignDslPackage.AGGREGATE__AGGREGATE_ID:
        setAggregateId((AggregateId)newValue);
        return;
      case DomainDrivenDesignDslPackage.AGGREGATE__ENTITIES:
        getEntities().clear();
        getEntities().addAll((Collection<? extends Entity>)newValue);
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
      case DomainDrivenDesignDslPackage.AGGREGATE__ID_TYPE:
        setIdType((AggregateId)null);
        return;
      case DomainDrivenDesignDslPackage.AGGREGATE__AGGREGATE_ID:
        setAggregateId((AggregateId)null);
        return;
      case DomainDrivenDesignDslPackage.AGGREGATE__ENTITIES:
        getEntities().clear();
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
      case DomainDrivenDesignDslPackage.AGGREGATE__ID_TYPE:
        return idType != null;
      case DomainDrivenDesignDslPackage.AGGREGATE__AGGREGATE_ID:
        return aggregateId != null;
      case DomainDrivenDesignDslPackage.AGGREGATE__ENTITIES:
        return entities != null && !entities.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AggregateImpl
