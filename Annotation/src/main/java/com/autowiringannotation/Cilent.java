package com.autowiringannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cilent {

	public static void main(String[] args) {
		

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
		College college = context.getBean("collegeA",College.class);
		System.out.println("college  object create by spring");
		college.test();
		context.close();

	}

}
