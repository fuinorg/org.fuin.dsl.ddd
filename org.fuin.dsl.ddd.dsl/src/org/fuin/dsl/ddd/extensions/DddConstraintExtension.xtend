package org.fuin.dsl.ddd.extensions

import java.util.ArrayList
import java.util.List
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintTarget
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslFactory
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ValueObject
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable

class DddConstraintExtension {

	def static List<Variable> allVariables(Constraint constr) {
		var List<Variable> list = new ArrayList<Variable>();
		if (constr.variables != null) {
			list.addAll(constr.variables);
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
			if (vo.variables != null) {
				for (v : vo.variables) {
					var Variable vv = copyRenamed(v, "vv_" + v.name);
					list.add(vv);
				}
			}
		}
		return list;
	}

	private static def Variable copyRenamed(Variable v, String name) {
		var Variable vv = DomainDrivenDesignDslFactory.eINSTANCE.createVariable();
		vv.setName(name);
		vv.setDoc(v.doc);
		vv.setNullable(v.nullable);
		vv.setType(v.type);
		vv.setMultiplicity(v.multiplicity);
		vv.setInvariants(v.invariants);
		vv.setOverridden(v.overridden);
		return vv;
	}

}
