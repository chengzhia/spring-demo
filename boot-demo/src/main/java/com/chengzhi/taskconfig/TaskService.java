package com.chengzhi.taskconfig;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * ${DESCRIPTION}
 *
 * @param
 * @author RCZ
 * @create 2018-01-07 14:52
 */
@Service
public class TaskService {

    @Async
    public void executrTaskOne() {
        System.out.println("无参");
    }
    @Async
    public void executrTaskTwo(String name) {
        System.out.println(name);
    }
}
