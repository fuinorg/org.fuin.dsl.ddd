package org.fuin.dsl.ddd.extensions

import java.util.ArrayList
import java.util.List
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintTarget
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslFactory
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ValueObject
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Attribute

import static extension org.fuin.dsl.ddd.extensions.DddAttributeExtensions.*

class DddConstraintExtension {

	def static List<Variable> allVariables(Constraint constr) {
		var List<Variable> list = new ArrayList<Variable>();
		if (constr.attributes != null) {
			list.addAll(constr.attributes);
		}
		var ConstraintTarget target = constr.target;
		if (target instanceof ExternalType) {			
			var Variable vv = DomainDrivenDesignDslFactory.eINSTANCE.createVariable();
			vv.setName("vv");
			vv.setDoc("/** The validated value. */");
			vv.setType(target);
			list.add(vv);
		} else {
			var ValueObject vo = (target as ValueObject);
			if (vo.attributes != null) {
				for (attr : vo.attributes) {
					var Attribute newAttr = attr.copyWithNewName("vv_" + attr.name);
					list.add(newAttr);
				}
			}
		}
		return list;
	}


}
