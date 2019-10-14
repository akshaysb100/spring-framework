package com.brigedlabz.dependencyinjection.constructor.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentInfoMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/brigedlabz/applicationContext.xml");
		Student employee = (Student)context.getBean("empObj");
		employee.show();

	}

}
