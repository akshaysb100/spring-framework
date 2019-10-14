package com.brigedlabz.autowiring.byname;

import org.springframework.beans.factory.annotation.Autowired;

public class BMW {
     
	 
     Car car;
     
     BMW(){
    	// System.out.println("BMW Car");
     }

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
     
     void print() {
    	 System.out.println("BMW company");
     }
     
     void display() {
    	 print();
    	 car.print();
     }
}
