package org.fuin.dsl.ddd.extensions

import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslFactory
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Type

class DddDslFactoryExtensions {

	/**
	 * Creates a parameter with a name.
	 * 
	 * @param factory Factory.
	 * @param name Name.
	 */
	def static createParameter(DomainDrivenDesignDslFactory factory, String name) {
		createParameter(factory, name, false)
	}

	/**
	 * Creates a parameter with a name and "nullable" information.
	 * 
	 * @param factory Factory.
	 * @param name Name.
	 * @param nullable TRUE if nullable, else false.
	 */
	def static createParameter(DomainDrivenDesignDslFactory factory, String name, boolean nullable) {
		var v = factory.createParameter
		v.setName(name)
		if (nullable) {
			v.setNullable("nullable")
		}
		return v
	}

	/**
	 * Creates a parameter with type, name and "nullable" information.
	 * 
	 * @param factory Factory.
	 * @param type Type.
	 * @param name Name.
	 * @param nullable TRUE if nullable, else false.
	 */
	def static createParameter(DomainDrivenDesignDslFactory factory, Type type, String name, boolean nullable) {
		var v = factory.createParameter
		v.setName(name)
		if (nullable) {
			v.setNullable("nullable")
		}
		v.setType(type)
		return v
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
	def static createParameter(DomainDrivenDesignDslFactory factory, String doc, Type type, String name, boolean nullable) {
		var v = factory.createParameter
		v.setDoc(doc)
		v.setName(name)
		if (nullable) {
			v.setNullable("nullable")
		}
		v.setType(type)
		return v
	}
	/**
	 * Creates an attribute with a name.
	 * 
	 * @param factory Factory.
	 * @param name Name.
	 */
	def static createAttribute(DomainDrivenDesignDslFactory factory, String name) {
		createAttribute(factory, name, false)
	}

	/**
	 * Creates an attribute with a name and "nullable" information.
	 * 
	 * @param factory Factory.
	 * @param name Name.
	 * @param nullable TRUE if nullable, else false.
	 */
	def static createAttribute(DomainDrivenDesignDslFactory factory, String name, boolean nullable) {
		var v = factory.createAttribute
		v.setName(name)
		if (nullable) {
			v.setNullable("nullable")
		}
		return v
	}

	/**
	 * Creates an attribute with type, name and "nullable" information.
	 * 
	 * @param factory Factory.
	 * @param type Type.
	 * @param name Name.
	 * @param nullable TRUE if nullable, else false.
	 */
	def static createAttribute(DomainDrivenDesignDslFactory factory, Type type, String name, boolean nullable) {
		var v = factory.createAttribute
		v.setName(name)
		if (nullable) {
			v.setNullable("nullable")
		}
		v.setType(type)
		return v
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
	def static createAttribute(DomainDrivenDesignDslFactory factory, String doc, Type type, String name, boolean nullable) {
		var v = factory.createAttribute
		v.setDoc(doc)
		v.setName(name)
		if (nullable) {
			v.setNullable("nullable")
		}
		v.setType(type)
		return v
	}

}
