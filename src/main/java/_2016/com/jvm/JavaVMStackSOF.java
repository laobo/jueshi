package _2016.com.jvm;

/**
 * VM Args: -Xss128k  栈内存128k
 * Created by duanxiangchao on 2016/9/11.
 */
public class JavaVMStackSOF {

    private int stackLength = 1;

    public void stackLeak(){
        stackLength ++ ;
        stackLeak();
    }

    public static void main(String[] arg) throws Throwable{
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }

}
