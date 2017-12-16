package com.chengzhi.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class TestController {
	
	@Value("${form}")
	private String form;
	
	@RequestMapping("/form")
	public String from() {
		return this.form;
	}
}
