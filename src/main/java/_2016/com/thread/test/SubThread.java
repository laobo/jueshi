package _2016.com.thread.test;

/**
 * Created by duanxiangchao on 2016/7/30.
 */
public class SubThread extends Thread{

    @Override
    public void run() {
        super.run();
        working();
    }

    private void working(){
        try {
            System.out.println("sub thread start working.");
            sleep(5000);
            System.out.println("sub thread end working.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
