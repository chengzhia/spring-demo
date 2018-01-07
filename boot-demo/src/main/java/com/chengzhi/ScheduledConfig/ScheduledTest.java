package com.chengzhi.ScheduledConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ${DESCRIPTION}
 *
 * @param
 * @author RCZ
 * @create 2018-01-07 15:02
 */
public class ScheduledTest {
    public static void main(String args[]) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(ScheduledConfig.class);
    }
}
