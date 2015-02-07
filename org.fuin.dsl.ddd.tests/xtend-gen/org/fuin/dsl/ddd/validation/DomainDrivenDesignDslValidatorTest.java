package org.fuin.dsl.ddd.validation;

import java.net.URL;
import java.util.List;
import javax.inject.Inject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.fuin.dsl.ddd.DomainDrivenDesignDslInjectorProvider;
import org.fuin.dsl.ddd.base.Utils;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainModel;
import org.fuin.dsl.ddd.extensions.DddEObjectExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(DomainDrivenDesignDslInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class DomainDrivenDesignDslValidatorTest {
  @Inject
  private ParseHelper<DomainModel> parser;
  
  @Inject
  private ValidationTestHelper validationTester;
  
  @Test
  public void testValidation() {
    DomainModel _model = this.model();
    final List<Issue> issues = this.validationTester.validate(_model);
    DomainModel _model_1 = this.model();
    this.assertIssue(_model_1, issues, Severity.WARNING, "VariableA", "Variable names should start with a lower case");
    DomainModel _model_2 = this.model();
    this.assertIssue(_model_2, issues, Severity.ERROR, "ConstraintA", "A variable with the name \'a\' is unknown");
    DomainModel _model_3 = this.model();
    this.assertIssue(_model_3, issues, Severity.ERROR, "ExceptionA", "A variable \'exa\' is not defined in the exception");
    DomainModel _model_4 = this.model();
    this.assertIssue(_model_4, issues, Severity.ERROR, "AggregateBId", 
      "An ID defined in an aggregate can only identify the parent aggregate");
    DomainModel _model_5 = this.model();
    this.assertIssue(_model_5, issues, Severity.ERROR, "AggregateXId", 
      "An ID defined outside an aggregate must use the \'identifies\' expression");
    DomainModel _model_6 = this.model();
    this.assertIssue(_model_6, issues, Severity.ERROR, "EntityBId", 
      "An ID defined in an entity can only identify the parent entity");
    DomainModel _model_7 = this.model();
    this.assertIssue(_model_7, issues, Severity.ERROR, "EntityXId", 
      "An ID defined outside an entity must use the \'identifies\' expression");
    DomainModel _model_8 = this.model();
    this.assertIssue(_model_8, issues, Severity.ERROR, "EntityD", 
      "An entity defined outside an aggregate must use the \'root\' expression");
    DomainModel _model_9 = this.model();
    this.assertIssue(_model_9, issues, Severity.ERROR, "EntityE", 
      "An entity defined in an aggregate can only reference the parent aggregate");
    DomainModel _model_10 = this.model();
    this.assertIssue(_model_10, issues, Severity.ERROR, "EntityC", 
      "Entity does not define an ID");
    DomainModel _model_11 = this.model();
    this.assertIssue(_model_11, issues, Severity.ERROR, "EntityE", 
      "Entity cannot not reference an ID using \'identifier\' and define another inside the aggregate");
    DomainModel _model_12 = this.model();
    this.assertIssue(_model_12, issues, Severity.ERROR, "AggregateE", 
      "Aggregate does not define an ID");
    DomainModel _model_13 = this.model();
    this.assertIssue(_model_13, issues, Severity.ERROR, "AggregateF", 
      "Aggregate cannot not reference an ID using \'identifier\' and define another inside the aggregate");
  }
  
  private DomainModel model() {
    try {
      Class<? extends DomainDrivenDesignDslValidatorTest> _class = this.getClass();
      URL _resource = _class.getResource("/DomainDrivenDesignDslValidatorTest.ddd");
      final List<String> lines = Utils.asLines(_resource);
      String _asString = Utils.asString(lines);
      return this.parser.parse(_asString);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertIssue(final DomainModel model, final List<Issue> issues, final Severity severity, final String objName, final String message) {
    for (final Issue issue : issues) {
      {
        Resource _eResource = model.eResource();
        ResourceSet _resourceSet = _eResource.getResourceSet();
        URI _uriToProblem = issue.getUriToProblem();
        final EObject issueObj = _resourceSet.getEObject(_uriToProblem, true);
        boolean _and = false;
        boolean _and_1 = false;
        boolean _equals = severity.equals(severity);
        if (!_equals) {
          _and_1 = false;
        } else {
          String _name = DddEObjectExtensions.getName(issueObj);
          boolean _equals_1 = objName.equals(_name);
          _and_1 = _equals_1;
        }
        if (!_and_1) {
          _and = false;
        } else {
          String _message = issue.getMessage();
          boolean _equals_2 = message.equals(_message);
          _and = _equals_2;
        }
        if (_and) {
          return;
        }
      }
    }
    StringBuilder _asString = DomainDrivenDesignDslValidatorTest.asString(issues);
    String _plus = ((((((("[" + objName) + "] No issue with severity \'") + severity) + "\' and \'") + message) + "\' found:\n") + _asString);
    Assert.fail(_plus);
  }
  
  private static StringBuilder asString(final List<Issue> issues) {
    final StringBuilder sb = new StringBuilder();
    for (final Issue issue : issues) {
      {
        String _string = issue.toString();
        sb.append(_string);
        sb.append("\n");
      }
    }
    return sb;
  }
}
