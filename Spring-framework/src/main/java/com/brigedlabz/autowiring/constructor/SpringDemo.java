package com.brigedlabz.autowiring.constructor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
		

	        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("/com/brigedlabz/applicationContext.xml");
	        PaymentGateway paymentGateway = (PaymentGateway) context.getBean("paymentGateway");
	        System.out.println(paymentGateway.toString());

	}

}
