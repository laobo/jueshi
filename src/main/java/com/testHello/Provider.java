package com.testHello;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by duanxiangchao on 16/11/1.
 */
public class Provider {

    public static void main(String[] str){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:/Users/duanxiangchao/git/jueshi/src/main/resources/spring/dubbo-provider.xml");
        context.start();
        try {
            System.in.read(); // 按任意键退出
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
