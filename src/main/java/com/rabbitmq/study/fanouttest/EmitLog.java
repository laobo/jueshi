package com.rabbitmq.study.fanouttest;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Created by duanxiangchao on 2018/5/23
 */
public class EmitLog {

    private static final String EXCHANGE_NAME = "logs";

    public static void main(String[] args) throws IOException, TimeoutException {

        ConnectionFactory connectionFactory = new ConnectionFactory();

        Connection connection = connectionFactory.newConnection();

        Channel channel = connection.createChannel();

        // 声明路由和路由类型
        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.FANOUT);

        String message = "msg...";

        for(int i = 0; i < 10; i++){
            channel.basicPublish(EXCHANGE_NAME, "", null, (message + i).getBytes("UTF-8"));
            System.out.println("[x] Sent '" + (message + i) + "'");
        }



        channel.close();
        connection.close();

    }

}
