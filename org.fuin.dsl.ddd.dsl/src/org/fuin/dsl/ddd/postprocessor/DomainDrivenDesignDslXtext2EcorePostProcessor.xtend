package org.fuin.dsl.ddd.postprocessor

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.xtext.GeneratedMetamodel
import org.eclipse.xtext.xtext.ecoreInference.IXtext2EcorePostProcessor

class DomainDrivenDesignDslXtext2EcorePostProcessor implements IXtext2EcorePostProcessor {

	override process(GeneratedMetamodel metamodel) {
		metamodel.EPackage.process
	}

	def process(EPackage p) {
		val EClass abstractEntityClass = p.find("AbstractEntity")
		abstractEntityClass.addMethod("AbstractEntityId", "getIdType")
	}
	
	/**
	 * Adds a method to an interface.
	 * 
	 * @param pkg DSL package.
	 * @param intfClass Interface to add the method to.
	 * @param returnValueClassName Name of the return value class.
	 * @param methodName Name of the method.
	 */
	def addMethod(EClass intfClass, String returnValueClassName, String methodName) {
		val EClass returnValueClass = intfClass.EPackage.find(returnValueClassName)
		val operation = EcoreFactory.eINSTANCE.createEOperation
		operation.name = methodName
		operation.EType = returnValueClass
		intfClass.EOperations += operation
	}

	/**
	 * Locates a class with a unique name in the DSL.
	 * 
	 * @param pkg DSL package.
	 * @param name Simple name of the class to find.
	 */
	def EClass find(EPackage pkg, String name) {
		for (clazz : pkg.EClassifiers.filter(typeof(EClass))) {
			if (clazz.name.equals(name)) {
				return clazz
			}
		}	
		return null	
	}

}
