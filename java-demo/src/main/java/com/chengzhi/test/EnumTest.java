package com.chengzhi.test;

import com.chengzhi.entity.TestEnum;
import com.chengzhi.utils.EnumUtils;

import java.util.Map;

/**
 * Created by xebest on 2017/12/6.
 */
public class EnumTest {
    public static void main(String[] args){
        Map<Object, Object> mapByEnum = EnumUtils.getMapByEnum(TestEnum.class);
        System.out.println(mapByEnum.get(1));
        System.out.println(mapByEnum.get(2));
    }
}
