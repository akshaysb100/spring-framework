package com.brigedlabz.dependencyinjection.constructor.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDriver {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/brigedlabz/applicationContext.xml");
        QuestionAnswer list = (QuestionAnswer)context.getBean("ansObj");
        list.show();
	}

}
