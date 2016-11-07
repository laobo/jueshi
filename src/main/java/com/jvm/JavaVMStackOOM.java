package com.jvm;

/**
 * VM args: -Xss 2M
 * Created by duanxiangchao on 2016/9/11.
 */
public class JavaVMStackOOM {

    private int num = 0;

    private void dontStop(){
        while (true){

        }
    }

    public void stackLeakByThread(){
        while (true){
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    dontStop();
                }
            });
            thread.start();
            num ++;
        }
    }

    public static void main(String[] arg){
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }

}
