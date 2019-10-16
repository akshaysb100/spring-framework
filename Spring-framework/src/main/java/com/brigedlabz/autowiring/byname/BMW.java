package com.brigedlabz.autowiring.byname;



public class BMW {
     
	
     Car car2;
     
     BMW(){
    	// System.out.println("My BMW Car");
     }
//
//	public Car getCar() {
//		return car2;
//	}
//
//	public void setCar(Car car) {
//		this.car2 = car;
//	}
//     
     
     
     void print() {
    	 System.out.println("BMW company");
     }
     
     public Car getCar2() {
		return car2;
	}


	public void setCar2(Car car2) {
		this.car2 = car2;
	}


	void display() {
    	
    	 car2.print();
    	 print();
     }
}
