package com.chengzhi;

import com.chengzhi.entity.User;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.junit.Test;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * java 内省
 * Created by xebest on 2017/12/4.
 */
public class BeanInfoTest {

    private static User user = new User();

    public static void main(String[] args) throws Exception {
        PropertyDescriptor pds1 = new PropertyDescriptor("userName", User.class);
        Method writeMethod1 = pds1.getWriteMethod();
        writeMethod1.invoke(user,"张三");
        System.out.println(user);
    }
    @Test
    public void test1() throws IntrospectionException, InvocationTargetException, IllegalAccessException {
        BeanInfo beanInfo = Introspector.getBeanInfo(user.getClass());
        PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor descriptor : descriptors) {
            if (descriptor.getName().equals("userName")){
                Method writeMethod = descriptor.getWriteMethod();
                writeMethod.invoke(user,"张三");
                System.out.println(user);
                break;
            }
        }
    }
    @Test
    public void Test2() throws Exception {
        BeanUtils.setProperty(user,"userName","李四");
        System.out.println(user);
        PropertyUtils.setProperty(user,"userName","张珊");
        System.out.println(user);
    }
}
