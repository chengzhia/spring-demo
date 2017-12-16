package com.chengzhi.thread;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TaskTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
		AsyncTaskService bean = context.getBean(AsyncTaskService.class);
		for (int i = 0; i < 10; i++) {
			bean.executeAsyncTask(i);
			bean.executeAsyncPlus(i);
		}
		context.close();
	}
}
