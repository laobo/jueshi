package com.rabbitmq.spring;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

/**
 * Created by duanxiangchao on 2018/5/25
 */
@Service
public class ErrorLogConsumer implements MessageListener {

    public void onMessage(Message message) {

        try {
            String msg = new String(message.getBody(), "UTF-8");
            System.out.println("ErrorLogConsumer消费消息：" + msg);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
