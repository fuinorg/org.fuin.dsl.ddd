# Constraints
Constraints define conditions that must be satisfied.

## Types

The DDD DSL supports currently the following types of constraints:
* **Invariants** must be kept during the life of the entity given an invariant condition.
  * Can be defined for objects (not methods)
  * The provider of the entity is responsible that the invariant is always true
  * It's considered a programming error if they are not kept
  * In languages like Java violations are modeled as runtime exceptions
* **Pre-conditions** requires that the caller of a method complies with this rule. 
  * The caller is responsible to verify the condition is met before calling the method
  * Can be defined for methods (not objects)
  * It's considered a programming error if they are not kept  
  * In languages like Java violations are modeled as runtime exceptions
  * An example is a "not null" constraint. A value passed to a method should never be null (not set). This is easy to verify before calling the method and the value does not change between testing for null and calling the method.
* **Business Rules** are like pre-conditions but the caller is not able to verify them
  * Can be defined for methods (not objects)
  * Are more business related conditions than technical ones
  * Define if breaking the constraint is at all acceptable, how this will be detected and how violations are resolved.
  * In languages like Java violations are modeled as checked exceptions other languages use dedicated return/status codes  
  * An example is an "email must be unique" constraint. A caller should check for uniqueness before calling the method, but it's nevertheless possible that another user has just entered the same email between caller's verification and verification inside the method.

(Post-conditions are currently not supported)

## Basics

<table><tr><td><img src="https://cdn.rawgit.com/fuinorg/org.fuin.dsl.ddd/67ec011/doc/dsl/constraints-simple.ddd.svg"></td></tr></table>

* Has a name that is unique in the namespace &#x2776;
* May be related to one or more type it restricts („input“) – Internal or external type &#x2777;
* Has zero or more variables used to customize the condition &#x2778;
* Can define an error message &#x2779;
* All variables from the constraint can be used as a variable '${var_name}' in the message &#x277A;  
* The validated value itself is a predefined variable („input“) that can also be used for the message &#x277B;

## Invariants
TBD

## Pre-conditions
TBD

## Business Rules
TBD
