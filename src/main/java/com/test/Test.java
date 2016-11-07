package com.test;

import java.util.Hashtable;

/**
 * Created by duanxiangchao on 2016/8/1.
 */
public class Test {

    public static void main(String[] arg){
//        testInteger();
//        getVal(2);
//        testMyClass();
        testHash();
        System.out.println(IMyClass.count);
    }

    private static void testHash(){
        Hashtable<String, String> hashtable = new Hashtable<String, String>();
        hashtable.put("das", null);
    }

    private static void testInteger(){
        Integer a = Integer.MAX_VALUE;
        int b = a + 1;
        System.out.println(a);
        System.out.println(b);
    }

    private static void getVal(int i){
        int result = 0;
        switch (i){
            case 1:
                result += i * 1;
            case 2:
                result += i * 2;
            case 3:
                result += i * 3;
        }
        System.out.println("result:" + result);
    }

    private static void testMyClass(){
        MyClassImpl myClass = new MyClassImpl();
        myClass.st();
    }

}
