package _2016.com.thread.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * Created by duanxiangchao on 2016/7/30.
 */
public class Test1 {

    public static void main(String[] arg){

        ExecutorService executorService = Executors.newCachedThreadPool();
        Task task = new Task();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
        executorService.submit(futureTask);
        executorService.shutdown();

        try {
            Thread.sleep(1000);
            System.out.println("主线程在执行任务！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("所有线程运行完毕！");

        try {
            System.out.println("task运行结果" + futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

}
