package com.scope.prototype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.scope.singleton.Config;
import com.scope.singleton.HelloWorld;

public class MainApp {
	

	public static void main(String[] args) {
		

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config1.class);
	      HelloWorld objA =  context.getBean(HelloWorld.class);
	     
	      objA.setMessage("object of A");
	      objA.getMessage();

	      HelloWorld objB = context.getBean(HelloWorld.class);
	      objB.setMessage("object of B");
	      objB.getMessage();

	      objA.getMessage();
	}

}
