package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    ApplicationContext context = new ClassPathXmlApplicationContext("/com/aop/applicationContext.xml");  
    Operation operation = (Operation) context.getBean("opBean");  
    System.out.println("calling msg...");  
    operation.msg();
    operation.show();
   
    }
}
