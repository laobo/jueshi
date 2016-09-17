package _2016.com.thread.callable;

import java.util.concurrent.*;

/**
 * Created by duanxiangchao on 2016/7/30.
 */
public class Test {

    public static void main(String arg[]){

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Task task = new Task();
        Future<Integer> future = executorService.submit(task);
        executorService.shutdown();
        try {
            Thread.sleep(1000);
            System.out.println("主线程在执行任务！");
            System.out.println("task运行结果" + future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("所有线程运行完毕！");

    }

}