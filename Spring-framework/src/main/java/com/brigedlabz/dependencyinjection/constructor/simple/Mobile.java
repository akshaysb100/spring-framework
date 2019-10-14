package com.brigedlabz.dependencyinjection.constructor.simple;

public class Mobile {

	int price;
	String name;
	Ram ram;
	
	
	public Mobile(int price,String name) {
		this.price = price;
		this.name = name;
		this.ram = ram;
	}
	
	public Mobile(Ram ram) {
		this.ram=ram;
		System.out.println(ram);
	}
	
	public Mobile(int price,String name,Ram ram) {
		this.price = price;
		this.name = name;
		this.ram = ram;
	}
	public void show() {
		System.out.println("price="+price+" name="+name+" ram="+ram);
		
	}
}
