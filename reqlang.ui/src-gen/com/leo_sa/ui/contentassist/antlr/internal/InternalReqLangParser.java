package com.leo_sa.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.leo_sa.services.ReqLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReqLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DESC", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'^'", "'='", "':'", "'('", "')'", "','", "'p'", "'@'", "'$'"
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
    public String getGrammarFileName() { return "../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g"; }


     
     	private ReqLangGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ReqLangGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:61:1: ( ruleModel EOF )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:69:1: ruleModel : ( ( rule__Model__ModulesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:73:2: ( ( ( rule__Model__ModulesAssignment )* ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:74:1: ( ( rule__Model__ModulesAssignment )* )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:74:1: ( ( rule__Model__ModulesAssignment )* )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:75:1: ( rule__Model__ModulesAssignment )*
            {
             before(grammarAccess.getModelAccess().getModulesAssignment()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:76:1: ( rule__Model__ModulesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:76:2: rule__Model__ModulesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__ModulesAssignment_in_ruleModel94);
            	    rule__Model__ModulesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getModulesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleModule"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:88:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:89:1: ( ruleModule EOF )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:90:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule122);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:97:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:101:2: ( ( ( rule__Module__Group__0 ) ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:102:1: ( ( rule__Module__Group__0 ) )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:102:1: ( ( rule__Module__Group__0 ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:103:1: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:104:1: ( rule__Module__Group__0 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:104:2: rule__Module__Group__0
            {
            pushFollow(FOLLOW_rule__Module__Group__0_in_ruleModule155);
            rule__Module__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleClass"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:116:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:117:1: ( ruleClass EOF )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:118:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass182);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:125:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:129:2: ( ( ( rule__Class__Group__0 ) ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:130:1: ( ( rule__Class__Group__0 ) )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:130:1: ( ( rule__Class__Group__0 ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:131:1: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:132:1: ( rule__Class__Group__0 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:132:2: rule__Class__Group__0
            {
            pushFollow(FOLLOW_rule__Class__Group__0_in_ruleClass215);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleProperty"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:144:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:145:1: ( ruleProperty EOF )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:146:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty242);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:153:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:157:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:158:1: ( ( rule__Property__Group__0 ) )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:158:1: ( ( rule__Property__Group__0 ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:159:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:160:1: ( rule__Property__Group__0 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:160:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty275);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleFunction"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:172:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:173:1: ( ruleFunction EOF )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:174:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction302);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:181:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:185:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:186:1: ( ( rule__Function__Group__0 ) )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:186:1: ( ( rule__Function__Group__0 ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:187:1: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:188:1: ( rule__Function__Group__0 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:188:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_ruleFunction335);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRulePrefix"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:200:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:201:1: ( rulePrefix EOF )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:202:1: rulePrefix EOF
            {
             before(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix362);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getPrefixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:209:1: rulePrefix : ( ( rule__Prefix__Group__0 ) ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:213:2: ( ( ( rule__Prefix__Group__0 ) ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:214:1: ( ( rule__Prefix__Group__0 ) )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:214:1: ( ( rule__Prefix__Group__0 ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:215:1: ( rule__Prefix__Group__0 )
            {
             before(grammarAccess.getPrefixAccess().getGroup()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:216:1: ( rule__Prefix__Group__0 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:216:2: rule__Prefix__Group__0
            {
            pushFollow(FOLLOW_rule__Prefix__Group__0_in_rulePrefix395);
            rule__Prefix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrefixAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleModifier"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:228:1: entryRuleModifier : ruleModifier EOF ;
    public final void entryRuleModifier() throws RecognitionException {
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:229:1: ( ruleModifier EOF )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:230:1: ruleModifier EOF
            {
             before(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier422);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getModifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:237:1: ruleModifier : ( ( rule__Modifier__UnorderedGroup ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:241:2: ( ( ( rule__Modifier__UnorderedGroup ) ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:242:1: ( ( rule__Modifier__UnorderedGroup ) )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:242:1: ( ( rule__Modifier__UnorderedGroup ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:243:1: ( rule__Modifier__UnorderedGroup )
            {
             before(grammarAccess.getModifierAccess().getUnorderedGroup()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:244:1: ( rule__Modifier__UnorderedGroup )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:244:2: rule__Modifier__UnorderedGroup
            {
            pushFollow(FOLLOW_rule__Modifier__UnorderedGroup_in_ruleModifier455);
            rule__Modifier__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getModifierAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModifier"


    // $ANTLR start "ruleAction"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:257:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:261:1: ( ( ( rule__Action__Alternatives ) ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:262:1: ( ( rule__Action__Alternatives ) )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:262:1: ( ( rule__Action__Alternatives ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:263:1: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:264:1: ( rule__Action__Alternatives )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:264:2: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_rule__Action__Alternatives_in_ruleAction492);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "rule__Module__Alternatives_2"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:275:1: rule__Module__Alternatives_2 : ( ( ( rule__Module__FunctionsAssignment_2_0 ) ) | ( ( rule__Module__ClassesAssignment_2_1 ) ) );
    public final void rule__Module__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:279:1: ( ( ( rule__Module__FunctionsAssignment_2_0 ) ) | ( ( rule__Module__ClassesAssignment_2_1 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:280:1: ( ( rule__Module__FunctionsAssignment_2_0 ) )
                    {
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:280:1: ( ( rule__Module__FunctionsAssignment_2_0 ) )
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:281:1: ( rule__Module__FunctionsAssignment_2_0 )
                    {
                     before(grammarAccess.getModuleAccess().getFunctionsAssignment_2_0()); 
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:282:1: ( rule__Module__FunctionsAssignment_2_0 )
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:282:2: rule__Module__FunctionsAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Module__FunctionsAssignment_2_0_in_rule__Module__Alternatives_2527);
                    rule__Module__FunctionsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModuleAccess().getFunctionsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:286:6: ( ( rule__Module__ClassesAssignment_2_1 ) )
                    {
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:286:6: ( ( rule__Module__ClassesAssignment_2_1 ) )
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:287:1: ( rule__Module__ClassesAssignment_2_1 )
                    {
                     before(grammarAccess.getModuleAccess().getClassesAssignment_2_1()); 
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:288:1: ( rule__Module__ClassesAssignment_2_1 )
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:288:2: rule__Module__ClassesAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Module__ClassesAssignment_2_1_in_rule__Module__Alternatives_2545);
                    rule__Module__ClassesAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModuleAccess().getClassesAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Alternatives_2"


    // $ANTLR start "rule__Action__Alternatives"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:297:1: rule__Action__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '^' ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:301:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '^' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:302:1: ( ( '+' ) )
                    {
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:302:1: ( ( '+' ) )
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:303:1: ( '+' )
                    {
                     before(grammarAccess.getActionAccess().getAddEnumLiteralDeclaration_0()); 
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:304:1: ( '+' )
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:304:3: '+'
                    {
                    match(input,12,FOLLOW_12_in_rule__Action__Alternatives579); 

                    }

                     after(grammarAccess.getActionAccess().getAddEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:309:6: ( ( '-' ) )
                    {
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:309:6: ( ( '-' ) )
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:310:1: ( '-' )
                    {
                     before(grammarAccess.getActionAccess().getRemoveEnumLiteralDeclaration_1()); 
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:311:1: ( '-' )
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:311:3: '-'
                    {
                    match(input,13,FOLLOW_13_in_rule__Action__Alternatives600); 

                    }

                     after(grammarAccess.getActionAccess().getRemoveEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:316:6: ( ( '^' ) )
                    {
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:316:6: ( ( '^' ) )
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:317:1: ( '^' )
                    {
                     before(grammarAccess.getActionAccess().getModifyEnumLiteralDeclaration_2()); 
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:318:1: ( '^' )
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:318:3: '^'
                    {
                    match(input,14,FOLLOW_14_in_rule__Action__Alternatives621); 

                    }

                     after(grammarAccess.getActionAccess().getModifyEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__Module__Group__0"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:330:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:334:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:335:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__0654);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__0657);
            rule__Module__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:342:1: rule__Module__Group__0__Impl : ( rulePrefix ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:346:1: ( ( rulePrefix ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:347:1: ( rulePrefix )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:347:1: ( rulePrefix )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:348:1: rulePrefix
            {
             before(grammarAccess.getModuleAccess().getPrefixParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__Module__Group__0__Impl684);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getPrefixParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:359:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:363:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:364:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__1713);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__1716);
            rule__Module__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:371:1: rule__Module__Group__1__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:375:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:376:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:376:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:377:1: ( ( '=' ) ) ( ( '=' )* )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:377:1: ( ( '=' ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:378:1: ( '=' )
            {
             before(grammarAccess.getModuleAccess().getEqualsSignKeyword_1()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:379:1: ( '=' )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:380:2: '='
            {
            match(input,15,FOLLOW_15_in_rule__Module__Group__1__Impl747); 

            }

             after(grammarAccess.getModuleAccess().getEqualsSignKeyword_1()); 

            }

            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:384:1: ( ( '=' )* )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:385:1: ( '=' )*
            {
             before(grammarAccess.getModuleAccess().getEqualsSignKeyword_1()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:386:1: ( '=' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:387:2: '='
            	    {
            	    match(input,15,FOLLOW_15_in_rule__Module__Group__1__Impl763); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getEqualsSignKeyword_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__2"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:399:1: rule__Module__Group__2 : rule__Module__Group__2__Impl ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:403:1: ( rule__Module__Group__2__Impl )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:404:2: rule__Module__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__2798);
            rule__Module__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2"


    // $ANTLR start "rule__Module__Group__2__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:410:1: rule__Module__Group__2__Impl : ( ( rule__Module__Alternatives_2 )* ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:414:1: ( ( ( rule__Module__Alternatives_2 )* ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:415:1: ( ( rule__Module__Alternatives_2 )* )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:415:1: ( ( rule__Module__Alternatives_2 )* )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:416:1: ( rule__Module__Alternatives_2 )*
            {
             before(grammarAccess.getModuleAccess().getAlternatives_2()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:417:1: ( rule__Module__Alternatives_2 )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:417:2: rule__Module__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Module__Alternatives_2_in_rule__Module__Group__2__Impl825);
            	    rule__Module__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:433:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:437:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:438:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__0862);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__0865);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:445:1: rule__Class__Group__0__Impl : ( rulePrefix ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:449:1: ( ( rulePrefix ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:450:1: ( rulePrefix )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:450:1: ( rulePrefix )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:451:1: rulePrefix
            {
             before(grammarAccess.getClassAccess().getPrefixParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__Class__Group__0__Impl892);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getClassAccess().getPrefixParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:462:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:466:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:467:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__1921);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__2_in_rule__Class__Group__1924);
            rule__Class__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:474:1: rule__Class__Group__1__Impl : ( ( rule__Class__Group_1__0 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:478:1: ( ( ( rule__Class__Group_1__0 )? ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:479:1: ( ( rule__Class__Group_1__0 )? )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:479:1: ( ( rule__Class__Group_1__0 )? )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:480:1: ( rule__Class__Group_1__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_1()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:481:1: ( rule__Class__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:481:2: rule__Class__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_1__0_in_rule__Class__Group__1__Impl951);
                    rule__Class__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:491:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:495:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:496:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__2982);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__3_in_rule__Class__Group__2985);
            rule__Class__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:503:1: rule__Class__Group__2__Impl : ( ( ( '-' ) ) ( ( '-' )* ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:507:1: ( ( ( ( '-' ) ) ( ( '-' )* ) ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:508:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:508:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:509:1: ( ( '-' ) ) ( ( '-' )* )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:509:1: ( ( '-' ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:510:1: ( '-' )
            {
             before(grammarAccess.getClassAccess().getHyphenMinusKeyword_2()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:511:1: ( '-' )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:512:2: '-'
            {
            match(input,13,FOLLOW_13_in_rule__Class__Group__2__Impl1016); 

            }

             after(grammarAccess.getClassAccess().getHyphenMinusKeyword_2()); 

            }

            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:516:1: ( ( '-' )* )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:517:1: ( '-' )*
            {
             before(grammarAccess.getClassAccess().getHyphenMinusKeyword_2()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:518:1: ( '-' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==EOF||(LA7_2>=12 && LA7_2<=14)) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:519:2: '-'
            	    {
            	    match(input,13,FOLLOW_13_in_rule__Class__Group__2__Impl1032); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getHyphenMinusKeyword_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:531:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:535:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:536:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__31067);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__4_in_rule__Class__Group__31070);
            rule__Class__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:543:1: rule__Class__Group__3__Impl : ( ( rule__Class__PropertiesAssignment_3 )* ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:547:1: ( ( ( rule__Class__PropertiesAssignment_3 )* ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:548:1: ( ( rule__Class__PropertiesAssignment_3 )* )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:548:1: ( ( rule__Class__PropertiesAssignment_3 )* )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:549:1: ( rule__Class__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getClassAccess().getPropertiesAssignment_3()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:550:1: ( rule__Class__PropertiesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:550:2: rule__Class__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Class__PropertiesAssignment_3_in_rule__Class__Group__3__Impl1097);
            	    rule__Class__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getPropertiesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:560:1: rule__Class__Group__4 : rule__Class__Group__4__Impl ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:564:1: ( rule__Class__Group__4__Impl )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:565:2: rule__Class__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__41128);
            rule__Class__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:571:1: rule__Class__Group__4__Impl : ( ( rule__Class__FunctionsAssignment_4 )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:575:1: ( ( ( rule__Class__FunctionsAssignment_4 )* ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:576:1: ( ( rule__Class__FunctionsAssignment_4 )* )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:576:1: ( ( rule__Class__FunctionsAssignment_4 )* )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:577:1: ( rule__Class__FunctionsAssignment_4 )*
            {
             before(grammarAccess.getClassAccess().getFunctionsAssignment_4()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:578:1: ( rule__Class__FunctionsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:578:2: rule__Class__FunctionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Class__FunctionsAssignment_4_in_rule__Class__Group__4__Impl1155);
            	    rule__Class__FunctionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getFunctionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group_1__0"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:598:1: rule__Class__Group_1__0 : rule__Class__Group_1__0__Impl rule__Class__Group_1__1 ;
    public final void rule__Class__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:602:1: ( rule__Class__Group_1__0__Impl rule__Class__Group_1__1 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:603:2: rule__Class__Group_1__0__Impl rule__Class__Group_1__1
            {
            pushFollow(FOLLOW_rule__Class__Group_1__0__Impl_in_rule__Class__Group_1__01196);
            rule__Class__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_1__1_in_rule__Class__Group_1__01199);
            rule__Class__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_1__0"


    // $ANTLR start "rule__Class__Group_1__0__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:610:1: rule__Class__Group_1__0__Impl : ( ':' ) ;
    public final void rule__Class__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:614:1: ( ( ':' ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:615:1: ( ':' )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:615:1: ( ':' )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:616:1: ':'
            {
             before(grammarAccess.getClassAccess().getColonKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Class__Group_1__0__Impl1227); 
             after(grammarAccess.getClassAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_1__0__Impl"


    // $ANTLR start "rule__Class__Group_1__1"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:629:1: rule__Class__Group_1__1 : rule__Class__Group_1__1__Impl ;
    public final void rule__Class__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:633:1: ( rule__Class__Group_1__1__Impl )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:634:2: rule__Class__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_1__1__Impl_in_rule__Class__Group_1__11258);
            rule__Class__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_1__1"


    // $ANTLR start "rule__Class__Group_1__1__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:640:1: rule__Class__Group_1__1__Impl : ( ( rule__Class__ReturnTypeAssignment_1_1 ) ) ;
    public final void rule__Class__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:644:1: ( ( ( rule__Class__ReturnTypeAssignment_1_1 ) ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:645:1: ( ( rule__Class__ReturnTypeAssignment_1_1 ) )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:645:1: ( ( rule__Class__ReturnTypeAssignment_1_1 ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:646:1: ( rule__Class__ReturnTypeAssignment_1_1 )
            {
             before(grammarAccess.getClassAccess().getReturnTypeAssignment_1_1()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:647:1: ( rule__Class__ReturnTypeAssignment_1_1 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:647:2: rule__Class__ReturnTypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Class__ReturnTypeAssignment_1_1_in_rule__Class__Group_1__1__Impl1285);
            rule__Class__ReturnTypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getReturnTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_1__1__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:661:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:665:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:666:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__01319);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__01322);
            rule__Property__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:673:1: rule__Property__Group__0__Impl : ( rulePrefix ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:677:1: ( ( rulePrefix ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:678:1: ( rulePrefix )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:678:1: ( rulePrefix )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:679:1: rulePrefix
            {
             before(grammarAccess.getPropertyAccess().getPrefixParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__Property__Group__0__Impl1349);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getPrefixParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:690:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:694:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:695:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__11378);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__11381);
            rule__Property__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:702:1: rule__Property__Group__1__Impl : ( ':' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:706:1: ( ( ':' ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:707:1: ( ':' )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:707:1: ( ':' )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:708:1: ':'
            {
             before(grammarAccess.getPropertyAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Property__Group__1__Impl1409); 
             after(grammarAccess.getPropertyAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:721:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:725:1: ( rule__Property__Group__2__Impl )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:726:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__21440);
            rule__Property__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:732:1: rule__Property__Group__2__Impl : ( ( rule__Property__ReturnTypeAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:736:1: ( ( ( rule__Property__ReturnTypeAssignment_2 ) ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:737:1: ( ( rule__Property__ReturnTypeAssignment_2 ) )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:737:1: ( ( rule__Property__ReturnTypeAssignment_2 ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:738:1: ( rule__Property__ReturnTypeAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getReturnTypeAssignment_2()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:739:1: ( rule__Property__ReturnTypeAssignment_2 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:739:2: rule__Property__ReturnTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Property__ReturnTypeAssignment_2_in_rule__Property__Group__2__Impl1467);
            rule__Property__ReturnTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getReturnTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:755:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:759:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:760:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__01503);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__01506);
            rule__Function__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:767:1: rule__Function__Group__0__Impl : ( rulePrefix ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:771:1: ( ( rulePrefix ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:772:1: ( rulePrefix )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:772:1: ( rulePrefix )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:773:1: rulePrefix
            {
             before(grammarAccess.getFunctionAccess().getPrefixParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__Function__Group__0__Impl1533);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getPrefixParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:784:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:788:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:789:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__11562);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__11565);
            rule__Function__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:796:1: rule__Function__Group__1__Impl : ( '(' ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:800:1: ( ( '(' ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:801:1: ( '(' )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:801:1: ( '(' )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:802:1: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Function__Group__1__Impl1593); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:815:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:819:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:820:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__21624);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__21627);
            rule__Function__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:827:1: rule__Function__Group__2__Impl : ( ( rule__Function__Group_2__0 )* ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:831:1: ( ( ( rule__Function__Group_2__0 )* ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:832:1: ( ( rule__Function__Group_2__0 )* )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:832:1: ( ( rule__Function__Group_2__0 )* )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:833:1: ( rule__Function__Group_2__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_2()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:834:1: ( rule__Function__Group_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:834:2: rule__Function__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Function__Group_2__0_in_rule__Function__Group__2__Impl1654);
            	    rule__Function__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:844:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:848:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:849:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__31685);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__31688);
            rule__Function__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:856:1: rule__Function__Group__3__Impl : ( ')' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:860:1: ( ( ')' ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:861:1: ( ')' )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:861:1: ( ')' )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:862:1: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Function__Group__3__Impl1716); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:875:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:879:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:880:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__41747);
            rule__Function__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__5_in_rule__Function__Group__41750);
            rule__Function__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:887:1: rule__Function__Group__4__Impl : ( ( rule__Function__Group_4__0 )? ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:891:1: ( ( ( rule__Function__Group_4__0 )? ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:892:1: ( ( rule__Function__Group_4__0 )? )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:892:1: ( ( rule__Function__Group_4__0 )? )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:893:1: ( rule__Function__Group_4__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_4()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:894:1: ( rule__Function__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:894:2: rule__Function__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Function__Group_4__0_in_rule__Function__Group__4__Impl1777);
                    rule__Function__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group__5"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:904:1: rule__Function__Group__5 : rule__Function__Group__5__Impl ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:908:1: ( rule__Function__Group__5__Impl )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:909:2: rule__Function__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__51808);
            rule__Function__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5"


    // $ANTLR start "rule__Function__Group__5__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:915:1: rule__Function__Group__5__Impl : ( ( rule__Function__DescriptionAssignment_5 )* ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:919:1: ( ( ( rule__Function__DescriptionAssignment_5 )* ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:920:1: ( ( rule__Function__DescriptionAssignment_5 )* )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:920:1: ( ( rule__Function__DescriptionAssignment_5 )* )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:921:1: ( rule__Function__DescriptionAssignment_5 )*
            {
             before(grammarAccess.getFunctionAccess().getDescriptionAssignment_5()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:922:1: ( rule__Function__DescriptionAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_DESC) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:922:2: rule__Function__DescriptionAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Function__DescriptionAssignment_5_in_rule__Function__Group__5__Impl1835);
            	    rule__Function__DescriptionAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getDescriptionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5__Impl"


    // $ANTLR start "rule__Function__Group_2__0"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:944:1: rule__Function__Group_2__0 : rule__Function__Group_2__0__Impl rule__Function__Group_2__1 ;
    public final void rule__Function__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:948:1: ( rule__Function__Group_2__0__Impl rule__Function__Group_2__1 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:949:2: rule__Function__Group_2__0__Impl rule__Function__Group_2__1
            {
            pushFollow(FOLLOW_rule__Function__Group_2__0__Impl_in_rule__Function__Group_2__01878);
            rule__Function__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_2__1_in_rule__Function__Group_2__01881);
            rule__Function__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_2__0"


    // $ANTLR start "rule__Function__Group_2__0__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:956:1: rule__Function__Group_2__0__Impl : ( ( rule__Function__ArgsAssignment_2_0 ) ) ;
    public final void rule__Function__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:960:1: ( ( ( rule__Function__ArgsAssignment_2_0 ) ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:961:1: ( ( rule__Function__ArgsAssignment_2_0 ) )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:961:1: ( ( rule__Function__ArgsAssignment_2_0 ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:962:1: ( rule__Function__ArgsAssignment_2_0 )
            {
             before(grammarAccess.getFunctionAccess().getArgsAssignment_2_0()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:963:1: ( rule__Function__ArgsAssignment_2_0 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:963:2: rule__Function__ArgsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Function__ArgsAssignment_2_0_in_rule__Function__Group_2__0__Impl1908);
            rule__Function__ArgsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getArgsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_2__0__Impl"


    // $ANTLR start "rule__Function__Group_2__1"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:973:1: rule__Function__Group_2__1 : rule__Function__Group_2__1__Impl ;
    public final void rule__Function__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:977:1: ( rule__Function__Group_2__1__Impl )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:978:2: rule__Function__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_2__1__Impl_in_rule__Function__Group_2__11938);
            rule__Function__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_2__1"


    // $ANTLR start "rule__Function__Group_2__1__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:984:1: rule__Function__Group_2__1__Impl : ( ( ',' )? ) ;
    public final void rule__Function__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:988:1: ( ( ( ',' )? ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:989:1: ( ( ',' )? )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:989:1: ( ( ',' )? )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:990:1: ( ',' )?
            {
             before(grammarAccess.getFunctionAccess().getCommaKeyword_2_1()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:991:1: ( ',' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:992:2: ','
                    {
                    match(input,19,FOLLOW_19_in_rule__Function__Group_2__1__Impl1967); 

                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getCommaKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_2__1__Impl"


    // $ANTLR start "rule__Function__Group_4__0"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1007:1: rule__Function__Group_4__0 : rule__Function__Group_4__0__Impl rule__Function__Group_4__1 ;
    public final void rule__Function__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1011:1: ( rule__Function__Group_4__0__Impl rule__Function__Group_4__1 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1012:2: rule__Function__Group_4__0__Impl rule__Function__Group_4__1
            {
            pushFollow(FOLLOW_rule__Function__Group_4__0__Impl_in_rule__Function__Group_4__02004);
            rule__Function__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group_4__1_in_rule__Function__Group_4__02007);
            rule__Function__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_4__0"


    // $ANTLR start "rule__Function__Group_4__0__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1019:1: rule__Function__Group_4__0__Impl : ( ':' ) ;
    public final void rule__Function__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1023:1: ( ( ':' ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1024:1: ( ':' )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1024:1: ( ':' )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1025:1: ':'
            {
             before(grammarAccess.getFunctionAccess().getColonKeyword_4_0()); 
            match(input,16,FOLLOW_16_in_rule__Function__Group_4__0__Impl2035); 
             after(grammarAccess.getFunctionAccess().getColonKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_4__0__Impl"


    // $ANTLR start "rule__Function__Group_4__1"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1038:1: rule__Function__Group_4__1 : rule__Function__Group_4__1__Impl ;
    public final void rule__Function__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1042:1: ( rule__Function__Group_4__1__Impl )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1043:2: rule__Function__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_4__1__Impl_in_rule__Function__Group_4__12066);
            rule__Function__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_4__1"


    // $ANTLR start "rule__Function__Group_4__1__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1049:1: rule__Function__Group_4__1__Impl : ( ( rule__Function__ReturnTypeAssignment_4_1 ) ) ;
    public final void rule__Function__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1053:1: ( ( ( rule__Function__ReturnTypeAssignment_4_1 ) ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1054:1: ( ( rule__Function__ReturnTypeAssignment_4_1 ) )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1054:1: ( ( rule__Function__ReturnTypeAssignment_4_1 ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1055:1: ( rule__Function__ReturnTypeAssignment_4_1 )
            {
             before(grammarAccess.getFunctionAccess().getReturnTypeAssignment_4_1()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1056:1: ( rule__Function__ReturnTypeAssignment_4_1 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1056:2: rule__Function__ReturnTypeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Function__ReturnTypeAssignment_4_1_in_rule__Function__Group_4__1__Impl2093);
            rule__Function__ReturnTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getReturnTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_4__1__Impl"


    // $ANTLR start "rule__Prefix__Group__0"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1070:1: rule__Prefix__Group__0 : rule__Prefix__Group__0__Impl rule__Prefix__Group__1 ;
    public final void rule__Prefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1074:1: ( rule__Prefix__Group__0__Impl rule__Prefix__Group__1 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1075:2: rule__Prefix__Group__0__Impl rule__Prefix__Group__1
            {
            pushFollow(FOLLOW_rule__Prefix__Group__0__Impl_in_rule__Prefix__Group__02127);
            rule__Prefix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Prefix__Group__1_in_rule__Prefix__Group__02130);
            rule__Prefix__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__0"


    // $ANTLR start "rule__Prefix__Group__0__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1082:1: rule__Prefix__Group__0__Impl : ( ( rule__Prefix__ActionAssignment_0 ) ) ;
    public final void rule__Prefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1086:1: ( ( ( rule__Prefix__ActionAssignment_0 ) ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1087:1: ( ( rule__Prefix__ActionAssignment_0 ) )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1087:1: ( ( rule__Prefix__ActionAssignment_0 ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1088:1: ( rule__Prefix__ActionAssignment_0 )
            {
             before(grammarAccess.getPrefixAccess().getActionAssignment_0()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1089:1: ( rule__Prefix__ActionAssignment_0 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1089:2: rule__Prefix__ActionAssignment_0
            {
            pushFollow(FOLLOW_rule__Prefix__ActionAssignment_0_in_rule__Prefix__Group__0__Impl2157);
            rule__Prefix__ActionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPrefixAccess().getActionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__0__Impl"


    // $ANTLR start "rule__Prefix__Group__1"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1099:1: rule__Prefix__Group__1 : rule__Prefix__Group__1__Impl rule__Prefix__Group__2 ;
    public final void rule__Prefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1103:1: ( rule__Prefix__Group__1__Impl rule__Prefix__Group__2 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1104:2: rule__Prefix__Group__1__Impl rule__Prefix__Group__2
            {
            pushFollow(FOLLOW_rule__Prefix__Group__1__Impl_in_rule__Prefix__Group__12187);
            rule__Prefix__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Prefix__Group__2_in_rule__Prefix__Group__12190);
            rule__Prefix__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__1"


    // $ANTLR start "rule__Prefix__Group__1__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1111:1: rule__Prefix__Group__1__Impl : ( ( rule__Prefix__ModifiersAssignment_1 ) ) ;
    public final void rule__Prefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1115:1: ( ( ( rule__Prefix__ModifiersAssignment_1 ) ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1116:1: ( ( rule__Prefix__ModifiersAssignment_1 ) )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1116:1: ( ( rule__Prefix__ModifiersAssignment_1 ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1117:1: ( rule__Prefix__ModifiersAssignment_1 )
            {
             before(grammarAccess.getPrefixAccess().getModifiersAssignment_1()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1118:1: ( rule__Prefix__ModifiersAssignment_1 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1118:2: rule__Prefix__ModifiersAssignment_1
            {
            pushFollow(FOLLOW_rule__Prefix__ModifiersAssignment_1_in_rule__Prefix__Group__1__Impl2217);
            rule__Prefix__ModifiersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrefixAccess().getModifiersAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__1__Impl"


    // $ANTLR start "rule__Prefix__Group__2"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1128:1: rule__Prefix__Group__2 : rule__Prefix__Group__2__Impl ;
    public final void rule__Prefix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1132:1: ( rule__Prefix__Group__2__Impl )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1133:2: rule__Prefix__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Prefix__Group__2__Impl_in_rule__Prefix__Group__22247);
            rule__Prefix__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__2"


    // $ANTLR start "rule__Prefix__Group__2__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1139:1: rule__Prefix__Group__2__Impl : ( ( rule__Prefix__NameAssignment_2 ) ) ;
    public final void rule__Prefix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1143:1: ( ( ( rule__Prefix__NameAssignment_2 ) ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1144:1: ( ( rule__Prefix__NameAssignment_2 ) )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1144:1: ( ( rule__Prefix__NameAssignment_2 ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1145:1: ( rule__Prefix__NameAssignment_2 )
            {
             before(grammarAccess.getPrefixAccess().getNameAssignment_2()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1146:1: ( rule__Prefix__NameAssignment_2 )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1146:2: rule__Prefix__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Prefix__NameAssignment_2_in_rule__Prefix__Group__2__Impl2274);
            rule__Prefix__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPrefixAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__2__Impl"


    // $ANTLR start "rule__Modifier__UnorderedGroup"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1163:1: rule__Modifier__UnorderedGroup : ( rule__Modifier__UnorderedGroup__0 )? ;
    public final void rule__Modifier__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getModifierAccess().getUnorderedGroup());
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1168:1: ( ( rule__Modifier__UnorderedGroup__0 )? )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1169:2: ( rule__Modifier__UnorderedGroup__0 )?
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1169:2: ( rule__Modifier__UnorderedGroup__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( LA14_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 0) ) {
                alt14=1;
            }
            else if ( LA14_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 1) ) {
                alt14=1;
            }
            else if ( LA14_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 2) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1169:2: rule__Modifier__UnorderedGroup__0
                    {
                    pushFollow(FOLLOW_rule__Modifier__UnorderedGroup__0_in_rule__Modifier__UnorderedGroup2311);
                    rule__Modifier__UnorderedGroup__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getModifierAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__UnorderedGroup"


    // $ANTLR start "rule__Modifier__UnorderedGroup__Impl"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1179:1: rule__Modifier__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Modifier__PrivateAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Modifier__AbstractAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Modifier__StaticAssignment_2 ) ) ) ) ) ;
    public final void rule__Modifier__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1184:1: ( ( ({...}? => ( ( ( rule__Modifier__PrivateAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Modifier__AbstractAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Modifier__StaticAssignment_2 ) ) ) ) ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1185:3: ( ({...}? => ( ( ( rule__Modifier__PrivateAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Modifier__AbstractAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Modifier__StaticAssignment_2 ) ) ) ) )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1185:3: ( ({...}? => ( ( ( rule__Modifier__PrivateAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Modifier__AbstractAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Modifier__StaticAssignment_2 ) ) ) ) )
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( LA15_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 1) ) {
                alt15=2;
            }
            else if ( LA15_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 2) ) {
                alt15=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1187:4: ({...}? => ( ( ( rule__Modifier__PrivateAssignment_0 ) ) ) )
                    {
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1187:4: ({...}? => ( ( ( rule__Modifier__PrivateAssignment_0 ) ) ) )
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1188:5: {...}? => ( ( ( rule__Modifier__PrivateAssignment_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Modifier__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 0)");
                    }
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1188:103: ( ( ( rule__Modifier__PrivateAssignment_0 ) ) )
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1189:6: ( ( rule__Modifier__PrivateAssignment_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getModifierAccess().getUnorderedGroup(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1195:6: ( ( rule__Modifier__PrivateAssignment_0 ) )
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1197:7: ( rule__Modifier__PrivateAssignment_0 )
                    {
                     before(grammarAccess.getModifierAccess().getPrivateAssignment_0()); 
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1198:7: ( rule__Modifier__PrivateAssignment_0 )
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1198:8: rule__Modifier__PrivateAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Modifier__PrivateAssignment_0_in_rule__Modifier__UnorderedGroup__Impl2398);
                    rule__Modifier__PrivateAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModifierAccess().getPrivateAssignment_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1204:4: ({...}? => ( ( ( rule__Modifier__AbstractAssignment_1 ) ) ) )
                    {
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1204:4: ({...}? => ( ( ( rule__Modifier__AbstractAssignment_1 ) ) ) )
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1205:5: {...}? => ( ( ( rule__Modifier__AbstractAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Modifier__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 1)");
                    }
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1205:103: ( ( ( rule__Modifier__AbstractAssignment_1 ) ) )
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1206:6: ( ( rule__Modifier__AbstractAssignment_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getModifierAccess().getUnorderedGroup(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1212:6: ( ( rule__Modifier__AbstractAssignment_1 ) )
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1214:7: ( rule__Modifier__AbstractAssignment_1 )
                    {
                     before(grammarAccess.getModifierAccess().getAbstractAssignment_1()); 
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1215:7: ( rule__Modifier__AbstractAssignment_1 )
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1215:8: rule__Modifier__AbstractAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Modifier__AbstractAssignment_1_in_rule__Modifier__UnorderedGroup__Impl2489);
                    rule__Modifier__AbstractAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModifierAccess().getAbstractAssignment_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1221:4: ({...}? => ( ( ( rule__Modifier__StaticAssignment_2 ) ) ) )
                    {
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1221:4: ({...}? => ( ( ( rule__Modifier__StaticAssignment_2 ) ) ) )
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1222:5: {...}? => ( ( ( rule__Modifier__StaticAssignment_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Modifier__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 2)");
                    }
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1222:103: ( ( ( rule__Modifier__StaticAssignment_2 ) ) )
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1223:6: ( ( rule__Modifier__StaticAssignment_2 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getModifierAccess().getUnorderedGroup(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1229:6: ( ( rule__Modifier__StaticAssignment_2 ) )
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1231:7: ( rule__Modifier__StaticAssignment_2 )
                    {
                     before(grammarAccess.getModifierAccess().getStaticAssignment_2()); 
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1232:7: ( rule__Modifier__StaticAssignment_2 )
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1232:8: rule__Modifier__StaticAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Modifier__StaticAssignment_2_in_rule__Modifier__UnorderedGroup__Impl2580);
                    rule__Modifier__StaticAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModifierAccess().getStaticAssignment_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModifierAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__UnorderedGroup__Impl"


    // $ANTLR start "rule__Modifier__UnorderedGroup__0"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1247:1: rule__Modifier__UnorderedGroup__0 : rule__Modifier__UnorderedGroup__Impl ( rule__Modifier__UnorderedGroup__1 )? ;
    public final void rule__Modifier__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1251:1: ( rule__Modifier__UnorderedGroup__Impl ( rule__Modifier__UnorderedGroup__1 )? )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1252:2: rule__Modifier__UnorderedGroup__Impl ( rule__Modifier__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_rule__Modifier__UnorderedGroup__Impl_in_rule__Modifier__UnorderedGroup__02639);
            rule__Modifier__UnorderedGroup__Impl();

            state._fsp--;

            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1253:2: ( rule__Modifier__UnorderedGroup__1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( LA16_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 0) ) {
                alt16=1;
            }
            else if ( LA16_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 1) ) {
                alt16=1;
            }
            else if ( LA16_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 2) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1253:2: rule__Modifier__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_rule__Modifier__UnorderedGroup__1_in_rule__Modifier__UnorderedGroup__02642);
                    rule__Modifier__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__UnorderedGroup__0"


    // $ANTLR start "rule__Modifier__UnorderedGroup__1"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1260:1: rule__Modifier__UnorderedGroup__1 : rule__Modifier__UnorderedGroup__Impl ( rule__Modifier__UnorderedGroup__2 )? ;
    public final void rule__Modifier__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1264:1: ( rule__Modifier__UnorderedGroup__Impl ( rule__Modifier__UnorderedGroup__2 )? )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1265:2: rule__Modifier__UnorderedGroup__Impl ( rule__Modifier__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_rule__Modifier__UnorderedGroup__Impl_in_rule__Modifier__UnorderedGroup__12667);
            rule__Modifier__UnorderedGroup__Impl();

            state._fsp--;

            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1266:2: ( rule__Modifier__UnorderedGroup__2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( LA17_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 0) ) {
                alt17=1;
            }
            else if ( LA17_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 1) ) {
                alt17=1;
            }
            else if ( LA17_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getModifierAccess().getUnorderedGroup(), 2) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1266:2: rule__Modifier__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_rule__Modifier__UnorderedGroup__2_in_rule__Modifier__UnorderedGroup__12670);
                    rule__Modifier__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__UnorderedGroup__1"


    // $ANTLR start "rule__Modifier__UnorderedGroup__2"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1273:1: rule__Modifier__UnorderedGroup__2 : rule__Modifier__UnorderedGroup__Impl ;
    public final void rule__Modifier__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1277:1: ( rule__Modifier__UnorderedGroup__Impl )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1278:2: rule__Modifier__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_rule__Modifier__UnorderedGroup__Impl_in_rule__Modifier__UnorderedGroup__22695);
            rule__Modifier__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__UnorderedGroup__2"


    // $ANTLR start "rule__Model__ModulesAssignment"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1291:1: rule__Model__ModulesAssignment : ( ruleModule ) ;
    public final void rule__Model__ModulesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1295:1: ( ( ruleModule ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1296:1: ( ruleModule )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1296:1: ( ruleModule )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1297:1: ruleModule
            {
             before(grammarAccess.getModelAccess().getModulesModuleParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleModule_in_rule__Model__ModulesAssignment2729);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModelAccess().getModulesModuleParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ModulesAssignment"


    // $ANTLR start "rule__Module__FunctionsAssignment_2_0"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1306:1: rule__Module__FunctionsAssignment_2_0 : ( ruleFunction ) ;
    public final void rule__Module__FunctionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1310:1: ( ( ruleFunction ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1311:1: ( ruleFunction )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1311:1: ( ruleFunction )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1312:1: ruleFunction
            {
             before(grammarAccess.getModuleAccess().getFunctionsFunctionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleFunction_in_rule__Module__FunctionsAssignment_2_02760);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getFunctionsFunctionParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__FunctionsAssignment_2_0"


    // $ANTLR start "rule__Module__ClassesAssignment_2_1"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1321:1: rule__Module__ClassesAssignment_2_1 : ( ruleClass ) ;
    public final void rule__Module__ClassesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1325:1: ( ( ruleClass ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1326:1: ( ruleClass )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1326:1: ( ruleClass )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1327:1: ruleClass
            {
             before(grammarAccess.getModuleAccess().getClassesClassParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleClass_in_rule__Module__ClassesAssignment_2_12791);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getClassesClassParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__ClassesAssignment_2_1"


    // $ANTLR start "rule__Class__ReturnTypeAssignment_1_1"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1336:1: rule__Class__ReturnTypeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__ReturnTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1340:1: ( ( ( RULE_ID ) ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1341:1: ( ( RULE_ID ) )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1341:1: ( ( RULE_ID ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1342:1: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getReturnTypeClassCrossReference_1_1_0()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1343:1: ( RULE_ID )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1344:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getReturnTypeClassIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__ReturnTypeAssignment_1_12826); 
             after(grammarAccess.getClassAccess().getReturnTypeClassIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getReturnTypeClassCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ReturnTypeAssignment_1_1"


    // $ANTLR start "rule__Class__PropertiesAssignment_3"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1355:1: rule__Class__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__Class__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1359:1: ( ( ruleProperty ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1360:1: ( ruleProperty )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1360:1: ( ruleProperty )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1361:1: ruleProperty
            {
             before(grammarAccess.getClassAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Class__PropertiesAssignment_32861);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getClassAccess().getPropertiesPropertyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__PropertiesAssignment_3"


    // $ANTLR start "rule__Class__FunctionsAssignment_4"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1370:1: rule__Class__FunctionsAssignment_4 : ( ruleFunction ) ;
    public final void rule__Class__FunctionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1374:1: ( ( ruleFunction ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1375:1: ( ruleFunction )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1375:1: ( ruleFunction )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1376:1: ruleFunction
            {
             before(grammarAccess.getClassAccess().getFunctionsFunctionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFunction_in_rule__Class__FunctionsAssignment_42892);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getClassAccess().getFunctionsFunctionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__FunctionsAssignment_4"


    // $ANTLR start "rule__Property__ReturnTypeAssignment_2"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1385:1: rule__Property__ReturnTypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Property__ReturnTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1389:1: ( ( ( RULE_ID ) ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1390:1: ( ( RULE_ID ) )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1390:1: ( ( RULE_ID ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1391:1: ( RULE_ID )
            {
             before(grammarAccess.getPropertyAccess().getReturnTypeClassCrossReference_2_0()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1392:1: ( RULE_ID )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1393:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getReturnTypeClassIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__ReturnTypeAssignment_22927); 
             after(grammarAccess.getPropertyAccess().getReturnTypeClassIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getPropertyAccess().getReturnTypeClassCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ReturnTypeAssignment_2"


    // $ANTLR start "rule__Function__ArgsAssignment_2_0"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1404:1: rule__Function__ArgsAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__Function__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1408:1: ( ( RULE_ID ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1409:1: ( RULE_ID )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1409:1: ( RULE_ID )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1410:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getArgsIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__ArgsAssignment_2_02962); 
             after(grammarAccess.getFunctionAccess().getArgsIDTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ArgsAssignment_2_0"


    // $ANTLR start "rule__Function__ReturnTypeAssignment_4_1"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1419:1: rule__Function__ReturnTypeAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Function__ReturnTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1423:1: ( ( ( RULE_ID ) ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1424:1: ( ( RULE_ID ) )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1424:1: ( ( RULE_ID ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1425:1: ( RULE_ID )
            {
             before(grammarAccess.getFunctionAccess().getReturnTypeClassCrossReference_4_1_0()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1426:1: ( RULE_ID )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1427:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getReturnTypeClassIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__ReturnTypeAssignment_4_12997); 
             after(grammarAccess.getFunctionAccess().getReturnTypeClassIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getFunctionAccess().getReturnTypeClassCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ReturnTypeAssignment_4_1"


    // $ANTLR start "rule__Function__DescriptionAssignment_5"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1438:1: rule__Function__DescriptionAssignment_5 : ( RULE_DESC ) ;
    public final void rule__Function__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1442:1: ( ( RULE_DESC ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1443:1: ( RULE_DESC )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1443:1: ( RULE_DESC )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1444:1: RULE_DESC
            {
             before(grammarAccess.getFunctionAccess().getDescriptionDESCTerminalRuleCall_5_0()); 
            match(input,RULE_DESC,FOLLOW_RULE_DESC_in_rule__Function__DescriptionAssignment_53032); 
             after(grammarAccess.getFunctionAccess().getDescriptionDESCTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__DescriptionAssignment_5"


    // $ANTLR start "rule__Prefix__ActionAssignment_0"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1453:1: rule__Prefix__ActionAssignment_0 : ( ruleAction ) ;
    public final void rule__Prefix__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1457:1: ( ( ruleAction ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1458:1: ( ruleAction )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1458:1: ( ruleAction )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1459:1: ruleAction
            {
             before(grammarAccess.getPrefixAccess().getActionActionEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__Prefix__ActionAssignment_03063);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getPrefixAccess().getActionActionEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__ActionAssignment_0"


    // $ANTLR start "rule__Prefix__ModifiersAssignment_1"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1468:1: rule__Prefix__ModifiersAssignment_1 : ( ruleModifier ) ;
    public final void rule__Prefix__ModifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1472:1: ( ( ruleModifier ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1473:1: ( ruleModifier )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1473:1: ( ruleModifier )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1474:1: ruleModifier
            {
             before(grammarAccess.getPrefixAccess().getModifiersModifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleModifier_in_rule__Prefix__ModifiersAssignment_13094);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getPrefixAccess().getModifiersModifierParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__ModifiersAssignment_1"


    // $ANTLR start "rule__Prefix__NameAssignment_2"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1483:1: rule__Prefix__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Prefix__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1487:1: ( ( RULE_ID ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1488:1: ( RULE_ID )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1488:1: ( RULE_ID )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1489:1: RULE_ID
            {
             before(grammarAccess.getPrefixAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Prefix__NameAssignment_23125); 
             after(grammarAccess.getPrefixAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__NameAssignment_2"


    // $ANTLR start "rule__Modifier__PrivateAssignment_0"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1498:1: rule__Modifier__PrivateAssignment_0 : ( ( 'p' ) ) ;
    public final void rule__Modifier__PrivateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1502:1: ( ( ( 'p' ) ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1503:1: ( ( 'p' ) )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1503:1: ( ( 'p' ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1504:1: ( 'p' )
            {
             before(grammarAccess.getModifierAccess().getPrivatePKeyword_0_0()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1505:1: ( 'p' )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1506:1: 'p'
            {
             before(grammarAccess.getModifierAccess().getPrivatePKeyword_0_0()); 
            match(input,20,FOLLOW_20_in_rule__Modifier__PrivateAssignment_03161); 
             after(grammarAccess.getModifierAccess().getPrivatePKeyword_0_0()); 

            }

             after(grammarAccess.getModifierAccess().getPrivatePKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__PrivateAssignment_0"


    // $ANTLR start "rule__Modifier__AbstractAssignment_1"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1521:1: rule__Modifier__AbstractAssignment_1 : ( ( '@' ) ) ;
    public final void rule__Modifier__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1525:1: ( ( ( '@' ) ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1526:1: ( ( '@' ) )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1526:1: ( ( '@' ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1527:1: ( '@' )
            {
             before(grammarAccess.getModifierAccess().getAbstractCommercialAtKeyword_1_0()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1528:1: ( '@' )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1529:1: '@'
            {
             before(grammarAccess.getModifierAccess().getAbstractCommercialAtKeyword_1_0()); 
            match(input,21,FOLLOW_21_in_rule__Modifier__AbstractAssignment_13205); 
             after(grammarAccess.getModifierAccess().getAbstractCommercialAtKeyword_1_0()); 

            }

             after(grammarAccess.getModifierAccess().getAbstractCommercialAtKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__AbstractAssignment_1"


    // $ANTLR start "rule__Modifier__StaticAssignment_2"
    // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1544:1: rule__Modifier__StaticAssignment_2 : ( ( '$' ) ) ;
    public final void rule__Modifier__StaticAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1548:1: ( ( ( '$' ) ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1549:1: ( ( '$' ) )
            {
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1549:1: ( ( '$' ) )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1550:1: ( '$' )
            {
             before(grammarAccess.getModifierAccess().getStaticDollarSignKeyword_2_0()); 
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1551:1: ( '$' )
            // ../reqlang.ui/src-gen/com/leo_sa/ui/contentassist/antlr/internal/InternalReqLang.g:1552:1: '$'
            {
             before(grammarAccess.getModifierAccess().getStaticDollarSignKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Modifier__StaticAssignment_23249); 
             after(grammarAccess.getModifierAccess().getStaticDollarSignKeyword_2_0()); 

            }

             after(grammarAccess.getModifierAccess().getStaticDollarSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__StaticAssignment_2"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA2_eotS =
        "\20\uffff";
    static final String DFA2_eofS =
        "\20\uffff";
    static final String DFA2_minS =
        "\1\14\6\4\1\15\3\4\2\uffff\3\4";
    static final String DFA2_maxS =
        "\1\16\6\26\1\21\3\26\2\uffff\3\4";
    static final String DFA2_acceptS =
        "\13\uffff\1\2\1\1\3\uffff";
    static final String DFA2_specialS =
        "\20\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\2\1\3",
            "\1\7\17\uffff\1\4\1\5\1\6",
            "\1\7\17\uffff\1\4\1\5\1\6",
            "\1\7\17\uffff\1\4\1\5\1\6",
            "\1\7\17\uffff\1\10\1\11\1\12",
            "\1\7\17\uffff\1\10\1\11\1\12",
            "\1\7\17\uffff\1\10\1\11\1\12",
            "\1\13\2\uffff\1\13\1\14",
            "\1\7\17\uffff\1\15\1\16\1\17",
            "\1\7\17\uffff\1\15\1\16\1\17",
            "\1\7\17\uffff\1\15\1\16\1\17",
            "",
            "",
            "\1\7",
            "\1\7",
            "\1\7"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "275:1: rule__Module__Alternatives_2 : ( ( ( rule__Module__FunctionsAssignment_2_0 ) ) | ( ( rule__Module__ClassesAssignment_2_1 ) ) );";
        }
    }
    static final String DFA5_eotS =
        "\20\uffff";
    static final String DFA5_eofS =
        "\1\1\17\uffff";
    static final String DFA5_minS =
        "\1\14\1\uffff\6\4\1\15\3\4\1\uffff\3\4";
    static final String DFA5_maxS =
        "\1\16\1\uffff\6\26\1\21\3\26\1\uffff\3\4";
    static final String DFA5_acceptS =
        "\1\uffff\1\2\12\uffff\1\1\3\uffff";
    static final String DFA5_specialS =
        "\20\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\2\1\3\1\4",
            "",
            "\1\10\17\uffff\1\5\1\6\1\7",
            "\1\10\17\uffff\1\5\1\6\1\7",
            "\1\10\17\uffff\1\5\1\6\1\7",
            "\1\10\17\uffff\1\11\1\12\1\13",
            "\1\10\17\uffff\1\11\1\12\1\13",
            "\1\10\17\uffff\1\11\1\12\1\13",
            "\1\14\1\uffff\1\1\2\14",
            "\1\10\17\uffff\1\15\1\16\1\17",
            "\1\10\17\uffff\1\15\1\16\1\17",
            "\1\10\17\uffff\1\15\1\16\1\17",
            "",
            "\1\10",
            "\1\10",
            "\1\10"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "()* loopback of 417:1: ( rule__Module__Alternatives_2 )*";
        }
    }
    static final String DFA8_eotS =
        "\23\uffff";
    static final String DFA8_eofS =
        "\1\4\17\uffff\1\22\1\4\1\uffff";
    static final String DFA8_minS =
        "\1\14\3\4\1\uffff\3\4\1\15\7\4\1\14\1\4\1\uffff";
    static final String DFA8_maxS =
        "\1\16\3\26\1\uffff\3\26\1\21\3\26\4\4\1\16\1\26\1\uffff";
    static final String DFA8_acceptS =
        "\4\uffff\1\2\15\uffff\1\1";
    static final String DFA8_specialS =
        "\23\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\1\2\1\3",
            "\1\10\17\uffff\1\5\1\6\1\7",
            "\1\10\17\uffff\1\5\1\6\1\7",
            "\1\10\17\uffff\1\5\1\6\1\7",
            "",
            "\1\10\17\uffff\1\11\1\12\1\13",
            "\1\10\17\uffff\1\11\1\12\1\13",
            "\1\10\17\uffff\1\11\1\12\1\13",
            "\1\4\1\uffff\1\4\1\14\1\4",
            "\1\10\17\uffff\1\15\1\16\1\17",
            "\1\10\17\uffff\1\15\1\16\1\17",
            "\1\10\17\uffff\1\15\1\16\1\17",
            "\1\20",
            "\1\10",
            "\1\10",
            "\1\10",
            "\1\22\1\21\1\22",
            "\1\22\7\uffff\3\4\5\uffff\3\22",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "()* loopback of 550:1: ( rule__Class__PropertiesAssignment_3 )*";
        }
    }
    static final String DFA9_eotS =
        "\23\uffff";
    static final String DFA9_eofS =
        "\1\1\22\uffff";
    static final String DFA9_minS =
        "\1\14\1\uffff\6\4\1\15\10\4\1\uffff\1\4";
    static final String DFA9_maxS =
        "\1\16\1\uffff\6\26\1\21\3\26\1\22\3\4\1\23\1\uffff\1\22";
    static final String DFA9_acceptS =
        "\1\uffff\1\2\17\uffff\1\1\1\uffff";
    static final String DFA9_specialS =
        "\23\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\3\1\4",
            "",
            "\1\10\17\uffff\1\5\1\6\1\7",
            "\1\10\17\uffff\1\5\1\6\1\7",
            "\1\10\17\uffff\1\5\1\6\1\7",
            "\1\10\17\uffff\1\11\1\12\1\13",
            "\1\10\17\uffff\1\11\1\12\1\13",
            "\1\10\17\uffff\1\11\1\12\1\13",
            "\1\1\1\uffff\2\1\1\14",
            "\1\10\17\uffff\1\15\1\16\1\17",
            "\1\10\17\uffff\1\15\1\16\1\17",
            "\1\10\17\uffff\1\15\1\16\1\17",
            "\1\20\15\uffff\1\21",
            "\1\10",
            "\1\10",
            "\1\10",
            "\1\20\15\uffff\1\21\1\22",
            "",
            "\1\20\15\uffff\1\21"
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "()* loopback of 578:1: ( rule__Class__FunctionsAssignment_4 )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ModulesAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0_in_ruleModule155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0_in_ruleClass215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_ruleFunction335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group__0_in_rulePrefix395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__UnorderedGroup_in_ruleModifier455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Alternatives_in_ruleAction492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__FunctionsAssignment_2_0_in_rule__Module__Alternatives_2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ClassesAssignment_2_1_in_rule__Module__Alternatives_2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Action__Alternatives579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Action__Alternatives600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Action__Alternatives621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__0654 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__0657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__Module__Group__0__Impl684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__1713 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Module__Group__1__Impl747 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_rule__Module__Group__1__Impl763 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Alternatives_2_in_rule__Module__Group__2__Impl825 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__0862 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__0865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__Class__Group__0__Impl892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__1921 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_1__0_in_rule__Class__Group__1__Impl951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__2982 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_rule__Class__Group__3_in_rule__Class__Group__2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Class__Group__2__Impl1016 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_rule__Class__Group__2__Impl1032 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__31067 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_rule__Class__Group__4_in_rule__Class__Group__31070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__PropertiesAssignment_3_in_rule__Class__Group__3__Impl1097 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__41128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__FunctionsAssignment_4_in_rule__Class__Group__4__Impl1155 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_rule__Class__Group_1__0__Impl_in_rule__Class__Group_1__01196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group_1__1_in_rule__Class__Group_1__01199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Class__Group_1__0__Impl1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_1__1__Impl_in_rule__Class__Group_1__11258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__ReturnTypeAssignment_1_1_in_rule__Class__Group_1__1__Impl1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__01319 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__01322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__Property__Group__0__Impl1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__11378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__11381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Property__Group__1__Impl1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__21440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__ReturnTypeAssignment_2_in_rule__Property__Group__2__Impl1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__01503 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__01506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__Function__Group__0__Impl1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__11562 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__11565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Function__Group__1__Impl1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__21624 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__21627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_2__0_in_rule__Function__Group__2__Impl1654 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__31685 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__31688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Function__Group__3__Impl1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__41747 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_rule__Function__Group__5_in_rule__Function__Group__41750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_4__0_in_rule__Function__Group__4__Impl1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__51808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__DescriptionAssignment_5_in_rule__Function__Group__5__Impl1835 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Function__Group_2__0__Impl_in_rule__Function__Group_2__01878 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Function__Group_2__1_in_rule__Function__Group_2__01881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__ArgsAssignment_2_0_in_rule__Function__Group_2__0__Impl1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_2__1__Impl_in_rule__Function__Group_2__11938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Function__Group_2__1__Impl1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_4__0__Impl_in_rule__Function__Group_4__02004 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group_4__1_in_rule__Function__Group_4__02007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Function__Group_4__0__Impl2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_4__1__Impl_in_rule__Function__Group_4__12066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__ReturnTypeAssignment_4_1_in_rule__Function__Group_4__1__Impl2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group__0__Impl_in_rule__Prefix__Group__02127 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_rule__Prefix__Group__1_in_rule__Prefix__Group__02130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__ActionAssignment_0_in_rule__Prefix__Group__0__Impl2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group__1__Impl_in_rule__Prefix__Group__12187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Prefix__Group__2_in_rule__Prefix__Group__12190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__ModifiersAssignment_1_in_rule__Prefix__Group__1__Impl2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group__2__Impl_in_rule__Prefix__Group__22247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__NameAssignment_2_in_rule__Prefix__Group__2__Impl2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__UnorderedGroup__0_in_rule__Modifier__UnorderedGroup2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__PrivateAssignment_0_in_rule__Modifier__UnorderedGroup__Impl2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__AbstractAssignment_1_in_rule__Modifier__UnorderedGroup__Impl2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__StaticAssignment_2_in_rule__Modifier__UnorderedGroup__Impl2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__UnorderedGroup__Impl_in_rule__Modifier__UnorderedGroup__02639 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_rule__Modifier__UnorderedGroup__1_in_rule__Modifier__UnorderedGroup__02642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__UnorderedGroup__Impl_in_rule__Modifier__UnorderedGroup__12667 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_rule__Modifier__UnorderedGroup__2_in_rule__Modifier__UnorderedGroup__12670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__UnorderedGroup__Impl_in_rule__Modifier__UnorderedGroup__22695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_rule__Model__ModulesAssignment2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__Module__FunctionsAssignment_2_02760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__Module__ClassesAssignment_2_12791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__ReturnTypeAssignment_1_12826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Class__PropertiesAssignment_32861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__Class__FunctionsAssignment_42892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__ReturnTypeAssignment_22927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__ArgsAssignment_2_02962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__ReturnTypeAssignment_4_12997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DESC_in_rule__Function__DescriptionAssignment_53032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__Prefix__ActionAssignment_03063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Prefix__ModifiersAssignment_13094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Prefix__NameAssignment_23125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Modifier__PrivateAssignment_03161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Modifier__AbstractAssignment_13205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Modifier__StaticAssignment_23249 = new BitSet(new long[]{0x0000000000000002L});

}
