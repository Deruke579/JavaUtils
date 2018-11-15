package com.example.producer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Kelly on 2018/11/15.
 */
public class Appconsumer {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");



    }
}
