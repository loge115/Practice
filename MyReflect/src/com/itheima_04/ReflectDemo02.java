package com.itheima_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
    练习：通过反射实现如下操作
        Student s = new Student();
        s.name = "林青霞";
        s.age = 30;
        s.address = "西安";
        System.out.println(s);
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> c = Class.forName("com.itheima_02.Student");
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        Field name = c.getDeclaredField("name");
        name.setAccessible(true);
        name.set(obj,"林青霞");
        Field age = c.getDeclaredField("age");
        age.setAccessible(true);
        age.set(obj,30);
        c.getField("address").set(obj,"西安");
        System.out.println(obj);
    }
}
