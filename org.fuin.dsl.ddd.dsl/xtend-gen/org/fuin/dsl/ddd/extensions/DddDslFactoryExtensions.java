package org.fuin.dsl.ddd.extensions;

import org.fuin.dsl.ddd.domainDrivenDesignDsl.Attribute;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslFactory;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Parameter;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Type;

@SuppressWarnings("all")
public class DddDslFactoryExtensions {
  /**
   * Creates a parameter with a name.
   * 
   * @param factory Factory.
   * @param name Name.
   */
  public static Parameter createParameter(final DomainDrivenDesignDslFactory factory, final String name) {
    return DddDslFactoryExtensions.createParameter(factory, name, false);
  }
  
  /**
   * Creates a parameter with a name and "nullable" information.
   * 
   * @param factory Factory.
   * @param name Name.
   * @param nullable TRUE if nullable, else false.
   */
  public static Parameter createParameter(final DomainDrivenDesignDslFactory factory, final String name, final boolean nullable) {
    Parameter v = factory.createParameter();
    v.setName(name);
    if (nullable) {
      v.setNullable("nullable");
    }
    return v;
  }
  
  /**
   * Creates a parameter with type, name and "nullable" information.
   * 
   * @param factory Factory.
   * @param type Type.
   * @param name Name.
   * @param nullable TRUE if nullable, else false.
   */
  public static Parameter createParameter(final DomainDrivenDesignDslFactory factory, final Type type, final String name, final boolean nullable) {
    Parameter v = factory.createParameter();
    v.setName(name);
    if (nullable) {
      v.setNullable("nullable");
    }
    v.setType(type);
    return v;
  }
  
  /**
   * Creates a parameter with type, name and "nullable" information.
   * 
   * @param factory Factory.
   * @param doc Documentation.
   * @param type Type.
   * @param name Name.
   * @param nullable TRUE if nullable, else false.
   */
  public static Parameter createParameter(final DomainDrivenDesignDslFactory factory, final String doc, final Type type, final String name, final boolean nullable) {
    Parameter v = factory.createParameter();
    v.setDoc(doc);
    v.setName(name);
    if (nullable) {
      v.setNullable("nullable");
    }
    v.setType(type);
    return v;
  }
  
  /**
   * Creates an attribute with a name.
   * 
   * @param factory Factory.
   * @param name Name.
   */
  public static Attribute createAttribute(final DomainDrivenDesignDslFactory factory, final String name) {
    return DddDslFactoryExtensions.createAttribute(factory, name, false);
  }
  
  /**
   * Creates an attribute with a name and "nullable" information.
   * 
   * @param factory Factory.
   * @param name Name.
   * @param nullable TRUE if nullable, else false.
   */
  public static Attribute createAttribute(final DomainDrivenDesignDslFactory factory, final String name, final boolean nullable) {
    Attribute v = factory.createAttribute();
    v.setName(name);
    if (nullable) {
      v.setNullable("nullable");
    }
    return v;
  }
  
  /**
   * Creates an attribute with type, name and "nullable" information.
   * 
   * @param factory Factory.
   * @param type Type.
   * @param name Name.
   * @param nullable TRUE if nullable, else false.
   */
  public static Attribute createAttribute(final DomainDrivenDesignDslFactory factory, final Type type, final String name, final boolean nullable) {
    Attribute v = factory.createAttribute();
    v.setName(name);
    if (nullable) {
      v.setNullable("nullable");
    }
    v.setType(type);
    return v;
  }
  
  /**
   * Creates an attribute with type, name and "nullable" information.
   * 
   * @param factory Factory.
   * @param doc Documentation.
   * @param type Type.
   * @param name Name.
   * @param nullable TRUE if nullable, else false.
   */
  public static Attribute createAttribute(final DomainDrivenDesignDslFactory factory, final String doc, final Type type, final String name, final boolean nullable) {
    Attribute v = factory.createAttribute();
    v.setDoc(doc);
    v.setName(name);
    if (nullable) {
      v.setNullable("nullable");
    }
    v.setType(type);
    return v;
  }
}
