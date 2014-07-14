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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReqLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DESC", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "':'", "'-'", "'('", "','", "')'", "'p'", "'@'", "'$'", "'+'", "'^'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_DESC=5;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalReqLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalReqLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalReqLangParser.tokenNames; }
    public String getGrammarFileName() { return "../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g"; }



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



    // $ANTLR start "entryRuleModel"
    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:77:1: ruleModel returns [EObject current=null] : ( (lv_modules_0_0= ruleModule ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_modules_0_0 = null;


         enterRule(); 
            
        try {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:80:28: ( ( (lv_modules_0_0= ruleModule ) )* )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:81:1: ( (lv_modules_0_0= ruleModule ) )*
            {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:81:1: ( (lv_modules_0_0= ruleModule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||(LA1_0>=21 && LA1_0<=22)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:82:1: (lv_modules_0_0= ruleModule )
            	    {
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:82:1: (lv_modules_0_0= ruleModule )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:83:3: lv_modules_0_0= ruleModule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getModulesModuleParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModule_in_ruleModel130);
            	    lv_modules_0_0=ruleModule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"modules",
            	            		lv_modules_0_0, 
            	            		"Module");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleModule"
    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:107:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:108:2: (iv_ruleModule= ruleModule EOF )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:109:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule166);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:116:1: ruleModule returns [EObject current=null] : (this_Prefix_0= rulePrefix (otherlv_1= '=' )+ ( ( (lv_functions_2_0= ruleFunction ) ) | ( (lv_classes_3_0= ruleClass ) ) )* ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Prefix_0 = null;

        EObject lv_functions_2_0 = null;

        EObject lv_classes_3_0 = null;


         enterRule(); 
            
        try {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:119:28: ( (this_Prefix_0= rulePrefix (otherlv_1= '=' )+ ( ( (lv_functions_2_0= ruleFunction ) ) | ( (lv_classes_3_0= ruleClass ) ) )* ) )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:120:1: (this_Prefix_0= rulePrefix (otherlv_1= '=' )+ ( ( (lv_functions_2_0= ruleFunction ) ) | ( (lv_classes_3_0= ruleClass ) ) )* )
            {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:120:1: (this_Prefix_0= rulePrefix (otherlv_1= '=' )+ ( ( (lv_functions_2_0= ruleFunction ) ) | ( (lv_classes_3_0= ruleClass ) ) )* )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:121:5: this_Prefix_0= rulePrefix (otherlv_1= '=' )+ ( ( (lv_functions_2_0= ruleFunction ) ) | ( (lv_classes_3_0= ruleClass ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getModuleAccess().getPrefixParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrefix_in_ruleModule223);
            this_Prefix_0=rulePrefix();

            state._fsp--;

             
                    current = this_Prefix_0; 
                    afterParserOrEnumRuleCall();
                
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:129:1: (otherlv_1= '=' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:129:3: otherlv_1= '='
            	    {
            	    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleModule235); 

            	        	newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getEqualsSignKeyword_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:133:3: ( ( (lv_functions_2_0= ruleFunction ) ) | ( (lv_classes_3_0= ruleClass ) ) )*
            loop3:
            do {
                int alt3=3;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:133:4: ( (lv_functions_2_0= ruleFunction ) )
            	    {
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:133:4: ( (lv_functions_2_0= ruleFunction ) )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:134:1: (lv_functions_2_0= ruleFunction )
            	    {
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:134:1: (lv_functions_2_0= ruleFunction )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:135:3: lv_functions_2_0= ruleFunction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleAccess().getFunctionsFunctionParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunction_in_ruleModule259);
            	    lv_functions_2_0=ruleFunction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"functions",
            	            		lv_functions_2_0, 
            	            		"Function");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:152:6: ( (lv_classes_3_0= ruleClass ) )
            	    {
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:152:6: ( (lv_classes_3_0= ruleClass ) )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:153:1: (lv_classes_3_0= ruleClass )
            	    {
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:153:1: (lv_classes_3_0= ruleClass )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:154:3: lv_classes_3_0= ruleClass
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleAccess().getClassesClassParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleClass_in_ruleModule286);
            	    lv_classes_3_0=ruleClass();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"classes",
            	            		lv_classes_3_0, 
            	            		"Class");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleClass"
    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:178:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:179:2: (iv_ruleClass= ruleClass EOF )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:180:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass324);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass334); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:187:1: ruleClass returns [EObject current=null] : (this_Prefix_0= rulePrefix (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '-' )+ ( (lv_properties_4_0= ruleProperty ) )* ( (lv_functions_5_0= ruleFunction ) )* ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Prefix_0 = null;

        EObject lv_properties_4_0 = null;

        EObject lv_functions_5_0 = null;


         enterRule(); 
            
        try {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:190:28: ( (this_Prefix_0= rulePrefix (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '-' )+ ( (lv_properties_4_0= ruleProperty ) )* ( (lv_functions_5_0= ruleFunction ) )* ) )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:191:1: (this_Prefix_0= rulePrefix (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '-' )+ ( (lv_properties_4_0= ruleProperty ) )* ( (lv_functions_5_0= ruleFunction ) )* )
            {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:191:1: (this_Prefix_0= rulePrefix (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '-' )+ ( (lv_properties_4_0= ruleProperty ) )* ( (lv_functions_5_0= ruleFunction ) )* )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:192:5: this_Prefix_0= rulePrefix (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '-' )+ ( (lv_properties_4_0= ruleProperty ) )* ( (lv_functions_5_0= ruleFunction ) )*
            {
             
                    newCompositeNode(grammarAccess.getClassAccess().getPrefixParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrefix_in_ruleClass381);
            this_Prefix_0=rulePrefix();

            state._fsp--;

             
                    current = this_Prefix_0; 
                    afterParserOrEnumRuleCall();
                
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:200:1: (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:200:3: otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleClass393); 

                        	newLeafNode(otherlv_1, grammarAccess.getClassAccess().getColonKeyword_1_0());
                        
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:204:1: ( (otherlv_2= RULE_ID ) )
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:205:1: (otherlv_2= RULE_ID )
                    {
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:205:1: (otherlv_2= RULE_ID )
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:206:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass413); 

                    		newLeafNode(otherlv_2, grammarAccess.getClassAccess().getReturnTypeClassCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:217:4: (otherlv_3= '-' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==EOF||LA5_2==14||(LA5_2>=21 && LA5_2<=22)) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:217:6: otherlv_3= '-'
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleClass428); 

            	        	newLeafNode(otherlv_3, grammarAccess.getClassAccess().getHyphenMinusKeyword_2());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:221:3: ( (lv_properties_4_0= ruleProperty ) )*
            loop6:
            do {
                int alt6=2;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:222:1: (lv_properties_4_0= ruleProperty )
            	    {
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:222:1: (lv_properties_4_0= ruleProperty )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:223:3: lv_properties_4_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleClass451);
            	    lv_properties_4_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_4_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:239:3: ( (lv_functions_5_0= ruleFunction ) )*
            loop7:
            do {
                int alt7=2;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:240:1: (lv_functions_5_0= ruleFunction )
            	    {
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:240:1: (lv_functions_5_0= ruleFunction )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:241:3: lv_functions_5_0= ruleFunction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassAccess().getFunctionsFunctionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunction_in_ruleClass473);
            	    lv_functions_5_0=ruleFunction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"functions",
            	            		lv_functions_5_0, 
            	            		"Function");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleProperty"
    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:265:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:266:2: (iv_ruleProperty= ruleProperty EOF )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:267:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty510);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty520); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:274:1: ruleProperty returns [EObject current=null] : (this_Prefix_0= rulePrefix otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_Prefix_0 = null;


         enterRule(); 
            
        try {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:277:28: ( (this_Prefix_0= rulePrefix otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:278:1: (this_Prefix_0= rulePrefix otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:278:1: (this_Prefix_0= rulePrefix otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:279:5: this_Prefix_0= rulePrefix otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
             
                    newCompositeNode(grammarAccess.getPropertyAccess().getPrefixParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrefix_in_ruleProperty567);
            this_Prefix_0=rulePrefix();

            state._fsp--;

             
                    current = this_Prefix_0; 
                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleProperty578); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonKeyword_1());
                
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:291:1: ( (otherlv_2= RULE_ID ) )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:292:1: (otherlv_2= RULE_ID )
            {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:292:1: (otherlv_2= RULE_ID )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:293:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty598); 

            		newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getReturnTypeClassCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleFunction"
    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:312:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:313:2: (iv_ruleFunction= ruleFunction EOF )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:314:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction634);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction644); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:321:1: ruleFunction returns [EObject current=null] : (this_Prefix_0= rulePrefix otherlv_1= '(' ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' )? )* otherlv_4= ')' (otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) )? ( (lv_description_7_0= RULE_DESC ) )* ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_args_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        EObject this_Prefix_0 = null;


         enterRule(); 
            
        try {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:324:28: ( (this_Prefix_0= rulePrefix otherlv_1= '(' ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' )? )* otherlv_4= ')' (otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) )? ( (lv_description_7_0= RULE_DESC ) )* ) )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:325:1: (this_Prefix_0= rulePrefix otherlv_1= '(' ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' )? )* otherlv_4= ')' (otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) )? ( (lv_description_7_0= RULE_DESC ) )* )
            {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:325:1: (this_Prefix_0= rulePrefix otherlv_1= '(' ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' )? )* otherlv_4= ')' (otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) )? ( (lv_description_7_0= RULE_DESC ) )* )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:326:5: this_Prefix_0= rulePrefix otherlv_1= '(' ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' )? )* otherlv_4= ')' (otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) )? ( (lv_description_7_0= RULE_DESC ) )*
            {
             
                    newCompositeNode(grammarAccess.getFunctionAccess().getPrefixParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrefix_in_ruleFunction691);
            this_Prefix_0=rulePrefix();

            state._fsp--;

             
                    current = this_Prefix_0; 
                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleFunction702); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1());
                
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:338:1: ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' )? )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:338:2: ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' )?
            	    {
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:338:2: ( (lv_args_2_0= RULE_ID ) )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:339:1: (lv_args_2_0= RULE_ID )
            	    {
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:339:1: (lv_args_2_0= RULE_ID )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:340:3: lv_args_2_0= RULE_ID
            	    {
            	    lv_args_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction720); 

            	    			newLeafNode(lv_args_2_0, grammarAccess.getFunctionAccess().getArgsIDTerminalRuleCall_2_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFunctionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"args",
            	            		lv_args_2_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:356:2: (otherlv_3= ',' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==16) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:356:4: otherlv_3= ','
            	            {
            	            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleFunction738); 

            	                	newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getCommaKeyword_2_1());
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleFunction754); 

                	newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3());
                
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:364:1: (otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:364:3: otherlv_5= ':' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleFunction767); 

                        	newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getColonKeyword_4_0());
                        
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:368:1: ( (otherlv_6= RULE_ID ) )
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:369:1: (otherlv_6= RULE_ID )
                    {
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:369:1: (otherlv_6= RULE_ID )
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:370:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction787); 

                    		newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getReturnTypeClassCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:381:4: ( (lv_description_7_0= RULE_DESC ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_DESC) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:382:1: (lv_description_7_0= RULE_DESC )
            	    {
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:382:1: (lv_description_7_0= RULE_DESC )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:383:3: lv_description_7_0= RULE_DESC
            	    {
            	    lv_description_7_0=(Token)match(input,RULE_DESC,FOLLOW_RULE_DESC_in_ruleFunction806); 

            	    			newLeafNode(lv_description_7_0, grammarAccess.getFunctionAccess().getDescriptionDESCTerminalRuleCall_5_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFunctionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_7_0, 
            	            		"DESC");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRulePrefix"
    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:407:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:408:2: (iv_rulePrefix= rulePrefix EOF )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:409:2: iv_rulePrefix= rulePrefix EOF
            {
             newCompositeNode(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix848);
            iv_rulePrefix=rulePrefix();

            state._fsp--;

             current =iv_rulePrefix; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix858); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:416:1: rulePrefix returns [EObject current=null] : ( ( (lv_action_0_0= ruleAction ) ) ( (lv_modifiers_1_0= ruleModifier ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Enumerator lv_action_0_0 = null;

        EObject lv_modifiers_1_0 = null;


         enterRule(); 
            
        try {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:419:28: ( ( ( (lv_action_0_0= ruleAction ) ) ( (lv_modifiers_1_0= ruleModifier ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:420:1: ( ( (lv_action_0_0= ruleAction ) ) ( (lv_modifiers_1_0= ruleModifier ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:420:1: ( ( (lv_action_0_0= ruleAction ) ) ( (lv_modifiers_1_0= ruleModifier ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:420:2: ( (lv_action_0_0= ruleAction ) ) ( (lv_modifiers_1_0= ruleModifier ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:420:2: ( (lv_action_0_0= ruleAction ) )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:421:1: (lv_action_0_0= ruleAction )
            {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:421:1: (lv_action_0_0= ruleAction )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:422:3: lv_action_0_0= ruleAction
            {
             
            	        newCompositeNode(grammarAccess.getPrefixAccess().getActionActionEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAction_in_rulePrefix904);
            lv_action_0_0=ruleAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrefixRule());
            	        }
                   		set(
                   			current, 
                   			"action",
                    		lv_action_0_0, 
                    		"Action");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:438:2: ( (lv_modifiers_1_0= ruleModifier ) )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:439:1: (lv_modifiers_1_0= ruleModifier )
            {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:439:1: (lv_modifiers_1_0= ruleModifier )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:440:3: lv_modifiers_1_0= ruleModifier
            {
             
            	        newCompositeNode(grammarAccess.getPrefixAccess().getModifiersModifierParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleModifier_in_rulePrefix925);
            lv_modifiers_1_0=ruleModifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrefixRule());
            	        }
                   		set(
                   			current, 
                   			"modifiers",
                    		lv_modifiers_1_0, 
                    		"Modifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:456:2: ( (lv_name_2_0= RULE_ID ) )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:457:1: (lv_name_2_0= RULE_ID )
            {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:457:1: (lv_name_2_0= RULE_ID )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:458:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrefix942); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPrefixAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrefixRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleModifier"
    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:482:1: entryRuleModifier returns [EObject current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final EObject entryRuleModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifier = null;


        try {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:483:2: (iv_ruleModifier= ruleModifier EOF )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:484:2: iv_ruleModifier= ruleModifier EOF
            {
             newCompositeNode(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier983);
            iv_ruleModifier=ruleModifier();

            state._fsp--;

             current =iv_ruleModifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier993); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:491:1: ruleModifier returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_private_1_0= 'p' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_2_0= '@' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_3_0= '$' ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleModifier() throws RecognitionException {
        EObject current = null;

        Token lv_private_1_0=null;
        Token lv_abstract_2_0=null;
        Token lv_static_3_0=null;

         enterRule(); 
            
        try {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:494:28: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_private_1_0= 'p' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_2_0= '@' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_3_0= '$' ) ) ) ) ) )* ) ) ) )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:495:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_private_1_0= 'p' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_2_0= '@' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_3_0= '$' ) ) ) ) ) )* ) ) )
            {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:495:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_private_1_0= 'p' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_2_0= '@' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_3_0= '$' ) ) ) ) ) )* ) ) )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:497:1: ( ( ( ({...}? => ( ({...}? => ( (lv_private_1_0= 'p' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_2_0= '@' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_3_0= '$' ) ) ) ) ) )* ) )
            {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:497:1: ( ( ( ({...}? => ( ({...}? => ( (lv_private_1_0= 'p' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_2_0= '@' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_3_0= '$' ) ) ) ) ) )* ) )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:498:2: ( ( ({...}? => ( ({...}? => ( (lv_private_1_0= 'p' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_2_0= '@' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_3_0= '$' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getModifierAccess().getUnorderedGroup());
            	
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:501:2: ( ( ({...}? => ( ({...}? => ( (lv_private_1_0= 'p' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_2_0= '@' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_3_0= '$' ) ) ) ) ) )* )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:502:3: ( ({...}? => ( ({...}? => ( (lv_private_1_0= 'p' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_2_0= '@' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_3_0= '$' ) ) ) ) ) )*
            {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:502:3: ( ({...}? => ( ({...}? => ( (lv_private_1_0= 'p' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_2_0= '@' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_3_0= '$' ) ) ) ) ) )*
            loop12:
            do {
                int alt12=4;
                int LA12_0 = input.LA(1);

                if ( LA12_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 0) ) {
                    alt12=1;
                }
                else if ( LA12_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 1) ) {
                    alt12=2;
                }
                else if ( LA12_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 2) ) {
                    alt12=3;
                }


                switch (alt12) {
            	case 1 :
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:504:4: ({...}? => ( ({...}? => ( (lv_private_1_0= 'p' ) ) ) ) )
            	    {
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:504:4: ({...}? => ( ({...}? => ( (lv_private_1_0= 'p' ) ) ) ) )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:505:5: {...}? => ( ({...}? => ( (lv_private_1_0= 'p' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleModifier", "getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:505:103: ( ({...}? => ( (lv_private_1_0= 'p' ) ) ) )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:506:6: ({...}? => ( (lv_private_1_0= 'p' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getModifierAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:509:6: ({...}? => ( (lv_private_1_0= 'p' ) ) )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:509:7: {...}? => ( (lv_private_1_0= 'p' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModifier", "true");
            	    }
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:509:16: ( (lv_private_1_0= 'p' ) )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:510:1: (lv_private_1_0= 'p' )
            	    {
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:510:1: (lv_private_1_0= 'p' )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:511:3: lv_private_1_0= 'p'
            	    {
            	    lv_private_1_0=(Token)match(input,18,FOLLOW_18_in_ruleModifier1080); 

            	            newLeafNode(lv_private_1_0, grammarAccess.getModifierAccess().getPrivatePKeyword_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getModifierRule());
            	    	        }
            	           		setWithLastConsumed(current, "private", true, "p");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModifierAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:531:4: ({...}? => ( ({...}? => ( (lv_abstract_2_0= '@' ) ) ) ) )
            	    {
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:531:4: ({...}? => ( ({...}? => ( (lv_abstract_2_0= '@' ) ) ) ) )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:532:5: {...}? => ( ({...}? => ( (lv_abstract_2_0= '@' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleModifier", "getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:532:103: ( ({...}? => ( (lv_abstract_2_0= '@' ) ) ) )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:533:6: ({...}? => ( (lv_abstract_2_0= '@' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getModifierAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:536:6: ({...}? => ( (lv_abstract_2_0= '@' ) ) )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:536:7: {...}? => ( (lv_abstract_2_0= '@' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModifier", "true");
            	    }
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:536:16: ( (lv_abstract_2_0= '@' ) )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:537:1: (lv_abstract_2_0= '@' )
            	    {
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:537:1: (lv_abstract_2_0= '@' )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:538:3: lv_abstract_2_0= '@'
            	    {
            	    lv_abstract_2_0=(Token)match(input,19,FOLLOW_19_in_ruleModifier1165); 

            	            newLeafNode(lv_abstract_2_0, grammarAccess.getModifierAccess().getAbstractCommercialAtKeyword_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getModifierRule());
            	    	        }
            	           		setWithLastConsumed(current, "abstract", true, "@");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModifierAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:558:4: ({...}? => ( ({...}? => ( (lv_static_3_0= '$' ) ) ) ) )
            	    {
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:558:4: ({...}? => ( ({...}? => ( (lv_static_3_0= '$' ) ) ) ) )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:559:5: {...}? => ( ({...}? => ( (lv_static_3_0= '$' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleModifier", "getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:559:103: ( ({...}? => ( (lv_static_3_0= '$' ) ) ) )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:560:6: ({...}? => ( (lv_static_3_0= '$' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getModifierAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:563:6: ({...}? => ( (lv_static_3_0= '$' ) ) )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:563:7: {...}? => ( (lv_static_3_0= '$' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModifier", "true");
            	    }
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:563:16: ( (lv_static_3_0= '$' ) )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:564:1: (lv_static_3_0= '$' )
            	    {
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:564:1: (lv_static_3_0= '$' )
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:565:3: lv_static_3_0= '$'
            	    {
            	    lv_static_3_0=(Token)match(input,20,FOLLOW_20_in_ruleModifier1250); 

            	            newLeafNode(lv_static_3_0, grammarAccess.getModifierAccess().getStaticDollarSignKeyword_2_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getModifierRule());
            	    	        }
            	           		setWithLastConsumed(current, "static", true, "$");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModifierAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getModifierAccess().getUnorderedGroup());
            	

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModifier"


    // $ANTLR start "ruleAction"
    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:600:1: ruleAction returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '^' ) ) ;
    public final Enumerator ruleAction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:602:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '^' ) ) )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:603:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '^' ) )
            {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:603:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '^' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt13=1;
                }
                break;
            case 14:
                {
                alt13=2;
                }
                break;
            case 22:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:603:2: (enumLiteral_0= '+' )
                    {
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:603:2: (enumLiteral_0= '+' )
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:603:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_21_in_ruleAction1352); 

                            current = grammarAccess.getActionAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getActionAccess().getAddEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:609:6: (enumLiteral_1= '-' )
                    {
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:609:6: (enumLiteral_1= '-' )
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:609:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,14,FOLLOW_14_in_ruleAction1369); 

                            current = grammarAccess.getActionAccess().getRemoveEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getActionAccess().getRemoveEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:615:6: (enumLiteral_2= '^' )
                    {
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:615:6: (enumLiteral_2= '^' )
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:615:8: enumLiteral_2= '^'
                    {
                    enumLiteral_2=(Token)match(input,22,FOLLOW_22_in_ruleAction1386); 

                            current = grammarAccess.getActionAccess().getModifyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getActionAccess().getModifyEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA3_eotS =
        "\13\uffff";
    static final String DFA3_eofS =
        "\1\1\12\uffff";
    static final String DFA3_minS =
        "\1\16\1\uffff\6\4\1\14\2\uffff";
    static final String DFA3_maxS =
        "\1\26\1\uffff\6\24\1\17\2\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\3\7\uffff\1\2\1\1";
    static final String DFA3_specialS =
        "\13\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\3\6\uffff\1\2\1\4",
            "",
            "\1\10\15\uffff\1\5\1\6\1\7",
            "\1\10\15\uffff\1\5\1\6\1\7",
            "\1\10\15\uffff\1\5\1\6\1\7",
            "\1\10\15\uffff\1\5\1\6\1\7",
            "\1\10\15\uffff\1\5\1\6\1\7",
            "\1\10\15\uffff\1\5\1\6\1\7",
            "\1\1\2\11\1\12",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()* loopback of 133:3: ( ( (lv_functions_2_0= ruleFunction ) ) | ( (lv_classes_3_0= ruleClass ) ) )*";
        }
    }
    static final String DFA6_eotS =
        "\15\uffff";
    static final String DFA6_eofS =
        "\1\4\11\uffff\1\13\1\uffff\1\4";
    static final String DFA6_minS =
        "\1\16\3\4\1\uffff\3\4\1\14\1\4\1\16\1\uffff\1\4";
    static final String DFA6_maxS =
        "\1\26\3\24\1\uffff\3\24\1\17\1\4\1\26\1\uffff\1\26";
    static final String DFA6_acceptS =
        "\4\uffff\1\2\6\uffff\1\1\1\uffff";
    static final String DFA6_specialS =
        "\15\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\6\uffff\1\1\1\3",
            "\1\10\15\uffff\1\5\1\6\1\7",
            "\1\10\15\uffff\1\5\1\6\1\7",
            "\1\10\15\uffff\1\5\1\6\1\7",
            "",
            "\1\10\15\uffff\1\5\1\6\1\7",
            "\1\10\15\uffff\1\5\1\6\1\7",
            "\1\10\15\uffff\1\5\1\6\1\7",
            "\1\4\1\11\2\4",
            "\1\12",
            "\1\14\6\uffff\2\13",
            "",
            "\1\13\11\uffff\1\4\3\uffff\3\13\2\4"
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "()* loopback of 221:3: ( (lv_properties_4_0= ruleProperty ) )*";
        }
    }
    static final String DFA7_eotS =
        "\15\uffff";
    static final String DFA7_eofS =
        "\1\1\14\uffff";
    static final String DFA7_minS =
        "\1\16\1\uffff\6\4\1\14\2\4\1\uffff\1\4";
    static final String DFA7_maxS =
        "\1\26\1\uffff\6\24\1\17\2\21\1\uffff\1\21";
    static final String DFA7_acceptS =
        "\1\uffff\1\2\11\uffff\1\1\1\uffff";
    static final String DFA7_specialS =
        "\15\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\3\6\uffff\1\2\1\4",
            "",
            "\1\10\15\uffff\1\5\1\6\1\7",
            "\1\10\15\uffff\1\5\1\6\1\7",
            "\1\10\15\uffff\1\5\1\6\1\7",
            "\1\10\15\uffff\1\5\1\6\1\7",
            "\1\10\15\uffff\1\5\1\6\1\7",
            "\1\10\15\uffff\1\5\1\6\1\7",
            "\3\1\1\11",
            "\1\12\14\uffff\1\13",
            "\1\12\13\uffff\1\14\1\13",
            "",
            "\1\12\14\uffff\1\13"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()* loopback of 239:3: ( (lv_functions_5_0= ruleFunction ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_ruleModel130 = new BitSet(new long[]{0x0000000000604002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleModule223 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModule235 = new BitSet(new long[]{0x000000000060F002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleModule259 = new BitSet(new long[]{0x000000000060E002L});
    public static final BitSet FOLLOW_ruleClass_in_ruleModule286 = new BitSet(new long[]{0x000000000060E002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleClass381 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleClass393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass413 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleClass428 = new BitSet(new long[]{0x000000000060E002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleClass451 = new BitSet(new long[]{0x000000000060E002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleClass473 = new BitSet(new long[]{0x000000000060C002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleProperty567 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProperty578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleFunction691 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFunction702 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction720 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_16_in_ruleFunction738 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleFunction754 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_13_in_ruleFunction767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction787 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_DESC_in_ruleFunction806 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rulePrefix904 = new BitSet(new long[]{0x00000000001C0010L});
    public static final BitSet FOLLOW_ruleModifier_in_rulePrefix925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrefix942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleModifier1080 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_19_in_ruleModifier1165 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_20_in_ruleModifier1250 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_21_in_ruleAction1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleAction1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAction1386 = new BitSet(new long[]{0x0000000000000002L});

}
