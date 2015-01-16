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
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Type;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ValueObject;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable;
import org.fuin.dsl.ddd.extensions.DddAttributeExtensions;

@SuppressWarnings("all")
public class DddConstraintExtension {
  public static List<Variable> allVariables(final Constraint constr) {
    List<Variable> list = new ArrayList<Variable>();
    EList<Attribute> _attributes = constr.getAttributes();
    boolean _notEquals = (!Objects.equal(_attributes, null));
    if (_notEquals) {
      EList<Attribute> _attributes_1 = constr.getAttributes();
      list.addAll(_attributes_1);
    }
    ConstraintTarget target = constr.getTarget();
    if ((target instanceof ExternalType)) {
      Variable vv = DomainDrivenDesignDslFactory.eINSTANCE.createVariable();
      vv.setName("vv");
      vv.setDoc("/** The validated value. */");
      vv.setType(((Type)target));
      list.add(vv);
    } else {
      ValueObject vo = ((ValueObject) target);
      EList<Attribute> _attributes_2 = vo.getAttributes();
      boolean _notEquals_1 = (!Objects.equal(_attributes_2, null));
      if (_notEquals_1) {
        EList<Attribute> _attributes_3 = vo.getAttributes();
        for (final Attribute attr : _attributes_3) {
          {
            String _name = attr.getName();
            String _plus = ("vv_" + _name);
            Attribute newAttr = DddAttributeExtensions.copyWithNewName(attr, _plus);
            list.add(newAttr);
          }
        }
      }
    }
    return list;
  }
}
