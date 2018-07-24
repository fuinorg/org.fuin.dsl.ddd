# Metadata
Descriptive metadata that describes a variable for purposes like displaying it to the user.

## Defining metadata

<table><tr><td><img src="https://cdn.rawgit.com/fuinorg/org.fuin.dsl.ddd/68848dc/doc/dsl/metadata/variable.ddd.svg"></td></tr></table>

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

<table><tr><td><img src="https://cdn.rawgit.com/fuinorg/org.fuin.dsl.ddd/68848dc/doc/dsl/metadata/valueobject.ddd.svg"></td></tr></table>

* A type defines metadata 
  * Has a type documentation &#x2776; that is also meta data. 
  * Defines several meta data fields °°x2777°°
* A variable of that type overwrites some of the meta data 
  * Overwrites the doc of the type &#x2778;
  * Overwrites three of the meta data fields (slabel, label, tooltip) &#x2779;
  * All other fields are inherited (prompt, examples)
  