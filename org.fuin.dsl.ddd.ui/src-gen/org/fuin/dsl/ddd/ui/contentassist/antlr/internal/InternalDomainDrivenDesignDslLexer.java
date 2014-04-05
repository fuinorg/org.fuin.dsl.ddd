package org.fuin.dsl.ddd.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainDrivenDesignDslLexer extends Lexer {
    public static final int RULE_ID=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_DOC=8;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int RULE_HEX=4;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_DECIMAL=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=9;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;

    // delegates
    // delegators

    public InternalDomainDrivenDesignDslLexer() {;} 
    public InternalDomainDrivenDesignDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDomainDrivenDesignDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:11:7: ( ';' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:11:9: ';'
            {
            match(';'); 

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
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:12:7: ( 'false' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:12:9: 'false'
            {
            match("false"); 


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
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:13:7: ( 'true' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:13:9: 'true'
            {
            match("true"); 


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
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:14:7: ( 'namespace' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:14:9: 'namespace'
            {
            match("namespace"); 


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
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:15:7: ( '{' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:15:9: '{'
            {
            match('{'); 

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
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:16:7: ( '}' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:16:9: '}'
            {
            match('}'); 

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
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:17:7: ( 'import' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:17:9: 'import'
            {
            match("import"); 


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
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:18:7: ( 'type' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:18:9: 'type'
            {
            match("type"); 


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
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:19:7: ( 'constraint' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:19:9: 'constraint'
            {
            match("constraint"); 


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
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:20:7: ( 'on' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:20:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:21:7: ( 'message' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:21:9: 'message'
            {
            match("message"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:22:7: ( 'exception' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:22:9: 'exception'
            {
            match("exception"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:23:7: ( 'value-object' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:23:9: 'value-object'
            {
            match("value-object"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:24:7: ( 'base' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:24:9: 'base'
            {
            match("base"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:25:7: ( 'entity-id' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:25:9: 'entity-id'
            {
            match("entity-id"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:26:7: ( 'aggregate-id' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:26:9: 'aggregate-id'
            {
            match("aggregate-id"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:27:7: ( 'enum' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:27:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:28:7: ( 'instances' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:28:9: 'instances'
            {
            match("instances"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:29:7: ( '(' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:29:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:30:7: ( ')' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:30:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:31:7: ( ',' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:31:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:32:7: ( 'entity' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:32:9: 'entity'
            {
            match("entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:33:7: ( 'identifier' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:33:9: 'identifier'
            {
            match("identifier"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:34:7: ( 'root' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:34:9: 'root'
            {
            match("root"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:35:7: ( 'aggregate' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:35:9: 'aggregate'
            {
            match("aggregate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:36:7: ( 'constructor' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:36:9: 'constructor'
            {
            match("constructor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:37:7: ( 'method' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:37:9: 'method'
            {
            match("method"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:38:7: ( 'ref' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:38:9: 'ref'
            {
            match("ref"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:39:7: ( 'event' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:39:9: 'event'
            {
            match("event"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:40:7: ( 'slabel' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:40:9: 'slabel'
            {
            match("slabel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:41:7: ( 'label' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:41:9: 'label'
            {
            match("label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:42:7: ( 'tooltipp' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:42:9: 'tooltipp'
            {
            match("tooltipp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:43:7: ( 'prompt' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:43:9: 'prompt'
            {
            match("prompt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:44:7: ( 'examples' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:44:9: 'examples'
            {
            match("examples"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:45:7: ( 'constraints' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:45:9: 'constraints'
            {
            match("constraints"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:46:7: ( 'invariants' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:46:9: 'invariants'
            {
            match("invariants"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:47:7: ( '.' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:47:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:48:7: ( '*' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:48:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:49:7: ( 'nullable' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:49:9: 'nullable'
            {
            match("nullable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:50:7: ( 'null' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:50:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9180:9: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9180:11: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9180:31: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:
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
            	    break loop1;
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9182:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9182:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9182:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\"') ) {
                alt4=1;
            }
            else if ( (LA4_0=='\'') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9182:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9182:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='\\') ) {
                            alt2=1;
                        }
                        else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9182:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9182:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop2;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9182:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9182:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9182:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9182:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop3;
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

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9184:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9184:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9184:12: ( '0x' | '0X' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='0') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='x') ) {
                    alt5=1;
                }
                else if ( (LA5_1=='X') ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9184:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9184:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9184:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='F')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='f')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9184:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='#') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9184:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9184:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='B'||LA7_0=='b') ) {
                        alt7=1;
                    }
                    else if ( (LA7_0=='L'||LA7_0=='l') ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9184:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9184:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


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
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9186:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9186:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9186:21: ( '0' .. '9' | '_' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||LA9_0=='_') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9188:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9188:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9188:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='E'||LA11_0=='e') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9188:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9188:36: ( '+' | '-' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='+'||LA10_0=='-') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9188:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='B'||LA12_0=='b') ) {
                alt12=1;
            }
            else if ( (LA12_0=='D'||LA12_0=='F'||LA12_0=='L'||LA12_0=='d'||LA12_0=='f'||LA12_0=='l') ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9188:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9188:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


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
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_DOC"
    public final void mRULE_DOC() throws RecognitionException {
        try {
            int _type = RULE_DOC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9190:10: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9190:12: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9190:18: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9190:46: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "RULE_DOC"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9192:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9192:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9192:31: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9192:59: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
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
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9194:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9194:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9194:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9194:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop15;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9194:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9194:41: ( '\\r' )? '\\n'
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9194:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9194:41: '\\r'
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
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9196:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9196:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:9196:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | RULE_ID | RULE_STRING | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_DOC | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt19=49;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:250: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 42 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:258: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 43 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:270: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 44 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:279: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 45 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:288: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 46 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:301: RULE_DOC
                {
                mRULE_DOC(); 

                }
                break;
            case 47 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:310: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 48 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:326: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 49 :
                // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1:342: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\2\uffff\3\30\2\uffff\10\30\3\uffff\4\30\4\uffff\2\67\2\uffff\12"+
        "\30\1\106\14\30\1\uffff\1\67\4\uffff\13\30\1\uffff\13\30\1\156\3"+
        "\30\2\uffff\1\30\1\163\1\164\2\30\1\170\12\30\1\u0083\2\30\1\u0086"+
        "\1\30\1\u0088\1\uffff\3\30\1\u008c\2\uffff\3\30\1\uffff\12\30\1"+
        "\uffff\1\u009a\1\30\1\uffff\1\30\1\uffff\1\30\1\u009e\1\30\1\uffff"+
        "\3\30\1\u00a3\5\30\1\u00aa\2\30\1\u00ae\2\uffff\1\30\1\u00b0\1\uffff"+
        "\1\u00b1\3\30\1\uffff\5\30\1\u00ba\1\uffff\2\30\2\uffff\1\30\2\uffff"+
        "\1\u00be\1\30\1\u00c0\5\30\1\uffff\1\30\1\u00c7\1\30\1\uffff\1\u00c9"+
        "\1\uffff\1\u00ca\4\30\1\u00cf\1\uffff\1\u00d1\2\uffff\1\u00d2\1"+
        "\u00d3\1\u00d5\1\30\5\uffff\1\u00d7\1\uffff\1\u00d8\2\uffff";
    static final String DFA19_eofS =
        "\u00d9\uffff";
    static final String DFA19_minS =
        "\1\11\1\uffff\1\141\1\157\1\141\2\uffff\1\144\1\157\1\156\1\145"+
        "\1\156\2\141\1\147\3\uffff\1\145\1\154\1\141\1\162\4\uffff\2\60"+
        "\1\52\1\uffff\1\154\1\165\1\160\1\157\1\155\1\154\1\160\1\163\1"+
        "\145\1\156\1\60\1\163\1\141\1\164\1\145\1\154\1\163\1\147\1\157"+
        "\1\146\1\141\1\142\1\157\1\uffff\1\60\2\uffff\1\0\1\uffff\1\163"+
        "\2\145\1\154\1\145\1\154\1\157\1\164\1\141\1\156\1\163\1\uffff\1"+
        "\163\1\150\1\145\1\155\1\151\1\155\1\156\1\165\1\145\1\162\1\164"+
        "\1\60\1\142\1\145\1\155\2\uffff\1\145\2\60\1\164\1\163\1\60\1\162"+
        "\1\141\1\162\2\164\1\141\1\157\2\160\1\164\1\60\1\164\1\145\1\60"+
        "\1\145\1\60\1\uffff\1\145\1\154\1\160\1\60\2\uffff\1\151\1\160\1"+
        "\142\1\uffff\1\164\1\156\2\151\1\162\1\147\1\144\1\164\1\154\1\171"+
        "\1\uffff\1\60\1\55\1\uffff\1\147\1\uffff\1\154\1\60\1\164\1\uffff"+
        "\1\160\1\141\1\154\1\60\1\143\1\141\1\146\1\141\1\145\1\60\1\151"+
        "\1\145\1\55\2\uffff\1\141\1\60\1\uffff\1\60\1\160\1\143\1\145\1"+
        "\uffff\1\145\1\156\2\151\1\143\1\60\1\uffff\1\157\1\163\2\uffff"+
        "\1\164\2\uffff\1\60\1\145\1\60\1\163\1\164\1\145\1\156\1\164\1\uffff"+
        "\1\156\1\60\1\145\1\uffff\1\60\1\uffff\1\60\1\163\1\162\1\164\1"+
        "\157\1\60\1\uffff\1\55\2\uffff\3\60\1\162\5\uffff\1\60\1\uffff\1"+
        "\60\2\uffff";
    static final String DFA19_maxS =
        "\1\175\1\uffff\1\141\1\171\1\165\2\uffff\1\156\1\157\1\156\1\145"+
        "\1\170\2\141\1\147\3\uffff\1\157\1\154\1\141\1\162\4\uffff\1\170"+
        "\1\154\1\57\1\uffff\1\154\1\165\1\160\1\157\1\155\1\154\1\160\1"+
        "\166\1\145\1\156\1\172\1\164\1\143\1\165\1\145\1\154\1\163\1\147"+
        "\1\157\1\146\1\141\1\142\1\157\1\uffff\1\154\2\uffff\1\uffff\1\uffff"+
        "\1\163\2\145\1\154\1\145\1\154\1\157\1\164\1\141\1\156\1\163\1\uffff"+
        "\1\163\1\150\1\145\1\155\1\151\1\155\1\156\1\165\1\145\1\162\1\164"+
        "\1\172\1\142\1\145\1\155\2\uffff\1\145\2\172\1\164\1\163\1\172\1"+
        "\162\1\141\1\162\2\164\1\141\1\157\2\160\1\164\1\172\1\164\1\145"+
        "\1\172\1\145\1\172\1\uffff\1\145\1\154\1\160\1\172\2\uffff\1\151"+
        "\1\160\1\142\1\uffff\1\164\1\156\2\151\1\162\1\147\1\144\1\164\1"+
        "\154\1\171\1\uffff\1\172\1\55\1\uffff\1\147\1\uffff\1\154\1\172"+
        "\1\164\1\uffff\1\160\1\141\1\154\1\172\1\143\1\141\1\146\1\165\1"+
        "\145\1\172\1\151\1\145\1\172\2\uffff\1\141\1\172\1\uffff\1\172\1"+
        "\160\1\143\1\145\1\uffff\1\145\1\156\2\151\1\143\1\172\1\uffff\1"+
        "\157\1\163\2\uffff\1\164\2\uffff\1\172\1\145\1\172\1\163\1\164\1"+
        "\145\1\156\1\164\1\uffff\1\156\1\172\1\145\1\uffff\1\172\1\uffff"+
        "\1\172\1\163\1\162\1\164\1\157\1\172\1\uffff\1\172\2\uffff\3\172"+
        "\1\162\5\uffff\1\172\1\uffff\1\172\2\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\1\3\uffff\1\5\1\6\10\uffff\1\23\1\24\1\25\4\uffff\1"+
        "\45\1\46\1\51\1\52\3\uffff\1\61\27\uffff\1\53\1\uffff\1\54\1\55"+
        "\1\uffff\1\60\13\uffff\1\12\17\uffff\1\56\1\57\26\uffff\1\34\4\uffff"+
        "\1\3\1\10\3\uffff\1\50\12\uffff\1\21\2\uffff\1\16\1\uffff\1\30\3"+
        "\uffff\1\2\15\uffff\1\35\1\15\2\uffff\1\37\4\uffff\1\7\6\uffff\1"+
        "\33\2\uffff\1\17\1\26\1\uffff\1\36\1\41\10\uffff\1\13\3\uffff\1"+
        "\40\1\uffff\1\47\6\uffff\1\42\1\uffff\1\4\1\22\4\uffff\1\14\1\20"+
        "\1\31\1\44\1\27\1\uffff\1\11\1\uffff\1\43\1\32";
    static final String DFA19_specialS =
        "\71\uffff\1\0\u009f\uffff}>";
    static final String[] DFA19_transitionS = {
            "\2\35\2\uffff\1\35\22\uffff\1\35\1\uffff\1\31\4\uffff\1\31"+
            "\1\17\1\20\1\27\1\uffff\1\21\1\uffff\1\26\1\34\1\32\11\33\1"+
            "\uffff\1\1\5\uffff\32\30\6\uffff\1\16\1\15\1\10\1\30\1\13\1"+
            "\2\2\30\1\7\2\30\1\24\1\12\1\4\1\11\1\25\1\30\1\22\1\23\1\3"+
            "\1\30\1\14\4\30\1\5\1\uffff\1\6",
            "",
            "\1\36",
            "\1\41\2\uffff\1\37\6\uffff\1\40",
            "\1\42\23\uffff\1\43",
            "",
            "",
            "\1\46\10\uffff\1\44\1\45",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\53\7\uffff\1\54\1\uffff\1\52",
            "\1\55",
            "\1\56",
            "\1\57",
            "",
            "",
            "",
            "\1\61\11\uffff\1\60",
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "",
            "",
            "",
            "\12\66\10\uffff\1\70\1\uffff\3\70\5\uffff\1\70\13\uffff\1"+
            "\65\6\uffff\1\66\2\uffff\1\70\1\uffff\3\70\5\uffff\1\70\13\uffff"+
            "\1\65",
            "\12\66\10\uffff\1\70\1\uffff\3\70\5\uffff\1\70\22\uffff\1"+
            "\66\2\uffff\1\70\1\uffff\3\70\5\uffff\1\70",
            "\1\71\4\uffff\1\72",
            "",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102\2\uffff\1\103",
            "\1\104",
            "\1\105",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\107\1\110",
            "\1\112\1\uffff\1\111",
            "\1\113\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "\12\66\10\uffff\1\70\1\uffff\3\70\5\uffff\1\70\22\uffff\1"+
            "\66\2\uffff\1\70\1\uffff\3\70\5\uffff\1\70",
            "",
            "",
            "\52\127\1\126\uffd5\127",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "",
            "\1\162",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\165",
            "\1\166",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\1\167\31\30",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0084",
            "\1\u0085",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0087",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u009b",
            "",
            "\1\u009c",
            "",
            "\1\u009d",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u009f",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7\23\uffff\1\u00a8",
            "\1\u00a9",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "",
            "",
            "\1\u00af",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "",
            "\1\u00bd",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00bf",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "",
            "\1\u00c6",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00c8",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u00d0\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\22\30\1\u00d4\7"+
            "\30",
            "\1\u00d6",
            "",
            "",
            "",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | RULE_ID | RULE_STRING | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_DOC | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_57 = input.LA(1);

                        s = -1;
                        if ( (LA19_57=='*') ) {s = 86;}

                        else if ( ((LA19_57>='\u0000' && LA19_57<=')')||(LA19_57>='+' && LA19_57<='\uFFFF')) ) {s = 87;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}