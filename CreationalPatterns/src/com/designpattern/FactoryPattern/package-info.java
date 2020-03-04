/**
 * 
 */
/**
 * @author Shruti
 *
 */
package com.designpattern.FactoryPattern;
/*
 *Creational Design Patterns
Creational design patterns provide solution to instantiate a object in the best possible way for specific situations.

Singleton Pattern
Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the Java virtual machine. It seems to be a very simple design pattern but when it comes to implementation, it comes with a lot of implementation concerns. The implementation of the Singleton pattern has always been a controversial topic among developers. Check out Singleton Design Pattern to learn about different ways to implement Singleton pattern and pros and cons of each of the method. This is one of the most discussed java design patterns.


Factory Pattern
Factory design pattern is used when we have a super class with multiple sub-classes and based on input, we need to return one of the sub-class. This pattern take out the responsibility of instantiation of a class from client program to the factory class. We can apply Singleton pattern on Factory class or make the factory method static. Check out Factory Design Pattern for example program and factory pattern benefits. This is one of the most widely used java design pattern.


Abstract Factory Pattern
Abstract Factory pattern is similar to Factory pattern and it�s a factory of factories. If you are familiar with the factory design pattern in java, you will notice that we have a single Factory class that returns the different sub-classes based on the input provided and factory class uses if-else or switch statement to achieve this.

In Abstract Factory pattern, we get rid of if-else block and have a factory class for each sub-class and then an Abstract Factory class that will return the sub-class based on the input factory class. Check out Abstract Factory Pattern to know how to implement this pattern with example program.


Builder Pattern
This pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns when the Object contains a lot of attributes. Builder pattern solves the issue with large number of optional parameters and inconsistent state by providing a way to build the object step-by-step and provide a method that will actually return the final Object. Check out Builder Pattern for example program and classes used in JDK.


Prototype Pattern
Prototype pattern is used when the Object creation is a costly affair and requires a lot of time and resources and you have a similar object already existing. So this pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs. This pattern uses java cloning to copy the object.

Prototype design pattern mandates that the Object which you are copying should provide the copying feature. It should not be done by any other class. However whether to use the shallow or deep copy of the Object properties depends on the requirements and it�s a design decision. Check out Prototype Pattern for sample program.
 */