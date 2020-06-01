package com.rabbitmq.study;

import com.rabbitmq.client.ConnectionFactory;

/**
 * Created by duanxiangchao on 2019/12/10
 */
public class CommonConnection {

    public static ConnectionFactory getFactory(){
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("49.233.172.25");
        connectionFactory.setUsername("guest");
        connectionFactory.setPassword("guest");
        return connectionFactory;
    }

}
