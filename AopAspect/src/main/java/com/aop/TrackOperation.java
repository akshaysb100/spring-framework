package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;

@Aspect
public class TrackOperation {

	
	  @Pointcut("execution(* Operation.*(..))")  
	    public void msg(){}
	  
	  @Before("show")
		
      public void myAdvice(){
		System.out.println("addtional cornar");
     	}	
	
//	 @Pointcut("execution(* Operation.*(..))")  
//	    public void k(){}//pointcut name  
//	      
//	    @Before("k()")//applying pointcut on before advice  
//	    public void myadvice(JoinPoint jp)//it is advice (before advice)  
//	    {  
//	        System.out.println("additional concern");  
//	        //System.out.println("Method Signature: "  + jp.getSignature());  
//	    } 
}
