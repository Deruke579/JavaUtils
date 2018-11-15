package com.example.demo;

import org.apache.activemq.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;
import java.util.Map;

/**
 * Created by Kelly on 2018/11/15.
 */
@Component
public class Producer {
    @Autowired
    JmsTemplate jmsTemplate;

    public void sendMessage(final String queueName, final String message) {

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
