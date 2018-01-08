package com.chengzhi.test;

import org.junit.Assert;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xebest on 2017/12/12.
 */
public class ExecutorTest {

    public void Test1() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 100; i++) {
        }
    }
}
