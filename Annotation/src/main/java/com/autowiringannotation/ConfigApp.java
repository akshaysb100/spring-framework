package com.autowiringannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.autowiringannotation")
@PropertySource("classpath:/com/autowiringannotation/collegeInfo.properties") //if you access the out side file than only type collegeInfo.properties in classpath 
public class ConfigApp {
    
	@Bean
	public Principal principalBean() {
		return new Principal();
	}
	
	@Bean
	public College collegeBean() {
		return new College();
	}
	
	
}
