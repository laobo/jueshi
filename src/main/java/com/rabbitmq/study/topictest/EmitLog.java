package com.rabbitmq.study.topictest;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.study.directtest.LogTypeEnum;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import static com.rabbitmq.study.directtest.LogTypeEnum.*;

/**
 * Created by duanxiangchao on 2018/5/23
 * # 代表任意单词
 * * 代表一个单词
 */
public class EmitLog {

    private static final String EXCHANGE_NAME = "topic_logs";

    public static void main(String[] args) throws IOException, TimeoutException {

        ConnectionFactory connectionFactory = new ConnectionFactory();

        Connection connection = connectionFactory.newConnection();

        Channel channel = connection.createChannel();

        // 声明路由和路由类型
        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.TOPIC);

        String[] strings = {"kern.critical", "kern.info", "kern.warn", "auth.critical", "cron.warn", "cron.critical"};

        String message = "msg...";

        for(String str: strings){
            channel.basicPublish(EXCHANGE_NAME, str, null, str.getBytes("UTF-8"));
            System.out.println("[x] Sent message: " + str);
        }

        channel.close();
        connection.close();

    }

}
