package com.xgh.GenericDemo;

public class GenericFunctionDemo {
    public static void main(String[] args) {
        /*
         * 泛型方法Demo
         * */
        var doubleArray = new MyArrayList<Double>();
        /*
         * 方法返回值的<T>表明这个函数为泛型方法,T为泛型类
         * 类名后面的<T>和方法返回值前面<T>都存在的情况下,这俩个<T>毫无关系!
         * */
        //这个只接受Double类型,毕竟new MyArrayList<Double>();
        doubleArray.show(123D);
        //下面的泛型方法和MyArrayList<Double>的Double没关系!
        //函数前面的<Long>可加可不加,可以通过传入类型判断
        doubleArray.<Long>genericShow(123L);
        doubleArray.genericShow(123L);
        doubleArray.genericShow(123);
    }

}
