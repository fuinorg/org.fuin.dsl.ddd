package org.fuin.dsl.ddd.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOC", "RULE_STRING", "RULE_INT", "RULE_HEX", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'context'", "'{'", "'}'", "'namespace'", "'import'", "'type'", "'constraint'", "'on'", "'exception'", "'message'", "'cid'", "'value-object'", "'base'", "'entity-id'", "'identifies'", "'aggregate-id'", "'enum'", "'instances'", "'deprecated'", "'('", "','", "')'", "'event'", "'entity'", "'identifier'", "'root'", "'aggregate'", "'constructor'", "'constraints'", "'fires'", "'returns'", "'method'", "'ref'", "'slabel'", "'label'", "'tooltip'", "'prompt'", "'examples'", "'nullable'", "'*'", "'invariants'", "'service'", "'.'", "'false'", "'true'", "'null'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_DOC=5;
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
    public static final int RULE_INT=7;
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
    public static final int RULE_STRING=6;
    public static final int T__32=32;
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:67:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:68:2: (iv_ruleDomainModel= ruleDomainModel EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:69:2: iv_ruleDomainModel= ruleDomainModel EOF
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:76:1: ruleDomainModel returns [EObject current=null] : ( (lv_contexts_0_0= ruleContext ) )* ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_contexts_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:79:28: ( ( (lv_contexts_0_0= ruleContext ) )* )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:80:1: ( (lv_contexts_0_0= ruleContext ) )*
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:80:1: ( (lv_contexts_0_0= ruleContext ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:81:1: (lv_contexts_0_0= ruleContext )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:81:1: (lv_contexts_0_0= ruleContext )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:82:3: lv_contexts_0_0= ruleContext
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:106:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:107:2: (iv_ruleContext= ruleContext EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:108:2: iv_ruleContext= ruleContext EOF
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:115:1: ruleContext returns [EObject current=null] : (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleNamespace ) )* otherlv_4= '}' ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_namespaces_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:118:28: ( (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleNamespace ) )* otherlv_4= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:119:1: (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleNamespace ) )* otherlv_4= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:119:1: (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleNamespace ) )* otherlv_4= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:119:3: otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleNamespace ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleContext213); 

                	newLeafNode(otherlv_0, grammarAccess.getContextAccess().getContextKeyword_0());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:124:1: (lv_name_1_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:125:3: lv_name_1_0= RULE_ID
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
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:145:1: ( (lv_namespaces_3_0= ruleNamespace ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:146:1: (lv_namespaces_3_0= ruleNamespace )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:146:1: (lv_namespaces_3_0= ruleNamespace )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:147:3: lv_namespaces_3_0= ruleNamespace
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:175:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:176:2: (iv_ruleNamespace= ruleNamespace EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:177:2: iv_ruleNamespace= ruleNamespace EOF
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:184:1: ruleNamespace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' ) ;
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
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:187:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:188:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:188:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:188:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleNamespace364); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:192:1: ( (lv_name_1_0= ruleFQN ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:193:1: (lv_name_1_0= ruleFQN )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:193:1: (lv_name_1_0= ruleFQN )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:194:3: lv_name_1_0= ruleFQN
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
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:214:1: ( (lv_imports_3_0= ruleImport ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:215:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:215:1: (lv_imports_3_0= ruleImport )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:216:3: lv_imports_3_0= ruleImport
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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:232:3: ( (lv_elements_4_0= ruleAbstractElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_DOC||(LA4_0>=18 && LA4_0<=19)||LA4_0==21||LA4_0==24||LA4_0==26||(LA4_0>=28 && LA4_0<=29)||(LA4_0>=35 && LA4_0<=36)||LA4_0==39||LA4_0==54) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:233:1: (lv_elements_4_0= ruleAbstractElement )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:233:1: (lv_elements_4_0= ruleAbstractElement )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:234:3: lv_elements_4_0= ruleAbstractElement
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:262:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:263:2: (iv_ruleImport= ruleImport EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:264:2: iv_ruleImport= ruleImport EOF
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:271:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_1 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:274:28: ( (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:275:1: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:275:1: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:275:3: otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleImport536); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:279:1: ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:280:1: ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:280:1: ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:281:1: (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:281:1: (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:282:3: lv_importedNamespace_1_1= ruleFQN
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
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:297:8: lv_importedNamespace_1_2= ruleFQNWithWildcard
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:323:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:324:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:325:2: iv_ruleAbstractElement= ruleAbstractElement EOF
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:332:1: ruleAbstractElement returns [EObject current=null] : (this_Constraint_0= ruleConstraint | this_Type_1= ruleType | this_Exception_2= ruleException | this_Event_3= ruleEvent ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Constraint_0 = null;

        EObject this_Type_1 = null;

        EObject this_Exception_2 = null;

        EObject this_Event_3 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:335:28: ( (this_Constraint_0= ruleConstraint | this_Type_1= ruleType | this_Exception_2= ruleException | this_Event_3= ruleEvent ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:336:1: (this_Constraint_0= ruleConstraint | this_Type_1= ruleType | this_Exception_2= ruleException | this_Event_3= ruleEvent )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:336:1: (this_Constraint_0= ruleConstraint | this_Type_1= ruleType | this_Exception_2= ruleException | this_Event_3= ruleEvent )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_DOC:
                {
                switch ( input.LA(2) ) {
                case 24:
                case 26:
                case 28:
                case 29:
                case 36:
                case 39:
                case 54:
                    {
                    alt6=2;
                    }
                    break;
                case 21:
                    {
                    alt6=3;
                    }
                    break;
                case 35:
                    {
                    alt6=4;
                    }
                    break;
                case 19:
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
            case 19:
                {
                alt6=1;
                }
                break;
            case 18:
            case 24:
            case 26:
            case 28:
            case 29:
            case 36:
            case 39:
            case 54:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 35:
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
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:337:5: this_Constraint_0= ruleConstraint
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
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:347:5: this_Type_1= ruleType
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
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:357:5: this_Exception_2= ruleException
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
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:367:5: this_Event_3= ruleEvent
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:383:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:384:2: (iv_ruleType= ruleType EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:385:2: iv_ruleType= ruleType EOF
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:392:1: ruleType returns [EObject current=null] : (this_ExternalType_0= ruleExternalType | this_InternalType_1= ruleInternalType | this_Service_2= ruleService ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalType_0 = null;

        EObject this_InternalType_1 = null;

        EObject this_Service_2 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:395:28: ( (this_ExternalType_0= ruleExternalType | this_InternalType_1= ruleInternalType | this_Service_2= ruleService ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:396:1: (this_ExternalType_0= ruleExternalType | this_InternalType_1= ruleInternalType | this_Service_2= ruleService )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:396:1: (this_ExternalType_0= ruleExternalType | this_InternalType_1= ruleInternalType | this_Service_2= ruleService )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case RULE_DOC:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==24||LA7_2==26||(LA7_2>=28 && LA7_2<=29)||LA7_2==36||LA7_2==39) ) {
                    alt7=2;
                }
                else if ( (LA7_2==54) ) {
                    alt7=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 24:
            case 26:
            case 28:
            case 29:
            case 36:
            case 39:
                {
                alt7=2;
                }
                break;
            case 54:
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
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:397:5: this_ExternalType_0= ruleExternalType
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
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:407:5: this_InternalType_1= ruleInternalType
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
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:417:5: this_Service_2= ruleService
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:433:1: entryRuleInternalType returns [EObject current=null] : iv_ruleInternalType= ruleInternalType EOF ;
    public final EObject entryRuleInternalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalType = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:434:2: (iv_ruleInternalType= ruleInternalType EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:435:2: iv_ruleInternalType= ruleInternalType EOF
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:442:1: ruleInternalType returns [EObject current=null] : (this_AbstractVO_0= ruleAbstractVO | this_AbstractEntity_1= ruleAbstractEntity | this_EnumObject_2= ruleEnumObject ) ;
    public final EObject ruleInternalType() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractVO_0 = null;

        EObject this_AbstractEntity_1 = null;

        EObject this_EnumObject_2 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:445:28: ( (this_AbstractVO_0= ruleAbstractVO | this_AbstractEntity_1= ruleAbstractEntity | this_EnumObject_2= ruleEnumObject ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:446:1: (this_AbstractVO_0= ruleAbstractVO | this_AbstractEntity_1= ruleAbstractEntity | this_EnumObject_2= ruleEnumObject )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:446:1: (this_AbstractVO_0= ruleAbstractVO | this_AbstractEntity_1= ruleAbstractEntity | this_EnumObject_2= ruleEnumObject )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_DOC:
                {
                switch ( input.LA(2) ) {
                case 36:
                case 39:
                    {
                    alt8=2;
                    }
                    break;
                case 24:
                case 26:
                case 28:
                    {
                    alt8=1;
                    }
                    break;
                case 29:
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
            case 24:
            case 26:
            case 28:
                {
                alt8=1;
                }
                break;
            case 36:
            case 39:
                {
                alt8=2;
                }
                break;
            case 29:
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
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:447:5: this_AbstractVO_0= ruleAbstractVO
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
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:457:5: this_AbstractEntity_1= ruleAbstractEntity
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
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:467:5: this_EnumObject_2= ruleEnumObject
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:483:1: entryRuleAbstractVO returns [EObject current=null] : iv_ruleAbstractVO= ruleAbstractVO EOF ;
    public final EObject entryRuleAbstractVO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractVO = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:484:2: (iv_ruleAbstractVO= ruleAbstractVO EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:485:2: iv_ruleAbstractVO= ruleAbstractVO EOF
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:492:1: ruleAbstractVO returns [EObject current=null] : (this_ValueObject_0= ruleValueObject | this_AbstractEntityId_1= ruleAbstractEntityId ) ;
    public final EObject ruleAbstractVO() throws RecognitionException {
        EObject current = null;

        EObject this_ValueObject_0 = null;

        EObject this_AbstractEntityId_1 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:495:28: ( (this_ValueObject_0= ruleValueObject | this_AbstractEntityId_1= ruleAbstractEntityId ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:496:1: (this_ValueObject_0= ruleValueObject | this_AbstractEntityId_1= ruleAbstractEntityId )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:496:1: (this_ValueObject_0= ruleValueObject | this_AbstractEntityId_1= ruleAbstractEntityId )
            int alt9=2;
            switch ( input.LA(1) ) {
            case RULE_DOC:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==26||LA9_1==28) ) {
                    alt9=2;
                }
                else if ( (LA9_1==24) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt9=1;
                }
                break;
            case 26:
            case 28:
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
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:497:5: this_ValueObject_0= ruleValueObject
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
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:507:5: this_AbstractEntityId_1= ruleAbstractEntityId
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:523:1: entryRuleAbstractEntityId returns [EObject current=null] : iv_ruleAbstractEntityId= ruleAbstractEntityId EOF ;
    public final EObject entryRuleAbstractEntityId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractEntityId = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:524:2: (iv_ruleAbstractEntityId= ruleAbstractEntityId EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:525:2: iv_ruleAbstractEntityId= ruleAbstractEntityId EOF
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:532:1: ruleAbstractEntityId returns [EObject current=null] : (this_EntityId_0= ruleEntityId | this_AggregateId_1= ruleAggregateId ) ;
    public final EObject ruleAbstractEntityId() throws RecognitionException {
        EObject current = null;

        EObject this_EntityId_0 = null;

        EObject this_AggregateId_1 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:535:28: ( (this_EntityId_0= ruleEntityId | this_AggregateId_1= ruleAggregateId ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:536:1: (this_EntityId_0= ruleEntityId | this_AggregateId_1= ruleAggregateId )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:536:1: (this_EntityId_0= ruleEntityId | this_AggregateId_1= ruleAggregateId )
            int alt10=2;
            switch ( input.LA(1) ) {
            case RULE_DOC:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==28) ) {
                    alt10=2;
                }
                else if ( (LA10_1==26) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                alt10=1;
                }
                break;
            case 28:
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
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:537:5: this_EntityId_0= ruleEntityId
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
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:547:5: this_AggregateId_1= ruleAggregateId
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:563:1: entryRuleAbstractEntity returns [EObject current=null] : iv_ruleAbstractEntity= ruleAbstractEntity EOF ;
    public final EObject entryRuleAbstractEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractEntity = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:564:2: (iv_ruleAbstractEntity= ruleAbstractEntity EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:565:2: iv_ruleAbstractEntity= ruleAbstractEntity EOF
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:572:1: ruleAbstractEntity returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Aggregate_1= ruleAggregate ) ;
    public final EObject ruleAbstractEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Aggregate_1 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:575:28: ( (this_Entity_0= ruleEntity | this_Aggregate_1= ruleAggregate ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:576:1: (this_Entity_0= ruleEntity | this_Aggregate_1= ruleAggregate )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:576:1: (this_Entity_0= ruleEntity | this_Aggregate_1= ruleAggregate )
            int alt11=2;
            switch ( input.LA(1) ) {
            case RULE_DOC:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==39) ) {
                    alt11=2;
                }
                else if ( (LA11_1==36) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case 36:
                {
                alt11=1;
                }
                break;
            case 39:
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
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:577:5: this_Entity_0= ruleEntity
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
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:587:5: this_Aggregate_1= ruleAggregate
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:605:1: entryRuleExternalType returns [EObject current=null] : iv_ruleExternalType= ruleExternalType EOF ;
    public final EObject entryRuleExternalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalType = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:606:2: (iv_ruleExternalType= ruleExternalType EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:607:2: iv_ruleExternalType= ruleExternalType EOF
            {
             newCompositeNode(grammarAccess.getExternalTypeRule()); 
            pushFollow(FOLLOW_ruleExternalType_in_entryRuleExternalType1441);
            iv_ruleExternalType=ruleExternalType();

            state._fsp--;

             current =iv_ruleExternalType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalType1451); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:614:1: ruleExternalType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleExternalType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:617:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:618:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:618:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:618:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleExternalType1488); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalTypeAccess().getTypeKeyword_0());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:622:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:623:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:623:1: (lv_name_1_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:624:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalType1505); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExternalTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExternalTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
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


    // $ANTLR start "entryRuleConstraint"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:648:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:649:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:650:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint1546);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint1556); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:657:1: ruleConstraint returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'on' ( ( ruleFQN ) ) )? (otherlv_5= 'exception' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) )* (otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_message_10_0=null;
        Token otherlv_11=null;
        EObject lv_variables_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:660:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'on' ( ( ruleFQN ) ) )? (otherlv_5= 'exception' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) )* (otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:661:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'on' ( ( ruleFQN ) ) )? (otherlv_5= 'exception' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) )* (otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:661:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'on' ( ( ruleFQN ) ) )? (otherlv_5= 'exception' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) )* (otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:661:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'on' ( ( ruleFQN ) ) )? (otherlv_5= 'exception' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) )* (otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) ) )? otherlv_11= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:661:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_DOC) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:662:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:662:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:663:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleConstraint1598); 

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

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleConstraint1616); 

                	newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getConstraintKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:683:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:684:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:684:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:685:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint1633); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:701:2: (otherlv_3= 'on' ( ( ruleFQN ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:701:4: otherlv_3= 'on' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleConstraint1651); 

                        	newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getOnKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:705:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:706:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:706:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:707:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getConstraintAccess().getTargetConstraintTargetCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleConstraint1674);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:720:4: (otherlv_5= 'exception' ( ( ruleFQN ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:720:6: otherlv_5= 'exception' ( ( ruleFQN ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleConstraint1689); 

                        	newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getExceptionKeyword_4_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:724:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:725:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:725:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:726:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getConstraintAccess().getExceptionExceptionCrossReference_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleConstraint1712);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleConstraint1726); 

                	newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:743:1: ( (lv_variables_8_0= ruleVariable ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_DOC)||LA15_0==51) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:744:1: (lv_variables_8_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:744:1: (lv_variables_8_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:745:3: lv_variables_8_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstraintAccess().getVariablesVariableParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleConstraint1747);
            	    lv_variables_8_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_8_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:761:3: (otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:761:5: otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleConstraint1761); 

                        	newLeafNode(otherlv_9, grammarAccess.getConstraintAccess().getMessageKeyword_7_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:765:1: ( (lv_message_10_0= RULE_STRING ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:766:1: (lv_message_10_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:766:1: (lv_message_10_0= RULE_STRING )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:767:3: lv_message_10_0= RULE_STRING
                    {
                    lv_message_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint1778); 

                    			newLeafNode(lv_message_10_0, grammarAccess.getConstraintAccess().getMessageSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"message",
                            		lv_message_10_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleConstraint1797); 

                	newLeafNode(otherlv_11, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:795:1: entryRuleException returns [EObject current=null] : iv_ruleException= ruleException EOF ;
    public final EObject entryRuleException() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleException = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:796:2: (iv_ruleException= ruleException EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:797:2: iv_ruleException= ruleException EOF
            {
             newCompositeNode(grammarAccess.getExceptionRule()); 
            pushFollow(FOLLOW_ruleException_in_entryRuleException1833);
            iv_ruleException=ruleException();

            state._fsp--;

             current =iv_ruleException; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleException1843); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:804:1: ruleException returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'exception' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'cid' ( (lv_cid_4_0= RULE_INT ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* otherlv_7= 'message' ( (lv_message_8_0= RULE_STRING ) ) otherlv_9= '}' ) ;
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
        EObject lv_variables_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:807:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'exception' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'cid' ( (lv_cid_4_0= RULE_INT ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* otherlv_7= 'message' ( (lv_message_8_0= RULE_STRING ) ) otherlv_9= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:808:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'exception' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'cid' ( (lv_cid_4_0= RULE_INT ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* otherlv_7= 'message' ( (lv_message_8_0= RULE_STRING ) ) otherlv_9= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:808:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'exception' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'cid' ( (lv_cid_4_0= RULE_INT ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* otherlv_7= 'message' ( (lv_message_8_0= RULE_STRING ) ) otherlv_9= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:808:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'exception' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'cid' ( (lv_cid_4_0= RULE_INT ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* otherlv_7= 'message' ( (lv_message_8_0= RULE_STRING ) ) otherlv_9= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:808:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_DOC) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:809:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:809:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:810:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleException1885); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleException1903); 

                	newLeafNode(otherlv_1, grammarAccess.getExceptionAccess().getExceptionKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:830:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:831:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:831:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:832:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleException1920); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:848:2: (otherlv_3= 'cid' ( (lv_cid_4_0= RULE_INT ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:848:4: otherlv_3= 'cid' ( (lv_cid_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleException1938); 

                        	newLeafNode(otherlv_3, grammarAccess.getExceptionAccess().getCidKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:852:1: ( (lv_cid_4_0= RULE_INT ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:853:1: (lv_cid_4_0= RULE_INT )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:853:1: (lv_cid_4_0= RULE_INT )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:854:3: lv_cid_4_0= RULE_INT
                    {
                    lv_cid_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleException1955); 

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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleException1974); 

                	newLeafNode(otherlv_5, grammarAccess.getExceptionAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:874:1: ( (lv_variables_6_0= ruleVariable ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_DOC)||LA19_0==51) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:875:1: (lv_variables_6_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:875:1: (lv_variables_6_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:876:3: lv_variables_6_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExceptionAccess().getVariablesVariableParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleException1995);
            	    lv_variables_6_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExceptionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_6_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleException2008); 

                	newLeafNode(otherlv_7, grammarAccess.getExceptionAccess().getMessageKeyword_6());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:896:1: ( (lv_message_8_0= RULE_STRING ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:897:1: (lv_message_8_0= RULE_STRING )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:897:1: (lv_message_8_0= RULE_STRING )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:898:3: lv_message_8_0= RULE_STRING
            {
            lv_message_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleException2025); 

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

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleException2042); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:926:1: entryRuleValueObject returns [EObject current=null] : iv_ruleValueObject= ruleValueObject EOF ;
    public final EObject entryRuleValueObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueObject = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:927:2: (iv_ruleValueObject= ruleValueObject EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:928:2: iv_ruleValueObject= ruleValueObject EOF
            {
             newCompositeNode(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_ruleValueObject_in_entryRuleValueObject2078);
            iv_ruleValueObject=ruleValueObject();

            state._fsp--;

             current =iv_ruleValueObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueObject2088); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:935:1: ruleValueObject returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'value-object' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) ;
    public final EObject ruleValueObject() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_10=null;
        EObject lv_metaInfo_6_0 = null;

        EObject lv_variables_7_0 = null;

        EObject lv_constructors_8_0 = null;

        EObject lv_methods_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:938:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'value-object' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:939:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'value-object' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:939:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'value-object' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:939:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'value-object' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:939:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_DOC) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:940:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:940:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:941:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleValueObject2130); 

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

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleValueObject2148); 

                	newLeafNode(otherlv_1, grammarAccess.getValueObjectAccess().getValueObjectKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:961:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:962:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:962:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:963:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValueObject2165); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:979:2: (otherlv_3= 'base' ( ( ruleFQN ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:979:4: otherlv_3= 'base' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleValueObject2183); 

                        	newLeafNode(otherlv_3, grammarAccess.getValueObjectAccess().getBaseKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:983:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:984:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:984:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:985:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueObjectRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getValueObjectAccess().getBaseExternalTypeCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleValueObject2206);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleValueObject2220); 

                	newLeafNode(otherlv_5, grammarAccess.getValueObjectAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1002:1: ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1003:1: (lv_metaInfo_6_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1003:1: (lv_metaInfo_6_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1004:3: lv_metaInfo_6_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getValueObjectAccess().getMetaInfoTypeMetaInfoParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleValueObject2241);
            lv_metaInfo_6_0=ruleTypeMetaInfo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValueObjectRule());
            	        }
                   		set(
                   			current, 
                   			"metaInfo",
                    		lv_metaInfo_6_0, 
                    		"TypeMetaInfo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1020:2: ( (lv_variables_7_0= ruleVariable ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_DOC) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==RULE_ID||LA22_1==51) ) {
                        alt22=1;
                    }


                }
                else if ( (LA22_0==RULE_ID||LA22_0==51) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1021:1: (lv_variables_7_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1021:1: (lv_variables_7_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1022:3: lv_variables_7_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValueObjectAccess().getVariablesVariableParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleValueObject2262);
            	    lv_variables_7_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getValueObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_7_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1038:3: ( (lv_constructors_8_0= ruleConstructor ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_DOC) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==40) ) {
                        alt23=1;
                    }


                }
                else if ( (LA23_0==40) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1039:1: (lv_constructors_8_0= ruleConstructor )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1039:1: (lv_constructors_8_0= ruleConstructor )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1040:3: lv_constructors_8_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValueObjectAccess().getConstructorsConstructorParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleValueObject2284);
            	    lv_constructors_8_0=ruleConstructor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getValueObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constructors",
            	            		lv_constructors_8_0, 
            	            		"Constructor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1056:3: ( (lv_methods_9_0= ruleMethod ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_DOC||LA24_0==44) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1057:1: (lv_methods_9_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1057:1: (lv_methods_9_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1058:3: lv_methods_9_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValueObjectAccess().getMethodsMethodParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleValueObject2306);
            	    lv_methods_9_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getValueObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_9_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleValueObject2319); 

                	newLeafNode(otherlv_10, grammarAccess.getValueObjectAccess().getRightCurlyBracketKeyword_9());
                

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1086:1: entryRuleEntityId returns [EObject current=null] : iv_ruleEntityId= ruleEntityId EOF ;
    public final EObject entryRuleEntityId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityId = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1087:2: (iv_ruleEntityId= ruleEntityId EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1088:2: iv_ruleEntityId= ruleEntityId EOF
            {
             newCompositeNode(grammarAccess.getEntityIdRule()); 
            pushFollow(FOLLOW_ruleEntityId_in_entryRuleEntityId2355);
            iv_ruleEntityId=ruleEntityId();

            state._fsp--;

             current =iv_ruleEntityId; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityId2365); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1095:1: ruleEntityId returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity-id' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifies' ( ( ruleFQN ) ) (otherlv_5= 'base' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}' ) ;
    public final EObject ruleEntityId() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_12=null;
        EObject lv_metaInfo_8_0 = null;

        EObject lv_variables_9_0 = null;

        EObject lv_constructors_10_0 = null;

        EObject lv_methods_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1098:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity-id' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifies' ( ( ruleFQN ) ) (otherlv_5= 'base' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1099:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity-id' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifies' ( ( ruleFQN ) ) (otherlv_5= 'base' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1099:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity-id' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifies' ( ( ruleFQN ) ) (otherlv_5= 'base' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1099:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity-id' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifies' ( ( ruleFQN ) ) (otherlv_5= 'base' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1099:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_DOC) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1100:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1100:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1101:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleEntityId2407); 

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

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleEntityId2425); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityIdAccess().getEntityIdKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1121:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1122:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1122:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1123:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityId2442); 

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

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleEntityId2459); 

                	newLeafNode(otherlv_3, grammarAccess.getEntityIdAccess().getIdentifiesKeyword_3());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1143:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1144:1: ( ruleFQN )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1144:1: ( ruleFQN )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1145:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityIdRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEntityIdAccess().getEntityEntityCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleEntityId2482);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1158:2: (otherlv_5= 'base' ( ( ruleFQN ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1158:4: otherlv_5= 'base' ( ( ruleFQN ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleEntityId2495); 

                        	newLeafNode(otherlv_5, grammarAccess.getEntityIdAccess().getBaseKeyword_5_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1162:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1163:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1163:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1164:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityIdRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEntityIdAccess().getBaseExternalTypeCrossReference_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleEntityId2518);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleEntityId2532); 

                	newLeafNode(otherlv_7, grammarAccess.getEntityIdAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1181:1: ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1182:1: (lv_metaInfo_8_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1182:1: (lv_metaInfo_8_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1183:3: lv_metaInfo_8_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getEntityIdAccess().getMetaInfoTypeMetaInfoParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleEntityId2553);
            lv_metaInfo_8_0=ruleTypeMetaInfo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityIdRule());
            	        }
                   		set(
                   			current, 
                   			"metaInfo",
                    		lv_metaInfo_8_0, 
                    		"TypeMetaInfo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1199:2: ( (lv_variables_9_0= ruleVariable ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_DOC) ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==RULE_ID||LA27_1==51) ) {
                        alt27=1;
                    }


                }
                else if ( (LA27_0==RULE_ID||LA27_0==51) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1200:1: (lv_variables_9_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1200:1: (lv_variables_9_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1201:3: lv_variables_9_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityIdAccess().getVariablesVariableParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleEntityId2574);
            	    lv_variables_9_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityIdRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_9_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1217:3: ( (lv_constructors_10_0= ruleConstructor ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_DOC) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==40) ) {
                        alt28=1;
                    }


                }
                else if ( (LA28_0==40) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1218:1: (lv_constructors_10_0= ruleConstructor )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1218:1: (lv_constructors_10_0= ruleConstructor )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1219:3: lv_constructors_10_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityIdAccess().getConstructorsConstructorParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleEntityId2596);
            	    lv_constructors_10_0=ruleConstructor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityIdRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constructors",
            	            		lv_constructors_10_0, 
            	            		"Constructor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1235:3: ( (lv_methods_11_0= ruleMethod ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_DOC||LA29_0==44) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1236:1: (lv_methods_11_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1236:1: (lv_methods_11_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1237:3: lv_methods_11_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityIdAccess().getMethodsMethodParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleEntityId2618);
            	    lv_methods_11_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityIdRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_11_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleEntityId2631); 

                	newLeafNode(otherlv_12, grammarAccess.getEntityIdAccess().getRightCurlyBracketKeyword_11());
                

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1265:1: entryRuleAggregateId returns [EObject current=null] : iv_ruleAggregateId= ruleAggregateId EOF ;
    public final EObject entryRuleAggregateId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregateId = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1266:2: (iv_ruleAggregateId= ruleAggregateId EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1267:2: iv_ruleAggregateId= ruleAggregateId EOF
            {
             newCompositeNode(grammarAccess.getAggregateIdRule()); 
            pushFollow(FOLLOW_ruleAggregateId_in_entryRuleAggregateId2667);
            iv_ruleAggregateId=ruleAggregateId();

            state._fsp--;

             current =iv_ruleAggregateId; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAggregateId2677); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1274:1: ruleAggregateId returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate-id' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifies' ( ( ruleFQN ) ) (otherlv_5= 'base' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}' ) ;
    public final EObject ruleAggregateId() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_12=null;
        EObject lv_metaInfo_8_0 = null;

        EObject lv_variables_9_0 = null;

        EObject lv_constructors_10_0 = null;

        EObject lv_methods_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1277:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate-id' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifies' ( ( ruleFQN ) ) (otherlv_5= 'base' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1278:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate-id' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifies' ( ( ruleFQN ) ) (otherlv_5= 'base' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1278:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate-id' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifies' ( ( ruleFQN ) ) (otherlv_5= 'base' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1278:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate-id' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifies' ( ( ruleFQN ) ) (otherlv_5= 'base' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1278:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_DOC) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1279:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1279:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1280:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleAggregateId2719); 

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

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleAggregateId2737); 

                	newLeafNode(otherlv_1, grammarAccess.getAggregateIdAccess().getAggregateIdKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1300:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1301:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1301:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1302:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAggregateId2754); 

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

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleAggregateId2771); 

                	newLeafNode(otherlv_3, grammarAccess.getAggregateIdAccess().getIdentifiesKeyword_3());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1322:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1323:1: ( ruleFQN )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1323:1: ( ruleFQN )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1324:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAggregateIdRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAggregateIdAccess().getEntityAggregateCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleAggregateId2794);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1337:2: (otherlv_5= 'base' ( ( ruleFQN ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==25) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1337:4: otherlv_5= 'base' ( ( ruleFQN ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleAggregateId2807); 

                        	newLeafNode(otherlv_5, grammarAccess.getAggregateIdAccess().getBaseKeyword_5_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1341:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1342:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1342:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1343:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAggregateIdRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAggregateIdAccess().getBaseExternalTypeCrossReference_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleAggregateId2830);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleAggregateId2844); 

                	newLeafNode(otherlv_7, grammarAccess.getAggregateIdAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1360:1: ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1361:1: (lv_metaInfo_8_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1361:1: (lv_metaInfo_8_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1362:3: lv_metaInfo_8_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getAggregateIdAccess().getMetaInfoTypeMetaInfoParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleAggregateId2865);
            lv_metaInfo_8_0=ruleTypeMetaInfo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAggregateIdRule());
            	        }
                   		set(
                   			current, 
                   			"metaInfo",
                    		lv_metaInfo_8_0, 
                    		"TypeMetaInfo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1378:2: ( (lv_variables_9_0= ruleVariable ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_DOC) ) {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1==RULE_ID||LA32_1==51) ) {
                        alt32=1;
                    }


                }
                else if ( (LA32_0==RULE_ID||LA32_0==51) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1379:1: (lv_variables_9_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1379:1: (lv_variables_9_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1380:3: lv_variables_9_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateIdAccess().getVariablesVariableParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleAggregateId2886);
            	    lv_variables_9_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAggregateIdRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_9_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1396:3: ( (lv_constructors_10_0= ruleConstructor ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_DOC) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==40) ) {
                        alt33=1;
                    }


                }
                else if ( (LA33_0==40) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1397:1: (lv_constructors_10_0= ruleConstructor )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1397:1: (lv_constructors_10_0= ruleConstructor )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1398:3: lv_constructors_10_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateIdAccess().getConstructorsConstructorParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleAggregateId2908);
            	    lv_constructors_10_0=ruleConstructor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAggregateIdRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constructors",
            	            		lv_constructors_10_0, 
            	            		"Constructor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1414:3: ( (lv_methods_11_0= ruleMethod ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_DOC||LA34_0==44) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1415:1: (lv_methods_11_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1415:1: (lv_methods_11_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1416:3: lv_methods_11_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateIdAccess().getMethodsMethodParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleAggregateId2930);
            	    lv_methods_11_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAggregateIdRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_11_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleAggregateId2943); 

                	newLeafNode(otherlv_12, grammarAccess.getAggregateIdAccess().getRightCurlyBracketKeyword_11());
                

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1444:1: entryRuleEnumObject returns [EObject current=null] : iv_ruleEnumObject= ruleEnumObject EOF ;
    public final EObject entryRuleEnumObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumObject = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1445:2: (iv_ruleEnumObject= ruleEnumObject EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1446:2: iv_ruleEnumObject= ruleEnumObject EOF
            {
             newCompositeNode(grammarAccess.getEnumObjectRule()); 
            pushFollow(FOLLOW_ruleEnumObject_in_entryRuleEnumObject2979);
            iv_ruleEnumObject=ruleEnumObject();

            state._fsp--;

             current =iv_ruleEnumObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumObject2989); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1453:1: ruleEnumObject returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* otherlv_8= 'instances' otherlv_9= '{' ( (lv_instances_10_0= ruleEnumInstance ) )+ otherlv_11= '}' otherlv_12= '}' ) ;
    public final EObject ruleEnumObject() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_metaInfo_6_0 = null;

        EObject lv_variables_7_0 = null;

        EObject lv_instances_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1456:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* otherlv_8= 'instances' otherlv_9= '{' ( (lv_instances_10_0= ruleEnumInstance ) )+ otherlv_11= '}' otherlv_12= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1457:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* otherlv_8= 'instances' otherlv_9= '{' ( (lv_instances_10_0= ruleEnumInstance ) )+ otherlv_11= '}' otherlv_12= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1457:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* otherlv_8= 'instances' otherlv_9= '{' ( (lv_instances_10_0= ruleEnumInstance ) )+ otherlv_11= '}' otherlv_12= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1457:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* otherlv_8= 'instances' otherlv_9= '{' ( (lv_instances_10_0= ruleEnumInstance ) )+ otherlv_11= '}' otherlv_12= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1457:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_DOC) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1458:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1458:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1459:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleEnumObject3031); 

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

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleEnumObject3049); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumObjectAccess().getEnumKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1479:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1480:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1480:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1481:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumObject3066); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1497:2: (otherlv_3= 'base' ( ( ruleFQN ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==25) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1497:4: otherlv_3= 'base' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleEnumObject3084); 

                        	newLeafNode(otherlv_3, grammarAccess.getEnumObjectAccess().getBaseKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1501:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1502:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1502:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1503:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumObjectRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEnumObjectAccess().getBaseExternalTypeCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleEnumObject3107);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEnumObject3121); 

                	newLeafNode(otherlv_5, grammarAccess.getEnumObjectAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1520:1: ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1521:1: (lv_metaInfo_6_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1521:1: (lv_metaInfo_6_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1522:3: lv_metaInfo_6_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getEnumObjectAccess().getMetaInfoTypeMetaInfoParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleEnumObject3142);
            lv_metaInfo_6_0=ruleTypeMetaInfo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumObjectRule());
            	        }
                   		set(
                   			current, 
                   			"metaInfo",
                    		lv_metaInfo_6_0, 
                    		"TypeMetaInfo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1538:2: ( (lv_variables_7_0= ruleVariable ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_DOC)||LA37_0==51) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1539:1: (lv_variables_7_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1539:1: (lv_variables_7_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1540:3: lv_variables_7_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumObjectAccess().getVariablesVariableParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleEnumObject3163);
            	    lv_variables_7_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_7_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleEnumObject3176); 

                	newLeafNode(otherlv_8, grammarAccess.getEnumObjectAccess().getInstancesKeyword_7());
                
            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleEnumObject3188); 

                	newLeafNode(otherlv_9, grammarAccess.getEnumObjectAccess().getLeftCurlyBracketKeyword_8());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1564:1: ( (lv_instances_10_0= ruleEnumInstance ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_DOC)||LA38_0==31) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1565:1: (lv_instances_10_0= ruleEnumInstance )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1565:1: (lv_instances_10_0= ruleEnumInstance )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1566:3: lv_instances_10_0= ruleEnumInstance
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumObjectAccess().getInstancesEnumInstanceParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumInstance_in_ruleEnumObject3209);
            	    lv_instances_10_0=ruleEnumInstance();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instances",
            	            		lv_instances_10_0, 
            	            		"EnumInstance");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleEnumObject3222); 

                	newLeafNode(otherlv_11, grammarAccess.getEnumObjectAccess().getRightCurlyBracketKeyword_10());
                
            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleEnumObject3234); 

                	newLeafNode(otherlv_12, grammarAccess.getEnumObjectAccess().getRightCurlyBracketKeyword_11());
                

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1598:1: entryRuleEnumInstance returns [EObject current=null] : iv_ruleEnumInstance= ruleEnumInstance EOF ;
    public final EObject entryRuleEnumInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumInstance = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1599:2: (iv_ruleEnumInstance= ruleEnumInstance EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1600:2: iv_ruleEnumInstance= ruleEnumInstance EOF
            {
             newCompositeNode(grammarAccess.getEnumInstanceRule()); 
            pushFollow(FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance3270);
            iv_ruleEnumInstance=ruleEnumInstance();

            state._fsp--;

             current =iv_ruleEnumInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumInstance3280); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1607:1: ruleEnumInstance returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_deprecated_1_0= 'deprecated' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_params_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleLiteral ) ) )* otherlv_7= ')' )? ) ;
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
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1610:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_deprecated_1_0= 'deprecated' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_params_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleLiteral ) ) )* otherlv_7= ')' )? ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1611:1: ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_deprecated_1_0= 'deprecated' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_params_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleLiteral ) ) )* otherlv_7= ')' )? )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1611:1: ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_deprecated_1_0= 'deprecated' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_params_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleLiteral ) ) )* otherlv_7= ')' )? )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1611:2: ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_deprecated_1_0= 'deprecated' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_params_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleLiteral ) ) )* otherlv_7= ')' )?
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1611:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_DOC) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1612:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1612:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1613:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleEnumInstance3322); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1629:3: ( (lv_deprecated_1_0= 'deprecated' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==31) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1630:1: (lv_deprecated_1_0= 'deprecated' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1630:1: (lv_deprecated_1_0= 'deprecated' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1631:3: lv_deprecated_1_0= 'deprecated'
                    {
                    lv_deprecated_1_0=(Token)match(input,31,FOLLOW_31_in_ruleEnumInstance3346); 

                            newLeafNode(lv_deprecated_1_0, grammarAccess.getEnumInstanceAccess().getDeprecatedDeprecatedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumInstanceRule());
                    	        }
                           		setWithLastConsumed(current, "deprecated", lv_deprecated_1_0, "deprecated");
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1644:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1645:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1645:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1646:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance3377); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1662:2: (otherlv_3= '(' ( (lv_params_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleLiteral ) ) )* otherlv_7= ')' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==32) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1662:4: otherlv_3= '(' ( (lv_params_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleLiteral ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleEnumInstance3395); 

                        	newLeafNode(otherlv_3, grammarAccess.getEnumInstanceAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1666:1: ( (lv_params_4_0= ruleLiteral ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1667:1: (lv_params_4_0= ruleLiteral )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1667:1: (lv_params_4_0= ruleLiteral )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1668:3: lv_params_4_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumInstanceAccess().getParamsLiteralParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleEnumInstance3416);
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

                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1684:2: (otherlv_5= ',' ( (lv_params_6_0= ruleLiteral ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==33) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1684:4: otherlv_5= ',' ( (lv_params_6_0= ruleLiteral ) )
                    	    {
                    	    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleEnumInstance3429); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getEnumInstanceAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1688:1: ( (lv_params_6_0= ruleLiteral ) )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1689:1: (lv_params_6_0= ruleLiteral )
                    	    {
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1689:1: (lv_params_6_0= ruleLiteral )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1690:3: lv_params_6_0= ruleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEnumInstanceAccess().getParamsLiteralParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteral_in_ruleEnumInstance3450);
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
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleEnumInstance3464); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1718:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1719:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1720:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent3502);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent3512); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1727:1: ruleEvent returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* (otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_message_6_0=null;
        Token otherlv_7=null;
        EObject lv_variables_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1730:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* (otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1731:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* (otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1731:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* (otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1731:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* (otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) ) )? otherlv_7= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1731:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_DOC) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1732:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1732:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1733:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleEvent3554); 

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

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleEvent3572); 

                	newLeafNode(otherlv_1, grammarAccess.getEventAccess().getEventKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1753:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1754:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1754:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1755:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent3589); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleEvent3606); 

                	newLeafNode(otherlv_3, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1775:1: ( (lv_variables_4_0= ruleVariable ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_DOC)||LA44_0==51) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1776:1: (lv_variables_4_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1776:1: (lv_variables_4_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1777:3: lv_variables_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEventAccess().getVariablesVariableParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleEvent3627);
            	    lv_variables_4_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEventRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_4_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1793:3: (otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==22) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1793:5: otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleEvent3641); 

                        	newLeafNode(otherlv_5, grammarAccess.getEventAccess().getMessageKeyword_5_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1797:1: ( (lv_message_6_0= RULE_STRING ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1798:1: (lv_message_6_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1798:1: (lv_message_6_0= RULE_STRING )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1799:3: lv_message_6_0= RULE_STRING
                    {
                    lv_message_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEvent3658); 

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

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleEvent3677); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1827:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1828:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1829:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity3713);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity3723); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1836:1: ruleEntity returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( ( ruleFQN ) ) otherlv_5= 'root' ( ( ruleFQN ) ) otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* ( (lv_events_12_0= ruleEvent ) )* otherlv_13= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_13=null;
        EObject lv_metaInfo_8_0 = null;

        EObject lv_variables_9_0 = null;

        EObject lv_constructors_10_0 = null;

        EObject lv_methods_11_0 = null;

        EObject lv_events_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1839:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( ( ruleFQN ) ) otherlv_5= 'root' ( ( ruleFQN ) ) otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* ( (lv_events_12_0= ruleEvent ) )* otherlv_13= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1840:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( ( ruleFQN ) ) otherlv_5= 'root' ( ( ruleFQN ) ) otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* ( (lv_events_12_0= ruleEvent ) )* otherlv_13= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1840:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( ( ruleFQN ) ) otherlv_5= 'root' ( ( ruleFQN ) ) otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* ( (lv_events_12_0= ruleEvent ) )* otherlv_13= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1840:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( ( ruleFQN ) ) otherlv_5= 'root' ( ( ruleFQN ) ) otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* ( (lv_events_12_0= ruleEvent ) )* otherlv_13= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1840:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_DOC) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1841:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1841:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1842:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleEntity3765); 

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

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleEntity3783); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1862:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1863:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1863:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1864:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity3800); 

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

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleEntity3817); 

                	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getIdentifierKeyword_3());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1884:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1885:1: ( ruleFQN )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1885:1: ( ruleFQN )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1886:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getIdTypeEntityIdCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleEntity3840);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleEntity3852); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getRootKeyword_5());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1903:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1904:1: ( ruleFQN )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1904:1: ( ruleFQN )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1905:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getRootAggregateCrossReference_6_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleEntity3875);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleEntity3887); 

                	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_7());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1922:1: ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1923:1: (lv_metaInfo_8_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1923:1: (lv_metaInfo_8_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1924:3: lv_metaInfo_8_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getMetaInfoTypeMetaInfoParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleEntity3908);
            lv_metaInfo_8_0=ruleTypeMetaInfo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	        }
                   		set(
                   			current, 
                   			"metaInfo",
                    		lv_metaInfo_8_0, 
                    		"TypeMetaInfo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1940:2: ( (lv_variables_9_0= ruleVariable ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_DOC) ) {
                    int LA47_1 = input.LA(2);

                    if ( (LA47_1==RULE_ID||LA47_1==51) ) {
                        alt47=1;
                    }


                }
                else if ( (LA47_0==RULE_ID||LA47_0==51) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1941:1: (lv_variables_9_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1941:1: (lv_variables_9_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1942:3: lv_variables_9_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getVariablesVariableParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleEntity3929);
            	    lv_variables_9_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_9_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1958:3: ( (lv_constructors_10_0= ruleConstructor ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_DOC) ) {
                    int LA48_1 = input.LA(2);

                    if ( (LA48_1==40) ) {
                        alt48=1;
                    }


                }
                else if ( (LA48_0==40) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1959:1: (lv_constructors_10_0= ruleConstructor )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1959:1: (lv_constructors_10_0= ruleConstructor )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1960:3: lv_constructors_10_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getConstructorsConstructorParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleEntity3951);
            	    lv_constructors_10_0=ruleConstructor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constructors",
            	            		lv_constructors_10_0, 
            	            		"Constructor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1976:3: ( (lv_methods_11_0= ruleMethod ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_DOC) ) {
                    int LA49_1 = input.LA(2);

                    if ( (LA49_1==44) ) {
                        alt49=1;
                    }


                }
                else if ( (LA49_0==44) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1977:1: (lv_methods_11_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1977:1: (lv_methods_11_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1978:3: lv_methods_11_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getMethodsMethodParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleEntity3973);
            	    lv_methods_11_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_11_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1994:3: ( (lv_events_12_0= ruleEvent ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_DOC||LA50_0==35) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1995:1: (lv_events_12_0= ruleEvent )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1995:1: (lv_events_12_0= ruleEvent )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1996:3: lv_events_12_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getEventsEventParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleEntity3995);
            	    lv_events_12_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_12_0, 
            	            		"Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleEntity4008); 

                	newLeafNode(otherlv_13, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_13());
                

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2024:1: entryRuleAggregate returns [EObject current=null] : iv_ruleAggregate= ruleAggregate EOF ;
    public final EObject entryRuleAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregate = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2025:2: (iv_ruleAggregate= ruleAggregate EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2026:2: iv_ruleAggregate= ruleAggregate EOF
            {
             newCompositeNode(grammarAccess.getAggregateRule()); 
            pushFollow(FOLLOW_ruleAggregate_in_entryRuleAggregate4044);
            iv_ruleAggregate=ruleAggregate();

            state._fsp--;

             current =iv_ruleAggregate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAggregate4054); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2033:1: ruleAggregate returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* ( (lv_events_10_0= ruleEvent ) )* otherlv_11= '}' ) ;
    public final EObject ruleAggregate() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_11=null;
        EObject lv_metaInfo_6_0 = null;

        EObject lv_variables_7_0 = null;

        EObject lv_constructors_8_0 = null;

        EObject lv_methods_9_0 = null;

        EObject lv_events_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2036:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* ( (lv_events_10_0= ruleEvent ) )* otherlv_11= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2037:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* ( (lv_events_10_0= ruleEvent ) )* otherlv_11= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2037:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* ( (lv_events_10_0= ruleEvent ) )* otherlv_11= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2037:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* ( (lv_events_10_0= ruleEvent ) )* otherlv_11= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2037:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_DOC) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2038:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2038:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2039:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleAggregate4096); 

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

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleAggregate4114); 

                	newLeafNode(otherlv_1, grammarAccess.getAggregateAccess().getAggregateKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2059:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2060:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2060:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2061:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAggregate4131); 

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

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleAggregate4148); 

                	newLeafNode(otherlv_3, grammarAccess.getAggregateAccess().getIdentifierKeyword_3());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2081:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2082:1: ( ruleFQN )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2082:1: ( ruleFQN )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2083:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAggregateRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAggregateAccess().getIdTypeAggregateIdCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleAggregate4171);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleAggregate4183); 

                	newLeafNode(otherlv_5, grammarAccess.getAggregateAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2100:1: ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2101:1: (lv_metaInfo_6_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2101:1: (lv_metaInfo_6_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2102:3: lv_metaInfo_6_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getAggregateAccess().getMetaInfoTypeMetaInfoParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleAggregate4204);
            lv_metaInfo_6_0=ruleTypeMetaInfo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAggregateRule());
            	        }
                   		set(
                   			current, 
                   			"metaInfo",
                    		lv_metaInfo_6_0, 
                    		"TypeMetaInfo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2118:2: ( (lv_variables_7_0= ruleVariable ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_DOC) ) {
                    int LA52_1 = input.LA(2);

                    if ( (LA52_1==RULE_ID||LA52_1==51) ) {
                        alt52=1;
                    }


                }
                else if ( (LA52_0==RULE_ID||LA52_0==51) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2119:1: (lv_variables_7_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2119:1: (lv_variables_7_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2120:3: lv_variables_7_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateAccess().getVariablesVariableParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleAggregate4225);
            	    lv_variables_7_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAggregateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_7_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2136:3: ( (lv_constructors_8_0= ruleConstructor ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_DOC) ) {
                    int LA53_1 = input.LA(2);

                    if ( (LA53_1==40) ) {
                        alt53=1;
                    }


                }
                else if ( (LA53_0==40) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2137:1: (lv_constructors_8_0= ruleConstructor )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2137:1: (lv_constructors_8_0= ruleConstructor )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2138:3: lv_constructors_8_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateAccess().getConstructorsConstructorParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleAggregate4247);
            	    lv_constructors_8_0=ruleConstructor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAggregateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constructors",
            	            		lv_constructors_8_0, 
            	            		"Constructor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2154:3: ( (lv_methods_9_0= ruleMethod ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_DOC) ) {
                    int LA54_1 = input.LA(2);

                    if ( (LA54_1==44) ) {
                        alt54=1;
                    }


                }
                else if ( (LA54_0==44) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2155:1: (lv_methods_9_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2155:1: (lv_methods_9_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2156:3: lv_methods_9_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateAccess().getMethodsMethodParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleAggregate4269);
            	    lv_methods_9_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAggregateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_9_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2172:3: ( (lv_events_10_0= ruleEvent ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_DOC||LA55_0==35) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2173:1: (lv_events_10_0= ruleEvent )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2173:1: (lv_events_10_0= ruleEvent )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2174:3: lv_events_10_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateAccess().getEventsEventParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleAggregate4291);
            	    lv_events_10_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAggregateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_10_0, 
            	            		"Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleAggregate4304); 

                	newLeafNode(otherlv_11, grammarAccess.getAggregateAccess().getRightCurlyBracketKeyword_11());
                

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2204:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2205:2: (iv_ruleConstructor= ruleConstructor EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2206:2: iv_ruleConstructor= ruleConstructor EOF
            {
             newCompositeNode(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_ruleConstructor_in_entryRuleConstructor4342);
            iv_ruleConstructor=ruleConstructor();

            state._fsp--;

             current =iv_ruleConstructor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor4352); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2213:1: ruleConstructor returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constructor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'constraints' ( (lv_constraintCalls_4_0= ruleConstraintCall ) ) (otherlv_5= ',' ( (lv_constraintCalls_6_0= ruleConstraintCall ) ) )* )? (otherlv_7= 'fires' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* )? otherlv_11= '{' ( (lv_variables_12_0= ruleVariable ) )* ( ( ruleFQN ) )? ( (lv_services_14_0= ruleService ) )* ( (lv_events_15_0= ruleEvent ) )* otherlv_16= '}' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_16=null;
        EObject lv_constraintCalls_4_0 = null;

        EObject lv_constraintCalls_6_0 = null;

        EObject lv_variables_12_0 = null;

        EObject lv_services_14_0 = null;

        EObject lv_events_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2216:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constructor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'constraints' ( (lv_constraintCalls_4_0= ruleConstraintCall ) ) (otherlv_5= ',' ( (lv_constraintCalls_6_0= ruleConstraintCall ) ) )* )? (otherlv_7= 'fires' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* )? otherlv_11= '{' ( (lv_variables_12_0= ruleVariable ) )* ( ( ruleFQN ) )? ( (lv_services_14_0= ruleService ) )* ( (lv_events_15_0= ruleEvent ) )* otherlv_16= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2217:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constructor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'constraints' ( (lv_constraintCalls_4_0= ruleConstraintCall ) ) (otherlv_5= ',' ( (lv_constraintCalls_6_0= ruleConstraintCall ) ) )* )? (otherlv_7= 'fires' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* )? otherlv_11= '{' ( (lv_variables_12_0= ruleVariable ) )* ( ( ruleFQN ) )? ( (lv_services_14_0= ruleService ) )* ( (lv_events_15_0= ruleEvent ) )* otherlv_16= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2217:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constructor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'constraints' ( (lv_constraintCalls_4_0= ruleConstraintCall ) ) (otherlv_5= ',' ( (lv_constraintCalls_6_0= ruleConstraintCall ) ) )* )? (otherlv_7= 'fires' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* )? otherlv_11= '{' ( (lv_variables_12_0= ruleVariable ) )* ( ( ruleFQN ) )? ( (lv_services_14_0= ruleService ) )* ( (lv_events_15_0= ruleEvent ) )* otherlv_16= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2217:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constructor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'constraints' ( (lv_constraintCalls_4_0= ruleConstraintCall ) ) (otherlv_5= ',' ( (lv_constraintCalls_6_0= ruleConstraintCall ) ) )* )? (otherlv_7= 'fires' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* )? otherlv_11= '{' ( (lv_variables_12_0= ruleVariable ) )* ( ( ruleFQN ) )? ( (lv_services_14_0= ruleService ) )* ( (lv_events_15_0= ruleEvent ) )* otherlv_16= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2217:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_DOC) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2218:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2218:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2219:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleConstructor4394); 

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

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleConstructor4412); 

                	newLeafNode(otherlv_1, grammarAccess.getConstructorAccess().getConstructorKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2239:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2240:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2240:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2241:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor4429); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2257:2: (otherlv_3= 'constraints' ( (lv_constraintCalls_4_0= ruleConstraintCall ) ) (otherlv_5= ',' ( (lv_constraintCalls_6_0= ruleConstraintCall ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==41) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2257:4: otherlv_3= 'constraints' ( (lv_constraintCalls_4_0= ruleConstraintCall ) ) (otherlv_5= ',' ( (lv_constraintCalls_6_0= ruleConstraintCall ) ) )*
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleConstructor4447); 

                        	newLeafNode(otherlv_3, grammarAccess.getConstructorAccess().getConstraintsKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2261:1: ( (lv_constraintCalls_4_0= ruleConstraintCall ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2262:1: (lv_constraintCalls_4_0= ruleConstraintCall )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2262:1: (lv_constraintCalls_4_0= ruleConstraintCall )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2263:3: lv_constraintCalls_4_0= ruleConstraintCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstructorAccess().getConstraintCallsConstraintCallParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstraintCall_in_ruleConstructor4468);
                    lv_constraintCalls_4_0=ruleConstraintCall();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
                    	        }
                           		add(
                           			current, 
                           			"constraintCalls",
                            		lv_constraintCalls_4_0, 
                            		"ConstraintCall");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2279:2: (otherlv_5= ',' ( (lv_constraintCalls_6_0= ruleConstraintCall ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==33) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2279:4: otherlv_5= ',' ( (lv_constraintCalls_6_0= ruleConstraintCall ) )
                    	    {
                    	    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleConstructor4481); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getConstructorAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2283:1: ( (lv_constraintCalls_6_0= ruleConstraintCall ) )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2284:1: (lv_constraintCalls_6_0= ruleConstraintCall )
                    	    {
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2284:1: (lv_constraintCalls_6_0= ruleConstraintCall )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2285:3: lv_constraintCalls_6_0= ruleConstraintCall
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstructorAccess().getConstraintCallsConstraintCallParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstraintCall_in_ruleConstructor4502);
                    	    lv_constraintCalls_6_0=ruleConstraintCall();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constraintCalls",
                    	            		lv_constraintCalls_6_0, 
                    	            		"ConstraintCall");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2301:6: (otherlv_7= 'fires' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==42) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2301:8: otherlv_7= 'fires' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_7=(Token)match(input,42,FOLLOW_42_in_ruleConstructor4519); 

                        	newLeafNode(otherlv_7, grammarAccess.getConstructorAccess().getFiresKeyword_4_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2305:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2306:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2306:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2307:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstructorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getConstructorAccess().getFiredEventsEventCrossReference_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleConstructor4542);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2320:2: (otherlv_9= ',' ( ( ruleFQN ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==33) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2320:4: otherlv_9= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_9=(Token)match(input,33,FOLLOW_33_in_ruleConstructor4555); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getConstructorAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2324:1: ( ( ruleFQN ) )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2325:1: ( ruleFQN )
                    	    {
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2325:1: ( ruleFQN )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2326:3: ruleFQN
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getConstructorRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstructorAccess().getFiredEventsEventCrossReference_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFQN_in_ruleConstructor4578);
                    	    ruleFQN();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleConstructor4594); 

                	newLeafNode(otherlv_11, grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2343:1: ( (lv_variables_12_0= ruleVariable ) )*
            loop61:
            do {
                int alt61=2;
                alt61 = dfa61.predict(input);
                switch (alt61) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2344:1: (lv_variables_12_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2344:1: (lv_variables_12_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2345:3: lv_variables_12_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstructorAccess().getVariablesVariableParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleConstructor4615);
            	    lv_variables_12_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_12_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2361:3: ( ( ruleFQN ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2362:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2362:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2363:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstructorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getConstructorAccess().getServiceServiceCrossReference_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleConstructor4639);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2376:3: ( (lv_services_14_0= ruleService ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_DOC) ) {
                    int LA63_1 = input.LA(2);

                    if ( (LA63_1==54) ) {
                        alt63=1;
                    }


                }
                else if ( (LA63_0==54) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2377:1: (lv_services_14_0= ruleService )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2377:1: (lv_services_14_0= ruleService )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2378:3: lv_services_14_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstructorAccess().getServicesServiceParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleService_in_ruleConstructor4661);
            	    lv_services_14_0=ruleService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"services",
            	            		lv_services_14_0, 
            	            		"Service");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2394:3: ( (lv_events_15_0= ruleEvent ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_DOC||LA64_0==35) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2395:1: (lv_events_15_0= ruleEvent )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2395:1: (lv_events_15_0= ruleEvent )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2396:3: lv_events_15_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstructorAccess().getEventsEventParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleConstructor4683);
            	    lv_events_15_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_15_0, 
            	            		"Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            otherlv_16=(Token)match(input,15,FOLLOW_15_in_ruleConstructor4696); 

                	newLeafNode(otherlv_16, grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_10());
                

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2424:1: entryRuleReturnType returns [EObject current=null] : iv_ruleReturnType= ruleReturnType EOF ;
    public final EObject entryRuleReturnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnType = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2425:2: (iv_ruleReturnType= ruleReturnType EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2426:2: iv_ruleReturnType= ruleReturnType EOF
            {
             newCompositeNode(grammarAccess.getReturnTypeRule()); 
            pushFollow(FOLLOW_ruleReturnType_in_entryRuleReturnType4732);
            iv_ruleReturnType=ruleReturnType();

            state._fsp--;

             current =iv_ruleReturnType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnType4742); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2433:1: ruleReturnType returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'returns' ( ( ruleFQN ) ) ) ;
    public final EObject ruleReturnType() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2436:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'returns' ( ( ruleFQN ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2437:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'returns' ( ( ruleFQN ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2437:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'returns' ( ( ruleFQN ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2437:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'returns' ( ( ruleFQN ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2437:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_DOC) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2438:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2438:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2439:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleReturnType4784); 

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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleReturnType4802); 

                	newLeafNode(otherlv_1, grammarAccess.getReturnTypeAccess().getReturnsKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2459:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2460:1: ( ruleFQN )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2460:1: ( ruleFQN )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2461:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReturnTypeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getReturnTypeAccess().getTypeTypeCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleReturnType4825);
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2482:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2483:2: (iv_ruleMethod= ruleMethod EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2484:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod4861);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod4871); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2491:1: ruleMethod returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'ref' ( ( ruleFQN ) ) )? (otherlv_5= 'constraints' ( (lv_constraintCalls_6_0= ruleConstraintCall ) ) (otherlv_7= ',' ( (lv_constraintCalls_8_0= ruleConstraintCall ) ) )* )? (otherlv_9= 'fires' ( ( ruleFQN ) ) (otherlv_11= ',' ( ( ruleFQN ) ) )* )? otherlv_13= '{' ( (lv_variables_14_0= ruleVariable ) )* ( ( ruleFQN ) )? ( (lv_returnType_16_0= ruleReturnType ) )? ( (lv_services_17_0= ruleService ) )* ( (lv_events_18_0= ruleEvent ) )* otherlv_19= '}' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_19=null;
        EObject lv_constraintCalls_6_0 = null;

        EObject lv_constraintCalls_8_0 = null;

        EObject lv_variables_14_0 = null;

        EObject lv_returnType_16_0 = null;

        EObject lv_services_17_0 = null;

        EObject lv_events_18_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2494:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'ref' ( ( ruleFQN ) ) )? (otherlv_5= 'constraints' ( (lv_constraintCalls_6_0= ruleConstraintCall ) ) (otherlv_7= ',' ( (lv_constraintCalls_8_0= ruleConstraintCall ) ) )* )? (otherlv_9= 'fires' ( ( ruleFQN ) ) (otherlv_11= ',' ( ( ruleFQN ) ) )* )? otherlv_13= '{' ( (lv_variables_14_0= ruleVariable ) )* ( ( ruleFQN ) )? ( (lv_returnType_16_0= ruleReturnType ) )? ( (lv_services_17_0= ruleService ) )* ( (lv_events_18_0= ruleEvent ) )* otherlv_19= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2495:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'ref' ( ( ruleFQN ) ) )? (otherlv_5= 'constraints' ( (lv_constraintCalls_6_0= ruleConstraintCall ) ) (otherlv_7= ',' ( (lv_constraintCalls_8_0= ruleConstraintCall ) ) )* )? (otherlv_9= 'fires' ( ( ruleFQN ) ) (otherlv_11= ',' ( ( ruleFQN ) ) )* )? otherlv_13= '{' ( (lv_variables_14_0= ruleVariable ) )* ( ( ruleFQN ) )? ( (lv_returnType_16_0= ruleReturnType ) )? ( (lv_services_17_0= ruleService ) )* ( (lv_events_18_0= ruleEvent ) )* otherlv_19= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2495:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'ref' ( ( ruleFQN ) ) )? (otherlv_5= 'constraints' ( (lv_constraintCalls_6_0= ruleConstraintCall ) ) (otherlv_7= ',' ( (lv_constraintCalls_8_0= ruleConstraintCall ) ) )* )? (otherlv_9= 'fires' ( ( ruleFQN ) ) (otherlv_11= ',' ( ( ruleFQN ) ) )* )? otherlv_13= '{' ( (lv_variables_14_0= ruleVariable ) )* ( ( ruleFQN ) )? ( (lv_returnType_16_0= ruleReturnType ) )? ( (lv_services_17_0= ruleService ) )* ( (lv_events_18_0= ruleEvent ) )* otherlv_19= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2495:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'ref' ( ( ruleFQN ) ) )? (otherlv_5= 'constraints' ( (lv_constraintCalls_6_0= ruleConstraintCall ) ) (otherlv_7= ',' ( (lv_constraintCalls_8_0= ruleConstraintCall ) ) )* )? (otherlv_9= 'fires' ( ( ruleFQN ) ) (otherlv_11= ',' ( ( ruleFQN ) ) )* )? otherlv_13= '{' ( (lv_variables_14_0= ruleVariable ) )* ( ( ruleFQN ) )? ( (lv_returnType_16_0= ruleReturnType ) )? ( (lv_services_17_0= ruleService ) )* ( (lv_events_18_0= ruleEvent ) )* otherlv_19= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2495:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_DOC) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2496:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2496:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2497:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleMethod4913); 

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

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleMethod4931); 

                	newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getMethodKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2517:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2518:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2518:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2519:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod4948); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2535:2: (otherlv_3= 'ref' ( ( ruleFQN ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==45) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2535:4: otherlv_3= 'ref' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleMethod4966); 

                        	newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getRefKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2539:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2540:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2540:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2541:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getRefMethodMethodCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleMethod4989);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2554:4: (otherlv_5= 'constraints' ( (lv_constraintCalls_6_0= ruleConstraintCall ) ) (otherlv_7= ',' ( (lv_constraintCalls_8_0= ruleConstraintCall ) ) )* )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==41) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2554:6: otherlv_5= 'constraints' ( (lv_constraintCalls_6_0= ruleConstraintCall ) ) (otherlv_7= ',' ( (lv_constraintCalls_8_0= ruleConstraintCall ) ) )*
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleMethod5004); 

                        	newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getConstraintsKeyword_4_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2558:1: ( (lv_constraintCalls_6_0= ruleConstraintCall ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2559:1: (lv_constraintCalls_6_0= ruleConstraintCall )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2559:1: (lv_constraintCalls_6_0= ruleConstraintCall )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2560:3: lv_constraintCalls_6_0= ruleConstraintCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getConstraintCallsConstraintCallParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstraintCall_in_ruleMethod5025);
                    lv_constraintCalls_6_0=ruleConstraintCall();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	        }
                           		add(
                           			current, 
                           			"constraintCalls",
                            		lv_constraintCalls_6_0, 
                            		"ConstraintCall");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2576:2: (otherlv_7= ',' ( (lv_constraintCalls_8_0= ruleConstraintCall ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==33) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2576:4: otherlv_7= ',' ( (lv_constraintCalls_8_0= ruleConstraintCall ) )
                    	    {
                    	    otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleMethod5038); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2580:1: ( (lv_constraintCalls_8_0= ruleConstraintCall ) )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2581:1: (lv_constraintCalls_8_0= ruleConstraintCall )
                    	    {
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2581:1: (lv_constraintCalls_8_0= ruleConstraintCall )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2582:3: lv_constraintCalls_8_0= ruleConstraintCall
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMethodAccess().getConstraintCallsConstraintCallParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstraintCall_in_ruleMethod5059);
                    	    lv_constraintCalls_8_0=ruleConstraintCall();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constraintCalls",
                    	            		lv_constraintCalls_8_0, 
                    	            		"ConstraintCall");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2598:6: (otherlv_9= 'fires' ( ( ruleFQN ) ) (otherlv_11= ',' ( ( ruleFQN ) ) )* )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==42) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2598:8: otherlv_9= 'fires' ( ( ruleFQN ) ) (otherlv_11= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_9=(Token)match(input,42,FOLLOW_42_in_ruleMethod5076); 

                        	newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getFiresKeyword_5_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2602:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2603:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2603:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2604:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getFiredEventsEventCrossReference_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleMethod5099);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2617:2: (otherlv_11= ',' ( ( ruleFQN ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==33) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2617:4: otherlv_11= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_11=(Token)match(input,33,FOLLOW_33_in_ruleMethod5112); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getMethodAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2621:1: ( ( ruleFQN ) )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2622:1: ( ruleFQN )
                    	    {
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2622:1: ( ruleFQN )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2623:3: ruleFQN
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMethodRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getMethodAccess().getFiredEventsEventCrossReference_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFQN_in_ruleMethod5135);
                    	    ruleFQN();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleMethod5151); 

                	newLeafNode(otherlv_13, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2640:1: ( (lv_variables_14_0= ruleVariable ) )*
            loop72:
            do {
                int alt72=2;
                alt72 = dfa72.predict(input);
                switch (alt72) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2641:1: (lv_variables_14_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2641:1: (lv_variables_14_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2642:3: lv_variables_14_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getVariablesVariableParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleMethod5172);
            	    lv_variables_14_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_14_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2658:3: ( ( ruleFQN ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ID) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2659:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2659:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2660:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getServiceServiceCrossReference_8_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleMethod5196);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2673:3: ( (lv_returnType_16_0= ruleReturnType ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_DOC) ) {
                int LA74_1 = input.LA(2);

                if ( (LA74_1==43) ) {
                    alt74=1;
                }
            }
            else if ( (LA74_0==43) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2674:1: (lv_returnType_16_0= ruleReturnType )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2674:1: (lv_returnType_16_0= ruleReturnType )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2675:3: lv_returnType_16_0= ruleReturnType
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getReturnTypeReturnTypeParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleReturnType_in_ruleMethod5218);
                    lv_returnType_16_0=ruleReturnType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	        }
                           		set(
                           			current, 
                           			"returnType",
                            		lv_returnType_16_0, 
                            		"ReturnType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2691:3: ( (lv_services_17_0= ruleService ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==RULE_DOC) ) {
                    int LA75_1 = input.LA(2);

                    if ( (LA75_1==54) ) {
                        alt75=1;
                    }


                }
                else if ( (LA75_0==54) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2692:1: (lv_services_17_0= ruleService )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2692:1: (lv_services_17_0= ruleService )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2693:3: lv_services_17_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getServicesServiceParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleService_in_ruleMethod5240);
            	    lv_services_17_0=ruleService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"services",
            	            		lv_services_17_0, 
            	            		"Service");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2709:3: ( (lv_events_18_0= ruleEvent ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==RULE_DOC||LA76_0==35) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2710:1: (lv_events_18_0= ruleEvent )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2710:1: (lv_events_18_0= ruleEvent )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2711:3: lv_events_18_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getEventsEventParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleMethod5262);
            	    lv_events_18_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_18_0, 
            	            		"Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleMethod5275); 

                	newLeafNode(otherlv_19, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_12());
                

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2739:1: entryRuleTypeMetaInfo returns [EObject current=null] : iv_ruleTypeMetaInfo= ruleTypeMetaInfo EOF ;
    public final EObject entryRuleTypeMetaInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeMetaInfo = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2740:2: (iv_ruleTypeMetaInfo= ruleTypeMetaInfo EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2741:2: iv_ruleTypeMetaInfo= ruleTypeMetaInfo EOF
            {
             newCompositeNode(grammarAccess.getTypeMetaInfoRule()); 
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_entryRuleTypeMetaInfo5311);
            iv_ruleTypeMetaInfo=ruleTypeMetaInfo();

            state._fsp--;

             current =iv_ruleTypeMetaInfo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeMetaInfo5321); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2748:1: ruleTypeMetaInfo returns [EObject current=null] : ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )* )? ) ;
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
        Token lv_examples_10_0=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2751:28: ( ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )* )? ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2752:1: ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )* )? )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2752:1: ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )* )? )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2752:2: () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )* )?
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2752:2: ()
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2753:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTypeMetaInfoAccess().getTypeMetaInfoAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2758:2: (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==46) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2758:4: otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleTypeMetaInfo5368); 

                        	newLeafNode(otherlv_1, grammarAccess.getTypeMetaInfoAccess().getSlabelKeyword_1_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2762:1: ( (lv_slabel_2_0= RULE_STRING ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2763:1: (lv_slabel_2_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2763:1: (lv_slabel_2_0= RULE_STRING )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2764:3: lv_slabel_2_0= RULE_STRING
                    {
                    lv_slabel_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo5385); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2780:4: (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==47) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2780:6: otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleTypeMetaInfo5405); 

                        	newLeafNode(otherlv_3, grammarAccess.getTypeMetaInfoAccess().getLabelKeyword_2_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2784:1: ( (lv_label_4_0= RULE_STRING ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2785:1: (lv_label_4_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2785:1: (lv_label_4_0= RULE_STRING )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2786:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo5422); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2802:4: (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==48) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2802:6: otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleTypeMetaInfo5442); 

                        	newLeafNode(otherlv_5, grammarAccess.getTypeMetaInfoAccess().getTooltipKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2806:1: ( (lv_tooltip_6_0= RULE_STRING ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2807:1: (lv_tooltip_6_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2807:1: (lv_tooltip_6_0= RULE_STRING )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2808:3: lv_tooltip_6_0= RULE_STRING
                    {
                    lv_tooltip_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo5459); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2824:4: (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==49) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2824:6: otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,49,FOLLOW_49_in_ruleTypeMetaInfo5479); 

                        	newLeafNode(otherlv_7, grammarAccess.getTypeMetaInfoAccess().getPromptKeyword_4_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2828:1: ( (lv_prompt_8_0= RULE_STRING ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2829:1: (lv_prompt_8_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2829:1: (lv_prompt_8_0= RULE_STRING )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2830:3: lv_prompt_8_0= RULE_STRING
                    {
                    lv_prompt_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo5496); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2846:4: (otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )* )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==50) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2846:6: otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )*
                    {
                    otherlv_9=(Token)match(input,50,FOLLOW_50_in_ruleTypeMetaInfo5516); 

                        	newLeafNode(otherlv_9, grammarAccess.getTypeMetaInfoAccess().getExamplesKeyword_5_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2850:1: ( (lv_examples_10_0= RULE_STRING ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==RULE_STRING) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2851:1: (lv_examples_10_0= RULE_STRING )
                    	    {
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2851:1: (lv_examples_10_0= RULE_STRING )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2852:3: lv_examples_10_0= RULE_STRING
                    	    {
                    	    lv_examples_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo5533); 

                    	    			newLeafNode(lv_examples_10_0, grammarAccess.getTypeMetaInfoAccess().getExamplesSTRINGTerminalRuleCall_5_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTypeMetaInfoRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"examples",
                    	            		lv_examples_10_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
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


    // $ANTLR start "entryRuleVariable"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2876:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2877:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2878:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable5577);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable5587); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2885:1: ruleVariable returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( ( ruleFQN ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token lv_nullable_1_0=null;
        Token lv_multiplicity_3_0=null;
        Token lv_name_4_0=null;
        EObject lv_invariants_5_0 = null;

        EObject lv_overridden_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2888:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( ( ruleFQN ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2889:1: ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( ( ruleFQN ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2889:1: ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( ( ruleFQN ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2889:2: ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( ( ruleFQN ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )?
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2889:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_DOC) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2890:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2890:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2891:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleVariable5629); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getVariableAccess().getDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableRule());
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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2907:3: ( (lv_nullable_1_0= 'nullable' ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==51) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2908:1: (lv_nullable_1_0= 'nullable' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2908:1: (lv_nullable_1_0= 'nullable' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2909:3: lv_nullable_1_0= 'nullable'
                    {
                    lv_nullable_1_0=(Token)match(input,51,FOLLOW_51_in_ruleVariable5653); 

                            newLeafNode(lv_nullable_1_0, grammarAccess.getVariableAccess().getNullableNullableKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableRule());
                    	        }
                           		setWithLastConsumed(current, "nullable", lv_nullable_1_0, "nullable");
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2922:3: ( ( ruleFQN ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2923:1: ( ruleFQN )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2923:1: ( ruleFQN )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2924:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleVariable5690);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2937:2: ( (lv_multiplicity_3_0= '*' ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==52) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2938:1: (lv_multiplicity_3_0= '*' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2938:1: (lv_multiplicity_3_0= '*' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2939:3: lv_multiplicity_3_0= '*'
                    {
                    lv_multiplicity_3_0=(Token)match(input,52,FOLLOW_52_in_ruleVariable5708); 

                            newLeafNode(lv_multiplicity_3_0, grammarAccess.getVariableAccess().getMultiplicityAsteriskKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableRule());
                    	        }
                           		setWithLastConsumed(current, "multiplicity", lv_multiplicity_3_0, "*");
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2952:3: ( (lv_name_4_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2953:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2953:1: (lv_name_4_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2954:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable5739); 

            			newLeafNode(lv_name_4_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2970:2: ( (lv_invariants_5_0= ruleInvariants ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==53) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2971:1: (lv_invariants_5_0= ruleInvariants )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2971:1: (lv_invariants_5_0= ruleInvariants )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2972:3: lv_invariants_5_0= ruleInvariants
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getInvariantsInvariantsParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInvariants_in_ruleVariable5765);
                    lv_invariants_5_0=ruleInvariants();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableRule());
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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2988:3: ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==14) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2989:1: (lv_overridden_6_0= ruleOverriddenTypeMetaInfo )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2989:1: (lv_overridden_6_0= ruleOverriddenTypeMetaInfo )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2990:3: lv_overridden_6_0= ruleOverriddenTypeMetaInfo
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getOverriddenOverriddenTypeMetaInfoParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOverriddenTypeMetaInfo_in_ruleVariable5787);
                    lv_overridden_6_0=ruleOverriddenTypeMetaInfo();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableRule());
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleInvariants"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3014:1: entryRuleInvariants returns [EObject current=null] : iv_ruleInvariants= ruleInvariants EOF ;
    public final EObject entryRuleInvariants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariants = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3015:2: (iv_ruleInvariants= ruleInvariants EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3016:2: iv_ruleInvariants= ruleInvariants EOF
            {
             newCompositeNode(grammarAccess.getInvariantsRule()); 
            pushFollow(FOLLOW_ruleInvariants_in_entryRuleInvariants5824);
            iv_ruleInvariants=ruleInvariants();

            state._fsp--;

             current =iv_ruleInvariants; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvariants5834); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3023:1: ruleInvariants returns [EObject current=null] : (otherlv_0= 'invariants' ( (lv_calls_1_0= ruleConstraintCall ) ) (otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) ) )* ) ;
    public final EObject ruleInvariants() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_calls_1_0 = null;

        EObject lv_calls_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3026:28: ( (otherlv_0= 'invariants' ( (lv_calls_1_0= ruleConstraintCall ) ) (otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) ) )* ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3027:1: (otherlv_0= 'invariants' ( (lv_calls_1_0= ruleConstraintCall ) ) (otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) ) )* )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3027:1: (otherlv_0= 'invariants' ( (lv_calls_1_0= ruleConstraintCall ) ) (otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) ) )* )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3027:3: otherlv_0= 'invariants' ( (lv_calls_1_0= ruleConstraintCall ) ) (otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) ) )*
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleInvariants5871); 

                	newLeafNode(otherlv_0, grammarAccess.getInvariantsAccess().getInvariantsKeyword_0());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3031:1: ( (lv_calls_1_0= ruleConstraintCall ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3032:1: (lv_calls_1_0= ruleConstraintCall )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3032:1: (lv_calls_1_0= ruleConstraintCall )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3033:3: lv_calls_1_0= ruleConstraintCall
            {
             
            	        newCompositeNode(grammarAccess.getInvariantsAccess().getCallsConstraintCallParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintCall_in_ruleInvariants5892);
            lv_calls_1_0=ruleConstraintCall();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvariantsRule());
            	        }
                   		add(
                   			current, 
                   			"calls",
                    		lv_calls_1_0, 
                    		"ConstraintCall");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3049:2: (otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==33) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3049:4: otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleInvariants5905); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInvariantsAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3053:1: ( (lv_calls_3_0= ruleConstraintCall ) )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3054:1: (lv_calls_3_0= ruleConstraintCall )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3054:1: (lv_calls_3_0= ruleConstraintCall )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3055:3: lv_calls_3_0= ruleConstraintCall
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInvariantsAccess().getCallsConstraintCallParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstraintCall_in_ruleInvariants5926);
            	    lv_calls_3_0=ruleConstraintCall();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInvariantsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"calls",
            	            		lv_calls_3_0, 
            	            		"ConstraintCall");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop88;
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


    // $ANTLR start "entryRuleOverriddenTypeMetaInfo"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3079:1: entryRuleOverriddenTypeMetaInfo returns [EObject current=null] : iv_ruleOverriddenTypeMetaInfo= ruleOverriddenTypeMetaInfo EOF ;
    public final EObject entryRuleOverriddenTypeMetaInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverriddenTypeMetaInfo = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3080:2: (iv_ruleOverriddenTypeMetaInfo= ruleOverriddenTypeMetaInfo EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3081:2: iv_ruleOverriddenTypeMetaInfo= ruleOverriddenTypeMetaInfo EOF
            {
             newCompositeNode(grammarAccess.getOverriddenTypeMetaInfoRule()); 
            pushFollow(FOLLOW_ruleOverriddenTypeMetaInfo_in_entryRuleOverriddenTypeMetaInfo5964);
            iv_ruleOverriddenTypeMetaInfo=ruleOverriddenTypeMetaInfo();

            state._fsp--;

             current =iv_ruleOverriddenTypeMetaInfo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverriddenTypeMetaInfo5974); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3088:1: ruleOverriddenTypeMetaInfo returns [EObject current=null] : (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' ) ;
    public final EObject ruleOverriddenTypeMetaInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_metaInfo_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3091:28: ( (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3092:1: (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3092:1: (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3092:3: otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleOverriddenTypeMetaInfo6011); 

                	newLeafNode(otherlv_0, grammarAccess.getOverriddenTypeMetaInfoAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3096:1: ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3097:1: (lv_metaInfo_1_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3097:1: (lv_metaInfo_1_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3098:3: lv_metaInfo_1_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getOverriddenTypeMetaInfoAccess().getMetaInfoTypeMetaInfoParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleOverriddenTypeMetaInfo6032);
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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleOverriddenTypeMetaInfo6044); 

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


    // $ANTLR start "entryRuleConstraintCall"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3126:1: entryRuleConstraintCall returns [EObject current=null] : iv_ruleConstraintCall= ruleConstraintCall EOF ;
    public final EObject entryRuleConstraintCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintCall = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3127:2: (iv_ruleConstraintCall= ruleConstraintCall EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3128:2: iv_ruleConstraintCall= ruleConstraintCall EOF
            {
             newCompositeNode(grammarAccess.getConstraintCallRule()); 
            pushFollow(FOLLOW_ruleConstraintCall_in_entryRuleConstraintCall6080);
            iv_ruleConstraintCall=ruleConstraintCall();

            state._fsp--;

             current =iv_ruleConstraintCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintCall6090); 

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
    // $ANTLR end "entryRuleConstraintCall"


    // $ANTLR start "ruleConstraintCall"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3135:1: ruleConstraintCall returns [EObject current=null] : ( ( ( ruleFQN ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleConstraintCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3138:28: ( ( ( ( ruleFQN ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3139:1: ( ( ( ruleFQN ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3139:1: ( ( ( ruleFQN ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3139:2: ( ( ruleFQN ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )?
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3139:2: ( ( ruleFQN ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3140:1: ( ruleFQN )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3140:1: ( ruleFQN )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3141:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstraintCallRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConstraintCallAccess().getConstraintConstraintCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleConstraintCall6138);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3154:2: (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==32) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3154:4: otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleConstraintCall6151); 

                        	newLeafNode(otherlv_1, grammarAccess.getConstraintCallAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3158:1: ( (lv_params_2_0= ruleLiteral ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3159:1: (lv_params_2_0= ruleLiteral )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3159:1: (lv_params_2_0= ruleLiteral )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3160:3: lv_params_2_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstraintCallAccess().getParamsLiteralParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleConstraintCall6172);
                    lv_params_2_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstraintCallRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_2_0, 
                            		"Literal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3176:2: (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==33) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3176:4: otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleConstraintCall6185); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getConstraintCallAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3180:1: ( (lv_params_4_0= ruleLiteral ) )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3181:1: (lv_params_4_0= ruleLiteral )
                    	    {
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3181:1: (lv_params_4_0= ruleLiteral )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3182:3: lv_params_4_0= ruleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstraintCallAccess().getParamsLiteralParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteral_in_ruleConstraintCall6206);
                    	    lv_params_4_0=ruleLiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConstraintCallRule());
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
                    	    break loop89;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleConstraintCall6220); 

                        	newLeafNode(otherlv_5, grammarAccess.getConstraintCallAccess().getRightParenthesisKeyword_1_3());
                        

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
    // $ANTLR end "ruleConstraintCall"


    // $ANTLR start "entryRuleService"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3210:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3211:2: (iv_ruleService= ruleService EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3212:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService6258);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService6268); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3219:1: ruleService returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}' ) ;
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
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3222:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3223:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3223:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3223:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3223:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_DOC) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3224:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3224:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3225:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleService6310); 

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

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleService6328); 

                	newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getServiceKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3245:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3246:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3246:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3247:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService6345); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleService6362); 

                	newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3267:1: ( (lv_methods_4_0= ruleMethod ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==RULE_DOC||LA92_0==44) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3268:1: (lv_methods_4_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3268:1: (lv_methods_4_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3269:3: lv_methods_4_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServiceAccess().getMethodsMethodParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleService6383);
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
            	    break loop92;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleService6396); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3297:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3298:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3299:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral6432);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral6442); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3306:1: ruleLiteral returns [EObject current=null] : (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NullLiteral_0 = null;

        EObject this_BooleanLiteral_1 = null;

        EObject this_NumberLiteral_2 = null;

        EObject this_StringLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3309:28: ( (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3310:1: (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3310:1: (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral )
            int alt93=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt93=1;
                }
                break;
            case 56:
            case 57:
                {
                alt93=2;
                }
                break;
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
                {
                alt93=3;
                }
                break;
            case RULE_STRING:
                {
                alt93=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3311:5: this_NullLiteral_0= ruleNullLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteral6489);
                    this_NullLiteral_0=ruleNullLiteral();

                    state._fsp--;

                     
                            current = this_NullLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3321:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral6516);
                    this_BooleanLiteral_1=ruleBooleanLiteral();

                    state._fsp--;

                     
                            current = this_BooleanLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3331:5: this_NumberLiteral_2= ruleNumberLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteral6543);
                    this_NumberLiteral_2=ruleNumberLiteral();

                    state._fsp--;

                     
                            current = this_NumberLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3341:5: this_StringLiteral_3= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral6570);
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3357:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3358:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3359:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN6606);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN6617); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3366:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3369:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3370:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3370:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3370:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN6657); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3377:1: (kw= '.' this_ID_2= RULE_ID )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==55) ) {
                    int LA94_2 = input.LA(2);

                    if ( (LA94_2==RULE_ID) ) {
                        alt94=1;
                    }


                }


                switch (alt94) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3378:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,55,FOLLOW_55_in_ruleFQN6676); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN6691); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop94;
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3398:1: entryRuleFQNWithWildcard returns [String current=null] : iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF ;
    public final String entryRuleFQNWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQNWithWildcard = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3399:2: (iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3400:2: iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getFQNWithWildcardRule()); 
            pushFollow(FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard6739);
            iv_ruleFQNWithWildcard=ruleFQNWithWildcard();

            state._fsp--;

             current =iv_ruleFQNWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQNWithWildcard6750); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3407:1: ruleFQNWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleFQNWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3410:28: ( (this_FQN_0= ruleFQN kw= '.' kw= '*' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3411:1: (this_FQN_0= ruleFQN kw= '.' kw= '*' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3411:1: (this_FQN_0= ruleFQN kw= '.' kw= '*' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3412:5: this_FQN_0= ruleFQN kw= '.' kw= '*'
            {
             
                    newCompositeNode(grammarAccess.getFQNWithWildcardAccess().getFQNParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFQN_in_ruleFQNWithWildcard6797);
            this_FQN_0=ruleFQN();

            state._fsp--;


            		current.merge(this_FQN_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,55,FOLLOW_55_in_ruleFQNWithWildcard6815); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFQNWithWildcardAccess().getFullStopKeyword_1()); 
                
            kw=(Token)match(input,52,FOLLOW_52_in_ruleFQNWithWildcard6828); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3442:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3443:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3444:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral6868);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral6878); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3451:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3454:28: ( ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3455:1: ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3455:1: ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3455:2: () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3455:2: ()
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3456:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3461:2: ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3462:1: ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3462:1: ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3463:1: (lv_value_1_1= 'false' | lv_value_1_2= 'true' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3463:1: (lv_value_1_1= 'false' | lv_value_1_2= 'true' )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==56) ) {
                alt95=1;
            }
            else if ( (LA95_0==57) ) {
                alt95=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3464:3: lv_value_1_1= 'false'
                    {
                    lv_value_1_1=(Token)match(input,56,FOLLOW_56_in_ruleBooleanLiteral6932); 

                            newLeafNode(lv_value_1_1, grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3476:8: lv_value_1_2= 'true'
                    {
                    lv_value_1_2=(Token)match(input,57,FOLLOW_57_in_ruleBooleanLiteral6961); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3499:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3500:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3501:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
             newCompositeNode(grammarAccess.getNullLiteralRule()); 
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral7013);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;

             current =iv_ruleNullLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral7023); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3508:1: ruleNullLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= 'null' ) ) ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3511:28: ( ( () ( (lv_value_1_0= 'null' ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3512:1: ( () ( (lv_value_1_0= 'null' ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3512:1: ( () ( (lv_value_1_0= 'null' ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3512:2: () ( (lv_value_1_0= 'null' ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3512:2: ()
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3513:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNullLiteralAccess().getNullLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3518:2: ( (lv_value_1_0= 'null' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3519:1: (lv_value_1_0= 'null' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3519:1: (lv_value_1_0= 'null' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3520:3: lv_value_1_0= 'null'
            {
            lv_value_1_0=(Token)match(input,58,FOLLOW_58_in_ruleNullLiteral7075); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3541:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3542:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3543:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral7124);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral7134); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3550:1: ruleNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3553:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3554:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3554:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3554:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3554:2: ()
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3555:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumberLiteralAccess().getNumberLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3560:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3561:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3561:1: (lv_value_1_0= ruleNumber )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3562:3: lv_value_1_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNumber_in_ruleNumberLiteral7189);
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3586:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3587:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3588:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral7225);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral7235); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3595:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3598:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3599:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3599:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3599:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3599:2: ()
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3600:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3605:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3606:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3606:1: (lv_value_1_0= RULE_STRING )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3607:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral7286); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3631:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3635:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3636:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber7334);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber7345); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3646:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3650:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3651:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3651:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==RULE_HEX) ) {
                alt99=1;
            }
            else if ( (LA99_0==RULE_INT||LA99_0==RULE_DECIMAL) ) {
                alt99=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3651:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber7389); 

                    		current.merge(this_HEX_0);
                        
                     
                        newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3659:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3659:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3659:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3659:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==RULE_INT) ) {
                        alt96=1;
                    }
                    else if ( (LA96_0==RULE_DECIMAL) ) {
                        alt96=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 96, 0, input);

                        throw nvae;
                    }
                    switch (alt96) {
                        case 1 :
                            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3659:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber7417); 

                            		current.merge(this_INT_1);
                                
                             
                                newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3667:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber7443); 

                            		current.merge(this_DECIMAL_2);
                                
                             
                                newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                

                            }
                            break;

                    }

                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3674:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==55) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3675:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,55,FOLLOW_55_in_ruleNumber7463); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                
                            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3680:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt97=2;
                            int LA97_0 = input.LA(1);

                            if ( (LA97_0==RULE_INT) ) {
                                alt97=1;
                            }
                            else if ( (LA97_0==RULE_DECIMAL) ) {
                                alt97=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 97, 0, input);

                                throw nvae;
                            }
                            switch (alt97) {
                                case 1 :
                                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3680:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber7479); 

                                    		current.merge(this_INT_4);
                                        
                                     
                                        newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3688:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber7505); 

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

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA72 dfa72 = new DFA72(this);
    static final String DFA5_eotS =
        "\6\uffff";
    static final String DFA5_eofS =
        "\1\uffff\1\3\3\uffff\1\3";
    static final String DFA5_minS =
        "\1\4\1\5\1\4\2\uffff\1\5";
    static final String DFA5_maxS =
        "\1\4\1\67\1\64\2\uffff\1\67";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA5_specialS =
        "\6\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\3\11\uffff\1\3\1\uffff\3\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\3\1\uffff\2\3\5\uffff\2\3\2\uffff\1\3\16\uffff\1\3\1\2",
            "\1\5\57\uffff\1\4",
            "",
            "",
            "\1\3\11\uffff\1\3\1\uffff\3\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\3\1\uffff\2\3\5\uffff\2\3\2\uffff\1\3\16\uffff\1\3\1\2"
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
            return "281:1: (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard )";
        }
    }
    static final String DFA61_eotS =
        "\7\uffff";
    static final String DFA61_eofS =
        "\7\uffff";
    static final String DFA61_minS =
        "\3\4\2\uffff\2\4";
    static final String DFA61_maxS =
        "\1\66\1\67\1\66\2\uffff\1\4\1\67";
    static final String DFA61_acceptS =
        "\3\uffff\1\2\1\1\2\uffff";
    static final String DFA61_specialS =
        "\7\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\1\1\2\11\uffff\1\3\23\uffff\1\3\17\uffff\1\4\2\uffff\1\3",
            "\1\4\1\3\11\uffff\1\3\23\uffff\1\3\20\uffff\1\4\1\uffff\1\3\1\5",
            "\1\4\36\uffff\1\3\17\uffff\1\4\2\uffff\1\3",
            "",
            "",
            "\1\6",
            "\1\4\1\3\11\uffff\1\3\23\uffff\1\3\20\uffff\1\4\1\uffff\1\3\1\5"
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "()* loopback of 2343:1: ( (lv_variables_12_0= ruleVariable ) )*";
        }
    }
    static final String DFA72_eotS =
        "\7\uffff";
    static final String DFA72_eofS =
        "\7\uffff";
    static final String DFA72_minS =
        "\3\4\2\uffff\2\4";
    static final String DFA72_maxS =
        "\1\66\1\67\1\66\2\uffff\1\4\1\67";
    static final String DFA72_acceptS =
        "\3\uffff\1\2\1\1\2\uffff";
    static final String DFA72_specialS =
        "\7\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\1\1\2\11\uffff\1\3\23\uffff\1\3\7\uffff\1\3\7\uffff\1\4\2\uffff\1\3",
            "\1\4\1\3\11\uffff\1\3\23\uffff\1\3\7\uffff\1\3\10\uffff\1\4\1\uffff\1\3\1\5",
            "\1\4\36\uffff\1\3\7\uffff\1\3\7\uffff\1\4\2\uffff\1\3",
            "",
            "",
            "\1\6",
            "\1\4\1\3\11\uffff\1\3\23\uffff\1\3\7\uffff\1\3\10\uffff\1\4\1\uffff\1\3\1\5"
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "()* loopback of 2640:1: ( (lv_variables_14_0= ruleVariable ) )*";
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
    public static final BitSet FOLLOW_14_in_ruleNamespace397 = new BitSet(new long[]{0x00400098352E8020L});
    public static final BitSet FOLLOW_ruleImport_in_ruleNamespace418 = new BitSet(new long[]{0x00400098352E8020L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleNamespace440 = new BitSet(new long[]{0x00400098352C8020L});
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
    public static final BitSet FOLLOW_ruleExternalType_in_entryRuleExternalType1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalType1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleExternalType1488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalType1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint1546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleConstraint1598 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConstraint1616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint1633 = new BitSet(new long[]{0x0000000000304000L});
    public static final BitSet FOLLOW_20_in_ruleConstraint1651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleConstraint1674 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_21_in_ruleConstraint1689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleConstraint1712 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConstraint1726 = new BitSet(new long[]{0x0008000000408030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleConstraint1747 = new BitSet(new long[]{0x0008000000408030L});
    public static final BitSet FOLLOW_22_in_ruleConstraint1761 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint1778 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConstraint1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleException_in_entryRuleException1833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleException1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleException1885 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleException1903 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleException1920 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_23_in_ruleException1938 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleException1955 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleException1974 = new BitSet(new long[]{0x0008000000400030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleException1995 = new BitSet(new long[]{0x0008000000400030L});
    public static final BitSet FOLLOW_22_in_ruleException2008 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleException2025 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleException2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_entryRuleValueObject2078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueObject2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleValueObject2130 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleValueObject2148 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValueObject2165 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_25_in_ruleValueObject2183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleValueObject2206 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleValueObject2220 = new BitSet(new long[]{0x000FD10000008030L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleValueObject2241 = new BitSet(new long[]{0x0008110000008030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleValueObject2262 = new BitSet(new long[]{0x0008110000008030L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleValueObject2284 = new BitSet(new long[]{0x0000110000008020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleValueObject2306 = new BitSet(new long[]{0x0000100000008020L});
    public static final BitSet FOLLOW_15_in_ruleValueObject2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityId_in_entryRuleEntityId2355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityId2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleEntityId2407 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEntityId2425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityId2442 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEntityId2459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEntityId2482 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_25_in_ruleEntityId2495 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEntityId2518 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntityId2532 = new BitSet(new long[]{0x000FD10000008030L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleEntityId2553 = new BitSet(new long[]{0x0008110000008030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleEntityId2574 = new BitSet(new long[]{0x0008110000008030L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleEntityId2596 = new BitSet(new long[]{0x0000110000008020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleEntityId2618 = new BitSet(new long[]{0x0000100000008020L});
    public static final BitSet FOLLOW_15_in_ruleEntityId2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregateId_in_entryRuleAggregateId2667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAggregateId2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleAggregateId2719 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAggregateId2737 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAggregateId2754 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleAggregateId2771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleAggregateId2794 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_25_in_ruleAggregateId2807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleAggregateId2830 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAggregateId2844 = new BitSet(new long[]{0x000FD10000008030L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleAggregateId2865 = new BitSet(new long[]{0x0008110000008030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAggregateId2886 = new BitSet(new long[]{0x0008110000008030L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleAggregateId2908 = new BitSet(new long[]{0x0000110000008020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleAggregateId2930 = new BitSet(new long[]{0x0000100000008020L});
    public static final BitSet FOLLOW_15_in_ruleAggregateId2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumObject_in_entryRuleEnumObject2979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumObject2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleEnumObject3031 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleEnumObject3049 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumObject3066 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_25_in_ruleEnumObject3084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEnumObject3107 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumObject3121 = new BitSet(new long[]{0x000FC00040000030L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleEnumObject3142 = new BitSet(new long[]{0x0008000040000030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleEnumObject3163 = new BitSet(new long[]{0x0008000040000030L});
    public static final BitSet FOLLOW_30_in_ruleEnumObject3176 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumObject3188 = new BitSet(new long[]{0x0000000080000030L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_ruleEnumObject3209 = new BitSet(new long[]{0x0000000080008030L});
    public static final BitSet FOLLOW_15_in_ruleEnumObject3222 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEnumObject3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance3270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumInstance3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleEnumInstance3322 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_31_in_ruleEnumInstance3346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance3377 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleEnumInstance3395 = new BitSet(new long[]{0x07000000000003C0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleEnumInstance3416 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_33_in_ruleEnumInstance3429 = new BitSet(new long[]{0x07000000000003C0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleEnumInstance3450 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_34_in_ruleEnumInstance3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent3502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleEvent3554 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleEvent3572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent3589 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEvent3606 = new BitSet(new long[]{0x0008000000408030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleEvent3627 = new BitSet(new long[]{0x0008000000408030L});
    public static final BitSet FOLLOW_22_in_ruleEvent3641 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEvent3658 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEvent3677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity3713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleEntity3765 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleEntity3783 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity3800 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleEntity3817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEntity3840 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleEntity3852 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEntity3875 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntity3887 = new BitSet(new long[]{0x004FD198352C8030L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleEntity3908 = new BitSet(new long[]{0x00481198352C8030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleEntity3929 = new BitSet(new long[]{0x00481198352C8030L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleEntity3951 = new BitSet(new long[]{0x00401198352C8020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleEntity3973 = new BitSet(new long[]{0x00401098352C8020L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleEntity3995 = new BitSet(new long[]{0x00400098352C8020L});
    public static final BitSet FOLLOW_15_in_ruleEntity4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregate_in_entryRuleAggregate4044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAggregate4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleAggregate4096 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleAggregate4114 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAggregate4131 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleAggregate4148 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleAggregate4171 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAggregate4183 = new BitSet(new long[]{0x004FD198352C8030L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleAggregate4204 = new BitSet(new long[]{0x00481198352C8030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAggregate4225 = new BitSet(new long[]{0x00481198352C8030L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleAggregate4247 = new BitSet(new long[]{0x00401198352C8020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleAggregate4269 = new BitSet(new long[]{0x00401098352C8020L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleAggregate4291 = new BitSet(new long[]{0x00400098352C8020L});
    public static final BitSet FOLLOW_15_in_ruleAggregate4304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_entryRuleConstructor4342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleConstructor4394 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleConstructor4412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor4429 = new BitSet(new long[]{0x0000060000004000L});
    public static final BitSet FOLLOW_41_in_ruleConstructor4447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_ruleConstructor4468 = new BitSet(new long[]{0x0000040200004000L});
    public static final BitSet FOLLOW_33_in_ruleConstructor4481 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_ruleConstructor4502 = new BitSet(new long[]{0x0000040200004000L});
    public static final BitSet FOLLOW_42_in_ruleConstructor4519 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleConstructor4542 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_33_in_ruleConstructor4555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleConstructor4578 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_14_in_ruleConstructor4594 = new BitSet(new long[]{0x00480098352C8030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleConstructor4615 = new BitSet(new long[]{0x00480098352C8030L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleConstructor4639 = new BitSet(new long[]{0x00400098352C8020L});
    public static final BitSet FOLLOW_ruleService_in_ruleConstructor4661 = new BitSet(new long[]{0x00400098352C8020L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleConstructor4683 = new BitSet(new long[]{0x00400098352C8020L});
    public static final BitSet FOLLOW_15_in_ruleConstructor4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnType_in_entryRuleReturnType4732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnType4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleReturnType4784 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleReturnType4802 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleReturnType4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod4861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod4871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleMethod4913 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleMethod4931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod4948 = new BitSet(new long[]{0x0000260000004000L});
    public static final BitSet FOLLOW_45_in_ruleMethod4966 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleMethod4989 = new BitSet(new long[]{0x0000060000004000L});
    public static final BitSet FOLLOW_41_in_ruleMethod5004 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_ruleMethod5025 = new BitSet(new long[]{0x0000040200004000L});
    public static final BitSet FOLLOW_33_in_ruleMethod5038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_ruleMethod5059 = new BitSet(new long[]{0x0000040200004000L});
    public static final BitSet FOLLOW_42_in_ruleMethod5076 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleMethod5099 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_33_in_ruleMethod5112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleMethod5135 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_14_in_ruleMethod5151 = new BitSet(new long[]{0x00480898352C8030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleMethod5172 = new BitSet(new long[]{0x00480898352C8030L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleMethod5196 = new BitSet(new long[]{0x00400898352C8020L});
    public static final BitSet FOLLOW_ruleReturnType_in_ruleMethod5218 = new BitSet(new long[]{0x00400098352C8020L});
    public static final BitSet FOLLOW_ruleService_in_ruleMethod5240 = new BitSet(new long[]{0x00400098352C8020L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleMethod5262 = new BitSet(new long[]{0x00400098352C8020L});
    public static final BitSet FOLLOW_15_in_ruleMethod5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_entryRuleTypeMetaInfo5311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeMetaInfo5321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTypeMetaInfo5368 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo5385 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_47_in_ruleTypeMetaInfo5405 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo5422 = new BitSet(new long[]{0x0007000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTypeMetaInfo5442 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo5459 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTypeMetaInfo5479 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo5496 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTypeMetaInfo5516 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo5533 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable5577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable5587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleVariable5629 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_51_in_ruleVariable5653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleVariable5690 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_52_in_ruleVariable5708 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable5739 = new BitSet(new long[]{0x0020000000004002L});
    public static final BitSet FOLLOW_ruleInvariants_in_ruleVariable5765 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleOverriddenTypeMetaInfo_in_ruleVariable5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariants_in_entryRuleInvariants5824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvariants5834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleInvariants5871 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_ruleInvariants5892 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleInvariants5905 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_ruleInvariants5926 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleOverriddenTypeMetaInfo_in_entryRuleOverriddenTypeMetaInfo5964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverriddenTypeMetaInfo5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOverriddenTypeMetaInfo6011 = new BitSet(new long[]{0x0007C00000008000L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleOverriddenTypeMetaInfo6032 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleOverriddenTypeMetaInfo6044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_entryRuleConstraintCall6080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintCall6090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleConstraintCall6138 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleConstraintCall6151 = new BitSet(new long[]{0x07000000000003C0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleConstraintCall6172 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_33_in_ruleConstraintCall6185 = new BitSet(new long[]{0x07000000000003C0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleConstraintCall6206 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_34_in_ruleConstraintCall6220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService6258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleService6310 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleService6328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService6345 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleService6362 = new BitSet(new long[]{0x0000100000008020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleService6383 = new BitSet(new long[]{0x0000100000008020L});
    public static final BitSet FOLLOW_15_in_ruleService6396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral6432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral6442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteral6489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral6516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteral6543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral6570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN6606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN6617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN6657 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleFQN6676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN6691 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard6739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQNWithWildcard6750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleFQNWithWildcard6797 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleFQNWithWildcard6815 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleFQNWithWildcard6828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral6868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral6878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleBooleanLiteral6932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleBooleanLiteral6961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral7013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral7023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleNullLiteral7075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral7124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral7134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumberLiteral7189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral7225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral7235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral7286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber7334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber7345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber7389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber7417 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber7443 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleNumber7463 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber7479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber7505 = new BitSet(new long[]{0x0000000000000002L});

}