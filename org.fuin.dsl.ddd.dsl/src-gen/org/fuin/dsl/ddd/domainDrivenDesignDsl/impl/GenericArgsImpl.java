/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.GenericArgs;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Args</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.GenericArgsImpl#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericArgsImpl extends MinimalEObjectImpl.Container implements GenericArgs
{
  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<Type> args;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenericArgsImpl()
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
    return DomainDrivenDesignDslPackage.Literals.GENERIC_ARGS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type> getArgs()
  {
    if (args == null)
    {
      args = new EObjectResolvingEList<Type>(Type.class, this, DomainDrivenDesignDslPackage.GENERIC_ARGS__ARGS);
    }
    return args;
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
      case DomainDrivenDesignDslPackage.GENERIC_ARGS__ARGS:
        return getArgs();
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
      case DomainDrivenDesignDslPackage.GENERIC_ARGS__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends Type>)newValue);
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
      case DomainDrivenDesignDslPackage.GENERIC_ARGS__ARGS:
        getArgs().clear();
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
      case DomainDrivenDesignDslPackage.GENERIC_ARGS__ARGS:
        return args != null && !args.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GenericArgsImpl
