package com._2016_7.thread_boke;

/**
 * Created by duanxiangchao on 2016/7/13.
 */
public class JoinSleeper extends Thread {

    private int duration;

    public JoinSleeper(int duration, String name){
        super(name);
        this.duration = duration;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " has wakend!");
    }

    public static void main(String[] str){
        JoinSleeper sleeper1 = new JoinSleeper(10000, "sleeper1");
        JoinSleeper sleeper2 = new JoinSleeper(10000, "sleeper2");
        Joiner joiner1 = new Joiner(sleeper1, "joiner");
        Joiner joiner2 = new Joiner(sleeper2, "joiner");

        joiner1.start();
        joiner2.start();


    }

}
