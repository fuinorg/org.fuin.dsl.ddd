/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preconditions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Preconditions#getConstraintInstances <em>Constraint Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getPreconditions()
 * @model
 * @generated
 */
public interface Preconditions extends EObject
{
  /**
   * Returns the value of the '<em><b>Constraint Instances</b></em>' containment reference list.
   * The list contents are of type {@link org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintInstance}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint Instances</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint Instances</em>' containment reference list.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getPreconditions_ConstraintInstances()
   * @model containment="true"
   * @generated
   */
  EList<ConstraintInstance> getConstraintInstances();

} // Preconditions
