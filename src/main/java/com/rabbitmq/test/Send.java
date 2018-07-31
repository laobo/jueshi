package com.rabbitmq.test;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Created by duanxiangchao on 2018/5/22
 */
public class Send {

    private final static String QUEUE = "queue";


    public static void main(String[] args) throws IOException, TimeoutException {

        // 创建连接工厂
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("127.0.0.1");

        // 创建连接
        Connection connection = connectionFactory.newConnection();
        // 创建信息管道
        Channel channel = connection.createChannel();
        // 队列名称
        String queueName = "queue01";
        // 信息声明           1.队列名称  2.是否持久化  3.是否局限于连接 4.不再使用是否删除 5.其他属性
        channel.queueDeclare(queueName, false, false, false, null);

        String msg = "Hello World";

        for(int i = 1; i <= 10; i++){
            // 发送消息        1.使用默认exchange  2.queue名称  3.        4.发送的字节
            channel.basicPublish("", queueName, null, (msg + i).getBytes());
        }


        System.out.println("发送 message[" + msg + "] to " + queueName + " success!");

        channel.close();

        connection.close();


    }

}
