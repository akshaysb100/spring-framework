package com.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
		
		MyBean m1 = ctx.getBean(MyBean.class);
		  System.out.println(m1.hashCode());
		  
		MyBean m2 = ctx.getBean(MyBean.class);
		 System.out.println(m2.hashCode());

	}

}
