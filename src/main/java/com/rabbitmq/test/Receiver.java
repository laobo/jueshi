package com.rabbitmq.test;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Created by duanxiangchao on 2018/5/22
 */
public class Receiver {

    public static void main(String[] args) throws IOException, InterruptedException, TimeoutException {
        // 创建链接工厂
        ConnectionFactory connFac = new ConnectionFactory();

        // 默认链接的主机名 本地 127.0.0.1
        connFac.setHost("127.0.0.1");

        //创建链接
        Connection conn = connFac.newConnection();

        //创建信息管道
        Channel channel = conn.createChannel();

        //定义Queue名称
        String queueName = "queue01";
        //1.队列名2.是否持久化，3是否局限与链接，4不再使用是否删除，5其他的属性
        channel.queueDeclare(queueName, false, false, false, null);

        //上面的部分，与Test01是一样的

        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope,
                                       AMQP.BasicProperties properties, byte[] body) throws IOException {
                String message = new String(body, "UTF-8");
                System.out.println(" [x] Received '" + message + "'");
            }
        };

    }

}
