package org.fuin.dsl.ddd.ui.hover;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractElement;
import org.fuin.dsl.ddd.extensions.DddAbstractElementExtensions;

@SuppressWarnings("all")
public class DddDslEObjectHoverProvider extends DefaultEObjectHoverProvider {
  public String getFirstLine(final EObject o) {
    if ((o instanceof AbstractElement)) {
      return DddAbstractElementExtensions.uniqueName(((AbstractElement)o));
    }
    return super.getFirstLine(o);
  }
}
