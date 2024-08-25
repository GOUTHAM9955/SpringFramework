package com.mavenlauncher3.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * In this class we are going to use Bean Factory approch for IOC containers
 * 
 * We used @Autowired for injecting DeliveryService Object in Amazon class
 * 	  In all 3 eligible dependent objects we are asking IOC conatainer to chosse fedEx bean using @Qualifier annotation
 * 	
 *  if you are passing annotation to constructor we have specify @Qualifier to local variable (Check amazon class)
 *  	or we have specify @Primary annotation to the class of dependency object
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
