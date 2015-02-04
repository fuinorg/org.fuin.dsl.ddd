package org.fuin.dsl.ddd.parser.antlr.internal; 

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
import org.fuin.dsl.ddd.services.DomainDrivenDesignDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainDrivenDesignDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOC", "RULE_INT", "RULE_STRING", "RULE_HEX", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'context'", "'{'", "'}'", "'namespace'", "'import'", "'type'", "'element'", "'acceptable'", "'detection'", "'resolution'", "'consistency'", "'constraint'", "'input'", "'exception'", "'message'", "'cid'", "'value-object'", "'base'", "'entity-id'", "'identifies'", "'aggregate-id'", "'enum'", "'instances'", "'deprecated'", "'('", "','", "')'", "'event'", "'entity'", "'identifier'", "'root'", "'aggregate'", "'constructor'", "'fires'", "'returns'", "'method'", "'ref'", "'slabel'", "'label'", "'tooltip'", "'prompt'", "'examples'", "'nullable'", "'*'", "'invariants'", "'preconditions'", "'business-rules'", "'service'", "'.'", "'false'", "'true'", "'null'", "'millis'", "'seconds'", "'minutes'", "'hours'", "'days'", "'weak'", "'strong'", "'never'", "'manually'", "'automatic'", "'workflow'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_DOC=5;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int RULE_HEX=8;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int RULE_DECIMAL=9;
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
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;

    // delegates
    // delegators


        public InternalDomainDrivenDesignDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainDrivenDesignDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainDrivenDesignDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g"; }



     	private DomainDrivenDesignDslGrammarAccess grammarAccess;
     	
        public InternalDomainDrivenDesignDslParser(TokenStream input, DomainDrivenDesignDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DomainModel";	
       	}
       	
       	@Override
       	protected DomainDrivenDesignDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDomainModel"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:68:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:69:2: (iv_ruleDomainModel= ruleDomainModel EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:70:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
             newCompositeNode(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_ruleDomainModel_in_entryRuleDomainModel75);
            iv_ruleDomainModel=ruleDomainModel();

            state._fsp--;

             current =iv_ruleDomainModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModel85); 

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
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:77:1: ruleDomainModel returns [EObject current=null] : ( (lv_contexts_0_0= ruleContext ) )* ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_contexts_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:80:28: ( ( (lv_contexts_0_0= ruleContext ) )* )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:81:1: ( (lv_contexts_0_0= ruleContext ) )*
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:81:1: ( (lv_contexts_0_0= ruleContext ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:82:1: (lv_contexts_0_0= ruleContext )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:82:1: (lv_contexts_0_0= ruleContext )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:83:3: lv_contexts_0_0= ruleContext
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainModelAccess().getContextsContextParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContext_in_ruleDomainModel130);
            	    lv_contexts_0_0=ruleContext();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contexts",
            	            		lv_contexts_0_0, 
            	            		"Context");
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
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleContext"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:107:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:108:2: (iv_ruleContext= ruleContext EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:109:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_ruleContext_in_entryRuleContext166);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContext176); 

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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:116:1: ruleContext returns [EObject current=null] : (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleNamespace ) )* otherlv_4= '}' ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_namespaces_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:119:28: ( (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleNamespace ) )* otherlv_4= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:120:1: (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleNamespace ) )* otherlv_4= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:120:1: (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleNamespace ) )* otherlv_4= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:120:3: otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleNamespace ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleContext213); 

                	newLeafNode(otherlv_0, grammarAccess.getContextAccess().getContextKeyword_0());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:124:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:125:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:125:1: (lv_name_1_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:126:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContext230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getContextAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleContext247); 

                	newLeafNode(otherlv_2, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:146:1: ( (lv_namespaces_3_0= ruleNamespace ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:147:1: (lv_namespaces_3_0= ruleNamespace )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:147:1: (lv_namespaces_3_0= ruleNamespace )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:148:3: lv_namespaces_3_0= ruleNamespace
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContextAccess().getNamespacesNamespaceParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNamespace_in_ruleContext268);
            	    lv_namespaces_3_0=ruleNamespace();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContextRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"namespaces",
            	            		lv_namespaces_3_0, 
            	            		"Namespace");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleContext281); 

                	newLeafNode(otherlv_4, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleNamespace"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:176:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:177:2: (iv_ruleNamespace= ruleNamespace EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:178:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace317);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace327); 

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
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:185:1: ruleNamespace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:188:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:189:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:189:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:189:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleNamespace364); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:193:1: ( (lv_name_1_0= ruleFQN ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:194:1: (lv_name_1_0= ruleFQN )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:194:1: (lv_name_1_0= ruleFQN )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:195:3: lv_name_1_0= ruleFQN
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceAccess().getNameFQNParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleNamespace385);
            lv_name_1_0=ruleFQN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"FQN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleNamespace397); 

                	newLeafNode(otherlv_2, grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:215:1: ( (lv_imports_3_0= ruleImport ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:216:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:216:1: (lv_imports_3_0= ruleImport )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:217:3: lv_imports_3_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleNamespace418);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_3_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:233:3: ( (lv_elements_4_0= ruleAbstractElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_DOC||LA4_0==18||LA4_0==24||LA4_0==26||LA4_0==29||LA4_0==31||(LA4_0>=33 && LA4_0<=34)||(LA4_0>=40 && LA4_0<=41)||LA4_0==44||LA4_0==60) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:234:1: (lv_elements_4_0= ruleAbstractElement )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:234:1: (lv_elements_4_0= ruleAbstractElement )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:235:3: lv_elements_4_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNamespaceAccess().getElementsAbstractElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleNamespace440);
            	    lv_elements_4_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_4_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleNamespace453); 

                	newLeafNode(otherlv_5, grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleImport"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:263:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:264:2: (iv_ruleImport= ruleImport EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:265:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport489);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport499); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:272:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_1 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:275:28: ( (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:276:1: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:276:1: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:276:3: otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleImport536); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:280:1: ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:281:1: ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:281:1: ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:282:1: (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:282:1: (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:283:3: lv_importedNamespace_1_1= ruleFQN
                    {
                     
                    	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceFQNParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleImport559);
                    lv_importedNamespace_1_1=ruleFQN();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImportRule());
                    	        }
                           		set(
                           			current, 
                           			"importedNamespace",
                            		lv_importedNamespace_1_1, 
                            		"FQN");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:298:8: lv_importedNamespace_1_2= ruleFQNWithWildcard
                    {
                     
                    	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceFQNWithWildcardParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleFQNWithWildcard_in_ruleImport578);
                    lv_importedNamespace_1_2=ruleFQNWithWildcard();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImportRule());
                    	        }
                           		set(
                           			current, 
                           			"importedNamespace",
                            		lv_importedNamespace_1_2, 
                            		"FQNWithWildcard");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleAbstractElement"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:324:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:325:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:326:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement617);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement627); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:333:1: ruleAbstractElement returns [EObject current=null] : (this_Constraint_0= ruleConstraint | this_Type_1= ruleType | this_Exception_2= ruleException | this_Event_3= ruleEvent ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Constraint_0 = null;

        EObject this_Type_1 = null;

        EObject this_Exception_2 = null;

        EObject this_Event_3 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:336:28: ( (this_Constraint_0= ruleConstraint | this_Type_1= ruleType | this_Exception_2= ruleException | this_Event_3= ruleEvent ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:337:1: (this_Constraint_0= ruleConstraint | this_Type_1= ruleType | this_Exception_2= ruleException | this_Event_3= ruleEvent )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:337:1: (this_Constraint_0= ruleConstraint | this_Type_1= ruleType | this_Exception_2= ruleException | this_Event_3= ruleEvent )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_DOC:
                {
                switch ( input.LA(2) ) {
                case 40:
                    {
                    alt6=4;
                    }
                    break;
                case 18:
                case 29:
                case 31:
                case 33:
                case 34:
                case 41:
                case 44:
                case 60:
                    {
                    alt6=2;
                    }
                    break;
                case 26:
                    {
                    alt6=3;
                    }
                    break;
                case 24:
                    {
                    alt6=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

                }
                break;
            case 24:
                {
                alt6=1;
                }
                break;
            case 18:
            case 29:
            case 31:
            case 33:
            case 34:
            case 41:
            case 44:
            case 60:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            case 40:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:338:5: this_Constraint_0= ruleConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getConstraintParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConstraint_in_ruleAbstractElement674);
                    this_Constraint_0=ruleConstraint();

                    state._fsp--;

                     
                            current = this_Constraint_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:348:5: this_Type_1= ruleType
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleAbstractElement701);
                    this_Type_1=ruleType();

                    state._fsp--;

                     
                            current = this_Type_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:358:5: this_Exception_2= ruleException
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getExceptionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleException_in_ruleAbstractElement728);
                    this_Exception_2=ruleException();

                    state._fsp--;

                     
                            current = this_Exception_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:368:5: this_Event_3= ruleEvent
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getEventParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleEvent_in_ruleAbstractElement755);
                    this_Event_3=ruleEvent();

                    state._fsp--;

                     
                            current = this_Event_3; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleType"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:384:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:385:2: (iv_ruleType= ruleType EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:386:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType790);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType800); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:393:1: ruleType returns [EObject current=null] : (this_ExternalType_0= ruleExternalType | this_InternalType_1= ruleInternalType | this_Service_2= ruleService ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalType_0 = null;

        EObject this_InternalType_1 = null;

        EObject this_Service_2 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:396:28: ( (this_ExternalType_0= ruleExternalType | this_InternalType_1= ruleInternalType | this_Service_2= ruleService ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:397:1: (this_ExternalType_0= ruleExternalType | this_InternalType_1= ruleInternalType | this_Service_2= ruleService )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:397:1: (this_ExternalType_0= ruleExternalType | this_InternalType_1= ruleInternalType | this_Service_2= ruleService )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_DOC:
                {
                switch ( input.LA(2) ) {
                case 29:
                case 31:
                case 33:
                case 34:
                case 41:
                case 44:
                    {
                    alt7=2;
                    }
                    break;
                case 60:
                    {
                    alt7=3;
                    }
                    break;
                case 18:
                    {
                    alt7=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }

                }
                break;
            case 18:
                {
                alt7=1;
                }
                break;
            case 29:
            case 31:
            case 33:
            case 34:
            case 41:
            case 44:
                {
                alt7=2;
                }
                break;
            case 60:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:398:5: this_ExternalType_0= ruleExternalType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getExternalTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExternalType_in_ruleType847);
                    this_ExternalType_0=ruleExternalType();

                    state._fsp--;

                     
                            current = this_ExternalType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:408:5: this_InternalType_1= ruleInternalType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getInternalTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInternalType_in_ruleType874);
                    this_InternalType_1=ruleInternalType();

                    state._fsp--;

                     
                            current = this_InternalType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:418:5: this_Service_2= ruleService
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getServiceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleService_in_ruleType901);
                    this_Service_2=ruleService();

                    state._fsp--;

                     
                            current = this_Service_2; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleInternalType"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:434:1: entryRuleInternalType returns [EObject current=null] : iv_ruleInternalType= ruleInternalType EOF ;
    public final EObject entryRuleInternalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalType = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:435:2: (iv_ruleInternalType= ruleInternalType EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:436:2: iv_ruleInternalType= ruleInternalType EOF
            {
             newCompositeNode(grammarAccess.getInternalTypeRule()); 
            pushFollow(FOLLOW_ruleInternalType_in_entryRuleInternalType936);
            iv_ruleInternalType=ruleInternalType();

            state._fsp--;

             current =iv_ruleInternalType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalType946); 

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
    // $ANTLR end "entryRuleInternalType"


    // $ANTLR start "ruleInternalType"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:443:1: ruleInternalType returns [EObject current=null] : (this_AbstractVO_0= ruleAbstractVO | this_AbstractEntity_1= ruleAbstractEntity | this_EnumObject_2= ruleEnumObject ) ;
    public final EObject ruleInternalType() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractVO_0 = null;

        EObject this_AbstractEntity_1 = null;

        EObject this_EnumObject_2 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:446:28: ( (this_AbstractVO_0= ruleAbstractVO | this_AbstractEntity_1= ruleAbstractEntity | this_EnumObject_2= ruleEnumObject ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:447:1: (this_AbstractVO_0= ruleAbstractVO | this_AbstractEntity_1= ruleAbstractEntity | this_EnumObject_2= ruleEnumObject )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:447:1: (this_AbstractVO_0= ruleAbstractVO | this_AbstractEntity_1= ruleAbstractEntity | this_EnumObject_2= ruleEnumObject )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_DOC:
                {
                switch ( input.LA(2) ) {
                case 41:
                case 44:
                    {
                    alt8=2;
                    }
                    break;
                case 29:
                case 31:
                case 33:
                    {
                    alt8=1;
                    }
                    break;
                case 34:
                    {
                    alt8=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

                }
                break;
            case 29:
            case 31:
            case 33:
                {
                alt8=1;
                }
                break;
            case 41:
            case 44:
                {
                alt8=2;
                }
                break;
            case 34:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:448:5: this_AbstractVO_0= ruleAbstractVO
                    {
                     
                            newCompositeNode(grammarAccess.getInternalTypeAccess().getAbstractVOParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAbstractVO_in_ruleInternalType993);
                    this_AbstractVO_0=ruleAbstractVO();

                    state._fsp--;

                     
                            current = this_AbstractVO_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:458:5: this_AbstractEntity_1= ruleAbstractEntity
                    {
                     
                            newCompositeNode(grammarAccess.getInternalTypeAccess().getAbstractEntityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAbstractEntity_in_ruleInternalType1020);
                    this_AbstractEntity_1=ruleAbstractEntity();

                    state._fsp--;

                     
                            current = this_AbstractEntity_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:468:5: this_EnumObject_2= ruleEnumObject
                    {
                     
                            newCompositeNode(grammarAccess.getInternalTypeAccess().getEnumObjectParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEnumObject_in_ruleInternalType1047);
                    this_EnumObject_2=ruleEnumObject();

                    state._fsp--;

                     
                            current = this_EnumObject_2; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleInternalType"


    // $ANTLR start "entryRuleAbstractVO"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:484:1: entryRuleAbstractVO returns [EObject current=null] : iv_ruleAbstractVO= ruleAbstractVO EOF ;
    public final EObject entryRuleAbstractVO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractVO = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:485:2: (iv_ruleAbstractVO= ruleAbstractVO EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:486:2: iv_ruleAbstractVO= ruleAbstractVO EOF
            {
             newCompositeNode(grammarAccess.getAbstractVORule()); 
            pushFollow(FOLLOW_ruleAbstractVO_in_entryRuleAbstractVO1082);
            iv_ruleAbstractVO=ruleAbstractVO();

            state._fsp--;

             current =iv_ruleAbstractVO; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractVO1092); 

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
    // $ANTLR end "entryRuleAbstractVO"


    // $ANTLR start "ruleAbstractVO"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:493:1: ruleAbstractVO returns [EObject current=null] : (this_ValueObject_0= ruleValueObject | this_AbstractEntityId_1= ruleAbstractEntityId ) ;
    public final EObject ruleAbstractVO() throws RecognitionException {
        EObject current = null;

        EObject this_ValueObject_0 = null;

        EObject this_AbstractEntityId_1 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:496:28: ( (this_ValueObject_0= ruleValueObject | this_AbstractEntityId_1= ruleAbstractEntityId ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:497:1: (this_ValueObject_0= ruleValueObject | this_AbstractEntityId_1= ruleAbstractEntityId )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:497:1: (this_ValueObject_0= ruleValueObject | this_AbstractEntityId_1= ruleAbstractEntityId )
            int alt9=2;
            switch ( input.LA(1) ) {
            case RULE_DOC:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==31||LA9_1==33) ) {
                    alt9=2;
                }
                else if ( (LA9_1==29) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                alt9=1;
                }
                break;
            case 31:
            case 33:
                {
                alt9=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:498:5: this_ValueObject_0= ruleValueObject
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractVOAccess().getValueObjectParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleValueObject_in_ruleAbstractVO1139);
                    this_ValueObject_0=ruleValueObject();

                    state._fsp--;

                     
                            current = this_ValueObject_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:508:5: this_AbstractEntityId_1= ruleAbstractEntityId
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractVOAccess().getAbstractEntityIdParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAbstractEntityId_in_ruleAbstractVO1166);
                    this_AbstractEntityId_1=ruleAbstractEntityId();

                    state._fsp--;

                     
                            current = this_AbstractEntityId_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleAbstractVO"


    // $ANTLR start "entryRuleAbstractEntityId"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:524:1: entryRuleAbstractEntityId returns [EObject current=null] : iv_ruleAbstractEntityId= ruleAbstractEntityId EOF ;
    public final EObject entryRuleAbstractEntityId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractEntityId = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:525:2: (iv_ruleAbstractEntityId= ruleAbstractEntityId EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:526:2: iv_ruleAbstractEntityId= ruleAbstractEntityId EOF
            {
             newCompositeNode(grammarAccess.getAbstractEntityIdRule()); 
            pushFollow(FOLLOW_ruleAbstractEntityId_in_entryRuleAbstractEntityId1201);
            iv_ruleAbstractEntityId=ruleAbstractEntityId();

            state._fsp--;

             current =iv_ruleAbstractEntityId; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractEntityId1211); 

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
    // $ANTLR end "entryRuleAbstractEntityId"


    // $ANTLR start "ruleAbstractEntityId"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:533:1: ruleAbstractEntityId returns [EObject current=null] : (this_EntityId_0= ruleEntityId | this_AggregateId_1= ruleAggregateId ) ;
    public final EObject ruleAbstractEntityId() throws RecognitionException {
        EObject current = null;

        EObject this_EntityId_0 = null;

        EObject this_AggregateId_1 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:536:28: ( (this_EntityId_0= ruleEntityId | this_AggregateId_1= ruleAggregateId ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:537:1: (this_EntityId_0= ruleEntityId | this_AggregateId_1= ruleAggregateId )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:537:1: (this_EntityId_0= ruleEntityId | this_AggregateId_1= ruleAggregateId )
            int alt10=2;
            switch ( input.LA(1) ) {
            case RULE_DOC:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==33) ) {
                    alt10=2;
                }
                else if ( (LA10_1==31) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                alt10=1;
                }
                break;
            case 33:
                {
                alt10=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:538:5: this_EntityId_0= ruleEntityId
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractEntityIdAccess().getEntityIdParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEntityId_in_ruleAbstractEntityId1258);
                    this_EntityId_0=ruleEntityId();

                    state._fsp--;

                     
                            current = this_EntityId_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:548:5: this_AggregateId_1= ruleAggregateId
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractEntityIdAccess().getAggregateIdParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAggregateId_in_ruleAbstractEntityId1285);
                    this_AggregateId_1=ruleAggregateId();

                    state._fsp--;

                     
                            current = this_AggregateId_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleAbstractEntityId"


    // $ANTLR start "entryRuleAbstractEntity"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:564:1: entryRuleAbstractEntity returns [EObject current=null] : iv_ruleAbstractEntity= ruleAbstractEntity EOF ;
    public final EObject entryRuleAbstractEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractEntity = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:565:2: (iv_ruleAbstractEntity= ruleAbstractEntity EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:566:2: iv_ruleAbstractEntity= ruleAbstractEntity EOF
            {
             newCompositeNode(grammarAccess.getAbstractEntityRule()); 
            pushFollow(FOLLOW_ruleAbstractEntity_in_entryRuleAbstractEntity1320);
            iv_ruleAbstractEntity=ruleAbstractEntity();

            state._fsp--;

             current =iv_ruleAbstractEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractEntity1330); 

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
    // $ANTLR end "entryRuleAbstractEntity"


    // $ANTLR start "ruleAbstractEntity"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:573:1: ruleAbstractEntity returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Aggregate_1= ruleAggregate ) ;
    public final EObject ruleAbstractEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Aggregate_1 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:576:28: ( (this_Entity_0= ruleEntity | this_Aggregate_1= ruleAggregate ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:577:1: (this_Entity_0= ruleEntity | this_Aggregate_1= ruleAggregate )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:577:1: (this_Entity_0= ruleEntity | this_Aggregate_1= ruleAggregate )
            int alt11=2;
            switch ( input.LA(1) ) {
            case RULE_DOC:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==44) ) {
                    alt11=2;
                }
                else if ( (LA11_1==41) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                alt11=1;
                }
                break;
            case 44:
                {
                alt11=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:578:5: this_Entity_0= ruleEntity
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractEntityAccess().getEntityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleAbstractEntity1377);
                    this_Entity_0=ruleEntity();

                    state._fsp--;

                     
                            current = this_Entity_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:588:5: this_Aggregate_1= ruleAggregate
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractEntityAccess().getAggregateParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAggregate_in_ruleAbstractEntity1404);
                    this_Aggregate_1=ruleAggregate();

                    state._fsp--;

                     
                            current = this_Aggregate_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleAbstractEntity"


    // $ANTLR start "entryRuleExternalType"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:604:1: entryRuleExternalType returns [EObject current=null] : iv_ruleExternalType= ruleExternalType EOF ;
    public final EObject entryRuleExternalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalType = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:605:2: (iv_ruleExternalType= ruleExternalType EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:606:2: iv_ruleExternalType= ruleExternalType EOF
            {
             newCompositeNode(grammarAccess.getExternalTypeRule()); 
            pushFollow(FOLLOW_ruleExternalType_in_entryRuleExternalType1439);
            iv_ruleExternalType=ruleExternalType();

            state._fsp--;

             current =iv_ruleExternalType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalType1449); 

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
    // $ANTLR end "entryRuleExternalType"


    // $ANTLR start "ruleExternalType"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:613:1: ruleExternalType returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'type' ( (lv_element_2_0= 'element' ) )? ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleExternalType() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_element_2_0=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:616:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'type' ( (lv_element_2_0= 'element' ) )? ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:617:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'type' ( (lv_element_2_0= 'element' ) )? ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:617:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'type' ( (lv_element_2_0= 'element' ) )? ( (lv_name_3_0= RULE_ID ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:617:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'type' ( (lv_element_2_0= 'element' ) )? ( (lv_name_3_0= RULE_ID ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:617:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_DOC) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:618:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:618:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:619:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleExternalType1491); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getExternalTypeAccess().getDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExternalTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleExternalType1509); 

                	newLeafNode(otherlv_1, grammarAccess.getExternalTypeAccess().getTypeKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:639:1: ( (lv_element_2_0= 'element' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:640:1: (lv_element_2_0= 'element' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:640:1: (lv_element_2_0= 'element' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:641:3: lv_element_2_0= 'element'
                    {
                    lv_element_2_0=(Token)match(input,19,FOLLOW_19_in_ruleExternalType1527); 

                            newLeafNode(lv_element_2_0, grammarAccess.getExternalTypeAccess().getElementElementKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExternalTypeRule());
                    	        }
                           		setWithLastConsumed(current, "element", lv_element_2_0, "element");
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:654:3: ( (lv_name_3_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:655:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:655:1: (lv_name_3_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:656:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalType1558); 

            			newLeafNode(lv_name_3_0, grammarAccess.getExternalTypeAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExternalTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
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
    // $ANTLR end "ruleExternalType"


    // $ANTLR start "entryRuleDuration"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:680:1: entryRuleDuration returns [EObject current=null] : iv_ruleDuration= ruleDuration EOF ;
    public final EObject entryRuleDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuration = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:681:2: (iv_ruleDuration= ruleDuration EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:682:2: iv_ruleDuration= ruleDuration EOF
            {
             newCompositeNode(grammarAccess.getDurationRule()); 
            pushFollow(FOLLOW_ruleDuration_in_entryRuleDuration1599);
            iv_ruleDuration=ruleDuration();

            state._fsp--;

             current =iv_ruleDuration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDuration1609); 

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
    // $ANTLR end "entryRuleDuration"


    // $ANTLR start "ruleDuration"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:689:1: ruleDuration returns [EObject current=null] : ( ( (lv_time_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleDuration() throws RecognitionException {
        EObject current = null;

        Token lv_time_0_0=null;
        Enumerator lv_unit_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:692:28: ( ( ( (lv_time_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:693:1: ( ( (lv_time_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:693:1: ( ( (lv_time_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:693:2: ( (lv_time_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:693:2: ( (lv_time_0_0= RULE_INT ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:694:1: (lv_time_0_0= RULE_INT )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:694:1: (lv_time_0_0= RULE_INT )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:695:3: lv_time_0_0= RULE_INT
            {
            lv_time_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDuration1651); 

            			newLeafNode(lv_time_0_0, grammarAccess.getDurationAccess().getTimeINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDurationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"time",
                    		lv_time_0_0, 
                    		"INT");
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:711:2: ( (lv_unit_1_0= ruleTimeUnit ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:712:1: (lv_unit_1_0= ruleTimeUnit )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:712:1: (lv_unit_1_0= ruleTimeUnit )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:713:3: lv_unit_1_0= ruleTimeUnit
            {
             
            	        newCompositeNode(grammarAccess.getDurationAccess().getUnitTimeUnitEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTimeUnit_in_ruleDuration1677);
            lv_unit_1_0=ruleTimeUnit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDurationRule());
            	        }
                   		set(
                   			current, 
                   			"unit",
                    		lv_unit_1_0, 
                    		"TimeUnit");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleWeakConsistency"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:737:1: entryRuleWeakConsistency returns [EObject current=null] : iv_ruleWeakConsistency= ruleWeakConsistency EOF ;
    public final EObject entryRuleWeakConsistency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeakConsistency = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:738:2: (iv_ruleWeakConsistency= ruleWeakConsistency EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:739:2: iv_ruleWeakConsistency= ruleWeakConsistency EOF
            {
             newCompositeNode(grammarAccess.getWeakConsistencyRule()); 
            pushFollow(FOLLOW_ruleWeakConsistency_in_entryRuleWeakConsistency1713);
            iv_ruleWeakConsistency=ruleWeakConsistency();

            state._fsp--;

             current =iv_ruleWeakConsistency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeakConsistency1723); 

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
    // $ANTLR end "entryRuleWeakConsistency"


    // $ANTLR start "ruleWeakConsistency"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:746:1: ruleWeakConsistency returns [EObject current=null] : ( ( (lv_acceptableDoc_0_0= RULE_DOC ) )? otherlv_1= 'acceptable' ( (lv_acceptable_2_0= ruleDuration ) ) ( (lv_detectionDoc_3_0= RULE_DOC ) )? otherlv_4= 'detection' ( (lv_detection_5_0= ruleInconsistencyDetection ) ) ( (lv_resolutionDoc_6_0= RULE_DOC ) )? otherlv_7= 'resolution' ( (lv_resolution_8_0= ruleInconsistencyResolution ) ) ) ;
    public final EObject ruleWeakConsistency() throws RecognitionException {
        EObject current = null;

        Token lv_acceptableDoc_0_0=null;
        Token otherlv_1=null;
        Token lv_detectionDoc_3_0=null;
        Token otherlv_4=null;
        Token lv_resolutionDoc_6_0=null;
        Token otherlv_7=null;
        EObject lv_acceptable_2_0 = null;

        Enumerator lv_detection_5_0 = null;

        Enumerator lv_resolution_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:749:28: ( ( ( (lv_acceptableDoc_0_0= RULE_DOC ) )? otherlv_1= 'acceptable' ( (lv_acceptable_2_0= ruleDuration ) ) ( (lv_detectionDoc_3_0= RULE_DOC ) )? otherlv_4= 'detection' ( (lv_detection_5_0= ruleInconsistencyDetection ) ) ( (lv_resolutionDoc_6_0= RULE_DOC ) )? otherlv_7= 'resolution' ( (lv_resolution_8_0= ruleInconsistencyResolution ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:750:1: ( ( (lv_acceptableDoc_0_0= RULE_DOC ) )? otherlv_1= 'acceptable' ( (lv_acceptable_2_0= ruleDuration ) ) ( (lv_detectionDoc_3_0= RULE_DOC ) )? otherlv_4= 'detection' ( (lv_detection_5_0= ruleInconsistencyDetection ) ) ( (lv_resolutionDoc_6_0= RULE_DOC ) )? otherlv_7= 'resolution' ( (lv_resolution_8_0= ruleInconsistencyResolution ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:750:1: ( ( (lv_acceptableDoc_0_0= RULE_DOC ) )? otherlv_1= 'acceptable' ( (lv_acceptable_2_0= ruleDuration ) ) ( (lv_detectionDoc_3_0= RULE_DOC ) )? otherlv_4= 'detection' ( (lv_detection_5_0= ruleInconsistencyDetection ) ) ( (lv_resolutionDoc_6_0= RULE_DOC ) )? otherlv_7= 'resolution' ( (lv_resolution_8_0= ruleInconsistencyResolution ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:750:2: ( (lv_acceptableDoc_0_0= RULE_DOC ) )? otherlv_1= 'acceptable' ( (lv_acceptable_2_0= ruleDuration ) ) ( (lv_detectionDoc_3_0= RULE_DOC ) )? otherlv_4= 'detection' ( (lv_detection_5_0= ruleInconsistencyDetection ) ) ( (lv_resolutionDoc_6_0= RULE_DOC ) )? otherlv_7= 'resolution' ( (lv_resolution_8_0= ruleInconsistencyResolution ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:750:2: ( (lv_acceptableDoc_0_0= RULE_DOC ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_DOC) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:751:1: (lv_acceptableDoc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:751:1: (lv_acceptableDoc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:752:3: lv_acceptableDoc_0_0= RULE_DOC
                    {
                    lv_acceptableDoc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleWeakConsistency1765); 

                    			newLeafNode(lv_acceptableDoc_0_0, grammarAccess.getWeakConsistencyAccess().getAcceptableDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWeakConsistencyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"acceptableDoc",
                            		lv_acceptableDoc_0_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleWeakConsistency1783); 

                	newLeafNode(otherlv_1, grammarAccess.getWeakConsistencyAccess().getAcceptableKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:772:1: ( (lv_acceptable_2_0= ruleDuration ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:773:1: (lv_acceptable_2_0= ruleDuration )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:773:1: (lv_acceptable_2_0= ruleDuration )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:774:3: lv_acceptable_2_0= ruleDuration
            {
             
            	        newCompositeNode(grammarAccess.getWeakConsistencyAccess().getAcceptableDurationParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDuration_in_ruleWeakConsistency1804);
            lv_acceptable_2_0=ruleDuration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWeakConsistencyRule());
            	        }
                   		set(
                   			current, 
                   			"acceptable",
                    		lv_acceptable_2_0, 
                    		"Duration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:790:2: ( (lv_detectionDoc_3_0= RULE_DOC ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_DOC) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:791:1: (lv_detectionDoc_3_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:791:1: (lv_detectionDoc_3_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:792:3: lv_detectionDoc_3_0= RULE_DOC
                    {
                    lv_detectionDoc_3_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleWeakConsistency1821); 

                    			newLeafNode(lv_detectionDoc_3_0, grammarAccess.getWeakConsistencyAccess().getDetectionDocDOCTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWeakConsistencyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"detectionDoc",
                            		lv_detectionDoc_3_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleWeakConsistency1839); 

                	newLeafNode(otherlv_4, grammarAccess.getWeakConsistencyAccess().getDetectionKeyword_4());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:812:1: ( (lv_detection_5_0= ruleInconsistencyDetection ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:813:1: (lv_detection_5_0= ruleInconsistencyDetection )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:813:1: (lv_detection_5_0= ruleInconsistencyDetection )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:814:3: lv_detection_5_0= ruleInconsistencyDetection
            {
             
            	        newCompositeNode(grammarAccess.getWeakConsistencyAccess().getDetectionInconsistencyDetectionEnumRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleInconsistencyDetection_in_ruleWeakConsistency1860);
            lv_detection_5_0=ruleInconsistencyDetection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWeakConsistencyRule());
            	        }
                   		set(
                   			current, 
                   			"detection",
                    		lv_detection_5_0, 
                    		"InconsistencyDetection");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:830:2: ( (lv_resolutionDoc_6_0= RULE_DOC ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_DOC) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:831:1: (lv_resolutionDoc_6_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:831:1: (lv_resolutionDoc_6_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:832:3: lv_resolutionDoc_6_0= RULE_DOC
                    {
                    lv_resolutionDoc_6_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleWeakConsistency1877); 

                    			newLeafNode(lv_resolutionDoc_6_0, grammarAccess.getWeakConsistencyAccess().getResolutionDocDOCTerminalRuleCall_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWeakConsistencyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"resolutionDoc",
                            		lv_resolutionDoc_6_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleWeakConsistency1895); 

                	newLeafNode(otherlv_7, grammarAccess.getWeakConsistencyAccess().getResolutionKeyword_7());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:852:1: ( (lv_resolution_8_0= ruleInconsistencyResolution ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:853:1: (lv_resolution_8_0= ruleInconsistencyResolution )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:853:1: (lv_resolution_8_0= ruleInconsistencyResolution )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:854:3: lv_resolution_8_0= ruleInconsistencyResolution
            {
             
            	        newCompositeNode(grammarAccess.getWeakConsistencyAccess().getResolutionInconsistencyResolutionEnumRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleInconsistencyResolution_in_ruleWeakConsistency1916);
            lv_resolution_8_0=ruleInconsistencyResolution();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWeakConsistencyRule());
            	        }
                   		set(
                   			current, 
                   			"resolution",
                    		lv_resolution_8_0, 
                    		"InconsistencyResolution");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleWeakConsistency"


    // $ANTLR start "entryRuleConsistency"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:878:1: entryRuleConsistency returns [EObject current=null] : iv_ruleConsistency= ruleConsistency EOF ;
    public final EObject entryRuleConsistency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsistency = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:879:2: (iv_ruleConsistency= ruleConsistency EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:880:2: iv_ruleConsistency= ruleConsistency EOF
            {
             newCompositeNode(grammarAccess.getConsistencyRule()); 
            pushFollow(FOLLOW_ruleConsistency_in_entryRuleConsistency1952);
            iv_ruleConsistency=ruleConsistency();

            state._fsp--;

             current =iv_ruleConsistency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConsistency1962); 

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
    // $ANTLR end "entryRuleConsistency"


    // $ANTLR start "ruleConsistency"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:887:1: ruleConsistency returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'consistency' ( (lv_level_2_0= ruleConsistencyLevel ) ) (otherlv_3= '{' ( (lv_weakConsistency_4_0= ruleWeakConsistency ) ) otherlv_5= '}' )? ) ;
    public final EObject ruleConsistency() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_level_2_0 = null;

        EObject lv_weakConsistency_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:890:28: ( ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'consistency' ( (lv_level_2_0= ruleConsistencyLevel ) ) (otherlv_3= '{' ( (lv_weakConsistency_4_0= ruleWeakConsistency ) ) otherlv_5= '}' )? ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:891:1: ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'consistency' ( (lv_level_2_0= ruleConsistencyLevel ) ) (otherlv_3= '{' ( (lv_weakConsistency_4_0= ruleWeakConsistency ) ) otherlv_5= '}' )? )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:891:1: ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'consistency' ( (lv_level_2_0= ruleConsistencyLevel ) ) (otherlv_3= '{' ( (lv_weakConsistency_4_0= ruleWeakConsistency ) ) otherlv_5= '}' )? )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:891:2: ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'consistency' ( (lv_level_2_0= ruleConsistencyLevel ) ) (otherlv_3= '{' ( (lv_weakConsistency_4_0= ruleWeakConsistency ) ) otherlv_5= '}' )?
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:891:2: ( (lv_doc_0_0= RULE_DOC ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:892:1: (lv_doc_0_0= RULE_DOC )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:892:1: (lv_doc_0_0= RULE_DOC )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:893:3: lv_doc_0_0= RULE_DOC
            {
            lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleConsistency2004); 

            			newLeafNode(lv_doc_0_0, grammarAccess.getConsistencyAccess().getDocDOCTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConsistencyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"doc",
                    		lv_doc_0_0, 
                    		"DOC");
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleConsistency2021); 

                	newLeafNode(otherlv_1, grammarAccess.getConsistencyAccess().getConsistencyKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:913:1: ( (lv_level_2_0= ruleConsistencyLevel ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:914:1: (lv_level_2_0= ruleConsistencyLevel )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:914:1: (lv_level_2_0= ruleConsistencyLevel )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:915:3: lv_level_2_0= ruleConsistencyLevel
            {
             
            	        newCompositeNode(grammarAccess.getConsistencyAccess().getLevelConsistencyLevelEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConsistencyLevel_in_ruleConsistency2042);
            lv_level_2_0=ruleConsistencyLevel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConsistencyRule());
            	        }
                   		set(
                   			current, 
                   			"level",
                    		lv_level_2_0, 
                    		"ConsistencyLevel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:931:2: (otherlv_3= '{' ( (lv_weakConsistency_4_0= ruleWeakConsistency ) ) otherlv_5= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:931:4: otherlv_3= '{' ( (lv_weakConsistency_4_0= ruleWeakConsistency ) ) otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleConsistency2055); 

                        	newLeafNode(otherlv_3, grammarAccess.getConsistencyAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:935:1: ( (lv_weakConsistency_4_0= ruleWeakConsistency ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:936:1: (lv_weakConsistency_4_0= ruleWeakConsistency )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:936:1: (lv_weakConsistency_4_0= ruleWeakConsistency )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:937:3: lv_weakConsistency_4_0= ruleWeakConsistency
                    {
                     
                    	        newCompositeNode(grammarAccess.getConsistencyAccess().getWeakConsistencyWeakConsistencyParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWeakConsistency_in_ruleConsistency2076);
                    lv_weakConsistency_4_0=ruleWeakConsistency();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConsistencyRule());
                    	        }
                           		set(
                           			current, 
                           			"weakConsistency",
                            		lv_weakConsistency_4_0, 
                            		"WeakConsistency");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleConsistency2088); 

                        	newLeafNode(otherlv_5, grammarAccess.getConsistencyAccess().getRightCurlyBracketKeyword_3_2());
                        

                    }
                    break;

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
    // $ANTLR end "ruleConsistency"


    // $ANTLR start "entryRuleConstraint"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:965:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:966:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:967:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint2126);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint2136); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:974:1: ruleConstraint returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'input' ( ( ruleFQN ) ) )? (otherlv_5= 'exception' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* ( (lv_consistency_9_0= ruleConsistency ) )? (otherlv_10= 'message' ( (lv_message_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token lv_message_11_0=null;
        Token otherlv_12=null;
        EObject lv_attributes_8_0 = null;

        EObject lv_consistency_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:977:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'input' ( ( ruleFQN ) ) )? (otherlv_5= 'exception' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* ( (lv_consistency_9_0= ruleConsistency ) )? (otherlv_10= 'message' ( (lv_message_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:978:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'input' ( ( ruleFQN ) ) )? (otherlv_5= 'exception' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* ( (lv_consistency_9_0= ruleConsistency ) )? (otherlv_10= 'message' ( (lv_message_11_0= RULE_STRING ) ) )? otherlv_12= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:978:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'input' ( ( ruleFQN ) ) )? (otherlv_5= 'exception' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* ( (lv_consistency_9_0= ruleConsistency ) )? (otherlv_10= 'message' ( (lv_message_11_0= RULE_STRING ) ) )? otherlv_12= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:978:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'input' ( ( ruleFQN ) ) )? (otherlv_5= 'exception' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* ( (lv_consistency_9_0= ruleConsistency ) )? (otherlv_10= 'message' ( (lv_message_11_0= RULE_STRING ) ) )? otherlv_12= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:978:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_DOC) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:979:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:979:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:980:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleConstraint2178); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getConstraintAccess().getDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleConstraint2196); 

                	newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getConstraintKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1000:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1001:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1001:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1002:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint2213); 

            			newLeafNode(lv_name_2_0, grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstraintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1018:2: (otherlv_3= 'input' ( ( ruleFQN ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1018:4: otherlv_3= 'input' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleConstraint2231); 

                        	newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getInputKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1022:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1023:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1023:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1024:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getConstraintAccess().getInputTypeCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleConstraint2254);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1037:4: (otherlv_5= 'exception' ( ( ruleFQN ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1037:6: otherlv_5= 'exception' ( ( ruleFQN ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleConstraint2269); 

                        	newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getExceptionKeyword_4_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1041:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1042:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1042:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1043:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getConstraintAccess().getExceptionExceptionCrossReference_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleConstraint2292);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleConstraint2306); 

                	newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1060:1: ( (lv_attributes_8_0= ruleAttribute ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_DOC) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==RULE_ID||LA21_1==55) ) {
                        alt21=1;
                    }


                }
                else if ( (LA21_0==RULE_ID||LA21_0==55) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1061:1: (lv_attributes_8_0= ruleAttribute )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1061:1: (lv_attributes_8_0= ruleAttribute )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1062:3: lv_attributes_8_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstraintAccess().getAttributesAttributeParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleConstraint2327);
            	    lv_attributes_8_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_8_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1078:3: ( (lv_consistency_9_0= ruleConsistency ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_DOC) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1079:1: (lv_consistency_9_0= ruleConsistency )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1079:1: (lv_consistency_9_0= ruleConsistency )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1080:3: lv_consistency_9_0= ruleConsistency
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstraintAccess().getConsistencyConsistencyParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConsistency_in_ruleConstraint2349);
                    lv_consistency_9_0=ruleConsistency();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"consistency",
                            		lv_consistency_9_0, 
                            		"Consistency");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1096:3: (otherlv_10= 'message' ( (lv_message_11_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1096:5: otherlv_10= 'message' ( (lv_message_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_27_in_ruleConstraint2363); 

                        	newLeafNode(otherlv_10, grammarAccess.getConstraintAccess().getMessageKeyword_8_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1100:1: ( (lv_message_11_0= RULE_STRING ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1101:1: (lv_message_11_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1101:1: (lv_message_11_0= RULE_STRING )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1102:3: lv_message_11_0= RULE_STRING
                    {
                    lv_message_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint2380); 

                    			newLeafNode(lv_message_11_0, grammarAccess.getConstraintAccess().getMessageSTRINGTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"message",
                            		lv_message_11_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleConstraint2399); 

                	newLeafNode(otherlv_12, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleException"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1130:1: entryRuleException returns [EObject current=null] : iv_ruleException= ruleException EOF ;
    public final EObject entryRuleException() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleException = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1131:2: (iv_ruleException= ruleException EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1132:2: iv_ruleException= ruleException EOF
            {
             newCompositeNode(grammarAccess.getExceptionRule()); 
            pushFollow(FOLLOW_ruleException_in_entryRuleException2435);
            iv_ruleException=ruleException();

            state._fsp--;

             current =iv_ruleException; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleException2445); 

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
    // $ANTLR end "entryRuleException"


    // $ANTLR start "ruleException"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1139:1: ruleException returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'exception' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'cid' ( (lv_cid_4_0= RULE_INT ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= 'message' ( (lv_message_8_0= RULE_STRING ) ) otherlv_9= '}' ) ;
    public final EObject ruleException() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_cid_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_message_8_0=null;
        Token otherlv_9=null;
        EObject lv_attributes_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1142:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'exception' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'cid' ( (lv_cid_4_0= RULE_INT ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= 'message' ( (lv_message_8_0= RULE_STRING ) ) otherlv_9= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1143:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'exception' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'cid' ( (lv_cid_4_0= RULE_INT ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= 'message' ( (lv_message_8_0= RULE_STRING ) ) otherlv_9= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1143:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'exception' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'cid' ( (lv_cid_4_0= RULE_INT ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= 'message' ( (lv_message_8_0= RULE_STRING ) ) otherlv_9= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1143:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'exception' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'cid' ( (lv_cid_4_0= RULE_INT ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= 'message' ( (lv_message_8_0= RULE_STRING ) ) otherlv_9= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1143:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_DOC) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1144:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1144:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1145:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleException2487); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getExceptionAccess().getDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExceptionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleException2505); 

                	newLeafNode(otherlv_1, grammarAccess.getExceptionAccess().getExceptionKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1165:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1166:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1166:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1167:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleException2522); 

            			newLeafNode(lv_name_2_0, grammarAccess.getExceptionAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExceptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1183:2: (otherlv_3= 'cid' ( (lv_cid_4_0= RULE_INT ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1183:4: otherlv_3= 'cid' ( (lv_cid_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleException2540); 

                        	newLeafNode(otherlv_3, grammarAccess.getExceptionAccess().getCidKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1187:1: ( (lv_cid_4_0= RULE_INT ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1188:1: (lv_cid_4_0= RULE_INT )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1188:1: (lv_cid_4_0= RULE_INT )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1189:3: lv_cid_4_0= RULE_INT
                    {
                    lv_cid_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleException2557); 

                    			newLeafNode(lv_cid_4_0, grammarAccess.getExceptionAccess().getCidINTTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExceptionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"cid",
                            		lv_cid_4_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleException2576); 

                	newLeafNode(otherlv_5, grammarAccess.getExceptionAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1209:1: ( (lv_attributes_6_0= ruleAttribute ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_DOC)||LA26_0==55) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1210:1: (lv_attributes_6_0= ruleAttribute )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1210:1: (lv_attributes_6_0= ruleAttribute )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1211:3: lv_attributes_6_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExceptionAccess().getAttributesAttributeParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleException2597);
            	    lv_attributes_6_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExceptionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_6_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleException2610); 

                	newLeafNode(otherlv_7, grammarAccess.getExceptionAccess().getMessageKeyword_6());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1231:1: ( (lv_message_8_0= RULE_STRING ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1232:1: (lv_message_8_0= RULE_STRING )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1232:1: (lv_message_8_0= RULE_STRING )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1233:3: lv_message_8_0= RULE_STRING
            {
            lv_message_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleException2627); 

            			newLeafNode(lv_message_8_0, grammarAccess.getExceptionAccess().getMessageSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExceptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"message",
                    		lv_message_8_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleException2644); 

                	newLeafNode(otherlv_9, grammarAccess.getExceptionAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleException"


    // $ANTLR start "entryRuleValueObject"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1261:1: entryRuleValueObject returns [EObject current=null] : iv_ruleValueObject= ruleValueObject EOF ;
    public final EObject entryRuleValueObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueObject = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1262:2: (iv_ruleValueObject= ruleValueObject EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1263:2: iv_ruleValueObject= ruleValueObject EOF
            {
             newCompositeNode(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_ruleValueObject_in_entryRuleValueObject2680);
            iv_ruleValueObject=ruleValueObject();

            state._fsp--;

             current =iv_ruleValueObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueObject2690); 

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
    // $ANTLR end "entryRuleValueObject"


    // $ANTLR start "ruleValueObject"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1270:1: ruleValueObject returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'value-object' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( ( ruleFQN ) ) )? ( (lv_invariants_5_0= ruleInvariants ) )? otherlv_6= '{' ( (lv_metaInfo_7_0= ruleTypeMetaInfo ) ) ( (lv_attributes_8_0= ruleAttribute ) )* ( (lv_constructors_9_0= ruleConstructor ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}' ) ;
    public final EObject ruleValueObject() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_11=null;
        EObject lv_invariants_5_0 = null;

        EObject lv_metaInfo_7_0 = null;

        EObject lv_attributes_8_0 = null;

        EObject lv_constructors_9_0 = null;

        EObject lv_methods_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1273:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'value-object' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( ( ruleFQN ) ) )? ( (lv_invariants_5_0= ruleInvariants ) )? otherlv_6= '{' ( (lv_metaInfo_7_0= ruleTypeMetaInfo ) ) ( (lv_attributes_8_0= ruleAttribute ) )* ( (lv_constructors_9_0= ruleConstructor ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1274:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'value-object' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( ( ruleFQN ) ) )? ( (lv_invariants_5_0= ruleInvariants ) )? otherlv_6= '{' ( (lv_metaInfo_7_0= ruleTypeMetaInfo ) ) ( (lv_attributes_8_0= ruleAttribute ) )* ( (lv_constructors_9_0= ruleConstructor ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1274:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'value-object' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( ( ruleFQN ) ) )? ( (lv_invariants_5_0= ruleInvariants ) )? otherlv_6= '{' ( (lv_metaInfo_7_0= ruleTypeMetaInfo ) ) ( (lv_attributes_8_0= ruleAttribute ) )* ( (lv_constructors_9_0= ruleConstructor ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1274:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'value-object' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( ( ruleFQN ) ) )? ( (lv_invariants_5_0= ruleInvariants ) )? otherlv_6= '{' ( (lv_metaInfo_7_0= ruleTypeMetaInfo ) ) ( (lv_attributes_8_0= ruleAttribute ) )* ( (lv_constructors_9_0= ruleConstructor ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1274:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_DOC) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1275:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1275:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1276:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleValueObject2732); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getValueObjectAccess().getDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueObjectRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleValueObject2750); 

                	newLeafNode(otherlv_1, grammarAccess.getValueObjectAccess().getValueObjectKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1296:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1297:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1297:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1298:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValueObject2767); 

            			newLeafNode(lv_name_2_0, grammarAccess.getValueObjectAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getValueObjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1314:2: (otherlv_3= 'base' ( ( ruleFQN ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1314:4: otherlv_3= 'base' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleValueObject2785); 

                        	newLeafNode(otherlv_3, grammarAccess.getValueObjectAccess().getBaseKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1318:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1319:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1319:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1320:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueObjectRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getValueObjectAccess().getBaseExternalTypeCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleValueObject2808);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1333:4: ( (lv_invariants_5_0= ruleInvariants ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==57) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1334:1: (lv_invariants_5_0= ruleInvariants )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1334:1: (lv_invariants_5_0= ruleInvariants )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1335:3: lv_invariants_5_0= ruleInvariants
                    {
                     
                    	        newCompositeNode(grammarAccess.getValueObjectAccess().getInvariantsInvariantsParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInvariants_in_ruleValueObject2831);
                    lv_invariants_5_0=ruleInvariants();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValueObjectRule());
                    	        }
                           		set(
                           			current, 
                           			"invariants",
                            		lv_invariants_5_0, 
                            		"Invariants");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleValueObject2844); 

                	newLeafNode(otherlv_6, grammarAccess.getValueObjectAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1355:1: ( (lv_metaInfo_7_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1356:1: (lv_metaInfo_7_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1356:1: (lv_metaInfo_7_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1357:3: lv_metaInfo_7_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getValueObjectAccess().getMetaInfoTypeMetaInfoParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleValueObject2865);
            lv_metaInfo_7_0=ruleTypeMetaInfo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValueObjectRule());
            	        }
                   		set(
                   			current, 
                   			"metaInfo",
                    		lv_metaInfo_7_0, 
                    		"TypeMetaInfo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1373:2: ( (lv_attributes_8_0= ruleAttribute ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_DOC) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==RULE_ID||LA30_1==55) ) {
                        alt30=1;
                    }


                }
                else if ( (LA30_0==RULE_ID||LA30_0==55) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1374:1: (lv_attributes_8_0= ruleAttribute )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1374:1: (lv_attributes_8_0= ruleAttribute )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1375:3: lv_attributes_8_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValueObjectAccess().getAttributesAttributeParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleValueObject2886);
            	    lv_attributes_8_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getValueObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_8_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1391:3: ( (lv_constructors_9_0= ruleConstructor ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_DOC) ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1==45) ) {
                        alt31=1;
                    }


                }
                else if ( (LA31_0==45) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1392:1: (lv_constructors_9_0= ruleConstructor )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1392:1: (lv_constructors_9_0= ruleConstructor )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1393:3: lv_constructors_9_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValueObjectAccess().getConstructorsConstructorParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleValueObject2908);
            	    lv_constructors_9_0=ruleConstructor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getValueObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constructors",
            	            		lv_constructors_9_0, 
            	            		"Constructor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1409:3: ( (lv_methods_10_0= ruleMethod ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_DOC||LA32_0==48) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1410:1: (lv_methods_10_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1410:1: (lv_methods_10_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1411:3: lv_methods_10_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValueObjectAccess().getMethodsMethodParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleValueObject2930);
            	    lv_methods_10_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getValueObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_10_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleValueObject2943); 

                	newLeafNode(otherlv_11, grammarAccess.getValueObjectAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleValueObject"


    // $ANTLR start "entryRuleEntityId"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1439:1: entryRuleEntityId returns [EObject current=null] : iv_ruleEntityId= ruleEntityId EOF ;
    public final EObject entryRuleEntityId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityId = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1440:2: (iv_ruleEntityId= ruleEntityId EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1441:2: iv_ruleEntityId= ruleEntityId EOF
            {
             newCompositeNode(grammarAccess.getEntityIdRule()); 
            pushFollow(FOLLOW_ruleEntityId_in_entryRuleEntityId2979);
            iv_ruleEntityId=ruleEntityId();

            state._fsp--;

             current =iv_ruleEntityId; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityId2989); 

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
    // $ANTLR end "entryRuleEntityId"


    // $ANTLR start "ruleEntityId"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1448:1: ruleEntityId returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity-id' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'identifies' ( ( ruleFQN ) ) )? (otherlv_5= 'base' ( ( ruleFQN ) ) )? ( (lv_invariants_7_0= ruleInvariants ) )? otherlv_8= '{' ( (lv_metaInfo_9_0= ruleTypeMetaInfo ) ) ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_constructors_11_0= ruleConstructor ) )* ( (lv_methods_12_0= ruleMethod ) )* otherlv_13= '}' ) ;
    public final EObject ruleEntityId() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_13=null;
        EObject lv_invariants_7_0 = null;

        EObject lv_metaInfo_9_0 = null;

        EObject lv_attributes_10_0 = null;

        EObject lv_constructors_11_0 = null;

        EObject lv_methods_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1451:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity-id' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'identifies' ( ( ruleFQN ) ) )? (otherlv_5= 'base' ( ( ruleFQN ) ) )? ( (lv_invariants_7_0= ruleInvariants ) )? otherlv_8= '{' ( (lv_metaInfo_9_0= ruleTypeMetaInfo ) ) ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_constructors_11_0= ruleConstructor ) )* ( (lv_methods_12_0= ruleMethod ) )* otherlv_13= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1452:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity-id' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'identifies' ( ( ruleFQN ) ) )? (otherlv_5= 'base' ( ( ruleFQN ) ) )? ( (lv_invariants_7_0= ruleInvariants ) )? otherlv_8= '{' ( (lv_metaInfo_9_0= ruleTypeMetaInfo ) ) ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_constructors_11_0= ruleConstructor ) )* ( (lv_methods_12_0= ruleMethod ) )* otherlv_13= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1452:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity-id' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'identifies' ( ( ruleFQN ) ) )? (otherlv_5= 'base' ( ( ruleFQN ) ) )? ( (lv_invariants_7_0= ruleInvariants ) )? otherlv_8= '{' ( (lv_metaInfo_9_0= ruleTypeMetaInfo ) ) ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_constructors_11_0= ruleConstructor ) )* ( (lv_methods_12_0= ruleMethod ) )* otherlv_13= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1452:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity-id' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'identifies' ( ( ruleFQN ) ) )? (otherlv_5= 'base' ( ( ruleFQN ) ) )? ( (lv_invariants_7_0= ruleInvariants ) )? otherlv_8= '{' ( (lv_metaInfo_9_0= ruleTypeMetaInfo ) ) ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_constructors_11_0= ruleConstructor ) )* ( (lv_methods_12_0= ruleMethod ) )* otherlv_13= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1452:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_DOC) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1453:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1453:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1454:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleEntityId3031); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getEntityIdAccess().getDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityIdRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleEntityId3049); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityIdAccess().getEntityIdKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1474:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1475:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1475:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1476:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityId3066); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEntityIdAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityIdRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1492:2: (otherlv_3= 'identifies' ( ( ruleFQN ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==32) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1492:4: otherlv_3= 'identifies' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleEntityId3084); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityIdAccess().getIdentifiesKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1496:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1497:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1497:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1498:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityIdRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEntityIdAccess().getEntityEntityCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleEntityId3107);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1511:4: (otherlv_5= 'base' ( ( ruleFQN ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==30) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1511:6: otherlv_5= 'base' ( ( ruleFQN ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleEntityId3122); 

                        	newLeafNode(otherlv_5, grammarAccess.getEntityIdAccess().getBaseKeyword_4_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1515:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1516:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1516:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1517:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityIdRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEntityIdAccess().getBaseExternalTypeCrossReference_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleEntityId3145);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1530:4: ( (lv_invariants_7_0= ruleInvariants ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==57) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1531:1: (lv_invariants_7_0= ruleInvariants )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1531:1: (lv_invariants_7_0= ruleInvariants )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1532:3: lv_invariants_7_0= ruleInvariants
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityIdAccess().getInvariantsInvariantsParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInvariants_in_ruleEntityId3168);
                    lv_invariants_7_0=ruleInvariants();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityIdRule());
                    	        }
                           		set(
                           			current, 
                           			"invariants",
                            		lv_invariants_7_0, 
                            		"Invariants");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleEntityId3181); 

                	newLeafNode(otherlv_8, grammarAccess.getEntityIdAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1552:1: ( (lv_metaInfo_9_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1553:1: (lv_metaInfo_9_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1553:1: (lv_metaInfo_9_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1554:3: lv_metaInfo_9_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getEntityIdAccess().getMetaInfoTypeMetaInfoParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleEntityId3202);
            lv_metaInfo_9_0=ruleTypeMetaInfo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityIdRule());
            	        }
                   		set(
                   			current, 
                   			"metaInfo",
                    		lv_metaInfo_9_0, 
                    		"TypeMetaInfo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1570:2: ( (lv_attributes_10_0= ruleAttribute ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_DOC) ) {
                    int LA37_1 = input.LA(2);

                    if ( (LA37_1==RULE_ID||LA37_1==55) ) {
                        alt37=1;
                    }


                }
                else if ( (LA37_0==RULE_ID||LA37_0==55) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1571:1: (lv_attributes_10_0= ruleAttribute )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1571:1: (lv_attributes_10_0= ruleAttribute )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1572:3: lv_attributes_10_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityIdAccess().getAttributesAttributeParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntityId3223);
            	    lv_attributes_10_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityIdRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_10_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1588:3: ( (lv_constructors_11_0= ruleConstructor ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_DOC) ) {
                    int LA38_1 = input.LA(2);

                    if ( (LA38_1==45) ) {
                        alt38=1;
                    }


                }
                else if ( (LA38_0==45) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1589:1: (lv_constructors_11_0= ruleConstructor )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1589:1: (lv_constructors_11_0= ruleConstructor )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1590:3: lv_constructors_11_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityIdAccess().getConstructorsConstructorParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleEntityId3245);
            	    lv_constructors_11_0=ruleConstructor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityIdRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constructors",
            	            		lv_constructors_11_0, 
            	            		"Constructor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1606:3: ( (lv_methods_12_0= ruleMethod ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_DOC||LA39_0==48) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1607:1: (lv_methods_12_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1607:1: (lv_methods_12_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1608:3: lv_methods_12_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityIdAccess().getMethodsMethodParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleEntityId3267);
            	    lv_methods_12_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityIdRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_12_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleEntityId3280); 

                	newLeafNode(otherlv_13, grammarAccess.getEntityIdAccess().getRightCurlyBracketKeyword_11());
                

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
    // $ANTLR end "ruleEntityId"


    // $ANTLR start "entryRuleAggregateId"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1636:1: entryRuleAggregateId returns [EObject current=null] : iv_ruleAggregateId= ruleAggregateId EOF ;
    public final EObject entryRuleAggregateId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregateId = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1637:2: (iv_ruleAggregateId= ruleAggregateId EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1638:2: iv_ruleAggregateId= ruleAggregateId EOF
            {
             newCompositeNode(grammarAccess.getAggregateIdRule()); 
            pushFollow(FOLLOW_ruleAggregateId_in_entryRuleAggregateId3316);
            iv_ruleAggregateId=ruleAggregateId();

            state._fsp--;

             current =iv_ruleAggregateId; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAggregateId3326); 

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
    // $ANTLR end "entryRuleAggregateId"


    // $ANTLR start "ruleAggregateId"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1645:1: ruleAggregateId returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate-id' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'identifies' ( ( ruleFQN ) ) )? (otherlv_5= 'base' ( ( ruleFQN ) ) )? ( (lv_invariants_7_0= ruleInvariants ) )? otherlv_8= '{' ( (lv_metaInfo_9_0= ruleTypeMetaInfo ) ) ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_constructors_11_0= ruleConstructor ) )* ( (lv_methods_12_0= ruleMethod ) )* otherlv_13= '}' ) ;
    public final EObject ruleAggregateId() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_13=null;
        EObject lv_invariants_7_0 = null;

        EObject lv_metaInfo_9_0 = null;

        EObject lv_attributes_10_0 = null;

        EObject lv_constructors_11_0 = null;

        EObject lv_methods_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1648:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate-id' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'identifies' ( ( ruleFQN ) ) )? (otherlv_5= 'base' ( ( ruleFQN ) ) )? ( (lv_invariants_7_0= ruleInvariants ) )? otherlv_8= '{' ( (lv_metaInfo_9_0= ruleTypeMetaInfo ) ) ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_constructors_11_0= ruleConstructor ) )* ( (lv_methods_12_0= ruleMethod ) )* otherlv_13= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1649:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate-id' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'identifies' ( ( ruleFQN ) ) )? (otherlv_5= 'base' ( ( ruleFQN ) ) )? ( (lv_invariants_7_0= ruleInvariants ) )? otherlv_8= '{' ( (lv_metaInfo_9_0= ruleTypeMetaInfo ) ) ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_constructors_11_0= ruleConstructor ) )* ( (lv_methods_12_0= ruleMethod ) )* otherlv_13= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1649:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate-id' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'identifies' ( ( ruleFQN ) ) )? (otherlv_5= 'base' ( ( ruleFQN ) ) )? ( (lv_invariants_7_0= ruleInvariants ) )? otherlv_8= '{' ( (lv_metaInfo_9_0= ruleTypeMetaInfo ) ) ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_constructors_11_0= ruleConstructor ) )* ( (lv_methods_12_0= ruleMethod ) )* otherlv_13= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1649:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate-id' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'identifies' ( ( ruleFQN ) ) )? (otherlv_5= 'base' ( ( ruleFQN ) ) )? ( (lv_invariants_7_0= ruleInvariants ) )? otherlv_8= '{' ( (lv_metaInfo_9_0= ruleTypeMetaInfo ) ) ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_constructors_11_0= ruleConstructor ) )* ( (lv_methods_12_0= ruleMethod ) )* otherlv_13= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1649:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_DOC) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1650:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1650:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1651:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleAggregateId3368); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getAggregateIdAccess().getDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAggregateIdRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleAggregateId3386); 

                	newLeafNode(otherlv_1, grammarAccess.getAggregateIdAccess().getAggregateIdKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1671:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1672:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1672:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1673:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAggregateId3403); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAggregateIdAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAggregateIdRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1689:2: (otherlv_3= 'identifies' ( ( ruleFQN ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==32) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1689:4: otherlv_3= 'identifies' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleAggregateId3421); 

                        	newLeafNode(otherlv_3, grammarAccess.getAggregateIdAccess().getIdentifiesKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1693:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1694:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1694:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1695:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAggregateIdRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAggregateIdAccess().getAggregateAggregateCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleAggregateId3444);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1708:4: (otherlv_5= 'base' ( ( ruleFQN ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==30) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1708:6: otherlv_5= 'base' ( ( ruleFQN ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleAggregateId3459); 

                        	newLeafNode(otherlv_5, grammarAccess.getAggregateIdAccess().getBaseKeyword_4_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1712:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1713:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1713:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1714:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAggregateIdRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAggregateIdAccess().getBaseExternalTypeCrossReference_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleAggregateId3482);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1727:4: ( (lv_invariants_7_0= ruleInvariants ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==57) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1728:1: (lv_invariants_7_0= ruleInvariants )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1728:1: (lv_invariants_7_0= ruleInvariants )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1729:3: lv_invariants_7_0= ruleInvariants
                    {
                     
                    	        newCompositeNode(grammarAccess.getAggregateIdAccess().getInvariantsInvariantsParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInvariants_in_ruleAggregateId3505);
                    lv_invariants_7_0=ruleInvariants();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAggregateIdRule());
                    	        }
                           		set(
                           			current, 
                           			"invariants",
                            		lv_invariants_7_0, 
                            		"Invariants");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleAggregateId3518); 

                	newLeafNode(otherlv_8, grammarAccess.getAggregateIdAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1749:1: ( (lv_metaInfo_9_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1750:1: (lv_metaInfo_9_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1750:1: (lv_metaInfo_9_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1751:3: lv_metaInfo_9_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getAggregateIdAccess().getMetaInfoTypeMetaInfoParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleAggregateId3539);
            lv_metaInfo_9_0=ruleTypeMetaInfo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAggregateIdRule());
            	        }
                   		set(
                   			current, 
                   			"metaInfo",
                    		lv_metaInfo_9_0, 
                    		"TypeMetaInfo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1767:2: ( (lv_attributes_10_0= ruleAttribute ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_DOC) ) {
                    int LA44_1 = input.LA(2);

                    if ( (LA44_1==RULE_ID||LA44_1==55) ) {
                        alt44=1;
                    }


                }
                else if ( (LA44_0==RULE_ID||LA44_0==55) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1768:1: (lv_attributes_10_0= ruleAttribute )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1768:1: (lv_attributes_10_0= ruleAttribute )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1769:3: lv_attributes_10_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateIdAccess().getAttributesAttributeParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleAggregateId3560);
            	    lv_attributes_10_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAggregateIdRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_10_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1785:3: ( (lv_constructors_11_0= ruleConstructor ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_DOC) ) {
                    int LA45_1 = input.LA(2);

                    if ( (LA45_1==45) ) {
                        alt45=1;
                    }


                }
                else if ( (LA45_0==45) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1786:1: (lv_constructors_11_0= ruleConstructor )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1786:1: (lv_constructors_11_0= ruleConstructor )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1787:3: lv_constructors_11_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateIdAccess().getConstructorsConstructorParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleAggregateId3582);
            	    lv_constructors_11_0=ruleConstructor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAggregateIdRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constructors",
            	            		lv_constructors_11_0, 
            	            		"Constructor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1803:3: ( (lv_methods_12_0= ruleMethod ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_DOC||LA46_0==48) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1804:1: (lv_methods_12_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1804:1: (lv_methods_12_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1805:3: lv_methods_12_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateIdAccess().getMethodsMethodParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleAggregateId3604);
            	    lv_methods_12_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAggregateIdRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_12_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleAggregateId3617); 

                	newLeafNode(otherlv_13, grammarAccess.getAggregateIdAccess().getRightCurlyBracketKeyword_11());
                

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
    // $ANTLR end "ruleAggregateId"


    // $ANTLR start "entryRuleEnumObject"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1833:1: entryRuleEnumObject returns [EObject current=null] : iv_ruleEnumObject= ruleEnumObject EOF ;
    public final EObject entryRuleEnumObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumObject = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1834:2: (iv_ruleEnumObject= ruleEnumObject EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1835:2: iv_ruleEnumObject= ruleEnumObject EOF
            {
             newCompositeNode(grammarAccess.getEnumObjectRule()); 
            pushFollow(FOLLOW_ruleEnumObject_in_entryRuleEnumObject3653);
            iv_ruleEnumObject=ruleEnumObject();

            state._fsp--;

             current =iv_ruleEnumObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumObject3663); 

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
    // $ANTLR end "entryRuleEnumObject"


    // $ANTLR start "ruleEnumObject"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1842:1: ruleEnumObject returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( ( ruleFQN ) ) )? ( (lv_invariants_5_0= ruleInvariants ) )? otherlv_6= '{' ( (lv_metaInfo_7_0= ruleTypeMetaInfo ) ) ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= 'instances' otherlv_10= '{' ( (lv_instances_11_0= ruleEnumInstance ) )+ otherlv_12= '}' otherlv_13= '}' ) ;
    public final EObject ruleEnumObject() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_invariants_5_0 = null;

        EObject lv_metaInfo_7_0 = null;

        EObject lv_attributes_8_0 = null;

        EObject lv_instances_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1845:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( ( ruleFQN ) ) )? ( (lv_invariants_5_0= ruleInvariants ) )? otherlv_6= '{' ( (lv_metaInfo_7_0= ruleTypeMetaInfo ) ) ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= 'instances' otherlv_10= '{' ( (lv_instances_11_0= ruleEnumInstance ) )+ otherlv_12= '}' otherlv_13= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1846:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( ( ruleFQN ) ) )? ( (lv_invariants_5_0= ruleInvariants ) )? otherlv_6= '{' ( (lv_metaInfo_7_0= ruleTypeMetaInfo ) ) ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= 'instances' otherlv_10= '{' ( (lv_instances_11_0= ruleEnumInstance ) )+ otherlv_12= '}' otherlv_13= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1846:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( ( ruleFQN ) ) )? ( (lv_invariants_5_0= ruleInvariants ) )? otherlv_6= '{' ( (lv_metaInfo_7_0= ruleTypeMetaInfo ) ) ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= 'instances' otherlv_10= '{' ( (lv_instances_11_0= ruleEnumInstance ) )+ otherlv_12= '}' otherlv_13= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1846:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( ( ruleFQN ) ) )? ( (lv_invariants_5_0= ruleInvariants ) )? otherlv_6= '{' ( (lv_metaInfo_7_0= ruleTypeMetaInfo ) ) ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= 'instances' otherlv_10= '{' ( (lv_instances_11_0= ruleEnumInstance ) )+ otherlv_12= '}' otherlv_13= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1846:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_DOC) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1847:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1847:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1848:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleEnumObject3705); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getEnumObjectAccess().getDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumObjectRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleEnumObject3723); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumObjectAccess().getEnumKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1868:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1869:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1869:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1870:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumObject3740); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEnumObjectAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumObjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1886:2: (otherlv_3= 'base' ( ( ruleFQN ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==30) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1886:4: otherlv_3= 'base' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleEnumObject3758); 

                        	newLeafNode(otherlv_3, grammarAccess.getEnumObjectAccess().getBaseKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1890:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1891:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1891:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1892:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumObjectRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEnumObjectAccess().getBaseExternalTypeCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleEnumObject3781);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1905:4: ( (lv_invariants_5_0= ruleInvariants ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==57) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1906:1: (lv_invariants_5_0= ruleInvariants )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1906:1: (lv_invariants_5_0= ruleInvariants )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1907:3: lv_invariants_5_0= ruleInvariants
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumObjectAccess().getInvariantsInvariantsParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInvariants_in_ruleEnumObject3804);
                    lv_invariants_5_0=ruleInvariants();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnumObjectRule());
                    	        }
                           		set(
                           			current, 
                           			"invariants",
                            		lv_invariants_5_0, 
                            		"Invariants");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleEnumObject3817); 

                	newLeafNode(otherlv_6, grammarAccess.getEnumObjectAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1927:1: ( (lv_metaInfo_7_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1928:1: (lv_metaInfo_7_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1928:1: (lv_metaInfo_7_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1929:3: lv_metaInfo_7_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getEnumObjectAccess().getMetaInfoTypeMetaInfoParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleEnumObject3838);
            lv_metaInfo_7_0=ruleTypeMetaInfo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumObjectRule());
            	        }
                   		set(
                   			current, 
                   			"metaInfo",
                    		lv_metaInfo_7_0, 
                    		"TypeMetaInfo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1945:2: ( (lv_attributes_8_0= ruleAttribute ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_DOC)||LA50_0==55) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1946:1: (lv_attributes_8_0= ruleAttribute )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1946:1: (lv_attributes_8_0= ruleAttribute )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1947:3: lv_attributes_8_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumObjectAccess().getAttributesAttributeParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEnumObject3859);
            	    lv_attributes_8_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_8_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_9=(Token)match(input,35,FOLLOW_35_in_ruleEnumObject3872); 

                	newLeafNode(otherlv_9, grammarAccess.getEnumObjectAccess().getInstancesKeyword_8());
                
            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleEnumObject3884); 

                	newLeafNode(otherlv_10, grammarAccess.getEnumObjectAccess().getLeftCurlyBracketKeyword_9());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1971:1: ( (lv_instances_11_0= ruleEnumInstance ) )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_DOC)||LA51_0==36) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1972:1: (lv_instances_11_0= ruleEnumInstance )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1972:1: (lv_instances_11_0= ruleEnumInstance )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1973:3: lv_instances_11_0= ruleEnumInstance
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumObjectAccess().getInstancesEnumInstanceParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumInstance_in_ruleEnumObject3905);
            	    lv_instances_11_0=ruleEnumInstance();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instances",
            	            		lv_instances_11_0, 
            	            		"EnumInstance");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
            } while (true);

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleEnumObject3918); 

                	newLeafNode(otherlv_12, grammarAccess.getEnumObjectAccess().getRightCurlyBracketKeyword_11());
                
            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleEnumObject3930); 

                	newLeafNode(otherlv_13, grammarAccess.getEnumObjectAccess().getRightCurlyBracketKeyword_12());
                

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
    // $ANTLR end "ruleEnumObject"


    // $ANTLR start "entryRuleEnumInstance"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2005:1: entryRuleEnumInstance returns [EObject current=null] : iv_ruleEnumInstance= ruleEnumInstance EOF ;
    public final EObject entryRuleEnumInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumInstance = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2006:2: (iv_ruleEnumInstance= ruleEnumInstance EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2007:2: iv_ruleEnumInstance= ruleEnumInstance EOF
            {
             newCompositeNode(grammarAccess.getEnumInstanceRule()); 
            pushFollow(FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance3966);
            iv_ruleEnumInstance=ruleEnumInstance();

            state._fsp--;

             current =iv_ruleEnumInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumInstance3976); 

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
    // $ANTLR end "entryRuleEnumInstance"


    // $ANTLR start "ruleEnumInstance"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2014:1: ruleEnumInstance returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_deprecated_1_0= 'deprecated' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_params_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleLiteral ) ) )* otherlv_7= ')' )? ) ;
    public final EObject ruleEnumInstance() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token lv_deprecated_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_params_4_0 = null;

        EObject lv_params_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2017:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_deprecated_1_0= 'deprecated' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_params_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleLiteral ) ) )* otherlv_7= ')' )? ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2018:1: ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_deprecated_1_0= 'deprecated' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_params_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleLiteral ) ) )* otherlv_7= ')' )? )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2018:1: ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_deprecated_1_0= 'deprecated' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_params_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleLiteral ) ) )* otherlv_7= ')' )? )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2018:2: ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_deprecated_1_0= 'deprecated' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_params_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleLiteral ) ) )* otherlv_7= ')' )?
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2018:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_DOC) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2019:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2019:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2020:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleEnumInstance4018); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getEnumInstanceAccess().getDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2036:3: ( (lv_deprecated_1_0= 'deprecated' ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==36) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2037:1: (lv_deprecated_1_0= 'deprecated' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2037:1: (lv_deprecated_1_0= 'deprecated' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2038:3: lv_deprecated_1_0= 'deprecated'
                    {
                    lv_deprecated_1_0=(Token)match(input,36,FOLLOW_36_in_ruleEnumInstance4042); 

                            newLeafNode(lv_deprecated_1_0, grammarAccess.getEnumInstanceAccess().getDeprecatedDeprecatedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumInstanceRule());
                    	        }
                           		setWithLastConsumed(current, "deprecated", lv_deprecated_1_0, "deprecated");
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2051:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2052:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2052:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2053:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance4073); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEnumInstanceAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumInstanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2069:2: (otherlv_3= '(' ( (lv_params_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleLiteral ) ) )* otherlv_7= ')' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==37) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2069:4: otherlv_3= '(' ( (lv_params_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleLiteral ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleEnumInstance4091); 

                        	newLeafNode(otherlv_3, grammarAccess.getEnumInstanceAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2073:1: ( (lv_params_4_0= ruleLiteral ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2074:1: (lv_params_4_0= ruleLiteral )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2074:1: (lv_params_4_0= ruleLiteral )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2075:3: lv_params_4_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumInstanceAccess().getParamsLiteralParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleEnumInstance4112);
                    lv_params_4_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnumInstanceRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_4_0, 
                            		"Literal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2091:2: (otherlv_5= ',' ( (lv_params_6_0= ruleLiteral ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==38) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2091:4: otherlv_5= ',' ( (lv_params_6_0= ruleLiteral ) )
                    	    {
                    	    otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleEnumInstance4125); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getEnumInstanceAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2095:1: ( (lv_params_6_0= ruleLiteral ) )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2096:1: (lv_params_6_0= ruleLiteral )
                    	    {
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2096:1: (lv_params_6_0= ruleLiteral )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2097:3: lv_params_6_0= ruleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEnumInstanceAccess().getParamsLiteralParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteral_in_ruleEnumInstance4146);
                    	    lv_params_6_0=ruleLiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEnumInstanceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_6_0, 
                    	            		"Literal");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,39,FOLLOW_39_in_ruleEnumInstance4160); 

                        	newLeafNode(otherlv_7, grammarAccess.getEnumInstanceAccess().getRightParenthesisKeyword_3_3());
                        

                    }
                    break;

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
    // $ANTLR end "ruleEnumInstance"


    // $ANTLR start "entryRuleEvent"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2125:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2126:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2127:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent4198);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent4208); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2134:1: ruleEvent returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )* (otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_message_6_0=null;
        Token otherlv_7=null;
        EObject lv_attributes_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2137:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )* (otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2138:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )* (otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2138:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )* (otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2138:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )* (otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) ) )? otherlv_7= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2138:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_DOC) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2139:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2139:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2140:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleEvent4250); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getEventAccess().getDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleEvent4268); 

                	newLeafNode(otherlv_1, grammarAccess.getEventAccess().getEventKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2160:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2161:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2161:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2162:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent4285); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleEvent4302); 

                	newLeafNode(otherlv_3, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2182:1: ( (lv_attributes_4_0= ruleAttribute ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_DOC)||LA57_0==55) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2183:1: (lv_attributes_4_0= ruleAttribute )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2183:1: (lv_attributes_4_0= ruleAttribute )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2184:3: lv_attributes_4_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEventAccess().getAttributesAttributeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEvent4323);
            	    lv_attributes_4_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEventRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_4_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2200:3: (otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==27) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2200:5: otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleEvent4337); 

                        	newLeafNode(otherlv_5, grammarAccess.getEventAccess().getMessageKeyword_5_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2204:1: ( (lv_message_6_0= RULE_STRING ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2205:1: (lv_message_6_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2205:1: (lv_message_6_0= RULE_STRING )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2206:3: lv_message_6_0= RULE_STRING
                    {
                    lv_message_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEvent4354); 

                    			newLeafNode(lv_message_6_0, grammarAccess.getEventAccess().getMessageSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"message",
                            		lv_message_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleEvent4373); 

                	newLeafNode(otherlv_7, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleEntity"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2234:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2235:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2236:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity4409);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity4419); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2243:1: ruleEntity returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'identifier' ( ( ruleFQN ) ) )? otherlv_5= 'root' ( ( ruleFQN ) ) ( (lv_invariants_7_0= ruleInvariants ) )? otherlv_8= '{' ( (lv_metaInfo_9_0= ruleTypeMetaInfo ) ) ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_constructors_11_0= ruleConstructor ) )* ( (lv_methods_12_0= ruleMethod ) )* ( (lv_events_13_0= ruleEvent ) )* ( (lv_entityId_14_0= ruleEntityId ) )? otherlv_15= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_15=null;
        EObject lv_invariants_7_0 = null;

        EObject lv_metaInfo_9_0 = null;

        EObject lv_attributes_10_0 = null;

        EObject lv_constructors_11_0 = null;

        EObject lv_methods_12_0 = null;

        EObject lv_events_13_0 = null;

        EObject lv_entityId_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2246:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'identifier' ( ( ruleFQN ) ) )? otherlv_5= 'root' ( ( ruleFQN ) ) ( (lv_invariants_7_0= ruleInvariants ) )? otherlv_8= '{' ( (lv_metaInfo_9_0= ruleTypeMetaInfo ) ) ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_constructors_11_0= ruleConstructor ) )* ( (lv_methods_12_0= ruleMethod ) )* ( (lv_events_13_0= ruleEvent ) )* ( (lv_entityId_14_0= ruleEntityId ) )? otherlv_15= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2247:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'identifier' ( ( ruleFQN ) ) )? otherlv_5= 'root' ( ( ruleFQN ) ) ( (lv_invariants_7_0= ruleInvariants ) )? otherlv_8= '{' ( (lv_metaInfo_9_0= ruleTypeMetaInfo ) ) ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_constructors_11_0= ruleConstructor ) )* ( (lv_methods_12_0= ruleMethod ) )* ( (lv_events_13_0= ruleEvent ) )* ( (lv_entityId_14_0= ruleEntityId ) )? otherlv_15= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2247:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'identifier' ( ( ruleFQN ) ) )? otherlv_5= 'root' ( ( ruleFQN ) ) ( (lv_invariants_7_0= ruleInvariants ) )? otherlv_8= '{' ( (lv_metaInfo_9_0= ruleTypeMetaInfo ) ) ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_constructors_11_0= ruleConstructor ) )* ( (lv_methods_12_0= ruleMethod ) )* ( (lv_events_13_0= ruleEvent ) )* ( (lv_entityId_14_0= ruleEntityId ) )? otherlv_15= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2247:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'identifier' ( ( ruleFQN ) ) )? otherlv_5= 'root' ( ( ruleFQN ) ) ( (lv_invariants_7_0= ruleInvariants ) )? otherlv_8= '{' ( (lv_metaInfo_9_0= ruleTypeMetaInfo ) ) ( (lv_attributes_10_0= ruleAttribute ) )* ( (lv_constructors_11_0= ruleConstructor ) )* ( (lv_methods_12_0= ruleMethod ) )* ( (lv_events_13_0= ruleEvent ) )* ( (lv_entityId_14_0= ruleEntityId ) )? otherlv_15= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2247:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_DOC) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2248:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2248:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2249:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleEntity4461); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getEntityAccess().getDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleEntity4479); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2269:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2270:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2270:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2271:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity4496); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2287:2: (otherlv_3= 'identifier' ( ( ruleFQN ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==42) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2287:4: otherlv_3= 'identifier' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleEntity4514); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getIdentifierKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2291:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2292:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2292:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2293:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getIdTypeEntityIdCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleEntity4537);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleEntity4551); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getRootKeyword_4());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2310:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2311:1: ( ruleFQN )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2311:1: ( ruleFQN )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2312:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getRootAggregateCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleEntity4574);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2325:2: ( (lv_invariants_7_0= ruleInvariants ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==57) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2326:1: (lv_invariants_7_0= ruleInvariants )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2326:1: (lv_invariants_7_0= ruleInvariants )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2327:3: lv_invariants_7_0= ruleInvariants
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getInvariantsInvariantsParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInvariants_in_ruleEntity4595);
                    lv_invariants_7_0=ruleInvariants();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	        }
                           		set(
                           			current, 
                           			"invariants",
                            		lv_invariants_7_0, 
                            		"Invariants");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleEntity4608); 

                	newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_7());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2347:1: ( (lv_metaInfo_9_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2348:1: (lv_metaInfo_9_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2348:1: (lv_metaInfo_9_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2349:3: lv_metaInfo_9_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getMetaInfoTypeMetaInfoParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleEntity4629);
            lv_metaInfo_9_0=ruleTypeMetaInfo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	        }
                   		set(
                   			current, 
                   			"metaInfo",
                    		lv_metaInfo_9_0, 
                    		"TypeMetaInfo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2365:2: ( (lv_attributes_10_0= ruleAttribute ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_DOC) ) {
                    int LA62_1 = input.LA(2);

                    if ( (LA62_1==RULE_ID||LA62_1==55) ) {
                        alt62=1;
                    }


                }
                else if ( (LA62_0==RULE_ID||LA62_0==55) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2366:1: (lv_attributes_10_0= ruleAttribute )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2366:1: (lv_attributes_10_0= ruleAttribute )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2367:3: lv_attributes_10_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity4650);
            	    lv_attributes_10_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_10_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2383:3: ( (lv_constructors_11_0= ruleConstructor ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_DOC) ) {
                    int LA63_1 = input.LA(2);

                    if ( (LA63_1==45) ) {
                        alt63=1;
                    }


                }
                else if ( (LA63_0==45) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2384:1: (lv_constructors_11_0= ruleConstructor )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2384:1: (lv_constructors_11_0= ruleConstructor )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2385:3: lv_constructors_11_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getConstructorsConstructorParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleEntity4672);
            	    lv_constructors_11_0=ruleConstructor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constructors",
            	            		lv_constructors_11_0, 
            	            		"Constructor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2401:3: ( (lv_methods_12_0= ruleMethod ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_DOC) ) {
                    int LA64_1 = input.LA(2);

                    if ( (LA64_1==48) ) {
                        alt64=1;
                    }


                }
                else if ( (LA64_0==48) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2402:1: (lv_methods_12_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2402:1: (lv_methods_12_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2403:3: lv_methods_12_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getMethodsMethodParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleEntity4694);
            	    lv_methods_12_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_12_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2419:3: ( (lv_events_13_0= ruleEvent ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==RULE_DOC) ) {
                    int LA65_1 = input.LA(2);

                    if ( (LA65_1==40) ) {
                        alt65=1;
                    }


                }
                else if ( (LA65_0==40) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2420:1: (lv_events_13_0= ruleEvent )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2420:1: (lv_events_13_0= ruleEvent )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2421:3: lv_events_13_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getEventsEventParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleEntity4716);
            	    lv_events_13_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_13_0, 
            	            		"Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2437:3: ( (lv_entityId_14_0= ruleEntityId ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_DOC||LA66_0==31) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2438:1: (lv_entityId_14_0= ruleEntityId )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2438:1: (lv_entityId_14_0= ruleEntityId )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2439:3: lv_entityId_14_0= ruleEntityId
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getEntityIdEntityIdParserRuleCall_13_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEntityId_in_ruleEntity4738);
                    lv_entityId_14_0=ruleEntityId();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	        }
                           		set(
                           			current, 
                           			"entityId",
                            		lv_entityId_14_0, 
                            		"EntityId");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleEntity4751); 

                	newLeafNode(otherlv_15, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_14());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAggregate"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2467:1: entryRuleAggregate returns [EObject current=null] : iv_ruleAggregate= ruleAggregate EOF ;
    public final EObject entryRuleAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregate = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2468:2: (iv_ruleAggregate= ruleAggregate EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2469:2: iv_ruleAggregate= ruleAggregate EOF
            {
             newCompositeNode(grammarAccess.getAggregateRule()); 
            pushFollow(FOLLOW_ruleAggregate_in_entryRuleAggregate4787);
            iv_ruleAggregate=ruleAggregate();

            state._fsp--;

             current =iv_ruleAggregate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAggregate4797); 

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
    // $ANTLR end "entryRuleAggregate"


    // $ANTLR start "ruleAggregate"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2476:1: ruleAggregate returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'identifier' ( ( ruleFQN ) ) )? ( (lv_invariants_5_0= ruleInvariants ) )? otherlv_6= '{' ( (lv_metaInfo_7_0= ruleTypeMetaInfo ) ) ( (lv_attributes_8_0= ruleAttribute ) )* ( (lv_constructors_9_0= ruleConstructor ) )* ( (lv_methods_10_0= ruleMethod ) )* ( (lv_events_11_0= ruleEvent ) )* ( (lv_aggregateId_12_0= ruleAggregateId ) )? otherlv_13= '}' ) ;
    public final EObject ruleAggregate() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_13=null;
        EObject lv_invariants_5_0 = null;

        EObject lv_metaInfo_7_0 = null;

        EObject lv_attributes_8_0 = null;

        EObject lv_constructors_9_0 = null;

        EObject lv_methods_10_0 = null;

        EObject lv_events_11_0 = null;

        EObject lv_aggregateId_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2479:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'identifier' ( ( ruleFQN ) ) )? ( (lv_invariants_5_0= ruleInvariants ) )? otherlv_6= '{' ( (lv_metaInfo_7_0= ruleTypeMetaInfo ) ) ( (lv_attributes_8_0= ruleAttribute ) )* ( (lv_constructors_9_0= ruleConstructor ) )* ( (lv_methods_10_0= ruleMethod ) )* ( (lv_events_11_0= ruleEvent ) )* ( (lv_aggregateId_12_0= ruleAggregateId ) )? otherlv_13= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2480:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'identifier' ( ( ruleFQN ) ) )? ( (lv_invariants_5_0= ruleInvariants ) )? otherlv_6= '{' ( (lv_metaInfo_7_0= ruleTypeMetaInfo ) ) ( (lv_attributes_8_0= ruleAttribute ) )* ( (lv_constructors_9_0= ruleConstructor ) )* ( (lv_methods_10_0= ruleMethod ) )* ( (lv_events_11_0= ruleEvent ) )* ( (lv_aggregateId_12_0= ruleAggregateId ) )? otherlv_13= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2480:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'identifier' ( ( ruleFQN ) ) )? ( (lv_invariants_5_0= ruleInvariants ) )? otherlv_6= '{' ( (lv_metaInfo_7_0= ruleTypeMetaInfo ) ) ( (lv_attributes_8_0= ruleAttribute ) )* ( (lv_constructors_9_0= ruleConstructor ) )* ( (lv_methods_10_0= ruleMethod ) )* ( (lv_events_11_0= ruleEvent ) )* ( (lv_aggregateId_12_0= ruleAggregateId ) )? otherlv_13= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2480:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'identifier' ( ( ruleFQN ) ) )? ( (lv_invariants_5_0= ruleInvariants ) )? otherlv_6= '{' ( (lv_metaInfo_7_0= ruleTypeMetaInfo ) ) ( (lv_attributes_8_0= ruleAttribute ) )* ( (lv_constructors_9_0= ruleConstructor ) )* ( (lv_methods_10_0= ruleMethod ) )* ( (lv_events_11_0= ruleEvent ) )* ( (lv_aggregateId_12_0= ruleAggregateId ) )? otherlv_13= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2480:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_DOC) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2481:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2481:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2482:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleAggregate4839); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getAggregateAccess().getDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAggregateRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleAggregate4857); 

                	newLeafNode(otherlv_1, grammarAccess.getAggregateAccess().getAggregateKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2502:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2503:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2503:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2504:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAggregate4874); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAggregateAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAggregateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2520:2: (otherlv_3= 'identifier' ( ( ruleFQN ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==42) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2520:4: otherlv_3= 'identifier' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleAggregate4892); 

                        	newLeafNode(otherlv_3, grammarAccess.getAggregateAccess().getIdentifierKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2524:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2525:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2525:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2526:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAggregateRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAggregateAccess().getIdTypeAggregateIdCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleAggregate4915);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2539:4: ( (lv_invariants_5_0= ruleInvariants ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==57) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2540:1: (lv_invariants_5_0= ruleInvariants )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2540:1: (lv_invariants_5_0= ruleInvariants )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2541:3: lv_invariants_5_0= ruleInvariants
                    {
                     
                    	        newCompositeNode(grammarAccess.getAggregateAccess().getInvariantsInvariantsParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInvariants_in_ruleAggregate4938);
                    lv_invariants_5_0=ruleInvariants();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAggregateRule());
                    	        }
                           		set(
                           			current, 
                           			"invariants",
                            		lv_invariants_5_0, 
                            		"Invariants");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleAggregate4951); 

                	newLeafNode(otherlv_6, grammarAccess.getAggregateAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2561:1: ( (lv_metaInfo_7_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2562:1: (lv_metaInfo_7_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2562:1: (lv_metaInfo_7_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2563:3: lv_metaInfo_7_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getAggregateAccess().getMetaInfoTypeMetaInfoParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleAggregate4972);
            lv_metaInfo_7_0=ruleTypeMetaInfo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAggregateRule());
            	        }
                   		set(
                   			current, 
                   			"metaInfo",
                    		lv_metaInfo_7_0, 
                    		"TypeMetaInfo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2579:2: ( (lv_attributes_8_0= ruleAttribute ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==RULE_DOC) ) {
                    int LA70_1 = input.LA(2);

                    if ( (LA70_1==RULE_ID||LA70_1==55) ) {
                        alt70=1;
                    }


                }
                else if ( (LA70_0==RULE_ID||LA70_0==55) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2580:1: (lv_attributes_8_0= ruleAttribute )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2580:1: (lv_attributes_8_0= ruleAttribute )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2581:3: lv_attributes_8_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateAccess().getAttributesAttributeParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleAggregate4993);
            	    lv_attributes_8_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAggregateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_8_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2597:3: ( (lv_constructors_9_0= ruleConstructor ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==RULE_DOC) ) {
                    int LA71_1 = input.LA(2);

                    if ( (LA71_1==45) ) {
                        alt71=1;
                    }


                }
                else if ( (LA71_0==45) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2598:1: (lv_constructors_9_0= ruleConstructor )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2598:1: (lv_constructors_9_0= ruleConstructor )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2599:3: lv_constructors_9_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateAccess().getConstructorsConstructorParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleAggregate5015);
            	    lv_constructors_9_0=ruleConstructor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAggregateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constructors",
            	            		lv_constructors_9_0, 
            	            		"Constructor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2615:3: ( (lv_methods_10_0= ruleMethod ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==RULE_DOC) ) {
                    int LA72_1 = input.LA(2);

                    if ( (LA72_1==48) ) {
                        alt72=1;
                    }


                }
                else if ( (LA72_0==48) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2616:1: (lv_methods_10_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2616:1: (lv_methods_10_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2617:3: lv_methods_10_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateAccess().getMethodsMethodParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleAggregate5037);
            	    lv_methods_10_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAggregateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_10_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2633:3: ( (lv_events_11_0= ruleEvent ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_DOC) ) {
                    int LA73_1 = input.LA(2);

                    if ( (LA73_1==40) ) {
                        alt73=1;
                    }


                }
                else if ( (LA73_0==40) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2634:1: (lv_events_11_0= ruleEvent )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2634:1: (lv_events_11_0= ruleEvent )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2635:3: lv_events_11_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateAccess().getEventsEventParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleAggregate5059);
            	    lv_events_11_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAggregateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_11_0, 
            	            		"Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2651:3: ( (lv_aggregateId_12_0= ruleAggregateId ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_DOC||LA74_0==33) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2652:1: (lv_aggregateId_12_0= ruleAggregateId )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2652:1: (lv_aggregateId_12_0= ruleAggregateId )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2653:3: lv_aggregateId_12_0= ruleAggregateId
                    {
                     
                    	        newCompositeNode(grammarAccess.getAggregateAccess().getAggregateIdAggregateIdParserRuleCall_11_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAggregateId_in_ruleAggregate5081);
                    lv_aggregateId_12_0=ruleAggregateId();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAggregateRule());
                    	        }
                           		set(
                           			current, 
                           			"aggregateId",
                            		lv_aggregateId_12_0, 
                            		"AggregateId");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleAggregate5094); 

                	newLeafNode(otherlv_13, grammarAccess.getAggregateAccess().getRightCurlyBracketKeyword_12());
                

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
    // $ANTLR end "ruleAggregate"


    // $ANTLR start "entryRuleConstructor"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2683:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2684:2: (iv_ruleConstructor= ruleConstructor EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2685:2: iv_ruleConstructor= ruleConstructor EOF
            {
             newCompositeNode(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_ruleConstructor_in_entryRuleConstructor5132);
            iv_ruleConstructor=ruleConstructor();

            state._fsp--;

             current =iv_ruleConstructor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor5142); 

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
    // $ANTLR end "entryRuleConstructor"


    // $ANTLR start "ruleConstructor"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2692:1: ruleConstructor returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constructor' ( (lv_name_2_0= RULE_ID ) ) ( (lv_preconditions_3_0= rulePreconditions ) )? ( (lv_businessRules_4_0= ruleBusinessRules ) )? (otherlv_5= 'fires' ( ( ruleFQN ) ) (otherlv_7= ',' ( ( ruleFQN ) ) )* )? otherlv_9= '{' ( (lv_parameters_10_0= ruleParameter ) )* ( ( ruleFQN ) )? ( (lv_services_12_0= ruleService ) )* ( (lv_events_13_0= ruleEvent ) )* otherlv_14= '}' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_14=null;
        EObject lv_preconditions_3_0 = null;

        EObject lv_businessRules_4_0 = null;

        EObject lv_parameters_10_0 = null;

        EObject lv_services_12_0 = null;

        EObject lv_events_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2695:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constructor' ( (lv_name_2_0= RULE_ID ) ) ( (lv_preconditions_3_0= rulePreconditions ) )? ( (lv_businessRules_4_0= ruleBusinessRules ) )? (otherlv_5= 'fires' ( ( ruleFQN ) ) (otherlv_7= ',' ( ( ruleFQN ) ) )* )? otherlv_9= '{' ( (lv_parameters_10_0= ruleParameter ) )* ( ( ruleFQN ) )? ( (lv_services_12_0= ruleService ) )* ( (lv_events_13_0= ruleEvent ) )* otherlv_14= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2696:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constructor' ( (lv_name_2_0= RULE_ID ) ) ( (lv_preconditions_3_0= rulePreconditions ) )? ( (lv_businessRules_4_0= ruleBusinessRules ) )? (otherlv_5= 'fires' ( ( ruleFQN ) ) (otherlv_7= ',' ( ( ruleFQN ) ) )* )? otherlv_9= '{' ( (lv_parameters_10_0= ruleParameter ) )* ( ( ruleFQN ) )? ( (lv_services_12_0= ruleService ) )* ( (lv_events_13_0= ruleEvent ) )* otherlv_14= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2696:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constructor' ( (lv_name_2_0= RULE_ID ) ) ( (lv_preconditions_3_0= rulePreconditions ) )? ( (lv_businessRules_4_0= ruleBusinessRules ) )? (otherlv_5= 'fires' ( ( ruleFQN ) ) (otherlv_7= ',' ( ( ruleFQN ) ) )* )? otherlv_9= '{' ( (lv_parameters_10_0= ruleParameter ) )* ( ( ruleFQN ) )? ( (lv_services_12_0= ruleService ) )* ( (lv_events_13_0= ruleEvent ) )* otherlv_14= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2696:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constructor' ( (lv_name_2_0= RULE_ID ) ) ( (lv_preconditions_3_0= rulePreconditions ) )? ( (lv_businessRules_4_0= ruleBusinessRules ) )? (otherlv_5= 'fires' ( ( ruleFQN ) ) (otherlv_7= ',' ( ( ruleFQN ) ) )* )? otherlv_9= '{' ( (lv_parameters_10_0= ruleParameter ) )* ( ( ruleFQN ) )? ( (lv_services_12_0= ruleService ) )* ( (lv_events_13_0= ruleEvent ) )* otherlv_14= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2696:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_DOC) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2697:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2697:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2698:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleConstructor5184); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getConstructorAccess().getDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstructorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleConstructor5202); 

                	newLeafNode(otherlv_1, grammarAccess.getConstructorAccess().getConstructorKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2718:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2719:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2719:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2720:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor5219); 

            			newLeafNode(lv_name_2_0, grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstructorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2736:2: ( (lv_preconditions_3_0= rulePreconditions ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==58) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2737:1: (lv_preconditions_3_0= rulePreconditions )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2737:1: (lv_preconditions_3_0= rulePreconditions )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2738:3: lv_preconditions_3_0= rulePreconditions
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstructorAccess().getPreconditionsPreconditionsParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulePreconditions_in_ruleConstructor5245);
                    lv_preconditions_3_0=rulePreconditions();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
                    	        }
                           		set(
                           			current, 
                           			"preconditions",
                            		lv_preconditions_3_0, 
                            		"Preconditions");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2754:3: ( (lv_businessRules_4_0= ruleBusinessRules ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==59) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2755:1: (lv_businessRules_4_0= ruleBusinessRules )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2755:1: (lv_businessRules_4_0= ruleBusinessRules )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2756:3: lv_businessRules_4_0= ruleBusinessRules
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstructorAccess().getBusinessRulesBusinessRulesParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBusinessRules_in_ruleConstructor5267);
                    lv_businessRules_4_0=ruleBusinessRules();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
                    	        }
                           		set(
                           			current, 
                           			"businessRules",
                            		lv_businessRules_4_0, 
                            		"BusinessRules");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2772:3: (otherlv_5= 'fires' ( ( ruleFQN ) ) (otherlv_7= ',' ( ( ruleFQN ) ) )* )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==46) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2772:5: otherlv_5= 'fires' ( ( ruleFQN ) ) (otherlv_7= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleConstructor5281); 

                        	newLeafNode(otherlv_5, grammarAccess.getConstructorAccess().getFiresKeyword_5_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2776:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2777:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2777:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2778:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstructorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getConstructorAccess().getFiredEventsEventCrossReference_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleConstructor5304);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2791:2: (otherlv_7= ',' ( ( ruleFQN ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==38) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2791:4: otherlv_7= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleConstructor5317); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getConstructorAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2795:1: ( ( ruleFQN ) )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2796:1: ( ruleFQN )
                    	    {
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2796:1: ( ruleFQN )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2797:3: ruleFQN
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getConstructorRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstructorAccess().getFiredEventsEventCrossReference_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFQN_in_ruleConstructor5340);
                    	    ruleFQN();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleConstructor5356); 

                	newLeafNode(otherlv_9, grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2814:1: ( (lv_parameters_10_0= ruleParameter ) )*
            loop80:
            do {
                int alt80=2;
                alt80 = dfa80.predict(input);
                switch (alt80) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2815:1: (lv_parameters_10_0= ruleParameter )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2815:1: (lv_parameters_10_0= ruleParameter )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2816:3: lv_parameters_10_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstructorAccess().getParametersParameterParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleConstructor5377);
            	    lv_parameters_10_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_10_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2832:3: ( ( ruleFQN ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_ID) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2833:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2833:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2834:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstructorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getConstructorAccess().getServiceServiceCrossReference_8_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleConstructor5401);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2847:3: ( (lv_services_12_0= ruleService ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==RULE_DOC) ) {
                    int LA82_1 = input.LA(2);

                    if ( (LA82_1==60) ) {
                        alt82=1;
                    }


                }
                else if ( (LA82_0==60) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2848:1: (lv_services_12_0= ruleService )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2848:1: (lv_services_12_0= ruleService )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2849:3: lv_services_12_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstructorAccess().getServicesServiceParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleService_in_ruleConstructor5423);
            	    lv_services_12_0=ruleService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"services",
            	            		lv_services_12_0, 
            	            		"Service");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2865:3: ( (lv_events_13_0= ruleEvent ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==RULE_DOC||LA83_0==40) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2866:1: (lv_events_13_0= ruleEvent )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2866:1: (lv_events_13_0= ruleEvent )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2867:3: lv_events_13_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstructorAccess().getEventsEventParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleConstructor5445);
            	    lv_events_13_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_13_0, 
            	            		"Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleConstructor5458); 

                	newLeafNode(otherlv_14, grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_11());
                

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
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRuleReturnType"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2895:1: entryRuleReturnType returns [EObject current=null] : iv_ruleReturnType= ruleReturnType EOF ;
    public final EObject entryRuleReturnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnType = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2896:2: (iv_ruleReturnType= ruleReturnType EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2897:2: iv_ruleReturnType= ruleReturnType EOF
            {
             newCompositeNode(grammarAccess.getReturnTypeRule()); 
            pushFollow(FOLLOW_ruleReturnType_in_entryRuleReturnType5494);
            iv_ruleReturnType=ruleReturnType();

            state._fsp--;

             current =iv_ruleReturnType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnType5504); 

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
    // $ANTLR end "entryRuleReturnType"


    // $ANTLR start "ruleReturnType"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2904:1: ruleReturnType returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'returns' ( ( ruleFQN ) ) ) ;
    public final EObject ruleReturnType() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2907:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'returns' ( ( ruleFQN ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2908:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'returns' ( ( ruleFQN ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2908:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'returns' ( ( ruleFQN ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2908:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'returns' ( ( ruleFQN ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2908:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_DOC) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2909:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2909:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2910:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleReturnType5546); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getReturnTypeAccess().getDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReturnTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleReturnType5564); 

                	newLeafNode(otherlv_1, grammarAccess.getReturnTypeAccess().getReturnsKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2930:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2931:1: ( ruleFQN )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2931:1: ( ruleFQN )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2932:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReturnTypeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getReturnTypeAccess().getTypeTypeCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleReturnType5587);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleReturnType"


    // $ANTLR start "entryRuleMethod"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2953:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2954:2: (iv_ruleMethod= ruleMethod EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2955:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod5623);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod5633); 

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2962:1: ruleMethod returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'ref' ( ( ruleFQN ) ) )? ( (lv_preconditions_5_0= rulePreconditions ) )? ( (lv_businessRules_6_0= ruleBusinessRules ) )? (otherlv_7= 'fires' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* )? otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) )* ( ( ruleFQN ) )? ( (lv_returnType_14_0= ruleReturnType ) )? ( (lv_services_15_0= ruleService ) )* ( (lv_events_16_0= ruleEvent ) )* otherlv_17= '}' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_17=null;
        EObject lv_preconditions_5_0 = null;

        EObject lv_businessRules_6_0 = null;

        EObject lv_parameters_12_0 = null;

        EObject lv_returnType_14_0 = null;

        EObject lv_services_15_0 = null;

        EObject lv_events_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2965:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'ref' ( ( ruleFQN ) ) )? ( (lv_preconditions_5_0= rulePreconditions ) )? ( (lv_businessRules_6_0= ruleBusinessRules ) )? (otherlv_7= 'fires' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* )? otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) )* ( ( ruleFQN ) )? ( (lv_returnType_14_0= ruleReturnType ) )? ( (lv_services_15_0= ruleService ) )* ( (lv_events_16_0= ruleEvent ) )* otherlv_17= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2966:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'ref' ( ( ruleFQN ) ) )? ( (lv_preconditions_5_0= rulePreconditions ) )? ( (lv_businessRules_6_0= ruleBusinessRules ) )? (otherlv_7= 'fires' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* )? otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) )* ( ( ruleFQN ) )? ( (lv_returnType_14_0= ruleReturnType ) )? ( (lv_services_15_0= ruleService ) )* ( (lv_events_16_0= ruleEvent ) )* otherlv_17= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2966:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'ref' ( ( ruleFQN ) ) )? ( (lv_preconditions_5_0= rulePreconditions ) )? ( (lv_businessRules_6_0= ruleBusinessRules ) )? (otherlv_7= 'fires' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* )? otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) )* ( ( ruleFQN ) )? ( (lv_returnType_14_0= ruleReturnType ) )? ( (lv_services_15_0= ruleService ) )* ( (lv_events_16_0= ruleEvent ) )* otherlv_17= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2966:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'ref' ( ( ruleFQN ) ) )? ( (lv_preconditions_5_0= rulePreconditions ) )? ( (lv_businessRules_6_0= ruleBusinessRules ) )? (otherlv_7= 'fires' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* )? otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) )* ( ( ruleFQN ) )? ( (lv_returnType_14_0= ruleReturnType ) )? ( (lv_services_15_0= ruleService ) )* ( (lv_events_16_0= ruleEvent ) )* otherlv_17= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2966:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_DOC) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2967:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2967:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2968:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleMethod5675); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getMethodAccess().getDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleMethod5693); 

                	newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getMethodKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2988:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2989:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2989:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2990:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod5710); 

            			newLeafNode(lv_name_2_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3006:2: (otherlv_3= 'ref' ( ( ruleFQN ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==49) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3006:4: otherlv_3= 'ref' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleMethod5728); 

                        	newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getRefKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3010:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3011:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3011:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3012:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getRefMethodMethodCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleMethod5751);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3025:4: ( (lv_preconditions_5_0= rulePreconditions ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==58) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3026:1: (lv_preconditions_5_0= rulePreconditions )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3026:1: (lv_preconditions_5_0= rulePreconditions )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3027:3: lv_preconditions_5_0= rulePreconditions
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getPreconditionsPreconditionsParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_rulePreconditions_in_ruleMethod5774);
                    lv_preconditions_5_0=rulePreconditions();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	        }
                           		set(
                           			current, 
                           			"preconditions",
                            		lv_preconditions_5_0, 
                            		"Preconditions");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3043:3: ( (lv_businessRules_6_0= ruleBusinessRules ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==59) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3044:1: (lv_businessRules_6_0= ruleBusinessRules )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3044:1: (lv_businessRules_6_0= ruleBusinessRules )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3045:3: lv_businessRules_6_0= ruleBusinessRules
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getBusinessRulesBusinessRulesParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBusinessRules_in_ruleMethod5796);
                    lv_businessRules_6_0=ruleBusinessRules();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	        }
                           		set(
                           			current, 
                           			"businessRules",
                            		lv_businessRules_6_0, 
                            		"BusinessRules");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3061:3: (otherlv_7= 'fires' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==46) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3061:5: otherlv_7= 'fires' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleMethod5810); 

                        	newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getFiresKeyword_6_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3065:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3066:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3066:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3067:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getFiredEventsEventCrossReference_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleMethod5833);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3080:2: (otherlv_9= ',' ( ( ruleFQN ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==38) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3080:4: otherlv_9= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_9=(Token)match(input,38,FOLLOW_38_in_ruleMethod5846); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getCommaKeyword_6_2_0());
                    	        
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3084:1: ( ( ruleFQN ) )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3085:1: ( ruleFQN )
                    	    {
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3085:1: ( ruleFQN )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3086:3: ruleFQN
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMethodRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getMethodAccess().getFiredEventsEventCrossReference_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFQN_in_ruleMethod5869);
                    	    ruleFQN();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleMethod5885); 

                	newLeafNode(otherlv_11, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_7());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3103:1: ( (lv_parameters_12_0= ruleParameter ) )*
            loop91:
            do {
                int alt91=2;
                alt91 = dfa91.predict(input);
                switch (alt91) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3104:1: (lv_parameters_12_0= ruleParameter )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3104:1: (lv_parameters_12_0= ruleParameter )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3105:3: lv_parameters_12_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleMethod5906);
            	    lv_parameters_12_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_12_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3121:3: ( ( ruleFQN ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_ID) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3122:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3122:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3123:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getServiceServiceCrossReference_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleMethod5930);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3136:3: ( (lv_returnType_14_0= ruleReturnType ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_DOC) ) {
                int LA93_1 = input.LA(2);

                if ( (LA93_1==47) ) {
                    alt93=1;
                }
            }
            else if ( (LA93_0==47) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3137:1: (lv_returnType_14_0= ruleReturnType )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3137:1: (lv_returnType_14_0= ruleReturnType )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3138:3: lv_returnType_14_0= ruleReturnType
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getReturnTypeReturnTypeParserRuleCall_10_0()); 
                    	    
                    pushFollow(FOLLOW_ruleReturnType_in_ruleMethod5952);
                    lv_returnType_14_0=ruleReturnType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	        }
                           		set(
                           			current, 
                           			"returnType",
                            		lv_returnType_14_0, 
                            		"ReturnType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3154:3: ( (lv_services_15_0= ruleService ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==RULE_DOC) ) {
                    int LA94_1 = input.LA(2);

                    if ( (LA94_1==60) ) {
                        alt94=1;
                    }


                }
                else if ( (LA94_0==60) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3155:1: (lv_services_15_0= ruleService )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3155:1: (lv_services_15_0= ruleService )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3156:3: lv_services_15_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getServicesServiceParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleService_in_ruleMethod5974);
            	    lv_services_15_0=ruleService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"services",
            	            		lv_services_15_0, 
            	            		"Service");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3172:3: ( (lv_events_16_0= ruleEvent ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==RULE_DOC||LA95_0==40) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3173:1: (lv_events_16_0= ruleEvent )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3173:1: (lv_events_16_0= ruleEvent )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3174:3: lv_events_16_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getEventsEventParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleMethod5996);
            	    lv_events_16_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_16_0, 
            	            		"Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);

            otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleMethod6009); 

                	newLeafNode(otherlv_17, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_13());
                

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleTypeMetaInfo"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3202:1: entryRuleTypeMetaInfo returns [EObject current=null] : iv_ruleTypeMetaInfo= ruleTypeMetaInfo EOF ;
    public final EObject entryRuleTypeMetaInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeMetaInfo = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3203:2: (iv_ruleTypeMetaInfo= ruleTypeMetaInfo EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3204:2: iv_ruleTypeMetaInfo= ruleTypeMetaInfo EOF
            {
             newCompositeNode(grammarAccess.getTypeMetaInfoRule()); 
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_entryRuleTypeMetaInfo6045);
            iv_ruleTypeMetaInfo=ruleTypeMetaInfo();

            state._fsp--;

             current =iv_ruleTypeMetaInfo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeMetaInfo6055); 

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
    // $ANTLR end "entryRuleTypeMetaInfo"


    // $ANTLR start "ruleTypeMetaInfo"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3211:1: ruleTypeMetaInfo returns [EObject current=null] : ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= ruleLiteral ) )* )? ) ;
    public final EObject ruleTypeMetaInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_slabel_2_0=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        Token lv_tooltip_6_0=null;
        Token otherlv_7=null;
        Token lv_prompt_8_0=null;
        Token otherlv_9=null;
        EObject lv_examples_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3214:28: ( ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= ruleLiteral ) )* )? ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3215:1: ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= ruleLiteral ) )* )? )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3215:1: ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= ruleLiteral ) )* )? )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3215:2: () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= ruleLiteral ) )* )?
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3215:2: ()
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3216:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTypeMetaInfoAccess().getTypeMetaInfoAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3221:2: (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==50) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3221:4: otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleTypeMetaInfo6102); 

                        	newLeafNode(otherlv_1, grammarAccess.getTypeMetaInfoAccess().getSlabelKeyword_1_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3225:1: ( (lv_slabel_2_0= RULE_STRING ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3226:1: (lv_slabel_2_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3226:1: (lv_slabel_2_0= RULE_STRING )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3227:3: lv_slabel_2_0= RULE_STRING
                    {
                    lv_slabel_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo6119); 

                    			newLeafNode(lv_slabel_2_0, grammarAccess.getTypeMetaInfoAccess().getSlabelSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeMetaInfoRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"slabel",
                            		lv_slabel_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3243:4: (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==51) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3243:6: otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleTypeMetaInfo6139); 

                        	newLeafNode(otherlv_3, grammarAccess.getTypeMetaInfoAccess().getLabelKeyword_2_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3247:1: ( (lv_label_4_0= RULE_STRING ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3248:1: (lv_label_4_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3248:1: (lv_label_4_0= RULE_STRING )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3249:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo6156); 

                    			newLeafNode(lv_label_4_0, grammarAccess.getTypeMetaInfoAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeMetaInfoRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3265:4: (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==52) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3265:6: otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,52,FOLLOW_52_in_ruleTypeMetaInfo6176); 

                        	newLeafNode(otherlv_5, grammarAccess.getTypeMetaInfoAccess().getTooltipKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3269:1: ( (lv_tooltip_6_0= RULE_STRING ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3270:1: (lv_tooltip_6_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3270:1: (lv_tooltip_6_0= RULE_STRING )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3271:3: lv_tooltip_6_0= RULE_STRING
                    {
                    lv_tooltip_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo6193); 

                    			newLeafNode(lv_tooltip_6_0, grammarAccess.getTypeMetaInfoAccess().getTooltipSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeMetaInfoRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"tooltip",
                            		lv_tooltip_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3287:4: (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==53) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3287:6: otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleTypeMetaInfo6213); 

                        	newLeafNode(otherlv_7, grammarAccess.getTypeMetaInfoAccess().getPromptKeyword_4_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3291:1: ( (lv_prompt_8_0= RULE_STRING ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3292:1: (lv_prompt_8_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3292:1: (lv_prompt_8_0= RULE_STRING )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3293:3: lv_prompt_8_0= RULE_STRING
                    {
                    lv_prompt_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo6230); 

                    			newLeafNode(lv_prompt_8_0, grammarAccess.getTypeMetaInfoAccess().getPromptSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeMetaInfoRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"prompt",
                            		lv_prompt_8_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3309:4: (otherlv_9= 'examples' ( (lv_examples_10_0= ruleLiteral ) )* )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==54) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3309:6: otherlv_9= 'examples' ( (lv_examples_10_0= ruleLiteral ) )*
                    {
                    otherlv_9=(Token)match(input,54,FOLLOW_54_in_ruleTypeMetaInfo6250); 

                        	newLeafNode(otherlv_9, grammarAccess.getTypeMetaInfoAccess().getExamplesKeyword_5_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3313:1: ( (lv_examples_10_0= ruleLiteral ) )*
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( ((LA100_0>=RULE_INT && LA100_0<=RULE_DECIMAL)||(LA100_0>=62 && LA100_0<=64)) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3314:1: (lv_examples_10_0= ruleLiteral )
                    	    {
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3314:1: (lv_examples_10_0= ruleLiteral )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3315:3: lv_examples_10_0= ruleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTypeMetaInfoAccess().getExamplesLiteralParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteral_in_ruleTypeMetaInfo6271);
                    	    lv_examples_10_0=ruleLiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTypeMetaInfoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"examples",
                    	            		lv_examples_10_0, 
                    	            		"Literal");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop100;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleTypeMetaInfo"


    // $ANTLR start "entryRuleAttribute"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3341:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3342:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3343:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute6312);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute6322); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3350:1: ruleAttribute returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( ( ruleFQN ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token lv_nullable_1_0=null;
        Token lv_multiplicity_3_0=null;
        Token lv_name_4_0=null;
        EObject lv_invariants_5_0 = null;

        EObject lv_overridden_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3353:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( ( ruleFQN ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3354:1: ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( ( ruleFQN ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3354:1: ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( ( ruleFQN ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3354:2: ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( ( ruleFQN ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )?
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3354:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==RULE_DOC) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3355:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3355:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3356:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleAttribute6364); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getAttributeAccess().getDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3372:3: ( (lv_nullable_1_0= 'nullable' ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==55) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3373:1: (lv_nullable_1_0= 'nullable' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3373:1: (lv_nullable_1_0= 'nullable' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3374:3: lv_nullable_1_0= 'nullable'
                    {
                    lv_nullable_1_0=(Token)match(input,55,FOLLOW_55_in_ruleAttribute6388); 

                            newLeafNode(lv_nullable_1_0, grammarAccess.getAttributeAccess().getNullableNullableKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "nullable", lv_nullable_1_0, "nullable");
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3387:3: ( ( ruleFQN ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3388:1: ( ruleFQN )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3388:1: ( ruleFQN )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3389:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleAttribute6425);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3402:2: ( (lv_multiplicity_3_0= '*' ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==56) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3403:1: (lv_multiplicity_3_0= '*' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3403:1: (lv_multiplicity_3_0= '*' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3404:3: lv_multiplicity_3_0= '*'
                    {
                    lv_multiplicity_3_0=(Token)match(input,56,FOLLOW_56_in_ruleAttribute6443); 

                            newLeafNode(lv_multiplicity_3_0, grammarAccess.getAttributeAccess().getMultiplicityAsteriskKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "multiplicity", lv_multiplicity_3_0, "*");
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3417:3: ( (lv_name_4_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3418:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3418:1: (lv_name_4_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3419:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute6474); 

            			newLeafNode(lv_name_4_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3435:2: ( (lv_invariants_5_0= ruleInvariants ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==57) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3436:1: (lv_invariants_5_0= ruleInvariants )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3436:1: (lv_invariants_5_0= ruleInvariants )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3437:3: lv_invariants_5_0= ruleInvariants
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getInvariantsInvariantsParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInvariants_in_ruleAttribute6500);
                    lv_invariants_5_0=ruleInvariants();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"invariants",
                            		lv_invariants_5_0, 
                            		"Invariants");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3453:3: ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==14) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3454:1: (lv_overridden_6_0= ruleOverriddenTypeMetaInfo )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3454:1: (lv_overridden_6_0= ruleOverriddenTypeMetaInfo )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3455:3: lv_overridden_6_0= ruleOverriddenTypeMetaInfo
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getOverriddenOverriddenTypeMetaInfoParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOverriddenTypeMetaInfo_in_ruleAttribute6522);
                    lv_overridden_6_0=ruleOverriddenTypeMetaInfo();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"overridden",
                            		lv_overridden_6_0, 
                            		"OverriddenTypeMetaInfo");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleParameter"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3479:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3480:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3481:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter6559);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter6569); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3488:1: ruleParameter returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( ( ruleFQN ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_preconditions_5_0= rulePreconditions ) )? ( (lv_businessRules_6_0= ruleBusinessRules ) )? ( (lv_overridden_7_0= ruleOverriddenTypeMetaInfo ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token lv_nullable_1_0=null;
        Token lv_multiplicity_3_0=null;
        Token lv_name_4_0=null;
        EObject lv_preconditions_5_0 = null;

        EObject lv_businessRules_6_0 = null;

        EObject lv_overridden_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3491:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( ( ruleFQN ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_preconditions_5_0= rulePreconditions ) )? ( (lv_businessRules_6_0= ruleBusinessRules ) )? ( (lv_overridden_7_0= ruleOverriddenTypeMetaInfo ) )? ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3492:1: ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( ( ruleFQN ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_preconditions_5_0= rulePreconditions ) )? ( (lv_businessRules_6_0= ruleBusinessRules ) )? ( (lv_overridden_7_0= ruleOverriddenTypeMetaInfo ) )? )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3492:1: ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( ( ruleFQN ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_preconditions_5_0= rulePreconditions ) )? ( (lv_businessRules_6_0= ruleBusinessRules ) )? ( (lv_overridden_7_0= ruleOverriddenTypeMetaInfo ) )? )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3492:2: ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( ( ruleFQN ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_preconditions_5_0= rulePreconditions ) )? ( (lv_businessRules_6_0= ruleBusinessRules ) )? ( (lv_overridden_7_0= ruleOverriddenTypeMetaInfo ) )?
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3492:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==RULE_DOC) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3493:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3493:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3494:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleParameter6611); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getParameterAccess().getDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3510:3: ( (lv_nullable_1_0= 'nullable' ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==55) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3511:1: (lv_nullable_1_0= 'nullable' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3511:1: (lv_nullable_1_0= 'nullable' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3512:3: lv_nullable_1_0= 'nullable'
                    {
                    lv_nullable_1_0=(Token)match(input,55,FOLLOW_55_in_ruleParameter6635); 

                            newLeafNode(lv_nullable_1_0, grammarAccess.getParameterAccess().getNullableNullableKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterRule());
                    	        }
                           		setWithLastConsumed(current, "nullable", lv_nullable_1_0, "nullable");
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3525:3: ( ( ruleFQN ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3526:1: ( ruleFQN )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3526:1: ( ruleFQN )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3527:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleParameter6672);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3540:2: ( (lv_multiplicity_3_0= '*' ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==56) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3541:1: (lv_multiplicity_3_0= '*' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3541:1: (lv_multiplicity_3_0= '*' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3542:3: lv_multiplicity_3_0= '*'
                    {
                    lv_multiplicity_3_0=(Token)match(input,56,FOLLOW_56_in_ruleParameter6690); 

                            newLeafNode(lv_multiplicity_3_0, grammarAccess.getParameterAccess().getMultiplicityAsteriskKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterRule());
                    	        }
                           		setWithLastConsumed(current, "multiplicity", lv_multiplicity_3_0, "*");
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3555:3: ( (lv_name_4_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3556:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3556:1: (lv_name_4_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3557:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter6721); 

            			newLeafNode(lv_name_4_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3573:2: ( (lv_preconditions_5_0= rulePreconditions ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==58) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3574:1: (lv_preconditions_5_0= rulePreconditions )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3574:1: (lv_preconditions_5_0= rulePreconditions )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3575:3: lv_preconditions_5_0= rulePreconditions
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getPreconditionsPreconditionsParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_rulePreconditions_in_ruleParameter6747);
                    lv_preconditions_5_0=rulePreconditions();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"preconditions",
                            		lv_preconditions_5_0, 
                            		"Preconditions");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3591:3: ( (lv_businessRules_6_0= ruleBusinessRules ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==59) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3592:1: (lv_businessRules_6_0= ruleBusinessRules )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3592:1: (lv_businessRules_6_0= ruleBusinessRules )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3593:3: lv_businessRules_6_0= ruleBusinessRules
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getBusinessRulesBusinessRulesParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBusinessRules_in_ruleParameter6769);
                    lv_businessRules_6_0=ruleBusinessRules();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"businessRules",
                            		lv_businessRules_6_0, 
                            		"BusinessRules");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3609:3: ( (lv_overridden_7_0= ruleOverriddenTypeMetaInfo ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==14) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3610:1: (lv_overridden_7_0= ruleOverriddenTypeMetaInfo )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3610:1: (lv_overridden_7_0= ruleOverriddenTypeMetaInfo )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3611:3: lv_overridden_7_0= ruleOverriddenTypeMetaInfo
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getOverriddenOverriddenTypeMetaInfoParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOverriddenTypeMetaInfo_in_ruleParameter6791);
                    lv_overridden_7_0=ruleOverriddenTypeMetaInfo();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"overridden",
                            		lv_overridden_7_0, 
                            		"OverriddenTypeMetaInfo");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleInvariants"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3635:1: entryRuleInvariants returns [EObject current=null] : iv_ruleInvariants= ruleInvariants EOF ;
    public final EObject entryRuleInvariants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariants = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3636:2: (iv_ruleInvariants= ruleInvariants EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3637:2: iv_ruleInvariants= ruleInvariants EOF
            {
             newCompositeNode(grammarAccess.getInvariantsRule()); 
            pushFollow(FOLLOW_ruleInvariants_in_entryRuleInvariants6828);
            iv_ruleInvariants=ruleInvariants();

            state._fsp--;

             current =iv_ruleInvariants; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvariants6838); 

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
    // $ANTLR end "entryRuleInvariants"


    // $ANTLR start "ruleInvariants"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3644:1: ruleInvariants returns [EObject current=null] : (otherlv_0= 'invariants' ( (lv_constraintInstances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) ) )* ) ;
    public final EObject ruleInvariants() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_constraintInstances_1_0 = null;

        EObject lv_constraintInstances_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3647:28: ( (otherlv_0= 'invariants' ( (lv_constraintInstances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) ) )* ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3648:1: (otherlv_0= 'invariants' ( (lv_constraintInstances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) ) )* )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3648:1: (otherlv_0= 'invariants' ( (lv_constraintInstances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) ) )* )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3648:3: otherlv_0= 'invariants' ( (lv_constraintInstances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) ) )*
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleInvariants6875); 

                	newLeafNode(otherlv_0, grammarAccess.getInvariantsAccess().getInvariantsKeyword_0());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3652:1: ( (lv_constraintInstances_1_0= ruleConstraintInstance ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3653:1: (lv_constraintInstances_1_0= ruleConstraintInstance )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3653:1: (lv_constraintInstances_1_0= ruleConstraintInstance )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3654:3: lv_constraintInstances_1_0= ruleConstraintInstance
            {
             
            	        newCompositeNode(grammarAccess.getInvariantsAccess().getConstraintInstancesConstraintInstanceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintInstance_in_ruleInvariants6896);
            lv_constraintInstances_1_0=ruleConstraintInstance();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvariantsRule());
            	        }
                   		add(
                   			current, 
                   			"constraintInstances",
                    		lv_constraintInstances_1_0, 
                    		"ConstraintInstance");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3670:2: (otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) ) )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==38) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3670:4: otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) )
            	    {
            	    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleInvariants6909); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInvariantsAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3674:1: ( (lv_constraintInstances_3_0= ruleConstraintInstance ) )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3675:1: (lv_constraintInstances_3_0= ruleConstraintInstance )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3675:1: (lv_constraintInstances_3_0= ruleConstraintInstance )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3676:3: lv_constraintInstances_3_0= ruleConstraintInstance
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInvariantsAccess().getConstraintInstancesConstraintInstanceParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstraintInstance_in_ruleInvariants6930);
            	    lv_constraintInstances_3_0=ruleConstraintInstance();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInvariantsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constraintInstances",
            	            		lv_constraintInstances_3_0, 
            	            		"ConstraintInstance");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop113;
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
    // $ANTLR end "ruleInvariants"


    // $ANTLR start "entryRulePreconditions"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3700:1: entryRulePreconditions returns [EObject current=null] : iv_rulePreconditions= rulePreconditions EOF ;
    public final EObject entryRulePreconditions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreconditions = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3701:2: (iv_rulePreconditions= rulePreconditions EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3702:2: iv_rulePreconditions= rulePreconditions EOF
            {
             newCompositeNode(grammarAccess.getPreconditionsRule()); 
            pushFollow(FOLLOW_rulePreconditions_in_entryRulePreconditions6968);
            iv_rulePreconditions=rulePreconditions();

            state._fsp--;

             current =iv_rulePreconditions; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreconditions6978); 

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
    // $ANTLR end "entryRulePreconditions"


    // $ANTLR start "rulePreconditions"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3709:1: rulePreconditions returns [EObject current=null] : (otherlv_0= 'preconditions' ( (lv_constraintInstances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) ) )* ) ;
    public final EObject rulePreconditions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_constraintInstances_1_0 = null;

        EObject lv_constraintInstances_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3712:28: ( (otherlv_0= 'preconditions' ( (lv_constraintInstances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) ) )* ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3713:1: (otherlv_0= 'preconditions' ( (lv_constraintInstances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) ) )* )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3713:1: (otherlv_0= 'preconditions' ( (lv_constraintInstances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) ) )* )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3713:3: otherlv_0= 'preconditions' ( (lv_constraintInstances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) ) )*
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_rulePreconditions7015); 

                	newLeafNode(otherlv_0, grammarAccess.getPreconditionsAccess().getPreconditionsKeyword_0());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3717:1: ( (lv_constraintInstances_1_0= ruleConstraintInstance ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3718:1: (lv_constraintInstances_1_0= ruleConstraintInstance )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3718:1: (lv_constraintInstances_1_0= ruleConstraintInstance )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3719:3: lv_constraintInstances_1_0= ruleConstraintInstance
            {
             
            	        newCompositeNode(grammarAccess.getPreconditionsAccess().getConstraintInstancesConstraintInstanceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintInstance_in_rulePreconditions7036);
            lv_constraintInstances_1_0=ruleConstraintInstance();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPreconditionsRule());
            	        }
                   		add(
                   			current, 
                   			"constraintInstances",
                    		lv_constraintInstances_1_0, 
                    		"ConstraintInstance");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3735:2: (otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) ) )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==38) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3735:4: otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) )
            	    {
            	    otherlv_2=(Token)match(input,38,FOLLOW_38_in_rulePreconditions7049); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPreconditionsAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3739:1: ( (lv_constraintInstances_3_0= ruleConstraintInstance ) )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3740:1: (lv_constraintInstances_3_0= ruleConstraintInstance )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3740:1: (lv_constraintInstances_3_0= ruleConstraintInstance )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3741:3: lv_constraintInstances_3_0= ruleConstraintInstance
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPreconditionsAccess().getConstraintInstancesConstraintInstanceParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstraintInstance_in_rulePreconditions7070);
            	    lv_constraintInstances_3_0=ruleConstraintInstance();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPreconditionsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constraintInstances",
            	            		lv_constraintInstances_3_0, 
            	            		"ConstraintInstance");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop114;
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
    // $ANTLR end "rulePreconditions"


    // $ANTLR start "entryRuleBusinessRules"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3765:1: entryRuleBusinessRules returns [EObject current=null] : iv_ruleBusinessRules= ruleBusinessRules EOF ;
    public final EObject entryRuleBusinessRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessRules = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3766:2: (iv_ruleBusinessRules= ruleBusinessRules EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3767:2: iv_ruleBusinessRules= ruleBusinessRules EOF
            {
             newCompositeNode(grammarAccess.getBusinessRulesRule()); 
            pushFollow(FOLLOW_ruleBusinessRules_in_entryRuleBusinessRules7108);
            iv_ruleBusinessRules=ruleBusinessRules();

            state._fsp--;

             current =iv_ruleBusinessRules; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessRules7118); 

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
    // $ANTLR end "entryRuleBusinessRules"


    // $ANTLR start "ruleBusinessRules"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3774:1: ruleBusinessRules returns [EObject current=null] : (otherlv_0= 'business-rules' ( (lv_constraintInstances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) ) )* ) ;
    public final EObject ruleBusinessRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_constraintInstances_1_0 = null;

        EObject lv_constraintInstances_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3777:28: ( (otherlv_0= 'business-rules' ( (lv_constraintInstances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) ) )* ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3778:1: (otherlv_0= 'business-rules' ( (lv_constraintInstances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) ) )* )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3778:1: (otherlv_0= 'business-rules' ( (lv_constraintInstances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) ) )* )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3778:3: otherlv_0= 'business-rules' ( (lv_constraintInstances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) ) )*
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleBusinessRules7155); 

                	newLeafNode(otherlv_0, grammarAccess.getBusinessRulesAccess().getBusinessRulesKeyword_0());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3782:1: ( (lv_constraintInstances_1_0= ruleConstraintInstance ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3783:1: (lv_constraintInstances_1_0= ruleConstraintInstance )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3783:1: (lv_constraintInstances_1_0= ruleConstraintInstance )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3784:3: lv_constraintInstances_1_0= ruleConstraintInstance
            {
             
            	        newCompositeNode(grammarAccess.getBusinessRulesAccess().getConstraintInstancesConstraintInstanceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintInstance_in_ruleBusinessRules7176);
            lv_constraintInstances_1_0=ruleConstraintInstance();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBusinessRulesRule());
            	        }
                   		add(
                   			current, 
                   			"constraintInstances",
                    		lv_constraintInstances_1_0, 
                    		"ConstraintInstance");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3800:2: (otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) ) )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==38) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3800:4: otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) )
            	    {
            	    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleBusinessRules7189); 

            	        	newLeafNode(otherlv_2, grammarAccess.getBusinessRulesAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3804:1: ( (lv_constraintInstances_3_0= ruleConstraintInstance ) )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3805:1: (lv_constraintInstances_3_0= ruleConstraintInstance )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3805:1: (lv_constraintInstances_3_0= ruleConstraintInstance )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3806:3: lv_constraintInstances_3_0= ruleConstraintInstance
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBusinessRulesAccess().getConstraintInstancesConstraintInstanceParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstraintInstance_in_ruleBusinessRules7210);
            	    lv_constraintInstances_3_0=ruleConstraintInstance();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBusinessRulesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constraintInstances",
            	            		lv_constraintInstances_3_0, 
            	            		"ConstraintInstance");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop115;
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
    // $ANTLR end "ruleBusinessRules"


    // $ANTLR start "entryRuleOverriddenTypeMetaInfo"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3830:1: entryRuleOverriddenTypeMetaInfo returns [EObject current=null] : iv_ruleOverriddenTypeMetaInfo= ruleOverriddenTypeMetaInfo EOF ;
    public final EObject entryRuleOverriddenTypeMetaInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverriddenTypeMetaInfo = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3831:2: (iv_ruleOverriddenTypeMetaInfo= ruleOverriddenTypeMetaInfo EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3832:2: iv_ruleOverriddenTypeMetaInfo= ruleOverriddenTypeMetaInfo EOF
            {
             newCompositeNode(grammarAccess.getOverriddenTypeMetaInfoRule()); 
            pushFollow(FOLLOW_ruleOverriddenTypeMetaInfo_in_entryRuleOverriddenTypeMetaInfo7248);
            iv_ruleOverriddenTypeMetaInfo=ruleOverriddenTypeMetaInfo();

            state._fsp--;

             current =iv_ruleOverriddenTypeMetaInfo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverriddenTypeMetaInfo7258); 

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
    // $ANTLR end "entryRuleOverriddenTypeMetaInfo"


    // $ANTLR start "ruleOverriddenTypeMetaInfo"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3839:1: ruleOverriddenTypeMetaInfo returns [EObject current=null] : (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' ) ;
    public final EObject ruleOverriddenTypeMetaInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_metaInfo_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3842:28: ( (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3843:1: (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3843:1: (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3843:3: otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleOverriddenTypeMetaInfo7295); 

                	newLeafNode(otherlv_0, grammarAccess.getOverriddenTypeMetaInfoAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3847:1: ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3848:1: (lv_metaInfo_1_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3848:1: (lv_metaInfo_1_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3849:3: lv_metaInfo_1_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getOverriddenTypeMetaInfoAccess().getMetaInfoTypeMetaInfoParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleOverriddenTypeMetaInfo7316);
            lv_metaInfo_1_0=ruleTypeMetaInfo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOverriddenTypeMetaInfoRule());
            	        }
                   		set(
                   			current, 
                   			"metaInfo",
                    		lv_metaInfo_1_0, 
                    		"TypeMetaInfo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleOverriddenTypeMetaInfo7328); 

                	newLeafNode(otherlv_2, grammarAccess.getOverriddenTypeMetaInfoAccess().getRightCurlyBracketKeyword_2());
                

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
    // $ANTLR end "ruleOverriddenTypeMetaInfo"


    // $ANTLR start "entryRuleConstraintInstance"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3877:1: entryRuleConstraintInstance returns [EObject current=null] : iv_ruleConstraintInstance= ruleConstraintInstance EOF ;
    public final EObject entryRuleConstraintInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintInstance = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3878:2: (iv_ruleConstraintInstance= ruleConstraintInstance EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3879:2: iv_ruleConstraintInstance= ruleConstraintInstance EOF
            {
             newCompositeNode(grammarAccess.getConstraintInstanceRule()); 
            pushFollow(FOLLOW_ruleConstraintInstance_in_entryRuleConstraintInstance7364);
            iv_ruleConstraintInstance=ruleConstraintInstance();

            state._fsp--;

             current =iv_ruleConstraintInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintInstance7374); 

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
    // $ANTLR end "entryRuleConstraintInstance"


    // $ANTLR start "ruleConstraintInstance"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3886:1: ruleConstraintInstance returns [EObject current=null] : ( ( ( ruleFQN ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleConstraintInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3889:28: ( ( ( ( ruleFQN ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3890:1: ( ( ( ruleFQN ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3890:1: ( ( ( ruleFQN ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3890:2: ( ( ruleFQN ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )?
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3890:2: ( ( ruleFQN ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3891:1: ( ruleFQN )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3891:1: ( ruleFQN )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3892:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstraintInstanceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConstraintInstanceAccess().getConstraintConstraintCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleConstraintInstance7422);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3905:2: (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==37) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3905:4: otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleConstraintInstance7435); 

                        	newLeafNode(otherlv_1, grammarAccess.getConstraintInstanceAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3909:1: ( (lv_params_2_0= ruleLiteral ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3910:1: (lv_params_2_0= ruleLiteral )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3910:1: (lv_params_2_0= ruleLiteral )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3911:3: lv_params_2_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstraintInstanceAccess().getParamsLiteralParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleConstraintInstance7456);
                    lv_params_2_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstraintInstanceRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_2_0, 
                            		"Literal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3927:2: (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==38) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3927:4: otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleConstraintInstance7469); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getConstraintInstanceAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3931:1: ( (lv_params_4_0= ruleLiteral ) )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3932:1: (lv_params_4_0= ruleLiteral )
                    	    {
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3932:1: (lv_params_4_0= ruleLiteral )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3933:3: lv_params_4_0= ruleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstraintInstanceAccess().getParamsLiteralParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteral_in_ruleConstraintInstance7490);
                    	    lv_params_4_0=ruleLiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConstraintInstanceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_4_0, 
                    	            		"Literal");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleConstraintInstance7504); 

                        	newLeafNode(otherlv_5, grammarAccess.getConstraintInstanceAccess().getRightParenthesisKeyword_1_3());
                        

                    }
                    break;

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
    // $ANTLR end "ruleConstraintInstance"


    // $ANTLR start "entryRuleService"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3961:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3962:2: (iv_ruleService= ruleService EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3963:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService7542);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService7552); 

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3970:1: ruleService returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_methods_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3973:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3974:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3974:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3974:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3974:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==RULE_DOC) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3975:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3975:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3976:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleService7594); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getServiceAccess().getDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleService7612); 

                	newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getServiceKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3996:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3997:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3997:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3998:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService7629); 

            			newLeafNode(lv_name_2_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleService7646); 

                	newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4018:1: ( (lv_methods_4_0= ruleMethod ) )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==RULE_DOC||LA119_0==48) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4019:1: (lv_methods_4_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4019:1: (lv_methods_4_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4020:3: lv_methods_4_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServiceAccess().getMethodsMethodParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleService7667);
            	    lv_methods_4_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_4_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop119;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleService7680); 

                	newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleLiteral"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4048:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4049:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4050:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral7716);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral7726); 

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4057:1: ruleLiteral returns [EObject current=null] : (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NullLiteral_0 = null;

        EObject this_BooleanLiteral_1 = null;

        EObject this_NumberLiteral_2 = null;

        EObject this_StringLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4060:28: ( (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4061:1: (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4061:1: (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral )
            int alt120=4;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt120=1;
                }
                break;
            case 62:
            case 63:
                {
                alt120=2;
                }
                break;
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
                {
                alt120=3;
                }
                break;
            case RULE_STRING:
                {
                alt120=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4062:5: this_NullLiteral_0= ruleNullLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteral7773);
                    this_NullLiteral_0=ruleNullLiteral();

                    state._fsp--;

                     
                            current = this_NullLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4072:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral7800);
                    this_BooleanLiteral_1=ruleBooleanLiteral();

                    state._fsp--;

                     
                            current = this_BooleanLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4082:5: this_NumberLiteral_2= ruleNumberLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteral7827);
                    this_NumberLiteral_2=ruleNumberLiteral();

                    state._fsp--;

                     
                            current = this_NumberLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4092:5: this_StringLiteral_3= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral7854);
                    this_StringLiteral_3=ruleStringLiteral();

                    state._fsp--;

                     
                            current = this_StringLiteral_3; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleFQN"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4108:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4109:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4110:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN7890);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN7901); 

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4117:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4120:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4121:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4121:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4121:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN7941); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4128:1: (kw= '.' this_ID_2= RULE_ID )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==61) ) {
                    int LA121_2 = input.LA(2);

                    if ( (LA121_2==RULE_ID) ) {
                        alt121=1;
                    }


                }


                switch (alt121) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4129:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,61,FOLLOW_61_in_ruleFQN7960); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN7975); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop121;
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleFQNWithWildcard"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4149:1: entryRuleFQNWithWildcard returns [String current=null] : iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF ;
    public final String entryRuleFQNWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQNWithWildcard = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4150:2: (iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4151:2: iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getFQNWithWildcardRule()); 
            pushFollow(FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard8023);
            iv_ruleFQNWithWildcard=ruleFQNWithWildcard();

            state._fsp--;

             current =iv_ruleFQNWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQNWithWildcard8034); 

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
    // $ANTLR end "entryRuleFQNWithWildcard"


    // $ANTLR start "ruleFQNWithWildcard"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4158:1: ruleFQNWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleFQNWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4161:28: ( (this_FQN_0= ruleFQN kw= '.' kw= '*' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4162:1: (this_FQN_0= ruleFQN kw= '.' kw= '*' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4162:1: (this_FQN_0= ruleFQN kw= '.' kw= '*' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4163:5: this_FQN_0= ruleFQN kw= '.' kw= '*'
            {
             
                    newCompositeNode(grammarAccess.getFQNWithWildcardAccess().getFQNParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFQN_in_ruleFQNWithWildcard8081);
            this_FQN_0=ruleFQN();

            state._fsp--;


            		current.merge(this_FQN_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,61,FOLLOW_61_in_ruleFQNWithWildcard8099); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFQNWithWildcardAccess().getFullStopKeyword_1()); 
                
            kw=(Token)match(input,56,FOLLOW_56_in_ruleFQNWithWildcard8112); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFQNWithWildcardAccess().getAsteriskKeyword_2()); 
                

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
    // $ANTLR end "ruleFQNWithWildcard"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4193:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4194:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4195:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral8152);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral8162); 

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4202:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4205:28: ( ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4206:1: ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4206:1: ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4206:2: () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4206:2: ()
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4207:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4212:2: ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4213:1: ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4213:1: ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4214:1: (lv_value_1_1= 'false' | lv_value_1_2= 'true' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4214:1: (lv_value_1_1= 'false' | lv_value_1_2= 'true' )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==62) ) {
                alt122=1;
            }
            else if ( (LA122_0==63) ) {
                alt122=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }
            switch (alt122) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4215:3: lv_value_1_1= 'false'
                    {
                    lv_value_1_1=(Token)match(input,62,FOLLOW_62_in_ruleBooleanLiteral8216); 

                            newLeafNode(lv_value_1_1, grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4227:8: lv_value_1_2= 'true'
                    {
                    lv_value_1_2=(Token)match(input,63,FOLLOW_63_in_ruleBooleanLiteral8245); 

                            newLeafNode(lv_value_1_2, grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_2, null);
                    	    

                    }
                    break;

            }


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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleNullLiteral"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4250:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4251:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4252:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
             newCompositeNode(grammarAccess.getNullLiteralRule()); 
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral8297);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;

             current =iv_ruleNullLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral8307); 

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
    // $ANTLR end "entryRuleNullLiteral"


    // $ANTLR start "ruleNullLiteral"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4259:1: ruleNullLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= 'null' ) ) ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4262:28: ( ( () ( (lv_value_1_0= 'null' ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4263:1: ( () ( (lv_value_1_0= 'null' ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4263:1: ( () ( (lv_value_1_0= 'null' ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4263:2: () ( (lv_value_1_0= 'null' ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4263:2: ()
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4264:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNullLiteralAccess().getNullLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4269:2: ( (lv_value_1_0= 'null' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4270:1: (lv_value_1_0= 'null' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4270:1: (lv_value_1_0= 'null' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4271:3: lv_value_1_0= 'null'
            {
            lv_value_1_0=(Token)match(input,64,FOLLOW_64_in_ruleNullLiteral8359); 

                    newLeafNode(lv_value_1_0, grammarAccess.getNullLiteralAccess().getValueNullKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNullLiteralRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_1_0, "null");
            	    

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
    // $ANTLR end "ruleNullLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4292:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4293:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4294:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral8408);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral8418); 

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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4301:1: ruleNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4304:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4305:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4305:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4305:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4305:2: ()
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4306:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumberLiteralAccess().getNumberLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4311:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4312:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4312:1: (lv_value_1_0= ruleNumber )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4313:3: lv_value_1_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNumber_in_ruleNumberLiteral8473);
            lv_value_1_0=ruleNumber();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumberLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"Number");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4337:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4338:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4339:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral8509);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral8519); 

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4346:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4349:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4350:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4350:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4350:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4350:2: ()
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4351:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4356:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4357:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4357:1: (lv_value_1_0= RULE_STRING )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4358:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral8570); 

            			newLeafNode(lv_value_1_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleNumber"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4382:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4386:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4387:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber8618);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber8629); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4397:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4401:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4402:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4402:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==RULE_HEX) ) {
                alt126=1;
            }
            else if ( (LA126_0==RULE_INT||LA126_0==RULE_DECIMAL) ) {
                alt126=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4402:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber8673); 

                    		current.merge(this_HEX_0);
                        
                     
                        newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4410:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4410:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4410:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4410:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt123=2;
                    int LA123_0 = input.LA(1);

                    if ( (LA123_0==RULE_INT) ) {
                        alt123=1;
                    }
                    else if ( (LA123_0==RULE_DECIMAL) ) {
                        alt123=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 123, 0, input);

                        throw nvae;
                    }
                    switch (alt123) {
                        case 1 :
                            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4410:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber8701); 

                            		current.merge(this_INT_1);
                                
                             
                                newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4418:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber8727); 

                            		current.merge(this_DECIMAL_2);
                                
                             
                                newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                

                            }
                            break;

                    }

                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4425:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt125=2;
                    int LA125_0 = input.LA(1);

                    if ( (LA125_0==61) ) {
                        alt125=1;
                    }
                    switch (alt125) {
                        case 1 :
                            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4426:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,61,FOLLOW_61_in_ruleNumber8747); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                
                            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4431:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt124=2;
                            int LA124_0 = input.LA(1);

                            if ( (LA124_0==RULE_INT) ) {
                                alt124=1;
                            }
                            else if ( (LA124_0==RULE_DECIMAL) ) {
                                alt124=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 124, 0, input);

                                throw nvae;
                            }
                            switch (alt124) {
                                case 1 :
                                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4431:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber8763); 

                                    		current.merge(this_INT_4);
                                        
                                     
                                        newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4439:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber8789); 

                                    		current.merge(this_DECIMAL_5);
                                        
                                     
                                        newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                                        

                                    }
                                    break;

                            }


                            }
                            break;

                    }


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "ruleTimeUnit"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4457:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'millis' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) | (enumLiteral_3= 'hours' ) | (enumLiteral_4= 'days' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4459:28: ( ( (enumLiteral_0= 'millis' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) | (enumLiteral_3= 'hours' ) | (enumLiteral_4= 'days' ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4460:1: ( (enumLiteral_0= 'millis' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) | (enumLiteral_3= 'hours' ) | (enumLiteral_4= 'days' ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4460:1: ( (enumLiteral_0= 'millis' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) | (enumLiteral_3= 'hours' ) | (enumLiteral_4= 'days' ) )
            int alt127=5;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt127=1;
                }
                break;
            case 66:
                {
                alt127=2;
                }
                break;
            case 67:
                {
                alt127=3;
                }
                break;
            case 68:
                {
                alt127=4;
                }
                break;
            case 69:
                {
                alt127=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }

            switch (alt127) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4460:2: (enumLiteral_0= 'millis' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4460:2: (enumLiteral_0= 'millis' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4460:4: enumLiteral_0= 'millis'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_65_in_ruleTimeUnit8856); 

                            current = grammarAccess.getTimeUnitAccess().getMillisEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getMillisEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4466:6: (enumLiteral_1= 'seconds' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4466:6: (enumLiteral_1= 'seconds' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4466:8: enumLiteral_1= 'seconds'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_66_in_ruleTimeUnit8873); 

                            current = grammarAccess.getTimeUnitAccess().getSecondsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getSecondsEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4472:6: (enumLiteral_2= 'minutes' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4472:6: (enumLiteral_2= 'minutes' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4472:8: enumLiteral_2= 'minutes'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_67_in_ruleTimeUnit8890); 

                            current = grammarAccess.getTimeUnitAccess().getMinutesEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMinutesEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4478:6: (enumLiteral_3= 'hours' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4478:6: (enumLiteral_3= 'hours' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4478:8: enumLiteral_3= 'hours'
                    {
                    enumLiteral_3=(Token)match(input,68,FOLLOW_68_in_ruleTimeUnit8907); 

                            current = grammarAccess.getTimeUnitAccess().getHoursEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getHoursEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4484:6: (enumLiteral_4= 'days' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4484:6: (enumLiteral_4= 'days' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4484:8: enumLiteral_4= 'days'
                    {
                    enumLiteral_4=(Token)match(input,69,FOLLOW_69_in_ruleTimeUnit8924); 

                            current = grammarAccess.getTimeUnitAccess().getDaysEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTimeUnitAccess().getDaysEnumLiteralDeclaration_4()); 
                        

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
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "ruleConsistencyLevel"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4494:1: ruleConsistencyLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'weak' ) | (enumLiteral_1= 'strong' ) ) ;
    public final Enumerator ruleConsistencyLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4496:28: ( ( (enumLiteral_0= 'weak' ) | (enumLiteral_1= 'strong' ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4497:1: ( (enumLiteral_0= 'weak' ) | (enumLiteral_1= 'strong' ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4497:1: ( (enumLiteral_0= 'weak' ) | (enumLiteral_1= 'strong' ) )
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==70) ) {
                alt128=1;
            }
            else if ( (LA128_0==71) ) {
                alt128=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }
            switch (alt128) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4497:2: (enumLiteral_0= 'weak' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4497:2: (enumLiteral_0= 'weak' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4497:4: enumLiteral_0= 'weak'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_70_in_ruleConsistencyLevel8969); 

                            current = grammarAccess.getConsistencyLevelAccess().getWeakEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConsistencyLevelAccess().getWeakEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4503:6: (enumLiteral_1= 'strong' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4503:6: (enumLiteral_1= 'strong' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4503:8: enumLiteral_1= 'strong'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_71_in_ruleConsistencyLevel8986); 

                            current = grammarAccess.getConsistencyLevelAccess().getStrongEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConsistencyLevelAccess().getStrongEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleConsistencyLevel"


    // $ANTLR start "ruleInconsistencyDetection"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4513:1: ruleInconsistencyDetection returns [Enumerator current=null] : ( (enumLiteral_0= 'never' ) | (enumLiteral_1= 'manually' ) | (enumLiteral_2= 'automatic' ) ) ;
    public final Enumerator ruleInconsistencyDetection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4515:28: ( ( (enumLiteral_0= 'never' ) | (enumLiteral_1= 'manually' ) | (enumLiteral_2= 'automatic' ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4516:1: ( (enumLiteral_0= 'never' ) | (enumLiteral_1= 'manually' ) | (enumLiteral_2= 'automatic' ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4516:1: ( (enumLiteral_0= 'never' ) | (enumLiteral_1= 'manually' ) | (enumLiteral_2= 'automatic' ) )
            int alt129=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt129=1;
                }
                break;
            case 73:
                {
                alt129=2;
                }
                break;
            case 74:
                {
                alt129=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }

            switch (alt129) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4516:2: (enumLiteral_0= 'never' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4516:2: (enumLiteral_0= 'never' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4516:4: enumLiteral_0= 'never'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_72_in_ruleInconsistencyDetection9031); 

                            current = grammarAccess.getInconsistencyDetectionAccess().getNeverEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getInconsistencyDetectionAccess().getNeverEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4522:6: (enumLiteral_1= 'manually' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4522:6: (enumLiteral_1= 'manually' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4522:8: enumLiteral_1= 'manually'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_73_in_ruleInconsistencyDetection9048); 

                            current = grammarAccess.getInconsistencyDetectionAccess().getManuallyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getInconsistencyDetectionAccess().getManuallyEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4528:6: (enumLiteral_2= 'automatic' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4528:6: (enumLiteral_2= 'automatic' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4528:8: enumLiteral_2= 'automatic'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_74_in_ruleInconsistencyDetection9065); 

                            current = grammarAccess.getInconsistencyDetectionAccess().getAutomaticEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getInconsistencyDetectionAccess().getAutomaticEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleInconsistencyDetection"


    // $ANTLR start "ruleInconsistencyResolution"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4538:1: ruleInconsistencyResolution returns [Enumerator current=null] : ( (enumLiteral_0= 'never' ) | (enumLiteral_1= 'manually' ) | (enumLiteral_2= 'automatic' ) | (enumLiteral_3= 'workflow' ) ) ;
    public final Enumerator ruleInconsistencyResolution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4540:28: ( ( (enumLiteral_0= 'never' ) | (enumLiteral_1= 'manually' ) | (enumLiteral_2= 'automatic' ) | (enumLiteral_3= 'workflow' ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4541:1: ( (enumLiteral_0= 'never' ) | (enumLiteral_1= 'manually' ) | (enumLiteral_2= 'automatic' ) | (enumLiteral_3= 'workflow' ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4541:1: ( (enumLiteral_0= 'never' ) | (enumLiteral_1= 'manually' ) | (enumLiteral_2= 'automatic' ) | (enumLiteral_3= 'workflow' ) )
            int alt130=4;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt130=1;
                }
                break;
            case 73:
                {
                alt130=2;
                }
                break;
            case 74:
                {
                alt130=3;
                }
                break;
            case 75:
                {
                alt130=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }

            switch (alt130) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4541:2: (enumLiteral_0= 'never' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4541:2: (enumLiteral_0= 'never' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4541:4: enumLiteral_0= 'never'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_72_in_ruleInconsistencyResolution9110); 

                            current = grammarAccess.getInconsistencyResolutionAccess().getNeverEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getInconsistencyResolutionAccess().getNeverEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4547:6: (enumLiteral_1= 'manually' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4547:6: (enumLiteral_1= 'manually' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4547:8: enumLiteral_1= 'manually'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_73_in_ruleInconsistencyResolution9127); 

                            current = grammarAccess.getInconsistencyResolutionAccess().getManuallyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getInconsistencyResolutionAccess().getManuallyEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4553:6: (enumLiteral_2= 'automatic' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4553:6: (enumLiteral_2= 'automatic' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4553:8: enumLiteral_2= 'automatic'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_74_in_ruleInconsistencyResolution9144); 

                            current = grammarAccess.getInconsistencyResolutionAccess().getAutomaticEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getInconsistencyResolutionAccess().getAutomaticEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4559:6: (enumLiteral_3= 'workflow' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4559:6: (enumLiteral_3= 'workflow' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:4559:8: enumLiteral_3= 'workflow'
                    {
                    enumLiteral_3=(Token)match(input,75,FOLLOW_75_in_ruleInconsistencyResolution9161); 

                            current = grammarAccess.getInconsistencyResolutionAccess().getWorkflowEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getInconsistencyResolutionAccess().getWorkflowEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleInconsistencyResolution"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA91 dfa91 = new DFA91(this);
    static final String DFA5_eotS =
        "\6\uffff";
    static final String DFA5_eofS =
        "\1\uffff\1\3\2\uffff\1\3\1\uffff";
    static final String DFA5_minS =
        "\1\4\1\5\1\4\1\uffff\1\5\1\uffff";
    static final String DFA5_maxS =
        "\1\4\1\75\1\70\1\uffff\1\75\1\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\uffff\1\2";
    static final String DFA5_specialS =
        "\6\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\3\11\uffff\1\3\1\uffff\2\3\5\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\3\1\uffff\2\3\5\uffff\2\3\2\uffff\1\3\17\uffff\1\3\1\2",
            "\1\4\63\uffff\1\5",
            "",
            "\1\3\11\uffff\1\3\1\uffff\2\3\5\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\3\1\uffff\2\3\5\uffff\2\3\2\uffff\1\3\17\uffff\1\3\1\2",
            ""
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
            return "282:1: (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard )";
        }
    }
    static final String DFA80_eotS =
        "\7\uffff";
    static final String DFA80_eofS =
        "\7\uffff";
    static final String DFA80_minS =
        "\3\4\2\uffff\2\4";
    static final String DFA80_maxS =
        "\1\74\1\75\1\74\2\uffff\1\4\1\75";
    static final String DFA80_acceptS =
        "\3\uffff\1\2\1\1\2\uffff";
    static final String DFA80_specialS =
        "\7\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\1\1\2\11\uffff\1\3\30\uffff\1\3\16\uffff\1\4\4\uffff\1\3",
            "\1\4\1\3\11\uffff\1\3\30\uffff\1\3\17\uffff\1\4\3\uffff\1\3\1\5",
            "\1\4\43\uffff\1\3\16\uffff\1\4\4\uffff\1\3",
            "",
            "",
            "\1\6",
            "\1\4\1\3\11\uffff\1\3\30\uffff\1\3\17\uffff\1\4\3\uffff\1\3\1\5"
    };

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "()* loopback of 2814:1: ( (lv_parameters_10_0= ruleParameter ) )*";
        }
    }
    static final String DFA91_eotS =
        "\7\uffff";
    static final String DFA91_eofS =
        "\7\uffff";
    static final String DFA91_minS =
        "\3\4\2\uffff\2\4";
    static final String DFA91_maxS =
        "\1\74\1\75\1\74\2\uffff\1\4\1\75";
    static final String DFA91_acceptS =
        "\3\uffff\1\2\1\1\2\uffff";
    static final String DFA91_specialS =
        "\7\uffff}>";
    static final String[] DFA91_transitionS = {
            "\1\1\1\2\11\uffff\1\3\30\uffff\1\3\6\uffff\1\3\7\uffff\1\4\4\uffff\1\3",
            "\1\4\1\3\11\uffff\1\3\30\uffff\1\3\6\uffff\1\3\10\uffff\1\4\3\uffff\1\3\1\5",
            "\1\4\43\uffff\1\3\6\uffff\1\3\7\uffff\1\4\4\uffff\1\3",
            "",
            "",
            "\1\6",
            "\1\4\1\3\11\uffff\1\3\30\uffff\1\3\6\uffff\1\3\10\uffff\1\4\3\uffff\1\3\1\5"
    };

    static final short[] DFA91_eot = DFA.unpackEncodedString(DFA91_eotS);
    static final short[] DFA91_eof = DFA.unpackEncodedString(DFA91_eofS);
    static final char[] DFA91_min = DFA.unpackEncodedStringToUnsignedChars(DFA91_minS);
    static final char[] DFA91_max = DFA.unpackEncodedStringToUnsignedChars(DFA91_maxS);
    static final short[] DFA91_accept = DFA.unpackEncodedString(DFA91_acceptS);
    static final short[] DFA91_special = DFA.unpackEncodedString(DFA91_specialS);
    static final short[][] DFA91_transition;

    static {
        int numStates = DFA91_transitionS.length;
        DFA91_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA91_transition[i] = DFA.unpackEncodedString(DFA91_transitionS[i]);
        }
    }

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = DFA91_eot;
            this.eof = DFA91_eof;
            this.min = DFA91_min;
            this.max = DFA91_max;
            this.accept = DFA91_accept;
            this.special = DFA91_special;
            this.transition = DFA91_transition;
        }
        public String getDescription() {
            return "()* loopback of 3103:1: ( (lv_parameters_12_0= ruleParameter ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContext_in_ruleDomainModel130 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleContext_in_entryRuleContext166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContext176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleContext213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContext230 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContext247 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ruleNamespace_in_ruleContext268 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleContext281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleNamespace364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleNamespace385 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNamespace397 = new BitSet(new long[]{0x10001306A5068020L});
    public static final BitSet FOLLOW_ruleImport_in_ruleNamespace418 = new BitSet(new long[]{0x10001306A5068020L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleNamespace440 = new BitSet(new long[]{0x10001306A5048020L});
    public static final BitSet FOLLOW_15_in_ruleNamespace453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleImport536 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleImport559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_ruleImport578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleAbstractElement674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleAbstractElement701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleException_in_ruleAbstractElement728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleAbstractElement755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalType_in_ruleType847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalType_in_ruleType874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_ruleType901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalType_in_entryRuleInternalType936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalType946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractVO_in_ruleInternalType993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractEntity_in_ruleInternalType1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumObject_in_ruleInternalType1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractVO_in_entryRuleAbstractVO1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractVO1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_ruleAbstractVO1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractEntityId_in_ruleAbstractVO1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractEntityId_in_entryRuleAbstractEntityId1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractEntityId1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityId_in_ruleAbstractEntityId1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregateId_in_ruleAbstractEntityId1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractEntity_in_entryRuleAbstractEntity1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractEntity1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleAbstractEntity1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregate_in_ruleAbstractEntity1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalType_in_entryRuleExternalType1439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalType1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleExternalType1491 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleExternalType1509 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleExternalType1527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalType1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDuration_in_entryRuleDuration1599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDuration1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDuration1651 = new BitSet(new long[]{0x0000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleDuration1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakConsistency_in_entryRuleWeakConsistency1713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeakConsistency1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleWeakConsistency1765 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleWeakConsistency1783 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDuration_in_ruleWeakConsistency1804 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleWeakConsistency1821 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleWeakConsistency1839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000700L});
    public static final BitSet FOLLOW_ruleInconsistencyDetection_in_ruleWeakConsistency1860 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleWeakConsistency1877 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleWeakConsistency1895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_ruleInconsistencyResolution_in_ruleWeakConsistency1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConsistency_in_entryRuleConsistency1952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConsistency1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleConsistency2004 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleConsistency2021 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleConsistencyLevel_in_ruleConsistency2042 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleConsistency2055 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleWeakConsistency_in_ruleConsistency2076 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConsistency2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint2126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleConstraint2178 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleConstraint2196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint2213 = new BitSet(new long[]{0x0000000006004000L});
    public static final BitSet FOLLOW_25_in_ruleConstraint2231 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleConstraint2254 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_26_in_ruleConstraint2269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleConstraint2292 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConstraint2306 = new BitSet(new long[]{0x0080000008008030L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleConstraint2327 = new BitSet(new long[]{0x0080000008008030L});
    public static final BitSet FOLLOW_ruleConsistency_in_ruleConstraint2349 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_27_in_ruleConstraint2363 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint2380 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConstraint2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleException_in_entryRuleException2435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleException2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleException2487 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleException2505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleException2522 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_28_in_ruleException2540 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleException2557 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleException2576 = new BitSet(new long[]{0x0080000008000030L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleException2597 = new BitSet(new long[]{0x0080000008000030L});
    public static final BitSet FOLLOW_27_in_ruleException2610 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleException2627 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleException2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_entryRuleValueObject2680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueObject2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleValueObject2732 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleValueObject2750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValueObject2767 = new BitSet(new long[]{0x0200000040004000L});
    public static final BitSet FOLLOW_30_in_ruleValueObject2785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleValueObject2808 = new BitSet(new long[]{0x0200000000004000L});
    public static final BitSet FOLLOW_ruleInvariants_in_ruleValueObject2831 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleValueObject2844 = new BitSet(new long[]{0x00FD200000008030L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleValueObject2865 = new BitSet(new long[]{0x0081200000008030L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleValueObject2886 = new BitSet(new long[]{0x0081200000008030L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleValueObject2908 = new BitSet(new long[]{0x0001200000008020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleValueObject2930 = new BitSet(new long[]{0x0001000000008020L});
    public static final BitSet FOLLOW_15_in_ruleValueObject2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityId_in_entryRuleEntityId2979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityId2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleEntityId3031 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEntityId3049 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityId3066 = new BitSet(new long[]{0x0200000140004000L});
    public static final BitSet FOLLOW_32_in_ruleEntityId3084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEntityId3107 = new BitSet(new long[]{0x0200000040004000L});
    public static final BitSet FOLLOW_30_in_ruleEntityId3122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEntityId3145 = new BitSet(new long[]{0x0200000000004000L});
    public static final BitSet FOLLOW_ruleInvariants_in_ruleEntityId3168 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntityId3181 = new BitSet(new long[]{0x00FD200000008030L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleEntityId3202 = new BitSet(new long[]{0x0081200000008030L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntityId3223 = new BitSet(new long[]{0x0081200000008030L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleEntityId3245 = new BitSet(new long[]{0x0001200000008020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleEntityId3267 = new BitSet(new long[]{0x0001000000008020L});
    public static final BitSet FOLLOW_15_in_ruleEntityId3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregateId_in_entryRuleAggregateId3316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAggregateId3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleAggregateId3368 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAggregateId3386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAggregateId3403 = new BitSet(new long[]{0x0200000140004000L});
    public static final BitSet FOLLOW_32_in_ruleAggregateId3421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleAggregateId3444 = new BitSet(new long[]{0x0200000040004000L});
    public static final BitSet FOLLOW_30_in_ruleAggregateId3459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleAggregateId3482 = new BitSet(new long[]{0x0200000000004000L});
    public static final BitSet FOLLOW_ruleInvariants_in_ruleAggregateId3505 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAggregateId3518 = new BitSet(new long[]{0x00FD200000008030L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleAggregateId3539 = new BitSet(new long[]{0x0081200000008030L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleAggregateId3560 = new BitSet(new long[]{0x0081200000008030L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleAggregateId3582 = new BitSet(new long[]{0x0001200000008020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleAggregateId3604 = new BitSet(new long[]{0x0001000000008020L});
    public static final BitSet FOLLOW_15_in_ruleAggregateId3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumObject_in_entryRuleEnumObject3653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumObject3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleEnumObject3705 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleEnumObject3723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumObject3740 = new BitSet(new long[]{0x0200000040004000L});
    public static final BitSet FOLLOW_30_in_ruleEnumObject3758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEnumObject3781 = new BitSet(new long[]{0x0200000000004000L});
    public static final BitSet FOLLOW_ruleInvariants_in_ruleEnumObject3804 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumObject3817 = new BitSet(new long[]{0x00FC000800000030L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleEnumObject3838 = new BitSet(new long[]{0x0080000800000030L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEnumObject3859 = new BitSet(new long[]{0x0080000800000030L});
    public static final BitSet FOLLOW_35_in_ruleEnumObject3872 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumObject3884 = new BitSet(new long[]{0x0000001000000030L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_ruleEnumObject3905 = new BitSet(new long[]{0x0000001000008030L});
    public static final BitSet FOLLOW_15_in_ruleEnumObject3918 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEnumObject3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance3966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumInstance3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleEnumInstance4018 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_36_in_ruleEnumInstance4042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance4073 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleEnumInstance4091 = new BitSet(new long[]{0xC0000000000003C0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleEnumInstance4112 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_38_in_ruleEnumInstance4125 = new BitSet(new long[]{0xC0000000000003C0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleEnumInstance4146 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_39_in_ruleEnumInstance4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent4198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleEvent4250 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleEvent4268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent4285 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEvent4302 = new BitSet(new long[]{0x0080000008008030L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEvent4323 = new BitSet(new long[]{0x0080000008008030L});
    public static final BitSet FOLLOW_27_in_ruleEvent4337 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEvent4354 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEvent4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity4409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity4419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleEntity4461 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleEntity4479 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity4496 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_42_in_ruleEntity4514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEntity4537 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleEntity4551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEntity4574 = new BitSet(new long[]{0x0200000000004000L});
    public static final BitSet FOLLOW_ruleInvariants_in_ruleEntity4595 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntity4608 = new BitSet(new long[]{0x10FD3306A5048030L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleEntity4629 = new BitSet(new long[]{0x10813306A5048030L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity4650 = new BitSet(new long[]{0x10813306A5048030L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleEntity4672 = new BitSet(new long[]{0x10013306A5048020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleEntity4694 = new BitSet(new long[]{0x10011306A5048020L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleEntity4716 = new BitSet(new long[]{0x10001306A5048020L});
    public static final BitSet FOLLOW_ruleEntityId_in_ruleEntity4738 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEntity4751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregate_in_entryRuleAggregate4787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAggregate4797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleAggregate4839 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleAggregate4857 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAggregate4874 = new BitSet(new long[]{0x0200040000004000L});
    public static final BitSet FOLLOW_42_in_ruleAggregate4892 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleAggregate4915 = new BitSet(new long[]{0x0200000000004000L});
    public static final BitSet FOLLOW_ruleInvariants_in_ruleAggregate4938 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAggregate4951 = new BitSet(new long[]{0x10FD3306A5048030L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleAggregate4972 = new BitSet(new long[]{0x10813306A5048030L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleAggregate4993 = new BitSet(new long[]{0x10813306A5048030L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleAggregate5015 = new BitSet(new long[]{0x10013306A5048020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleAggregate5037 = new BitSet(new long[]{0x10011306A5048020L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleAggregate5059 = new BitSet(new long[]{0x10001306A5048020L});
    public static final BitSet FOLLOW_ruleAggregateId_in_ruleAggregate5081 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAggregate5094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_entryRuleConstructor5132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleConstructor5184 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleConstructor5202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor5219 = new BitSet(new long[]{0x0C00400000004000L});
    public static final BitSet FOLLOW_rulePreconditions_in_ruleConstructor5245 = new BitSet(new long[]{0x0800400000004000L});
    public static final BitSet FOLLOW_ruleBusinessRules_in_ruleConstructor5267 = new BitSet(new long[]{0x0000400000004000L});
    public static final BitSet FOLLOW_46_in_ruleConstructor5281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleConstructor5304 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_38_in_ruleConstructor5317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleConstructor5340 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_14_in_ruleConstructor5356 = new BitSet(new long[]{0x10801306A5048030L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleConstructor5377 = new BitSet(new long[]{0x10801306A5048030L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleConstructor5401 = new BitSet(new long[]{0x10001306A5048020L});
    public static final BitSet FOLLOW_ruleService_in_ruleConstructor5423 = new BitSet(new long[]{0x10001306A5048020L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleConstructor5445 = new BitSet(new long[]{0x10001306A5048020L});
    public static final BitSet FOLLOW_15_in_ruleConstructor5458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnType_in_entryRuleReturnType5494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnType5504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleReturnType5546 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleReturnType5564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleReturnType5587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod5623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod5633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleMethod5675 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleMethod5693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod5710 = new BitSet(new long[]{0x0C02400000004000L});
    public static final BitSet FOLLOW_49_in_ruleMethod5728 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleMethod5751 = new BitSet(new long[]{0x0C00400000004000L});
    public static final BitSet FOLLOW_rulePreconditions_in_ruleMethod5774 = new BitSet(new long[]{0x0800400000004000L});
    public static final BitSet FOLLOW_ruleBusinessRules_in_ruleMethod5796 = new BitSet(new long[]{0x0000400000004000L});
    public static final BitSet FOLLOW_46_in_ruleMethod5810 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleMethod5833 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_38_in_ruleMethod5846 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleMethod5869 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_14_in_ruleMethod5885 = new BitSet(new long[]{0x10809306A5048030L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod5906 = new BitSet(new long[]{0x10809306A5048030L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleMethod5930 = new BitSet(new long[]{0x10009306A5048020L});
    public static final BitSet FOLLOW_ruleReturnType_in_ruleMethod5952 = new BitSet(new long[]{0x10001306A5048020L});
    public static final BitSet FOLLOW_ruleService_in_ruleMethod5974 = new BitSet(new long[]{0x10001306A5048020L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleMethod5996 = new BitSet(new long[]{0x10001306A5048020L});
    public static final BitSet FOLLOW_15_in_ruleMethod6009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_entryRuleTypeMetaInfo6045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeMetaInfo6055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTypeMetaInfo6102 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo6119 = new BitSet(new long[]{0x0078000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTypeMetaInfo6139 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo6156 = new BitSet(new long[]{0x0070000000000002L});
    public static final BitSet FOLLOW_52_in_ruleTypeMetaInfo6176 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo6193 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_53_in_ruleTypeMetaInfo6213 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo6230 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleTypeMetaInfo6250 = new BitSet(new long[]{0xC0000000000003C2L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTypeMetaInfo6271 = new BitSet(new long[]{0xC0000000000003C2L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute6312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute6322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleAttribute6364 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_55_in_ruleAttribute6388 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleAttribute6425 = new BitSet(new long[]{0x0100000000000010L});
    public static final BitSet FOLLOW_56_in_ruleAttribute6443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute6474 = new BitSet(new long[]{0x0200000000004002L});
    public static final BitSet FOLLOW_ruleInvariants_in_ruleAttribute6500 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleOverriddenTypeMetaInfo_in_ruleAttribute6522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter6559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter6569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleParameter6611 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_55_in_ruleParameter6635 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleParameter6672 = new BitSet(new long[]{0x0100000000000010L});
    public static final BitSet FOLLOW_56_in_ruleParameter6690 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter6721 = new BitSet(new long[]{0x0C00000000004002L});
    public static final BitSet FOLLOW_rulePreconditions_in_ruleParameter6747 = new BitSet(new long[]{0x0800000000004002L});
    public static final BitSet FOLLOW_ruleBusinessRules_in_ruleParameter6769 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleOverriddenTypeMetaInfo_in_ruleParameter6791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariants_in_entryRuleInvariants6828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvariants6838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleInvariants6875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintInstance_in_ruleInvariants6896 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleInvariants6909 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintInstance_in_ruleInvariants6930 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rulePreconditions_in_entryRulePreconditions6968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreconditions6978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePreconditions7015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintInstance_in_rulePreconditions7036 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_rulePreconditions7049 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintInstance_in_rulePreconditions7070 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleBusinessRules_in_entryRuleBusinessRules7108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessRules7118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleBusinessRules7155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintInstance_in_ruleBusinessRules7176 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleBusinessRules7189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintInstance_in_ruleBusinessRules7210 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleOverriddenTypeMetaInfo_in_entryRuleOverriddenTypeMetaInfo7248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverriddenTypeMetaInfo7258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOverriddenTypeMetaInfo7295 = new BitSet(new long[]{0x007C000000008000L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleOverriddenTypeMetaInfo7316 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleOverriddenTypeMetaInfo7328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintInstance_in_entryRuleConstraintInstance7364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintInstance7374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleConstraintInstance7422 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleConstraintInstance7435 = new BitSet(new long[]{0xC0000000000003C0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleConstraintInstance7456 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_38_in_ruleConstraintInstance7469 = new BitSet(new long[]{0xC0000000000003C0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleConstraintInstance7490 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_39_in_ruleConstraintInstance7504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService7542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService7552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleService7594 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleService7612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService7629 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleService7646 = new BitSet(new long[]{0x0001000000008020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleService7667 = new BitSet(new long[]{0x0001000000008020L});
    public static final BitSet FOLLOW_15_in_ruleService7680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral7716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral7726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteral7773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral7800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteral7827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral7854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN7890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN7901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN7941 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleFQN7960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN7975 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard8023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQNWithWildcard8034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleFQNWithWildcard8081 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleFQNWithWildcard8099 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleFQNWithWildcard8112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral8152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral8162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleBooleanLiteral8216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleBooleanLiteral8245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral8297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral8307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleNullLiteral8359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral8408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral8418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumberLiteral8473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral8509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral8519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral8570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber8618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber8629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber8673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber8701 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber8727 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleNumber8747 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber8763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber8789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleTimeUnit8856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleTimeUnit8873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleTimeUnit8890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleTimeUnit8907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleTimeUnit8924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleConsistencyLevel8969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleConsistencyLevel8986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleInconsistencyDetection9031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleInconsistencyDetection9048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleInconsistencyDetection9065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleInconsistencyResolution9110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleInconsistencyResolution9127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleInconsistencyResolution9144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleInconsistencyResolution9161 = new BitSet(new long[]{0x0000000000000002L});

}