package com.brigedlabz.dependencyinjection.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeMain {

	public static void main(String[] args) {
		
//		Resource resource = new ClassPathResource("/com/brigedlabz/applicationContext.xml");
//        //System.out.println(resource);
//        BeanFactory beanFactory = new XmlBeanFactory(resource);
//        Employee employee = (Employee)beanFactory.getBean("emp");
//        System.out.println("id : "+employee.id);
//        System.out.println("name : "+employee.name);
		
	//	System.out.println("coll constructor");
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/brigedlabz/applicationContext.xml");
	    Employee employee = (Employee)context.getBean("emp");
		
	    System.out.println(employee);
		
	    System.out.println("coll value");
		System.out.println("id : "+employee.id);
		System.out.println("name : "+employee.name);
		
		
	}

}
