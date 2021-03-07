package com.xgh.GenericDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class NonGenericDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        /*
        四舍五入为ArrayList<Object>,什么类型都可以接受.
        很难确认这个类型到底要存什么的什么类型,容易出bug!
         */
        arrayList.add("A");
        arrayList.add(1);
        arrayList.add(true);
        arrayList.forEach(System.out::println);
    }
}
