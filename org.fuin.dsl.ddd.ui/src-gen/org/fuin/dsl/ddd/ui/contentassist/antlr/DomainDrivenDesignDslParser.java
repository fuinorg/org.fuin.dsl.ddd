/*
* generated by Xtext
*/
package org.fuin.dsl.ddd.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.fuin.dsl.ddd.services.DomainDrivenDesignDslGrammarAccess;

public class DomainDrivenDesignDslParser extends AbstractContentAssistParser {
	
	@Inject
	private DomainDrivenDesignDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.fuin.dsl.ddd.ui.contentassist.antlr.internal.InternalDomainDrivenDesignDslParser createParser() {
		org.fuin.dsl.ddd.ui.contentassist.antlr.internal.InternalDomainDrivenDesignDslParser result = new org.fuin.dsl.ddd.ui.contentassist.antlr.internal.InternalDomainDrivenDesignDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getImportAccess().getImportedNamespaceAlternatives_1_0(), "rule__Import__ImportedNamespaceAlternatives_1_0");
					put(grammarAccess.getAbstractElementAccess().getAlternatives(), "rule__AbstractElement__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getInternalTypeAccess().getAlternatives(), "rule__InternalType__Alternatives");
					put(grammarAccess.getAbstractVOAccess().getAlternatives(), "rule__AbstractVO__Alternatives");
					put(grammarAccess.getAbstractEntityIdAccess().getAlternatives(), "rule__AbstractEntityId__Alternatives");
					put(grammarAccess.getAbstractEntityAccess().getAlternatives(), "rule__AbstractEntity__Alternatives");
					put(grammarAccess.getConstraintTargetAccess().getAlternatives(), "rule__ConstraintTarget__Alternatives");
					put(grammarAccess.getAbstractMethodAccess().getAlternatives(), "rule__AbstractMethod__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_1_0(), "rule__BooleanLiteral__ValueAlternatives_1_0");
					put(grammarAccess.getNumberAccess().getAlternatives(), "rule__Number__Alternatives");
					put(grammarAccess.getNumberAccess().getAlternatives_1_0(), "rule__Number__Alternatives_1_0");
					put(grammarAccess.getNumberAccess().getAlternatives_1_1_1(), "rule__Number__Alternatives_1_1_1");
					put(grammarAccess.getContextAccess().getGroup(), "rule__Context__Group__0");
					put(grammarAccess.getNamespaceAccess().getGroup(), "rule__Namespace__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getExternalTypeAccess().getGroup(), "rule__ExternalType__Group__0");
					put(grammarAccess.getConstraintAccess().getGroup(), "rule__Constraint__Group__0");
					put(grammarAccess.getConstraintAccess().getGroup_3(), "rule__Constraint__Group_3__0");
					put(grammarAccess.getConstraintAccess().getGroup_4(), "rule__Constraint__Group_4__0");
					put(grammarAccess.getConstraintAccess().getGroup_7(), "rule__Constraint__Group_7__0");
					put(grammarAccess.getExceptionAccess().getGroup(), "rule__Exception__Group__0");
					put(grammarAccess.getExceptionAccess().getGroup_3(), "rule__Exception__Group_3__0");
					put(grammarAccess.getValueObjectAccess().getGroup(), "rule__ValueObject__Group__0");
					put(grammarAccess.getValueObjectAccess().getGroup_3(), "rule__ValueObject__Group_3__0");
					put(grammarAccess.getEntityIdAccess().getGroup(), "rule__EntityId__Group__0");
					put(grammarAccess.getEntityIdAccess().getGroup_5(), "rule__EntityId__Group_5__0");
					put(grammarAccess.getAggregateIdAccess().getGroup(), "rule__AggregateId__Group__0");
					put(grammarAccess.getAggregateIdAccess().getGroup_5(), "rule__AggregateId__Group_5__0");
					put(grammarAccess.getEnumObjectAccess().getGroup(), "rule__EnumObject__Group__0");
					put(grammarAccess.getEnumInstanceAccess().getGroup(), "rule__EnumInstance__Group__0");
					put(grammarAccess.getEnumInstanceAccess().getGroup_2(), "rule__EnumInstance__Group_2__0");
					put(grammarAccess.getEnumInstanceAccess().getGroup_2_2(), "rule__EnumInstance__Group_2_2__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getAggregateAccess().getGroup(), "rule__Aggregate__Group__0");
					put(grammarAccess.getConstructorAccess().getGroup(), "rule__Constructor__Group__0");
					put(grammarAccess.getReturnTypeAccess().getGroup(), "rule__ReturnType__Group__0");
					put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
					put(grammarAccess.getMethodAccess().getGroup_3(), "rule__Method__Group_3__0");
					put(grammarAccess.getEventAccess().getGroup(), "rule__Event__Group__0");
					put(grammarAccess.getEventAccess().getGroup_5(), "rule__Event__Group_5__0");
					put(grammarAccess.getTypeMetaInfoAccess().getGroup(), "rule__TypeMetaInfo__Group__0");
					put(grammarAccess.getTypeMetaInfoAccess().getGroup_1(), "rule__TypeMetaInfo__Group_1__0");
					put(grammarAccess.getTypeMetaInfoAccess().getGroup_2(), "rule__TypeMetaInfo__Group_2__0");
					put(grammarAccess.getTypeMetaInfoAccess().getGroup_3(), "rule__TypeMetaInfo__Group_3__0");
					put(grammarAccess.getTypeMetaInfoAccess().getGroup_4(), "rule__TypeMetaInfo__Group_4__0");
					put(grammarAccess.getTypeMetaInfoAccess().getGroup_5(), "rule__TypeMetaInfo__Group_5__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getConstraintsAccess().getGroup(), "rule__Constraints__Group__0");
					put(grammarAccess.getConstraintsAccess().getGroup_3(), "rule__Constraints__Group_3__0");
					put(grammarAccess.getInvariantsAccess().getGroup(), "rule__Invariants__Group__0");
					put(grammarAccess.getInvariantsAccess().getGroup_2(), "rule__Invariants__Group_2__0");
					put(grammarAccess.getOverriddenTypeMetaInfoAccess().getGroup(), "rule__OverriddenTypeMetaInfo__Group__0");
					put(grammarAccess.getConstraintCallAccess().getGroup(), "rule__ConstraintCall__Group__0");
					put(grammarAccess.getConstraintCallAccess().getGroup_1(), "rule__ConstraintCall__Group_1__0");
					put(grammarAccess.getConstraintCallAccess().getGroup_1_2(), "rule__ConstraintCall__Group_1_2__0");
					put(grammarAccess.getServiceAccess().getGroup(), "rule__Service__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getFQNWithWildcardAccess().getGroup(), "rule__FQNWithWildcard__Group__0");
					put(grammarAccess.getBooleanLiteralAccess().getGroup(), "rule__BooleanLiteral__Group__0");
					put(grammarAccess.getNullLiteralAccess().getGroup(), "rule__NullLiteral__Group__0");
					put(grammarAccess.getNumberLiteralAccess().getGroup(), "rule__NumberLiteral__Group__0");
					put(grammarAccess.getStringLiteralAccess().getGroup(), "rule__StringLiteral__Group__0");
					put(grammarAccess.getNumberAccess().getGroup_1(), "rule__Number__Group_1__0");
					put(grammarAccess.getNumberAccess().getGroup_1_1(), "rule__Number__Group_1_1__0");
					put(grammarAccess.getDomainModelAccess().getContextsAssignment(), "rule__DomainModel__ContextsAssignment");
					put(grammarAccess.getContextAccess().getNameAssignment_1(), "rule__Context__NameAssignment_1");
					put(grammarAccess.getContextAccess().getNamespacesAssignment_3(), "rule__Context__NamespacesAssignment_3");
					put(grammarAccess.getNamespaceAccess().getNameAssignment_1(), "rule__Namespace__NameAssignment_1");
					put(grammarAccess.getNamespaceAccess().getImportsAssignment_3(), "rule__Namespace__ImportsAssignment_3");
					put(grammarAccess.getNamespaceAccess().getElementsAssignment_4(), "rule__Namespace__ElementsAssignment_4");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getExternalTypeAccess().getNameAssignment_1(), "rule__ExternalType__NameAssignment_1");
					put(grammarAccess.getConstraintAccess().getDocAssignment_0(), "rule__Constraint__DocAssignment_0");
					put(grammarAccess.getConstraintAccess().getNameAssignment_2(), "rule__Constraint__NameAssignment_2");
					put(grammarAccess.getConstraintAccess().getTargetAssignment_3_1(), "rule__Constraint__TargetAssignment_3_1");
					put(grammarAccess.getConstraintAccess().getExceptionAssignment_4_1(), "rule__Constraint__ExceptionAssignment_4_1");
					put(grammarAccess.getConstraintAccess().getVariablesAssignment_6(), "rule__Constraint__VariablesAssignment_6");
					put(grammarAccess.getConstraintAccess().getMessageAssignment_7_1(), "rule__Constraint__MessageAssignment_7_1");
					put(grammarAccess.getExceptionAccess().getDocAssignment_0(), "rule__Exception__DocAssignment_0");
					put(grammarAccess.getExceptionAccess().getNameAssignment_2(), "rule__Exception__NameAssignment_2");
					put(grammarAccess.getExceptionAccess().getCidAssignment_3_1(), "rule__Exception__CidAssignment_3_1");
					put(grammarAccess.getExceptionAccess().getVariablesAssignment_5(), "rule__Exception__VariablesAssignment_5");
					put(grammarAccess.getExceptionAccess().getMessageAssignment_7(), "rule__Exception__MessageAssignment_7");
					put(grammarAccess.getValueObjectAccess().getDocAssignment_0(), "rule__ValueObject__DocAssignment_0");
					put(grammarAccess.getValueObjectAccess().getNameAssignment_2(), "rule__ValueObject__NameAssignment_2");
					put(grammarAccess.getValueObjectAccess().getBaseAssignment_3_1(), "rule__ValueObject__BaseAssignment_3_1");
					put(grammarAccess.getValueObjectAccess().getMetaInfoAssignment_5(), "rule__ValueObject__MetaInfoAssignment_5");
					put(grammarAccess.getValueObjectAccess().getVariablesAssignment_6(), "rule__ValueObject__VariablesAssignment_6");
					put(grammarAccess.getValueObjectAccess().getConstructorsAssignment_7(), "rule__ValueObject__ConstructorsAssignment_7");
					put(grammarAccess.getValueObjectAccess().getMethodsAssignment_8(), "rule__ValueObject__MethodsAssignment_8");
					put(grammarAccess.getEntityIdAccess().getDocAssignment_0(), "rule__EntityId__DocAssignment_0");
					put(grammarAccess.getEntityIdAccess().getNameAssignment_2(), "rule__EntityId__NameAssignment_2");
					put(grammarAccess.getEntityIdAccess().getEntityAssignment_4(), "rule__EntityId__EntityAssignment_4");
					put(grammarAccess.getEntityIdAccess().getBaseAssignment_5_1(), "rule__EntityId__BaseAssignment_5_1");
					put(grammarAccess.getEntityIdAccess().getMetaInfoAssignment_7(), "rule__EntityId__MetaInfoAssignment_7");
					put(grammarAccess.getEntityIdAccess().getVariablesAssignment_8(), "rule__EntityId__VariablesAssignment_8");
					put(grammarAccess.getEntityIdAccess().getConstructorsAssignment_9(), "rule__EntityId__ConstructorsAssignment_9");
					put(grammarAccess.getEntityIdAccess().getMethodsAssignment_10(), "rule__EntityId__MethodsAssignment_10");
					put(grammarAccess.getAggregateIdAccess().getDocAssignment_0(), "rule__AggregateId__DocAssignment_0");
					put(grammarAccess.getAggregateIdAccess().getNameAssignment_2(), "rule__AggregateId__NameAssignment_2");
					put(grammarAccess.getAggregateIdAccess().getEntityAssignment_4(), "rule__AggregateId__EntityAssignment_4");
					put(grammarAccess.getAggregateIdAccess().getBaseAssignment_5_1(), "rule__AggregateId__BaseAssignment_5_1");
					put(grammarAccess.getAggregateIdAccess().getMetaInfoAssignment_7(), "rule__AggregateId__MetaInfoAssignment_7");
					put(grammarAccess.getAggregateIdAccess().getVariablesAssignment_8(), "rule__AggregateId__VariablesAssignment_8");
					put(grammarAccess.getAggregateIdAccess().getConstructorsAssignment_9(), "rule__AggregateId__ConstructorsAssignment_9");
					put(grammarAccess.getAggregateIdAccess().getMethodsAssignment_10(), "rule__AggregateId__MethodsAssignment_10");
					put(grammarAccess.getEnumObjectAccess().getDocAssignment_0(), "rule__EnumObject__DocAssignment_0");
					put(grammarAccess.getEnumObjectAccess().getNameAssignment_2(), "rule__EnumObject__NameAssignment_2");
					put(grammarAccess.getEnumObjectAccess().getMetaInfoAssignment_4(), "rule__EnumObject__MetaInfoAssignment_4");
					put(grammarAccess.getEnumObjectAccess().getVariablesAssignment_5(), "rule__EnumObject__VariablesAssignment_5");
					put(grammarAccess.getEnumObjectAccess().getConstructorsAssignment_6(), "rule__EnumObject__ConstructorsAssignment_6");
					put(grammarAccess.getEnumObjectAccess().getMethodsAssignment_7(), "rule__EnumObject__MethodsAssignment_7");
					put(grammarAccess.getEnumObjectAccess().getInstancesAssignment_10(), "rule__EnumObject__InstancesAssignment_10");
					put(grammarAccess.getEnumInstanceAccess().getDocAssignment_0(), "rule__EnumInstance__DocAssignment_0");
					put(grammarAccess.getEnumInstanceAccess().getNameAssignment_1(), "rule__EnumInstance__NameAssignment_1");
					put(grammarAccess.getEnumInstanceAccess().getParamsAssignment_2_1(), "rule__EnumInstance__ParamsAssignment_2_1");
					put(grammarAccess.getEnumInstanceAccess().getParamsAssignment_2_2_1(), "rule__EnumInstance__ParamsAssignment_2_2_1");
					put(grammarAccess.getEntityAccess().getDocAssignment_0(), "rule__Entity__DocAssignment_0");
					put(grammarAccess.getEntityAccess().getNameAssignment_2(), "rule__Entity__NameAssignment_2");
					put(grammarAccess.getEntityAccess().getIdTypeAssignment_4(), "rule__Entity__IdTypeAssignment_4");
					put(grammarAccess.getEntityAccess().getRootAssignment_6(), "rule__Entity__RootAssignment_6");
					put(grammarAccess.getEntityAccess().getMetaInfoAssignment_8(), "rule__Entity__MetaInfoAssignment_8");
					put(grammarAccess.getEntityAccess().getVariablesAssignment_9(), "rule__Entity__VariablesAssignment_9");
					put(grammarAccess.getEntityAccess().getConstructorsAssignment_10(), "rule__Entity__ConstructorsAssignment_10");
					put(grammarAccess.getEntityAccess().getMethodsAssignment_11(), "rule__Entity__MethodsAssignment_11");
					put(grammarAccess.getAggregateAccess().getDocAssignment_0(), "rule__Aggregate__DocAssignment_0");
					put(grammarAccess.getAggregateAccess().getNameAssignment_2(), "rule__Aggregate__NameAssignment_2");
					put(grammarAccess.getAggregateAccess().getIdTypeAssignment_4(), "rule__Aggregate__IdTypeAssignment_4");
					put(grammarAccess.getAggregateAccess().getMetaInfoAssignment_6(), "rule__Aggregate__MetaInfoAssignment_6");
					put(grammarAccess.getAggregateAccess().getVariablesAssignment_7(), "rule__Aggregate__VariablesAssignment_7");
					put(grammarAccess.getAggregateAccess().getConstructorsAssignment_8(), "rule__Aggregate__ConstructorsAssignment_8");
					put(grammarAccess.getAggregateAccess().getMethodsAssignment_9(), "rule__Aggregate__MethodsAssignment_9");
					put(grammarAccess.getConstructorAccess().getDocAssignment_0(), "rule__Constructor__DocAssignment_0");
					put(grammarAccess.getConstructorAccess().getNameAssignment_2(), "rule__Constructor__NameAssignment_2");
					put(grammarAccess.getConstructorAccess().getVariablesAssignment_4(), "rule__Constructor__VariablesAssignment_4");
					put(grammarAccess.getConstructorAccess().getServiceAssignment_5(), "rule__Constructor__ServiceAssignment_5");
					put(grammarAccess.getConstructorAccess().getConstraintsAssignment_6(), "rule__Constructor__ConstraintsAssignment_6");
					put(grammarAccess.getConstructorAccess().getEventsAssignment_7(), "rule__Constructor__EventsAssignment_7");
					put(grammarAccess.getReturnTypeAccess().getDocAssignment_0(), "rule__ReturnType__DocAssignment_0");
					put(grammarAccess.getReturnTypeAccess().getTypeAssignment_2(), "rule__ReturnType__TypeAssignment_2");
					put(grammarAccess.getMethodAccess().getDocAssignment_0(), "rule__Method__DocAssignment_0");
					put(grammarAccess.getMethodAccess().getNameAssignment_2(), "rule__Method__NameAssignment_2");
					put(grammarAccess.getMethodAccess().getRefMethodAssignment_3_1(), "rule__Method__RefMethodAssignment_3_1");
					put(grammarAccess.getMethodAccess().getVariablesAssignment_5(), "rule__Method__VariablesAssignment_5");
					put(grammarAccess.getMethodAccess().getServiceAssignment_6(), "rule__Method__ServiceAssignment_6");
					put(grammarAccess.getMethodAccess().getReturnTypeAssignment_7(), "rule__Method__ReturnTypeAssignment_7");
					put(grammarAccess.getMethodAccess().getConstraintsAssignment_8(), "rule__Method__ConstraintsAssignment_8");
					put(grammarAccess.getMethodAccess().getEventsAssignment_9(), "rule__Method__EventsAssignment_9");
					put(grammarAccess.getEventAccess().getDocAssignment_0(), "rule__Event__DocAssignment_0");
					put(grammarAccess.getEventAccess().getNameAssignment_2(), "rule__Event__NameAssignment_2");
					put(grammarAccess.getEventAccess().getVariablesAssignment_4(), "rule__Event__VariablesAssignment_4");
					put(grammarAccess.getEventAccess().getMessageAssignment_5_1(), "rule__Event__MessageAssignment_5_1");
					put(grammarAccess.getTypeMetaInfoAccess().getSlabelAssignment_1_1(), "rule__TypeMetaInfo__SlabelAssignment_1_1");
					put(grammarAccess.getTypeMetaInfoAccess().getLabelAssignment_2_1(), "rule__TypeMetaInfo__LabelAssignment_2_1");
					put(grammarAccess.getTypeMetaInfoAccess().getTooltipAssignment_3_1(), "rule__TypeMetaInfo__TooltipAssignment_3_1");
					put(grammarAccess.getTypeMetaInfoAccess().getPromptAssignment_4_1(), "rule__TypeMetaInfo__PromptAssignment_4_1");
					put(grammarAccess.getTypeMetaInfoAccess().getExamplesAssignment_5_1(), "rule__TypeMetaInfo__ExamplesAssignment_5_1");
					put(grammarAccess.getVariableAccess().getDocAssignment_0(), "rule__Variable__DocAssignment_0");
					put(grammarAccess.getVariableAccess().getNullableAssignment_1(), "rule__Variable__NullableAssignment_1");
					put(grammarAccess.getVariableAccess().getTypeAssignment_2(), "rule__Variable__TypeAssignment_2");
					put(grammarAccess.getVariableAccess().getMultiplicityAssignment_3(), "rule__Variable__MultiplicityAssignment_3");
					put(grammarAccess.getVariableAccess().getNameAssignment_4(), "rule__Variable__NameAssignment_4");
					put(grammarAccess.getVariableAccess().getInvariantsAssignment_5(), "rule__Variable__InvariantsAssignment_5");
					put(grammarAccess.getVariableAccess().getOverriddenAssignment_6(), "rule__Variable__OverriddenAssignment_6");
					put(grammarAccess.getConstraintsAccess().getCallsAssignment_2(), "rule__Constraints__CallsAssignment_2");
					put(grammarAccess.getConstraintsAccess().getCallsAssignment_3_1(), "rule__Constraints__CallsAssignment_3_1");
					put(grammarAccess.getInvariantsAccess().getCallsAssignment_1(), "rule__Invariants__CallsAssignment_1");
					put(grammarAccess.getInvariantsAccess().getCallsAssignment_2_1(), "rule__Invariants__CallsAssignment_2_1");
					put(grammarAccess.getOverriddenTypeMetaInfoAccess().getMetaInfoAssignment_1(), "rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1");
					put(grammarAccess.getConstraintCallAccess().getConstraintAssignment_0(), "rule__ConstraintCall__ConstraintAssignment_0");
					put(grammarAccess.getConstraintCallAccess().getParamsAssignment_1_1(), "rule__ConstraintCall__ParamsAssignment_1_1");
					put(grammarAccess.getConstraintCallAccess().getParamsAssignment_1_2_1(), "rule__ConstraintCall__ParamsAssignment_1_2_1");
					put(grammarAccess.getServiceAccess().getDocAssignment_0(), "rule__Service__DocAssignment_0");
					put(grammarAccess.getServiceAccess().getNameAssignment_2(), "rule__Service__NameAssignment_2");
					put(grammarAccess.getServiceAccess().getMethodsAssignment_4(), "rule__Service__MethodsAssignment_4");
					put(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1(), "rule__BooleanLiteral__ValueAssignment_1");
					put(grammarAccess.getNullLiteralAccess().getValueAssignment_1(), "rule__NullLiteral__ValueAssignment_1");
					put(grammarAccess.getNumberLiteralAccess().getValueAssignment_1(), "rule__NumberLiteral__ValueAssignment_1");
					put(grammarAccess.getStringLiteralAccess().getValueAssignment_1(), "rule__StringLiteral__ValueAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.fuin.dsl.ddd.ui.contentassist.antlr.internal.InternalDomainDrivenDesignDslParser typedParser = (org.fuin.dsl.ddd.ui.contentassist.antlr.internal.InternalDomainDrivenDesignDslParser) parser;
			typedParser.entryRuleDomainModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DomainDrivenDesignDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DomainDrivenDesignDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
