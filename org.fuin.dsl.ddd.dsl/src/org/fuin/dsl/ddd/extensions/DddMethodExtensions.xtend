package org.fuin.dsl.ddd.extensions

import java.util.ArrayList
import java.util.List
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintInstance
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Method
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Parameter

import static extension org.fuin.dsl.ddd.extensions.DddBusinessRulesExtensions.*

/**
 * Provides extension methods for Method.
 */
class DddMethodExtensions {


	def static List<Constraint> allBusinessRules(Method method) {
		val List<Constraint> list = new ArrayList<Constraint>();
		if ((method.refMethod != null) && (method != method.refMethod)) {
			list.addAll(method.refMethod.allBusinessRules);
		}
		for (ConstraintInstance ci : method.businessRules.nullSafe) {
			list.add(ci.constraint);
		}
		return list;
	}

	def static List<Exception> allExceptions(Method method) {
		var List<Exception> list = new ArrayList<Exception>();
		if ((method.refMethod != null) && (method != method.refMethod)) {
			list.addAll(method.refMethod.allExceptions);
		}
		for (ConstraintInstance ci : method.businessRules.nullSafe) {
			list.add(ci.constraint.exception);		
		}
		return list;
	}
	
	def static List<Parameter> allParameters(Method method) {
		var List<Parameter> list = new ArrayList<Parameter>();
		list.addAll(method.parameters);
		if ((method.refMethod != null) && (method != method.refMethod)) {
			list.addAll(method.refMethod.allParameters);
		}
		return list;
	}

}
