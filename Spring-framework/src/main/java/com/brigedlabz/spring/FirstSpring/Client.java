package com.brigedlabz.spring.FirstSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		try {
			
			ApplicationContext context = new ClassPathXmlApplicationContext("/com/brigedlabz/applicationContext.xml");  
			System.out.println(context);
			BulbService service = (BulbService)context.getBean("bulb");
			System.out.println("company name : "+service.getBulb().getBulb());
			
		} catch (Exception e) {
			
		}

	}

}
