package com.dxc.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by duanxiangchao on 2018/5/25
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:/spring-beans.xml")
public class MessageSendTest {

    @Resource
    private AmqpTemplate amqpTemplate;

    @Test
    public void testSendMessage() {
        amqpTemplate.convertAndSend("direct-exchange", "error", "I am error message!");
        amqpTemplate.convertAndSend("direct-exchange", "warning", "I am warning message!");
        amqpTemplate.convertAndSend("direct-exchange", "info", "I am info message!");
    }
}
