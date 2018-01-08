package com.chengzhi;

import com.chengzhi.interceptor.LoginInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@SpringBootApplication
//@ImportResource({"classpath:test.xml"})  //使用ImportResource 加载外部其他xml
public class Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new SpringApplicationBuilder(Application.class)
				.web(true).run(args);
	}
	@Bean
	public LoginInterceptor loginInterceptor() {
		return new LoginInterceptor();
	}

	/*@Bean
	public MultipartResolver multipartResolver() {
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
		multipartResolver.setMaxInMemorySize(1000000);
		return multipartResolver;
	}*/
}
