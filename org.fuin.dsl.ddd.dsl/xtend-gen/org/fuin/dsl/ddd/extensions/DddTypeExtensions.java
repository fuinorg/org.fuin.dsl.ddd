package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumObject;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.InternalType;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Literal;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Type;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo;
import org.fuin.dsl.ddd.extensions.DddCollectionExtensions;

/**
 * Provides extension methods for Type.
 */
@SuppressWarnings("all")
public class DddTypeExtensions {
  /**
   * Returns the doc text from the type.
   * 
   * @param type Type with doc text to read.
   * 
   * @return Type doc text.
   */
  public static String doc(final Type type) {
    if ((type instanceof AbstractEntity)) {
      return ((AbstractEntity)type).getDoc();
    } else {
      if ((type instanceof AbstractVO)) {
        return ((AbstractVO)type).getDoc();
      }
    }
    return type.getName();
  }
  
  /**
   * Returns the base type if available. External types as argument
   * will return the external type itself.
   * 
   * @param variable Type with base to return.
   * 
   * @return Base type or null.
   */
  public static ExternalType base(final Type type) {
    if ((type instanceof AbstractVO)) {
      return ((AbstractVO)type).getBase();
    } else {
      if ((type instanceof EnumObject)) {
        return ((EnumObject)type).getBase();
      } else {
        if ((type instanceof ExternalType)) {
          return ((ExternalType)type);
        }
      }
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
  public static TypeMetaInfo meta(final Type type) {
    if ((type instanceof InternalType)) {
      return ((InternalType)type).getMetaInfo();
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
  public static Literal firstExample(final Type type) {
    final TypeMetaInfo metaInfo = DddTypeExtensions.meta(type);
    boolean _equals = Objects.equal(metaInfo, null);
    if (_equals) {
      return null;
    }
    EList<Literal> _examples = metaInfo.getExamples();
    return DddCollectionExtensions.<Literal>first(_examples);
  }
  
  /**
   * Returns the corresponding Java primitive type if one exists.
   * 
   * @param type Type
   * 
   * @return Java primitive or original type name.
   */
  public static String asJavaPrimitive(final Type type) {
    String name = type.getName();
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(name, "Byte")) {
        _matched=true;
        name = "byte";
      }
    }
    if (!_matched) {
      if (Objects.equal(name, "Short")) {
        _matched=true;
        name = "short";
      }
    }
    if (!_matched) {
      if (Objects.equal(name, "Integer")) {
        _matched=true;
        name = "int";
      }
    }
    if (!_matched) {
      if (Objects.equal(name, "Long")) {
        _matched=true;
        name = "long";
      }
    }
    if (!_matched) {
      if (Objects.equal(name, "Float")) {
        _matched=true;
        name = "float";
      }
    }
    if (!_matched) {
      if (Objects.equal(name, "Double")) {
        _matched=true;
        name = "double";
      }
    }
    if (!_matched) {
      if (Objects.equal(name, "Boolean")) {
        _matched=true;
        name = "boolean";
      }
    }
    if (!_matched) {
      if (Objects.equal(name, "Character")) {
        _matched=true;
        name = "char";
      }
    }
    return name;
  }
}
