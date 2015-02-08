package org.fuin.dsl.ddd.validation

import java.util.List
import javax.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.diagnostics.Severity
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.validation.Issue
import org.fuin.dsl.ddd.DomainDrivenDesignDslInjectorProvider
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainModel
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

import static extension org.fuin.dsl.ddd.base.Utils.*
import static extension org.fuin.dsl.ddd.extensions.DddEObjectExtensions.*

@InjectWith(typeof(DomainDrivenDesignDslInjectorProvider))
@RunWith(typeof(XtextRunner))
class DomainDrivenDesignDslValidatorTest {

	@Inject
	private ParseHelper<DomainModel> parser

	@Inject
	private ValidationTestHelper validationTester

	@Test
	def void testValidation() {

		val List<Issue> issues = validationTester.validate(model)

		// checkNameStartsWithCapital
		assertIssue(model, issues, Severity.WARNING, "VariableA", "Variable names should start with a lower case")

		// checkVariablesInConstraintMessage
		assertIssue(model, issues, Severity.ERROR, "ConstraintA", "A variable with the name 'a' is unknown")

		// checkVariablesInExceptionMessage
		assertIssue(model, issues, Severity.ERROR, "ExceptionA", "A variable 'exa' is not defined in the exception")

		// checkAggregateIdIdentifies
		assertIssue(model, issues, Severity.ERROR, "AggregateBId",
			"An ID defined in an aggregate can only identify the parent aggregate")
		assertIssue(model, issues, Severity.ERROR, "AggregateXId",
			"An ID defined outside an aggregate must use the 'identifies' expression")

		// checkEntityIdIdentifies
		assertIssue(model, issues, Severity.ERROR, "EntityBId",
			"An ID defined in an entity can only identify the parent entity")
		assertIssue(model, issues, Severity.ERROR, "EntityXId",
			"An ID defined outside an entity must use the 'identifies' expression")

		// checkEntityRoot
		assertIssue(model, issues, Severity.ERROR, "EntityD",
			"An entity defined outside an aggregate must use the 'root' expression")
		assertIssue(model, issues, Severity.ERROR, "EntityE",
			"An entity defined in an aggregate can only reference the parent aggregate")

		// checkEntityHasId
		assertIssue(model, issues, Severity.ERROR, "EntityC",
			"Entity does not define an ID")
		assertIssue(model, issues, Severity.ERROR, "EntityE",
			"Entity cannot not reference an ID using 'identifier' and define another inside the aggregate")

		// checkAggregateHasId
		assertIssue(model, issues, Severity.ERROR, "AggregateE",
			"Aggregate does not define an ID")
		assertIssue(model, issues, Severity.ERROR, "AggregateF",
			"Aggregate cannot not reference an ID using 'identifier' and define another inside the aggregate")
			
		// checkOnlyOneAggregateId
		assertIssue(model, issues, Severity.ERROR, "AggregateG",
			"Only one 'aggregate-id' can be defined inside an aggregate")
			
		// checkAllowedAggregateElements
		assertIssue(model, issues, Severity.ERROR, "EntityIdG3",
			"Allowed elements in an aggregate are: 'aggregate-id', 'entity', 'event' and 'value-object'")
			
		// checkOnlyOneEntityId
		assertIssue(model, issues, Severity.ERROR, "EntityG",
			"Only one 'entity-id' can be defined inside an entity")
			
		// checkAllowedEntityElements
		assertIssue(model, issues, Severity.ERROR, "AggregateIdG3",
			"Allowed elements in an entity are: 'entity-id', 'event' and 'value-object'")
		
		// checkGenericArgs		
		assertIssue(model, issues, Severity.ERROR, "testValueObjectAList1",
			"The number of arguments does not match the number required by the type: 1")
		assertIssue(model, issues, Severity.ERROR, "testValueObjectAList2",
			"The number of arguments does not match the number required by the type: 1")
		

	}

	private def DomainModel model() {
		val List<String> lines = class.getResource("/DomainDrivenDesignDslValidatorTest.ddd").asLines
		return parser.parse(lines.asString)
	}

	private def void assertIssue(DomainModel model, List<Issue> issues, Severity severity, String objName,
		String message) {
		for (issue : issues) {
			val EObject issueObj = model.eResource().getResourceSet().getEObject(issue.getUriToProblem(), true);
			if (severity.equals(severity) && objName.equals(issueObj.name) && message.equals(issue.message)) {
				return
			}
		}
		fail(
			"[" + objName + "] No issue with severity '" + severity + "' and '" + message + "' found:\n" +
				issues.asString)
	}

	private static def asString(List<Issue> issues) {
		val StringBuilder sb = new StringBuilder()
		for (issue : issues) {
			sb.append(issue.toString)
			sb.append("\n")
		}
		return sb
	}

}
