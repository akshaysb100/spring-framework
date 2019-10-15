package com.brigedlabz.autowiring.bytype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;

public class BMW {

@Autowired
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
