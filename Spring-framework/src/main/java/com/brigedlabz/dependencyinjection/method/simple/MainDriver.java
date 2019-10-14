package com.brigedlabz.dependencyinjection.method.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDriver {

	public static void main(String[] args) {
		

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/brigedlabz/applicationContext.xml");
		Employee employee = (Employee)context.getBean("getEmpObj");
		employee.show();
        
	}

}
