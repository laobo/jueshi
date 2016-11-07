package com.java.classLoader;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by duanxiangchao on 2015/7/15.
 */
public class PrivateCarReflect {

    public static void main(String[] str) throws Throwable{

        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.dxc.classLoader.PrivateCar");

        PrivateCar pcar = (PrivateCar) clazz.newInstance();

        //获取对象的属性
        Field colorFld = clazz.getDeclaredField("color");
        //取消java访问检查，以访问private变量
        colorFld.setAccessible(true);
        colorFld.set(pcar, "红色");

        Method driveMtd = clazz.getDeclaredMethod("drive",(Class[])null);
        driveMtd.setAccessible(true);
        driveMtd.invoke(pcar,(Object[])null);

    }

}
