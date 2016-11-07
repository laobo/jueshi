package com.testHello;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by duanxiangchao on 16/11/1.
 */
public class Consumer {

    public static void main(String[] str){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:/Users/duanxiangchao/git/jueshi/src/main/resources/spring/spring-consumer.xml");
        HelloImpl hello = (HelloImpl) context.getBean("helloConsumer");
        System.out.println(hello.sayHello("laobo"));
    }

}
