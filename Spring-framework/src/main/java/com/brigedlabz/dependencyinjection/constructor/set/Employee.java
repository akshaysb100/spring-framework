package com.brigedlabz.dependencyinjection.constructor.set;

import java.util.Set;

public class Employee {

	private int id;
	private String name;
	private Set<String> address;
	
	 public Employee(int id,String name,Set<String> address) {
		 this.id = id;
		 this.name = name;
		 this.address = address;
	 }
	 
	 public void show() {
		 System.out.println("id="+id+"\nname="+name+"\n"+address);
	 }
}
