package com.demo2.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
 * In this class lets discuss Bean life cycle
 * 	>> Just like normal Java class when you create an object of Bean
 *    1) Static Block 
 *    2) Java Initialization Block
 *    3) Constructor
 *    4) Method calls happen
 *    
 *    We also have @PostConstruct and @PreDestroy methods
 *    	1) @PostConstruct:
 *    		Method with this annotation will get executed automatically
 *    			
 *      2) @PreDestroy:
 *      	This method will get executed automatically before bean gets destroyed     	
 */

/*
 * Few more genral points
 * 	1) We can do dependency injection without @Autowired annotation through constructor injection, 
 * 		provided we had a qualifier bean of that service class available
 * 
 *  2) It is always recommended to go with setter injection
 *  
 *  3) @Qualifier annotation dominates @Primary annotation
 */

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container =  SpringApplication.run(DemoApplication.class, args);
		
		//DemoClass demo1 = container.getBean(DemoClass.class);
		
		//demo1.businessLogic();
		container.close();
		
	}

}
