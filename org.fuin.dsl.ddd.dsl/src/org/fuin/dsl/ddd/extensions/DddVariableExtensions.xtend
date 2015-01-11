package org.fuin.dsl.ddd.extensions

import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslFactory
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Literal
import org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable

import static extension org.fuin.dsl.ddd.extensions.DddCollectionExtensions.*
import static extension org.fuin.dsl.ddd.extensions.DddStringExtensions.*
import static extension org.fuin.dsl.ddd.extensions.DddTypeExtensions.*

/**
 * Provides extension methods for Variable.
 */
class DddVariableExtensions {

	/**
	 * Returns the doc text from the variable or the type.
	 * 
	 * @param variable Variable with doc text to read.
	 * 
	 * @return Variable or type doc.
	 */
	def static String superDoc(Variable variable) {
		if (variable.doc == null) {
			variable.type.doc.text
		} else {
			return variable.doc.text
		}
	}

	/**
	 * Returns the corresponding Java primitive type.
	 * 
	 * @param variable Variable 
	 * 
	 * @return Primitive type or original type name. 
	 */
	def static String asJavaPrimitive(Variable variable) {
		if (variable.multiplicity == null) {
			return variable.type.asJavaPrimitive;
		}
		return (variable.type.asJavaPrimitive + "[]");
	}

	/**
	 * Returns the overridden meta info for the variable.
	 * This is a null safe shortcut for <code>variable.overridden.metaInfo</code>. 
	 * 
	 * @param variable Variable.
	 * 
	 * @return Meta info or null.
	 */
	def static TypeMetaInfo overriddenMeta(Variable variable) {
		if (variable.overridden == null) {
			return null
		}
		return variable.overridden.metaInfo
	}
	
	/**
	 * Returns the meta info for the variable if available.
	 * 
	 * @param variable Variable.
	 * 
	 * @return Meta info or null.
	 */
	def static TypeMetaInfo meta(Variable variable) {

		val TypeMetaInfo metaInfo = DomainDrivenDesignDslFactory.eINSTANCE.createTypeMetaInfo

		val TypeMetaInfo typeMeta = variable.type.meta
		if (typeMeta != null) {
			metaInfo.slabel = typeMeta.slabel
			metaInfo.label = typeMeta.label
			metaInfo.tooltip = typeMeta.tooltip
			metaInfo.prompt = typeMeta.prompt
			metaInfo.examples.addAll(typeMeta.examples)
		}

		if ((variable.overridden != null) && (variable.overridden.metaInfo != null)) {
			val TypeMetaInfo varMeta = variable.overridden.metaInfo
			if (varMeta.slabel != null) {
				metaInfo.slabel = varMeta.slabel
			}
			if (varMeta.label != null) {
				metaInfo.label = varMeta.label
			}
			if (varMeta.tooltip != null) {
				metaInfo.tooltip = varMeta.tooltip
			}
			if (varMeta.prompt != null) {
				metaInfo.prompt = varMeta.prompt
			}
			if (varMeta.examples.size > 0) {
				metaInfo.examples.clear
				metaInfo.examples.addAll(varMeta.examples)
			}

		}

		return metaInfo

	}

	/**
	 * Returns the first example from the meta info for the variable if available.
	 * 
	 * @param variable Variable.
	 * 
	 * @return Example literal or null.
	 */
	def static Literal firstExample(Variable variable) {
		val TypeMetaInfo metaInfo = variable.meta
		return metaInfo.examples.first
	}
	
}
