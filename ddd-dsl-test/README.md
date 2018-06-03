DDD DSL TEST
============
Example for a DDD model based on Xtext

Getting started
---------------
How to use the DDD DSL inside Eclipse and generate some code with Maven.

1. Import the project "ddd-dsl-test" using the "Existing Maven Projects" Option
2. Make sure that Xtext is activated for the project
   * Right click on the project and select "Configure / Convert to Xtext project"
   * If you only see "Unconfigure Xtext", this means Xtext is already active (Nothing to do)
3. Open some of the "*.ddd" files in "/ddd-dsl-test/src/main/domain"
4. Right click on the project and select "Run as / Maven install"
   * Java code will be generated
5. Refresh the project to see the generated code 
   * The folder "src/main/java" contains one-time generated classes
   * The folder "src-gen/main/java" contains classes that will always be generated
   * The folder "doc" contains some generated HTML documentation

The configuration for the code generator can be found here: [srcgen4j-config.xml](srcgen4j-config.xml) - It used [srcgen4j](https://github.com/fuinorg/srcgen4j-core) together with [ddd-templates](https://github.com/fuinorg/ddd-templates). Also take a look at the [pom.xml](pom.xml) where the "srcgen4j-maven-plugin" can be found.
