package org.fuin.dsl.ddd.ui.documentation;

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractElement

import static extension org.fuin.dsl.ddd.extensions.DddStringExtensions.*

class DddDslEObjectDocumentationProvider implements IEObjectDocumentationProvider {

    def override String getDocumentation(EObject o) {
        if (o instanceof AbstractElement) {
            return o.doc.text
		}
        return null
    }

}
