package com.chengzhi.support.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class ApplicationRefresnListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        //TODO : Refresh Backup when config refreshed
        System.out.println("ApplicationRefresnListener###");
    }
}
