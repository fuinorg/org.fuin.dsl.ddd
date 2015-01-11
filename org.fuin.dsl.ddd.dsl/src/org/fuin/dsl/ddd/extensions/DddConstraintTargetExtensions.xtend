package org.fuin.dsl.ddd.extensions

import java.util.ArrayList
import java.util.List
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintTarget
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable

/**
 * Provides extension methods for ConstraintTarget.
 */
class DddConstraintTargetExtensions {

	/**
	 * Returns the name of a constraint target.
	 * 
	 * @param target Target to return a name for.
	 * 
	 * @return Name.
	 */
	def static String getName(ConstraintTarget target) {
		if (target instanceof AbstractVO) {
			return target.name;
		} else if (target instanceof ExternalType) {
			return target.name;
		}
		throw new IllegalStateException("Unknown constraint target type: " + target.name + " [" + target.class.name + "]");
	}

	/**
	 * Returns the variables of a constraint target.
	 * 
	 * @param target Target to return a list of variables for.
	 * 
	 * @return Variables - Never null.
	 */
	def static List<Variable> getVariables(ConstraintTarget target) {
		if (target instanceof AbstractVO) {
			return target.variables;
		} else if (target instanceof ExternalType) {
			return new ArrayList<Variable>();
		}
		throw new IllegalStateException("Unknown constraint target type: " + target.name + " [" + target.class.name + "]");
	}

}
