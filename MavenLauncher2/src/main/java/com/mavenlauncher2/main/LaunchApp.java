package com.mavenlauncher2.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mavenlauncher2.config.Password;
/*
 * In this project we are going to use use XML+Annotation approach
 * 		In this approach we will do minimal config in XML stating we are going to use annotations
 * 
 * 		An annotation is a special form of metadata that provides data about a program, 
 * 			which can be used to give instructions to the compiler or runtime
 * 	
 * 		Stereotype annotations are annotations which we apply on a class
 * 			The base of stereotype annotation is @Component
 * 			There are annotations which are @Component having additional features
 * 				ex: @Controller , @Repository, @RestController, @Service, @Configuration
 * 			We have other annotations such as
 * 				Ex: @Autowired for Dependency Injection
 * 					@Qualified or @Primary for resolving ambiguity
 * 					@Bean when we create an instance of class and we want spring to manage its life cycle
 * 					
 * 		If we want spring to create a Bean of a class we use @Component stereotype annotation
 * 		There are 3 layers in designing an application
 * 			1) Web layer: 
 * 				Which takes the request from Internet and responses back
 * 						 we define those class with @Contoller or RestContoller
 * 			2) Service Layer:
 * 				If it has business logic we annotate it as @Service
 * 				If it is a simple class we define it as @Component
 * 				If we are doing some configuration we define as @Configuration
 * 				
 * 			3) Persistence or DAO layer:
 * 				If the class interacts with data base we define it as @Repository
 * 
 * 		To let spring know we are using annotation add below tag to xml file
 * 			<context:annotation-config/>
 * 		We have to specify base package in context:component-scan to make sure only classes in those packages to be considered
 * 			ex: <context:component-scan base-package="com.mavenlauncher2"></context:component-scan>
 * 
 * 		In this project we inmplemented @Bean in Config class to create password instance of our own Algorithm which
 * 			will be later handled by spring 
 * 
 * 		For predefined classes which we cannot modify we use @Bean annotation to acheive dependency injection for those
 * 			objects.
 * 
 * 		Even though we didn't ask, beans are getting created upfront this is called eager loading which happens in
 * 		application context IOC containers
 * 		For spring to create beans only if we ask for it which is lazy loading, we have to use bean factory
 */

public class LaunchApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
		
		// To get the object of a bean
		//method1 using class name
		//Password pass = context.getBean(Password.class);
		
		// method2 using bean name
		//Password pass = (Password) context.getBean("pass");
		
		// method3 with both bean name and class name
		Password pass = context.getBean("pass", Password.class);
		pass.passwordGenrator();
	}

}
