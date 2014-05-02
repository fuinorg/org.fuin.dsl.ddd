/*
* generated by Xtext
*/
package org.fuin.dsl.ddd.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import org.fuin.dsl.ddd.validation.DomainDrivenDesignDslValidator

/**
 * Custom quickfixes.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#quickfixes
 */
class DomainDrivenDesignDslQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(DomainDrivenDesignDslValidator::INVALID_VAR_NAME)
	def makeVarNameLowerCase(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'First character to lower case', null, null) [
			context |
			val xtextDocument = context.xtextDocument
			val firstLetter = xtextDocument.get(issue.offset, 1)
			xtextDocument.replace(issue.offset, 1, firstLetter.toLowerCase)
		]
	}
	
	@Fix(DomainDrivenDesignDslValidator::REF_TO_AGGREGATE_NOT_ALLOWED)
	def changeAggregateToId(Issue issue, IssueResolutionAcceptor acceptor) {
		
		val String idType = issue.data.get(0);
		
		acceptor.accept(issue, 'Change to aggregate ID', null, null) [
			context |
			val xtextDocument = context.xtextDocument
			xtextDocument.replace(issue.offset, issue.length, idType)
		]
				
	}	

	@Fix(DomainDrivenDesignDslValidator::REF_TO_ENTITY_NOT_ALLOWED)
	def changeEntityToId(Issue issue, IssueResolutionAcceptor acceptor) {
		
		val String idType = issue.data.get(0);
		
		acceptor.accept(issue, 'Change to entity ID', null, null) [
			context |
			val xtextDocument = context.xtextDocument
			xtextDocument.replace(issue.offset, issue.length, idType)
		]
				
	}
		
	@Fix(DomainDrivenDesignDslValidator::VO_CANNOT_REF_ENTITY)
	def changeAbstractEntityToId(Issue issue, IssueResolutionAcceptor acceptor) {
		
		val String idType = issue.data.get(0);
		
		acceptor.accept(issue, 'Change to entity ID', null, null) [
			context |
			val xtextDocument = context.xtextDocument
			xtextDocument.replace(issue.offset, issue.length, idType)
		]
				
	}	

		@Fix(DomainDrivenDesignDslValidator::EXCEPTION_DUPLICATE_CID)
	def changeExceptionUidToHighest(Issue issue, IssueResolutionAcceptor acceptor) {
		
		val String nextId = issue.data.get(0);
		
		acceptor.accept(issue, 'Change to next free exception CID', null, null) [
			context |
			val xtextDocument = context.xtextDocument
			xtextDocument.replace(issue.offset, issue.length, nextId)
		]
				
	}	
	
}
