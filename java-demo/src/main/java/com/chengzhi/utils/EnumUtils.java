package com.chengzhi.utils;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by xebest on 2017/12/6.
 */
public class EnumUtils {

    public static <T> Map<Object,Object> getMapByEnum (Class clazz) {
        LinkedHashMap<Object,Object> resultMap = new LinkedHashMap<Object, Object>();
        try {
            Object[] objects = clazz.getEnumConstants();
            for (int i = 0; i < objects.length; i++) {
                T t = (T) objects[i];
                Field flag = t.getClass().getDeclaredField("flag");
                Field value = t.getClass().getDeclaredField("value");
                flag.setAccessible(true);
                value.setAccessible(true);
                resultMap.put(flag.get(t),value.get(t));
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return resultMap;
    }

    public static  <T> int getKeyByValue(String value, Class<T> clazz) {
        T[] constants = clazz.getEnumConstants();

        return 1;
    }
    public static <T> String getValueByKey(int key,Class<T> clazz) {

        return null;
    }
}
