package com.example.producer;

import org.apache.activemq.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * Created by Kelly on 2018/11/15.
 */
public class ProducerServiceImpl implements ProducerService {
    @Autowired
    JmsTemplate jmsTemplate;

    @Resource(name = "queueDestination")
    Destination destination;

    public void sendMessage(String message){
        // 使用JMSTemplate发送消息
        jmsTemplate.send(destination, new MessageCreator() {
            // 创建一个消息
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage(message);
                //System.out.println("送消息"+ textMessage.getText());
                return (Message) textMessage;
            }
        });
        System.out.println("发送消息："+ message);
    }
}
