package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslFactory;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Literal;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.OverriddenTypeMetaInfo;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Type;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable;
import org.fuin.dsl.ddd.extensions.DddCollectionExtensions;
import org.fuin.dsl.ddd.extensions.DddStringExtensions;
import org.fuin.dsl.ddd.extensions.DddTypeExtensions;

/**
 * Provides extension methods for Variable.
 */
@SuppressWarnings("all")
public class DddVariableExtensions {
  /**
   * Returns the doc text from the variable or the type.
   * 
   * @param variable Variable with doc text to read.
   * 
   * @return Variable or type doc.
   */
  public static String superDoc(final Variable variable) {
    String _xifexpression = null;
    String _doc = variable.getDoc();
    boolean _equals = Objects.equal(_doc, null);
    if (_equals) {
      Type _type = variable.getType();
      String _doc_1 = _type.getDoc();
      _xifexpression = DddStringExtensions.text(_doc_1);
    } else {
      String _doc_2 = variable.getDoc();
      return DddStringExtensions.text(_doc_2);
    }
    return _xifexpression;
  }
  
  /**
   * Returns the corresponding Java primitive type.
   * 
   * @param variable Variable
   * 
   * @return Primitive type or original type name.
   */
  public static String asJavaPrimitive(final Variable variable) {
    Type _type = variable.getType();
    return DddTypeExtensions.asJavaPrimitive(_type);
  }
  
  /**
   * Returns the overridden meta info for the variable.
   * This is a null safe shortcut for <code>variable.overridden.metaInfo</code>.
   * 
   * @param variable Variable.
   * 
   * @return Meta info or null.
   */
  public static TypeMetaInfo overriddenMeta(final Variable variable) {
    OverriddenTypeMetaInfo _overridden = variable.getOverridden();
    boolean _equals = Objects.equal(_overridden, null);
    if (_equals) {
      return null;
    }
    OverriddenTypeMetaInfo _overridden_1 = variable.getOverridden();
    return _overridden_1.getMetaInfo();
  }
  
  /**
   * Returns the meta info for the variable if available.
   * 
   * @param variable Variable.
   * 
   * @return Meta info or null.
   */
  public static TypeMetaInfo meta(final Variable variable) {
    final TypeMetaInfo metaInfo = DomainDrivenDesignDslFactory.eINSTANCE.createTypeMetaInfo();
    Type _type = variable.getType();
    final TypeMetaInfo typeMeta = DddTypeExtensions.meta(_type);
    boolean _notEquals = (!Objects.equal(typeMeta, null));
    if (_notEquals) {
      String _slabel = typeMeta.getSlabel();
      metaInfo.setSlabel(_slabel);
      String _label = typeMeta.getLabel();
      metaInfo.setLabel(_label);
      String _tooltip = typeMeta.getTooltip();
      metaInfo.setTooltip(_tooltip);
      String _prompt = typeMeta.getPrompt();
      metaInfo.setPrompt(_prompt);
      EList<Literal> _examples = metaInfo.getExamples();
      EList<Literal> _examples_1 = typeMeta.getExamples();
      _examples.addAll(_examples_1);
    }
    boolean _and = false;
    OverriddenTypeMetaInfo _overridden = variable.getOverridden();
    boolean _notEquals_1 = (!Objects.equal(_overridden, null));
    if (!_notEquals_1) {
      _and = false;
    } else {
      OverriddenTypeMetaInfo _overridden_1 = variable.getOverridden();
      TypeMetaInfo _metaInfo = _overridden_1.getMetaInfo();
      boolean _notEquals_2 = (!Objects.equal(_metaInfo, null));
      _and = _notEquals_2;
    }
    if (_and) {
      OverriddenTypeMetaInfo _overridden_2 = variable.getOverridden();
      final TypeMetaInfo varMeta = _overridden_2.getMetaInfo();
      String _slabel_1 = varMeta.getSlabel();
      boolean _notEquals_3 = (!Objects.equal(_slabel_1, null));
      if (_notEquals_3) {
        String _slabel_2 = varMeta.getSlabel();
        metaInfo.setSlabel(_slabel_2);
      }
      String _label_1 = varMeta.getLabel();
      boolean _notEquals_4 = (!Objects.equal(_label_1, null));
      if (_notEquals_4) {
        String _label_2 = varMeta.getLabel();
        metaInfo.setLabel(_label_2);
      }
      String _tooltip_1 = varMeta.getTooltip();
      boolean _notEquals_5 = (!Objects.equal(_tooltip_1, null));
      if (_notEquals_5) {
        String _tooltip_2 = varMeta.getTooltip();
        metaInfo.setTooltip(_tooltip_2);
      }
      String _prompt_1 = varMeta.getPrompt();
      boolean _notEquals_6 = (!Objects.equal(_prompt_1, null));
      if (_notEquals_6) {
        String _prompt_2 = varMeta.getPrompt();
        metaInfo.setPrompt(_prompt_2);
      }
      EList<Literal> _examples_2 = varMeta.getExamples();
      int _size = _examples_2.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        EList<Literal> _examples_3 = metaInfo.getExamples();
        _examples_3.clear();
        EList<Literal> _examples_4 = metaInfo.getExamples();
        EList<Literal> _examples_5 = varMeta.getExamples();
        _examples_4.addAll(_examples_5);
      }
    }
    return metaInfo;
  }
  
  /**
   * Returns the first example from the meta info for the variable if available.
   * 
   * @param variable Variable.
   * 
   * @return Example literal or null.
   */
  public static Literal firstExample(final Variable variable) {
    final TypeMetaInfo metaInfo = DddVariableExtensions.meta(variable);
    EList<Literal> _examples = metaInfo.getExamples();
    return DddCollectionExtensions.<Literal>first(_examples);
  }
}
