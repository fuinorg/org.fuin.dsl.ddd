# Imports
Types defined in another context or namespace must be imported to use them.

<table><tr><td><img src="https://cdn.rawgit.com/fuinorg/org.fuin.dsl.ddd/8642a1478454d26c95b9b2b242accbd1b59ede05/doc/dsl/imports/import.ddd.svg"></td></tr></table>

* Importing a single type from the same context, just using the namespace &#x2776;
* Importing a single type from another context, using the context and namespace &#x2777;
* Using a fully qualified type from another context without listing it in an import statement &#x2778;
* Importing all types from a namespace using the asterisk (*) wildcard character &#x2779;

**Caution:** In general it's not a good idea to use types from another context. Contexts are meant to separate domains models and therefore should not share types. There are some exceptions when it comes to very basic types. An example of this are the types provided by the [ddd-dsl-basics](https://github.com/fuinorg/ddd-dsl-basics) project.