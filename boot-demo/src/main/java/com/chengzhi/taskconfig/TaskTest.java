package com.chengzhi.taskconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ${DESCRIPTION}
 *
 * @param
 * @author RCZ
 * @create 2018-01-07 14:54
 */
public class TaskTest {
    public static void main(String args[]) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        TaskService bean = configApplicationContext.getBean(TaskService.class);
        for (int i = 0; i < 10; i++) {
            bean.executrTaskOne();
            bean.executrTaskTwo("name"+i);
        }
    }
}
