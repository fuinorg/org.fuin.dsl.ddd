/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Inconsistency Detection</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getInconsistencyDetection()
 * @model
 * @generated
 */
public enum InconsistencyDetection implements Enumerator
{
  /**
   * The '<em><b>Never</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEVER_VALUE
   * @generated
   * @ordered
   */
  NEVER(0, "never", "never"),

  /**
   * The '<em><b>Manually</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MANUALLY_VALUE
   * @generated
   * @ordered
   */
  MANUALLY(1, "manually", "manually"),

  /**
   * The '<em><b>Automatic</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AUTOMATIC_VALUE
   * @generated
   * @ordered
   */
  AUTOMATIC(2, "automatic", "automatic");

  /**
   * The '<em><b>Never</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Never</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NEVER
   * @model name="never"
   * @generated
   * @ordered
   */
  public static final int NEVER_VALUE = 0;

  /**
   * The '<em><b>Manually</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Manually</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MANUALLY
   * @model name="manually"
   * @generated
   * @ordered
   */
  public static final int MANUALLY_VALUE = 1;

  /**
   * The '<em><b>Automatic</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Automatic</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AUTOMATIC
   * @model name="automatic"
   * @generated
   * @ordered
   */
  public static final int AUTOMATIC_VALUE = 2;

  /**
   * An array of all the '<em><b>Inconsistency Detection</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final InconsistencyDetection[] VALUES_ARRAY =
    new InconsistencyDetection[]
    {
      NEVER,
      MANUALLY,
      AUTOMATIC,
    };

  /**
   * A public read-only list of all the '<em><b>Inconsistency Detection</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<InconsistencyDetection> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Inconsistency Detection</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static InconsistencyDetection get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      InconsistencyDetection result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Inconsistency Detection</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static InconsistencyDetection getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      InconsistencyDetection result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Inconsistency Detection</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static InconsistencyDetection get(int value)
  {
    switch (value)
    {
      case NEVER_VALUE: return NEVER;
      case MANUALLY_VALUE: return MANUALLY;
      case AUTOMATIC_VALUE: return AUTOMATIC;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private InconsistencyDetection(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //InconsistencyDetection
