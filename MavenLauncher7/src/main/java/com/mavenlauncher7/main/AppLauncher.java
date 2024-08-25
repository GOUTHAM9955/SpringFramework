package com.mavenlauncher7.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.mavenlauncher7.services.GreetMe;

/*
 * In this project we are going to implement without using spring boot or XML (No application configutration XML file) using pure JAVA confugaration
 * 
 * 	  Inseat of creating an instance of Localtime we created a Bean of it in config class and injected it into GreetMe using @Autowired annotation
 *     	We use @ComponetScan(basePackages={"packageName"}),The @ComponentScan annotation in Spring is used to specify the base packages to scan for 
 *     		Spring-managed components. These components can include classes annotated with @Component, @Service, @Repository, @Controller, 
 *     		and other stereotype annotations.
 * 		
 */

public class AppLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container = new AnnotationConfigApplicationContext(JavaConfig.class);
		GreetMe greet = container.getBean(GreetMe.class);
		System.out.println(greet.generateGreeting());
	}

}
