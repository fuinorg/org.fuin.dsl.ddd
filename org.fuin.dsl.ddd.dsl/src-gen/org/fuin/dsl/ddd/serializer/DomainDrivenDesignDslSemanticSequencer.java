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
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Attribute;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.BooleanLiteral;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.BusinessRules;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Consistency;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintInstance;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constructor;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Context;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainModel;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Duration;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EntityId;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumInstance;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumObject;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Event;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Import;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Invariants;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Method;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Namespace;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.NullLiteral;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.NumberLiteral;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.OverriddenTypeMetaInfo;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Parameter;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Preconditions;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ReturnType;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Service;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.StringLiteral;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ValueObject;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.WeakConsistency;
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
				   context == grammarAccess.getInternalTypeRule() ||
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
				   context == grammarAccess.getInternalTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_AggregateId(context, (AggregateId) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
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
			case DomainDrivenDesignDslPackage.BUSINESS_RULES:
				if(context == grammarAccess.getBusinessRulesRule()) {
					sequence_BusinessRules(context, (BusinessRules) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.CONSISTENCY:
				if(context == grammarAccess.getConsistencyRule()) {
					sequence_Consistency(context, (Consistency) semanticObject); 
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
			case DomainDrivenDesignDslPackage.CONSTRAINT_INSTANCE:
				if(context == grammarAccess.getConstraintInstanceRule()) {
					sequence_ConstraintInstance(context, (ConstraintInstance) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.CONSTRUCTOR:
				if(context == grammarAccess.getAbstractMethodRule() ||
				   context == grammarAccess.getConstructorRule()) {
					sequence_Constructor(context, (Constructor) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.CONTEXT:
				if(context == grammarAccess.getContextRule()) {
					sequence_Context(context, (Context) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.DOMAIN_MODEL:
				if(context == grammarAccess.getDomainModelRule()) {
					sequence_DomainModel(context, (DomainModel) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.DURATION:
				if(context == grammarAccess.getDurationRule()) {
					sequence_Duration(context, (Duration) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.ENTITY:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getAbstractEntityRule() ||
				   context == grammarAccess.getEntityRule() ||
				   context == grammarAccess.getInternalTypeRule() ||
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
				   context == grammarAccess.getInternalTypeRule() ||
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
				   context == grammarAccess.getEnumObjectRule() ||
				   context == grammarAccess.getInternalTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_EnumObject(context, (EnumObject) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.EVENT:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getEventRule()) {
					sequence_Event(context, (Event) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.EXCEPTION:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getExceptionRule()) {
					sequence_Exception(context, (org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.EXTERNAL_TYPE:
				if(context == grammarAccess.getAbstractElementRule() ||
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
			case DomainDrivenDesignDslPackage.METHOD:
				if(context == grammarAccess.getAbstractMethodRule() ||
				   context == grammarAccess.getMethodRule()) {
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
			case DomainDrivenDesignDslPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.PRECONDITIONS:
				if(context == grammarAccess.getPreconditionsRule()) {
					sequence_Preconditions(context, (Preconditions) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.RETURN_TYPE:
				if(context == grammarAccess.getReturnTypeRule()) {
					sequence_ReturnType(context, (ReturnType) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.SERVICE:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getServiceRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Service(context, (Service) semanticObject); 
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
				   context == grammarAccess.getInternalTypeRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getValueObjectRule()) {
					sequence_ValueObject(context, (ValueObject) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY:
				if(context == grammarAccess.getWeakConsistencyRule()) {
					sequence_WeakConsistency(context, (WeakConsistency) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         doc=DOC? 
	 *         name=ID 
	 *         aggregate=[Aggregate|FQN]? 
	 *         base=[ExternalType|FQN]? 
	 *         invariants=Invariants? 
	 *         metaInfo=TypeMetaInfo 
	 *         attributes+=Attribute* 
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
	 *         doc=DOC? 
	 *         name=ID 
	 *         idType=[AggregateId|FQN]? 
	 *         invariants=Invariants? 
	 *         metaInfo=TypeMetaInfo 
	 *         attributes+=Attribute* 
	 *         constructors+=Constructor* 
	 *         methods+=Method* 
	 *         events+=Event* 
	 *         aggregateId=AggregateId?
	 *     )
	 */
	protected void sequence_Aggregate(EObject context, Aggregate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         doc=DOC? 
	 *         nullable='nullable'? 
	 *         type=[Type|FQN] 
	 *         multiplicity='*'? 
	 *         name=ID 
	 *         invariants=Invariants? 
	 *         overridden=OverriddenTypeMetaInfo?
	 *     )
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
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
	 *     (constraintInstances+=ConstraintInstance constraintInstances+=ConstraintInstance*)
	 */
	protected void sequence_BusinessRules(EObject context, BusinessRules semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (doc=DOC level=ConsistencyLevel weakConsistency=WeakConsistency?)
	 */
	protected void sequence_Consistency(EObject context, Consistency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constraint=[Constraint|FQN] (params+=Literal params+=Literal*)?)
	 */
	protected void sequence_ConstraintInstance(EObject context, ConstraintInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         doc=DOC? 
	 *         name=ID 
	 *         input=[Type|FQN]? 
	 *         exception=[Exception|FQN]? 
	 *         attributes+=Attribute* 
	 *         consistency=Consistency? 
	 *         message=STRING?
	 *     )
	 */
	protected void sequence_Constraint(EObject context, Constraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         doc=DOC? 
	 *         name=ID 
	 *         preconditions=Preconditions? 
	 *         businessRules=BusinessRules? 
	 *         (firedEvents+=[Event|FQN] firedEvents+=[Event|FQN]*)? 
	 *         parameters+=Parameter* 
	 *         service=[Service|FQN]? 
	 *         services+=Service* 
	 *         events+=Event*
	 *     )
	 */
	protected void sequence_Constructor(EObject context, Constructor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID namespaces+=Namespace*)
	 */
	protected void sequence_Context(EObject context, Context semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     contexts+=Context*
	 */
	protected void sequence_DomainModel(EObject context, DomainModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (time=INT unit=TimeUnit)
	 */
	protected void sequence_Duration(EObject context, Duration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainDrivenDesignDslPackage.Literals.DURATION__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainDrivenDesignDslPackage.Literals.DURATION__TIME));
			if(transientValues.isValueTransient(semanticObject, DomainDrivenDesignDslPackage.Literals.DURATION__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainDrivenDesignDslPackage.Literals.DURATION__UNIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDurationAccess().getTimeINTTerminalRuleCall_0_0(), semanticObject.getTime());
		feeder.accept(grammarAccess.getDurationAccess().getUnitTimeUnitEnumRuleCall_1_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         doc=DOC? 
	 *         name=ID 
	 *         entity=[Entity|FQN]? 
	 *         base=[ExternalType|FQN]? 
	 *         invariants=Invariants? 
	 *         metaInfo=TypeMetaInfo 
	 *         attributes+=Attribute* 
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
	 *         doc=DOC? 
	 *         name=ID 
	 *         idType=[EntityId|FQN]? 
	 *         root=[Aggregate|FQN] 
	 *         invariants=Invariants? 
	 *         metaInfo=TypeMetaInfo 
	 *         attributes+=Attribute* 
	 *         constructors+=Constructor* 
	 *         methods+=Method* 
	 *         events+=Event* 
	 *         entityId=EntityId?
	 *     )
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (doc=DOC? deprecated='deprecated'? name=ID (params+=Literal params+=Literal*)?)
	 */
	protected void sequence_EnumInstance(EObject context, EnumInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         doc=DOC? 
	 *         name=ID 
	 *         base=[ExternalType|FQN]? 
	 *         invariants=Invariants? 
	 *         metaInfo=TypeMetaInfo 
	 *         attributes+=Attribute* 
	 *         instances+=EnumInstance+
	 *     )
	 */
	protected void sequence_EnumObject(EObject context, EnumObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (doc=DOC? name=ID attributes+=Attribute* message=STRING?)
	 */
	protected void sequence_Event(EObject context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (doc=DOC? name=ID cid=INT? attributes+=Attribute* message=STRING)
	 */
	protected void sequence_Exception(EObject context, org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (doc=DOC? element='element'? name=ID)
	 */
	protected void sequence_ExternalType(EObject context, ExternalType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (constraintInstances+=ConstraintInstance constraintInstances+=ConstraintInstance*)
	 */
	protected void sequence_Invariants(EObject context, Invariants semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         doc=DOC? 
	 *         name=ID 
	 *         refMethod=[Method|FQN]? 
	 *         preconditions=Preconditions? 
	 *         businessRules=BusinessRules? 
	 *         (firedEvents+=[Event|FQN] firedEvents+=[Event|FQN]*)? 
	 *         parameters+=Parameter* 
	 *         service=[Service|FQN]? 
	 *         returnType=ReturnType? 
	 *         services+=Service* 
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
	 *     (
	 *         doc=DOC? 
	 *         nullable='nullable'? 
	 *         type=[Type|FQN] 
	 *         multiplicity='*'? 
	 *         name=ID 
	 *         preconditions=Preconditions? 
	 *         businessRules=BusinessRules? 
	 *         overridden=OverriddenTypeMetaInfo?
	 *     )
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constraintInstances+=ConstraintInstance constraintInstances+=ConstraintInstance*)
	 */
	protected void sequence_Preconditions(EObject context, Preconditions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (doc=DOC? type=[Type|FQN])
	 */
	protected void sequence_ReturnType(EObject context, ReturnType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (doc=DOC? name=ID methods+=Method*)
	 */
	protected void sequence_Service(EObject context, Service semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (slabel=STRING? label=STRING? tooltip=STRING? prompt=STRING? examples+=Literal*)
	 */
	protected void sequence_TypeMetaInfo(EObject context, TypeMetaInfo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         doc=DOC? 
	 *         name=ID 
	 *         base=[ExternalType|FQN]? 
	 *         invariants=Invariants? 
	 *         metaInfo=TypeMetaInfo 
	 *         attributes+=Attribute* 
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
	 *         acceptableDoc=DOC? 
	 *         acceptable=Duration 
	 *         detectionDoc=DOC? 
	 *         detection=InconsistencyDetection 
	 *         resolutionDoc=DOC? 
	 *         resolution=InconsistencyResolution
	 *     )
	 */
	protected void sequence_WeakConsistency(EObject context, WeakConsistency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
