package com.xgh.GenericDemo;

import java.util.ArrayList;
import java.util.List;

public class EarseDemo {
    public static void main(String[] args) {
        /*
        * 泛型类型擦除Demo
        * */
        MyArrayList<String> stringArray = new MyArrayList<>();
        MyArrayList<Integer> intArray = new MyArrayList<>();
        System.out.println(stringArray.getClass());
        System.out.println(intArray.getClass());
        //编译后的MyArrayList<T>会变成MyArrayList<Object>
        System.out.println(stringArray.getClass().equals(intArray.getClass()));
    }
}
