package org.fuin.dsl.ddd;

import org.eclipse.xtext.XtextRuntimeModule;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.generator.Generator;
import org.eclipse.xtext.xtext.ecoreInference.IXtext2EcorePostProcessor;
import org.fuin.dsl.ddd.postprocessor.DomainDrivenDesignDslXtext2EcorePostProcessor;

import com.google.inject.Guice;
import com.google.inject.Injector;

@SuppressWarnings("restriction")
public class ExtendedGenerator extends Generator {

	public ExtendedGenerator() {
		new XtextStandaloneSetup() {
			@Override
			public Injector createInjector() {
				return Guice.createInjector(new XtextRuntimeModule() {
					@Override
					public Class<? extends IXtext2EcorePostProcessor> bindIXtext2EcorePostProcessor() {
						return DomainDrivenDesignDslXtext2EcorePostProcessor.class;
					}
				});
			}
		}.createInjectorAndDoEMFRegistration();
	}

}
