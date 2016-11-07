package com.activitymq;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by duanxiangchao on 2015/6/16.
 */
public class Receiver {

    public static void main(String [] str){

        ConnectionFactory connectionFactory;
        Connection connection;
        Session session;
        Destination destination;
        //消费者
        MessageConsumer consumer;
        connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,
                ActiveMQConnection.DEFAULT_PASSWORD,"tcp://localhost:61616");
        try {
            connection = connectionFactory.createConnection();
            connection.start();
            session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
            destination = session.createQueue("firstQueue");
            consumer = session.createConsumer(destination);
            while (true){
                //设置接收消息的时间，设定为100s
                TextMessage message = (TextMessage) consumer.receive(100000);
                if(null != message){
                    System.out.println("收到消息：" + message.getText());
                }
            }
        } catch (JMSException e) {
            e.printStackTrace();
        }

    }

}
