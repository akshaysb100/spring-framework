package com.brigedlabz.autowiring.annotaion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/brigedlabz/applicationContext.xml");
		
//		CarM vehicle = (CarM)context.getBean("carM");   // create instance of Bike position of CarM  
//		vehicle.drive();
		
		//or
		
		Vehicle vehicle = (Vehicle)context.getBean("carM"); //only changes in carM to bike 
		vehicle.drive();
		
//		Tyre tyre =(Tyre)context.getBean("tyre");
//		tyre.toString();
	}

}
