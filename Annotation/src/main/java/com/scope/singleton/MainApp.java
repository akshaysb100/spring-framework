package com.scope.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scope.MyConfig;

public class MainApp {

	public static void main(String[] args) {
		

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
	      HelloWorld objA =  context.getBean(HelloWorld.class);
	      HelloWorld objB = context.getBean(HelloWorld.class);
	      objA.setMessage("object of A");
	      objA.getMessage();

	      
	      objB.setMessage("Object of B");
	      objB.getMessage();
	      objA.getMessage();

	}

}
