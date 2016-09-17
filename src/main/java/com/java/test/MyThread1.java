package com.java.test;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by duanxiangchao on 2015/8/11.
 */
public class MyThread1 extends Thread {

    public String methodName;

    public static void method(String s){
        System.out.println(s);
        while(true) ;
    }

    public synchronized  void method1(){
        method("非静态的method1方法！");
    }

    public synchronized  void method2(){
        method("非静态的method2方法！");
    }

    public static synchronized void method3(){
        method("静态的method3方法！");
    }

    public static synchronized void method4(){
        method("静态的method4方法！");
    }

    @Override
    public void run() {
        try {
            getClass().getMethod(methodName).invoke(this);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String [] str) throws InterruptedException {
        MyThread1 thread = new MyThread1();
        for(int i = 0; i <5; i++){
            thread.methodName = "method" + String.valueOf(i);
            new Thread(thread).start();
            sleep(100);
        }
    }

}
