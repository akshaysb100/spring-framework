package com.brigedlabz.dependencyinjection.method.list;

import java.util.Iterator;
import java.util.List;

public class Student {

	private int rollNumber;
	private String name;
	private List<String> city;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getcity() {
		return city;
	}
	public void setcity(List<String> city) {
		this.city = city;
	}
    
	public void display() {
		System.out.println("Roll Number="+rollNumber+"\nname="+name+"\ncity");
		Iterator<String> iterator = city.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
}
