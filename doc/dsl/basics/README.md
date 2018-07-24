## Context / Namespace / Type
The DDD DSL is defined in files with the extension ".ddd" (Example [basic.ddd](basic.ddd)).
Such a file can contain multiple contexts and the file's name is completely independent from content.

<table><tr><td><img src="https://cdn.rawgit.com/fuinorg/org.fuin.dsl.ddd/8642a1478454d26c95b9b2b242accbd1b59ede05/doc/dsl/basic.ddd.svg"></td></tr></table>

* **context** &#x2776;
  * DDD Term = Bounded Context
  * Names may be separated by a dot
* **namespace** &#x2777;
  * DDD Term = Module
  * Also known as „Package“
  * Names may be separated by a dot
* **type** &#x2778;
  * External Type
  * Defined somewhere outside of the DSL
