package org.fuin.dsl.ddd.ui.hover;

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractElement

import static extension org.fuin.dsl.ddd.extensions.DddAbstractElementExtensions.*

class DddDslEObjectHoverProvider extends DefaultEObjectHoverProvider {
    
    def override String getFirstLine(EObject o) {
        if (o instanceof AbstractElement) {
            return o.uniqueName
        }
        return super.getFirstLine(o)
    }

}
