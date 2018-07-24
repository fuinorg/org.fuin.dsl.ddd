# Metadata
Descriptive metadata that describes a variable for purposes like displaying it to the user.

## Defining metadata
Metadata can be defined for variables or types.

<table><tr><td><img src="https://cdn.rawgit.com/fuinorg/org.fuin.dsl.ddd/d8c8aa3/doc/dsl/metadata/variable.ddd.svg"></td></tr></table>

* **slabel** &#x2776;
  * Short label used when space in the UI is limited
  * Example: Table headers
* **label** &#x2777;
  * Label for the UI
* **tooltip** &#x2778;
  * Tooltip for the UI
* **prompt** &#x2779;
  * Prompt text for input fields
  * Example: "Enter search keywords…"
* **examples** &#x277A;
  * Values that may be used in mockups, tests
  * Separated by a space

## Overwriting metadata
Variables inherit the metadata from their type by default. They can be overwritten at the place where type type is used.

### Type that has metadata
The following value object defines some metadata.

<table><tr><td><img src="https://cdn.rawgit.com/fuinorg/org.fuin.dsl.ddd/d8c8aa3/doc/dsl/metadata/valueobject.ddd.svg"></td></tr></table>

* Documentation is also meta data &#x2776; 
* Definition of meta data fields &#x2777;

### Variable that overwrites the metadata
A variable of that type can overwrite all or some of the meta data

<table><tr><td><img src="https://cdn.rawgit.com/fuinorg/org.fuin.dsl.ddd/d8c8aa3/doc/dsl/metadata/event.ddd.svg"></td></tr></table>

* Overwrites the documentation of the type &#x2776;
* Overwrites three of the meta data fields (slabel, label, tooltip) &#x2777;
* All other metadata fields are inherited (prompt, examples)
