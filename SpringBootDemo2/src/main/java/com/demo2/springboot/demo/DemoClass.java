package com.demo2.springboot.demo;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class DemoClass {
	
	//Static block
	static 
	{
		System.out.println("Static Block");
	}

	//Java Initialisation Block
	{
		
		System.out.println("Java initialisation block");
	}
	
	DemoClass(){
		System.out.println("Constructed got invoked");
	}
	
	@PostConstruct
	public void init(){
	  System.out.println("Init method");	
	}
	
	public void businessLogic(){
		  System.out.println("Business logic");	
		}
	
	@PreDestroy
	public void destroy(){
		  System.out.println("Bean Destroyed");	
		}
	
}
