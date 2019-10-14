package com.brigedlabz.configurationwithoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung samsung = context.getBean(Samsung.class);
		samsung.config();
		
//		Samsung samsung = new Samsung();
//		samsung.config();

	} 

}
