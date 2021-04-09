/*
 * generated by Xtext 2.24.0
 */
package dk.sdu.mmmi.mdsd.serializer;

import com.google.inject.Inject;
import dk.sdu.mmmi.mdsd.dialogFlow.ActionValue;
import dk.sdu.mmmi.mdsd.dialogFlow.Actions;
import dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowPackage;
import dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowSystem;
import dk.sdu.mmmi.mdsd.dialogFlow.Entity;
import dk.sdu.mmmi.mdsd.dialogFlow.EntitySynonyms;
import dk.sdu.mmmi.mdsd.dialogFlow.EntityValue;
import dk.sdu.mmmi.mdsd.dialogFlow.Intent;
import dk.sdu.mmmi.mdsd.dialogFlow.Mapping;
import dk.sdu.mmmi.mdsd.dialogFlow.PhraseValue;
import dk.sdu.mmmi.mdsd.dialogFlow.Phrases;
import dk.sdu.mmmi.mdsd.dialogFlow.ResponseValue;
import dk.sdu.mmmi.mdsd.dialogFlow.Responses;
import dk.sdu.mmmi.mdsd.services.DialogFlowGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DialogFlowSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DialogFlowGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DialogFlowPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DialogFlowPackage.ACTION_VALUE:
				sequence_ActionValue(context, (ActionValue) semanticObject); 
				return; 
			case DialogFlowPackage.ACTIONS:
				sequence_Actions(context, (Actions) semanticObject); 
				return; 
			case DialogFlowPackage.DIALOG_FLOW_SYSTEM:
				sequence_DialogFlowSystem(context, (DialogFlowSystem) semanticObject); 
				return; 
			case DialogFlowPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case DialogFlowPackage.ENTITY_SYNONYMS:
				sequence_EntitySynonyms(context, (EntitySynonyms) semanticObject); 
				return; 
			case DialogFlowPackage.ENTITY_VALUE:
				sequence_EntityValue(context, (EntityValue) semanticObject); 
				return; 
			case DialogFlowPackage.INTENT:
				sequence_Intent(context, (Intent) semanticObject); 
				return; 
			case DialogFlowPackage.MAPPING:
				sequence_Mapping(context, (Mapping) semanticObject); 
				return; 
			case DialogFlowPackage.PHRASE_VALUE:
				sequence_PhraseValue(context, (PhraseValue) semanticObject); 
				return; 
			case DialogFlowPackage.PHRASES:
				sequence_Phrases(context, (Phrases) semanticObject); 
				return; 
			case DialogFlowPackage.RESPONSE_VALUE:
				sequence_ResponseValue(context, (ResponseValue) semanticObject); 
				return; 
			case DialogFlowPackage.RESPONSES:
				sequence_Responses(context, (Responses) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ActionValue returns ActionValue
	 *
	 * Constraint:
	 *     (name=ID type=[Entity|ID] value=STRING list=STRING?)
	 */
	protected void sequence_ActionValue(ISerializationContext context, ActionValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Actions returns Actions
	 *
	 * Constraint:
	 *     actions+=ActionValue*
	 */
	protected void sequence_Actions(ISerializationContext context, Actions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DialogFlowSystem returns DialogFlowSystem
	 *
	 * Constraint:
	 *     (name=ID declarations+=Declaration*)
	 */
	protected void sequence_DialogFlowSystem(ISerializationContext context, DialogFlowSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntitySynonyms returns EntitySynonyms
	 *
	 * Constraint:
	 *     (values+=STRING values+=STRING*)
	 */
	protected void sequence_EntitySynonyms(ISerializationContext context, EntitySynonyms semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityValue returns EntityValue
	 *
	 * Constraint:
	 *     (values+=STRING synonyms+=EntitySynonyms*)
	 */
	protected void sequence_EntityValue(ISerializationContext context, EntityValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Entity
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=ID entities+=EntityValue*)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Intent
	 *     Intent returns Intent
	 *
	 * Constraint:
	 *     (name=ID phrase=Phrases response=Responses action=Actions?)
	 */
	protected void sequence_Intent(ISerializationContext context, Intent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Mapping returns Mapping
	 *
	 * Constraint:
	 *     (value=STRING entity=[Entity|ID]?)
	 */
	protected void sequence_Mapping(ISerializationContext context, Mapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PhraseValue returns PhraseValue
	 *
	 * Constraint:
	 *     (mapping+=Mapping mapping+=Mapping*)
	 */
	protected void sequence_PhraseValue(ISerializationContext context, PhraseValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Phrases returns Phrases
	 *
	 * Constraint:
	 *     phrases+=PhraseValue*
	 */
	protected void sequence_Phrases(ISerializationContext context, Phrases semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ResponseValue returns ResponseValue
	 *
	 * Constraint:
	 *     response=STRING
	 */
	protected void sequence_ResponseValue(ISerializationContext context, ResponseValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DialogFlowPackage.Literals.RESPONSE_VALUE__RESPONSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DialogFlowPackage.Literals.RESPONSE_VALUE__RESPONSE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getResponseValueAccess().getResponseSTRINGTerminalRuleCall_1_0(), semanticObject.getResponse());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Responses returns Responses
	 *
	 * Constraint:
	 *     responses+=ResponseValue*
	 */
	protected void sequence_Responses(ISerializationContext context, Responses semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
