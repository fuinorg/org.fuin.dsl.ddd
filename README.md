DDD DSL
===========

Xtext based DSL supporting Domain-driven design (DDD)

[![Build Status](https://fuin-org.ci.cloudbees.com/job/org.fuin.dsl.ddd/badge/icon)](https://fuin-org.ci.cloudbees.com/job/org.fuin.dsl.ddd/)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.fuin.dsl.ddd/org.fuin.dsl.ddd/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.fuin.dsl.ddd/org.fuin.dsl.ddd/)
[![LGPLv3 License](http://img.shields.io/badge/license-LGPLv3-blue.svg)](https://www.gnu.org/licenses/lgpl.html)
[![Java Development Kit 1.8](https://img.shields.io/badge/JDK-1.8-green.svg)](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

<a href="https://fuin-org.ci.cloudbees.com/job/org.fuin.dsl.ddd"><img src="http://www.fuin.org/images/Button-Built-on-CB-1.png" width="213" height="72" border="0" alt="Built on CloudBees"/></a>

DSL Example
-----------
<table><tr>[<img src="doc/dsl/example.png" width="800" height="447">](https://cdn.rawgit.com/fuinorg/org.fuin.dsl.ddd/ff50a04/doc/dsl/example.ddd.svg)</td></tr></table>

DSL Documentation
-----------------
Full documentation of the DSL can be found here: ___[DSL Overview](https://github.com/fuinorg/org.fuin.dsl.ddd/blob/master/doc/dsl)___

Generating code?
----------------
See ___[The Big Picture](https://github.com/fuinorg/org.fuin.dsl.ddd/blob/master/doc/big-picture)___


Installation
------------

1. Install the Eclipse Oxygen IDE with Xtext
   * Download the [Eclipse IDE for Java and DSL Developers](https://www.eclipse.org/downloads/packages/eclipse-ide-java-and-dsl-developers/oxygen3a)
   * **-or-** Install the [Xtext Complete SDK](http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/) into your existing Eclipse Oxygen IDE 
2. Install the DDD DSL plugin
   * Press "Add" button to add the repository: https://fuinorg.jfrog.io/fuinorg/eclipse-p2
3. Install "DDD DSL"<br/>  
   ![ScreenShot](https://raw.github.com/fuinorg/org.fuin.dsl.ddd/master/doc/install-eclipse.jpg)
4. Continue with "ddd-dsl-test" [README.md](ddd-dsl-test/README.md)

-----------------------------------------------------

Snapshots
=========

Snapshots can be found on the [OSS Sonatype Snapshots Repository](http://oss.sonatype.org/content/repositories/snapshots/org/fuin "Snapshot Repository"). 

Add the following to your [.m2/settings.xml](http://maven.apache.org/ref/3.2.1/maven-settings/settings.html "Reference configuration") to enable snapshots in your Maven build:

```xml
<repository>
    <id>sonatype.oss.snapshots</id>
    <name>Sonatype OSS Snapshot Repository</name>
    <url>http://oss.sonatype.org/content/repositories/snapshots</url>
    <releases>
        <enabled>false</enabled>
    </releases>
    <snapshots>
        <enabled>true</enabled>
    </snapshots>
</repository>
```
