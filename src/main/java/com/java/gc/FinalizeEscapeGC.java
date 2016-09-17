package com.java.gc;

/**
 * Created by duanxiangchao on 2015/7/29.
 */
public class FinalizeEscapeGC {

    public static FinalizeEscapeGC SAVE_HOOK = null;

    public void isAlive(){
        System.out.println("yes,i am still alive!");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Finallize method is executed!");
        FinalizeEscapeGC.SAVE_HOOK = this;
    }

    public static void main(String[] str) throws InterruptedException {
        SAVE_HOOK = new FinalizeEscapeGC();
        //对象第一次成功拯救自己
        SAVE_HOOK = null;
        System.gc();
        //finalize方法优先级很低，所以暂停0.5秒等待它
        Thread.sleep(500);
        if(SAVE_HOOK != null){
            SAVE_HOOK.isAlive();
        }else{
            System.out.println("No,I am dead!");
        }

//        //下面代码与
//        SAVE_HOOK = null;
//        System.gc();
//        //finalize方法优先级很低，所以暂停0.5秒等待它
//        Thread.sleep(500);
//        if(SAVE_HOOK != null){
//            SAVE_HOOK.isAlive();
//        }else{
//            System.out.println("No,I am dead!");
//        }
    }



}
