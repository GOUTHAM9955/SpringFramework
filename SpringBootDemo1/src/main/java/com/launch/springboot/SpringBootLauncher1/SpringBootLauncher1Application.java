package com.launch.springboot.SpringBootLauncher1;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*
 * In this project we are going to get an overview of SpringBoot
 *   As of today latest springboot version is 3 which uses spring framework version 6 that requires min of java 17 version
 *   
 *   If page name which we specify while creating  the spring boot application will eb considered as the base package, any package outhside that 
 *     wont be considered
 * 
 * To create a spring project in community version we have to got to spring intializer(start.spring.io), add required dependency and click on generate
 *    (Explore the explore button)
 * 
 * 
 * 		Spring Boot tries to solve the pain point in java which is, Java is verbose
 * 
 *  Concept of scope:
 *  	When we use getBean(ClassName) multiple times, we will be refering to the same object which is called singleton scope.
 *  		By default spring goes with singleton scope
 *  	
 *  	If we want different object for every getBean call of that class we can define the scope with annotation
 *  		@Scope("prototype")    // Default is @Scope("singletone")
 *  		If we had not changed the scope the name will be set as "GK" unless we override it in any new objects created
 *  
 *  	One more important thing to remember is when you specify the scope as prototype the object will be created when we request for it
 *  
 *  	HOWEVER THE BEST PRACTISE SAYS WHEN WE HAVE TO CREATE MULTIPLE OBJECTS BETTER TO CREATE IT ON OUR OWN INSTEAD OF SPECIFING THE SCOPE AS PROTOTYPE
 * 
 */

// this snnotation => @ComponentScan + @EnableAutoConfiguration 
@SpringBootApplication  
public class SpringBootLauncher1Application {

	public static void main(String[] args) {
		
		// To get hold of Spring Container
		ApplicationContext context = SpringApplication.run(SpringBootLauncher1Application.class, args);
		
		Welcome wel = context.getBean(Welcome.class);
		wel.setName("GK");
		wel.printMessage();
		
		Welcome wel1 = context.getBean(Welcome.class);
		wel1.printMessage();
		
	}

}
