package com.brigedlabz.dependencyinjection.constructor.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapDriver {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/brigedlabz/applicationContext.xml");
		Employee employee = (Employee)context.getBean("empObj1");
        employee.show();
        
	}

}
