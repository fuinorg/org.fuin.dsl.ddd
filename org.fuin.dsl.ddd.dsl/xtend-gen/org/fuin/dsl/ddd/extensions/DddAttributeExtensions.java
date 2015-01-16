package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Attribute;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintInstance;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslFactory;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Invariants;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.OverriddenTypeMetaInfo;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Parameter;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Preconditions;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Type;
import org.fuin.dsl.ddd.extensions.DddInvariantsExtensions;

/**
 * Provides extension methods for Attributes.
 */
@SuppressWarnings("all")
public class DddAttributeExtensions {
  /**
   * Copies the attribute and assigns a new name to the copy.
   * 
   * @param attr Attribute to copy
   * @param name New name.
   * 
   * @return Attribute copy with new name.
   */
  public static Attribute copyWithNewName(final Attribute attr, final String name) {
    Attribute newAttr = DomainDrivenDesignDslFactory.eINSTANCE.createAttribute();
    newAttr.setName(name);
    String _doc = attr.getDoc();
    newAttr.setDoc(_doc);
    String _nullable = attr.getNullable();
    newAttr.setNullable(_nullable);
    Type _type = attr.getType();
    newAttr.setType(_type);
    String _multiplicity = attr.getMultiplicity();
    newAttr.setMultiplicity(_multiplicity);
    Invariants _invariants = attr.getInvariants();
    newAttr.setInvariants(_invariants);
    OverriddenTypeMetaInfo _overridden = attr.getOverridden();
    newAttr.setOverridden(_overridden);
    return newAttr;
  }
  
  /**
   * Converts the attribute into a parameter.
   * 
   * @param attribute Attribute to convert.
   * 
   * @return Parameter.
   */
  public static Parameter asParameter(final Attribute attr) {
    boolean _equals = Objects.equal(attr, null);
    if (_equals) {
      return null;
    }
    final Parameter param = DomainDrivenDesignDslFactory.eINSTANCE.createParameter();
    Preconditions _createPreconditions = DomainDrivenDesignDslFactory.eINSTANCE.createPreconditions();
    param.setPreconditions(_createPreconditions);
    Preconditions _preconditions = param.getPreconditions();
    EList<ConstraintInstance> _constraintInstances = _preconditions.getConstraintInstances();
    Invariants _invariants = attr.getInvariants();
    List<ConstraintInstance> _nullSafe = DddInvariantsExtensions.nullSafe(_invariants);
    _constraintInstances.addAll(_nullSafe);
    String _doc = attr.getDoc();
    param.setDoc(_doc);
    String _nullable = attr.getNullable();
    param.setNullable(_nullable);
    Type _type = attr.getType();
    param.setType(_type);
    String _multiplicity = attr.getMultiplicity();
    param.setMultiplicity(_multiplicity);
    String _name = attr.getName();
    param.setName(_name);
    OverriddenTypeMetaInfo _overridden = attr.getOverridden();
    param.setOverridden(_overridden);
    return param;
  }
  
  /**
   * Converts an attribute list into a list of parameters.
   * 
   * @param attributes List of attributes.
   * 
   * @return Parameter list.
   */
  public static List<Parameter> asParameters(final List<Attribute> attributes) {
    boolean _equals = Objects.equal(attributes, null);
    if (_equals) {
      return null;
    }
    final ArrayList<Parameter> list = new ArrayList<Parameter>();
    for (final Attribute attr : attributes) {
      Parameter _asParameter = DddAttributeExtensions.asParameter(attr);
      list.add(_asParameter);
    }
    return list;
  }
  
  /**
   * Returns a list of names from all attributes.
   * 
   * @param attributes Attribute list.
   * 
   * @return List with names in the same order as the attributes.
   */
  public static List<String> asNames(final List<Attribute> attributes) {
    boolean _equals = Objects.equal(attributes, null);
    if (_equals) {
      return null;
    }
    final List<String> result = new ArrayList<String>();
    boolean _notEquals = (!Objects.equal(attributes, null));
    if (_notEquals) {
      for (final Attribute attribute : attributes) {
        String _name = attribute.getName();
        result.add(_name);
      }
    }
    return result;
  }
}
