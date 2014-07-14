package com.leo_sa.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.leo_sa.reqLang.Model;
import com.leo_sa.reqLang.Modifier;
import com.leo_sa.reqLang.Prefix;
import com.leo_sa.reqLang.ReqLangPackage;
import com.leo_sa.services.ReqLangGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class ReqLangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ReqLangGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ReqLangPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ReqLangPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ReqLangPackage.MODIFIER:
				if(context == grammarAccess.getModifierRule()) {
					sequence_Modifier(context, (Modifier) semanticObject); 
					return; 
				}
				else break;
			case ReqLangPackage.PREFIX:
				if(context == grammarAccess.getClassRule()) {
					sequence_Class_Prefix(context, (Prefix) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFunctionRule()) {
					sequence_Function_Prefix(context, (Prefix) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getModuleRule()) {
					sequence_Module_Prefix(context, (Prefix) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPrefixRule()) {
					sequence_Prefix(context, (Prefix) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPropertyRule()) {
					sequence_Prefix_Property(context, (Prefix) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         action=Action 
	 *         modifiers=Modifier 
	 *         name=ID 
	 *         returnType=[Class|ID]? 
	 *         properties+=Property* 
	 *         functions+=Function*
	 *     )
	 */
	protected void sequence_Class_Prefix(EObject context, Prefix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         action=Action 
	 *         modifiers=Modifier 
	 *         name=ID 
	 *         args+=ID* 
	 *         returnType=[Class|ID]? 
	 *         description+=DESC*
	 *     )
	 */
	protected void sequence_Function_Prefix(EObject context, Prefix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     modules+=Module*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (private?='p'? abstract?='@'? static?='$'?)
	 */
	protected void sequence_Modifier(EObject context, Modifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (action=Action modifiers=Modifier name=ID (functions+=Function | classes+=Class)*)
	 */
	protected void sequence_Module_Prefix(EObject context, Prefix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (action=Action modifiers=Modifier name=ID)
	 */
	protected void sequence_Prefix(EObject context, Prefix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (action=Action modifiers=Modifier name=ID returnType=[Class|ID])
	 */
	protected void sequence_Prefix_Property(EObject context, Prefix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
