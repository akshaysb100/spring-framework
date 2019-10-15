package com.aop;


public class Operation {
	public int show() {
		System.out.println("show method invoked");
		return 2;
	}
	
	public int display() {
		System.out.println("display method invoked");
		return 1;
	}
	
	public void msg() {
		System.out.println("msg method invoed");
	}
	
	// public void msg(){System.out.println("msg method invoked");}  
	    public int m(){
	    	System.out.println("m method invoked");return 2;
	    	}  
	    public int k(){System.out.println("k method invoked");return 3;}  
}
