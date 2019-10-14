package com.brigedlabz.spring.FirstSpring;

public class BulbService {

	Bulb bulb;
	
	
	public Bulb getBulb() {
		return bulb;
	}


	public void setBulb(Bulb bulb) {
		this.bulb = bulb;
	}


	public String askForBulb() {
		return bulb.getBulb();
	}
	
	
}
