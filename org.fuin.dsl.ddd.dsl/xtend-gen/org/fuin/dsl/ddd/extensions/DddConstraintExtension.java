package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintTarget;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslFactory;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Invariants;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.OverriddenTypeMetaInfo;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Type;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ValueObject;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable;

@SuppressWarnings("all")
public class DddConstraintExtension {
  public static List<Variable> allVariables(final Constraint constr) {
    List<Variable> list = new ArrayList<Variable>();
    EList<Variable> _variables = constr.getVariables();
    boolean _notEquals = (!Objects.equal(_variables, null));
    if (_notEquals) {
      EList<Variable> _variables_1 = constr.getVariables();
      list.addAll(_variables_1);
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
      EList<Variable> _variables_2 = vo.getVariables();
      boolean _notEquals_1 = (!Objects.equal(_variables_2, null));
      if (_notEquals_1) {
        EList<Variable> _variables_3 = vo.getVariables();
        for (final Variable v : _variables_3) {
          {
            String _name = v.getName();
            String _plus = ("vv_" + _name);
            Variable vv_1 = DddConstraintExtension.copyRenamed(v, _plus);
            list.add(vv_1);
          }
        }
      }
    }
    return list;
  }
  
  private static Variable copyRenamed(final Variable v, final String name) {
    Variable vv = DomainDrivenDesignDslFactory.eINSTANCE.createVariable();
    vv.setName(name);
    String _doc = v.getDoc();
    vv.setDoc(_doc);
    String _nullable = v.getNullable();
    vv.setNullable(_nullable);
    Type _type = v.getType();
    vv.setType(_type);
    String _multiplicity = v.getMultiplicity();
    vv.setMultiplicity(_multiplicity);
    Invariants _invariants = v.getInvariants();
    vv.setInvariants(_invariants);
    OverriddenTypeMetaInfo _overridden = v.getOverridden();
    vv.setOverridden(_overridden);
    return vv;
  }
}
