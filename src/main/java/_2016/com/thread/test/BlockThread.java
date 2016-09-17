package _2016.com.thread.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by duanxiangchao on 2016/7/30.
 */
public class BlockThread {

    static final BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(1) ;

    public static void main(String[] arg){

        SubThreadBlock subThread = new SubThreadBlock(queue);
        subThread.start();
        mainWork();
        try {
            queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("now all done!");

    }

    private static void mainWork(){
        try {
            System.out.println("main thread start work!");
            Thread.sleep(3000);
            System.out.println("main thread end work!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
