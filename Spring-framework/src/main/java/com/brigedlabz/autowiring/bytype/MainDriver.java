package com.brigedlabz.autowiring.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDriver {

	public static void main(String[] args) {
		

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/brigedlabz/applicationContext.xml");
		BMW bmw = context.getBean("bm",BMW.class);
		bmw.display();

	}

}
