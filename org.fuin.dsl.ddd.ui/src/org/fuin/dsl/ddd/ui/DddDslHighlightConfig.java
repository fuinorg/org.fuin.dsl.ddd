package org.fuin.dsl.ddd.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class DddDslHighlightConfig extends
		DefaultHighlightingConfiguration implements IHighlightingConfiguration {

	public static final String ENUM_INSTANCE_ID = "enumInstance";
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(ENUM_INSTANCE_ID, "Enum Instance",
				enumInstanceTextStyle());
	}

	public TextStyle enumInstanceTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 0, 204));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
	
	
}
