package com.brigedlabz.dependencyinjection.constructor.list;

import java.util.List;

public class Student {

	int id;
	String name;
	List<Address> address;
	
	public Student(int id,String name,List<Address> address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void show() {
		System.out.println("id="+id+"\nname="+name+"\n"+address);
	}
}
