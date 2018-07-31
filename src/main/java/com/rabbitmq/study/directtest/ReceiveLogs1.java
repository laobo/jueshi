package com.rabbitmq.study.directtest;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Created by duanxiangchao on 2018/5/23
 */
public class ReceiveLogs1 {

    private static final String EXCHANGE_NAME = "direct_logs";

    public static void main(String[] args) throws IOException, TimeoutException {

        ConnectionFactory connectionFactory = new ConnectionFactory();

        Connection connection = connectionFactory.newConnection();

        Channel channel = connection.createChannel();

        // 声明路由类型
        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);
        // 声明随机名字的队列
        String queueName = channel.queueDeclare().getQueue();
        // 绑定队列到路由
        channel.queueBind(queueName, EXCHANGE_NAME, LogTypeEnum.ERROR.getValue());

        System.out.println(" [*] Waiting for error messages. To exit press CTRL+C");

        //开始监听消息
        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope,
                                       AMQP.BasicProperties properties, byte[] body) throws IOException {
                String message = new String(body, "UTF-8");
                System.out.println(" [x] Received '" + message + "'");
            }
        };
        channel.basicConsume(queueName, true, consumer);

    }

}
