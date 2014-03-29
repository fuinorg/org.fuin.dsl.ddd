package org.fuin.dsl.ddd.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AggregateId;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.BooleanLiteral;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintCall;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraints;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constructor;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainModel;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EntityId;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumInstance;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumObject;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Event;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Import;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Invariants;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Message;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Method;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Namespace;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.NullLiteral;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.NumberLiteral;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.OverriddenTypeMetaInfo;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.StringLiteral;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ValueObject;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable;
import org.fuin.dsl.ddd.services.DomainDrivenDesignDslGrammarAccess;

@SuppressWarnings("all")
public class DomainDrivenDesignDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DomainDrivenDesignDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DomainDrivenDesignDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DomainDrivenDesignDslPackage.AGGREGATE:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getAbstractEntityRule() ||
				   context == grammarAccess.getAggregateRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Aggregate(context, (Aggregate) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.AGGREGATE_ID:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getAbstractEntityIdRule() ||
				   context == grammarAccess.getAbstractVORule() ||
				   context == grammarAccess.getAggregateIdRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_AggregateId(context, (AggregateId) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getBooleanLiteralRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.CONSTRAINT:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getConstraintRule()) {
					sequence_Constraint(context, (Constraint) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.CONSTRAINT_CALL:
				if(context == grammarAccess.getConstraintCallRule()) {
					sequence_ConstraintCall(context, (ConstraintCall) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.CONSTRAINTS:
				if(context == grammarAccess.getConstraintsRule()) {
					sequence_Constraints(context, (Constraints) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.CONSTRUCTOR:
				if(context == grammarAccess.getConstructorRule()) {
					sequence_Constructor(context, (Constructor) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.DOMAIN_MODEL:
				if(context == grammarAccess.getDomainModelRule()) {
					sequence_DomainModel(context, (DomainModel) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.ENTITY:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getAbstractEntityRule() ||
				   context == grammarAccess.getEntityRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.ENTITY_ID:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getAbstractEntityIdRule() ||
				   context == grammarAccess.getAbstractVORule() ||
				   context == grammarAccess.getEntityIdRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_EntityId(context, (EntityId) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.ENUM_INSTANCE:
				if(context == grammarAccess.getEnumInstanceRule()) {
					sequence_EnumInstance(context, (EnumInstance) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.ENUM_OBJECT:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getAbstractVORule() ||
				   context == grammarAccess.getEnumObjectRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_EnumObject(context, (EnumObject) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.EVENT:
				if(context == grammarAccess.getEventRule()) {
					sequence_Event(context, (Event) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.EXTERNAL_TYPE:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getConstraintTargetRule() ||
				   context == grammarAccess.getExternalTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_ExternalType(context, (ExternalType) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.INVARIANTS:
				if(context == grammarAccess.getInvariantsRule()) {
					sequence_Invariants(context, (Invariants) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.MESSAGE:
				if(context == grammarAccess.getMessageRule()) {
					sequence_Message(context, (Message) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.METHOD:
				if(context == grammarAccess.getMethodRule()) {
					sequence_Method(context, (Method) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.NAMESPACE:
				if(context == grammarAccess.getNamespaceRule()) {
					sequence_Namespace(context, (Namespace) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.NULL_LITERAL:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getNullLiteralRule()) {
					sequence_NullLiteral(context, (NullLiteral) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.NUMBER_LITERAL:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getNumberLiteralRule()) {
					sequence_NumberLiteral(context, (NumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.OVERRIDDEN_TYPE_META_INFO:
				if(context == grammarAccess.getOverriddenTypeMetaInfoRule()) {
					sequence_OverriddenTypeMetaInfo(context, (OverriddenTypeMetaInfo) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.STRING_LITERAL:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getStringLiteralRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.TYPE_META_INFO:
				if(context == grammarAccess.getTypeMetaInfoRule()) {
					sequence_TypeMetaInfo(context, (TypeMetaInfo) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.VALUE_OBJECT:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getAbstractVORule() ||
				   context == grammarAccess.getConstraintTargetRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getValueObjectRule()) {
					sequence_ValueObject(context, (ValueObject) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.VARIABLE:
				if(context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         doc=DOC 
	 *         name=ID 
	 *         metaInfo=TypeMetaInfo 
	 *         variables+=Variable* 
	 *         constructors+=Constructor* 
	 *         methods+=Method*
	 *     )
	 */
	protected void sequence_AggregateId(EObject context, AggregateId semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         doc=DOC 
	 *         name=ID 
	 *         idType=[AggregateId|ID] 
	 *         metaInfo=TypeMetaInfo 
	 *         variables+=Variable* 
	 *         constructors+=Constructor* 
	 *         methods+=Method*
	 *     )
	 */
	protected void sequence_Aggregate(EObject context, Aggregate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value='false' | value='true')
	 */
	protected void sequence_BooleanLiteral(EObject context, BooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constraint=[Constraint|ID] (params+=Literal params+=Literal*)?)
	 */
	protected void sequence_ConstraintCall(EObject context, ConstraintCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         doc=DOC 
	 *         name=ID 
	 *         target=[ConstraintTarget|ID] 
	 *         exception=ID? 
	 *         variables+=Variable* 
	 *         message=Message
	 *     )
	 */
	protected void sequence_Constraint(EObject context, Constraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (calls+=ConstraintCall calls+=ConstraintCall*)
	 */
	protected void sequence_Constraints(EObject context, Constraints semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (doc=DOC? name=ID variables+=Variable* constraints=Constraints? events+=Event*)
	 */
	protected void sequence_Constructor(EObject context, Constructor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     namespace=Namespace
	 */
	protected void sequence_DomainModel(EObject context, DomainModel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainDrivenDesignDslPackage.Literals.DOMAIN_MODEL__NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainDrivenDesignDslPackage.Literals.DOMAIN_MODEL__NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDomainModelAccess().getNamespaceNamespaceParserRuleCall_0(), semanticObject.getNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         doc=DOC 
	 *         name=ID 
	 *         metaInfo=TypeMetaInfo 
	 *         variables+=Variable* 
	 *         constructors+=Constructor* 
	 *         methods+=Method*
	 *     )
	 */
	protected void sequence_EntityId(EObject context, EntityId semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         doc=DOC 
	 *         name=ID 
	 *         idType=[EntityId|ID] 
	 *         metaInfo=TypeMetaInfo 
	 *         variables+=Variable* 
	 *         constructors+=Constructor* 
	 *         methods+=Method*
	 *     )
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (doc=DOC name=ID (params+=Literal params+=Literal*)?)
	 */
	protected void sequence_EnumInstance(EObject context, EnumInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         doc=DOC 
	 *         name=ID 
	 *         metaInfo=TypeMetaInfo 
	 *         variables+=Variable* 
	 *         constructors+=Constructor* 
	 *         methods+=Method* 
	 *         instances+=EnumInstance+
	 *     )
	 */
	protected void sequence_EnumObject(EObject context, EnumObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (doc=DOC? name=ID variables+=Variable*)
	 */
	protected void sequence_Event(EObject context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ExternalType(EObject context, ExternalType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainDrivenDesignDslPackage.Literals.ABSTRACT_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainDrivenDesignDslPackage.Literals.ABSTRACT_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExternalTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (importedNamespace=FQN | importedNamespace=FQNWithWildcard)
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (calls+=ConstraintCall calls+=ConstraintCall*)
	 */
	protected void sequence_Invariants(EObject context, Invariants semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (text=STRING variables+=Variable*)
	 */
	protected void sequence_Message(EObject context, Message semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         doc=DOC? 
	 *         name=ID 
	 *         refMethod=[Method|FQN]? 
	 *         variables+=Variable* 
	 *         constraints=Constraints? 
	 *         events+=Event*
	 *     )
	 */
	protected void sequence_Method(EObject context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=FQN imports+=Import* elements+=AbstractElement*)
	 */
	protected void sequence_Namespace(EObject context, Namespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value='null'
	 */
	protected void sequence_NullLiteral(EObject context, NullLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainDrivenDesignDslPackage.Literals.LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainDrivenDesignDslPackage.Literals.LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNullLiteralAccess().getValueNullKeyword_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Number
	 */
	protected void sequence_NumberLiteral(EObject context, NumberLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainDrivenDesignDslPackage.Literals.LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainDrivenDesignDslPackage.Literals.LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     metaInfo=TypeMetaInfo
	 */
	protected void sequence_OverriddenTypeMetaInfo(EObject context, OverriddenTypeMetaInfo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainDrivenDesignDslPackage.Literals.OVERRIDDEN_TYPE_META_INFO__META_INFO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainDrivenDesignDslPackage.Literals.OVERRIDDEN_TYPE_META_INFO__META_INFO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOverriddenTypeMetaInfoAccess().getMetaInfoTypeMetaInfoParserRuleCall_1_0(), semanticObject.getMetaInfo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainDrivenDesignDslPackage.Literals.LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainDrivenDesignDslPackage.Literals.LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (slabel=STRING? label=STRING? tooltipp=STRING? prompt=STRING? examples+=STRING*)
	 */
	protected void sequence_TypeMetaInfo(EObject context, TypeMetaInfo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         doc=DOC 
	 *         name=ID 
	 *         metaInfo=TypeMetaInfo 
	 *         variables+=Variable* 
	 *         constructors+=Constructor* 
	 *         methods+=Method*
	 *     )
	 */
	protected void sequence_ValueObject(EObject context, ValueObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         doc=DOC? 
	 *         nullable='nullable'? 
	 *         type=[Type|ID] 
	 *         multiplicity='*'? 
	 *         name=ID 
	 *         invariants=Invariants? 
	 *         overridden=OverriddenTypeMetaInfo?
	 *     )
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
