package com.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
	
	@Bean
	@Scope(value="singleton") //
    public MyBean myBean() {
		return new MyBean();
	}
	
}
