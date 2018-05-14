# Spring Boot Application

This application demonstrates how to use Project Lombok with Spring framework:

* We need to add Lombok plugin into the IDE, otherwise IDE will get upset, when it doesn't find the getter() and 
  setter(), and the methods are called somewhere in the code.
* We need to be careful, that Equals and Hashcode methods don't include the fields which have many-to-many or one-to-one
  relationship, else they can result in error and infinite loop while calculating hashcode or equals.