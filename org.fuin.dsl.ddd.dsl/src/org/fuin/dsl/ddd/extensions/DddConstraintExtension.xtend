package org.fuin.dsl.ddd.extensions

import java.util.ArrayList
import java.util.List
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Attribute
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType
import org.fuin.dsl.ddd.domainDrivenDesignDsl.InternalType
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Type

import static org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslFactory.eINSTANCE

import static extension org.fuin.dsl.ddd.extensions.DddAttributeExtensions.*
import static extension org.fuin.dsl.ddd.extensions.DddDslFactoryExtensions.*

class DddConstraintExtension {

	def static List<Attribute> allAllowedVariables(Constraint constr) {
		var List<Attribute> list = new ArrayList<Attribute>();
		if (constr.attributes != null) {
			list.addAll(constr.attributes);
		}
		var Type target = constr.input;
		if (target instanceof ExternalType) {
			list.add(createInputAttribute(target))
		} else if (target instanceof InternalType) {
			list.add(createInputAttribute(target))
			if (target.attributes != null) {
				for (attr : target.attributes) {
					var Attribute newAttr = attr.copyWithNewName("input." + attr.name);
					list.add(newAttr);
				}
			}
		}
		return list;
	}
	
	def static createInputAttribute(Type type) {
		return eINSTANCE.createAttribute("/** The validated value. */", type, "input", true)
	}


}
