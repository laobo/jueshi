package com.java.thread.threadCoreBook.chapter2.t3;

/**
 * Created by duanxiangchao on 2018/8/20
 */
public class PublicCar {

    public String username = "A";
    public String password = "AA";

    synchronized public void setValue(String username, String password){
        try{
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue method thread name=" + Thread.currentThread().getName()
                    + " username=" + username + " password=" + password);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public void getValue(){
        System.out.println("getValue method thread name=" + Thread.currentThread().getName()
                + " username=" + username + " password=" + password);
    }

}
