package com.xgh.GenericDemo;

public class InstanceOfDemo {
    public static void main(String[] args) {
        /*
         * 泛型和Instanceof用法Demo
         * */
        MyArrayList<String> stringArray = new MyArrayList<>();
        MyArrayList<Integer> intArray = new MyArrayList<>();
        System.out.println(stringArray instanceof MyArrayList<?>);
        System.out.println(stringArray instanceof MyArrayList);
        System.out.println(intArray instanceof MyArrayList<?>);
        System.out.println(intArray instanceof MyArrayList);
        /*
        * 编译报错,类型擦除之后无法判断泛型T的具体类型
        * */
        //System.out.println(stringArray instanceof MyArrayList<String>);
        //System.out.println(intArray instanceof MyArrayList<Integer>);
    }
}
