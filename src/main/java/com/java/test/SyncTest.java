package com.java.test;

/**
 * Created by duanxiangchao on 2015/8/12.
 */
public class SyncTest {

    public static void main(String[] args) {
        final Business b = new Business();
        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 50; i++) {
                    b.sub(i);
                }
            }
        }).start();

        for (int i = 0; i < 50; i++) {
            b.main(i);
        }
    }

}

class Business {
    private boolean isSub = true;

    public synchronized void sub(int i) {
        while (!isSub) {
            try {
                this.wait();
            } catch (InterruptedException e) {

            }
        }
        for (int j = 0; j < 10; j++) {
            System.out.println("sub thread sequence of " + j + ", loop of " + i);
        }
        isSub = false;
        this.notify();
    }

    public synchronized void main(int i) {
        while (isSub) {
            try {
                this.wait();
            } catch (InterruptedException e) {

            }
        }
        for (int j = 0; j < 10; j++) {
            System.out.println("main thread sequence of " + j + ", loop of " + i);
        }
        isSub = true;
        this.notify();
    }
}
