package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
 
	
	@Autowired
	@Qualifier("mediaTek")  //if you don't write @Qualifier than you can write @primary on the class if you want this class in that class
	MobileProcessor mobileProcessor;
	
	
	public MobileProcessor getMobileProcessor() {
		return mobileProcessor;
	}


	public void setMobileProcessor(MobileProcessor mobileProcessor) {
		this.mobileProcessor = mobileProcessor;
	}


	public void config() {
		System.out.println("Octa core , 4Gb Ram , 12Mp camera ");
		mobileProcessor.process();
		
	}
}
