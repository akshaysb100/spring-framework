package com.brigedlabz.autowiring.usingallannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/brigedlabz/applicationContext.xml");
        Human human = context.getBean("human",Human.class);
    //   Human hum1 = context.getBean("h1",Human.class);
        human.startPumping();
	}

}
