package org.fuin.dsl.ddd.extensions

import java.util.ArrayList
import java.util.List
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Attribute
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumObject
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType
import org.fuin.dsl.ddd.domainDrivenDesignDsl.InternalType
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Literal
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Type
import org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo

import static extension org.fuin.dsl.ddd.extensions.DddCollectionExtensions.*

/**
 * Provides extension methods for Type.
 */
class DddTypeExtensions {

	/**
	 * Returns the doc text from the type.
	 * 
	 * @param type Type with doc text to read.
	 * 
	 * @return Type doc text.
	 */
	def static String doc(Type type) {
		if (type instanceof AbstractEntity) {
			return type.doc
		} else if (type instanceof AbstractVO) {
			return type.doc
		}
		return type.name;
	}

	/**
	 * Returns the base type if available. External types as argument 
	 * will return the external type itself.
	 * 
	 * @param variable Type with base to return.
	 * 
	 * @return Base type or null.
	 */
	def static ExternalType base(Type type) {
		if (type instanceof AbstractVO) {
			return type.base
		} else if (type instanceof EnumObject) {
			return type.base
		} else if (type instanceof ExternalType) {
			return type
		}
		return null;
	}
	
	/**
	 * Returns the meta info if available. 
	 * 
	 * @param type Type with meta info to return.
	 * 
	 * @return Meta info or null.
	 */
	def static TypeMetaInfo meta(Type type) {
		if (type instanceof InternalType) {
			return type.metaInfo
		}
		return null;
	}

	/**
	 * Returns the first example from the meta info for the variable if available.
	 * 
	 * @param variable Variable.
	 * 
	 * @return Example literal or null.
	 */
	def static Literal firstExample(Type type) {
		val TypeMetaInfo metaInfo = type.meta
		if (metaInfo == null) {
			return null
		}
		return metaInfo.examples.first
	}

	/**
	 * Returns the corresponding Java primitive type if one exists.
	 * 
	 * @param type Type 
	 * 
	 * @return Java primitive or original type name.
	 */
	def static String asJavaPrimitive(Type type) {
		var String name = type.name;
		switch name {
			case 'Byte': name = 'byte'
			case 'Short': name = 'short'
			case 'Integer': name = 'int'
			case 'Long': name = 'long'
			case 'Float': name = 'float'
			case 'Double': name = 'double'
			case 'Boolean': name = 'boolean'
			case 'Character': name = 'char'
		}
		return name;
	}


	/**
	 * Returns the attributes of a type.
	 * 
	 * @param type Type to return a list of attributes for.
	 * 
	 * @return Attributes - Never null.
	 */
	def static List<Attribute> getAttributes(Type type) {
		if (type == null) {
			return new ArrayList<Attribute>();
		}
		if (type instanceof InternalType) {
			return type.attributes;
		} else {
			return new ArrayList<Attribute>();
		}
	}

}
