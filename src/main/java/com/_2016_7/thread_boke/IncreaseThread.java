package com._2016_7.thread_boke;

/**
 * Created by duanxiangchao on 2016/7/12.
 */
public class IncreaseThread extends Thread {

    private NumberHolder numberHolder;

    public IncreaseThread(NumberHolder numberHolder){
        this.numberHolder = numberHolder;
    }

    @Override
    public void run() {
        super.run();
        for(int i = 0; i < 5; i++){
            try {
                sleep((long)Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            numberHolder.increase();
        }
    }
}
