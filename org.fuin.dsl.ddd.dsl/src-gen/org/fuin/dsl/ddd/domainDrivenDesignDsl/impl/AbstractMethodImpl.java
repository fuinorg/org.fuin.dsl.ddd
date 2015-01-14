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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintInstance;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Event;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Service;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractMethodImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractMethodImpl#getConstraintCalls <em>Constraint Calls</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractMethodImpl#getFiredEvents <em>Fired Events</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractMethodImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractMethodImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractMethodImpl#getServices <em>Services</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.AbstractMethodImpl#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractMethodImpl extends MinimalEObjectImpl.Container implements AbstractMethod
{
  /**
   * The default value of the '{@link #getDoc() <em>Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoc()
   * @generated
   * @ordered
   */
  protected static final String DOC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDoc() <em>Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoc()
   * @generated
   * @ordered
   */
  protected String doc = DOC_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getConstraintCalls() <em>Constraint Calls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraintCalls()
   * @generated
   * @ordered
   */
  protected EList<ConstraintInstance> constraintCalls;

  /**
   * The cached value of the '{@link #getFiredEvents() <em>Fired Events</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFiredEvents()
   * @generated
   * @ordered
   */
  protected EList<Event> firedEvents;

  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<Variable> variables;

  /**
   * The cached value of the '{@link #getService() <em>Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getService()
   * @generated
   * @ordered
   */
  protected Service service;

  /**
   * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServices()
   * @generated
   * @ordered
   */
  protected EList<Service> services;

  /**
   * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvents()
   * @generated
   * @ordered
   */
  protected EList<Event> events;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractMethodImpl()
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
    return DomainDrivenDesignDslPackage.Literals.ABSTRACT_METHOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDoc()
  {
    return doc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoc(String newDoc)
  {
    String oldDoc = doc;
    doc = newDoc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.ABSTRACT_METHOD__DOC, oldDoc, doc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.ABSTRACT_METHOD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConstraintInstance> getConstraintCalls()
  {
    if (constraintCalls == null)
    {
      constraintCalls = new EObjectContainmentEList<ConstraintInstance>(ConstraintInstance.class, this, DomainDrivenDesignDslPackage.ABSTRACT_METHOD__CONSTRAINT_CALLS);
    }
    return constraintCalls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Event> getFiredEvents()
  {
    if (firedEvents == null)
    {
      firedEvents = new EObjectResolvingEList<Event>(Event.class, this, DomainDrivenDesignDslPackage.ABSTRACT_METHOD__FIRED_EVENTS);
    }
    return firedEvents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<Variable>(Variable.class, this, DomainDrivenDesignDslPackage.ABSTRACT_METHOD__VARIABLES);
    }
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service getService()
  {
    if (service != null && service.eIsProxy())
    {
      InternalEObject oldService = (InternalEObject)service;
      service = (Service)eResolveProxy(oldService);
      if (service != oldService)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainDrivenDesignDslPackage.ABSTRACT_METHOD__SERVICE, oldService, service));
      }
    }
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service basicGetService()
  {
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setService(Service newService)
  {
    Service oldService = service;
    service = newService;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.ABSTRACT_METHOD__SERVICE, oldService, service));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Service> getServices()
  {
    if (services == null)
    {
      services = new EObjectContainmentEList<Service>(Service.class, this, DomainDrivenDesignDslPackage.ABSTRACT_METHOD__SERVICES);
    }
    return services;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Event> getEvents()
  {
    if (events == null)
    {
      events = new EObjectContainmentEList<Event>(Event.class, this, DomainDrivenDesignDslPackage.ABSTRACT_METHOD__EVENTS);
    }
    return events;
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
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__CONSTRAINT_CALLS:
        return ((InternalEList<?>)getConstraintCalls()).basicRemove(otherEnd, msgs);
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__SERVICES:
        return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__EVENTS:
        return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
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
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__DOC:
        return getDoc();
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__NAME:
        return getName();
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__CONSTRAINT_CALLS:
        return getConstraintCalls();
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__FIRED_EVENTS:
        return getFiredEvents();
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__VARIABLES:
        return getVariables();
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__SERVICE:
        if (resolve) return getService();
        return basicGetService();
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__SERVICES:
        return getServices();
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__EVENTS:
        return getEvents();
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
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__DOC:
        setDoc((String)newValue);
        return;
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__NAME:
        setName((String)newValue);
        return;
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__CONSTRAINT_CALLS:
        getConstraintCalls().clear();
        getConstraintCalls().addAll((Collection<? extends ConstraintInstance>)newValue);
        return;
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__FIRED_EVENTS:
        getFiredEvents().clear();
        getFiredEvents().addAll((Collection<? extends Event>)newValue);
        return;
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends Variable>)newValue);
        return;
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__SERVICE:
        setService((Service)newValue);
        return;
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__SERVICES:
        getServices().clear();
        getServices().addAll((Collection<? extends Service>)newValue);
        return;
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__EVENTS:
        getEvents().clear();
        getEvents().addAll((Collection<? extends Event>)newValue);
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
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__DOC:
        setDoc(DOC_EDEFAULT);
        return;
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__CONSTRAINT_CALLS:
        getConstraintCalls().clear();
        return;
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__FIRED_EVENTS:
        getFiredEvents().clear();
        return;
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__VARIABLES:
        getVariables().clear();
        return;
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__SERVICE:
        setService((Service)null);
        return;
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__SERVICES:
        getServices().clear();
        return;
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__EVENTS:
        getEvents().clear();
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
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__DOC:
        return DOC_EDEFAULT == null ? doc != null : !DOC_EDEFAULT.equals(doc);
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__CONSTRAINT_CALLS:
        return constraintCalls != null && !constraintCalls.isEmpty();
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__FIRED_EVENTS:
        return firedEvents != null && !firedEvents.isEmpty();
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__VARIABLES:
        return variables != null && !variables.isEmpty();
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__SERVICE:
        return service != null;
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__SERVICES:
        return services != null && !services.isEmpty();
      case DomainDrivenDesignDslPackage.ABSTRACT_METHOD__EVENTS:
        return events != null && !events.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (doc: ");
    result.append(doc);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //AbstractMethodImpl
