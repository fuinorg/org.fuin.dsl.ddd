package org.fuin.dsl.ddd.ui.highlighting;

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
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractElement;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Consistency;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Duration;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumInstance;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ReturnType;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Service;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.WeakConsistency;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.util.DomainDrivenDesignDslSwitch;

public class DddDslHighlightCalculator implements
        ISemanticHighlightingCalculator {

    @Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {

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
        public Void caseAbstractElement(AbstractElement ae) {
            return highlightFirst(ae,
                    DomainDrivenDesignDslPackage.eINSTANCE.getAbstractElement_Doc(),
                    DddDslHighlightConfig.COMMENT_ID);
        }

        @Override
        public Void caseConsistency(Consistency consistency) {
            
            highlightFirst(consistency,
                    DomainDrivenDesignDslPackage.eINSTANCE.getConsistency_Doc(),
                    DddDslHighlightConfig.COMMENT_ID);
            highlightFirst(consistency,
                    DomainDrivenDesignDslPackage.eINSTANCE.getConsistency_Level(),
                    DddDslHighlightConfig.ENUM_INSTANCE_ID);
            
            return null;
        }
        
        @Override
        public Void caseDuration(Duration duration) {
            return highlightFirst(duration,
                    DomainDrivenDesignDslPackage.eINSTANCE.getDuration_Unit(),
                    DddDslHighlightConfig.ENUM_INSTANCE_ID);
        }
        
        @Override
        public Void caseWeakConsistency(WeakConsistency weakConsistency) {

            highlightFirst(weakConsistency,
                    DomainDrivenDesignDslPackage.eINSTANCE.getWeakConsistency_AcceptableDoc(),
                    DddDslHighlightConfig.COMMENT_ID);
            
            highlightFirst(weakConsistency,
                    DomainDrivenDesignDslPackage.eINSTANCE.getWeakConsistency_DetectionDoc(),
                    DddDslHighlightConfig.COMMENT_ID);
            highlightFirst(weakConsistency,
                    DomainDrivenDesignDslPackage.eINSTANCE.getWeakConsistency_Detection(),
                    DddDslHighlightConfig.ENUM_INSTANCE_ID);
            
            highlightFirst(weakConsistency,
                    DomainDrivenDesignDslPackage.eINSTANCE.getWeakConsistency_ResolutionDoc(),
                    DddDslHighlightConfig.COMMENT_ID);
            highlightFirst(weakConsistency,
                    DomainDrivenDesignDslPackage.eINSTANCE.getWeakConsistency_Resolution(),
                    DddDslHighlightConfig.ENUM_INSTANCE_ID);
            
            return null;
        }
        
        @Override
        public Void caseConstraint(Constraint constraint) {
            return highlightFirst(constraint,
                    DomainDrivenDesignDslPackage.eINSTANCE.getAbstractElement_Doc(),
                    DddDslHighlightConfig.COMMENT_ID);
        }
        
        @Override
        public Void caseEnumInstance(EnumInstance enumInstance) {
            
            highlightFirst(enumInstance,
                    DomainDrivenDesignDslPackage.eINSTANCE.getEnumInstance_Doc(),
                    DddDslHighlightConfig.COMMENT_ID);
            
            return highlightFirst(enumInstance,
                    DomainDrivenDesignDslPackage.eINSTANCE
                            .getEnumInstance_Name(),
                    DddDslHighlightConfig.ENUM_INSTANCE_ID);
        }

        @Override
        public Void caseVariable(Variable variable) {
            return highlightFirst(variable,
                    DomainDrivenDesignDslPackage.eINSTANCE.getVariable_Doc(),
                    DddDslHighlightConfig.COMMENT_ID);
        }

        @Override
        public Void caseAbstractMethod(AbstractMethod constr) {
            return highlightFirst(constr,
                    DomainDrivenDesignDslPackage.eINSTANCE
                            .getAbstractMethod_Doc(),
                    DddDslHighlightConfig.COMMENT_ID);
        }

        @Override
        public Void caseReturnType(ReturnType returnType) {
            return highlightFirst(returnType,
                    DomainDrivenDesignDslPackage.eINSTANCE.getReturnType_Doc(),
                    DddDslHighlightConfig.COMMENT_ID);
        }

        @Override
        public Void caseService(Service service) {
            return highlightFirst(service,
                    DomainDrivenDesignDslPackage.eINSTANCE.getReturnType_Doc(),
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
