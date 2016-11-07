package com.jvm;

/**
 * Created by duanxiangchao on 2016/9/11.
 */
public class TestString {

    public static void main(String[] arg){
        String st1 = new String("123") + new String("123");
        st1.intern();
        String st2 = "123123";
        System.out.println(st1 == st2);
        System.out.println(st1.equals(st2));
    }

}
