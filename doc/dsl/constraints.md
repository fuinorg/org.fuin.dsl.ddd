# Constraints
Constraints define conditions that must be satisfied.

## Basics

<table><tr><td><img src="https://cdn.rawgit.com/fuinorg/org.fuin.dsl.ddd/67ec011/doc/dsl/constraints-simple.ddd.svg"></td></tr></table>

* Has a name that is unique in the namespace &#x2776;
* May be related to one or more type it restricts („input“) – Internal or external type &#x2777;
* Has zero or more variables used to customize the condition &#x2778;
* Can define an error message &#x2779;
* All variables from the constraint can be used as a variable '${var_name}' in the message &#x277A;  
* The validated value itself is a predefined variable („input“) that can also be used for the message &#x277B;

## Invariants
Invariants must be kept during the life of the entity given an invariant condition.

* Can be defined for objects (not methods)
* The provider of the entity is responsible that the invariant is always true
* It's considered a programming error if they are not kept
* In languages like Java violations are modeled as runtime exceptions

<table><tr><td><img src="https://cdn.rawgit.com/fuinorg/org.fuin.dsl.ddd/1772046/doc/dsl/constraints-invariants.ddd.svg"></td></tr></table>

* Variables are by default never null except there is a **nullable** identifier &#x2776;
* An invariant can be defined that restricts values that are allowed for the variable &#x2777;
* There can be one or more constraints separated by a comma. All variables required by the constraint must be provided as parameters &#x2778;

## Pre-conditions
Pre-conditions requires that the caller of a method complies with this rule. 

* The caller is responsible to verify the condition is met before calling the method
* Can be defined for methods (not objects)
* It's considered a programming error if they are not kept  
* In languages like Java violations are modeled as runtime exceptions
* An example is a "not null" constraint. A value passed to a method should never be null (not set). This is easy to verify before calling the method and the value does not change between testing for null and calling the method.  

<table><tr><td><img src="https://cdn.rawgit.com/fuinorg/org.fuin.dsl.ddd/607f5f6/doc/dsl/constraints-preconditions.ddd.svg"></td></tr></table>

* Can be defined on method level to allow constraints using multiple parameters &#x2776;
  * Both parameters are nullable &#x2777;
  * But at least one of it must be non-null &#x2776;
* Can be defined on parameter level &#xx2778; 

## Post-conditions
Post-conditions are currently not supported.

## Business Rules
Business Rules are like pre-conditions but the caller is not able to verify them
* Can be defined for methods (not objects)
* Are more business related conditions than technical ones
* Define if breaking the constraint is at all acceptable, how this will be detected and how violations are resolved.
* In languages like Java violations are modeled as checked exceptions other languages use dedicated return/status codes  
* An example is an "email must be unique" constraint. A caller should check for uniqueness before calling the method, but it's nevertheless possible that another user has just entered the same email between caller's verification and verification inside the method. 

<table><tr><td><img src="https://cdn.rawgit.com/fuinorg/org.fuin.dsl.ddd/0dc2316/doc/dsl/constraints-business-rules.ddd.svg"></td></tr></table>

* Can be defined on method level &#x2776;

<table><tr><td><img src="https://cdn.rawgit.com/fuinorg/org.fuin.dsl.ddd/1c50323/doc/dsl/constraints-business-rule.ddd.svg"></td></tr></table>

A constraint that is used as a business rule must 
* define an exception for cases where the constraint is violated &#x2776;
* provide a consistency definition  &#x2777;

The consistency is either **strong** or **weak** &#x2777;: 'Strong' means it should never be violated. 'Weak' means that inconsistencies are allowed for some time. In this case some more information must be provided in the definition.
* **acceptable** Defines how long the inconsistency is acceptable from a business point of view &#x2779;
  * X **millis** or **seconds** or **minutes** or **hours** or **days**
* **detection** Determines how inconsistencies are detected &#x277A;
  * **never** No special handling required (They are simply accepted). 
  * **manually** Someone should verify the data from time to time in a manual process.
  * **automatic** Some automated process is necessary to verify the constraints.
* **resolution** Determines how an inconsistency will be resolved &#x277B;
  * **never** There will be no action taken (inconsistency stays is is). 
  * **manually** Someone should manually fix the data.
  * **automatic** Some automated process is necessary that cleans up the data. 
  * **workflow** Some workflow should be started to clean the data.
