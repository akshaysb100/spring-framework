package com.brigedlabz.configurationwithoutxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
 
	@Autowired
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
