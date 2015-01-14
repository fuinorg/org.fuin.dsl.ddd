package org.fuin.dsl.ddd.extensions

import java.util.ArrayList
import java.util.List
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintInstance
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Method
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception

import static extension org.fuin.dsl.ddd.extensions.DddCollectionExtensions.*

/**
 * Provides extension methods for Method.
 */
class DddMethodExtensions {


	def static List<Constraint> allConstraints(Method method) {
		val List<Constraint> list = new ArrayList<Constraint>();
		if ((method.refMethod != null) && (method != method.refMethod)) {
			list.addAll(method.refMethod.allConstraints);
		}
		for (ConstraintInstance ci : method.constraintCalls.nullSafe) {
			list.add(ci.constraint);
		}
		return list;
	}

	def static List<Exception> allExceptions(Method method) {
		var List<Exception> list = new ArrayList<Exception>();
		if ((method.refMethod != null) && (method != method.refMethod)) {
			list.addAll(method.refMethod.allExceptions);
		}
		for (ConstraintInstance ci : method.constraintCalls.nullSafe) {
			list.add(ci.constraint.exception);		
		}
		return list;
	}
	
	def static List<Variable> allVariables(Method method) {
		var List<Variable> list = new ArrayList<Variable>();
		list.addAll(method.variables);
		if ((method.refMethod != null) && (method != method.refMethod)) {
			list.addAll(method.refMethod.allVariables);
		}
		return list;
	}

}
