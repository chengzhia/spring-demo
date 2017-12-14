package com.chengzhi.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent>{
	@Override
	public void onApplicationEvent(DemoEvent event) {
		System.out.println("接收到的消息"+event.getMsg());
	}
}
