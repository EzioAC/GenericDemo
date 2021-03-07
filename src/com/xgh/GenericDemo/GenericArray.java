package com.xgh.GenericDemo;

import java.util.ArrayList;

public class GenericArray {

    public static void main(String[] args) {
        /*
         * 泛型数组Demo
         * 泛型和[]的配合不大行,只能通过声明来指定T的类型,但可以通过强转转变
         * 如要要用泛型数组,推荐使用ArrayList<T>类实现数组
         * */

        //不推荐用法
        MyArrayList<Double>[] genericDoubleArray = new MyArrayList[10];
        Double[] doubleArray = new Double[]{1D,2D,3D,4D,5D,6D,7D,8D};
        genericDoubleArray[0] = new MyArrayList<Double>(doubleArray);
        genericDoubleArray[0].Set(9.9D,0);
        System.out.println(genericDoubleArray[0].toString());
        //应为声明是Double,所以下面语句会报错
        //genericDoubleArray[1] = new MyArrayList<Integer>();
        Integer[] intArray = new Integer[]{1,2,3,4,5,6,7,8};
        MyArrayList<Integer>[] genericIntArray = (MyArrayList[])genericDoubleArray;
        genericIntArray[1] = new MyArrayList<Integer>(intArray);
        genericIntArray[1].Set(99,0);
        System.out.println(genericIntArray[1].toString());

        //推荐用法
        ArrayList<MyArrayList<Double>> array = new ArrayList<MyArrayList<Double>>();
        array.add(new MyArrayList<>(doubleArray));
        System.out.println(array.get(0).toString());
        //下面报错,类型不对
        //array.set(1,new MyArrayList<>(intArray));
    }
}
