package com.java.thread.threadCoreBook.chapter1;

/**
 * Created by duanxiangchao on 2018/8/13
 */
public class ALogin extends Thread {

    @Override
    public void run() {
        super.run();
        LoginServlet.doPost("a", "aa");
    }
}
