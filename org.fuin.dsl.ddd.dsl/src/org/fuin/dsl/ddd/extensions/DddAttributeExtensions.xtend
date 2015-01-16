package org.fuin.dsl.ddd.extensions

import java.util.ArrayList
import java.util.List
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Attribute
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslFactory
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Parameter

import static extension org.fuin.dsl.ddd.extensions.DddInvariantsExtensions.*

/**
 * Provides extension methods for Attributes.
 */
class DddAttributeExtensions {

	/**
	 * Copies the attribute and assigns a new name to the copy.
	 * 
	 * @param attr Attribute to copy
	 * @param name New name.
	 * 
	 * @return Attribute copy with new name.
	 */
	public static def Attribute copyWithNewName(Attribute attr, String name) {
		var Attribute newAttr = DomainDrivenDesignDslFactory.eINSTANCE.createAttribute();
		newAttr.name = name;
		newAttr.doc = attr.doc;
		newAttr.nullable = attr.nullable;
		newAttr.type = attr.type;
		newAttr.multiplicity = attr.multiplicity;
		newAttr.invariants = attr.invariants;
		newAttr.overridden = attr.overridden;
		return newAttr;
	}
	
	/**
	 * Converts the attribute into a parameter.
	 * 
	 * @param attribute Attribute to convert.
	 * 
	 * @return Parameter.
	 */
	public static def Parameter asParameter(Attribute attr) {
		if (attr == null) {
			return null
		}
		val param = DomainDrivenDesignDslFactory.eINSTANCE.createParameter
		param.preconditions = DomainDrivenDesignDslFactory.eINSTANCE.createPreconditions
		param.preconditions.constraintInstances.addAll(attr.invariants.nullSafe)
		param.doc = attr.doc
		param.nullable = attr.nullable
		param.type = attr.type
		param.multiplicity = attr.multiplicity
		param.name = attr.name
		param.overridden = attr.overridden
		return param
	}
	
	/**
	 * Converts an attribute list into a list of parameters.
	 * 
	 * @param attributes List of attributes.
	 * 
	 * @return Parameter list.
	 */
	def static List<Parameter> asParameters(List<Attribute> attributes) {
		if (attributes == null) {
			return null
		}
		val list = new ArrayList<Parameter>()
		for (attr : attributes) {
			list.add(attr.asParameter)
		}
		return list
	}
	
	/**
	 * Returns a list of names from all attributes.
	 * 
	 * @param attributes Attribute list.
	 * 
	 * @return List with names in the same order as the attributes.
	 */
	def static List<String> asNames(List<Attribute> attributes) {
		if (attributes == null) {
			return null
		}
		val List<String> result = new ArrayList<String>()
		if (attributes != null) {
			for (attribute : attributes) {
				result.add(attribute.name)
			}
		}
		return result
	}

	
	
}
