package com.launch.springboot.SpringBootLauncher1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") 
public class Welcome {
	
	private String name;

	public Welcome() {
	System.out.println("Welcome costructor invoked");
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void printMessage() {
		System.out.println("Welocme to Spring Boot " +name);
	}
	

}
