package com.xgh.GenericDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        ArrayList<String>[] ls = new ArrayList[10];
        List[] a = ls;
        ls[0] = new ArrayList<String>();
        //ls[1] = new ArrayList<Integer>();
        ls[0].add("123");

        a[1] = new ArrayList<Integer>();
        ((ArrayList<Integer>)a[1]).add(321);
        System.out.println(ls[0].get(0));
        System.out.println(a[1].get(0));
        System.out.println(((ArrayList<Integer>)a[1]).get(0));

        System.out.println(ls.getClass().getName());
        System.out.println(a.getClass().getName());

        List[] asd = new ArrayList [10];
    }
}
