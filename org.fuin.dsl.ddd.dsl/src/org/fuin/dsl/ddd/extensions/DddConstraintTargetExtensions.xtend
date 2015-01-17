package org.fuin.dsl.ddd.extensions

import java.util.ArrayList
import java.util.List
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Attribute
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintTarget
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType
import org.fuin.dsl.ddd.domainDrivenDesignDsl.InternalType

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
		if (target == null) {
			return null
		}
		if (target instanceof InternalType) {
			return target.name;
		} else if (target instanceof ExternalType) {
			return target.name;
		}
		throw new IllegalStateException("Unknown constraint target type: " + target.name + " [" + target.class.name + "]");
	}

	/**
	 * Returns the attributes of a constraint target.
	 * 
	 * @param target Target to return a list of attributes for.
	 * 
	 * @return Attributes - Never null.
	 */
	def static List<Attribute> getAttributes(ConstraintTarget target) {
		if (target == null) {
			return new ArrayList<Attribute>();
		}
		if (target instanceof InternalType) {
			return target.attributes;
		} else if (target instanceof ExternalType) {
			return new ArrayList<Attribute>();
		}
		throw new IllegalStateException("Unknown constraint target type: " + target.name + " [" + target.class.name + "]");
	}

}
