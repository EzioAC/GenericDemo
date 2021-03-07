package com.xgh.GenericDemo;

public class MyArrayList<T> implements IShow<T>{
    private T[] array;

    MyArrayList(T[] array)
    {
        this.array = array;
    }
    MyArrayList() {array = null;}

    @Override
    public String toString() {
        var str = this.getClass().getName() + ":";
        if(array == null)
            return "";
        for (T item:array) {
            str+=item+" ";
        }
        return str;
    }

    public void Set(T val,int index)
    {
        array[index] = val;
    }

    public T Get(int index)
    {
        return array[0];
    }

    @Override
    public T show(T t) {
        System.out.println(t.getClass().getName().toString() +":"+ t.toString());
        return t;
    }

    public <T> T genericShow(T t) {
        System.out.println(t.getClass().getName().toString() +":"+ t.toString());
        return t;
    }

    public static void PrintArray(MyArrayList<?> myArrayList)
    {
        System.out.println("PrintArray:"+myArrayList.getClass().getName());
        for (var itme:myArrayList.array) {
            System.out.println(itme);
        }
    }
}
