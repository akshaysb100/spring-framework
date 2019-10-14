package com.brigedlabz.autowiring.annotaion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/brigedlabz/applicationContext.xml");
		
		CarM vehicle = (CarM)context.getBean("carM");
		vehicle.drive();
		
		//or
		
//		Vehicle vehicle = (Vehicle)context.getBean("carM");
//		vehicle.drive();
		
//		Tyre tyre =(Tyre)context.getBean("tyre");
//		tyre.toString();
	}

}
