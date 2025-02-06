package com.mavenlauncher6.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/*
 * POJO class: No business logic or frameworks apart from JDK environment. The Employee and Department classes defined here is POJO
 * 
 * In this project we are exploring one more way to invoke parametarised constructor while creating BEAN and in doing so we have delcared
 * 		two namespaces one for using property syntax in xml configuration and one incase of passing arguments to constructor
 * 			:: Check syntax and how we are injecting department object that we creted into Employee	and also how we created a shortcut for constructor 
 * 			   and setter injection
 * 				This didn't work for me well.... check with hyder
 */
import com.mavenlauncher6.beans.Employee;


public class AppLauncher {

	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("appConfig.xml");
		System.out.println(container.getBean(Employee.class));
	}

}
