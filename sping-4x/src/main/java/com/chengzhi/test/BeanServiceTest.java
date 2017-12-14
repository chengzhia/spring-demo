package com.chengzhi.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chengzhi.config.BeanServiceConfig;
import com.chengzhi.service.BeanService;
import com.chengzhi.service.JsrBeanService;

public class BeanServiceTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanServiceConfig.class);
		BeanService bean = context.getBean(BeanService.class);
		JsrBeanService bean2 = context.getBean(JsrBeanService.class);
		context.close();
		
	}
}
