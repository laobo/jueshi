package com.java.thread.threadCoreBook.chapter1;

/**
 * Created by duanxiangchao on 2018/8/13
 */
public class BLogin extends Thread {

    @Override
    public void run() {
        LoginServlet.doPost("b", "bb");
    }
}
