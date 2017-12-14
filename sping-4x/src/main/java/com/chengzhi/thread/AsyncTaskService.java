package com.chengzhi.thread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {
	
	@Async
	public void executeAsyncTask(Integer i) {
		System.out.println("异步任务1"+i);
	}
	@Async
	public void executeAsyncPlus(Integer i) {
		System.out.println("异步任务2"+(i+1));
	}
}
