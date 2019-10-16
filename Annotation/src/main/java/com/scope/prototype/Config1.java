package com.scope.prototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.scope.MyBean;
import com.scope.singleton.HelloWorld;

@Configuration
public class Config1 {

	@Bean
	@Scope(value="prototype")
	public HelloWorld getHellow() {
		return new HelloWorld();
	}
}
