package com.mavenlauncher7.services;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class GreetMe {
	
	
	@Autowired
	private LocalTime time;
	
	public GreetMe(){
		System.out.println("GreetMe Bean Created");
	}
	
	public String generateGreeting() {
		// LocalTime time = LocalTime.now();
		int hour = time.getHour();
		if (hour<12) 
			return "Good Morning";
		
		else if(hour<16) 
			return "Good Afternoon";
		
		
		else if(hour<20) 
			return "Good Evening";
		
		
		else 
			return "Good Night";
		
		
	}
}
