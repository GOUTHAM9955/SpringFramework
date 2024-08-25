package com.mavenlauncher2.services;

import org.springframework.stereotype.Component;

@Component("service")
public class Service {
	public Service() {
		System.out.println("Service bean is created");
	}
}
