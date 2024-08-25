package com.mavenlauncher2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration("config")
public class Config {

	public Config() {
		System.out.println("Bean of config is created");
	}
	
	@Bean("pass")
	public Password createPassword() {
		Password pass = new Password("SHA");
		return pass;
	}

}
 