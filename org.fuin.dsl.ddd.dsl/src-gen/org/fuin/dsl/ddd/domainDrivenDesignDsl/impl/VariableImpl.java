/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.GenericArgs;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.OverriddenTypeMetaInfo;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Type;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.VariableImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.VariableImpl#getNullable <em>Nullable</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.VariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.VariableImpl#getGenerics <em>Generics</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.VariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.VariableImpl#getOverridden <em>Overridden</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends MinimalEObjectImpl.Container implements Variable
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
   * The default value of the '{@link #getNullable() <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNullable()
   * @generated
   * @ordered
   */
  protected static final String NULLABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNullable() <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNullable()
   * @generated
   * @ordered
   */
  protected String nullable = NULLABLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The cached value of the '{@link #getGenerics() <em>Generics</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenerics()
   * @generated
   * @ordered
   */
  protected GenericArgs generics;

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
   * The cached value of the '{@link #getOverridden() <em>Overridden</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOverridden()
   * @generated
   * @ordered
   */
  protected OverriddenTypeMetaInfo overridden;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableImpl()
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
    return DomainDrivenDesignDslPackage.Literals.VARIABLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.VARIABLE__DOC, oldDoc, doc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNullable()
  {
    return nullable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNullable(String newNullable)
  {
    String oldNullable = nullable;
    nullable = newNullable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.VARIABLE__NULLABLE, oldNullable, nullable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (Type)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainDrivenDesignDslPackage.VARIABLE__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.VARIABLE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericArgs getGenerics()
  {
    return generics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGenerics(GenericArgs newGenerics, NotificationChain msgs)
  {
    GenericArgs oldGenerics = generics;
    generics = newGenerics;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.VARIABLE__GENERICS, oldGenerics, newGenerics);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenerics(GenericArgs newGenerics)
  {
    if (newGenerics != generics)
    {
      NotificationChain msgs = null;
      if (generics != null)
        msgs = ((InternalEObject)generics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.VARIABLE__GENERICS, null, msgs);
      if (newGenerics != null)
        msgs = ((InternalEObject)newGenerics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.VARIABLE__GENERICS, null, msgs);
      msgs = basicSetGenerics(newGenerics, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.VARIABLE__GENERICS, newGenerics, newGenerics));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.VARIABLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OverriddenTypeMetaInfo getOverridden()
  {
    return overridden;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOverridden(OverriddenTypeMetaInfo newOverridden, NotificationChain msgs)
  {
    OverriddenTypeMetaInfo oldOverridden = overridden;
    overridden = newOverridden;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.VARIABLE__OVERRIDDEN, oldOverridden, newOverridden);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOverridden(OverriddenTypeMetaInfo newOverridden)
  {
    if (newOverridden != overridden)
    {
      NotificationChain msgs = null;
      if (overridden != null)
        msgs = ((InternalEObject)overridden).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.VARIABLE__OVERRIDDEN, null, msgs);
      if (newOverridden != null)
        msgs = ((InternalEObject)newOverridden).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.VARIABLE__OVERRIDDEN, null, msgs);
      msgs = basicSetOverridden(newOverridden, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.VARIABLE__OVERRIDDEN, newOverridden, newOverridden));
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
      case DomainDrivenDesignDslPackage.VARIABLE__GENERICS:
        return basicSetGenerics(null, msgs);
      case DomainDrivenDesignDslPackage.VARIABLE__OVERRIDDEN:
        return basicSetOverridden(null, msgs);
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
      case DomainDrivenDesignDslPackage.VARIABLE__DOC:
        return getDoc();
      case DomainDrivenDesignDslPackage.VARIABLE__NULLABLE:
        return getNullable();
      case DomainDrivenDesignDslPackage.VARIABLE__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case DomainDrivenDesignDslPackage.VARIABLE__GENERICS:
        return getGenerics();
      case DomainDrivenDesignDslPackage.VARIABLE__NAME:
        return getName();
      case DomainDrivenDesignDslPackage.VARIABLE__OVERRIDDEN:
        return getOverridden();
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
      case DomainDrivenDesignDslPackage.VARIABLE__DOC:
        setDoc((String)newValue);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__NULLABLE:
        setNullable((String)newValue);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__TYPE:
        setType((Type)newValue);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__GENERICS:
        setGenerics((GenericArgs)newValue);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__NAME:
        setName((String)newValue);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__OVERRIDDEN:
        setOverridden((OverriddenTypeMetaInfo)newValue);
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
      case DomainDrivenDesignDslPackage.VARIABLE__DOC:
        setDoc(DOC_EDEFAULT);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__NULLABLE:
        setNullable(NULLABLE_EDEFAULT);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__TYPE:
        setType((Type)null);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__GENERICS:
        setGenerics((GenericArgs)null);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__OVERRIDDEN:
        setOverridden((OverriddenTypeMetaInfo)null);
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
      case DomainDrivenDesignDslPackage.VARIABLE__DOC:
        return DOC_EDEFAULT == null ? doc != null : !DOC_EDEFAULT.equals(doc);
      case DomainDrivenDesignDslPackage.VARIABLE__NULLABLE:
        return NULLABLE_EDEFAULT == null ? nullable != null : !NULLABLE_EDEFAULT.equals(nullable);
      case DomainDrivenDesignDslPackage.VARIABLE__TYPE:
        return type != null;
      case DomainDrivenDesignDslPackage.VARIABLE__GENERICS:
        return generics != null;
      case DomainDrivenDesignDslPackage.VARIABLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainDrivenDesignDslPackage.VARIABLE__OVERRIDDEN:
        return overridden != null;
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
    result.append(", nullable: ");
    result.append(nullable);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //VariableImpl
