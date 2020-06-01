package com.java.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by duanxiangchao on 2019/12/3
 */
public class DebugTest {

    public static void main(String[] args) {

        final DebugTest debugTest = new DebugTest();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                debugTest.moveABrick();
            }
        }, 1000, 5000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Long nowTimeStamp = System.currentTimeMillis()/1000;
                System.out.println(nowTimeStamp + "[" + Thread.currentThread().getName() + "]" + ": hello, new schedule...");
            }
        }, 1000, 1000);
    }

    public void moveABrick(){
        int i = 0;
        while (true){
            if(i++ < 3){
                Long nowTimeStamp = System.currentTimeMillis()/1000;
                System.out.println(nowTimeStamp + "[" + Thread.currentThread().getName() + "]" + ": moving step +" + i);
                try {
                    Thread.sleep(3000L);
                } catch (InterruptedException e){

                }
            } else {
                break;
            }
        }
        System.out.println("move over.");
    }

}
