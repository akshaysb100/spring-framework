package com.brigedlabz.dependencyinjection.constructor.set;

public class Address {

	String city;
	String state;
	
     public Address(String city,String state) {
    	 this.city = city;
    	 this.state = state;
     }

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
     
     
}
