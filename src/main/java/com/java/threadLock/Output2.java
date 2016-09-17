package com.java.threadLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by duanxiangchao on 2015/8/13.
 */
public class Output2 {

    Lock lock = new ReentrantLock();

    public void print(String name){
        lock.lock();
        try{
            for(int i = 0; i < name.length(); i++){
                System.out.print(name.charAt(i));
            }
            System.out.println();
        }finally {
            lock.unlock();
        }
    }



}
