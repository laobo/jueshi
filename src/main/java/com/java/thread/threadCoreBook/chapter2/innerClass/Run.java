package com.java.thread.threadCoreBook.chapter2.innerClass;

/**
 * Created by duanxiangchao on 2018/9/14
 */
public class Run {

    public static void main(String[] args) {

        PublicClass publicClass = new PublicClass();
        publicClass.setPassword("laobo123");
        publicClass.setUserName("laobo");
        System.out.println(publicClass.getUserName() + " : " + publicClass.getPassword());

        PublicClass.PrivateClass privateClass = publicClass.new PrivateClass();
        privateClass.setAge(20);
        privateClass.setAddress("少林寺");
        System.out.println(privateClass.getAddress() + " " + privateClass.getAge());

        PublicClass.StaticClass staticClass = new PublicClass.StaticClass();
        staticClass.setAge(18);
        staticClass.setAddress("北京");
        System.out.println(staticClass.getAddress() + " " + staticClass.getAge());

    }

}
