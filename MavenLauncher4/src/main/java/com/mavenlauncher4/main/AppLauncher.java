package com.mavenlauncher4.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
/*
 * In this class we are going to discuss more on XML configuration where we have to pass paremeters to constructor while creating a bean 
 * 
 * 1) Invoking parameterised constructor and passing values while creating bean
 * 		While creating employee bean we are passing values to the parameterised constructor using 
 * 			<constructor-arg value = "1"/> tag 
 * 
 * 2) If we want to pass values using index instead of order
 * 		We created a bean emp2 and passed values based on index and re-arraged the order in the tag
 * 			Since we have multiple beans we have to use bean name to intiate the specific bean using id
 * 
 * 3) Using name instead of index in creating beans by invoking parametarised constructors
 * 		We created a bean emp3 using names of the fields to invoke parametarised constructor
 * 			*This is not working for me as we have name as a parameter [name = "name" is causing conflict]*
 * 
 * 4) If for example there a department class and we have to pass that value to Employee class and we don't have the object yet we can do it with 
 * 		by creating a bean of depart and passing it as reference to employee class 
 * 
 * 4) We are going to implement lazy loading using BeanFactory
 * 		1) Using DefaultListableBeanFactory we create the container of BeanFactory
 * 		2) We parse XML bean definitions and registering them with a BeanFactory container using XmlBeanDefinitionReader
 * 		3) We load xml using loadBeanDefinitions method of XmlBeanDefinitionReader
 * 		The XmlBeanDefinitionReader is associated with the DefaultListableBeanFactory by being given a reference to it during instantiation.
	•	This association allows the XmlBeanDefinitionReader to register bean definitions it reads directly into the DefaultListableBeanFactory.
	•	The DefaultListableBeanFactory then stores and manages these bean definitions, allowing beans to be instantiated and managed when needed.
			This design allows Spring to maintain a clear separation between the process of reading and parsing bean definitions 
			(done by XmlBeanDefinitionReader) and the process of managing and creating bean instances (handled by DefaultListableBeanFactory).
			
		SO, BEANFACTORY ALLOWS MULTIPLE CONFIG FILES IN SINGLE CONTAINER
 * 
 * SPRINGBOOT uses eager loading
 * 
 * 
 */

import com.mavenlauncher4.beans.Employee;

class EagerLoading {
	void tryMe() {
		ApplicationContext container = new ClassPathXmlApplicationContext("appConfig.xml");
		/*
		 * Employee emp1 = container.getBean(Employee.class);
		 * 
		 * String task1 = emp1.taskOfEmployee(); System.out.println(task1);
		 */

		/*
		 * Employee emp2 = container.getBean("emp2",Employee.class);
		 * System.out.println(emp2); String task2 = emp2.taskOfEmployee();
		 * System.out.println(task2);
		 */

		Employee emp3 = container.getBean("emp3", Employee.class);
		System.out.println(emp3);
	}
}

class LazyLoading {
	void tryMe() {
		DefaultListableBeanFactory container = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader read = new XmlBeanDefinitionReader(container);
		read.loadBeanDefinitions("appConfig.xml");
		
		Employee emp3 = container.getBean("emp3", Employee.class);
		System.out.println(emp3);
	}
}

public class AppLauncher {

	public static void main(String[] args) {
		//EagerLoading el = new EagerLoading();
		//el.tryMe();
		
		LazyLoading lz = new LazyLoading();
		lz.tryMe();
		
		
	}

}
