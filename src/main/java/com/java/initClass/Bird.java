package com.java.initClass;

/**
 * Created by duanxiangchao on 2015/7/13.
 */
public class Bird {

    int age;

    public Bird(){
        System.out.println("鸟类无参！");
    }

    public Bird(int age){
        this.age=age;
        System.out.println("鸟类有参！");
    }

}
