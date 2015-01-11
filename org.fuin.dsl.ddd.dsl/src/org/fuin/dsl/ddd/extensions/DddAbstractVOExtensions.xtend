package org.fuin.dsl.ddd.extensions

import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AggregateId
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EntityId
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ValueObject

/**
 * Provides extension methods for AbstractVO.
 */
class DddAbstractVOExtensions {

	/**
	 * Returns the base type for a value object.
	 * 
	 * @param vo Value object.
	 * 
	 * @return Base type or null.
	 */	
	def static ExternalType baseType(AbstractVO vo) {
		if (vo instanceof AggregateId) {
			return vo.base
		}
		if (vo instanceof EntityId) {
			return vo.base
		}
		if (vo instanceof ValueObject) {
			return vo.base
		}
		return null
	}
	
	
	/**
	 * Returns the base type name for a value object.
	 * 
	 * @param vo Value object.
	 * 
	 * @return Name or null.
	 */	
	def static String baseTypeName(AbstractVO vo) {
		if (vo.baseType == null) {
			return null
		} else {
			return vo.baseType.name
		}
	}

}
