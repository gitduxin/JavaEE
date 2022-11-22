package com.dx.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Invoke {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        Class clazz = list.getClass();
        Method method =  clazz.getMethod("add", Object.class);
        method.invoke(list,"abcdefg");
        System.out.println(list);

    }
}
