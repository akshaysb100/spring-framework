package com.brigedlabz.dependencyinjection.constructor.map;

import java.util.Iterator;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Set;

public class QuestionAnswer {

	private int number;
	private String quetion;
	private Map<String,String> asnwer;
	
	public QuestionAnswer(int number,String quetion,Map<String,String> answer) {
		this.number = number;
		this.quetion = quetion;
		this.asnwer = answer;
	}
	
	public void show() {
		System.out.println("Quetion number="+number+"\nQuetion="+quetion);
		 Set set = asnwer.entrySet();
		 Iterator iterator = set.iterator();
		 
		 while(iterator.hasNext()) {
			 Map.Entry entry = (Map.Entry)iterator.next();
			 System.out.println("Ans:-"+entry.getKey()+" Posted By:-"+entry.getValue());
		 }
	}
}
