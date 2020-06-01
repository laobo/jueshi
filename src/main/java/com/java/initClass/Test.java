package com.java.initClass;

/**
 * Created by duanxiangchao on 2015/7/13.
 */
public class Test {

    public static void main(String[]str){
//
        Bird bire = new Bird();
//
        System.out.println("=================");

        Bird daNiao = new DaNiao();

        Boolean flag = true;
        hh(flag);
        System.out.println(flag);

    }


    private static void hh(Boolean flag){
        flag = false;
    }

}
