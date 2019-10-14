package com.brigedlabz.configurationwithoutxml;

import org.springframework.stereotype.Component;

@Component
public class MediaTek  implements MobileProcessor{
   
	public void process() {
		System.out.println("MediaTek cpu : ");
		
	}
	
}
