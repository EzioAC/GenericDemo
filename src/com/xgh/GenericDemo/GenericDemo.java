package com.xgh.GenericDemo;

import java.util.Arrays;

public class GenericDemo {
    public static void main(String[] args) {
        //MyArrayList<Integer>
        int[] intArray = new int[]{1,2,3,4,5,6,7,8};
        MyArrayList<Integer> myArrayList1 = new MyArrayList<>(
                //int[]转Integer[] 真离谱
                Arrays.stream(intArray).boxed().toArray(Integer[]::new)
        );
        System.out.println(myArrayList1);
        System.out.println(myArrayList1.Get(2));
        myArrayList1.Set(99,3);
        System.out.println(myArrayList1);

        //MyArrayList<String>
        String[] strArray = new String[]{"A","B","C","D"};
        MyArrayList<String> myArrayList2 = new MyArrayList<>(strArray);
        System.out.println(myArrayList2);
        System.out.println(myArrayList2.Get(2));
        myArrayList2.Set("Z",3);
        System.out.println(myArrayList2);

    }


}
