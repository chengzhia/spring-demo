package com.chengzhi.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by xebest on 2018/1/5.
 */
public class Test {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        Integer flag = 1; 
        while (true) {
            list.add(++flag);
        }

    }
    @org.junit.Test
    public void test1() {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {11,22,33,44,55,66};
        System.arraycopy(arr1,2,arr2,2,3);
        Arrays.asList(arr2).stream().forEach(str -> System.out.println(str));
    }
}
