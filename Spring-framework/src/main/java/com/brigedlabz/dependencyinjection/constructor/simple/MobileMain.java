package com.brigedlabz.dependencyinjection.constructor.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/brigedlabz/applicationContext.xml");
		Mobile mobile = (Mobile)context.getBean("mobailojb");
	    
		mobile.show();

	}

}
