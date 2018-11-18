package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * Created by Kelly on 2018/11/18.
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

     public void configureMessageBroker(MessageBrokerRegistry config){
         config.enableSimpleBroker("/topic");
         config.setApplicationDestinationPrefixes("/app");
     }
    public void registerStompEndpoints(StompEndpointRegistry registry){
        registry.addEndpoint("/gs-guide-websocket").withSockJS();
    }










}
