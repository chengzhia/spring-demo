package com.chengzhi.test;

import com.chengzhi.entity.AnnoTest;
import com.chengzhi.entity.User;
import org.junit.Test;

import javax.jws.WebService;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by xebest on 2017/12/6.
 */
public class RefTest {

    @Test
    public void Test1() {
        User user = new User();
        Class clazz = User.class;
        try {
            Method setUserName = clazz.getDeclaredMethod("setUserName", String.class);
            setUserName.invoke(user,"22");
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void Test2() throws IllegalAccessException, InstantiationException {
        Class clazz = User.class;
        User u = (User) clazz.newInstance();
        u.setUserName("123");
        System.out.println(u);
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }
    }
    @Test
    public void Test3() {
        Class clazz = AnnoTest.class;
        Annotation annotation = clazz.getAnnotation(WebService.class);
        if (annotation instanceof WebService) {
            System.out.println("it is ok");
        }
    }
    @Test
    public void test4() {
        System.out.println(0x7fffffff-8);
    }
}
