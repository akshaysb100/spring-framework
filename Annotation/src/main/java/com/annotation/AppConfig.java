package com.annotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.annotation")
public class AppConfig {
	
// 	@Bean
//	 public Samsung getPhone() {
//	 return new Samsung();
//	 }
//	
//    @Bean
//	public MobileProcessor getPro() {
//		return new MediaTek();
//	}
    
}
