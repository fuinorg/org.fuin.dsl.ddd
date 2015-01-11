package org.fuin.dsl.ddd.ui.documentation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractElement;
import org.fuin.dsl.ddd.extensions.DddStringExtensions;

@SuppressWarnings("all")
public class DddDslEObjectDocumentationProvider implements IEObjectDocumentationProvider {
  public String getDocumentation(final EObject o) {
    if ((o instanceof AbstractElement)) {
      String _doc = ((AbstractElement)o).getDoc();
      return DddStringExtensions.text(_doc);
    }
    return null;
  }
}
