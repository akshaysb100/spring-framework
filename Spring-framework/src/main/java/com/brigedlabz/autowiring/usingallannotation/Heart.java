package com.brigedlabz.autowiring.usingallannotation;

public class Heart {

	private String nameOfAnimal;
	private int numberOfHeart;
	
	public String getNameOfAnimal() {
		return nameOfAnimal;
	}
	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}
	public int getNumberOfHeart() {
		return numberOfHeart;
	}
	public void setNumberOfHeart(int numberOfHeart) {
		this.numberOfHeart = numberOfHeart;
	}
	
	public void pump() {
		System.out.println("your heart is pumping");
		System.out.println("Alive");
	}
}
