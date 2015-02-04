/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EntityId;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.EntityImpl#getIdType <em>Id Type</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.EntityImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.EntityImpl#getEntityId <em>Entity Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends AbstractEntityImpl implements Entity
{
  /**
   * The cached value of the '{@link #getIdType() <em>Id Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdType()
   * @generated
   * @ordered
   */
  protected EntityId idType;

  /**
   * The cached value of the '{@link #getRoot() <em>Root</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoot()
   * @generated
   * @ordered
   */
  protected Aggregate root;

  /**
   * The cached value of the '{@link #getEntityId() <em>Entity Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityId()
   * @generated
   * @ordered
   */
  protected EntityId entityId;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityImpl()
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
    return DomainDrivenDesignDslPackage.Literals.ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityId getIdType()
  {
    if (idType != null && idType.eIsProxy())
    {
      InternalEObject oldIdType = (InternalEObject)idType;
      idType = (EntityId)eResolveProxy(oldIdType);
      if (idType != oldIdType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainDrivenDesignDslPackage.ENTITY__ID_TYPE, oldIdType, idType));
      }
    }
    return idType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityId basicGetIdType()
  {
    return idType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdType(EntityId newIdType)
  {
    EntityId oldIdType = idType;
    idType = newIdType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.ENTITY__ID_TYPE, oldIdType, idType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aggregate getRoot()
  {
    if (root != null && root.eIsProxy())
    {
      InternalEObject oldRoot = (InternalEObject)root;
      root = (Aggregate)eResolveProxy(oldRoot);
      if (root != oldRoot)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainDrivenDesignDslPackage.ENTITY__ROOT, oldRoot, root));
      }
    }
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aggregate basicGetRoot()
  {
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoot(Aggregate newRoot)
  {
    Aggregate oldRoot = root;
    root = newRoot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.ENTITY__ROOT, oldRoot, root));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityId getEntityId()
  {
    return entityId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntityId(EntityId newEntityId, NotificationChain msgs)
  {
    EntityId oldEntityId = entityId;
    entityId = newEntityId;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.ENTITY__ENTITY_ID, oldEntityId, newEntityId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntityId(EntityId newEntityId)
  {
    if (newEntityId != entityId)
    {
      NotificationChain msgs = null;
      if (entityId != null)
        msgs = ((InternalEObject)entityId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.ENTITY__ENTITY_ID, null, msgs);
      if (newEntityId != null)
        msgs = ((InternalEObject)newEntityId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.ENTITY__ENTITY_ID, null, msgs);
      msgs = basicSetEntityId(newEntityId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.ENTITY__ENTITY_ID, newEntityId, newEntityId));
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
      case DomainDrivenDesignDslPackage.ENTITY__ENTITY_ID:
        return basicSetEntityId(null, msgs);
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
      case DomainDrivenDesignDslPackage.ENTITY__ID_TYPE:
        if (resolve) return getIdType();
        return basicGetIdType();
      case DomainDrivenDesignDslPackage.ENTITY__ROOT:
        if (resolve) return getRoot();
        return basicGetRoot();
      case DomainDrivenDesignDslPackage.ENTITY__ENTITY_ID:
        return getEntityId();
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
      case DomainDrivenDesignDslPackage.ENTITY__ID_TYPE:
        setIdType((EntityId)newValue);
        return;
      case DomainDrivenDesignDslPackage.ENTITY__ROOT:
        setRoot((Aggregate)newValue);
        return;
      case DomainDrivenDesignDslPackage.ENTITY__ENTITY_ID:
        setEntityId((EntityId)newValue);
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
      case DomainDrivenDesignDslPackage.ENTITY__ID_TYPE:
        setIdType((EntityId)null);
        return;
      case DomainDrivenDesignDslPackage.ENTITY__ROOT:
        setRoot((Aggregate)null);
        return;
      case DomainDrivenDesignDslPackage.ENTITY__ENTITY_ID:
        setEntityId((EntityId)null);
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
      case DomainDrivenDesignDslPackage.ENTITY__ID_TYPE:
        return idType != null;
      case DomainDrivenDesignDslPackage.ENTITY__ROOT:
        return root != null;
      case DomainDrivenDesignDslPackage.ENTITY__ENTITY_ID:
        return entityId != null;
    }
    return super.eIsSet(featureID);
  }

} //EntityImpl
