package com.dxc.initClass;

/**
 * Created by duanxiangchao on 2015/7/13.
 */
public class Bird {

    int age;

    public Bird(){
        System.out.println("默认构造器");
    }

    public Bird(int age){
        this.age=age;
        System.out.println("费默认构造器");
    }

}
