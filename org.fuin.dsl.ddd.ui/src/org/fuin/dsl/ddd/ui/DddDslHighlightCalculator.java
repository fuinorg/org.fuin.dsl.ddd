package org.fuin.dsl.ddd.ui;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constructor;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumInstance;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Event;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Method;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.util.DomainDrivenDesignDslSwitch;

public class DddDslHighlightCalculator implements
		ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {

		if (resource == null) {
			return;
		}

		HighlightingSwitch switcher = new HighlightingSwitch(acceptor);

		Iterator<EObject> iter = EcoreUtil.getAllContents(resource, true);
		while (iter.hasNext()) {
			EObject current = iter.next();
			switcher.doSwitch(current);
		}

	}

	private class HighlightingSwitch extends DomainDrivenDesignDslSwitch<Void> {

		private final IHighlightedPositionAcceptor acceptor;

		public HighlightingSwitch(IHighlightedPositionAcceptor acceptor) {
			this.acceptor = acceptor;
		}

		@Override
		public Void caseConstraint(Constraint constraint) {
			return highlightFirst(constraint,
					DomainDrivenDesignDslPackage.eINSTANCE.getConstraint_Doc(),
					DddDslHighlightConfig.COMMENT_ID);
		}

		@Override
		public Void caseAbstractVO(AbstractVO abstractVO) {
			return highlightFirst(abstractVO,
					DomainDrivenDesignDslPackage.eINSTANCE.getAbstractVO_Doc(),
					DddDslHighlightConfig.COMMENT_ID);
		}

		@Override
		public Void caseEnumInstance(EnumInstance enumInstance) {
			return highlightFirst(enumInstance,
					DomainDrivenDesignDslPackage.eINSTANCE.getEnumInstance_Name(),
					DddDslHighlightConfig.ENUM_INSTANCE_ID);
		}
		
		@Override
		public Void caseAbstractEntity(AbstractEntity entity) {
			return highlightFirst(entity,
					DomainDrivenDesignDslPackage.eINSTANCE.getAbstractEntity_Doc(),
					DddDslHighlightConfig.COMMENT_ID);
		}
		
		@Override
		public Void caseVariable(Variable variable) {
			return highlightFirst(variable,
					DomainDrivenDesignDslPackage.eINSTANCE.getVariable_Doc(),
					DddDslHighlightConfig.COMMENT_ID);
		}

		@Override
		public Void caseConstructor(Constructor constr) {
			return highlightFirst(constr,
					DomainDrivenDesignDslPackage.eINSTANCE.getConstructor_Doc(),
					DddDslHighlightConfig.COMMENT_ID);
		}
		
		@Override
		public Void caseMethod(Method method) {
			return highlightFirst(method,
					DomainDrivenDesignDslPackage.eINSTANCE.getMethod_Doc(),
					DddDslHighlightConfig.COMMENT_ID);
		}
		
		@Override
		public Void caseEvent(Event event) {
			return highlightFirst(event,
					DomainDrivenDesignDslPackage.eINSTANCE.getEvent_Doc(),
					DddDslHighlightConfig.COMMENT_ID);
		}
		
		private Void highlightFirst(EObject eObj, EAttribute eAttr, String id) {
			INode node = getFirstFeatureNode(eObj, eAttr);
			if (node != null) {
				highlightNode(node, id);
			}
			return null;
		}

		private void highlightNode(INode node, String id) {
			if (node == null) {
				return;
			}
			if (node instanceof ILeafNode) {
				acceptor.addPosition(node.getOffset(), node.getLength(), id);
			} else {
				for (ILeafNode leaf : node.getLeafNodes()) {
					if (!leaf.isHidden()) {
						acceptor.addPosition(leaf.getOffset(),
								leaf.getLength(), id);
					}
				}
			}
		}
	}

	public INode getFirstFeatureNode(EObject semantic,
			EStructuralFeature feature) {
		if (feature == null) {
			return NodeModelUtils.findActualNodeFor(semantic);
		}
		List<INode> nodes = NodeModelUtils.findNodesForFeature(semantic,
				feature);
		if (!nodes.isEmpty()) {
			return nodes.get(0);
		}
		return null;
	}
	
}
