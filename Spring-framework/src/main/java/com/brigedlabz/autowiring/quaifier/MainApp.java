package com.brigedlabz.autowiring.quaifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/brigedlabz/applicationContext.xml");
        Profile profile = (Profile)context.getBean("profile");
        profile.printName();   
        profile.printAge(); 
        
	}

}
