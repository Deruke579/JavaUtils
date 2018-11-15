package com.example.demo;

import org.apache.activemq.Message;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;

import static org.junit.Assert.*;

/**
 * Created by Kelly on 2018/11/15.
 */
public class ProducerTest extends ActivemqApplicationTests{
    @Autowired
    JmsTemplate jmsTemplate;

    @Test
    public void testSendMessage() throws Exception {
        String queueName = "queue2";
        final String textMessage = "Hello";
        System.out.println("Sending message " + textMessage + "to queue - " + queueName);
        jmsTemplate.send(queueName, new MessageCreator() {

            public Message createMessage(Session session) throws JMSException {
                TextMessage message = session.createTextMessage();
                message.setText(textMessage);
                return (Message) message;
            }
        });
    }
}