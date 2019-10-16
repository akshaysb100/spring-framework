package com.brigedlabz.autowiring.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDriver {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/brigedlabz/applicationContext.xml");
        
		BMW bmw = context.getBean("bmw", BMW.class);
		bmw.display();
		
	}
    
}
