/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weak Consistency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.WeakConsistency#getAcceptableDoc <em>Acceptable Doc</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.WeakConsistency#getAcceptable <em>Acceptable</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.WeakConsistency#getDetectionDoc <em>Detection Doc</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.WeakConsistency#getDetection <em>Detection</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.WeakConsistency#getResolutionDoc <em>Resolution Doc</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.WeakConsistency#getResolution <em>Resolution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getWeakConsistency()
 * @model
 * @generated
 */
public interface WeakConsistency extends EObject
{
  /**
   * Returns the value of the '<em><b>Acceptable Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Acceptable Doc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Acceptable Doc</em>' attribute.
   * @see #setAcceptableDoc(String)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getWeakConsistency_AcceptableDoc()
   * @model
   * @generated
   */
  String getAcceptableDoc();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.WeakConsistency#getAcceptableDoc <em>Acceptable Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Acceptable Doc</em>' attribute.
   * @see #getAcceptableDoc()
   * @generated
   */
  void setAcceptableDoc(String value);

  /**
   * Returns the value of the '<em><b>Acceptable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Acceptable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Acceptable</em>' containment reference.
   * @see #setAcceptable(Duration)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getWeakConsistency_Acceptable()
   * @model containment="true"
   * @generated
   */
  Duration getAcceptable();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.WeakConsistency#getAcceptable <em>Acceptable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Acceptable</em>' containment reference.
   * @see #getAcceptable()
   * @generated
   */
  void setAcceptable(Duration value);

  /**
   * Returns the value of the '<em><b>Detection Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Detection Doc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Detection Doc</em>' attribute.
   * @see #setDetectionDoc(String)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getWeakConsistency_DetectionDoc()
   * @model
   * @generated
   */
  String getDetectionDoc();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.WeakConsistency#getDetectionDoc <em>Detection Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Detection Doc</em>' attribute.
   * @see #getDetectionDoc()
   * @generated
   */
  void setDetectionDoc(String value);

  /**
   * Returns the value of the '<em><b>Detection</b></em>' attribute.
   * The literals are from the enumeration {@link org.fuin.dsl.ddd.domainDrivenDesignDsl.InconsistencyDetection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Detection</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Detection</em>' attribute.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.InconsistencyDetection
   * @see #setDetection(InconsistencyDetection)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getWeakConsistency_Detection()
   * @model
   * @generated
   */
  InconsistencyDetection getDetection();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.WeakConsistency#getDetection <em>Detection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Detection</em>' attribute.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.InconsistencyDetection
   * @see #getDetection()
   * @generated
   */
  void setDetection(InconsistencyDetection value);

  /**
   * Returns the value of the '<em><b>Resolution Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resolution Doc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resolution Doc</em>' attribute.
   * @see #setResolutionDoc(String)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getWeakConsistency_ResolutionDoc()
   * @model
   * @generated
   */
  String getResolutionDoc();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.WeakConsistency#getResolutionDoc <em>Resolution Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resolution Doc</em>' attribute.
   * @see #getResolutionDoc()
   * @generated
   */
  void setResolutionDoc(String value);

  /**
   * Returns the value of the '<em><b>Resolution</b></em>' attribute.
   * The literals are from the enumeration {@link org.fuin.dsl.ddd.domainDrivenDesignDsl.InconsistencyResolution}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resolution</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resolution</em>' attribute.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.InconsistencyResolution
   * @see #setResolution(InconsistencyResolution)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getWeakConsistency_Resolution()
   * @model
   * @generated
   */
  InconsistencyResolution getResolution();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.WeakConsistency#getResolution <em>Resolution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resolution</em>' attribute.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.InconsistencyResolution
   * @see #getResolution()
   * @generated
   */
  void setResolution(InconsistencyResolution value);

} // WeakConsistency
