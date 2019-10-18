package com.mvc;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {
 
	@RequestMapping(value = "/add")
	public String add() {
		System.out.println("hello");
		return "display.jsp";
	}
}
