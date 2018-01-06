package com.chengzhi.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping("/query")	
	public String helloWorld() {
		System.out.println("this is service port 9004");
		return "hello World 9004";
	}
}
