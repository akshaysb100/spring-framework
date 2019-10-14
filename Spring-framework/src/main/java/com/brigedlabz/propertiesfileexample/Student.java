package com.brigedlabz.propertiesfileexample;

public class Student {
    
	
	private String name;
	private String course;
	private String hobby;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public void showData() {
		
		System.out.println("Student id is : "+name);
		System.out.println("Name of Student : "+course);
		System.out.println("Student course : "+hobby);
		
	}

}
