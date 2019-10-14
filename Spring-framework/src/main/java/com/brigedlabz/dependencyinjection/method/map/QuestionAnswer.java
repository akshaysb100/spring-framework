package com.brigedlabz.dependencyinjection.method.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QuestionAnswer {
  
	private int number;
	private String question;
	private Map<String,String> answer;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getquestion() {
		return question;
	}
	public void setquestion(String question) {
		this.question = question;
	}
	public Map<String, String> getAnswer() {
		return answer;
	}
	public void setAnswer(Map<String, String> answer) {
		this.answer = answer;
	}
	
	public void display() {
		System.out.println("question number = "+number+"\nquestion = "+question+"\nanswer");
		 Set<Entry<String, String>> set=answer.entrySet();     
		Iterator<Entry<String, String>> itr=set.iterator();  
		    while(itr.hasNext()){  
		        Entry<String,String> entry=itr.next();  
		        System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());  
	   }
	}
}
