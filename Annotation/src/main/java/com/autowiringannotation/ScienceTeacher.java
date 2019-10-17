package com.autowiringannotation;

import org.springframework.stereotype.Component;

@Component("scienceTeacher1")
public class ScienceTeacher implements Teacher{

	public void teach() {
		System.out.println("Hi i am your science teacher");
		System.out.println("My name is shubham");
		
	}

}
