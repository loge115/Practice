package com.itheima_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    通过反射实现如下的操作：
        Student s = new Student("林青霞",30,"西安");
        System.out.println(s);
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.itheima_02.Student");
        Constructor<?> con = c.getDeclaredConstructor(String.class);
        con.setAccessible(true);
        Object obj = con.newInstance("林青霞");
        System.out.println(obj);
    }
}
