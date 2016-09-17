package com._2016_7.thread_boke;

/**
 * Created by duanxiangchao on 2016/7/12.
 */
public class DecreaseThread extends Thread {

    private NumberHolder numberHolder;

    public DecreaseThread(NumberHolder numberHolder){
        this.numberHolder = numberHolder;
    }

    @Override
    public void run() {
        super.run();
        for(int i = 0; i < 5; i++){
            try {
                sleep((long)Math.random() * 100000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            numberHolder.decrease();
        }
    }
}
