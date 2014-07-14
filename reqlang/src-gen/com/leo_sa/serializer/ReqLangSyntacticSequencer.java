package com.leo_sa.serializer;

import com.google.inject.Inject;
import com.leo_sa.services.ReqLangGrammarAccess;
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

@SuppressWarnings("all")
public class ReqLangSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ReqLangGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Class_HyphenMinusKeyword_2_p;
	protected AbstractElementAlias match_Function_CommaKeyword_2_1_q;
	protected AbstractElementAlias match_Module_EqualsSignKeyword_1_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ReqLangGrammarAccess) access;
		match_Class_HyphenMinusKeyword_2_p = new TokenAlias(true, false, grammarAccess.getClassAccess().getHyphenMinusKeyword_2());
		match_Function_CommaKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getFunctionAccess().getCommaKeyword_2_1());
		match_Module_EqualsSignKeyword_1_p = new TokenAlias(true, false, grammarAccess.getModuleAccess().getEqualsSignKeyword_1());
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
			if(match_Class_HyphenMinusKeyword_2_p.equals(syntax))
				emit_Class_HyphenMinusKeyword_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Function_CommaKeyword_2_1_q.equals(syntax))
				emit_Function_CommaKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Module_EqualsSignKeyword_1_p.equals(syntax))
				emit_Module_EqualsSignKeyword_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '-'+
	 */
	protected void emit_Class_HyphenMinusKeyword_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_Function_CommaKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '='+
	 */
	protected void emit_Module_EqualsSignKeyword_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
