DDD DSL
===========

Xtext based DSL supporting Domain-driven design (DDD)

Examples
--------
Context, Namespace, External Types<br/>
![Context, Namespace, External Types](https://raw.github.com/fuinorg/org.fuin.dsl.ddd/master/doc/context-namespace-example.jpg)

Value Object<br/>
![Value Object](https://raw.github.com/fuinorg/org.fuin.dsl.ddd/master/doc/value-object-example.jpg)

Aggregate<br/>
![Aggregate](https://raw.github.com/fuinorg/org.fuin.dsl.ddd/master/doc/aggregate-example.jpg)

Presentation
------------
http://de.slideshare.net/michael-schnell/ddd-dsl/

Installation
------------

1. Make sure you have Xtext installed in Eclipse Kepler or Luna (Example: [Eclipse IDE for Java and DSL Developers](https://www.eclipse.org/downloads/packages/eclipse-ide-java-and-dsl-developers/lunasr1 "Eclipse Luna with Xtext") )
2. Inside Eclipse click menu "Help / Install New Software..."
3. Press "Add" button to add the repository: http://www.fuin.org/p2-repository
4. Install "DDD DSL"<br/>  
![ScreenShot](https://raw.github.com/fuinorg/org.fuin.dsl.ddd/master/doc/install-eclipse.jpg)


###Build

[![Build Status](https://fuin-org.ci.cloudbees.com/job/org.fuin.dsl.ddd/badge/icon)](https://fuin-org.ci.cloudbees.com/job/org.fuin.dsl.ddd/)

<a href="https://fuin-org.ci.cloudbees.com/job/org.fuin.dsl.ddd"><img src="http://www.fuin.org/images/Button-Built-on-CB-1.png" width="213" height="72" border="0" alt="Built on CloudBees"/></a>

###Snapshots

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
