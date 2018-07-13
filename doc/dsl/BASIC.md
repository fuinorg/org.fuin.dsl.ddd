# Basic Concepts

## Context / Namespace / Type
The DDD DSL is defined in files with the extension ".ddd" (Example [basic.ddd](basic.ddd)).
Such a file can contain multiple contexts and the file's name is completely independent from content.

<table><tr><td><img src="https://cdn.rawgit.com/fuinorg/org.fuin.dsl.ddd/master/doc/dsl/basic.ddd.svg" width="880" height="200"></td></tr></table>

* **Context**
  * DDD Term = Bounded Context
* **Namespace**
  * DDD Term = Module
  * Also known as „Package“
  * Names separated by a dot
* **Type**
  * External Type
  * Defined outside the DSL

## Imports
Types defined in another context or namespace must be imported to use them.

<table><tr><td><img src="https://cdn.rawgit.com/fuinorg/org.fuin.dsl.ddd/master/doc/dsl/import.ddd.svg"></td></tr></table>

