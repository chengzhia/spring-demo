package com.chengzhi.service;

public class BeanService {

	public BeanService() {
		super();
		System.out.println("初始化构造-------beanservice");
	}
	public void init() {
		System.out.println("init ----- beanservice");
	}
	public void destory() {
		System.out.println("destory-----beanservice");
	}
}
