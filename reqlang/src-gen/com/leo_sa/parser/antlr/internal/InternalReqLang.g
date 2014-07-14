/*
* generated by Xtext
*/
grammar InternalReqLang;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package com.leo_sa.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.leo_sa.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.leo_sa.services.ReqLangGrammarAccess;

}

@parser::members {

 	private ReqLangGrammarAccess grammarAccess;
 	
    public InternalReqLangParser(TokenStream input, ReqLangGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected ReqLangGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getModulesModuleParserRuleCall_0()); 
	    }
		lv_modules_0_0=ruleModule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"modules",
        		lv_modules_0_0, 
        		"Module");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleModule
entryRuleModule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModuleRule()); }
	 iv_ruleModule=ruleModule 
	 { $current=$iv_ruleModule.current; } 
	 EOF 
;

// Rule Module
ruleModule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getModuleAccess().getPrefixParserRuleCall_0()); 
    }
    this_Prefix_0=rulePrefix
    { 
        $current = $this_Prefix_0.current; 
        afterParserOrEnumRuleCall();
    }
(	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getEqualsSignKeyword_1());
    }
)+((
(
		{ 
	        newCompositeNode(grammarAccess.getModuleAccess().getFunctionsFunctionParserRuleCall_2_0_0()); 
	    }
		lv_functions_2_0=ruleFunction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleRule());
	        }
       		add(
       			$current, 
       			"functions",
        		lv_functions_2_0, 
        		"Function");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getModuleAccess().getClassesClassParserRuleCall_2_1_0()); 
	    }
		lv_classes_3_0=ruleClass		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleRule());
	        }
       		add(
       			$current, 
       			"classes",
        		lv_classes_3_0, 
        		"Class");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleClass
entryRuleClass returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getClassRule()); }
	 iv_ruleClass=ruleClass 
	 { $current=$iv_ruleClass.current; } 
	 EOF 
;

// Rule Class
ruleClass returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getClassAccess().getPrefixParserRuleCall_0()); 
    }
    this_Prefix_0=rulePrefix
    { 
        $current = $this_Prefix_0.current; 
        afterParserOrEnumRuleCall();
    }
(	otherlv_1=':' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getClassAccess().getColonKeyword_1_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getClassRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getClassAccess().getReturnTypeClassCrossReference_1_1_0()); 
	}

)
))?(	otherlv_3='-' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getClassAccess().getHyphenMinusKeyword_2());
    }
)+(
(
		{ 
	        newCompositeNode(grammarAccess.getClassAccess().getPropertiesPropertyParserRuleCall_3_0()); 
	    }
		lv_properties_4_0=ruleProperty		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClassRule());
	        }
       		add(
       			$current, 
       			"properties",
        		lv_properties_4_0, 
        		"Property");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getClassAccess().getFunctionsFunctionParserRuleCall_4_0()); 
	    }
		lv_functions_5_0=ruleFunction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClassRule());
	        }
       		add(
       			$current, 
       			"functions",
        		lv_functions_5_0, 
        		"Function");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleProperty
entryRuleProperty returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPropertyRule()); }
	 iv_ruleProperty=ruleProperty 
	 { $current=$iv_ruleProperty.current; } 
	 EOF 
;

// Rule Property
ruleProperty returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getPropertyAccess().getPrefixParserRuleCall_0()); 
    }
    this_Prefix_0=rulePrefix
    { 
        $current = $this_Prefix_0.current; 
        afterParserOrEnumRuleCall();
    }
	otherlv_1=':' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPropertyRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getReturnTypeClassCrossReference_2_0()); 
	}

)
))
;





// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	 iv_ruleFunction=ruleFunction 
	 { $current=$iv_ruleFunction.current; } 
	 EOF 
;

// Rule Function
ruleFunction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getFunctionAccess().getPrefixParserRuleCall_0()); 
    }
    this_Prefix_0=rulePrefix
    { 
        $current = $this_Prefix_0.current; 
        afterParserOrEnumRuleCall();
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1());
    }
((
(
		lv_args_2_0=RULE_ID
		{
			newLeafNode(lv_args_2_0, grammarAccess.getFunctionAccess().getArgsIDTerminalRuleCall_2_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"args",
        		lv_args_2_0, 
        		"ID");
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getCommaKeyword_2_1());
    }
)?)*	otherlv_4=')' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3());
    }
(	otherlv_5=':' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getColonKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionRule());
	        }
        }
	otherlv_6=RULE_ID
	{
		newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getReturnTypeClassCrossReference_4_1_0()); 
	}

)
))?(
(
		lv_description_7_0=RULE_DESC
		{
			newLeafNode(lv_description_7_0, grammarAccess.getFunctionAccess().getDescriptionDESCTerminalRuleCall_5_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_7_0, 
        		"DESC");
	    }

)
)*)
;





// Entry rule entryRulePrefix
entryRulePrefix returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPrefixRule()); }
	 iv_rulePrefix=rulePrefix 
	 { $current=$iv_rulePrefix.current; } 
	 EOF 
;

// Rule Prefix
rulePrefix returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getPrefixAccess().getActionActionEnumRuleCall_0_0()); 
	    }
		lv_action_0_0=ruleAction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPrefixRule());
	        }
       		set(
       			$current, 
       			"action",
        		lv_action_0_0, 
        		"Action");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getPrefixAccess().getModifiersModifierParserRuleCall_1_0()); 
	    }
		lv_modifiers_1_0=ruleModifier		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPrefixRule());
	        }
       		set(
       			$current, 
       			"modifiers",
        		lv_modifiers_1_0, 
        		"Modifier");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getPrefixAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPrefixRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleModifier
entryRuleModifier returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModifierRule()); }
	 iv_ruleModifier=ruleModifier 
	 { $current=$iv_ruleModifier.current; } 
	 EOF 
;

// Rule Modifier
ruleModifier returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getModifierAccess().getUnorderedGroup());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getModifierAccess().getUnorderedGroup(), 0);
	 				}
					({true}?=>(
(
		lv_private_1_0=	'p' 
    {
        newLeafNode(lv_private_1_0, grammarAccess.getModifierAccess().getPrivatePKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModifierRule());
	        }
       		setWithLastConsumed($current, "private", true, "p");
	    }

)
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModifierAccess().getUnorderedGroup());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getModifierAccess().getUnorderedGroup(), 1);
	 				}
					({true}?=>(
(
		lv_abstract_2_0=	'@' 
    {
        newLeafNode(lv_abstract_2_0, grammarAccess.getModifierAccess().getAbstractCommercialAtKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModifierRule());
	        }
       		setWithLastConsumed($current, "abstract", true, "@");
	    }

)
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModifierAccess().getUnorderedGroup());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getModifierAccess().getUnorderedGroup(), 2);
	 				}
					({true}?=>(
(
		lv_static_3_0=	'$' 
    {
        newLeafNode(lv_static_3_0, grammarAccess.getModifierAccess().getStaticDollarSignKeyword_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModifierRule());
	        }
       		setWithLastConsumed($current, "static", true, "\$");
	    }

)
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModifierAccess().getUnorderedGroup());
	 				}
 				)
			)  

		)*	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getModifierAccess().getUnorderedGroup());
	}

)
;





// Rule Action
ruleAction returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='+' 
	{
        $current = grammarAccess.getActionAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getActionAccess().getAddEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='-' 
	{
        $current = grammarAccess.getActionAccess().getRemoveEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getActionAccess().getRemoveEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='^' 
	{
        $current = grammarAccess.getActionAccess().getModifyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getActionAccess().getModifyEnumLiteralDeclaration_2()); 
    }
));



RULE_DESC : '*' ~(('\n'|'\r'))* ('\r' '\n')?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


