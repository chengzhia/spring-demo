package com.chengzhi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.chengzhi.service.BeanService;
import com.chengzhi.service.JsrBeanService;

@Configuration
@ComponentScan("com.chengzhi.service")
public class BeanServiceConfig {
	@Bean(initMethod="init",destroyMethod="destory")
	BeanService beanService() {
		return new BeanService();
	}
	@Bean
	JsrBeanService jsrBeanService() {
		return new JsrBeanService();
	}
}
