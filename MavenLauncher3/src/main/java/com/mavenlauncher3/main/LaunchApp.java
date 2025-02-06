package com.mavenlauncher3.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*
 * In this class we are going to use @Autowired approch for IOC containers using annotation
 * 
 * We used @Autowired on the dependent object reference type in target class in this case for injecting DeliveryService Object in Amazon class we 
 * use Autowired annotation on DeliveryService reference variable
 * 	  @Autowired is by default of type: "bytype" which does setter injection
 * 	  In all 3 eligible dependent objects we are asking IOC conatainer to chosse fedEx bean using @Qualifier annotation beneth @Autowired annotation 
 * 		on DeliveryService variable in amazon class or add @Primary to FedEex class(FexEx class bean id will be by default fedEx{camel case}) 
 * 	
 *  If you are applying annotation to constructor we have pass @Qualifier as a parameter(@Qualifier annotation's scope doesn't allow it) (Check amazon class)
 *  	or we have specify @Primary annotation to the class of dependency object 
 *  
 *  If you specify one dependent object as primary and other in Qualifier, Qualifier will get higher priority
 *   
 *     
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
