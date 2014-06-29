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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOC", "RULE_STRING", "RULE_INT", "RULE_HEX", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'context'", "'{'", "'}'", "'namespace'", "'import'", "'type'", "'constraint'", "'on'", "'exception'", "'message'", "'cid'", "'value-object'", "'base'", "'entity-id'", "'identifies'", "'aggregate-id'", "'enum'", "'instances'", "'('", "','", "')'", "'entity'", "'identifier'", "'root'", "'aggregate'", "'constructor'", "'returns'", "'method'", "'ref'", "'event'", "'slabel'", "'label'", "'tooltip'", "'prompt'", "'examples'", "'nullable'", "'*'", "'constraints'", "'invariants'", "'service'", "'.'", "'false'", "'true'", "'null'"
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
    public static final int RULE_HEX=8;
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

                if ( (LA4_0==RULE_DOC||(LA4_0>=18 && LA4_0<=19)||LA4_0==21||LA4_0==24||LA4_0==26||(LA4_0>=28 && LA4_0<=29)||LA4_0==34||LA4_0==37||LA4_0==52) ) {
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:332:1: ruleAbstractElement returns [EObject current=null] : (this_Constraint_0= ruleConstraint | this_Type_1= ruleType | this_Exception_2= ruleException ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Constraint_0 = null;

        EObject this_Type_1 = null;

        EObject this_Exception_2 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:335:28: ( (this_Constraint_0= ruleConstraint | this_Type_1= ruleType | this_Exception_2= ruleException ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:336:1: (this_Constraint_0= ruleConstraint | this_Type_1= ruleType | this_Exception_2= ruleException )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:336:1: (this_Constraint_0= ruleConstraint | this_Type_1= ruleType | this_Exception_2= ruleException )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_DOC:
                {
                switch ( input.LA(2) ) {
                case 24:
                case 26:
                case 28:
                case 29:
                case 34:
                case 37:
                case 52:
                    {
                    alt6=2;
                    }
                    break;
                case 21:
                    {
                    alt6=3;
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
            case 34:
            case 37:
            case 52:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:373:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:374:2: (iv_ruleType= ruleType EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:375:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType763);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType773); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:382:1: ruleType returns [EObject current=null] : (this_ExternalType_0= ruleExternalType | this_InternalType_1= ruleInternalType | this_Service_2= ruleService ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalType_0 = null;

        EObject this_InternalType_1 = null;

        EObject this_Service_2 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:385:28: ( (this_ExternalType_0= ruleExternalType | this_InternalType_1= ruleInternalType | this_Service_2= ruleService ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:386:1: (this_ExternalType_0= ruleExternalType | this_InternalType_1= ruleInternalType | this_Service_2= ruleService )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:386:1: (this_ExternalType_0= ruleExternalType | this_InternalType_1= ruleInternalType | this_Service_2= ruleService )
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

                if ( (LA7_2==24||LA7_2==26||(LA7_2>=28 && LA7_2<=29)||LA7_2==34||LA7_2==37) ) {
                    alt7=2;
                }
                else if ( (LA7_2==52) ) {
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
            case 34:
            case 37:
                {
                alt7=2;
                }
                break;
            case 52:
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
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:387:5: this_ExternalType_0= ruleExternalType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getExternalTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExternalType_in_ruleType820);
                    this_ExternalType_0=ruleExternalType();

                    state._fsp--;

                     
                            current = this_ExternalType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:397:5: this_InternalType_1= ruleInternalType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getInternalTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInternalType_in_ruleType847);
                    this_InternalType_1=ruleInternalType();

                    state._fsp--;

                     
                            current = this_InternalType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:407:5: this_Service_2= ruleService
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getServiceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleService_in_ruleType874);
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:423:1: entryRuleInternalType returns [EObject current=null] : iv_ruleInternalType= ruleInternalType EOF ;
    public final EObject entryRuleInternalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalType = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:424:2: (iv_ruleInternalType= ruleInternalType EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:425:2: iv_ruleInternalType= ruleInternalType EOF
            {
             newCompositeNode(grammarAccess.getInternalTypeRule()); 
            pushFollow(FOLLOW_ruleInternalType_in_entryRuleInternalType909);
            iv_ruleInternalType=ruleInternalType();

            state._fsp--;

             current =iv_ruleInternalType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalType919); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:432:1: ruleInternalType returns [EObject current=null] : (this_AbstractVO_0= ruleAbstractVO | this_AbstractEntity_1= ruleAbstractEntity ) ;
    public final EObject ruleInternalType() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractVO_0 = null;

        EObject this_AbstractEntity_1 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:435:28: ( (this_AbstractVO_0= ruleAbstractVO | this_AbstractEntity_1= ruleAbstractEntity ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:436:1: (this_AbstractVO_0= ruleAbstractVO | this_AbstractEntity_1= ruleAbstractEntity )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:436:1: (this_AbstractVO_0= ruleAbstractVO | this_AbstractEntity_1= ruleAbstractEntity )
            int alt8=2;
            switch ( input.LA(1) ) {
            case RULE_DOC:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==34||LA8_1==37) ) {
                    alt8=2;
                }
                else if ( (LA8_1==24||LA8_1==26||(LA8_1>=28 && LA8_1<=29)) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case 24:
            case 26:
            case 28:
            case 29:
                {
                alt8=1;
                }
                break;
            case 34:
            case 37:
                {
                alt8=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:437:5: this_AbstractVO_0= ruleAbstractVO
                    {
                     
                            newCompositeNode(grammarAccess.getInternalTypeAccess().getAbstractVOParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAbstractVO_in_ruleInternalType966);
                    this_AbstractVO_0=ruleAbstractVO();

                    state._fsp--;

                     
                            current = this_AbstractVO_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:447:5: this_AbstractEntity_1= ruleAbstractEntity
                    {
                     
                            newCompositeNode(grammarAccess.getInternalTypeAccess().getAbstractEntityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAbstractEntity_in_ruleInternalType993);
                    this_AbstractEntity_1=ruleAbstractEntity();

                    state._fsp--;

                     
                            current = this_AbstractEntity_1; 
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:463:1: entryRuleAbstractVO returns [EObject current=null] : iv_ruleAbstractVO= ruleAbstractVO EOF ;
    public final EObject entryRuleAbstractVO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractVO = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:464:2: (iv_ruleAbstractVO= ruleAbstractVO EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:465:2: iv_ruleAbstractVO= ruleAbstractVO EOF
            {
             newCompositeNode(grammarAccess.getAbstractVORule()); 
            pushFollow(FOLLOW_ruleAbstractVO_in_entryRuleAbstractVO1028);
            iv_ruleAbstractVO=ruleAbstractVO();

            state._fsp--;

             current =iv_ruleAbstractVO; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractVO1038); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:472:1: ruleAbstractVO returns [EObject current=null] : (this_ValueObject_0= ruleValueObject | this_EnumObject_1= ruleEnumObject | this_AbstractEntityId_2= ruleAbstractEntityId ) ;
    public final EObject ruleAbstractVO() throws RecognitionException {
        EObject current = null;

        EObject this_ValueObject_0 = null;

        EObject this_EnumObject_1 = null;

        EObject this_AbstractEntityId_2 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:475:28: ( (this_ValueObject_0= ruleValueObject | this_EnumObject_1= ruleEnumObject | this_AbstractEntityId_2= ruleAbstractEntityId ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:476:1: (this_ValueObject_0= ruleValueObject | this_EnumObject_1= ruleEnumObject | this_AbstractEntityId_2= ruleAbstractEntityId )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:476:1: (this_ValueObject_0= ruleValueObject | this_EnumObject_1= ruleEnumObject | this_AbstractEntityId_2= ruleAbstractEntityId )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_DOC:
                {
                switch ( input.LA(2) ) {
                case 26:
                case 28:
                    {
                    alt9=3;
                    }
                    break;
                case 29:
                    {
                    alt9=2;
                    }
                    break;
                case 24:
                    {
                    alt9=1;
                    }
                    break;
                default:
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
            case 29:
                {
                alt9=2;
                }
                break;
            case 26:
            case 28:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:477:5: this_ValueObject_0= ruleValueObject
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractVOAccess().getValueObjectParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleValueObject_in_ruleAbstractVO1085);
                    this_ValueObject_0=ruleValueObject();

                    state._fsp--;

                     
                            current = this_ValueObject_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:487:5: this_EnumObject_1= ruleEnumObject
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractVOAccess().getEnumObjectParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEnumObject_in_ruleAbstractVO1112);
                    this_EnumObject_1=ruleEnumObject();

                    state._fsp--;

                     
                            current = this_EnumObject_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:497:5: this_AbstractEntityId_2= ruleAbstractEntityId
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractVOAccess().getAbstractEntityIdParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAbstractEntityId_in_ruleAbstractVO1139);
                    this_AbstractEntityId_2=ruleAbstractEntityId();

                    state._fsp--;

                     
                            current = this_AbstractEntityId_2; 
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:513:1: entryRuleAbstractEntityId returns [EObject current=null] : iv_ruleAbstractEntityId= ruleAbstractEntityId EOF ;
    public final EObject entryRuleAbstractEntityId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractEntityId = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:514:2: (iv_ruleAbstractEntityId= ruleAbstractEntityId EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:515:2: iv_ruleAbstractEntityId= ruleAbstractEntityId EOF
            {
             newCompositeNode(grammarAccess.getAbstractEntityIdRule()); 
            pushFollow(FOLLOW_ruleAbstractEntityId_in_entryRuleAbstractEntityId1174);
            iv_ruleAbstractEntityId=ruleAbstractEntityId();

            state._fsp--;

             current =iv_ruleAbstractEntityId; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractEntityId1184); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:522:1: ruleAbstractEntityId returns [EObject current=null] : (this_EntityId_0= ruleEntityId | this_AggregateId_1= ruleAggregateId ) ;
    public final EObject ruleAbstractEntityId() throws RecognitionException {
        EObject current = null;

        EObject this_EntityId_0 = null;

        EObject this_AggregateId_1 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:525:28: ( (this_EntityId_0= ruleEntityId | this_AggregateId_1= ruleAggregateId ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:526:1: (this_EntityId_0= ruleEntityId | this_AggregateId_1= ruleAggregateId )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:526:1: (this_EntityId_0= ruleEntityId | this_AggregateId_1= ruleAggregateId )
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
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:527:5: this_EntityId_0= ruleEntityId
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractEntityIdAccess().getEntityIdParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEntityId_in_ruleAbstractEntityId1231);
                    this_EntityId_0=ruleEntityId();

                    state._fsp--;

                     
                            current = this_EntityId_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:537:5: this_AggregateId_1= ruleAggregateId
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractEntityIdAccess().getAggregateIdParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAggregateId_in_ruleAbstractEntityId1258);
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:553:1: entryRuleAbstractEntity returns [EObject current=null] : iv_ruleAbstractEntity= ruleAbstractEntity EOF ;
    public final EObject entryRuleAbstractEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractEntity = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:554:2: (iv_ruleAbstractEntity= ruleAbstractEntity EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:555:2: iv_ruleAbstractEntity= ruleAbstractEntity EOF
            {
             newCompositeNode(grammarAccess.getAbstractEntityRule()); 
            pushFollow(FOLLOW_ruleAbstractEntity_in_entryRuleAbstractEntity1293);
            iv_ruleAbstractEntity=ruleAbstractEntity();

            state._fsp--;

             current =iv_ruleAbstractEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractEntity1303); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:562:1: ruleAbstractEntity returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Aggregate_1= ruleAggregate ) ;
    public final EObject ruleAbstractEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Aggregate_1 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:565:28: ( (this_Entity_0= ruleEntity | this_Aggregate_1= ruleAggregate ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:566:1: (this_Entity_0= ruleEntity | this_Aggregate_1= ruleAggregate )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:566:1: (this_Entity_0= ruleEntity | this_Aggregate_1= ruleAggregate )
            int alt11=2;
            switch ( input.LA(1) ) {
            case RULE_DOC:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==37) ) {
                    alt11=2;
                }
                else if ( (LA11_1==34) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                alt11=1;
                }
                break;
            case 37:
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
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:567:5: this_Entity_0= ruleEntity
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractEntityAccess().getEntityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleAbstractEntity1350);
                    this_Entity_0=ruleEntity();

                    state._fsp--;

                     
                            current = this_Entity_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:577:5: this_Aggregate_1= ruleAggregate
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractEntityAccess().getAggregateParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAggregate_in_ruleAbstractEntity1377);
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:595:1: entryRuleExternalType returns [EObject current=null] : iv_ruleExternalType= ruleExternalType EOF ;
    public final EObject entryRuleExternalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalType = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:596:2: (iv_ruleExternalType= ruleExternalType EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:597:2: iv_ruleExternalType= ruleExternalType EOF
            {
             newCompositeNode(grammarAccess.getExternalTypeRule()); 
            pushFollow(FOLLOW_ruleExternalType_in_entryRuleExternalType1414);
            iv_ruleExternalType=ruleExternalType();

            state._fsp--;

             current =iv_ruleExternalType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalType1424); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:604:1: ruleExternalType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleExternalType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:607:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:608:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:608:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:608:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleExternalType1461); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalTypeAccess().getTypeKeyword_0());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:612:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:613:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:613:1: (lv_name_1_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:614:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalType1478); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:638:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:639:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:640:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint1519);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint1529); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:647:1: ruleConstraint returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'exception' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) )* (otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_message_10_0=null;
        Token otherlv_11=null;
        EObject lv_variables_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:650:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'exception' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) )* (otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:651:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'exception' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) )* (otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:651:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'exception' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) )* (otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:651:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'exception' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) )* (otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) ) )? otherlv_11= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:651:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_DOC) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:652:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:652:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:653:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleConstraint1571); 

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

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleConstraint1589); 

                	newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getConstraintKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:673:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:674:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:674:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:675:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint1606); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:691:2: (otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:691:4: otherlv_3= 'on' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleConstraint1624); 

                        	newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getOnKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:695:1: ( (otherlv_4= RULE_ID ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:696:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:696:1: (otherlv_4= RULE_ID )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:697:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint1644); 

                    		newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getTargetConstraintTargetCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:708:4: (otherlv_5= 'exception' ( (otherlv_6= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:708:6: otherlv_5= 'exception' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleConstraint1659); 

                        	newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getExceptionKeyword_4_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:712:1: ( (otherlv_6= RULE_ID ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:713:1: (otherlv_6= RULE_ID )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:713:1: (otherlv_6= RULE_ID )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:714:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint1679); 

                    		newLeafNode(otherlv_6, grammarAccess.getConstraintAccess().getExceptionExceptionCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleConstraint1693); 

                	newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:729:1: ( (lv_variables_8_0= ruleVariable ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_DOC)||LA15_0==48) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:730:1: (lv_variables_8_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:730:1: (lv_variables_8_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:731:3: lv_variables_8_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstraintAccess().getVariablesVariableParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleConstraint1714);
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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:747:3: (otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:747:5: otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleConstraint1728); 

                        	newLeafNode(otherlv_9, grammarAccess.getConstraintAccess().getMessageKeyword_7_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:751:1: ( (lv_message_10_0= RULE_STRING ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:752:1: (lv_message_10_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:752:1: (lv_message_10_0= RULE_STRING )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:753:3: lv_message_10_0= RULE_STRING
                    {
                    lv_message_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint1745); 

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

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleConstraint1764); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:781:1: entryRuleException returns [EObject current=null] : iv_ruleException= ruleException EOF ;
    public final EObject entryRuleException() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleException = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:782:2: (iv_ruleException= ruleException EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:783:2: iv_ruleException= ruleException EOF
            {
             newCompositeNode(grammarAccess.getExceptionRule()); 
            pushFollow(FOLLOW_ruleException_in_entryRuleException1800);
            iv_ruleException=ruleException();

            state._fsp--;

             current =iv_ruleException; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleException1810); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:790:1: ruleException returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'exception' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'cid' ( (lv_cid_4_0= RULE_INT ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* otherlv_7= 'message' ( (lv_message_8_0= RULE_STRING ) ) otherlv_9= '}' ) ;
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
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:793:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'exception' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'cid' ( (lv_cid_4_0= RULE_INT ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* otherlv_7= 'message' ( (lv_message_8_0= RULE_STRING ) ) otherlv_9= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:794:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'exception' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'cid' ( (lv_cid_4_0= RULE_INT ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* otherlv_7= 'message' ( (lv_message_8_0= RULE_STRING ) ) otherlv_9= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:794:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'exception' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'cid' ( (lv_cid_4_0= RULE_INT ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* otherlv_7= 'message' ( (lv_message_8_0= RULE_STRING ) ) otherlv_9= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:794:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'exception' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'cid' ( (lv_cid_4_0= RULE_INT ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* otherlv_7= 'message' ( (lv_message_8_0= RULE_STRING ) ) otherlv_9= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:794:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_DOC) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:795:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:795:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:796:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleException1852); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleException1870); 

                	newLeafNode(otherlv_1, grammarAccess.getExceptionAccess().getExceptionKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:816:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:817:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:817:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:818:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleException1887); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:834:2: (otherlv_3= 'cid' ( (lv_cid_4_0= RULE_INT ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:834:4: otherlv_3= 'cid' ( (lv_cid_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleException1905); 

                        	newLeafNode(otherlv_3, grammarAccess.getExceptionAccess().getCidKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:838:1: ( (lv_cid_4_0= RULE_INT ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:839:1: (lv_cid_4_0= RULE_INT )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:839:1: (lv_cid_4_0= RULE_INT )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:840:3: lv_cid_4_0= RULE_INT
                    {
                    lv_cid_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleException1922); 

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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleException1941); 

                	newLeafNode(otherlv_5, grammarAccess.getExceptionAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:860:1: ( (lv_variables_6_0= ruleVariable ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_DOC)||LA19_0==48) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:861:1: (lv_variables_6_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:861:1: (lv_variables_6_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:862:3: lv_variables_6_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExceptionAccess().getVariablesVariableParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleException1962);
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

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleException1975); 

                	newLeafNode(otherlv_7, grammarAccess.getExceptionAccess().getMessageKeyword_6());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:882:1: ( (lv_message_8_0= RULE_STRING ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:883:1: (lv_message_8_0= RULE_STRING )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:883:1: (lv_message_8_0= RULE_STRING )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:884:3: lv_message_8_0= RULE_STRING
            {
            lv_message_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleException1992); 

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

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleException2009); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:912:1: entryRuleValueObject returns [EObject current=null] : iv_ruleValueObject= ruleValueObject EOF ;
    public final EObject entryRuleValueObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueObject = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:913:2: (iv_ruleValueObject= ruleValueObject EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:914:2: iv_ruleValueObject= ruleValueObject EOF
            {
             newCompositeNode(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_ruleValueObject_in_entryRuleValueObject2045);
            iv_ruleValueObject=ruleValueObject();

            state._fsp--;

             current =iv_ruleValueObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueObject2055); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:921:1: ruleValueObject returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'value-object' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) ;
    public final EObject ruleValueObject() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_10=null;
        EObject lv_metaInfo_6_0 = null;

        EObject lv_variables_7_0 = null;

        EObject lv_constructors_8_0 = null;

        EObject lv_methods_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:924:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'value-object' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:925:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'value-object' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:925:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'value-object' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:925:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'value-object' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:925:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_DOC) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:926:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:926:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:927:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleValueObject2097); 

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

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleValueObject2115); 

                	newLeafNode(otherlv_1, grammarAccess.getValueObjectAccess().getValueObjectKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:947:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:948:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:948:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:949:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValueObject2132); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:965:2: (otherlv_3= 'base' ( (otherlv_4= RULE_ID ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:965:4: otherlv_3= 'base' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleValueObject2150); 

                        	newLeafNode(otherlv_3, grammarAccess.getValueObjectAccess().getBaseKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:969:1: ( (otherlv_4= RULE_ID ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:970:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:970:1: (otherlv_4= RULE_ID )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:971:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueObjectRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValueObject2170); 

                    		newLeafNode(otherlv_4, grammarAccess.getValueObjectAccess().getBaseExternalTypeCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleValueObject2184); 

                	newLeafNode(otherlv_5, grammarAccess.getValueObjectAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:986:1: ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:987:1: (lv_metaInfo_6_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:987:1: (lv_metaInfo_6_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:988:3: lv_metaInfo_6_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getValueObjectAccess().getMetaInfoTypeMetaInfoParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleValueObject2205);
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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1004:2: ( (lv_variables_7_0= ruleVariable ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_DOC) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==RULE_ID||LA22_1==48) ) {
                        alt22=1;
                    }


                }
                else if ( (LA22_0==RULE_ID||LA22_0==48) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1005:1: (lv_variables_7_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1005:1: (lv_variables_7_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1006:3: lv_variables_7_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValueObjectAccess().getVariablesVariableParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleValueObject2226);
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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1022:3: ( (lv_constructors_8_0= ruleConstructor ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_DOC) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==38) ) {
                        alt23=1;
                    }


                }
                else if ( (LA23_0==38) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1023:1: (lv_constructors_8_0= ruleConstructor )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1023:1: (lv_constructors_8_0= ruleConstructor )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1024:3: lv_constructors_8_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValueObjectAccess().getConstructorsConstructorParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleValueObject2248);
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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1040:3: ( (lv_methods_9_0= ruleMethod ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_DOC||LA24_0==40) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1041:1: (lv_methods_9_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1041:1: (lv_methods_9_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1042:3: lv_methods_9_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValueObjectAccess().getMethodsMethodParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleValueObject2270);
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

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleValueObject2283); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1070:1: entryRuleEntityId returns [EObject current=null] : iv_ruleEntityId= ruleEntityId EOF ;
    public final EObject entryRuleEntityId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityId = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1071:2: (iv_ruleEntityId= ruleEntityId EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1072:2: iv_ruleEntityId= ruleEntityId EOF
            {
             newCompositeNode(grammarAccess.getEntityIdRule()); 
            pushFollow(FOLLOW_ruleEntityId_in_entryRuleEntityId2319);
            iv_ruleEntityId=ruleEntityId();

            state._fsp--;

             current =iv_ruleEntityId; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityId2329); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1079:1: ruleEntityId returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity-id' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifies' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'base' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}' ) ;
    public final EObject ruleEntityId() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_12=null;
        EObject lv_metaInfo_8_0 = null;

        EObject lv_variables_9_0 = null;

        EObject lv_constructors_10_0 = null;

        EObject lv_methods_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1082:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity-id' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifies' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'base' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1083:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity-id' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifies' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'base' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1083:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity-id' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifies' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'base' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1083:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity-id' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifies' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'base' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1083:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_DOC) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1084:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1084:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1085:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleEntityId2371); 

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

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleEntityId2389); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityIdAccess().getEntityIdKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1105:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1106:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1106:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1107:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityId2406); 

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

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleEntityId2423); 

                	newLeafNode(otherlv_3, grammarAccess.getEntityIdAccess().getIdentifiesKeyword_3());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1127:1: ( (otherlv_4= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1128:1: (otherlv_4= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1128:1: (otherlv_4= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1129:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityIdRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityId2443); 

            		newLeafNode(otherlv_4, grammarAccess.getEntityIdAccess().getEntityEntityCrossReference_4_0()); 
            	

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1140:2: (otherlv_5= 'base' ( (otherlv_6= RULE_ID ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1140:4: otherlv_5= 'base' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleEntityId2456); 

                        	newLeafNode(otherlv_5, grammarAccess.getEntityIdAccess().getBaseKeyword_5_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1144:1: ( (otherlv_6= RULE_ID ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1145:1: (otherlv_6= RULE_ID )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1145:1: (otherlv_6= RULE_ID )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1146:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityIdRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityId2476); 

                    		newLeafNode(otherlv_6, grammarAccess.getEntityIdAccess().getBaseExternalTypeCrossReference_5_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleEntityId2490); 

                	newLeafNode(otherlv_7, grammarAccess.getEntityIdAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1161:1: ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1162:1: (lv_metaInfo_8_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1162:1: (lv_metaInfo_8_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1163:3: lv_metaInfo_8_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getEntityIdAccess().getMetaInfoTypeMetaInfoParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleEntityId2511);
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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1179:2: ( (lv_variables_9_0= ruleVariable ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_DOC) ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==RULE_ID||LA27_1==48) ) {
                        alt27=1;
                    }


                }
                else if ( (LA27_0==RULE_ID||LA27_0==48) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1180:1: (lv_variables_9_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1180:1: (lv_variables_9_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1181:3: lv_variables_9_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityIdAccess().getVariablesVariableParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleEntityId2532);
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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1197:3: ( (lv_constructors_10_0= ruleConstructor ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_DOC) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==38) ) {
                        alt28=1;
                    }


                }
                else if ( (LA28_0==38) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1198:1: (lv_constructors_10_0= ruleConstructor )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1198:1: (lv_constructors_10_0= ruleConstructor )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1199:3: lv_constructors_10_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityIdAccess().getConstructorsConstructorParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleEntityId2554);
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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1215:3: ( (lv_methods_11_0= ruleMethod ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_DOC||LA29_0==40) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1216:1: (lv_methods_11_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1216:1: (lv_methods_11_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1217:3: lv_methods_11_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityIdAccess().getMethodsMethodParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleEntityId2576);
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

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleEntityId2589); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1245:1: entryRuleAggregateId returns [EObject current=null] : iv_ruleAggregateId= ruleAggregateId EOF ;
    public final EObject entryRuleAggregateId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregateId = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1246:2: (iv_ruleAggregateId= ruleAggregateId EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1247:2: iv_ruleAggregateId= ruleAggregateId EOF
            {
             newCompositeNode(grammarAccess.getAggregateIdRule()); 
            pushFollow(FOLLOW_ruleAggregateId_in_entryRuleAggregateId2625);
            iv_ruleAggregateId=ruleAggregateId();

            state._fsp--;

             current =iv_ruleAggregateId; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAggregateId2635); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1254:1: ruleAggregateId returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate-id' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifies' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'base' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}' ) ;
    public final EObject ruleAggregateId() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_12=null;
        EObject lv_metaInfo_8_0 = null;

        EObject lv_variables_9_0 = null;

        EObject lv_constructors_10_0 = null;

        EObject lv_methods_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1257:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate-id' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifies' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'base' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1258:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate-id' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifies' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'base' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1258:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate-id' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifies' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'base' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1258:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate-id' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifies' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'base' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1258:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_DOC) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1259:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1259:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1260:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleAggregateId2677); 

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

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleAggregateId2695); 

                	newLeafNode(otherlv_1, grammarAccess.getAggregateIdAccess().getAggregateIdKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1280:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1281:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1281:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1282:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAggregateId2712); 

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

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleAggregateId2729); 

                	newLeafNode(otherlv_3, grammarAccess.getAggregateIdAccess().getIdentifiesKeyword_3());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1302:1: ( (otherlv_4= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1303:1: (otherlv_4= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1303:1: (otherlv_4= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1304:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAggregateIdRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAggregateId2749); 

            		newLeafNode(otherlv_4, grammarAccess.getAggregateIdAccess().getEntityAggregateCrossReference_4_0()); 
            	

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1315:2: (otherlv_5= 'base' ( (otherlv_6= RULE_ID ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==25) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1315:4: otherlv_5= 'base' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleAggregateId2762); 

                        	newLeafNode(otherlv_5, grammarAccess.getAggregateIdAccess().getBaseKeyword_5_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1319:1: ( (otherlv_6= RULE_ID ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1320:1: (otherlv_6= RULE_ID )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1320:1: (otherlv_6= RULE_ID )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1321:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAggregateIdRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAggregateId2782); 

                    		newLeafNode(otherlv_6, grammarAccess.getAggregateIdAccess().getBaseExternalTypeCrossReference_5_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleAggregateId2796); 

                	newLeafNode(otherlv_7, grammarAccess.getAggregateIdAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1336:1: ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1337:1: (lv_metaInfo_8_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1337:1: (lv_metaInfo_8_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1338:3: lv_metaInfo_8_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getAggregateIdAccess().getMetaInfoTypeMetaInfoParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleAggregateId2817);
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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1354:2: ( (lv_variables_9_0= ruleVariable ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_DOC) ) {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1==RULE_ID||LA32_1==48) ) {
                        alt32=1;
                    }


                }
                else if ( (LA32_0==RULE_ID||LA32_0==48) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1355:1: (lv_variables_9_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1355:1: (lv_variables_9_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1356:3: lv_variables_9_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateIdAccess().getVariablesVariableParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleAggregateId2838);
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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1372:3: ( (lv_constructors_10_0= ruleConstructor ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_DOC) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==38) ) {
                        alt33=1;
                    }


                }
                else if ( (LA33_0==38) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1373:1: (lv_constructors_10_0= ruleConstructor )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1373:1: (lv_constructors_10_0= ruleConstructor )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1374:3: lv_constructors_10_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateIdAccess().getConstructorsConstructorParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleAggregateId2860);
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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1390:3: ( (lv_methods_11_0= ruleMethod ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_DOC||LA34_0==40) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1391:1: (lv_methods_11_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1391:1: (lv_methods_11_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1392:3: lv_methods_11_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateIdAccess().getMethodsMethodParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleAggregateId2882);
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

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleAggregateId2895); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1420:1: entryRuleEnumObject returns [EObject current=null] : iv_ruleEnumObject= ruleEnumObject EOF ;
    public final EObject entryRuleEnumObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumObject = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1421:2: (iv_ruleEnumObject= ruleEnumObject EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1422:2: iv_ruleEnumObject= ruleEnumObject EOF
            {
             newCompositeNode(grammarAccess.getEnumObjectRule()); 
            pushFollow(FOLLOW_ruleEnumObject_in_entryRuleEnumObject2931);
            iv_ruleEnumObject=ruleEnumObject();

            state._fsp--;

             current =iv_ruleEnumObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumObject2941); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1429:1: ruleEnumObject returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_metaInfo_4_0= ruleTypeMetaInfo ) ) ( (lv_variables_5_0= ruleVariable ) )* ( (lv_constructors_6_0= ruleConstructor ) )* ( (lv_methods_7_0= ruleMethod ) )* otherlv_8= 'instances' otherlv_9= '{' ( (lv_instances_10_0= ruleEnumInstance ) )+ otherlv_11= '}' otherlv_12= '}' ) ;
    public final EObject ruleEnumObject() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_metaInfo_4_0 = null;

        EObject lv_variables_5_0 = null;

        EObject lv_constructors_6_0 = null;

        EObject lv_methods_7_0 = null;

        EObject lv_instances_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1432:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_metaInfo_4_0= ruleTypeMetaInfo ) ) ( (lv_variables_5_0= ruleVariable ) )* ( (lv_constructors_6_0= ruleConstructor ) )* ( (lv_methods_7_0= ruleMethod ) )* otherlv_8= 'instances' otherlv_9= '{' ( (lv_instances_10_0= ruleEnumInstance ) )+ otherlv_11= '}' otherlv_12= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1433:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_metaInfo_4_0= ruleTypeMetaInfo ) ) ( (lv_variables_5_0= ruleVariable ) )* ( (lv_constructors_6_0= ruleConstructor ) )* ( (lv_methods_7_0= ruleMethod ) )* otherlv_8= 'instances' otherlv_9= '{' ( (lv_instances_10_0= ruleEnumInstance ) )+ otherlv_11= '}' otherlv_12= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1433:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_metaInfo_4_0= ruleTypeMetaInfo ) ) ( (lv_variables_5_0= ruleVariable ) )* ( (lv_constructors_6_0= ruleConstructor ) )* ( (lv_methods_7_0= ruleMethod ) )* otherlv_8= 'instances' otherlv_9= '{' ( (lv_instances_10_0= ruleEnumInstance ) )+ otherlv_11= '}' otherlv_12= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1433:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_metaInfo_4_0= ruleTypeMetaInfo ) ) ( (lv_variables_5_0= ruleVariable ) )* ( (lv_constructors_6_0= ruleConstructor ) )* ( (lv_methods_7_0= ruleMethod ) )* otherlv_8= 'instances' otherlv_9= '{' ( (lv_instances_10_0= ruleEnumInstance ) )+ otherlv_11= '}' otherlv_12= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1433:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_DOC) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1434:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1434:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1435:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleEnumObject2983); 

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

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleEnumObject3001); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumObjectAccess().getEnumKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1455:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1456:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1456:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1457:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumObject3018); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleEnumObject3035); 

                	newLeafNode(otherlv_3, grammarAccess.getEnumObjectAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1477:1: ( (lv_metaInfo_4_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1478:1: (lv_metaInfo_4_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1478:1: (lv_metaInfo_4_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1479:3: lv_metaInfo_4_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getEnumObjectAccess().getMetaInfoTypeMetaInfoParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleEnumObject3056);
            lv_metaInfo_4_0=ruleTypeMetaInfo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumObjectRule());
            	        }
                   		set(
                   			current, 
                   			"metaInfo",
                    		lv_metaInfo_4_0, 
                    		"TypeMetaInfo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1495:2: ( (lv_variables_5_0= ruleVariable ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_DOC) ) {
                    int LA36_1 = input.LA(2);

                    if ( (LA36_1==RULE_ID||LA36_1==48) ) {
                        alt36=1;
                    }


                }
                else if ( (LA36_0==RULE_ID||LA36_0==48) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1496:1: (lv_variables_5_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1496:1: (lv_variables_5_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1497:3: lv_variables_5_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumObjectAccess().getVariablesVariableParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleEnumObject3077);
            	    lv_variables_5_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_5_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1513:3: ( (lv_constructors_6_0= ruleConstructor ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_DOC) ) {
                    int LA37_1 = input.LA(2);

                    if ( (LA37_1==38) ) {
                        alt37=1;
                    }


                }
                else if ( (LA37_0==38) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1514:1: (lv_constructors_6_0= ruleConstructor )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1514:1: (lv_constructors_6_0= ruleConstructor )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1515:3: lv_constructors_6_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumObjectAccess().getConstructorsConstructorParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleEnumObject3099);
            	    lv_constructors_6_0=ruleConstructor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constructors",
            	            		lv_constructors_6_0, 
            	            		"Constructor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1531:3: ( (lv_methods_7_0= ruleMethod ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_DOC||LA38_0==40) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1532:1: (lv_methods_7_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1532:1: (lv_methods_7_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1533:3: lv_methods_7_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumObjectAccess().getMethodsMethodParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleEnumObject3121);
            	    lv_methods_7_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_7_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleEnumObject3134); 

                	newLeafNode(otherlv_8, grammarAccess.getEnumObjectAccess().getInstancesKeyword_8());
                
            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleEnumObject3146); 

                	newLeafNode(otherlv_9, grammarAccess.getEnumObjectAccess().getLeftCurlyBracketKeyword_9());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1557:1: ( (lv_instances_10_0= ruleEnumInstance ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_DOC)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1558:1: (lv_instances_10_0= ruleEnumInstance )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1558:1: (lv_instances_10_0= ruleEnumInstance )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1559:3: lv_instances_10_0= ruleEnumInstance
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumObjectAccess().getInstancesEnumInstanceParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumInstance_in_ruleEnumObject3167);
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
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleEnumObject3180); 

                	newLeafNode(otherlv_11, grammarAccess.getEnumObjectAccess().getRightCurlyBracketKeyword_11());
                
            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleEnumObject3192); 

                	newLeafNode(otherlv_12, grammarAccess.getEnumObjectAccess().getRightCurlyBracketKeyword_12());
                

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1591:1: entryRuleEnumInstance returns [EObject current=null] : iv_ruleEnumInstance= ruleEnumInstance EOF ;
    public final EObject entryRuleEnumInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumInstance = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1592:2: (iv_ruleEnumInstance= ruleEnumInstance EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1593:2: iv_ruleEnumInstance= ruleEnumInstance EOF
            {
             newCompositeNode(grammarAccess.getEnumInstanceRule()); 
            pushFollow(FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance3228);
            iv_ruleEnumInstance=ruleEnumInstance();

            state._fsp--;

             current =iv_ruleEnumInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumInstance3238); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1600:1: ruleEnumInstance returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleEnumInstance() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1603:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )* otherlv_6= ')' )? ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1604:1: ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )* otherlv_6= ')' )? )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1604:1: ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )* otherlv_6= ')' )? )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1604:2: ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )* otherlv_6= ')' )?
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1604:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_DOC) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1605:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1605:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1606:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleEnumInstance3280); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1622:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1623:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1623:1: (lv_name_1_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1624:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance3303); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnumInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumInstanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1640:2: (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )* otherlv_6= ')' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==31) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1640:4: otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleEnumInstance3321); 

                        	newLeafNode(otherlv_2, grammarAccess.getEnumInstanceAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1644:1: ( (lv_params_3_0= ruleLiteral ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1645:1: (lv_params_3_0= ruleLiteral )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1645:1: (lv_params_3_0= ruleLiteral )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1646:3: lv_params_3_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumInstanceAccess().getParamsLiteralParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleEnumInstance3342);
                    lv_params_3_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnumInstanceRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_3_0, 
                            		"Literal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1662:2: (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==32) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1662:4: otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) )
                    	    {
                    	    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleEnumInstance3355); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getEnumInstanceAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1666:1: ( (lv_params_5_0= ruleLiteral ) )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1667:1: (lv_params_5_0= ruleLiteral )
                    	    {
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1667:1: (lv_params_5_0= ruleLiteral )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1668:3: lv_params_5_0= ruleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEnumInstanceAccess().getParamsLiteralParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteral_in_ruleEnumInstance3376);
                    	    lv_params_5_0=ruleLiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEnumInstanceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_5_0, 
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

                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleEnumInstance3390); 

                        	newLeafNode(otherlv_6, grammarAccess.getEnumInstanceAccess().getRightParenthesisKeyword_2_3());
                        

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


    // $ANTLR start "entryRuleEntity"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1696:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1697:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1698:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity3428);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity3438); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1705:1: ruleEntity returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'root' ( (otherlv_6= RULE_ID ) ) otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_12=null;
        EObject lv_metaInfo_8_0 = null;

        EObject lv_variables_9_0 = null;

        EObject lv_constructors_10_0 = null;

        EObject lv_methods_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1708:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'root' ( (otherlv_6= RULE_ID ) ) otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1709:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'root' ( (otherlv_6= RULE_ID ) ) otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1709:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'root' ( (otherlv_6= RULE_ID ) ) otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1709:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'root' ( (otherlv_6= RULE_ID ) ) otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1709:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_DOC) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1710:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1710:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1711:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleEntity3480); 

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

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleEntity3498); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1731:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1732:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1732:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1733:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity3515); 

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

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleEntity3532); 

                	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getIdentifierKeyword_3());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1753:1: ( (otherlv_4= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1754:1: (otherlv_4= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1754:1: (otherlv_4= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1755:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity3552); 

            		newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getIdTypeEntityIdCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleEntity3564); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getRootKeyword_5());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1770:1: ( (otherlv_6= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1771:1: (otherlv_6= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1771:1: (otherlv_6= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1772:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity3584); 

            		newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRootAggregateCrossReference_6_0()); 
            	

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleEntity3596); 

                	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_7());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1787:1: ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1788:1: (lv_metaInfo_8_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1788:1: (lv_metaInfo_8_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1789:3: lv_metaInfo_8_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getMetaInfoTypeMetaInfoParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleEntity3617);
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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1805:2: ( (lv_variables_9_0= ruleVariable ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_DOC) ) {
                    int LA44_1 = input.LA(2);

                    if ( (LA44_1==RULE_ID||LA44_1==48) ) {
                        alt44=1;
                    }


                }
                else if ( (LA44_0==RULE_ID||LA44_0==48) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1806:1: (lv_variables_9_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1806:1: (lv_variables_9_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1807:3: lv_variables_9_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getVariablesVariableParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleEntity3638);
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
            	    break loop44;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1823:3: ( (lv_constructors_10_0= ruleConstructor ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_DOC) ) {
                    int LA45_1 = input.LA(2);

                    if ( (LA45_1==38) ) {
                        alt45=1;
                    }


                }
                else if ( (LA45_0==38) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1824:1: (lv_constructors_10_0= ruleConstructor )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1824:1: (lv_constructors_10_0= ruleConstructor )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1825:3: lv_constructors_10_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getConstructorsConstructorParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleEntity3660);
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
            	    break loop45;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1841:3: ( (lv_methods_11_0= ruleMethod ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_DOC||LA46_0==40) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1842:1: (lv_methods_11_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1842:1: (lv_methods_11_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1843:3: lv_methods_11_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getMethodsMethodParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleEntity3682);
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
            	    break loop46;
                }
            } while (true);

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleEntity3695); 

                	newLeafNode(otherlv_12, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_12());
                

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1871:1: entryRuleAggregate returns [EObject current=null] : iv_ruleAggregate= ruleAggregate EOF ;
    public final EObject entryRuleAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregate = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1872:2: (iv_ruleAggregate= ruleAggregate EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1873:2: iv_ruleAggregate= ruleAggregate EOF
            {
             newCompositeNode(grammarAccess.getAggregateRule()); 
            pushFollow(FOLLOW_ruleAggregate_in_entryRuleAggregate3731);
            iv_ruleAggregate=ruleAggregate();

            state._fsp--;

             current =iv_ruleAggregate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAggregate3741); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1880:1: ruleAggregate returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) ;
    public final EObject ruleAggregate() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_10=null;
        EObject lv_metaInfo_6_0 = null;

        EObject lv_variables_7_0 = null;

        EObject lv_constructors_8_0 = null;

        EObject lv_methods_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1883:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1884:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1884:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1884:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'aggregate' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1884:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_DOC) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1885:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1885:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1886:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleAggregate3783); 

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

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleAggregate3801); 

                	newLeafNode(otherlv_1, grammarAccess.getAggregateAccess().getAggregateKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1906:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1907:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1907:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1908:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAggregate3818); 

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

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleAggregate3835); 

                	newLeafNode(otherlv_3, grammarAccess.getAggregateAccess().getIdentifierKeyword_3());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1928:1: ( (otherlv_4= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1929:1: (otherlv_4= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1929:1: (otherlv_4= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1930:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAggregateRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAggregate3855); 

            		newLeafNode(otherlv_4, grammarAccess.getAggregateAccess().getIdTypeAggregateIdCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleAggregate3867); 

                	newLeafNode(otherlv_5, grammarAccess.getAggregateAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1945:1: ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1946:1: (lv_metaInfo_6_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1946:1: (lv_metaInfo_6_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1947:3: lv_metaInfo_6_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getAggregateAccess().getMetaInfoTypeMetaInfoParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleAggregate3888);
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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1963:2: ( (lv_variables_7_0= ruleVariable ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_DOC) ) {
                    int LA48_1 = input.LA(2);

                    if ( (LA48_1==RULE_ID||LA48_1==48) ) {
                        alt48=1;
                    }


                }
                else if ( (LA48_0==RULE_ID||LA48_0==48) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1964:1: (lv_variables_7_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1964:1: (lv_variables_7_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1965:3: lv_variables_7_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateAccess().getVariablesVariableParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleAggregate3909);
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
            	    break loop48;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1981:3: ( (lv_constructors_8_0= ruleConstructor ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_DOC) ) {
                    int LA49_1 = input.LA(2);

                    if ( (LA49_1==38) ) {
                        alt49=1;
                    }


                }
                else if ( (LA49_0==38) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1982:1: (lv_constructors_8_0= ruleConstructor )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1982:1: (lv_constructors_8_0= ruleConstructor )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1983:3: lv_constructors_8_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateAccess().getConstructorsConstructorParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleAggregate3931);
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
            	    break loop49;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1999:3: ( (lv_methods_9_0= ruleMethod ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_DOC||LA50_0==40) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2000:1: (lv_methods_9_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2000:1: (lv_methods_9_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2001:3: lv_methods_9_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateAccess().getMethodsMethodParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleAggregate3953);
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
            	    break loop50;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleAggregate3966); 

                	newLeafNode(otherlv_10, grammarAccess.getAggregateAccess().getRightCurlyBracketKeyword_10());
                

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2031:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2032:2: (iv_ruleConstructor= ruleConstructor EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2033:2: iv_ruleConstructor= ruleConstructor EOF
            {
             newCompositeNode(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_ruleConstructor_in_entryRuleConstructor4004);
            iv_ruleConstructor=ruleConstructor();

            state._fsp--;

             current =iv_ruleConstructor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor4014); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2040:1: ruleConstructor returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constructor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* ( (otherlv_5= RULE_ID ) )? ( (lv_constraints_6_0= ruleConstraints ) )? ( (lv_events_7_0= ruleEvent ) )* otherlv_8= '}' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_variables_4_0 = null;

        EObject lv_constraints_6_0 = null;

        EObject lv_events_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2043:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constructor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* ( (otherlv_5= RULE_ID ) )? ( (lv_constraints_6_0= ruleConstraints ) )? ( (lv_events_7_0= ruleEvent ) )* otherlv_8= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2044:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constructor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* ( (otherlv_5= RULE_ID ) )? ( (lv_constraints_6_0= ruleConstraints ) )? ( (lv_events_7_0= ruleEvent ) )* otherlv_8= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2044:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constructor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* ( (otherlv_5= RULE_ID ) )? ( (lv_constraints_6_0= ruleConstraints ) )? ( (lv_events_7_0= ruleEvent ) )* otherlv_8= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2044:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constructor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* ( (otherlv_5= RULE_ID ) )? ( (lv_constraints_6_0= ruleConstraints ) )? ( (lv_events_7_0= ruleEvent ) )* otherlv_8= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2044:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_DOC) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2045:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2045:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2046:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleConstructor4056); 

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

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleConstructor4074); 

                	newLeafNode(otherlv_1, grammarAccess.getConstructorAccess().getConstructorKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2066:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2067:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2067:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2068:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor4091); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleConstructor4108); 

                	newLeafNode(otherlv_3, grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2088:1: ( (lv_variables_4_0= ruleVariable ) )*
            loop52:
            do {
                int alt52=2;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA52_1 = input.LA(2);

                    if ( (LA52_1==RULE_ID||LA52_1==49) ) {
                        alt52=1;
                    }


                    }
                    break;
                case RULE_DOC:
                    {
                    int LA52_3 = input.LA(2);

                    if ( (LA52_3==RULE_ID||LA52_3==48) ) {
                        alt52=1;
                    }


                    }
                    break;
                case 48:
                    {
                    alt52=1;
                    }
                    break;

                }

                switch (alt52) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2089:1: (lv_variables_4_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2089:1: (lv_variables_4_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2090:3: lv_variables_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstructorAccess().getVariablesVariableParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleConstructor4129);
            	    lv_variables_4_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
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
            	    break loop52;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2106:3: ( (otherlv_5= RULE_ID ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2107:1: (otherlv_5= RULE_ID )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2107:1: (otherlv_5= RULE_ID )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2108:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstructorRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor4150); 

                    		newLeafNode(otherlv_5, grammarAccess.getConstructorAccess().getServiceServiceCrossReference_5_0()); 
                    	

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2119:3: ( (lv_constraints_6_0= ruleConstraints ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==50) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2120:1: (lv_constraints_6_0= ruleConstraints )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2120:1: (lv_constraints_6_0= ruleConstraints )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2121:3: lv_constraints_6_0= ruleConstraints
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstructorAccess().getConstraintsConstraintsParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstraints_in_ruleConstructor4172);
                    lv_constraints_6_0=ruleConstraints();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
                    	        }
                           		set(
                           			current, 
                           			"constraints",
                            		lv_constraints_6_0, 
                            		"Constraints");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2137:3: ( (lv_events_7_0= ruleEvent ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_DOC||LA55_0==42) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2138:1: (lv_events_7_0= ruleEvent )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2138:1: (lv_events_7_0= ruleEvent )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2139:3: lv_events_7_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstructorAccess().getEventsEventParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleConstructor4194);
            	    lv_events_7_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_7_0, 
            	            		"Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleConstructor4207); 

                	newLeafNode(otherlv_8, grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2167:1: entryRuleReturnType returns [EObject current=null] : iv_ruleReturnType= ruleReturnType EOF ;
    public final EObject entryRuleReturnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnType = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2168:2: (iv_ruleReturnType= ruleReturnType EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2169:2: iv_ruleReturnType= ruleReturnType EOF
            {
             newCompositeNode(grammarAccess.getReturnTypeRule()); 
            pushFollow(FOLLOW_ruleReturnType_in_entryRuleReturnType4243);
            iv_ruleReturnType=ruleReturnType();

            state._fsp--;

             current =iv_ruleReturnType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnType4253); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2176:1: ruleReturnType returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'returns' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleReturnType() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2179:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'returns' ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2180:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'returns' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2180:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'returns' ( (otherlv_2= RULE_ID ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2180:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'returns' ( (otherlv_2= RULE_ID ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2180:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_DOC) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2181:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2181:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2182:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleReturnType4295); 

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

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleReturnType4313); 

                	newLeafNode(otherlv_1, grammarAccess.getReturnTypeAccess().getReturnsKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2202:1: ( (otherlv_2= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2203:1: (otherlv_2= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2203:1: (otherlv_2= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2204:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReturnTypeRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReturnType4333); 

            		newLeafNode(otherlv_2, grammarAccess.getReturnTypeAccess().getTypeTypeCrossReference_2_0()); 
            	

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2223:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2224:2: (iv_ruleMethod= ruleMethod EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2225:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod4369);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod4379); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2232:1: ruleMethod returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'ref' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* ( (otherlv_7= RULE_ID ) )? ( (lv_returnType_8_0= ruleReturnType ) )? ( (lv_constraints_9_0= ruleConstraints ) )? ( (lv_events_10_0= ruleEvent ) )* otherlv_11= '}' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        EObject lv_variables_6_0 = null;

        EObject lv_returnType_8_0 = null;

        EObject lv_constraints_9_0 = null;

        EObject lv_events_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2235:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'ref' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* ( (otherlv_7= RULE_ID ) )? ( (lv_returnType_8_0= ruleReturnType ) )? ( (lv_constraints_9_0= ruleConstraints ) )? ( (lv_events_10_0= ruleEvent ) )* otherlv_11= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2236:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'ref' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* ( (otherlv_7= RULE_ID ) )? ( (lv_returnType_8_0= ruleReturnType ) )? ( (lv_constraints_9_0= ruleConstraints ) )? ( (lv_events_10_0= ruleEvent ) )* otherlv_11= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2236:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'ref' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* ( (otherlv_7= RULE_ID ) )? ( (lv_returnType_8_0= ruleReturnType ) )? ( (lv_constraints_9_0= ruleConstraints ) )? ( (lv_events_10_0= ruleEvent ) )* otherlv_11= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2236:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'ref' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* ( (otherlv_7= RULE_ID ) )? ( (lv_returnType_8_0= ruleReturnType ) )? ( (lv_constraints_9_0= ruleConstraints ) )? ( (lv_events_10_0= ruleEvent ) )* otherlv_11= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2236:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_DOC) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2237:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2237:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2238:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleMethod4421); 

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

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleMethod4439); 

                	newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getMethodKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2258:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2259:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2259:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2260:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod4456); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2276:2: (otherlv_3= 'ref' ( ( ruleFQN ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==41) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2276:4: otherlv_3= 'ref' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleMethod4474); 

                        	newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getRefKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2280:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2281:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2281:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2282:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getRefMethodMethodCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleMethod4497);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleMethod4511); 

                	newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2299:1: ( (lv_variables_6_0= ruleVariable ) )*
            loop59:
            do {
                int alt59=2;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA59_1 = input.LA(2);

                    if ( (LA59_1==RULE_ID||LA59_1==49) ) {
                        alt59=1;
                    }


                    }
                    break;
                case RULE_DOC:
                    {
                    int LA59_2 = input.LA(2);

                    if ( (LA59_2==RULE_ID||LA59_2==48) ) {
                        alt59=1;
                    }


                    }
                    break;
                case 48:
                    {
                    alt59=1;
                    }
                    break;

                }

                switch (alt59) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2300:1: (lv_variables_6_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2300:1: (lv_variables_6_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2301:3: lv_variables_6_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getVariablesVariableParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleMethod4532);
            	    lv_variables_6_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
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
            	    break loop59;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2317:3: ( (otherlv_7= RULE_ID ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2318:1: (otherlv_7= RULE_ID )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2318:1: (otherlv_7= RULE_ID )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2319:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod4553); 

                    		newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getServiceServiceCrossReference_6_0()); 
                    	

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2330:3: ( (lv_returnType_8_0= ruleReturnType ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_DOC) ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==39) ) {
                    alt61=1;
                }
            }
            else if ( (LA61_0==39) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2331:1: (lv_returnType_8_0= ruleReturnType )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2331:1: (lv_returnType_8_0= ruleReturnType )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2332:3: lv_returnType_8_0= ruleReturnType
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getReturnTypeReturnTypeParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleReturnType_in_ruleMethod4575);
                    lv_returnType_8_0=ruleReturnType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	        }
                           		set(
                           			current, 
                           			"returnType",
                            		lv_returnType_8_0, 
                            		"ReturnType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2348:3: ( (lv_constraints_9_0= ruleConstraints ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==50) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2349:1: (lv_constraints_9_0= ruleConstraints )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2349:1: (lv_constraints_9_0= ruleConstraints )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2350:3: lv_constraints_9_0= ruleConstraints
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getConstraintsConstraintsParserRuleCall_8_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstraints_in_ruleMethod4597);
                    lv_constraints_9_0=ruleConstraints();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	        }
                           		set(
                           			current, 
                           			"constraints",
                            		lv_constraints_9_0, 
                            		"Constraints");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2366:3: ( (lv_events_10_0= ruleEvent ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_DOC||LA63_0==42) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2367:1: (lv_events_10_0= ruleEvent )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2367:1: (lv_events_10_0= ruleEvent )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2368:3: lv_events_10_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getEventsEventParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleMethod4619);
            	    lv_events_10_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
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
            	    break loop63;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleMethod4632); 

                	newLeafNode(otherlv_11, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_10());
                

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


    // $ANTLR start "entryRuleEvent"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2396:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2397:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2398:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent4668);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent4678); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2405:1: ruleEvent returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* (otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) ;
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
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2408:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* (otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2409:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* (otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2409:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* (otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2409:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* (otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) ) )? otherlv_7= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2409:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_DOC) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2410:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2410:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2411:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleEvent4720); 

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

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleEvent4738); 

                	newLeafNode(otherlv_1, grammarAccess.getEventAccess().getEventKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2431:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2432:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2432:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2433:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent4755); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleEvent4772); 

                	newLeafNode(otherlv_3, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2453:1: ( (lv_variables_4_0= ruleVariable ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0>=RULE_ID && LA65_0<=RULE_DOC)||LA65_0==48) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2454:1: (lv_variables_4_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2454:1: (lv_variables_4_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2455:3: lv_variables_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEventAccess().getVariablesVariableParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleEvent4793);
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
            	    break loop65;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2471:3: (otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==22) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2471:5: otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleEvent4807); 

                        	newLeafNode(otherlv_5, grammarAccess.getEventAccess().getMessageKeyword_5_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2475:1: ( (lv_message_6_0= RULE_STRING ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2476:1: (lv_message_6_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2476:1: (lv_message_6_0= RULE_STRING )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2477:3: lv_message_6_0= RULE_STRING
                    {
                    lv_message_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEvent4824); 

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

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleEvent4843); 

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


    // $ANTLR start "entryRuleTypeMetaInfo"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2505:1: entryRuleTypeMetaInfo returns [EObject current=null] : iv_ruleTypeMetaInfo= ruleTypeMetaInfo EOF ;
    public final EObject entryRuleTypeMetaInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeMetaInfo = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2506:2: (iv_ruleTypeMetaInfo= ruleTypeMetaInfo EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2507:2: iv_ruleTypeMetaInfo= ruleTypeMetaInfo EOF
            {
             newCompositeNode(grammarAccess.getTypeMetaInfoRule()); 
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_entryRuleTypeMetaInfo4879);
            iv_ruleTypeMetaInfo=ruleTypeMetaInfo();

            state._fsp--;

             current =iv_ruleTypeMetaInfo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeMetaInfo4889); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2514:1: ruleTypeMetaInfo returns [EObject current=null] : ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )* )? ) ;
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
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2517:28: ( ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )* )? ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2518:1: ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )* )? )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2518:1: ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )* )? )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2518:2: () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )* )?
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2518:2: ()
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2519:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTypeMetaInfoAccess().getTypeMetaInfoAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2524:2: (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==43) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2524:4: otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleTypeMetaInfo4936); 

                        	newLeafNode(otherlv_1, grammarAccess.getTypeMetaInfoAccess().getSlabelKeyword_1_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2528:1: ( (lv_slabel_2_0= RULE_STRING ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2529:1: (lv_slabel_2_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2529:1: (lv_slabel_2_0= RULE_STRING )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2530:3: lv_slabel_2_0= RULE_STRING
                    {
                    lv_slabel_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo4953); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2546:4: (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==44) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2546:6: otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleTypeMetaInfo4973); 

                        	newLeafNode(otherlv_3, grammarAccess.getTypeMetaInfoAccess().getLabelKeyword_2_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2550:1: ( (lv_label_4_0= RULE_STRING ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2551:1: (lv_label_4_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2551:1: (lv_label_4_0= RULE_STRING )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2552:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo4990); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2568:4: (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==45) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2568:6: otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleTypeMetaInfo5010); 

                        	newLeafNode(otherlv_5, grammarAccess.getTypeMetaInfoAccess().getTooltipKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2572:1: ( (lv_tooltip_6_0= RULE_STRING ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2573:1: (lv_tooltip_6_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2573:1: (lv_tooltip_6_0= RULE_STRING )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2574:3: lv_tooltip_6_0= RULE_STRING
                    {
                    lv_tooltip_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo5027); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2590:4: (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==46) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2590:6: otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleTypeMetaInfo5047); 

                        	newLeafNode(otherlv_7, grammarAccess.getTypeMetaInfoAccess().getPromptKeyword_4_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2594:1: ( (lv_prompt_8_0= RULE_STRING ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2595:1: (lv_prompt_8_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2595:1: (lv_prompt_8_0= RULE_STRING )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2596:3: lv_prompt_8_0= RULE_STRING
                    {
                    lv_prompt_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo5064); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2612:4: (otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )* )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==47) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2612:6: otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )*
                    {
                    otherlv_9=(Token)match(input,47,FOLLOW_47_in_ruleTypeMetaInfo5084); 

                        	newLeafNode(otherlv_9, grammarAccess.getTypeMetaInfoAccess().getExamplesKeyword_5_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2616:1: ( (lv_examples_10_0= RULE_STRING ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==RULE_STRING) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2617:1: (lv_examples_10_0= RULE_STRING )
                    	    {
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2617:1: (lv_examples_10_0= RULE_STRING )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2618:3: lv_examples_10_0= RULE_STRING
                    	    {
                    	    lv_examples_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo5101); 

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
                    	    break loop71;
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2642:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2643:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2644:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable5145);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable5155); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2651:1: ruleVariable returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token lv_nullable_1_0=null;
        Token otherlv_2=null;
        Token lv_multiplicity_3_0=null;
        Token lv_name_4_0=null;
        EObject lv_invariants_5_0 = null;

        EObject lv_overridden_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2654:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2655:1: ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2655:1: ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2655:2: ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )?
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2655:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_DOC) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2656:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2656:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2657:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleVariable5197); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2673:3: ( (lv_nullable_1_0= 'nullable' ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==48) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2674:1: (lv_nullable_1_0= 'nullable' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2674:1: (lv_nullable_1_0= 'nullable' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2675:3: lv_nullable_1_0= 'nullable'
                    {
                    lv_nullable_1_0=(Token)match(input,48,FOLLOW_48_in_ruleVariable5221); 

                            newLeafNode(lv_nullable_1_0, grammarAccess.getVariableAccess().getNullableNullableKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableRule());
                    	        }
                           		setWithLastConsumed(current, "nullable", lv_nullable_1_0, "nullable");
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2688:3: ( (otherlv_2= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2689:1: (otherlv_2= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2689:1: (otherlv_2= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2690:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable5255); 

            		newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getTypeTypeCrossReference_2_0()); 
            	

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2701:2: ( (lv_multiplicity_3_0= '*' ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==49) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2702:1: (lv_multiplicity_3_0= '*' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2702:1: (lv_multiplicity_3_0= '*' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2703:3: lv_multiplicity_3_0= '*'
                    {
                    lv_multiplicity_3_0=(Token)match(input,49,FOLLOW_49_in_ruleVariable5273); 

                            newLeafNode(lv_multiplicity_3_0, grammarAccess.getVariableAccess().getMultiplicityAsteriskKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableRule());
                    	        }
                           		setWithLastConsumed(current, "multiplicity", lv_multiplicity_3_0, "*");
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2716:3: ( (lv_name_4_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2717:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2717:1: (lv_name_4_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2718:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable5304); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2734:2: ( (lv_invariants_5_0= ruleInvariants ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==51) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2735:1: (lv_invariants_5_0= ruleInvariants )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2735:1: (lv_invariants_5_0= ruleInvariants )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2736:3: lv_invariants_5_0= ruleInvariants
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getInvariantsInvariantsParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInvariants_in_ruleVariable5330);
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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2752:3: ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==14) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2753:1: (lv_overridden_6_0= ruleOverriddenTypeMetaInfo )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2753:1: (lv_overridden_6_0= ruleOverriddenTypeMetaInfo )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2754:3: lv_overridden_6_0= ruleOverriddenTypeMetaInfo
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getOverriddenOverriddenTypeMetaInfoParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOverriddenTypeMetaInfo_in_ruleVariable5352);
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


    // $ANTLR start "entryRuleConstraints"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2778:1: entryRuleConstraints returns [EObject current=null] : iv_ruleConstraints= ruleConstraints EOF ;
    public final EObject entryRuleConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraints = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2779:2: (iv_ruleConstraints= ruleConstraints EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2780:2: iv_ruleConstraints= ruleConstraints EOF
            {
             newCompositeNode(grammarAccess.getConstraintsRule()); 
            pushFollow(FOLLOW_ruleConstraints_in_entryRuleConstraints5389);
            iv_ruleConstraints=ruleConstraints();

            state._fsp--;

             current =iv_ruleConstraints; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraints5399); 

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
    // $ANTLR end "entryRuleConstraints"


    // $ANTLR start "ruleConstraints"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2787:1: ruleConstraints returns [EObject current=null] : (otherlv_0= 'constraints' otherlv_1= '{' ( (lv_calls_2_0= ruleConstraintCall ) ) (otherlv_3= ',' ( (lv_calls_4_0= ruleConstraintCall ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleConstraints() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_calls_2_0 = null;

        EObject lv_calls_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2790:28: ( (otherlv_0= 'constraints' otherlv_1= '{' ( (lv_calls_2_0= ruleConstraintCall ) ) (otherlv_3= ',' ( (lv_calls_4_0= ruleConstraintCall ) ) )* otherlv_5= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2791:1: (otherlv_0= 'constraints' otherlv_1= '{' ( (lv_calls_2_0= ruleConstraintCall ) ) (otherlv_3= ',' ( (lv_calls_4_0= ruleConstraintCall ) ) )* otherlv_5= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2791:1: (otherlv_0= 'constraints' otherlv_1= '{' ( (lv_calls_2_0= ruleConstraintCall ) ) (otherlv_3= ',' ( (lv_calls_4_0= ruleConstraintCall ) ) )* otherlv_5= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2791:3: otherlv_0= 'constraints' otherlv_1= '{' ( (lv_calls_2_0= ruleConstraintCall ) ) (otherlv_3= ',' ( (lv_calls_4_0= ruleConstraintCall ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleConstraints5436); 

                	newLeafNode(otherlv_0, grammarAccess.getConstraintsAccess().getConstraintsKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleConstraints5448); 

                	newLeafNode(otherlv_1, grammarAccess.getConstraintsAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2799:1: ( (lv_calls_2_0= ruleConstraintCall ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2800:1: (lv_calls_2_0= ruleConstraintCall )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2800:1: (lv_calls_2_0= ruleConstraintCall )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2801:3: lv_calls_2_0= ruleConstraintCall
            {
             
            	        newCompositeNode(grammarAccess.getConstraintsAccess().getCallsConstraintCallParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintCall_in_ruleConstraints5469);
            lv_calls_2_0=ruleConstraintCall();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintsRule());
            	        }
                   		add(
                   			current, 
                   			"calls",
                    		lv_calls_2_0, 
                    		"ConstraintCall");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2817:2: (otherlv_3= ',' ( (lv_calls_4_0= ruleConstraintCall ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==32) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2817:4: otherlv_3= ',' ( (lv_calls_4_0= ruleConstraintCall ) )
            	    {
            	    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleConstraints5482); 

            	        	newLeafNode(otherlv_3, grammarAccess.getConstraintsAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2821:1: ( (lv_calls_4_0= ruleConstraintCall ) )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2822:1: (lv_calls_4_0= ruleConstraintCall )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2822:1: (lv_calls_4_0= ruleConstraintCall )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2823:3: lv_calls_4_0= ruleConstraintCall
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstraintsAccess().getCallsConstraintCallParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstraintCall_in_ruleConstraints5503);
            	    lv_calls_4_0=ruleConstraintCall();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstraintsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"calls",
            	            		lv_calls_4_0, 
            	            		"ConstraintCall");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleConstraints5517); 

                	newLeafNode(otherlv_5, grammarAccess.getConstraintsAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleConstraints"


    // $ANTLR start "entryRuleInvariants"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2851:1: entryRuleInvariants returns [EObject current=null] : iv_ruleInvariants= ruleInvariants EOF ;
    public final EObject entryRuleInvariants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariants = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2852:2: (iv_ruleInvariants= ruleInvariants EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2853:2: iv_ruleInvariants= ruleInvariants EOF
            {
             newCompositeNode(grammarAccess.getInvariantsRule()); 
            pushFollow(FOLLOW_ruleInvariants_in_entryRuleInvariants5553);
            iv_ruleInvariants=ruleInvariants();

            state._fsp--;

             current =iv_ruleInvariants; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvariants5563); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2860:1: ruleInvariants returns [EObject current=null] : (otherlv_0= 'invariants' ( (lv_calls_1_0= ruleConstraintCall ) ) (otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) ) )* ) ;
    public final EObject ruleInvariants() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_calls_1_0 = null;

        EObject lv_calls_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2863:28: ( (otherlv_0= 'invariants' ( (lv_calls_1_0= ruleConstraintCall ) ) (otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) ) )* ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2864:1: (otherlv_0= 'invariants' ( (lv_calls_1_0= ruleConstraintCall ) ) (otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) ) )* )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2864:1: (otherlv_0= 'invariants' ( (lv_calls_1_0= ruleConstraintCall ) ) (otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) ) )* )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2864:3: otherlv_0= 'invariants' ( (lv_calls_1_0= ruleConstraintCall ) ) (otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) ) )*
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleInvariants5600); 

                	newLeafNode(otherlv_0, grammarAccess.getInvariantsAccess().getInvariantsKeyword_0());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2868:1: ( (lv_calls_1_0= ruleConstraintCall ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2869:1: (lv_calls_1_0= ruleConstraintCall )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2869:1: (lv_calls_1_0= ruleConstraintCall )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2870:3: lv_calls_1_0= ruleConstraintCall
            {
             
            	        newCompositeNode(grammarAccess.getInvariantsAccess().getCallsConstraintCallParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintCall_in_ruleInvariants5621);
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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2886:2: (otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==32) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2886:4: otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) )
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleInvariants5634); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInvariantsAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2890:1: ( (lv_calls_3_0= ruleConstraintCall ) )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2891:1: (lv_calls_3_0= ruleConstraintCall )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2891:1: (lv_calls_3_0= ruleConstraintCall )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2892:3: lv_calls_3_0= ruleConstraintCall
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInvariantsAccess().getCallsConstraintCallParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstraintCall_in_ruleInvariants5655);
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
            	    break loop79;
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2916:1: entryRuleOverriddenTypeMetaInfo returns [EObject current=null] : iv_ruleOverriddenTypeMetaInfo= ruleOverriddenTypeMetaInfo EOF ;
    public final EObject entryRuleOverriddenTypeMetaInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverriddenTypeMetaInfo = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2917:2: (iv_ruleOverriddenTypeMetaInfo= ruleOverriddenTypeMetaInfo EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2918:2: iv_ruleOverriddenTypeMetaInfo= ruleOverriddenTypeMetaInfo EOF
            {
             newCompositeNode(grammarAccess.getOverriddenTypeMetaInfoRule()); 
            pushFollow(FOLLOW_ruleOverriddenTypeMetaInfo_in_entryRuleOverriddenTypeMetaInfo5693);
            iv_ruleOverriddenTypeMetaInfo=ruleOverriddenTypeMetaInfo();

            state._fsp--;

             current =iv_ruleOverriddenTypeMetaInfo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverriddenTypeMetaInfo5703); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2925:1: ruleOverriddenTypeMetaInfo returns [EObject current=null] : (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' ) ;
    public final EObject ruleOverriddenTypeMetaInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_metaInfo_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2928:28: ( (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2929:1: (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2929:1: (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2929:3: otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleOverriddenTypeMetaInfo5740); 

                	newLeafNode(otherlv_0, grammarAccess.getOverriddenTypeMetaInfoAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2933:1: ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2934:1: (lv_metaInfo_1_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2934:1: (lv_metaInfo_1_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2935:3: lv_metaInfo_1_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getOverriddenTypeMetaInfoAccess().getMetaInfoTypeMetaInfoParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleOverriddenTypeMetaInfo5761);
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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleOverriddenTypeMetaInfo5773); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2963:1: entryRuleConstraintCall returns [EObject current=null] : iv_ruleConstraintCall= ruleConstraintCall EOF ;
    public final EObject entryRuleConstraintCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintCall = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2964:2: (iv_ruleConstraintCall= ruleConstraintCall EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2965:2: iv_ruleConstraintCall= ruleConstraintCall EOF
            {
             newCompositeNode(grammarAccess.getConstraintCallRule()); 
            pushFollow(FOLLOW_ruleConstraintCall_in_entryRuleConstraintCall5809);
            iv_ruleConstraintCall=ruleConstraintCall();

            state._fsp--;

             current =iv_ruleConstraintCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintCall5819); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2972:1: ruleConstraintCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleConstraintCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2975:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2976:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2976:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2976:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )?
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2976:2: ( (otherlv_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2977:1: (otherlv_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2977:1: (otherlv_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2978:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstraintCallRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraintCall5864); 

            		newLeafNode(otherlv_0, grammarAccess.getConstraintCallAccess().getConstraintConstraintCrossReference_0_0()); 
            	

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2989:2: (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==31) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2989:4: otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleConstraintCall5877); 

                        	newLeafNode(otherlv_1, grammarAccess.getConstraintCallAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2993:1: ( (lv_params_2_0= ruleLiteral ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2994:1: (lv_params_2_0= ruleLiteral )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2994:1: (lv_params_2_0= ruleLiteral )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2995:3: lv_params_2_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstraintCallAccess().getParamsLiteralParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleConstraintCall5898);
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

                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3011:2: (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==32) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3011:4: otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleConstraintCall5911); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getConstraintCallAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3015:1: ( (lv_params_4_0= ruleLiteral ) )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3016:1: (lv_params_4_0= ruleLiteral )
                    	    {
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3016:1: (lv_params_4_0= ruleLiteral )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3017:3: lv_params_4_0= ruleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstraintCallAccess().getParamsLiteralParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteral_in_ruleConstraintCall5932);
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
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleConstraintCall5946); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3045:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3046:2: (iv_ruleService= ruleService EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3047:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService5984);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService5994); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3054:1: ruleService returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}' ) ;
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
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3057:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3058:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3058:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3058:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3058:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_DOC) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3059:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3059:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3060:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleService6036); 

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

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleService6054); 

                	newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getServiceKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3080:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3081:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3081:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3082:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService6071); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleService6088); 

                	newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3102:1: ( (lv_methods_4_0= ruleMethod ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==RULE_DOC||LA83_0==40) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3103:1: (lv_methods_4_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3103:1: (lv_methods_4_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3104:3: lv_methods_4_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServiceAccess().getMethodsMethodParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleService6109);
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
            	    break loop83;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleService6122); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3132:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3133:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3134:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral6158);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral6168); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3141:1: ruleLiteral returns [EObject current=null] : (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NullLiteral_0 = null;

        EObject this_BooleanLiteral_1 = null;

        EObject this_NumberLiteral_2 = null;

        EObject this_StringLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3144:28: ( (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3145:1: (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3145:1: (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral )
            int alt84=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt84=1;
                }
                break;
            case 54:
            case 55:
                {
                alt84=2;
                }
                break;
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
                {
                alt84=3;
                }
                break;
            case RULE_STRING:
                {
                alt84=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3146:5: this_NullLiteral_0= ruleNullLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteral6215);
                    this_NullLiteral_0=ruleNullLiteral();

                    state._fsp--;

                     
                            current = this_NullLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3156:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral6242);
                    this_BooleanLiteral_1=ruleBooleanLiteral();

                    state._fsp--;

                     
                            current = this_BooleanLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3166:5: this_NumberLiteral_2= ruleNumberLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteral6269);
                    this_NumberLiteral_2=ruleNumberLiteral();

                    state._fsp--;

                     
                            current = this_NumberLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3176:5: this_StringLiteral_3= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral6296);
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3192:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3193:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3194:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN6332);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN6343); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3201:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3204:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3205:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3205:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3205:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN6383); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3212:1: (kw= '.' this_ID_2= RULE_ID )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==53) ) {
                    int LA85_2 = input.LA(2);

                    if ( (LA85_2==RULE_ID) ) {
                        alt85=1;
                    }


                }


                switch (alt85) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3213:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,53,FOLLOW_53_in_ruleFQN6402); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN6417); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop85;
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3233:1: entryRuleFQNWithWildcard returns [String current=null] : iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF ;
    public final String entryRuleFQNWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQNWithWildcard = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3234:2: (iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3235:2: iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getFQNWithWildcardRule()); 
            pushFollow(FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard6465);
            iv_ruleFQNWithWildcard=ruleFQNWithWildcard();

            state._fsp--;

             current =iv_ruleFQNWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQNWithWildcard6476); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3242:1: ruleFQNWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleFQNWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3245:28: ( (this_FQN_0= ruleFQN kw= '.' kw= '*' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3246:1: (this_FQN_0= ruleFQN kw= '.' kw= '*' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3246:1: (this_FQN_0= ruleFQN kw= '.' kw= '*' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3247:5: this_FQN_0= ruleFQN kw= '.' kw= '*'
            {
             
                    newCompositeNode(grammarAccess.getFQNWithWildcardAccess().getFQNParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFQN_in_ruleFQNWithWildcard6523);
            this_FQN_0=ruleFQN();

            state._fsp--;


            		current.merge(this_FQN_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,53,FOLLOW_53_in_ruleFQNWithWildcard6541); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFQNWithWildcardAccess().getFullStopKeyword_1()); 
                
            kw=(Token)match(input,49,FOLLOW_49_in_ruleFQNWithWildcard6554); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3277:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3278:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3279:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral6594);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral6604); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3286:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3289:28: ( ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3290:1: ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3290:1: ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3290:2: () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3290:2: ()
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3291:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3296:2: ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3297:1: ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3297:1: ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3298:1: (lv_value_1_1= 'false' | lv_value_1_2= 'true' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3298:1: (lv_value_1_1= 'false' | lv_value_1_2= 'true' )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==54) ) {
                alt86=1;
            }
            else if ( (LA86_0==55) ) {
                alt86=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3299:3: lv_value_1_1= 'false'
                    {
                    lv_value_1_1=(Token)match(input,54,FOLLOW_54_in_ruleBooleanLiteral6658); 

                            newLeafNode(lv_value_1_1, grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3311:8: lv_value_1_2= 'true'
                    {
                    lv_value_1_2=(Token)match(input,55,FOLLOW_55_in_ruleBooleanLiteral6687); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3334:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3335:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3336:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
             newCompositeNode(grammarAccess.getNullLiteralRule()); 
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral6739);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;

             current =iv_ruleNullLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral6749); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3343:1: ruleNullLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= 'null' ) ) ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3346:28: ( ( () ( (lv_value_1_0= 'null' ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3347:1: ( () ( (lv_value_1_0= 'null' ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3347:1: ( () ( (lv_value_1_0= 'null' ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3347:2: () ( (lv_value_1_0= 'null' ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3347:2: ()
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3348:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNullLiteralAccess().getNullLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3353:2: ( (lv_value_1_0= 'null' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3354:1: (lv_value_1_0= 'null' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3354:1: (lv_value_1_0= 'null' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3355:3: lv_value_1_0= 'null'
            {
            lv_value_1_0=(Token)match(input,56,FOLLOW_56_in_ruleNullLiteral6801); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3376:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3377:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3378:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral6850);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral6860); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3385:1: ruleNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3388:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3389:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3389:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3389:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3389:2: ()
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3390:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumberLiteralAccess().getNumberLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3395:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3396:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3396:1: (lv_value_1_0= ruleNumber )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3397:3: lv_value_1_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNumber_in_ruleNumberLiteral6915);
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3421:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3422:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3423:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6951);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral6961); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3430:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3433:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3434:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3434:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3434:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3434:2: ()
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3435:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3440:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3441:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3441:1: (lv_value_1_0= RULE_STRING )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3442:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral7012); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3466:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3470:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3471:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber7060);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber7071); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3481:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3485:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3486:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3486:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_HEX) ) {
                alt90=1;
            }
            else if ( (LA90_0==RULE_INT||LA90_0==RULE_DECIMAL) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3486:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber7115); 

                    		current.merge(this_HEX_0);
                        
                     
                        newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3494:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3494:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3494:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3494:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==RULE_INT) ) {
                        alt87=1;
                    }
                    else if ( (LA87_0==RULE_DECIMAL) ) {
                        alt87=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 0, input);

                        throw nvae;
                    }
                    switch (alt87) {
                        case 1 :
                            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3494:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber7143); 

                            		current.merge(this_INT_1);
                                
                             
                                newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3502:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber7169); 

                            		current.merge(this_DECIMAL_2);
                                
                             
                                newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                

                            }
                            break;

                    }

                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3509:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==53) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3510:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,53,FOLLOW_53_in_ruleNumber7189); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                
                            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3515:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt88=2;
                            int LA88_0 = input.LA(1);

                            if ( (LA88_0==RULE_INT) ) {
                                alt88=1;
                            }
                            else if ( (LA88_0==RULE_DECIMAL) ) {
                                alt88=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 88, 0, input);

                                throw nvae;
                            }
                            switch (alt88) {
                                case 1 :
                                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3515:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber7205); 

                                    		current.merge(this_INT_4);
                                        
                                     
                                        newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3523:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber7231); 

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
    static final String DFA5_eotS =
        "\6\uffff";
    static final String DFA5_eofS =
        "\1\uffff\1\3\3\uffff\1\3";
    static final String DFA5_minS =
        "\1\4\1\5\1\4\2\uffff\1\5";
    static final String DFA5_maxS =
        "\1\4\1\65\1\61\2\uffff\1\65";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA5_specialS =
        "\6\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\3\11\uffff\1\3\1\uffff\3\3\1\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\2\3\4\uffff\1\3\2\uffff\1\3\16\uffff\1\3\1\2",
            "\1\5\54\uffff\1\4",
            "",
            "",
            "\1\3\11\uffff\1\3\1\uffff\3\3\1\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\2\3\4\uffff\1\3\2\uffff\1\3\16\uffff\1\3\1\2"
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
    public static final BitSet FOLLOW_14_in_ruleNamespace397 = new BitSet(new long[]{0x00100024352E8020L});
    public static final BitSet FOLLOW_ruleImport_in_ruleNamespace418 = new BitSet(new long[]{0x00100024352E8020L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleNamespace440 = new BitSet(new long[]{0x00100024352C8020L});
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
    public static final BitSet FOLLOW_ruleType_in_entryRuleType763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalType_in_ruleType820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalType_in_ruleType847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_ruleType874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalType_in_entryRuleInternalType909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalType919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractVO_in_ruleInternalType966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractEntity_in_ruleInternalType993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractVO_in_entryRuleAbstractVO1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractVO1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_ruleAbstractVO1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumObject_in_ruleAbstractVO1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractEntityId_in_ruleAbstractVO1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractEntityId_in_entryRuleAbstractEntityId1174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractEntityId1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityId_in_ruleAbstractEntityId1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregateId_in_ruleAbstractEntityId1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractEntity_in_entryRuleAbstractEntity1293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractEntity1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleAbstractEntity1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregate_in_ruleAbstractEntity1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalType_in_entryRuleExternalType1414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalType1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleExternalType1461 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalType1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint1519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleConstraint1571 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConstraint1589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint1606 = new BitSet(new long[]{0x0000000000304000L});
    public static final BitSet FOLLOW_20_in_ruleConstraint1624 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint1644 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_21_in_ruleConstraint1659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint1679 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConstraint1693 = new BitSet(new long[]{0x0001000000408030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleConstraint1714 = new BitSet(new long[]{0x0001000000408030L});
    public static final BitSet FOLLOW_22_in_ruleConstraint1728 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint1745 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConstraint1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleException_in_entryRuleException1800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleException1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleException1852 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleException1870 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleException1887 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_23_in_ruleException1905 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleException1922 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleException1941 = new BitSet(new long[]{0x0001000000400030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleException1962 = new BitSet(new long[]{0x0001000000400030L});
    public static final BitSet FOLLOW_22_in_ruleException1975 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleException1992 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleException2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_entryRuleValueObject2045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueObject2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleValueObject2097 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleValueObject2115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValueObject2132 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_25_in_ruleValueObject2150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValueObject2170 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleValueObject2184 = new BitSet(new long[]{0x0001F94000008030L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleValueObject2205 = new BitSet(new long[]{0x0001014000008030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleValueObject2226 = new BitSet(new long[]{0x0001014000008030L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleValueObject2248 = new BitSet(new long[]{0x0000014000008020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleValueObject2270 = new BitSet(new long[]{0x0000010000008020L});
    public static final BitSet FOLLOW_15_in_ruleValueObject2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityId_in_entryRuleEntityId2319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityId2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleEntityId2371 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEntityId2389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityId2406 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEntityId2423 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityId2443 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_25_in_ruleEntityId2456 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityId2476 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntityId2490 = new BitSet(new long[]{0x0001F94000008030L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleEntityId2511 = new BitSet(new long[]{0x0001014000008030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleEntityId2532 = new BitSet(new long[]{0x0001014000008030L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleEntityId2554 = new BitSet(new long[]{0x0000014000008020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleEntityId2576 = new BitSet(new long[]{0x0000010000008020L});
    public static final BitSet FOLLOW_15_in_ruleEntityId2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregateId_in_entryRuleAggregateId2625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAggregateId2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleAggregateId2677 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAggregateId2695 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAggregateId2712 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleAggregateId2729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAggregateId2749 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_25_in_ruleAggregateId2762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAggregateId2782 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAggregateId2796 = new BitSet(new long[]{0x0001F94000008030L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleAggregateId2817 = new BitSet(new long[]{0x0001014000008030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAggregateId2838 = new BitSet(new long[]{0x0001014000008030L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleAggregateId2860 = new BitSet(new long[]{0x0000014000008020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleAggregateId2882 = new BitSet(new long[]{0x0000010000008020L});
    public static final BitSet FOLLOW_15_in_ruleAggregateId2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumObject_in_entryRuleEnumObject2931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumObject2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleEnumObject2983 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleEnumObject3001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumObject3018 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumObject3035 = new BitSet(new long[]{0x0001F94040000030L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleEnumObject3056 = new BitSet(new long[]{0x0001014040000030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleEnumObject3077 = new BitSet(new long[]{0x0001014040000030L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleEnumObject3099 = new BitSet(new long[]{0x0000014040000020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleEnumObject3121 = new BitSet(new long[]{0x0000010040000020L});
    public static final BitSet FOLLOW_30_in_ruleEnumObject3134 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumObject3146 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_ruleEnumObject3167 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_15_in_ruleEnumObject3180 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEnumObject3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance3228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumInstance3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleEnumInstance3280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance3303 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleEnumInstance3321 = new BitSet(new long[]{0x01C00000000003C0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleEnumInstance3342 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleEnumInstance3355 = new BitSet(new long[]{0x01C00000000003C0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleEnumInstance3376 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_33_in_ruleEnumInstance3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity3428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleEntity3480 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleEntity3498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity3515 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleEntity3532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity3552 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleEntity3564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity3584 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntity3596 = new BitSet(new long[]{0x0001F94000008030L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleEntity3617 = new BitSet(new long[]{0x0001014000008030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleEntity3638 = new BitSet(new long[]{0x0001014000008030L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleEntity3660 = new BitSet(new long[]{0x0000014000008020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleEntity3682 = new BitSet(new long[]{0x0000010000008020L});
    public static final BitSet FOLLOW_15_in_ruleEntity3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregate_in_entryRuleAggregate3731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAggregate3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleAggregate3783 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleAggregate3801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAggregate3818 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleAggregate3835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAggregate3855 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAggregate3867 = new BitSet(new long[]{0x0001F94000008030L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleAggregate3888 = new BitSet(new long[]{0x0001014000008030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAggregate3909 = new BitSet(new long[]{0x0001014000008030L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleAggregate3931 = new BitSet(new long[]{0x0000014000008020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleAggregate3953 = new BitSet(new long[]{0x0000010000008020L});
    public static final BitSet FOLLOW_15_in_ruleAggregate3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_entryRuleConstructor4004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleConstructor4056 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleConstructor4074 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor4091 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConstructor4108 = new BitSet(new long[]{0x0005040000008030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleConstructor4129 = new BitSet(new long[]{0x0005040000008030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor4150 = new BitSet(new long[]{0x0004040000008020L});
    public static final BitSet FOLLOW_ruleConstraints_in_ruleConstructor4172 = new BitSet(new long[]{0x0000040000008020L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleConstructor4194 = new BitSet(new long[]{0x0000040000008020L});
    public static final BitSet FOLLOW_15_in_ruleConstructor4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnType_in_entryRuleReturnType4243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnType4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleReturnType4295 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleReturnType4313 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReturnType4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod4369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleMethod4421 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleMethod4439 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod4456 = new BitSet(new long[]{0x0000020000004000L});
    public static final BitSet FOLLOW_41_in_ruleMethod4474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleMethod4497 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMethod4511 = new BitSet(new long[]{0x0005048000008030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleMethod4532 = new BitSet(new long[]{0x0005048000008030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod4553 = new BitSet(new long[]{0x0004048000008020L});
    public static final BitSet FOLLOW_ruleReturnType_in_ruleMethod4575 = new BitSet(new long[]{0x0004040000008020L});
    public static final BitSet FOLLOW_ruleConstraints_in_ruleMethod4597 = new BitSet(new long[]{0x0000040000008020L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleMethod4619 = new BitSet(new long[]{0x0000040000008020L});
    public static final BitSet FOLLOW_15_in_ruleMethod4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent4668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent4678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleEvent4720 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleEvent4738 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent4755 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEvent4772 = new BitSet(new long[]{0x0001000000408030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleEvent4793 = new BitSet(new long[]{0x0001000000408030L});
    public static final BitSet FOLLOW_22_in_ruleEvent4807 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEvent4824 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEvent4843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_entryRuleTypeMetaInfo4879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeMetaInfo4889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTypeMetaInfo4936 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo4953 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_44_in_ruleTypeMetaInfo4973 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo4990 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_45_in_ruleTypeMetaInfo5010 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo5027 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_46_in_ruleTypeMetaInfo5047 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo5064 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleTypeMetaInfo5084 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo5101 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable5145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable5155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleVariable5197 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleVariable5221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable5255 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_49_in_ruleVariable5273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable5304 = new BitSet(new long[]{0x0008000000004002L});
    public static final BitSet FOLLOW_ruleInvariants_in_ruleVariable5330 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleOverriddenTypeMetaInfo_in_ruleVariable5352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraints_in_entryRuleConstraints5389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraints5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleConstraints5436 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConstraints5448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_ruleConstraints5469 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_32_in_ruleConstraints5482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_ruleConstraints5503 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_15_in_ruleConstraints5517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariants_in_entryRuleInvariants5553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvariants5563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleInvariants5600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_ruleInvariants5621 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleInvariants5634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_ruleInvariants5655 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleOverriddenTypeMetaInfo_in_entryRuleOverriddenTypeMetaInfo5693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverriddenTypeMetaInfo5703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOverriddenTypeMetaInfo5740 = new BitSet(new long[]{0x0000F80000008000L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleOverriddenTypeMetaInfo5761 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleOverriddenTypeMetaInfo5773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_entryRuleConstraintCall5809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintCall5819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraintCall5864 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleConstraintCall5877 = new BitSet(new long[]{0x01C00000000003C0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleConstraintCall5898 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleConstraintCall5911 = new BitSet(new long[]{0x01C00000000003C0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleConstraintCall5932 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_33_in_ruleConstraintCall5946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService5984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService5994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleService6036 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleService6054 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService6071 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleService6088 = new BitSet(new long[]{0x0000010000008020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleService6109 = new BitSet(new long[]{0x0000010000008020L});
    public static final BitSet FOLLOW_15_in_ruleService6122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral6158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral6168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteral6215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral6242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteral6269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral6296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN6332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN6343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN6383 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleFQN6402 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN6417 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard6465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQNWithWildcard6476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleFQNWithWildcard6523 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleFQNWithWildcard6541 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleFQNWithWildcard6554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral6594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral6604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleBooleanLiteral6658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleBooleanLiteral6687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral6739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral6749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleNullLiteral6801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral6850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral6860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumberLiteral6915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral6961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral7012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber7060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber7071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber7115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber7143 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber7169 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleNumber7189 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber7205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber7231 = new BitSet(new long[]{0x0000000000000002L});

}