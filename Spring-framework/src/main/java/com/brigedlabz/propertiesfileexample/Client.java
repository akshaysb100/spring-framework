package com.brigedlabz.propertiesfileexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/brigedlabz/applicationContext.xml");
		Student student = (Student)context.getBean("stuInfo");
		student.showData();

	}

}
