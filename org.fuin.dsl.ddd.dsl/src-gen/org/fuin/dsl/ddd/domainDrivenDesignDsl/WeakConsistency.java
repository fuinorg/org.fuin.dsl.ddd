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
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.WeakConsistency#getAcceptableTime <em>Acceptable Time</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.WeakConsistency#getAcceptableUnit <em>Acceptable Unit</em>}</li>
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
   * Returns the value of the '<em><b>Acceptable Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Acceptable Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Acceptable Time</em>' attribute.
   * @see #setAcceptableTime(int)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getWeakConsistency_AcceptableTime()
   * @model
   * @generated
   */
  int getAcceptableTime();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.WeakConsistency#getAcceptableTime <em>Acceptable Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Acceptable Time</em>' attribute.
   * @see #getAcceptableTime()
   * @generated
   */
  void setAcceptableTime(int value);

  /**
   * Returns the value of the '<em><b>Acceptable Unit</b></em>' attribute.
   * The literals are from the enumeration {@link org.fuin.dsl.ddd.domainDrivenDesignDsl.TimeUnit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Acceptable Unit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Acceptable Unit</em>' attribute.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.TimeUnit
   * @see #setAcceptableUnit(TimeUnit)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getWeakConsistency_AcceptableUnit()
   * @model
   * @generated
   */
  TimeUnit getAcceptableUnit();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.WeakConsistency#getAcceptableUnit <em>Acceptable Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Acceptable Unit</em>' attribute.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.TimeUnit
   * @see #getAcceptableUnit()
   * @generated
   */
  void setAcceptableUnit(TimeUnit value);

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
