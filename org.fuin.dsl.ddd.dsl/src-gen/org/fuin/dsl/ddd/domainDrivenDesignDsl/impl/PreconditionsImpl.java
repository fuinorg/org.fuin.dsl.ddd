/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintInstance;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Preconditions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preconditions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.PreconditionsImpl#getConstraintInstances <em>Constraint Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreconditionsImpl extends MinimalEObjectImpl.Container implements Preconditions
{
  /**
   * The cached value of the '{@link #getConstraintInstances() <em>Constraint Instances</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraintInstances()
   * @generated
   * @ordered
   */
  protected EList<ConstraintInstance> constraintInstances;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PreconditionsImpl()
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
    return DomainDrivenDesignDslPackage.Literals.PRECONDITIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConstraintInstance> getConstraintInstances()
  {
    if (constraintInstances == null)
    {
      constraintInstances = new EObjectContainmentEList<ConstraintInstance>(ConstraintInstance.class, this, DomainDrivenDesignDslPackage.PRECONDITIONS__CONSTRAINT_INSTANCES);
    }
    return constraintInstances;
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
      case DomainDrivenDesignDslPackage.PRECONDITIONS__CONSTRAINT_INSTANCES:
        return ((InternalEList<?>)getConstraintInstances()).basicRemove(otherEnd, msgs);
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
      case DomainDrivenDesignDslPackage.PRECONDITIONS__CONSTRAINT_INSTANCES:
        return getConstraintInstances();
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
      case DomainDrivenDesignDslPackage.PRECONDITIONS__CONSTRAINT_INSTANCES:
        getConstraintInstances().clear();
        getConstraintInstances().addAll((Collection<? extends ConstraintInstance>)newValue);
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
      case DomainDrivenDesignDslPackage.PRECONDITIONS__CONSTRAINT_INSTANCES:
        getConstraintInstances().clear();
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
      case DomainDrivenDesignDslPackage.PRECONDITIONS__CONSTRAINT_INSTANCES:
        return constraintInstances != null && !constraintInstances.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PreconditionsImpl
