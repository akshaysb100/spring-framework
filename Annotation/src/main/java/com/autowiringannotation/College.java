package com.autowiringannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("collegeA") //create object of this class
public class College {
	
	//@Value("${college.name}")
	private String collegeName;
	
	private Principal principal;
 
	@Autowired
	@Qualifier("mathTeacher1")
	private Teacher Teacher;
	
	@Autowired
	@Value("${college.name}")
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	
	@Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	
	public void test() {
		
		System.out.println("College name is : "+collegeName);
		principal.principalInfo();
		Teacher.teach();
		System.out.println("test method..");

	}
	
}
