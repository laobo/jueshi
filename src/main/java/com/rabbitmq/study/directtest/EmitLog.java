package com.rabbitmq.study.directtest;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import static com.rabbitmq.study.directtest.LogTypeEnum.ERROR;
import static com.rabbitmq.study.directtest.LogTypeEnum.INFO;
import static com.rabbitmq.study.directtest.LogTypeEnum.WARING;

/**
 * Created by duanxiangchao on 2018/5/23
 */
public class EmitLog {

    private static final String EXCHANGE_NAME = "direct_logs";

    public static void main(String[] args) throws IOException, TimeoutException {

        ConnectionFactory connectionFactory = new ConnectionFactory();

        Connection connection = connectionFactory.newConnection();

        Channel channel = connection.createChannel();

        // 声明路由和路由类型
        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);

        LogTypeEnum[] logTypeEnums = {INFO, ERROR, WARING, INFO, ERROR, WARING,};

        String message = "msg...";

        for(LogTypeEnum logTypeEnum: logTypeEnums){
            channel.basicPublish(EXCHANGE_NAME, logTypeEnum.getValue(), null, logTypeEnum.getValue().getBytes("UTF-8"));
            System.out.println("[x] Sent message: " + logTypeEnum.getValue());
        }

        channel.close();
        connection.close();

    }

}
