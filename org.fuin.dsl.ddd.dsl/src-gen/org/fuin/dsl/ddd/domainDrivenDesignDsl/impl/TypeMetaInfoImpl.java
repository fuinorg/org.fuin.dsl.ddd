/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Meta Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.TypeMetaInfoImpl#getSlabel <em>Slabel</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.TypeMetaInfoImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.TypeMetaInfoImpl#getTooltipp <em>Tooltipp</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.TypeMetaInfoImpl#getPrompt <em>Prompt</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.TypeMetaInfoImpl#getExamples <em>Examples</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMetaInfoImpl extends MinimalEObjectImpl.Container implements TypeMetaInfo
{
  /**
   * The default value of the '{@link #getSlabel() <em>Slabel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSlabel()
   * @generated
   * @ordered
   */
  protected static final String SLABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSlabel() <em>Slabel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSlabel()
   * @generated
   * @ordered
   */
  protected String slabel = SLABEL_EDEFAULT;

  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * The default value of the '{@link #getTooltipp() <em>Tooltipp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTooltipp()
   * @generated
   * @ordered
   */
  protected static final String TOOLTIPP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTooltipp() <em>Tooltipp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTooltipp()
   * @generated
   * @ordered
   */
  protected String tooltipp = TOOLTIPP_EDEFAULT;

  /**
   * The default value of the '{@link #getPrompt() <em>Prompt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrompt()
   * @generated
   * @ordered
   */
  protected static final String PROMPT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrompt() <em>Prompt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrompt()
   * @generated
   * @ordered
   */
  protected String prompt = PROMPT_EDEFAULT;

  /**
   * The cached value of the '{@link #getExamples() <em>Examples</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExamples()
   * @generated
   * @ordered
   */
  protected EList<String> examples;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeMetaInfoImpl()
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
    return DomainDrivenDesignDslPackage.Literals.TYPE_META_INFO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSlabel()
  {
    return slabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSlabel(String newSlabel)
  {
    String oldSlabel = slabel;
    slabel = newSlabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.TYPE_META_INFO__SLABEL, oldSlabel, slabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.TYPE_META_INFO__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTooltipp()
  {
    return tooltipp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTooltipp(String newTooltipp)
  {
    String oldTooltipp = tooltipp;
    tooltipp = newTooltipp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.TYPE_META_INFO__TOOLTIPP, oldTooltipp, tooltipp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrompt()
  {
    return prompt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrompt(String newPrompt)
  {
    String oldPrompt = prompt;
    prompt = newPrompt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.TYPE_META_INFO__PROMPT, oldPrompt, prompt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getExamples()
  {
    if (examples == null)
    {
      examples = new EDataTypeEList<String>(String.class, this, DomainDrivenDesignDslPackage.TYPE_META_INFO__EXAMPLES);
    }
    return examples;
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
      case DomainDrivenDesignDslPackage.TYPE_META_INFO__SLABEL:
        return getSlabel();
      case DomainDrivenDesignDslPackage.TYPE_META_INFO__LABEL:
        return getLabel();
      case DomainDrivenDesignDslPackage.TYPE_META_INFO__TOOLTIPP:
        return getTooltipp();
      case DomainDrivenDesignDslPackage.TYPE_META_INFO__PROMPT:
        return getPrompt();
      case DomainDrivenDesignDslPackage.TYPE_META_INFO__EXAMPLES:
        return getExamples();
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
      case DomainDrivenDesignDslPackage.TYPE_META_INFO__SLABEL:
        setSlabel((String)newValue);
        return;
      case DomainDrivenDesignDslPackage.TYPE_META_INFO__LABEL:
        setLabel((String)newValue);
        return;
      case DomainDrivenDesignDslPackage.TYPE_META_INFO__TOOLTIPP:
        setTooltipp((String)newValue);
        return;
      case DomainDrivenDesignDslPackage.TYPE_META_INFO__PROMPT:
        setPrompt((String)newValue);
        return;
      case DomainDrivenDesignDslPackage.TYPE_META_INFO__EXAMPLES:
        getExamples().clear();
        getExamples().addAll((Collection<? extends String>)newValue);
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
      case DomainDrivenDesignDslPackage.TYPE_META_INFO__SLABEL:
        setSlabel(SLABEL_EDEFAULT);
        return;
      case DomainDrivenDesignDslPackage.TYPE_META_INFO__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case DomainDrivenDesignDslPackage.TYPE_META_INFO__TOOLTIPP:
        setTooltipp(TOOLTIPP_EDEFAULT);
        return;
      case DomainDrivenDesignDslPackage.TYPE_META_INFO__PROMPT:
        setPrompt(PROMPT_EDEFAULT);
        return;
      case DomainDrivenDesignDslPackage.TYPE_META_INFO__EXAMPLES:
        getExamples().clear();
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
      case DomainDrivenDesignDslPackage.TYPE_META_INFO__SLABEL:
        return SLABEL_EDEFAULT == null ? slabel != null : !SLABEL_EDEFAULT.equals(slabel);
      case DomainDrivenDesignDslPackage.TYPE_META_INFO__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case DomainDrivenDesignDslPackage.TYPE_META_INFO__TOOLTIPP:
        return TOOLTIPP_EDEFAULT == null ? tooltipp != null : !TOOLTIPP_EDEFAULT.equals(tooltipp);
      case DomainDrivenDesignDslPackage.TYPE_META_INFO__PROMPT:
        return PROMPT_EDEFAULT == null ? prompt != null : !PROMPT_EDEFAULT.equals(prompt);
      case DomainDrivenDesignDslPackage.TYPE_META_INFO__EXAMPLES:
        return examples != null && !examples.isEmpty();
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
    result.append(" (slabel: ");
    result.append(slabel);
    result.append(", label: ");
    result.append(label);
    result.append(", tooltipp: ");
    result.append(tooltipp);
    result.append(", prompt: ");
    result.append(prompt);
    result.append(", examples: ");
    result.append(examples);
    result.append(')');
    return result.toString();
  }

} //TypeMetaInfoImpl
