package _2016.com.thread.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by duanxiangchao on 2016/8/3.
 */
public class TestQueue {

    public static void main(String[] arg){
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(3);
        System.out.println(queue.poll());
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.offer(4));
        System.out.println(queue.poll());
        queue.remove();
        System.out.println(queue);
    }

}
