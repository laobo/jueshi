package com.activitymq;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by duanxiangchao on 2015/6/16.
 */
public class Sender {

    private static final int SEND_NUMBER =5;

    public static void main(String [] arg){

        //连接工厂
        ConnectionFactory connectionFactory;
        //连接
        Connection connection;
        //回话
        Session session;
        //消息目的地
        Destination destination;
        //消息发送者
        MessageProducer messageProducer;
        //构造ConnectionFactory的实例对象，这里采用ActiveMq的jar
        connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,
                ActiveMQConnection.DEFAULT_PASSWORD,"tcp://localhost:61616");

        try {
            //得到连接对象
            connection = connectionFactory.createConnection();
            //启动
            connection.start();
            //获取操作连接
            session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
            //消息的目的地，发送给谁
            destination = session.createQueue("firstQueue");
            //得到消息的生成者  发送者
            messageProducer = session.createProducer(destination);
            //设置不持久化
            messageProducer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
            sendMessage(session, messageProducer);
            session.commit();
        } catch (JMSException e) {
            e.printStackTrace();
        }

    }

    public static void sendMessage(Session session,MessageProducer producer) throws JMSException {
        for(int i = 1 ; i<=SEND_NUMBER; i++){
            TextMessage message = session.createTextMessage("ActiveMq 发送的消息" + i);
            System.out.println("发送消息：" + "ActiveMq 发送的消息" + i);
            producer.send(message);
        }
    }

}
