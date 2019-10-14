package com.brigedlabz.autowiring.usingallannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Human {

	  @Autowired
	  @Qualifier("humanObject")
	 private Heart heart;

//	  public Human() {
//		  
//	  }
//	 
//	public Human(Heart heart) {
//		super();
//		this.heart = heart;
//	}
//
//	public Heart getHeart() {
//		return heart;
//	}
//
//	public void setHeart(Heart heart) {
//		this.heart = heart;
//	}
//	 
	 public void startPumping() {
		 heart.pump();
		 System.out.println("name of animal is : "+heart.getNameOfAnimal()+"\n"
				             +"number of heart : "+heart.getNumberOfHeart());
		 
	 }
}
