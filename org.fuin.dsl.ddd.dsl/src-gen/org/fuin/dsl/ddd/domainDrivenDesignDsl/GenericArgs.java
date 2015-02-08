/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Args</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.GenericArgs#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getGenericArgs()
 * @model
 * @generated
 */
public interface GenericArgs extends EObject
{
  /**
   * Returns the value of the '<em><b>Args</b></em>' reference list.
   * The list contents are of type {@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' reference list.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getGenericArgs_Args()
   * @model
   * @generated
   */
  EList<Type> getArgs();

} // GenericArgs
