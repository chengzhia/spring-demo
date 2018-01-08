package com.chengzhi.java8;

import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

/**
 * Created by xebest on 2017/12/18.
 */
public class LamdbaTest {

    @Test
    public void Test1() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map1 = new HashMap<String, Object>();
        Map<String, Object> map2 = new HashMap<String, Object>();
        Map<String, Object> map3 = new HashMap<String, Object>();
        Map<String, Object> map4 = new HashMap<String, Object>();
        map1.put("purchOrder", "123");
        map1.put("orderId", "123");
        map1.put("orderStatus", "3");

        map2.put("purchOrder", "456");
        map2.put("orderId", "456");
        map2.put("orderStatus", "3");

        map3.put("purchOrder", "234");
        map3.put("orderId", "879");
        map3.put("orderStatus", "2");

        map4.put("purchOrder", "123");
        map4.put("orderId", "789");
        map4.put("orderStatus", "2");
        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);
        /*List<Map<String, Object>> collect = list.stream()
                .filter(result -> result.get("aa").equals(list.get(0).get("aa")))
                .distinct().collect(Collectors.toList());
        collect.forEach(System.out::println);
        System.out.println(collect.size());
        list.forEach(System.out::println);*/
        List<String> purchOrder = list.stream().map(key -> key.get("purchOrder").toString()).distinct().collect(toList());
//        purchOrder.forEach(System.out::println);
        Map<Object, List<Map<String, Object>>> aa = list.stream().collect(groupingBy(key -> key.get("purchOrder")));
        System.out.println(aa);
        System.out.println("----------------");
        Map<String, List<Map<String, Object>>> orderStatusGroup = aa.get("123").stream()
                .filter(purch -> !purch.get("orderId").equals("23121"))
                .collect(groupingBy(key -> key.get("orderStatus").toString()));
        System.out.println(orderStatusGroup);
    }
    @Test
    public void Test2() {
        Label message = new Label("1231");
    }
}
