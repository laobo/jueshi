package _2016.com.test;

/**
 * Created by duanxiangchao on 2016/8/12.
 */
public class MyTestThrerad {

    public static void main(String[] arg){
        Thread thread0 = new myThread();
        Thread thread1 = new myThread();
        Thread thread2 = new myThread();
        Thread thread3 = new myThread();
        Thread thread4 = new myThread();
        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            thread0.join();
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class myThread extends Thread{
    @Override
    public void run() {
        super.run();
        for(int i = 0; i < 100; i++){
            try {
                Thread.sleep(1000);
                System.out.println("运行线程：" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
