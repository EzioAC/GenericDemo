package com.xgh.GenericDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class WildCardDemo {
    public static void main(String[] args) {
        /*
         * ?,extends和super的演示
         * 直接用ArrayList<T>类和Number类演示了!
         * 总得来说都是对类型擦除的补救措施
         */

        Integer[] intArray = new Integer[]{1,2,3,4,5,6,7,8};
        Double[] doubleArray = new Double[]{1D,2D,3D,4D,5D,6D,7D,8D};
        ArrayList<Number> numberArray = new ArrayList<Number>();
        //? extends E 演示
        //源码方法:public boolean addAll(Collection<? extends E> c)
        //由于声明是Number类型,你可能希望里面能方Number的子类
        //但是由于ArrayList<Number>,ArrayList<Integer>,ArrayList<Double>没有父子关系,只能通过 ? extends Number来限制
        numberArray.addAll(Arrays.<Integer>asList(intArray));
        numberArray.addAll(Arrays.<Double>asList(doubleArray));
        //? super E 演示
        //源码方法:public void forEach(Consumer<? super E> action)
        //Number是Integer和Double的父类,既然有继承关系,可能使用共性的!比如都都继承了某个接口
        //但是还是泛型的问题,ArrayList<Number>,ArrayList<Integer>,ArrayList<Double>没有父子关系,只能通过 ? super Number来限制
        numberArray.forEach((number)->{System.out.println(number.toString());});
        //ps,有个PECS（Producer Extends Consumer Super）原则
        //如果写入数据(生产者),用Extends
        //如果读取数据(消费者),用Super
    }
}
