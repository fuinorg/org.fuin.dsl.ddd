# Basic Concepts

## Context / Namespace / Type
The DDD DSL is defined in files with the extension ".ddd" (Example [basic.ddd](basic.ddd)).
Such a file can contain multiple contexts and the file's name is completely independent from content.

<table><tr><td><img src="https://cdn.rawgit.com/fuinorg/org.fuin.dsl.ddd/f413369c3f27a1ae0851802b30bedafe44cddae8/doc/dsl/basic.ddd.svg"></td></tr></table>

&#x2776; **context**
* DDD Term = Bounded Context
* Names may be separated by a dot

&#x2777; **namespace**
* DDD Term = Module
* Also known as „Package“
* Names may be separated by a dot

&#x2778; **type**
* External Type
* Defined somewhere outside of the DSL

## Imports
Types defined in another context or namespace must be imported to use them.

<table><tr><td><img src="https://cdn.rawgit.com/fuinorg/org.fuin.dsl.ddd/f413369c3f27a1ae0851802b30bedafe44cddae8/doc/dsl/import.ddd.svg"></td></tr></table>

&#x2776; Importing a single type from the same context, just using the namespace

&#x2777; Importing a single type from another context, using the context and namespace

&#x2778; Using a fully qualified type from another context without listing it in an import statement

&#x2779; Importing all types from a namespace using the asterisk (*) wildcard character.
