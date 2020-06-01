package com.java.thread.threadCoreBook.chapter2.synNotExtends;

import com.java.thread.threadCoreBook.chapter2.t3.ThreadA;

/**
 * Created by duanxiangchao on 2018/8/20
 */
public class Run {

    public static void main(String[] args) {
        Sub sub = new Sub();
        MyThreadA threadA = new MyThreadA(sub);
        threadA.setName("A");
        threadA.start();
        MyThreadB threadB = new MyThreadB(sub);
        threadB.setName("B");
        threadB.start();
    }

}
