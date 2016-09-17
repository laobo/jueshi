package com.java;

/**
 * Created by duanxiangchao on 2015/8/30.
 */
public class Singlton {

    //构造函数私有化
    private Singlton(){

    }

    //静态实例化
    private static  Singlton temp = new Singlton();


    public static Singlton getInstance(){
        return temp;
    }

}
