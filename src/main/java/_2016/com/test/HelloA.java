package _2016.com.test;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by duanxiangchao on 2016/8/1.
 */
public class HelloA {

    public HelloA(){
        System.out.println("Helllo A!");
    }

    {
        System.out.println("I am class A!");
    }

    static {
        System.out.println("static A!");
    }

}
