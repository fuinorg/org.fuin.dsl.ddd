package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AggregateId;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EntityId;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ValueObject;

/**
 * Provides extension methods for AbstractVO.
 */
@SuppressWarnings("all")
public class DddAbstractVOExtensions {
  /**
   * Returns the base type for a value object.
   * 
   * @param vo Value object.
   * 
   * @return Base type or null.
   */
  public static ExternalType baseType(final AbstractVO vo) {
    if ((vo instanceof AggregateId)) {
      return ((AggregateId)vo).getBase();
    }
    if ((vo instanceof EntityId)) {
      return ((EntityId)vo).getBase();
    }
    if ((vo instanceof ValueObject)) {
      return ((ValueObject)vo).getBase();
    }
    return null;
  }
  
  /**
   * Returns the base type name for a value object.
   * 
   * @param vo Value object.
   * 
   * @return Name or null.
   */
  public static String baseTypeName(final AbstractVO vo) {
    ExternalType _baseType = DddAbstractVOExtensions.baseType(vo);
    boolean _equals = Objects.equal(_baseType, null);
    if (_equals) {
      return null;
    } else {
      ExternalType _baseType_1 = DddAbstractVOExtensions.baseType(vo);
      return _baseType_1.getName();
    }
  }
}
