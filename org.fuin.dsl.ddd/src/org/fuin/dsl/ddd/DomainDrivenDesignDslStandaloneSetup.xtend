/*
 * generated by Xtext 2.11.0.RC2
 */
package org.fuin.dsl.ddd


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DomainDrivenDesignDslStandaloneSetup extends DomainDrivenDesignDslStandaloneSetupGenerated {

	def static void doSetup() {
		new DomainDrivenDesignDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
