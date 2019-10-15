package com.brigedlabz.autowiring.quaifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {

	@Autowired
	@Qualifier("student1")
	private Student student;
     
	
	//@Autowired
	public Profile() {
	    // System.out.println("inside constuctor");
	}
    
	//@Autowired
	public void printAge() {
		System.out.println("Age : "+student.getAge());
		
	}
	
	//@Autowired
	public void printName() {
		System.out.println("Name : "+student.getName());
	}
	
}
