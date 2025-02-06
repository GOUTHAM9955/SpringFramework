package com.mavenlauncher5.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *  In this project let's try to configure using pure xml configuration and autowire the services object using xxml approch
 *  	we used autowire field 
 *  		If we set autowire as "byType" setter injection will takes place
 *  			Ex: <bean id="amz" class="com.mavenlauncher5.main.Amazon" autowire="byType"></bean>
 *  		If we set autowire as "constructor" setter injection will takes place
 *  			Ex: <bean id="amz" class="com.mavenlauncher5.main.Amazon" autowire="byType"></bean>
 *  
 *  		To remove the ambiguity for spring to choose among the services, we can make one as primary
 *  			ex: <bean id="bd" class="com.mavenlauncher5.main.BlueDart" primary="true"/>
 *  		
 *  		If we want any dependent object to not participate in depndency injection we can set field autowire-candidate="false";
 *  
 *  		If we go by autowire as "byName" we have to specify the particular bean of dependent object which we want to inject as the reference
 *  			name specified in target class
 *  			ex:
 *  					<bean id="service" class="com.mavenlauncher5.services.FedEx"/>
						<bean id="amz" class="com.mavenlauncher5.main.Amazon" autowire="byName"></bean>
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
