package com.brigedlabz.autowiring.quaifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Student {

	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	//@Autowired
	//@Required
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	//@Autowired
	//@Required
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
