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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOC", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'namespace'", "'{'", "'}'", "'import'", "';'", "'type'", "'constraint'", "'on'", "'exception'", "'message'", "'value-object'", "'base'", "'entity-id'", "'aggregate-id'", "'enum'", "'instances'", "'('", "','", "')'", "'entity'", "'identifier'", "'root'", "'aggregate'", "'constructor'", "'method'", "'ref'", "'event'", "'slabel'", "'label'", "'tooltipp'", "'prompt'", "'examples'", "'nullable'", "'*'", "'constraints'", "'invariants'", "'.'", "'false'", "'true'", "'null'"
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
    public static final int T__19=19;
    public static final int RULE_HEX=7;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=8;
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:76:1: ruleDomainModel returns [EObject current=null] : ( (lv_namespace_0_0= ruleNamespace ) ) ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_namespace_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:79:28: ( ( (lv_namespace_0_0= ruleNamespace ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:80:1: ( (lv_namespace_0_0= ruleNamespace ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:80:1: ( (lv_namespace_0_0= ruleNamespace ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:81:1: (lv_namespace_0_0= ruleNamespace )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:81:1: (lv_namespace_0_0= ruleNamespace )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:82:3: lv_namespace_0_0= ruleNamespace
            {
             
            	        newCompositeNode(grammarAccess.getDomainModelAccess().getNamespaceNamespaceParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleNamespace_in_ruleDomainModel130);
            lv_namespace_0_0=ruleNamespace();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	        }
                   		set(
                   			current, 
                   			"namespace",
                    		lv_namespace_0_0, 
                    		"Namespace");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleNamespace"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:106:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:107:2: (iv_ruleNamespace= ruleNamespace EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:108:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace165);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace175); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:115:1: ruleNamespace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' ) ;
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
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:118:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:119:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:119:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:119:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleNamespace212); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:123:1: ( (lv_name_1_0= ruleFQN ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:124:1: (lv_name_1_0= ruleFQN )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:124:1: (lv_name_1_0= ruleFQN )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:125:3: lv_name_1_0= ruleFQN
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceAccess().getNameFQNParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleNamespace233);
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleNamespace245); 

                	newLeafNode(otherlv_2, grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:145:1: ( (lv_imports_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:146:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:146:1: (lv_imports_3_0= ruleImport )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:147:3: lv_imports_3_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleNamespace266);
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
            	    break loop1;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:163:3: ( (lv_elements_4_0= ruleAbstractElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_DOC||LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:164:1: (lv_elements_4_0= ruleAbstractElement )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:164:1: (lv_elements_4_0= ruleAbstractElement )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:165:3: lv_elements_4_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNamespaceAccess().getElementsAbstractElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleNamespace288);
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
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleNamespace301); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:193:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:194:2: (iv_ruleImport= ruleImport EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:195:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport337);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport347); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:202:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_1 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:205:28: ( (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) otherlv_2= ';' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:206:1: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) otherlv_2= ';' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:206:1: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) otherlv_2= ';' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:206:3: otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleImport384); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:210:1: ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:211:1: ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:211:1: ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:212:1: (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:212:1: (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:213:3: lv_importedNamespace_1_1= ruleFQN
                    {
                     
                    	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceFQNParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleImport407);
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
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:228:8: lv_importedNamespace_1_2= ruleFQNWithWildcard
                    {
                     
                    	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceFQNWithWildcardParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleFQNWithWildcard_in_ruleImport426);
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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleImport441); 

                	newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
                

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:258:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:259:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:260:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement477);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement487); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:267:1: ruleAbstractElement returns [EObject current=null] : (this_Constraint_0= ruleConstraint | this_Type_1= ruleType ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Constraint_0 = null;

        EObject this_Type_1 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:270:28: ( (this_Constraint_0= ruleConstraint | this_Type_1= ruleType ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:271:1: (this_Constraint_0= ruleConstraint | this_Type_1= ruleType )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:271:1: (this_Constraint_0= ruleConstraint | this_Type_1= ruleType )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_DOC) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==23||(LA4_1>=25 && LA4_1<=27)||LA4_1==32||LA4_1==35) ) {
                    alt4=2;
                }
                else if ( (LA4_1==19) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:272:5: this_Constraint_0= ruleConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getConstraintParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConstraint_in_ruleAbstractElement534);
                    this_Constraint_0=ruleConstraint();

                    state._fsp--;

                     
                            current = this_Constraint_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:282:5: this_Type_1= ruleType
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleAbstractElement561);
                    this_Type_1=ruleType();

                    state._fsp--;

                     
                            current = this_Type_1; 
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:298:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:299:2: (iv_ruleType= ruleType EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:300:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType596);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType606); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:307:1: ruleType returns [EObject current=null] : (this_ExternalType_0= ruleExternalType | this_InternalType_1= ruleInternalType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalType_0 = null;

        EObject this_InternalType_1 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:310:28: ( (this_ExternalType_0= ruleExternalType | this_InternalType_1= ruleInternalType ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:311:1: (this_ExternalType_0= ruleExternalType | this_InternalType_1= ruleInternalType )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:311:1: (this_ExternalType_0= ruleExternalType | this_InternalType_1= ruleInternalType )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_DOC) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:312:5: this_ExternalType_0= ruleExternalType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getExternalTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExternalType_in_ruleType653);
                    this_ExternalType_0=ruleExternalType();

                    state._fsp--;

                     
                            current = this_ExternalType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:322:5: this_InternalType_1= ruleInternalType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getInternalTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInternalType_in_ruleType680);
                    this_InternalType_1=ruleInternalType();

                    state._fsp--;

                     
                            current = this_InternalType_1; 
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:338:1: entryRuleInternalType returns [EObject current=null] : iv_ruleInternalType= ruleInternalType EOF ;
    public final EObject entryRuleInternalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalType = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:339:2: (iv_ruleInternalType= ruleInternalType EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:340:2: iv_ruleInternalType= ruleInternalType EOF
            {
             newCompositeNode(grammarAccess.getInternalTypeRule()); 
            pushFollow(FOLLOW_ruleInternalType_in_entryRuleInternalType715);
            iv_ruleInternalType=ruleInternalType();

            state._fsp--;

             current =iv_ruleInternalType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalType725); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:347:1: ruleInternalType returns [EObject current=null] : (this_AbstractVO_0= ruleAbstractVO | this_AbstractEntity_1= ruleAbstractEntity ) ;
    public final EObject ruleInternalType() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractVO_0 = null;

        EObject this_AbstractEntity_1 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:350:28: ( (this_AbstractVO_0= ruleAbstractVO | this_AbstractEntity_1= ruleAbstractEntity ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:351:1: (this_AbstractVO_0= ruleAbstractVO | this_AbstractEntity_1= ruleAbstractEntity )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:351:1: (this_AbstractVO_0= ruleAbstractVO | this_AbstractEntity_1= ruleAbstractEntity )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DOC) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==32||LA6_1==35) ) {
                    alt6=2;
                }
                else if ( (LA6_1==23||(LA6_1>=25 && LA6_1<=27)) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:352:5: this_AbstractVO_0= ruleAbstractVO
                    {
                     
                            newCompositeNode(grammarAccess.getInternalTypeAccess().getAbstractVOParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAbstractVO_in_ruleInternalType772);
                    this_AbstractVO_0=ruleAbstractVO();

                    state._fsp--;

                     
                            current = this_AbstractVO_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:362:5: this_AbstractEntity_1= ruleAbstractEntity
                    {
                     
                            newCompositeNode(grammarAccess.getInternalTypeAccess().getAbstractEntityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAbstractEntity_in_ruleInternalType799);
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:378:1: entryRuleAbstractVO returns [EObject current=null] : iv_ruleAbstractVO= ruleAbstractVO EOF ;
    public final EObject entryRuleAbstractVO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractVO = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:379:2: (iv_ruleAbstractVO= ruleAbstractVO EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:380:2: iv_ruleAbstractVO= ruleAbstractVO EOF
            {
             newCompositeNode(grammarAccess.getAbstractVORule()); 
            pushFollow(FOLLOW_ruleAbstractVO_in_entryRuleAbstractVO834);
            iv_ruleAbstractVO=ruleAbstractVO();

            state._fsp--;

             current =iv_ruleAbstractVO; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractVO844); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:387:1: ruleAbstractVO returns [EObject current=null] : (this_ValueObject_0= ruleValueObject | this_EnumObject_1= ruleEnumObject | this_AbstractEntityId_2= ruleAbstractEntityId ) ;
    public final EObject ruleAbstractVO() throws RecognitionException {
        EObject current = null;

        EObject this_ValueObject_0 = null;

        EObject this_EnumObject_1 = null;

        EObject this_AbstractEntityId_2 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:390:28: ( (this_ValueObject_0= ruleValueObject | this_EnumObject_1= ruleEnumObject | this_AbstractEntityId_2= ruleAbstractEntityId ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:391:1: (this_ValueObject_0= ruleValueObject | this_EnumObject_1= ruleEnumObject | this_AbstractEntityId_2= ruleAbstractEntityId )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:391:1: (this_ValueObject_0= ruleValueObject | this_EnumObject_1= ruleEnumObject | this_AbstractEntityId_2= ruleAbstractEntityId )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_DOC) ) {
                switch ( input.LA(2) ) {
                case 25:
                case 26:
                    {
                    alt7=3;
                    }
                    break;
                case 27:
                    {
                    alt7=2;
                    }
                    break;
                case 23:
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
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:392:5: this_ValueObject_0= ruleValueObject
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractVOAccess().getValueObjectParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleValueObject_in_ruleAbstractVO891);
                    this_ValueObject_0=ruleValueObject();

                    state._fsp--;

                     
                            current = this_ValueObject_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:402:5: this_EnumObject_1= ruleEnumObject
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractVOAccess().getEnumObjectParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEnumObject_in_ruleAbstractVO918);
                    this_EnumObject_1=ruleEnumObject();

                    state._fsp--;

                     
                            current = this_EnumObject_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:412:5: this_AbstractEntityId_2= ruleAbstractEntityId
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractVOAccess().getAbstractEntityIdParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAbstractEntityId_in_ruleAbstractVO945);
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:428:1: entryRuleAbstractEntityId returns [EObject current=null] : iv_ruleAbstractEntityId= ruleAbstractEntityId EOF ;
    public final EObject entryRuleAbstractEntityId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractEntityId = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:429:2: (iv_ruleAbstractEntityId= ruleAbstractEntityId EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:430:2: iv_ruleAbstractEntityId= ruleAbstractEntityId EOF
            {
             newCompositeNode(grammarAccess.getAbstractEntityIdRule()); 
            pushFollow(FOLLOW_ruleAbstractEntityId_in_entryRuleAbstractEntityId980);
            iv_ruleAbstractEntityId=ruleAbstractEntityId();

            state._fsp--;

             current =iv_ruleAbstractEntityId; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractEntityId990); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:437:1: ruleAbstractEntityId returns [EObject current=null] : (this_EntityId_0= ruleEntityId | this_AggregateId_1= ruleAggregateId ) ;
    public final EObject ruleAbstractEntityId() throws RecognitionException {
        EObject current = null;

        EObject this_EntityId_0 = null;

        EObject this_AggregateId_1 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:440:28: ( (this_EntityId_0= ruleEntityId | this_AggregateId_1= ruleAggregateId ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:441:1: (this_EntityId_0= ruleEntityId | this_AggregateId_1= ruleAggregateId )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:441:1: (this_EntityId_0= ruleEntityId | this_AggregateId_1= ruleAggregateId )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DOC) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==25) ) {
                    alt8=1;
                }
                else if ( (LA8_1==26) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:442:5: this_EntityId_0= ruleEntityId
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractEntityIdAccess().getEntityIdParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEntityId_in_ruleAbstractEntityId1037);
                    this_EntityId_0=ruleEntityId();

                    state._fsp--;

                     
                            current = this_EntityId_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:452:5: this_AggregateId_1= ruleAggregateId
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractEntityIdAccess().getAggregateIdParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAggregateId_in_ruleAbstractEntityId1064);
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:468:1: entryRuleAbstractEntity returns [EObject current=null] : iv_ruleAbstractEntity= ruleAbstractEntity EOF ;
    public final EObject entryRuleAbstractEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractEntity = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:469:2: (iv_ruleAbstractEntity= ruleAbstractEntity EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:470:2: iv_ruleAbstractEntity= ruleAbstractEntity EOF
            {
             newCompositeNode(grammarAccess.getAbstractEntityRule()); 
            pushFollow(FOLLOW_ruleAbstractEntity_in_entryRuleAbstractEntity1099);
            iv_ruleAbstractEntity=ruleAbstractEntity();

            state._fsp--;

             current =iv_ruleAbstractEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractEntity1109); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:477:1: ruleAbstractEntity returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Aggregate_1= ruleAggregate ) ;
    public final EObject ruleAbstractEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Aggregate_1 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:480:28: ( (this_Entity_0= ruleEntity | this_Aggregate_1= ruleAggregate ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:481:1: (this_Entity_0= ruleEntity | this_Aggregate_1= ruleAggregate )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:481:1: (this_Entity_0= ruleEntity | this_Aggregate_1= ruleAggregate )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_DOC) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==35) ) {
                    alt9=2;
                }
                else if ( (LA9_1==32) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:482:5: this_Entity_0= ruleEntity
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractEntityAccess().getEntityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleAbstractEntity1156);
                    this_Entity_0=ruleEntity();

                    state._fsp--;

                     
                            current = this_Entity_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:492:5: this_Aggregate_1= ruleAggregate
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractEntityAccess().getAggregateParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAggregate_in_ruleAbstractEntity1183);
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:510:1: entryRuleExternalType returns [EObject current=null] : iv_ruleExternalType= ruleExternalType EOF ;
    public final EObject entryRuleExternalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalType = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:511:2: (iv_ruleExternalType= ruleExternalType EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:512:2: iv_ruleExternalType= ruleExternalType EOF
            {
             newCompositeNode(grammarAccess.getExternalTypeRule()); 
            pushFollow(FOLLOW_ruleExternalType_in_entryRuleExternalType1220);
            iv_ruleExternalType=ruleExternalType();

            state._fsp--;

             current =iv_ruleExternalType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalType1230); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:519:1: ruleExternalType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleExternalType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:522:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:523:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:523:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:523:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleExternalType1267); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalTypeAccess().getTypeKeyword_0());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:527:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:528:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:528:1: (lv_name_1_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:529:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalType1284); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleExternalType1301); 

                	newLeafNode(otherlv_2, grammarAccess.getExternalTypeAccess().getSemicolonKeyword_2());
                

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:557:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:558:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:559:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint1337);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint1347); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:566:1: ruleConstraint returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'exception' ( (lv_exception_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) )* otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) ) otherlv_11= ';' otherlv_12= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_exception_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_message_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_variables_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:569:28: ( ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'exception' ( (lv_exception_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) )* otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) ) otherlv_11= ';' otherlv_12= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:570:1: ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'exception' ( (lv_exception_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) )* otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) ) otherlv_11= ';' otherlv_12= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:570:1: ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'exception' ( (lv_exception_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) )* otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) ) otherlv_11= ';' otherlv_12= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:570:2: ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'exception' ( (lv_exception_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) )* otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) ) otherlv_11= ';' otherlv_12= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:570:2: ( (lv_doc_0_0= RULE_DOC ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:571:1: (lv_doc_0_0= RULE_DOC )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:571:1: (lv_doc_0_0= RULE_DOC )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:572:3: lv_doc_0_0= RULE_DOC
            {
            lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleConstraint1389); 

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

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleConstraint1406); 

                	newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getConstraintKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:592:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:593:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:593:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:594:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint1423); 

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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleConstraint1440); 

                	newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getOnKeyword_3());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:614:1: ( (otherlv_4= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:615:1: (otherlv_4= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:615:1: (otherlv_4= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:616:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstraintRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint1460); 

            		newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getTargetConstraintTargetCrossReference_4_0()); 
            	

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:627:2: (otherlv_5= 'exception' ( (lv_exception_6_0= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:627:4: otherlv_5= 'exception' ( (lv_exception_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleConstraint1473); 

                        	newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getExceptionKeyword_5_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:631:1: ( (lv_exception_6_0= RULE_ID ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:632:1: (lv_exception_6_0= RULE_ID )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:632:1: (lv_exception_6_0= RULE_ID )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:633:3: lv_exception_6_0= RULE_ID
                    {
                    lv_exception_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint1490); 

                    			newLeafNode(lv_exception_6_0, grammarAccess.getConstraintAccess().getExceptionIDTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"exception",
                            		lv_exception_6_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleConstraint1509); 

                	newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:653:1: ( (lv_variables_8_0= ruleVariable ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_DOC)||LA11_0==45) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:654:1: (lv_variables_8_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:654:1: (lv_variables_8_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:655:3: lv_variables_8_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstraintAccess().getVariablesVariableParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleConstraint1530);
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
            	    break loop11;
                }
            } while (true);

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleConstraint1543); 

                	newLeafNode(otherlv_9, grammarAccess.getConstraintAccess().getMessageKeyword_8());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:675:1: ( (lv_message_10_0= RULE_STRING ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:676:1: (lv_message_10_0= RULE_STRING )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:676:1: (lv_message_10_0= RULE_STRING )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:677:3: lv_message_10_0= RULE_STRING
            {
            lv_message_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint1560); 

            			newLeafNode(lv_message_10_0, grammarAccess.getConstraintAccess().getMessageSTRINGTerminalRuleCall_9_0()); 
            		

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

            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleConstraint1577); 

                	newLeafNode(otherlv_11, grammarAccess.getConstraintAccess().getSemicolonKeyword_10());
                
            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleConstraint1589); 

                	newLeafNode(otherlv_12, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_11());
                

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


    // $ANTLR start "entryRuleValueObject"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:709:1: entryRuleValueObject returns [EObject current=null] : iv_ruleValueObject= ruleValueObject EOF ;
    public final EObject entryRuleValueObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueObject = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:710:2: (iv_ruleValueObject= ruleValueObject EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:711:2: iv_ruleValueObject= ruleValueObject EOF
            {
             newCompositeNode(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_ruleValueObject_in_entryRuleValueObject1625);
            iv_ruleValueObject=ruleValueObject();

            state._fsp--;

             current =iv_ruleValueObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueObject1635); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:718:1: ruleValueObject returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'value-object' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) ;
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
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:721:28: ( ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'value-object' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:722:1: ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'value-object' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:722:1: ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'value-object' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:722:2: ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'value-object' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:722:2: ( (lv_doc_0_0= RULE_DOC ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:723:1: (lv_doc_0_0= RULE_DOC )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:723:1: (lv_doc_0_0= RULE_DOC )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:724:3: lv_doc_0_0= RULE_DOC
            {
            lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleValueObject1677); 

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

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleValueObject1694); 

                	newLeafNode(otherlv_1, grammarAccess.getValueObjectAccess().getValueObjectKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:744:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:745:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:745:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:746:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValueObject1711); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:762:2: (otherlv_3= 'base' ( (otherlv_4= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:762:4: otherlv_3= 'base' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleValueObject1729); 

                        	newLeafNode(otherlv_3, grammarAccess.getValueObjectAccess().getBaseKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:766:1: ( (otherlv_4= RULE_ID ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:767:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:767:1: (otherlv_4= RULE_ID )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:768:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueObjectRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValueObject1749); 

                    		newLeafNode(otherlv_4, grammarAccess.getValueObjectAccess().getBaseExternalTypeCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleValueObject1763); 

                	newLeafNode(otherlv_5, grammarAccess.getValueObjectAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:783:1: ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:784:1: (lv_metaInfo_6_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:784:1: (lv_metaInfo_6_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:785:3: lv_metaInfo_6_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getValueObjectAccess().getMetaInfoTypeMetaInfoParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleValueObject1784);
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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:801:2: ( (lv_variables_7_0= ruleVariable ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_DOC) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==RULE_ID||LA13_1==45) ) {
                        alt13=1;
                    }


                }
                else if ( (LA13_0==RULE_ID||LA13_0==45) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:802:1: (lv_variables_7_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:802:1: (lv_variables_7_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:803:3: lv_variables_7_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValueObjectAccess().getVariablesVariableParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleValueObject1805);
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
            	    break loop13;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:819:3: ( (lv_constructors_8_0= ruleConstructor ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_DOC) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==36) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==36) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:820:1: (lv_constructors_8_0= ruleConstructor )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:820:1: (lv_constructors_8_0= ruleConstructor )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:821:3: lv_constructors_8_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValueObjectAccess().getConstructorsConstructorParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleValueObject1827);
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
            	    break loop14;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:837:3: ( (lv_methods_9_0= ruleMethod ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_DOC||LA15_0==37) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:838:1: (lv_methods_9_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:838:1: (lv_methods_9_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:839:3: lv_methods_9_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValueObjectAccess().getMethodsMethodParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleValueObject1849);
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
            	    break loop15;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleValueObject1862); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:867:1: entryRuleEntityId returns [EObject current=null] : iv_ruleEntityId= ruleEntityId EOF ;
    public final EObject entryRuleEntityId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityId = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:868:2: (iv_ruleEntityId= ruleEntityId EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:869:2: iv_ruleEntityId= ruleEntityId EOF
            {
             newCompositeNode(grammarAccess.getEntityIdRule()); 
            pushFollow(FOLLOW_ruleEntityId_in_entryRuleEntityId1898);
            iv_ruleEntityId=ruleEntityId();

            state._fsp--;

             current =iv_ruleEntityId; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityId1908); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:876:1: ruleEntityId returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'entity-id' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) ;
    public final EObject ruleEntityId() throws RecognitionException {
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
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:879:28: ( ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'entity-id' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:880:1: ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'entity-id' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:880:1: ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'entity-id' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:880:2: ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'entity-id' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:880:2: ( (lv_doc_0_0= RULE_DOC ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:881:1: (lv_doc_0_0= RULE_DOC )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:881:1: (lv_doc_0_0= RULE_DOC )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:882:3: lv_doc_0_0= RULE_DOC
            {
            lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleEntityId1950); 

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

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleEntityId1967); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityIdAccess().getEntityIdKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:902:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:903:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:903:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:904:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityId1984); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:920:2: (otherlv_3= 'base' ( (otherlv_4= RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:920:4: otherlv_3= 'base' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleEntityId2002); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityIdAccess().getBaseKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:924:1: ( (otherlv_4= RULE_ID ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:925:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:925:1: (otherlv_4= RULE_ID )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:926:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityIdRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityId2022); 

                    		newLeafNode(otherlv_4, grammarAccess.getEntityIdAccess().getBaseExternalTypeCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEntityId2036); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityIdAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:941:1: ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:942:1: (lv_metaInfo_6_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:942:1: (lv_metaInfo_6_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:943:3: lv_metaInfo_6_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getEntityIdAccess().getMetaInfoTypeMetaInfoParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleEntityId2057);
            lv_metaInfo_6_0=ruleTypeMetaInfo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityIdRule());
            	        }
                   		set(
                   			current, 
                   			"metaInfo",
                    		lv_metaInfo_6_0, 
                    		"TypeMetaInfo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:959:2: ( (lv_variables_7_0= ruleVariable ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_DOC) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==RULE_ID||LA17_1==45) ) {
                        alt17=1;
                    }


                }
                else if ( (LA17_0==RULE_ID||LA17_0==45) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:960:1: (lv_variables_7_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:960:1: (lv_variables_7_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:961:3: lv_variables_7_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityIdAccess().getVariablesVariableParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleEntityId2078);
            	    lv_variables_7_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityIdRule());
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
            	    break loop17;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:977:3: ( (lv_constructors_8_0= ruleConstructor ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_DOC) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==36) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==36) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:978:1: (lv_constructors_8_0= ruleConstructor )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:978:1: (lv_constructors_8_0= ruleConstructor )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:979:3: lv_constructors_8_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityIdAccess().getConstructorsConstructorParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleEntityId2100);
            	    lv_constructors_8_0=ruleConstructor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityIdRule());
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
            	    break loop18;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:995:3: ( (lv_methods_9_0= ruleMethod ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_DOC||LA19_0==37) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:996:1: (lv_methods_9_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:996:1: (lv_methods_9_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:997:3: lv_methods_9_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityIdAccess().getMethodsMethodParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleEntityId2122);
            	    lv_methods_9_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityIdRule());
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
            	    break loop19;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleEntityId2135); 

                	newLeafNode(otherlv_10, grammarAccess.getEntityIdAccess().getRightCurlyBracketKeyword_9());
                

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1025:1: entryRuleAggregateId returns [EObject current=null] : iv_ruleAggregateId= ruleAggregateId EOF ;
    public final EObject entryRuleAggregateId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregateId = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1026:2: (iv_ruleAggregateId= ruleAggregateId EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1027:2: iv_ruleAggregateId= ruleAggregateId EOF
            {
             newCompositeNode(grammarAccess.getAggregateIdRule()); 
            pushFollow(FOLLOW_ruleAggregateId_in_entryRuleAggregateId2171);
            iv_ruleAggregateId=ruleAggregateId();

            state._fsp--;

             current =iv_ruleAggregateId; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAggregateId2181); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1034:1: ruleAggregateId returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'aggregate-id' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) ;
    public final EObject ruleAggregateId() throws RecognitionException {
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
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1037:28: ( ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'aggregate-id' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1038:1: ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'aggregate-id' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1038:1: ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'aggregate-id' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1038:2: ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'aggregate-id' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'base' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1038:2: ( (lv_doc_0_0= RULE_DOC ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1039:1: (lv_doc_0_0= RULE_DOC )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1039:1: (lv_doc_0_0= RULE_DOC )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1040:3: lv_doc_0_0= RULE_DOC
            {
            lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleAggregateId2223); 

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

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleAggregateId2240); 

                	newLeafNode(otherlv_1, grammarAccess.getAggregateIdAccess().getAggregateIdKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1060:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1061:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1061:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1062:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAggregateId2257); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1078:2: (otherlv_3= 'base' ( (otherlv_4= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1078:4: otherlv_3= 'base' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleAggregateId2275); 

                        	newLeafNode(otherlv_3, grammarAccess.getAggregateIdAccess().getBaseKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1082:1: ( (otherlv_4= RULE_ID ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1083:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1083:1: (otherlv_4= RULE_ID )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1084:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAggregateIdRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAggregateId2295); 

                    		newLeafNode(otherlv_4, grammarAccess.getAggregateIdAccess().getBaseExternalTypeCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleAggregateId2309); 

                	newLeafNode(otherlv_5, grammarAccess.getAggregateIdAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1099:1: ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1100:1: (lv_metaInfo_6_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1100:1: (lv_metaInfo_6_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1101:3: lv_metaInfo_6_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getAggregateIdAccess().getMetaInfoTypeMetaInfoParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleAggregateId2330);
            lv_metaInfo_6_0=ruleTypeMetaInfo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAggregateIdRule());
            	        }
                   		set(
                   			current, 
                   			"metaInfo",
                    		lv_metaInfo_6_0, 
                    		"TypeMetaInfo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1117:2: ( (lv_variables_7_0= ruleVariable ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_DOC) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==RULE_ID||LA21_1==45) ) {
                        alt21=1;
                    }


                }
                else if ( (LA21_0==RULE_ID||LA21_0==45) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1118:1: (lv_variables_7_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1118:1: (lv_variables_7_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1119:3: lv_variables_7_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateIdAccess().getVariablesVariableParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleAggregateId2351);
            	    lv_variables_7_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAggregateIdRule());
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
            	    break loop21;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1135:3: ( (lv_constructors_8_0= ruleConstructor ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_DOC) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==36) ) {
                        alt22=1;
                    }


                }
                else if ( (LA22_0==36) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1136:1: (lv_constructors_8_0= ruleConstructor )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1136:1: (lv_constructors_8_0= ruleConstructor )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1137:3: lv_constructors_8_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateIdAccess().getConstructorsConstructorParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleAggregateId2373);
            	    lv_constructors_8_0=ruleConstructor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAggregateIdRule());
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
            	    break loop22;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1153:3: ( (lv_methods_9_0= ruleMethod ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_DOC||LA23_0==37) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1154:1: (lv_methods_9_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1154:1: (lv_methods_9_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1155:3: lv_methods_9_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateIdAccess().getMethodsMethodParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleAggregateId2395);
            	    lv_methods_9_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAggregateIdRule());
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
            	    break loop23;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleAggregateId2408); 

                	newLeafNode(otherlv_10, grammarAccess.getAggregateIdAccess().getRightCurlyBracketKeyword_9());
                

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1183:1: entryRuleEnumObject returns [EObject current=null] : iv_ruleEnumObject= ruleEnumObject EOF ;
    public final EObject entryRuleEnumObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumObject = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1184:2: (iv_ruleEnumObject= ruleEnumObject EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1185:2: iv_ruleEnumObject= ruleEnumObject EOF
            {
             newCompositeNode(grammarAccess.getEnumObjectRule()); 
            pushFollow(FOLLOW_ruleEnumObject_in_entryRuleEnumObject2444);
            iv_ruleEnumObject=ruleEnumObject();

            state._fsp--;

             current =iv_ruleEnumObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumObject2454); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1192:1: ruleEnumObject returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_metaInfo_4_0= ruleTypeMetaInfo ) ) ( (lv_variables_5_0= ruleVariable ) )* ( (lv_constructors_6_0= ruleConstructor ) )* ( (lv_methods_7_0= ruleMethod ) )* otherlv_8= 'instances' otherlv_9= '{' ( (lv_instances_10_0= ruleEnumInstance ) )+ otherlv_11= '}' otherlv_12= '}' ) ;
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
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1195:28: ( ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_metaInfo_4_0= ruleTypeMetaInfo ) ) ( (lv_variables_5_0= ruleVariable ) )* ( (lv_constructors_6_0= ruleConstructor ) )* ( (lv_methods_7_0= ruleMethod ) )* otherlv_8= 'instances' otherlv_9= '{' ( (lv_instances_10_0= ruleEnumInstance ) )+ otherlv_11= '}' otherlv_12= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1196:1: ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_metaInfo_4_0= ruleTypeMetaInfo ) ) ( (lv_variables_5_0= ruleVariable ) )* ( (lv_constructors_6_0= ruleConstructor ) )* ( (lv_methods_7_0= ruleMethod ) )* otherlv_8= 'instances' otherlv_9= '{' ( (lv_instances_10_0= ruleEnumInstance ) )+ otherlv_11= '}' otherlv_12= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1196:1: ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_metaInfo_4_0= ruleTypeMetaInfo ) ) ( (lv_variables_5_0= ruleVariable ) )* ( (lv_constructors_6_0= ruleConstructor ) )* ( (lv_methods_7_0= ruleMethod ) )* otherlv_8= 'instances' otherlv_9= '{' ( (lv_instances_10_0= ruleEnumInstance ) )+ otherlv_11= '}' otherlv_12= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1196:2: ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_metaInfo_4_0= ruleTypeMetaInfo ) ) ( (lv_variables_5_0= ruleVariable ) )* ( (lv_constructors_6_0= ruleConstructor ) )* ( (lv_methods_7_0= ruleMethod ) )* otherlv_8= 'instances' otherlv_9= '{' ( (lv_instances_10_0= ruleEnumInstance ) )+ otherlv_11= '}' otherlv_12= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1196:2: ( (lv_doc_0_0= RULE_DOC ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1197:1: (lv_doc_0_0= RULE_DOC )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1197:1: (lv_doc_0_0= RULE_DOC )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1198:3: lv_doc_0_0= RULE_DOC
            {
            lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleEnumObject2496); 

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

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleEnumObject2513); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumObjectAccess().getEnumKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1218:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1219:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1219:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1220:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumObject2530); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleEnumObject2547); 

                	newLeafNode(otherlv_3, grammarAccess.getEnumObjectAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1240:1: ( (lv_metaInfo_4_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1241:1: (lv_metaInfo_4_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1241:1: (lv_metaInfo_4_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1242:3: lv_metaInfo_4_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getEnumObjectAccess().getMetaInfoTypeMetaInfoParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleEnumObject2568);
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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1258:2: ( (lv_variables_5_0= ruleVariable ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_DOC) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==RULE_ID||LA24_1==45) ) {
                        alt24=1;
                    }


                }
                else if ( (LA24_0==RULE_ID||LA24_0==45) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1259:1: (lv_variables_5_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1259:1: (lv_variables_5_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1260:3: lv_variables_5_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumObjectAccess().getVariablesVariableParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleEnumObject2589);
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
            	    break loop24;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1276:3: ( (lv_constructors_6_0= ruleConstructor ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_DOC) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==36) ) {
                        alt25=1;
                    }


                }
                else if ( (LA25_0==36) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1277:1: (lv_constructors_6_0= ruleConstructor )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1277:1: (lv_constructors_6_0= ruleConstructor )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1278:3: lv_constructors_6_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumObjectAccess().getConstructorsConstructorParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleEnumObject2611);
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
            	    break loop25;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1294:3: ( (lv_methods_7_0= ruleMethod ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_DOC||LA26_0==37) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1295:1: (lv_methods_7_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1295:1: (lv_methods_7_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1296:3: lv_methods_7_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumObjectAccess().getMethodsMethodParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleEnumObject2633);
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
            	    break loop26;
                }
            } while (true);

            otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleEnumObject2646); 

                	newLeafNode(otherlv_8, grammarAccess.getEnumObjectAccess().getInstancesKeyword_8());
                
            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleEnumObject2658); 

                	newLeafNode(otherlv_9, grammarAccess.getEnumObjectAccess().getLeftCurlyBracketKeyword_9());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1320:1: ( (lv_instances_10_0= ruleEnumInstance ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_DOC) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1321:1: (lv_instances_10_0= ruleEnumInstance )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1321:1: (lv_instances_10_0= ruleEnumInstance )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1322:3: lv_instances_10_0= ruleEnumInstance
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumObjectAccess().getInstancesEnumInstanceParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumInstance_in_ruleEnumObject2679);
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
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleEnumObject2692); 

                	newLeafNode(otherlv_11, grammarAccess.getEnumObjectAccess().getRightCurlyBracketKeyword_11());
                
            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleEnumObject2704); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1354:1: entryRuleEnumInstance returns [EObject current=null] : iv_ruleEnumInstance= ruleEnumInstance EOF ;
    public final EObject entryRuleEnumInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumInstance = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1355:2: (iv_ruleEnumInstance= ruleEnumInstance EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1356:2: iv_ruleEnumInstance= ruleEnumInstance EOF
            {
             newCompositeNode(grammarAccess.getEnumInstanceRule()); 
            pushFollow(FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance2740);
            iv_ruleEnumInstance=ruleEnumInstance();

            state._fsp--;

             current =iv_ruleEnumInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumInstance2750); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1363:1: ruleEnumInstance returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )* otherlv_6= ')' )? otherlv_7= ';' ) ;
    public final EObject ruleEnumInstance() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1366:28: ( ( ( (lv_doc_0_0= RULE_DOC ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )* otherlv_6= ')' )? otherlv_7= ';' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1367:1: ( ( (lv_doc_0_0= RULE_DOC ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )* otherlv_6= ')' )? otherlv_7= ';' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1367:1: ( ( (lv_doc_0_0= RULE_DOC ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )* otherlv_6= ')' )? otherlv_7= ';' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1367:2: ( (lv_doc_0_0= RULE_DOC ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )* otherlv_6= ')' )? otherlv_7= ';'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1367:2: ( (lv_doc_0_0= RULE_DOC ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1368:1: (lv_doc_0_0= RULE_DOC )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1368:1: (lv_doc_0_0= RULE_DOC )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1369:3: lv_doc_0_0= RULE_DOC
            {
            lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleEnumInstance2792); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1385:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1386:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1386:1: (lv_name_1_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1387:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance2814); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1403:2: (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )* otherlv_6= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1403:4: otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleEnumInstance2832); 

                        	newLeafNode(otherlv_2, grammarAccess.getEnumInstanceAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1407:1: ( (lv_params_3_0= ruleLiteral ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1408:1: (lv_params_3_0= ruleLiteral )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1408:1: (lv_params_3_0= ruleLiteral )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1409:3: lv_params_3_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumInstanceAccess().getParamsLiteralParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleEnumInstance2853);
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

                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1425:2: (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==30) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1425:4: otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) )
                    	    {
                    	    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleEnumInstance2866); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getEnumInstanceAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1429:1: ( (lv_params_5_0= ruleLiteral ) )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1430:1: (lv_params_5_0= ruleLiteral )
                    	    {
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1430:1: (lv_params_5_0= ruleLiteral )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1431:3: lv_params_5_0= ruleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEnumInstanceAccess().getParamsLiteralParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteral_in_ruleEnumInstance2887);
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
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleEnumInstance2901); 

                        	newLeafNode(otherlv_6, grammarAccess.getEnumInstanceAccess().getRightParenthesisKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleEnumInstance2915); 

                	newLeafNode(otherlv_7, grammarAccess.getEnumInstanceAccess().getSemicolonKeyword_3());
                

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1463:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1464:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1465:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity2951);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity2961); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1472:1: ruleEntity returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'root' ( (otherlv_6= RULE_ID ) ) otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}' ) ;
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
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1475:28: ( ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'root' ( (otherlv_6= RULE_ID ) ) otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1476:1: ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'root' ( (otherlv_6= RULE_ID ) ) otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1476:1: ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'root' ( (otherlv_6= RULE_ID ) ) otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1476:2: ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'root' ( (otherlv_6= RULE_ID ) ) otherlv_7= '{' ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) ) ( (lv_variables_9_0= ruleVariable ) )* ( (lv_constructors_10_0= ruleConstructor ) )* ( (lv_methods_11_0= ruleMethod ) )* otherlv_12= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1476:2: ( (lv_doc_0_0= RULE_DOC ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1477:1: (lv_doc_0_0= RULE_DOC )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1477:1: (lv_doc_0_0= RULE_DOC )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1478:3: lv_doc_0_0= RULE_DOC
            {
            lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleEntity3003); 

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

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleEntity3020); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1498:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1499:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1499:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1500:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity3037); 

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

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleEntity3054); 

                	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getIdentifierKeyword_3());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1520:1: ( (otherlv_4= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1521:1: (otherlv_4= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1521:1: (otherlv_4= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1522:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity3074); 

            		newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getIdTypeEntityIdCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleEntity3086); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getRootKeyword_5());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1537:1: ( (otherlv_6= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1538:1: (otherlv_6= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1538:1: (otherlv_6= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1539:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity3106); 

            		newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRootAggregateCrossReference_6_0()); 
            	

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleEntity3118); 

                	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_7());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1554:1: ( (lv_metaInfo_8_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1555:1: (lv_metaInfo_8_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1555:1: (lv_metaInfo_8_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1556:3: lv_metaInfo_8_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getMetaInfoTypeMetaInfoParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleEntity3139);
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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1572:2: ( (lv_variables_9_0= ruleVariable ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_DOC) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==RULE_ID||LA30_1==45) ) {
                        alt30=1;
                    }


                }
                else if ( (LA30_0==RULE_ID||LA30_0==45) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1573:1: (lv_variables_9_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1573:1: (lv_variables_9_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1574:3: lv_variables_9_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getVariablesVariableParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleEntity3160);
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
            	    break loop30;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1590:3: ( (lv_constructors_10_0= ruleConstructor ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_DOC) ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1==36) ) {
                        alt31=1;
                    }


                }
                else if ( (LA31_0==36) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1591:1: (lv_constructors_10_0= ruleConstructor )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1591:1: (lv_constructors_10_0= ruleConstructor )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1592:3: lv_constructors_10_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getConstructorsConstructorParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleEntity3182);
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
            	    break loop31;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1608:3: ( (lv_methods_11_0= ruleMethod ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_DOC||LA32_0==37) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1609:1: (lv_methods_11_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1609:1: (lv_methods_11_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1610:3: lv_methods_11_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getMethodsMethodParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleEntity3204);
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
            	    break loop32;
                }
            } while (true);

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleEntity3217); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1638:1: entryRuleAggregate returns [EObject current=null] : iv_ruleAggregate= ruleAggregate EOF ;
    public final EObject entryRuleAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregate = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1639:2: (iv_ruleAggregate= ruleAggregate EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1640:2: iv_ruleAggregate= ruleAggregate EOF
            {
             newCompositeNode(grammarAccess.getAggregateRule()); 
            pushFollow(FOLLOW_ruleAggregate_in_entryRuleAggregate3253);
            iv_ruleAggregate=ruleAggregate();

            state._fsp--;

             current =iv_ruleAggregate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAggregate3263); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1647:1: ruleAggregate returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'aggregate' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) ;
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
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1650:28: ( ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'aggregate' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1651:1: ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'aggregate' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1651:1: ( ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'aggregate' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1651:2: ( (lv_doc_0_0= RULE_DOC ) ) otherlv_1= 'aggregate' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'identifier' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) ) ( (lv_variables_7_0= ruleVariable ) )* ( (lv_constructors_8_0= ruleConstructor ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1651:2: ( (lv_doc_0_0= RULE_DOC ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1652:1: (lv_doc_0_0= RULE_DOC )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1652:1: (lv_doc_0_0= RULE_DOC )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1653:3: lv_doc_0_0= RULE_DOC
            {
            lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleAggregate3305); 

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

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleAggregate3322); 

                	newLeafNode(otherlv_1, grammarAccess.getAggregateAccess().getAggregateKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1673:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1674:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1674:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1675:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAggregate3339); 

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

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleAggregate3356); 

                	newLeafNode(otherlv_3, grammarAccess.getAggregateAccess().getIdentifierKeyword_3());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1695:1: ( (otherlv_4= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1696:1: (otherlv_4= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1696:1: (otherlv_4= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1697:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAggregateRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAggregate3376); 

            		newLeafNode(otherlv_4, grammarAccess.getAggregateAccess().getIdTypeAggregateIdCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleAggregate3388); 

                	newLeafNode(otherlv_5, grammarAccess.getAggregateAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1712:1: ( (lv_metaInfo_6_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1713:1: (lv_metaInfo_6_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1713:1: (lv_metaInfo_6_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1714:3: lv_metaInfo_6_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getAggregateAccess().getMetaInfoTypeMetaInfoParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleAggregate3409);
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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1730:2: ( (lv_variables_7_0= ruleVariable ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_DOC) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==RULE_ID||LA33_1==45) ) {
                        alt33=1;
                    }


                }
                else if ( (LA33_0==RULE_ID||LA33_0==45) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1731:1: (lv_variables_7_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1731:1: (lv_variables_7_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1732:3: lv_variables_7_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateAccess().getVariablesVariableParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleAggregate3430);
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
            	    break loop33;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1748:3: ( (lv_constructors_8_0= ruleConstructor ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_DOC) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==36) ) {
                        alt34=1;
                    }


                }
                else if ( (LA34_0==36) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1749:1: (lv_constructors_8_0= ruleConstructor )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1749:1: (lv_constructors_8_0= ruleConstructor )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1750:3: lv_constructors_8_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateAccess().getConstructorsConstructorParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleAggregate3452);
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
            	    break loop34;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1766:3: ( (lv_methods_9_0= ruleMethod ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_DOC||LA35_0==37) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1767:1: (lv_methods_9_0= ruleMethod )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1767:1: (lv_methods_9_0= ruleMethod )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1768:3: lv_methods_9_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAggregateAccess().getMethodsMethodParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleAggregate3474);
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
            	    break loop35;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleAggregate3487); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1798:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1799:2: (iv_ruleConstructor= ruleConstructor EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1800:2: iv_ruleConstructor= ruleConstructor EOF
            {
             newCompositeNode(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_ruleConstructor_in_entryRuleConstructor3525);
            iv_ruleConstructor=ruleConstructor();

            state._fsp--;

             current =iv_ruleConstructor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor3535); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1807:1: ruleConstructor returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constructor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* ( (lv_constraints_5_0= ruleConstraints ) )? ( (lv_events_6_0= ruleEvent ) )* otherlv_7= '}' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_variables_4_0 = null;

        EObject lv_constraints_5_0 = null;

        EObject lv_events_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1810:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constructor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* ( (lv_constraints_5_0= ruleConstraints ) )? ( (lv_events_6_0= ruleEvent ) )* otherlv_7= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1811:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constructor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* ( (lv_constraints_5_0= ruleConstraints ) )? ( (lv_events_6_0= ruleEvent ) )* otherlv_7= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1811:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constructor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* ( (lv_constraints_5_0= ruleConstraints ) )? ( (lv_events_6_0= ruleEvent ) )* otherlv_7= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1811:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'constructor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* ( (lv_constraints_5_0= ruleConstraints ) )? ( (lv_events_6_0= ruleEvent ) )* otherlv_7= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1811:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_DOC) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1812:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1812:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1813:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleConstructor3577); 

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

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleConstructor3595); 

                	newLeafNode(otherlv_1, grammarAccess.getConstructorAccess().getConstructorKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1833:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1834:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1834:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1835:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor3612); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleConstructor3629); 

                	newLeafNode(otherlv_3, grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1855:1: ( (lv_variables_4_0= ruleVariable ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_DOC) ) {
                    int LA37_2 = input.LA(2);

                    if ( (LA37_2==RULE_ID||LA37_2==45) ) {
                        alt37=1;
                    }


                }
                else if ( (LA37_0==RULE_ID||LA37_0==45) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1856:1: (lv_variables_4_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1856:1: (lv_variables_4_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1857:3: lv_variables_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstructorAccess().getVariablesVariableParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleConstructor3650);
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
            	    break loop37;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1873:3: ( (lv_constraints_5_0= ruleConstraints ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==47) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1874:1: (lv_constraints_5_0= ruleConstraints )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1874:1: (lv_constraints_5_0= ruleConstraints )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1875:3: lv_constraints_5_0= ruleConstraints
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstructorAccess().getConstraintsConstraintsParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstraints_in_ruleConstructor3672);
                    lv_constraints_5_0=ruleConstraints();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
                    	        }
                           		set(
                           			current, 
                           			"constraints",
                            		lv_constraints_5_0, 
                            		"Constraints");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1891:3: ( (lv_events_6_0= ruleEvent ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_DOC||LA39_0==39) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1892:1: (lv_events_6_0= ruleEvent )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1892:1: (lv_events_6_0= ruleEvent )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1893:3: lv_events_6_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstructorAccess().getEventsEventParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleConstructor3694);
            	    lv_events_6_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_6_0, 
            	            		"Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleConstructor3707); 

                	newLeafNode(otherlv_7, grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRuleMethod"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1921:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1922:2: (iv_ruleMethod= ruleMethod EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1923:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod3743);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod3753); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1930:1: ruleMethod returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'ref' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* ( (lv_constraints_7_0= ruleConstraints ) )? ( (lv_events_8_0= ruleEvent ) )* otherlv_9= '}' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        EObject lv_variables_6_0 = null;

        EObject lv_constraints_7_0 = null;

        EObject lv_events_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1933:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'ref' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* ( (lv_constraints_7_0= ruleConstraints ) )? ( (lv_events_8_0= ruleEvent ) )* otherlv_9= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1934:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'ref' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* ( (lv_constraints_7_0= ruleConstraints ) )? ( (lv_events_8_0= ruleEvent ) )* otherlv_9= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1934:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'ref' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* ( (lv_constraints_7_0= ruleConstraints ) )? ( (lv_events_8_0= ruleEvent ) )* otherlv_9= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1934:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'ref' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* ( (lv_constraints_7_0= ruleConstraints ) )? ( (lv_events_8_0= ruleEvent ) )* otherlv_9= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1934:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_DOC) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1935:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1935:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1936:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleMethod3795); 

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

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleMethod3813); 

                	newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getMethodKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1956:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1957:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1957:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1958:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod3830); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1974:2: (otherlv_3= 'ref' ( ( ruleFQN ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==38) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1974:4: otherlv_3= 'ref' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleMethod3848); 

                        	newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getRefKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1978:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1979:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1979:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1980:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getRefMethodMethodCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleMethod3871);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleMethod3885); 

                	newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1997:1: ( (lv_variables_6_0= ruleVariable ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_DOC) ) {
                    int LA42_2 = input.LA(2);

                    if ( (LA42_2==RULE_ID||LA42_2==45) ) {
                        alt42=1;
                    }


                }
                else if ( (LA42_0==RULE_ID||LA42_0==45) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1998:1: (lv_variables_6_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1998:1: (lv_variables_6_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:1999:3: lv_variables_6_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getVariablesVariableParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleMethod3906);
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
            	    break loop42;
                }
            } while (true);

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2015:3: ( (lv_constraints_7_0= ruleConstraints ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==47) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2016:1: (lv_constraints_7_0= ruleConstraints )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2016:1: (lv_constraints_7_0= ruleConstraints )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2017:3: lv_constraints_7_0= ruleConstraints
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getConstraintsConstraintsParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstraints_in_ruleMethod3928);
                    lv_constraints_7_0=ruleConstraints();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	        }
                           		set(
                           			current, 
                           			"constraints",
                            		lv_constraints_7_0, 
                            		"Constraints");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2033:3: ( (lv_events_8_0= ruleEvent ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_DOC||LA44_0==39) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2034:1: (lv_events_8_0= ruleEvent )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2034:1: (lv_events_8_0= ruleEvent )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2035:3: lv_events_8_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getEventsEventParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleMethod3950);
            	    lv_events_8_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_8_0, 
            	            		"Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleMethod3963); 

                	newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2063:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2064:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2065:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent3999);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent4009); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2072:1: ruleEvent returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= '}' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_variables_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2075:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2076:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2076:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2076:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= '}'
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2076:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_DOC) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2077:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2077:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2078:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleEvent4051); 

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

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleEvent4069); 

                	newLeafNode(otherlv_1, grammarAccess.getEventAccess().getEventKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2098:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2099:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2099:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2100:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent4086); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleEvent4103); 

                	newLeafNode(otherlv_3, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2120:1: ( (lv_variables_4_0= ruleVariable ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_DOC)||LA46_0==45) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2121:1: (lv_variables_4_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2121:1: (lv_variables_4_0= ruleVariable )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2122:3: lv_variables_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEventAccess().getVariablesVariableParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleEvent4124);
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
            	    break loop46;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleEvent4137); 

                	newLeafNode(otherlv_5, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2150:1: entryRuleTypeMetaInfo returns [EObject current=null] : iv_ruleTypeMetaInfo= ruleTypeMetaInfo EOF ;
    public final EObject entryRuleTypeMetaInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeMetaInfo = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2151:2: (iv_ruleTypeMetaInfo= ruleTypeMetaInfo EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2152:2: iv_ruleTypeMetaInfo= ruleTypeMetaInfo EOF
            {
             newCompositeNode(grammarAccess.getTypeMetaInfoRule()); 
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_entryRuleTypeMetaInfo4173);
            iv_ruleTypeMetaInfo=ruleTypeMetaInfo();

            state._fsp--;

             current =iv_ruleTypeMetaInfo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeMetaInfo4183); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2159:1: ruleTypeMetaInfo returns [EObject current=null] : ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltipp' ( (lv_tooltipp_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )* )? ) ;
    public final EObject ruleTypeMetaInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_slabel_2_0=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        Token lv_tooltipp_6_0=null;
        Token otherlv_7=null;
        Token lv_prompt_8_0=null;
        Token otherlv_9=null;
        Token lv_examples_10_0=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2162:28: ( ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltipp' ( (lv_tooltipp_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )* )? ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2163:1: ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltipp' ( (lv_tooltipp_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )* )? )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2163:1: ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltipp' ( (lv_tooltipp_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )* )? )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2163:2: () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltipp' ( (lv_tooltipp_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )* )?
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2163:2: ()
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2164:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTypeMetaInfoAccess().getTypeMetaInfoAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2169:2: (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==40) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2169:4: otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleTypeMetaInfo4230); 

                        	newLeafNode(otherlv_1, grammarAccess.getTypeMetaInfoAccess().getSlabelKeyword_1_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2173:1: ( (lv_slabel_2_0= RULE_STRING ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2174:1: (lv_slabel_2_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2174:1: (lv_slabel_2_0= RULE_STRING )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2175:3: lv_slabel_2_0= RULE_STRING
                    {
                    lv_slabel_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo4247); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2191:4: (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==41) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2191:6: otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleTypeMetaInfo4267); 

                        	newLeafNode(otherlv_3, grammarAccess.getTypeMetaInfoAccess().getLabelKeyword_2_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2195:1: ( (lv_label_4_0= RULE_STRING ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2196:1: (lv_label_4_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2196:1: (lv_label_4_0= RULE_STRING )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2197:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo4284); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2213:4: (otherlv_5= 'tooltipp' ( (lv_tooltipp_6_0= RULE_STRING ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==42) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2213:6: otherlv_5= 'tooltipp' ( (lv_tooltipp_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleTypeMetaInfo4304); 

                        	newLeafNode(otherlv_5, grammarAccess.getTypeMetaInfoAccess().getTooltippKeyword_3_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2217:1: ( (lv_tooltipp_6_0= RULE_STRING ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2218:1: (lv_tooltipp_6_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2218:1: (lv_tooltipp_6_0= RULE_STRING )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2219:3: lv_tooltipp_6_0= RULE_STRING
                    {
                    lv_tooltipp_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo4321); 

                    			newLeafNode(lv_tooltipp_6_0, grammarAccess.getTypeMetaInfoAccess().getTooltippSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeMetaInfoRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"tooltipp",
                            		lv_tooltipp_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2235:4: (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==43) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2235:6: otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_43_in_ruleTypeMetaInfo4341); 

                        	newLeafNode(otherlv_7, grammarAccess.getTypeMetaInfoAccess().getPromptKeyword_4_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2239:1: ( (lv_prompt_8_0= RULE_STRING ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2240:1: (lv_prompt_8_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2240:1: (lv_prompt_8_0= RULE_STRING )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2241:3: lv_prompt_8_0= RULE_STRING
                    {
                    lv_prompt_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo4358); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2257:4: (otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==44) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2257:6: otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )*
                    {
                    otherlv_9=(Token)match(input,44,FOLLOW_44_in_ruleTypeMetaInfo4378); 

                        	newLeafNode(otherlv_9, grammarAccess.getTypeMetaInfoAccess().getExamplesKeyword_5_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2261:1: ( (lv_examples_10_0= RULE_STRING ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==RULE_STRING) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2262:1: (lv_examples_10_0= RULE_STRING )
                    	    {
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2262:1: (lv_examples_10_0= RULE_STRING )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2263:3: lv_examples_10_0= RULE_STRING
                    	    {
                    	    lv_examples_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo4395); 

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
                    	    break loop51;
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2287:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2288:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2289:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable4439);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable4449); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2296:1: ruleVariable returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? | otherlv_7= ';' ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token lv_nullable_1_0=null;
        Token otherlv_2=null;
        Token lv_multiplicity_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_7=null;
        EObject lv_invariants_5_0 = null;

        EObject lv_overridden_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2299:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? | otherlv_7= ';' ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2300:1: ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? | otherlv_7= ';' ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2300:1: ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? | otherlv_7= ';' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2300:2: ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? | otherlv_7= ';' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2300:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_DOC) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2301:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2301:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2302:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleVariable4491); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2318:3: ( (lv_nullable_1_0= 'nullable' ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==45) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2319:1: (lv_nullable_1_0= 'nullable' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2319:1: (lv_nullable_1_0= 'nullable' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2320:3: lv_nullable_1_0= 'nullable'
                    {
                    lv_nullable_1_0=(Token)match(input,45,FOLLOW_45_in_ruleVariable4515); 

                            newLeafNode(lv_nullable_1_0, grammarAccess.getVariableAccess().getNullableNullableKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableRule());
                    	        }
                           		setWithLastConsumed(current, "nullable", lv_nullable_1_0, "nullable");
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2333:3: ( (otherlv_2= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2334:1: (otherlv_2= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2334:1: (otherlv_2= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2335:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable4549); 

            		newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getTypeTypeCrossReference_2_0()); 
            	

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2346:2: ( (lv_multiplicity_3_0= '*' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==46) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2347:1: (lv_multiplicity_3_0= '*' )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2347:1: (lv_multiplicity_3_0= '*' )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2348:3: lv_multiplicity_3_0= '*'
                    {
                    lv_multiplicity_3_0=(Token)match(input,46,FOLLOW_46_in_ruleVariable4567); 

                            newLeafNode(lv_multiplicity_3_0, grammarAccess.getVariableAccess().getMultiplicityAsteriskKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableRule());
                    	        }
                           		setWithLastConsumed(current, "multiplicity", lv_multiplicity_3_0, "*");
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2361:3: ( (lv_name_4_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2362:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2362:1: (lv_name_4_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2363:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable4598); 

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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2379:2: ( (lv_invariants_5_0= ruleInvariants ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==48) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2380:1: (lv_invariants_5_0= ruleInvariants )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2380:1: (lv_invariants_5_0= ruleInvariants )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2381:3: lv_invariants_5_0= ruleInvariants
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getInvariantsInvariantsParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInvariants_in_ruleVariable4624);
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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2397:3: ( ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? | otherlv_7= ';' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==EOF||(LA58_0>=RULE_ID && LA58_0<=RULE_DOC)||(LA58_0>=14 && LA58_0<=15)||LA58_0==22||LA58_0==28||(LA58_0>=36 && LA58_0<=37)||LA58_0==39||LA58_0==45||LA58_0==47) ) {
                alt58=1;
            }
            else if ( (LA58_0==17) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2397:4: ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )?
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2397:4: ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==14) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2398:1: (lv_overridden_6_0= ruleOverriddenTypeMetaInfo )
                            {
                            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2398:1: (lv_overridden_6_0= ruleOverriddenTypeMetaInfo )
                            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2399:3: lv_overridden_6_0= ruleOverriddenTypeMetaInfo
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariableAccess().getOverriddenOverriddenTypeMetaInfoParserRuleCall_6_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleOverriddenTypeMetaInfo_in_ruleVariable4647);
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
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2416:7: otherlv_7= ';'
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleVariable4666); 

                        	newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getSemicolonKeyword_6_1());
                        

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2428:1: entryRuleConstraints returns [EObject current=null] : iv_ruleConstraints= ruleConstraints EOF ;
    public final EObject entryRuleConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraints = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2429:2: (iv_ruleConstraints= ruleConstraints EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2430:2: iv_ruleConstraints= ruleConstraints EOF
            {
             newCompositeNode(grammarAccess.getConstraintsRule()); 
            pushFollow(FOLLOW_ruleConstraints_in_entryRuleConstraints4703);
            iv_ruleConstraints=ruleConstraints();

            state._fsp--;

             current =iv_ruleConstraints; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraints4713); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2437:1: ruleConstraints returns [EObject current=null] : (otherlv_0= 'constraints' otherlv_1= '{' ( (lv_calls_2_0= ruleConstraintCall ) ) (otherlv_3= ',' ( (lv_calls_4_0= ruleConstraintCall ) ) )* otherlv_5= '}' ) ;
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
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2440:28: ( (otherlv_0= 'constraints' otherlv_1= '{' ( (lv_calls_2_0= ruleConstraintCall ) ) (otherlv_3= ',' ( (lv_calls_4_0= ruleConstraintCall ) ) )* otherlv_5= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2441:1: (otherlv_0= 'constraints' otherlv_1= '{' ( (lv_calls_2_0= ruleConstraintCall ) ) (otherlv_3= ',' ( (lv_calls_4_0= ruleConstraintCall ) ) )* otherlv_5= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2441:1: (otherlv_0= 'constraints' otherlv_1= '{' ( (lv_calls_2_0= ruleConstraintCall ) ) (otherlv_3= ',' ( (lv_calls_4_0= ruleConstraintCall ) ) )* otherlv_5= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2441:3: otherlv_0= 'constraints' otherlv_1= '{' ( (lv_calls_2_0= ruleConstraintCall ) ) (otherlv_3= ',' ( (lv_calls_4_0= ruleConstraintCall ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleConstraints4750); 

                	newLeafNode(otherlv_0, grammarAccess.getConstraintsAccess().getConstraintsKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleConstraints4762); 

                	newLeafNode(otherlv_1, grammarAccess.getConstraintsAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2449:1: ( (lv_calls_2_0= ruleConstraintCall ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2450:1: (lv_calls_2_0= ruleConstraintCall )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2450:1: (lv_calls_2_0= ruleConstraintCall )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2451:3: lv_calls_2_0= ruleConstraintCall
            {
             
            	        newCompositeNode(grammarAccess.getConstraintsAccess().getCallsConstraintCallParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintCall_in_ruleConstraints4783);
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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2467:2: (otherlv_3= ',' ( (lv_calls_4_0= ruleConstraintCall ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==30) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2467:4: otherlv_3= ',' ( (lv_calls_4_0= ruleConstraintCall ) )
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleConstraints4796); 

            	        	newLeafNode(otherlv_3, grammarAccess.getConstraintsAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2471:1: ( (lv_calls_4_0= ruleConstraintCall ) )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2472:1: (lv_calls_4_0= ruleConstraintCall )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2472:1: (lv_calls_4_0= ruleConstraintCall )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2473:3: lv_calls_4_0= ruleConstraintCall
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstraintsAccess().getCallsConstraintCallParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstraintCall_in_ruleConstraints4817);
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
            	    break loop59;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleConstraints4831); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2501:1: entryRuleInvariants returns [EObject current=null] : iv_ruleInvariants= ruleInvariants EOF ;
    public final EObject entryRuleInvariants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariants = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2502:2: (iv_ruleInvariants= ruleInvariants EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2503:2: iv_ruleInvariants= ruleInvariants EOF
            {
             newCompositeNode(grammarAccess.getInvariantsRule()); 
            pushFollow(FOLLOW_ruleInvariants_in_entryRuleInvariants4867);
            iv_ruleInvariants=ruleInvariants();

            state._fsp--;

             current =iv_ruleInvariants; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvariants4877); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2510:1: ruleInvariants returns [EObject current=null] : (otherlv_0= 'invariants' ( (lv_calls_1_0= ruleConstraintCall ) ) (otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) ) )* ) ;
    public final EObject ruleInvariants() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_calls_1_0 = null;

        EObject lv_calls_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2513:28: ( (otherlv_0= 'invariants' ( (lv_calls_1_0= ruleConstraintCall ) ) (otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) ) )* ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2514:1: (otherlv_0= 'invariants' ( (lv_calls_1_0= ruleConstraintCall ) ) (otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) ) )* )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2514:1: (otherlv_0= 'invariants' ( (lv_calls_1_0= ruleConstraintCall ) ) (otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) ) )* )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2514:3: otherlv_0= 'invariants' ( (lv_calls_1_0= ruleConstraintCall ) ) (otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) ) )*
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleInvariants4914); 

                	newLeafNode(otherlv_0, grammarAccess.getInvariantsAccess().getInvariantsKeyword_0());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2518:1: ( (lv_calls_1_0= ruleConstraintCall ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2519:1: (lv_calls_1_0= ruleConstraintCall )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2519:1: (lv_calls_1_0= ruleConstraintCall )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2520:3: lv_calls_1_0= ruleConstraintCall
            {
             
            	        newCompositeNode(grammarAccess.getInvariantsAccess().getCallsConstraintCallParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintCall_in_ruleInvariants4935);
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

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2536:2: (otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==30) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2536:4: otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleInvariants4948); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInvariantsAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2540:1: ( (lv_calls_3_0= ruleConstraintCall ) )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2541:1: (lv_calls_3_0= ruleConstraintCall )
            	    {
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2541:1: (lv_calls_3_0= ruleConstraintCall )
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2542:3: lv_calls_3_0= ruleConstraintCall
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInvariantsAccess().getCallsConstraintCallParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstraintCall_in_ruleInvariants4969);
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
            	    break loop60;
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2566:1: entryRuleOverriddenTypeMetaInfo returns [EObject current=null] : iv_ruleOverriddenTypeMetaInfo= ruleOverriddenTypeMetaInfo EOF ;
    public final EObject entryRuleOverriddenTypeMetaInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverriddenTypeMetaInfo = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2567:2: (iv_ruleOverriddenTypeMetaInfo= ruleOverriddenTypeMetaInfo EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2568:2: iv_ruleOverriddenTypeMetaInfo= ruleOverriddenTypeMetaInfo EOF
            {
             newCompositeNode(grammarAccess.getOverriddenTypeMetaInfoRule()); 
            pushFollow(FOLLOW_ruleOverriddenTypeMetaInfo_in_entryRuleOverriddenTypeMetaInfo5007);
            iv_ruleOverriddenTypeMetaInfo=ruleOverriddenTypeMetaInfo();

            state._fsp--;

             current =iv_ruleOverriddenTypeMetaInfo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverriddenTypeMetaInfo5017); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2575:1: ruleOverriddenTypeMetaInfo returns [EObject current=null] : (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' ) ;
    public final EObject ruleOverriddenTypeMetaInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_metaInfo_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2578:28: ( (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2579:1: (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2579:1: (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2579:3: otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleOverriddenTypeMetaInfo5054); 

                	newLeafNode(otherlv_0, grammarAccess.getOverriddenTypeMetaInfoAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2583:1: ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2584:1: (lv_metaInfo_1_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2584:1: (lv_metaInfo_1_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2585:3: lv_metaInfo_1_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getOverriddenTypeMetaInfoAccess().getMetaInfoTypeMetaInfoParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleOverriddenTypeMetaInfo5075);
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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleOverriddenTypeMetaInfo5087); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2613:1: entryRuleConstraintCall returns [EObject current=null] : iv_ruleConstraintCall= ruleConstraintCall EOF ;
    public final EObject entryRuleConstraintCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintCall = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2614:2: (iv_ruleConstraintCall= ruleConstraintCall EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2615:2: iv_ruleConstraintCall= ruleConstraintCall EOF
            {
             newCompositeNode(grammarAccess.getConstraintCallRule()); 
            pushFollow(FOLLOW_ruleConstraintCall_in_entryRuleConstraintCall5123);
            iv_ruleConstraintCall=ruleConstraintCall();

            state._fsp--;

             current =iv_ruleConstraintCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintCall5133); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2622:1: ruleConstraintCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? ) ;
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
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2625:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2626:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2626:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2626:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )?
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2626:2: ( (otherlv_0= RULE_ID ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2627:1: (otherlv_0= RULE_ID )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2627:1: (otherlv_0= RULE_ID )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2628:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstraintCallRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraintCall5178); 

            		newLeafNode(otherlv_0, grammarAccess.getConstraintCallAccess().getConstraintConstraintCrossReference_0_0()); 
            	

            }


            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2639:2: (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==29) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2639:4: otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleConstraintCall5191); 

                        	newLeafNode(otherlv_1, grammarAccess.getConstraintCallAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2643:1: ( (lv_params_2_0= ruleLiteral ) )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2644:1: (lv_params_2_0= ruleLiteral )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2644:1: (lv_params_2_0= ruleLiteral )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2645:3: lv_params_2_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstraintCallAccess().getParamsLiteralParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleConstraintCall5212);
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

                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2661:2: (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==30) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2661:4: otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleConstraintCall5225); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getConstraintCallAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2665:1: ( (lv_params_4_0= ruleLiteral ) )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2666:1: (lv_params_4_0= ruleLiteral )
                    	    {
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2666:1: (lv_params_4_0= ruleLiteral )
                    	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2667:3: lv_params_4_0= ruleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstraintCallAccess().getParamsLiteralParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteral_in_ruleConstraintCall5246);
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
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleConstraintCall5260); 

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


    // $ANTLR start "entryRuleLiteral"
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2695:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2696:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2697:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral5298);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral5308); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2704:1: ruleLiteral returns [EObject current=null] : (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NullLiteral_0 = null;

        EObject this_BooleanLiteral_1 = null;

        EObject this_NumberLiteral_2 = null;

        EObject this_StringLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2707:28: ( (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2708:1: (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2708:1: (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral )
            int alt63=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt63=1;
                }
                break;
            case 50:
            case 51:
                {
                alt63=2;
                }
                break;
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt63=3;
                }
                break;
            case RULE_STRING:
                {
                alt63=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2709:5: this_NullLiteral_0= ruleNullLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteral5355);
                    this_NullLiteral_0=ruleNullLiteral();

                    state._fsp--;

                     
                            current = this_NullLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2719:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral5382);
                    this_BooleanLiteral_1=ruleBooleanLiteral();

                    state._fsp--;

                     
                            current = this_BooleanLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2729:5: this_NumberLiteral_2= ruleNumberLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteral5409);
                    this_NumberLiteral_2=ruleNumberLiteral();

                    state._fsp--;

                     
                            current = this_NumberLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2739:5: this_StringLiteral_3= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral5436);
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2755:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2756:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2757:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN5472);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN5483); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2764:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2767:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2768:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2768:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2768:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN5523); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2775:1: (kw= '.' this_ID_2= RULE_ID )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==49) ) {
                    int LA64_2 = input.LA(2);

                    if ( (LA64_2==RULE_ID) ) {
                        alt64=1;
                    }


                }


                switch (alt64) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2776:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,49,FOLLOW_49_in_ruleFQN5542); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN5557); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop64;
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2796:1: entryRuleFQNWithWildcard returns [String current=null] : iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF ;
    public final String entryRuleFQNWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQNWithWildcard = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2797:2: (iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2798:2: iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getFQNWithWildcardRule()); 
            pushFollow(FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard5605);
            iv_ruleFQNWithWildcard=ruleFQNWithWildcard();

            state._fsp--;

             current =iv_ruleFQNWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQNWithWildcard5616); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2805:1: ruleFQNWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleFQNWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2808:28: ( (this_FQN_0= ruleFQN kw= '.' kw= '*' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2809:1: (this_FQN_0= ruleFQN kw= '.' kw= '*' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2809:1: (this_FQN_0= ruleFQN kw= '.' kw= '*' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2810:5: this_FQN_0= ruleFQN kw= '.' kw= '*'
            {
             
                    newCompositeNode(grammarAccess.getFQNWithWildcardAccess().getFQNParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFQN_in_ruleFQNWithWildcard5663);
            this_FQN_0=ruleFQN();

            state._fsp--;


            		current.merge(this_FQN_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,49,FOLLOW_49_in_ruleFQNWithWildcard5681); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFQNWithWildcardAccess().getFullStopKeyword_1()); 
                
            kw=(Token)match(input,46,FOLLOW_46_in_ruleFQNWithWildcard5694); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2840:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2841:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2842:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral5734);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral5744); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2849:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2852:28: ( ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2853:1: ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2853:1: ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2853:2: () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2853:2: ()
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2854:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2859:2: ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2860:1: ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2860:1: ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2861:1: (lv_value_1_1= 'false' | lv_value_1_2= 'true' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2861:1: (lv_value_1_1= 'false' | lv_value_1_2= 'true' )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==50) ) {
                alt65=1;
            }
            else if ( (LA65_0==51) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2862:3: lv_value_1_1= 'false'
                    {
                    lv_value_1_1=(Token)match(input,50,FOLLOW_50_in_ruleBooleanLiteral5798); 

                            newLeafNode(lv_value_1_1, grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2874:8: lv_value_1_2= 'true'
                    {
                    lv_value_1_2=(Token)match(input,51,FOLLOW_51_in_ruleBooleanLiteral5827); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2897:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2898:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2899:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
             newCompositeNode(grammarAccess.getNullLiteralRule()); 
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral5879);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;

             current =iv_ruleNullLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral5889); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2906:1: ruleNullLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= 'null' ) ) ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2909:28: ( ( () ( (lv_value_1_0= 'null' ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2910:1: ( () ( (lv_value_1_0= 'null' ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2910:1: ( () ( (lv_value_1_0= 'null' ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2910:2: () ( (lv_value_1_0= 'null' ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2910:2: ()
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2911:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNullLiteralAccess().getNullLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2916:2: ( (lv_value_1_0= 'null' ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2917:1: (lv_value_1_0= 'null' )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2917:1: (lv_value_1_0= 'null' )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2918:3: lv_value_1_0= 'null'
            {
            lv_value_1_0=(Token)match(input,52,FOLLOW_52_in_ruleNullLiteral5941); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2939:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2940:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2941:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral5990);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral6000); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2948:1: ruleNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2951:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2952:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2952:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2952:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2952:2: ()
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2953:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumberLiteralAccess().getNumberLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2958:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2959:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2959:1: (lv_value_1_0= ruleNumber )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2960:3: lv_value_1_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNumber_in_ruleNumberLiteral6055);
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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2984:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2985:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2986:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6091);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral6101); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2993:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2996:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2997:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2997:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2997:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2997:2: ()
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:2998:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3003:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3004:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3004:1: (lv_value_1_0= RULE_STRING )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3005:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral6152); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3029:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3033:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3034:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber6200);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber6211); 

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
    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3044:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3048:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3049:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3049:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_HEX) ) {
                alt69=1;
            }
            else if ( ((LA69_0>=RULE_INT && LA69_0<=RULE_DECIMAL)) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3049:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber6255); 

                    		current.merge(this_HEX_0);
                        
                     
                        newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3057:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3057:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3057:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3057:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==RULE_INT) ) {
                        alt66=1;
                    }
                    else if ( (LA66_0==RULE_DECIMAL) ) {
                        alt66=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3057:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber6283); 

                            		current.merge(this_INT_1);
                                
                             
                                newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3065:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber6309); 

                            		current.merge(this_DECIMAL_2);
                                
                             
                                newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                

                            }
                            break;

                    }

                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3072:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==49) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3073:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,49,FOLLOW_49_in_ruleNumber6329); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                
                            // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3078:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt67=2;
                            int LA67_0 = input.LA(1);

                            if ( (LA67_0==RULE_INT) ) {
                                alt67=1;
                            }
                            else if ( (LA67_0==RULE_DECIMAL) ) {
                                alt67=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 67, 0, input);

                                throw nvae;
                            }
                            switch (alt67) {
                                case 1 :
                                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3078:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber6345); 

                                    		current.merge(this_INT_4);
                                        
                                     
                                        newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../org.fuin.dsl.ddd.dsl/src-gen/org/fuin/dsl/ddd/parser/antlr/internal/InternalDomainDrivenDesignDsl.g:3086:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber6371); 

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


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\6\uffff";
    static final String DFA3_eofS =
        "\6\uffff";
    static final String DFA3_minS =
        "\1\4\1\21\1\4\1\uffff\1\21\1\uffff";
    static final String DFA3_maxS =
        "\1\4\1\61\1\56\1\uffff\1\61\1\uffff";
    static final String DFA3_acceptS =
        "\3\uffff\1\1\1\uffff\1\2";
    static final String DFA3_specialS =
        "\6\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\3\37\uffff\1\2",
            "\1\4\51\uffff\1\5",
            "",
            "\1\3\37\uffff\1\2",
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
            return "212:1: (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard )";
        }
    }
 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_ruleDomainModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleNamespace212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleNamespace233 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNamespace245 = new BitSet(new long[]{0x0000000000058020L});
    public static final BitSet FOLLOW_ruleImport_in_ruleNamespace266 = new BitSet(new long[]{0x0000000000058020L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleNamespace288 = new BitSet(new long[]{0x0000000000048020L});
    public static final BitSet FOLLOW_15_in_ruleNamespace301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleImport384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleImport407 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_ruleImport426 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleImport441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleAbstractElement534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleAbstractElement561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalType_in_ruleType653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalType_in_ruleType680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalType_in_entryRuleInternalType715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalType725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractVO_in_ruleInternalType772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractEntity_in_ruleInternalType799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractVO_in_entryRuleAbstractVO834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractVO844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_ruleAbstractVO891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumObject_in_ruleAbstractVO918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractEntityId_in_ruleAbstractVO945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractEntityId_in_entryRuleAbstractEntityId980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractEntityId990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityId_in_ruleAbstractEntityId1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregateId_in_ruleAbstractEntityId1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractEntity_in_entryRuleAbstractEntity1099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractEntity1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleAbstractEntity1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregate_in_ruleAbstractEntity1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalType_in_entryRuleExternalType1220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalType1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleExternalType1267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalType1284 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleExternalType1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint1337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleConstraint1389 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConstraint1406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint1423 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConstraint1440 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint1460 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_21_in_ruleConstraint1473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint1490 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConstraint1509 = new BitSet(new long[]{0x0000200000400030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleConstraint1530 = new BitSet(new long[]{0x0000200000400030L});
    public static final BitSet FOLLOW_22_in_ruleConstraint1543 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint1560 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleConstraint1577 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConstraint1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_entryRuleValueObject1625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueObject1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleValueObject1677 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleValueObject1694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValueObject1711 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_24_in_ruleValueObject1729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValueObject1749 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleValueObject1763 = new BitSet(new long[]{0x00003F3000008030L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleValueObject1784 = new BitSet(new long[]{0x0000203000008030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleValueObject1805 = new BitSet(new long[]{0x0000203000008030L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleValueObject1827 = new BitSet(new long[]{0x0000003000008020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleValueObject1849 = new BitSet(new long[]{0x0000002000008020L});
    public static final BitSet FOLLOW_15_in_ruleValueObject1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityId_in_entryRuleEntityId1898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityId1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleEntityId1950 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEntityId1967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityId1984 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_24_in_ruleEntityId2002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityId2022 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntityId2036 = new BitSet(new long[]{0x00003F3000008030L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleEntityId2057 = new BitSet(new long[]{0x0000203000008030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleEntityId2078 = new BitSet(new long[]{0x0000203000008030L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleEntityId2100 = new BitSet(new long[]{0x0000003000008020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleEntityId2122 = new BitSet(new long[]{0x0000002000008020L});
    public static final BitSet FOLLOW_15_in_ruleEntityId2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregateId_in_entryRuleAggregateId2171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAggregateId2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleAggregateId2223 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAggregateId2240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAggregateId2257 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_24_in_ruleAggregateId2275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAggregateId2295 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAggregateId2309 = new BitSet(new long[]{0x00003F3000008030L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleAggregateId2330 = new BitSet(new long[]{0x0000203000008030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAggregateId2351 = new BitSet(new long[]{0x0000203000008030L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleAggregateId2373 = new BitSet(new long[]{0x0000003000008020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleAggregateId2395 = new BitSet(new long[]{0x0000002000008020L});
    public static final BitSet FOLLOW_15_in_ruleAggregateId2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumObject_in_entryRuleEnumObject2444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumObject2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleEnumObject2496 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEnumObject2513 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumObject2530 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumObject2547 = new BitSet(new long[]{0x00003F3010000030L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleEnumObject2568 = new BitSet(new long[]{0x0000203010000030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleEnumObject2589 = new BitSet(new long[]{0x0000203010000030L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleEnumObject2611 = new BitSet(new long[]{0x0000003010000020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleEnumObject2633 = new BitSet(new long[]{0x0000002010000020L});
    public static final BitSet FOLLOW_28_in_ruleEnumObject2646 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumObject2658 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_ruleEnumObject2679 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_15_in_ruleEnumObject2692 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEnumObject2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance2740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumInstance2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleEnumInstance2792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance2814 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_29_in_ruleEnumInstance2832 = new BitSet(new long[]{0x001C0000000003C0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleEnumInstance2853 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_30_in_ruleEnumInstance2866 = new BitSet(new long[]{0x001C0000000003C0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleEnumInstance2887 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_ruleEnumInstance2901 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEnumInstance2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity2951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleEntity3003 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleEntity3020 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity3037 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEntity3054 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity3074 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleEntity3086 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity3106 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntity3118 = new BitSet(new long[]{0x00003F3000008030L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleEntity3139 = new BitSet(new long[]{0x0000203000008030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleEntity3160 = new BitSet(new long[]{0x0000203000008030L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleEntity3182 = new BitSet(new long[]{0x0000003000008020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleEntity3204 = new BitSet(new long[]{0x0000002000008020L});
    public static final BitSet FOLLOW_15_in_ruleEntity3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregate_in_entryRuleAggregate3253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAggregate3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleAggregate3305 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleAggregate3322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAggregate3339 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAggregate3356 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAggregate3376 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAggregate3388 = new BitSet(new long[]{0x00003F3000008030L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleAggregate3409 = new BitSet(new long[]{0x0000203000008030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAggregate3430 = new BitSet(new long[]{0x0000203000008030L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleAggregate3452 = new BitSet(new long[]{0x0000003000008020L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleAggregate3474 = new BitSet(new long[]{0x0000002000008020L});
    public static final BitSet FOLLOW_15_in_ruleAggregate3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_entryRuleConstructor3525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleConstructor3577 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleConstructor3595 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor3612 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConstructor3629 = new BitSet(new long[]{0x0000A08000008030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleConstructor3650 = new BitSet(new long[]{0x0000A08000008030L});
    public static final BitSet FOLLOW_ruleConstraints_in_ruleConstructor3672 = new BitSet(new long[]{0x0000008000008020L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleConstructor3694 = new BitSet(new long[]{0x0000008000008020L});
    public static final BitSet FOLLOW_15_in_ruleConstructor3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod3743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleMethod3795 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleMethod3813 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod3830 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_38_in_ruleMethod3848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleMethod3871 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMethod3885 = new BitSet(new long[]{0x0000A08000008030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleMethod3906 = new BitSet(new long[]{0x0000A08000008030L});
    public static final BitSet FOLLOW_ruleConstraints_in_ruleMethod3928 = new BitSet(new long[]{0x0000008000008020L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleMethod3950 = new BitSet(new long[]{0x0000008000008020L});
    public static final BitSet FOLLOW_15_in_ruleMethod3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent3999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleEvent4051 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleEvent4069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent4086 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEvent4103 = new BitSet(new long[]{0x0000200000008030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleEvent4124 = new BitSet(new long[]{0x0000200000008030L});
    public static final BitSet FOLLOW_15_in_ruleEvent4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_entryRuleTypeMetaInfo4173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeMetaInfo4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleTypeMetaInfo4230 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo4247 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_41_in_ruleTypeMetaInfo4267 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo4284 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleTypeMetaInfo4304 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo4321 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_43_in_ruleTypeMetaInfo4341 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo4358 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleTypeMetaInfo4378 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo4395 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable4439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleVariable4491 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_45_in_ruleVariable4515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable4549 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_46_in_ruleVariable4567 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable4598 = new BitSet(new long[]{0x0001000000024002L});
    public static final BitSet FOLLOW_ruleInvariants_in_ruleVariable4624 = new BitSet(new long[]{0x0000000000024002L});
    public static final BitSet FOLLOW_ruleOverriddenTypeMetaInfo_in_ruleVariable4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleVariable4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraints_in_entryRuleConstraints4703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraints4713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleConstraints4750 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConstraints4762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_ruleConstraints4783 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_30_in_ruleConstraints4796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_ruleConstraints4817 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_15_in_ruleConstraints4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariants_in_entryRuleInvariants4867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvariants4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleInvariants4914 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_ruleInvariants4935 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleInvariants4948 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_ruleInvariants4969 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleOverriddenTypeMetaInfo_in_entryRuleOverriddenTypeMetaInfo5007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverriddenTypeMetaInfo5017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOverriddenTypeMetaInfo5054 = new BitSet(new long[]{0x00001F0000008000L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleOverriddenTypeMetaInfo5075 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleOverriddenTypeMetaInfo5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_entryRuleConstraintCall5123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintCall5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraintCall5178 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleConstraintCall5191 = new BitSet(new long[]{0x001C0000000003C0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleConstraintCall5212 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_30_in_ruleConstraintCall5225 = new BitSet(new long[]{0x001C0000000003C0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleConstraintCall5246 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_ruleConstraintCall5260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral5298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral5308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteral5355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral5382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteral5409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral5436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN5472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN5523 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleFQN5542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN5557 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard5605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQNWithWildcard5616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleFQNWithWildcard5663 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleFQNWithWildcard5681 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleFQNWithWildcard5694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral5734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral5744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleBooleanLiteral5798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleBooleanLiteral5827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral5879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral5889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleNullLiteral5941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral5990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral6000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumberLiteral6055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral6101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral6152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber6200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber6211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber6255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber6283 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber6309 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleNumber6329 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber6345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber6371 = new BitSet(new long[]{0x0000000000000002L});

}