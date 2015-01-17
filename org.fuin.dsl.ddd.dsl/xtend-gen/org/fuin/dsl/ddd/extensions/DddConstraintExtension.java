package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Attribute;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintTarget;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslFactory;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.InternalType;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Type;
import org.fuin.dsl.ddd.extensions.DddAttributeExtensions;
import org.fuin.dsl.ddd.extensions.DddDslFactoryExtensions;

@SuppressWarnings("all")
public class DddConstraintExtension {
  public static List<Attribute> allAllowedVariables(final Constraint constr) {
    List<Attribute> list = new ArrayList<Attribute>();
    EList<Attribute> _attributes = constr.getAttributes();
    boolean _notEquals = (!Objects.equal(_attributes, null));
    if (_notEquals) {
      EList<Attribute> _attributes_1 = constr.getAttributes();
      list.addAll(_attributes_1);
    }
    ConstraintTarget target = constr.getTarget();
    if ((target instanceof ExternalType)) {
      Attribute _createInputAttribute = DddConstraintExtension.createInputAttribute(((Type)target));
      list.add(_createInputAttribute);
    } else {
      if ((target instanceof InternalType)) {
        Attribute _createInputAttribute_1 = DddConstraintExtension.createInputAttribute(((InternalType)target));
        list.add(_createInputAttribute_1);
        EList<Attribute> _attributes_2 = ((InternalType)target).getAttributes();
        boolean _notEquals_1 = (!Objects.equal(_attributes_2, null));
        if (_notEquals_1) {
          EList<Attribute> _attributes_3 = ((InternalType)target).getAttributes();
          for (final Attribute attr : _attributes_3) {
            {
              String _name = attr.getName();
              String _plus = ("input." + _name);
              Attribute newAttr = DddAttributeExtensions.copyWithNewName(attr, _plus);
              list.add(newAttr);
            }
          }
        }
      }
    }
    return list;
  }
  
  public static Attribute createInputAttribute(final Type type) {
    return DddDslFactoryExtensions.createAttribute(DomainDrivenDesignDslFactory.eINSTANCE, "/** The validated value. */", type, "input", true);
  }
}
