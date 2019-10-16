package com.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Sanpdragon implements MobileProcessor {

	public void process() {
		System.out.println("World best cpu : ");
		
	}

	
	
}
