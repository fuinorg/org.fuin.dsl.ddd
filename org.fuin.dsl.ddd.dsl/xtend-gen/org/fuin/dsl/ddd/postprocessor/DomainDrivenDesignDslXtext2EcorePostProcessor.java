package org.fuin.dsl.ddd.postprocessor;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.xtext.GeneratedMetamodel;
import org.eclipse.xtext.xtext.ecoreInference.IXtext2EcorePostProcessor;

@SuppressWarnings("all")
public class DomainDrivenDesignDslXtext2EcorePostProcessor implements IXtext2EcorePostProcessor {
  public void process(final GeneratedMetamodel metamodel) {
    EPackage _ePackage = metamodel.getEPackage();
    this.process(_ePackage);
  }
  
  public boolean process(final EPackage p) {
    boolean _xblockexpression = false;
    {
      final EClass abstractEntityClass = this.find(p, "AbstractEntity");
      _xblockexpression = this.addMethod(abstractEntityClass, "AbstractEntityId", "getIdType");
    }
    return _xblockexpression;
  }
  
  /**
   * Adds a method to an interface.
   * 
   * @param pkg DSL package.
   * @param intfClass Interface to add the method to.
   * @param returnValueClassName Name of the return value class.
   * @param methodName Name of the method.
   */
  public boolean addMethod(final EClass intfClass, final String returnValueClassName, final String methodName) {
    boolean _xblockexpression = false;
    {
      EPackage _ePackage = intfClass.getEPackage();
      final EClass returnValueClass = this.find(_ePackage, returnValueClassName);
      final EOperation operation = EcoreFactory.eINSTANCE.createEOperation();
      operation.setName(methodName);
      operation.setEType(returnValueClass);
      EList<EOperation> _eOperations = intfClass.getEOperations();
      _xblockexpression = _eOperations.add(operation);
    }
    return _xblockexpression;
  }
  
  /**
   * Locates a class with a unique name in the DSL.
   * 
   * @param pkg DSL package.
   * @param name Simple name of the class to find.
   */
  public EClass find(final EPackage pkg, final String name) {
    EList<EClassifier> _eClassifiers = pkg.getEClassifiers();
    Iterable<EClass> _filter = Iterables.<EClass>filter(_eClassifiers, EClass.class);
    for (final EClass clazz : _filter) {
      String _name = clazz.getName();
      boolean _equals = _name.equals(name);
      if (_equals) {
        return clazz;
      }
    }
    return null;
  }
}
