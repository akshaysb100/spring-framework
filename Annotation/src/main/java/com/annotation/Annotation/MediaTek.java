package com.annotation.Annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MediaTek  implements MobileProcessor{
   
	public void process() {
		System.out.println("MediaTek cpu : ");
		
	}
	
}
