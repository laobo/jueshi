package com._2016_7.thread_boke;

/**
 * Created by duanxiangchao on 2016/7/12.
 */
public class NumberTest {

    public static int count = 0;

    public static void main(String[] str){

        NumberHolder numberHolder = new NumberHolder(0);

        IncreaseThread increaseThread = new IncreaseThread(numberHolder);
        DecreaseThread decreaseThread = new DecreaseThread(numberHolder);

        IncreaseThread increaseThread1 = new IncreaseThread(numberHolder);
        DecreaseThread decreaseThread1 = new DecreaseThread(numberHolder);

        increaseThread.start();
        decreaseThread.start();

        increaseThread1.start();
        decreaseThread1.start();

    }

}
