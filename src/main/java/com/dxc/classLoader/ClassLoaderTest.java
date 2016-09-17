package com.dxc.classLoader;

/**
 * Created by duanxiangchao on 2015/7/15.
 */
public class ClassLoaderTest {

    public static void main(String[]str){
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        //系统装载器
        System.out.println("current loader:"+loader);
        //扩展类装载器
        System.out.println("parent loader:"+loader.getParent());
        //根装载器
        System.out.println("grandParent loader:"+loader.getParent().getParent());
    }

}
