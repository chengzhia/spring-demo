package com.chengzhi.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
		DemoPublisher bean = context.getBean(DemoPublisher.class);
		bean.publish("helloworld");
		context.close();
	}
}
