package com.mavenlauncher1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Spring Boot: 
>> Spring framework is an end to end development framework
>> Every aspect of spring is a module
>> Spring Core is the basis of SpringFramework
>> Spring Boot is a way of developing Spring application
>> Spring has modules to support all different layers in web application
		ex: Web layer: Spring MVC
			: Service Layer
			: Persistence Layer (DAO) Sprint Data JPA

Spring core has 3 types of approaches
	1) XML approach
	2) XML + Annotation approach
	3) Annotation + JAVA Configuration
	4) Spring boot approach (Only annotations)


	Spring is used to achieve: 
		1) De-Coupling
		2) Loose coupling (Opposite is tight coupling or composition)
		3) Dependency Injection
		4) Inversion of control

Loose Coupling:
	This can be achieved by code to Interface
	Class in which we use the services of other class is called the target class
	The objects which are used in the target class are called dependent objects
		example: we have a delivery services app where we deliver amazon product's through different services
				For loose coupling we create an interface for all the delivery services
				Write code for delivery services implementing that interface
				We will have amazon class where we create object of interface and a setter method to set the object type
				In launch app we call amazon method and setter with type of service we want to call
					Here target class is amazon and services classes are dependent objects


	Injecting dependent object into target class is called dependency injection if we are doing it through a setter it's called setter injection if we are using constructor
		it's called constructor injection
	It's better to have consuctor injection when the dependent object will be ready at the time of target object creation.


In the above example we are not creating object in Amazon class and giving the object creation control of dependent object's in other class this is called inversion of control

==> Target class : Class where services of other classes are used 
==> Dependent object: Object of a class whose services are used in target class
==> Injecting Dependent Object into target class is referred as Dependency Injection

Spring Framework has IOC containers which performs dependency Injections based on configuration
If Spring creates the object of a class for us we call it as Spring Bean
	To manage these Bean classes we have two famous IOC containers 
		1) Bean Factory
		2) Application Context


MAVEN vs GRADLE: We use both Maven and Gradle as build tools but Maven is only compatable with JAVA projects where as we can develop C, Groovy, GoLang etc.. projects with gradle	

 */

// IOC of Dependent objects(all 3 services) to target class(Amazon) we are doing by Spring
/*
 * Go to resources >> Create XML file>> We have to add meta tag to enable component scanning in a specific package, 
 * 		so Spring can automatically detect and register beans.
	•		and few tags Enables Spring MVC’s annotation-based controllers, we need to add few more to configure DB or
			enable auto configuration.
		
		To we want spring to create and manage bean we use following tag
			Syntax: <bean id="referenceVariable" class="packageName.className" />
				Default id will be class name in camel case
		
		We create beans for dependent object using the above syntax
		
		We create bean for target class and that includes 
			If it is constructor injection in target class we use constructor-arg	
			If it is setter injection we use property tag 
				In that we specified what object we are injecting
					Syntax:      <property ref="dhl" name ="service"></property>
 */


public class LaunchApp {

	public static void main(String[] args) {
		
		// Activating spring using application context IOC interface
		ApplicationContext container = new ClassPathXmlApplicationContext("appConfig.xml");
		
		Amazon amz = container.getBean(Amazon.class);
		Boolean status =amz.initiateDelivery(1002.23);
		if(status) {
			System.out.println("Product delivered");
		}
		else
			System.out.println("Delivery failed");
	}

}
