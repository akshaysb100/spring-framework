package com.autowiringannotation;

import org.springframework.stereotype.Component;

@Component("mathTeacher1")
public class MathTeacher implements Teacher {

	public void teach() {
		System.out.println("Hi I am your math teacher");
		System.out.println("my name is prakash");
	}

	
}
