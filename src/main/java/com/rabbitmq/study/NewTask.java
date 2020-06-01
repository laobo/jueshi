package com.rabbitmq.study;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Created by duanxiangchao on 2018/5/23
 */
public class NewTask {

    private final static String QUEUE_NAME = "task_queue";


    public static void main(String[] args) throws IOException, TimeoutException {

        ConnectionFactory connectionFactory = new ConnectionFactory();

        Connection connection = connectionFactory.newConnection();

        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        String[] messages = {"1......", "2", "3...", "4", "5.....", "6", "7.......", "8........", "9.........", "10.........."};

        for(String str: messages){
            channel.basicPublish("", QUEUE_NAME, null, str.getBytes("UTF-8"));
            System.out.println("[x] Sent '" + str + "'");
        }

        channel.close();

        connection.close();
    }

}