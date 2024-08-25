package com.mavenlauncher7.main;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.mavenlauncher7"})
public class JavaConfig {
	
	public JavaConfig() {
		System.out.println("Java Config bean created");
	}
	
	@Bean
	public LocalTime createTime() {
		return LocalTime.now();
	}
}
