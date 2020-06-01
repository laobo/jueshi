package com.java.thread.threadCoreBook.chapter1.tl20;

import java.io.IOException;

/**
 * Created by duanxiangchao on 2018/8/17
 */
public class DemoRun {

    public static void main(String[] args) {
        ThreadDemo demo = new ThreadDemo();
        demo.setDaemon(true);
        demo.start();

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
