package com.leo_sa.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReqLangLexer extends Lexer {
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

    public InternalReqLangLexer() {;} 
    public InternalReqLangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalReqLangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:11:7: ( '=' )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:12:7: ( ':' )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:12:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:13:7: ( '-' )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:13:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:14:7: ( '(' )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:14:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:15:7: ( ',' )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:16:7: ( ')' )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:16:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:17:7: ( 'p' )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:17:9: 'p'
            {
            match('p'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:18:7: ( '@' )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:18:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:19:7: ( '$' )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:19:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:20:7: ( '+' )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:20:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:21:7: ( '^' )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:21:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "RULE_DESC"
    public final void mRULE_DESC() throws RecognitionException {
        try {
            int _type = RULE_DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:624:11: ( '*' (~ ( ( '\\n' | '\\r' ) ) )* ( '\\r' '\\n' )? )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:624:13: '*' (~ ( ( '\\n' | '\\r' ) ) )* ( '\\r' '\\n' )?
            {
            match('*'); 
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:624:17: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:624:17: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:624:33: ( '\\r' '\\n' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:624:34: '\\r' '\\n'
                    {
                    match('\r'); 
                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DESC"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:626:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:626:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:626:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:626:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:626:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:628:10: ( ( '0' .. '9' )+ )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:628:12: ( '0' .. '9' )+
            {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:628:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:628:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:630:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:630:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:630:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:630:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:630:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:630:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:630:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:630:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:630:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:630:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:630:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:632:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:632:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:632:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:632:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:634:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:634:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:634:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:634:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:634:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:634:41: ( '\\r' )? '\\n'
                    {
                    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:634:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:634:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:636:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:636:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:636:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:638:16: ( . )
            // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:638:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_DESC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=19;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:1:76: RULE_DESC
                {
                mRULE_DESC(); 

                }
                break;
            case 13 :
                // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:1:86: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 14 :
                // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:1:94: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 15 :
                // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:1:103: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 16 :
                // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:1:115: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 17 :
                // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:1:131: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 18 :
                // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:1:147: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 19 :
                // ../reqlang/src-gen/com/leo_sa/parser/antlr/internal/InternalReqLang.g:1:155: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\7\uffff\1\33\3\uffff\1\37\3\uffff\3\23\24\uffff";
    static final String DFA14_eofS =
        "\46\uffff";
    static final String DFA14_minS =
        "\1\0\6\uffff\1\60\3\uffff\1\101\3\uffff\2\0\1\52\24\uffff";
    static final String DFA14_maxS =
        "\1\uffff\6\uffff\1\172\3\uffff\1\172\3\uffff\2\uffff\1\57\24\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\1\uffff"+
        "\1\14\1\15\1\16\3\uffff\1\22\1\23\1\1\1\2\1\3\1\4\1\5\1\6\1\15\1"+
        "\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22";
    static final String DFA14_specialS =
        "\1\2\16\uffff\1\1\1\0\25\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\23\2\22\2\23\1\22\22\23\1\22\1\23\1\17\1\23\1\11\2\23\1"+
            "\20\1\4\1\6\1\14\1\12\1\5\1\3\1\23\1\21\12\16\1\2\2\23\1\1\2"+
            "\23\1\10\32\15\3\23\1\13\1\15\1\23\17\15\1\7\12\15\uff85\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "",
            "\0\42",
            "\0\42",
            "\1\43\4\uffff\1\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_DESC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_16 = input.LA(1);

                        s = -1;
                        if ( ((LA14_16>='\u0000' && LA14_16<='\uFFFF')) ) {s = 34;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_15 = input.LA(1);

                        s = -1;
                        if ( ((LA14_15>='\u0000' && LA14_15<='\uFFFF')) ) {s = 34;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='=') ) {s = 1;}

                        else if ( (LA14_0==':') ) {s = 2;}

                        else if ( (LA14_0=='-') ) {s = 3;}

                        else if ( (LA14_0=='(') ) {s = 4;}

                        else if ( (LA14_0==',') ) {s = 5;}

                        else if ( (LA14_0==')') ) {s = 6;}

                        else if ( (LA14_0=='p') ) {s = 7;}

                        else if ( (LA14_0=='@') ) {s = 8;}

                        else if ( (LA14_0=='$') ) {s = 9;}

                        else if ( (LA14_0=='+') ) {s = 10;}

                        else if ( (LA14_0=='^') ) {s = 11;}

                        else if ( (LA14_0=='*') ) {s = 12;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='o')||(LA14_0>='q' && LA14_0<='z')) ) {s = 13;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 14;}

                        else if ( (LA14_0=='\"') ) {s = 15;}

                        else if ( (LA14_0=='\'') ) {s = 16;}

                        else if ( (LA14_0=='/') ) {s = 17;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 18;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||LA14_0=='#'||(LA14_0>='%' && LA14_0<='&')||LA14_0=='.'||(LA14_0>=';' && LA14_0<='<')||(LA14_0>='>' && LA14_0<='?')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}