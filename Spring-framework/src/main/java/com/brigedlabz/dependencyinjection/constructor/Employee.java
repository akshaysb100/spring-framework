package com.brigedlabz.dependencyinjection.constructor;

public class Employee {
	int id;
	String name;
	
	public Employee() {
		System.out.println("def con..");
	}
	
	public Employee(int id) {
		this.id=id;
		System.out.println("int typr "+id);
		
	}
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
		//System.out.println("id : "+id+"\nname :"+name);
	}
}
