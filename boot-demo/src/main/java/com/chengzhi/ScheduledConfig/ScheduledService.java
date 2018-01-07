package com.chengzhi.ScheduledConfig;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * ${DESCRIPTION}
 *
 * @param
 * @author RCZ
 * @create 2018-01-07 14:59
 */
@Service
public class ScheduledService {

    @Scheduled(fixedRate = 5000)
    public void printOnt() {
        System.out.println("五秒执行一次");
    }

    /**
     * 使用cron表达式
     */
    @Scheduled(cron = "0 28 11 ? * *")
    public void printTwo () {
        System.out.println("指定时间执行");
    }
}
