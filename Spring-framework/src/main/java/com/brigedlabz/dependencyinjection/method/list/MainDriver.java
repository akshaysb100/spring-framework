package com.brigedlabz.dependencyinjection.method.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDriver {

	public static void main(String[] args) {
		

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/brigedlabz/applicationContext.xml");
        Student student = (Student)context.getBean("stuObj");
        student.display();
	}

}
