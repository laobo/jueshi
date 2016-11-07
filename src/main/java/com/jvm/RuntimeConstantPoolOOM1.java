package com.jvm;

/**
 * Created by duanxiangchao on 2016/9/11.
 */
public class RuntimeConstantPoolOOM1 {

    public static void main(String[] arg){
        String str1 = new StringBuffer("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuffer("Ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }

}
