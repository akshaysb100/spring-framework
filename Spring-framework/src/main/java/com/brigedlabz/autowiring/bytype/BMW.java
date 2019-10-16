package com.brigedlabz.autowiring.bytype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

public class BMW {

@Autowired
@Qualifier("car14")
 Car12 car;
     
     BMW(){
    	// System.out.println("BMW Car");
     }
     
	public Car12 getCar() {
		return car;
	}

	public void setCar(Car12 car) {
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
