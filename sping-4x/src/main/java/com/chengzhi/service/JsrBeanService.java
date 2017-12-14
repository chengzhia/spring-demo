package com.chengzhi.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JsrBeanService {

	public JsrBeanService() {
		super();
		System.out.println("jsr---初始化");
	}
	@PostConstruct
	public void init() {
		System.out.println("init ----- jsr");
	}
	@PreDestroy
	public void destory() {
		System.out.println("destory-----jsr");
	}
	
}
