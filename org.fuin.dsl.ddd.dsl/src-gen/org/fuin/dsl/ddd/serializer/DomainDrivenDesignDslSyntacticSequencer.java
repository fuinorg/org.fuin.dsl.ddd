package org.fuin.dsl.ddd.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.fuin.dsl.ddd.services.DomainDrivenDesignDslGrammarAccess;

@SuppressWarnings("all")
public class DomainDrivenDesignDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DomainDrivenDesignDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_TypeMetaInfo_ExamplesKeyword_5_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DomainDrivenDesignDslGrammarAccess) access;
		match_TypeMetaInfo_ExamplesKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getTypeMetaInfoAccess().getExamplesKeyword_5_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_TypeMetaInfo_ExamplesKeyword_5_0_q.equals(syntax))
				emit_TypeMetaInfo_ExamplesKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'examples'?
	 */
	protected void emit_TypeMetaInfo_ExamplesKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
