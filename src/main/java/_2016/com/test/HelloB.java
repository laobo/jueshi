package _2016.com.test;

/**
 * Created by duanxiangchao on 2016/8/1.
 */
public class HelloB extends HelloA {

    public HelloB(){
        System.out.println("Hello B!");
    }

    {
        System.out.println("I am class B!");
    }

    static {
        System.out.println("static B");
    }

    public static void main(String[] str){
        System.out.println("-----main start-----");
        new HelloA();
        new HelloB();
        System.out.println("-----main end-----");
    }

}