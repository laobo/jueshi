package _2016.com.thread.test;

/**
 * Created by duanxiangchao on 2016/7/30.
 */
public class Threads {

    public static void main(String arg[]){

        SubThread thread = new SubThread();
        thread.start();
        mainWork();
        System.out.println("wait subthread done");
        try {
            thread.join();
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

