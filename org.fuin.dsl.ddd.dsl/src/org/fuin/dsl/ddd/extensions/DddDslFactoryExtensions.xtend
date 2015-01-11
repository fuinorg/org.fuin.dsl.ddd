package org.fuin.dsl.ddd.extensions

import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslFactory
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Type

class DddDslFactoryExtensions {

	/**
	 * Creates a variable with a name.
	 * 
	 * @param factory Factory.
	 * @param name Name.
	 */
	def static createVariable(DomainDrivenDesignDslFactory factory, String name) {
		createVariable(factory, name, false)
	}

	/**
	 * Creates a variable with a name and "nullable" information.
	 * 
	 * @param factory Factory.
	 * @param name Name.
	 * @param nullable TRUE if nullable, else false.
	 */
	def static createVariable(DomainDrivenDesignDslFactory factory, String name, boolean nullable) {
		var v = factory.createVariable
		v.setName(name)
		if (nullable) {
			v.setNullable("nullable")
		}
		return v
	}

	/**
	 * Creates a variable with type, name and "nullable" information.
	 * 
	 * @param factory Factory.
	 * @param type Type.
	 * @param name Name.
	 * @param nullable TRUE if nullable, else false.
	 */
	def static createVariable(DomainDrivenDesignDslFactory factory, Type type, String name, boolean nullable) {
		var v = factory.createVariable
		v.setName(name)
		if (nullable) {
			v.setNullable("nullable")
		}
		v.setType(type)
		return v
	}

	/**
	 * Creates a variable with type, name and "nullable" information.
	 * 
	 * @param factory Factory.
	 * @param doc Documentation.
	 * @param type Type.
	 * @param name Name.
	 * @param nullable TRUE if nullable, else false.
	 */
	def static createVariable(DomainDrivenDesignDslFactory factory, String doc, Type type, String name, boolean nullable) {
		var v = factory.createVariable
		v.setDoc(doc)
		v.setName(name)
		if (nullable) {
			v.setNullable("nullable")
		}
		v.setType(type)
		return v
	}

}
