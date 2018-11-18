package com.example.demo.controller;

import com.example.demo.pojo.Greeting;
import com.example.demo.pojo.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.HtmlUtils;

/**
 * Created by Kelly on 2018/11/18.
 */
@Controller
public class GreetingController {

//    @GetMapping("/greeting")
//    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
//        model.addAttribute("name", name);
//        return "greeting";
//    }
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message)throws Exception{
        Thread.sleep(1000);
        return new Greeting("Hello,"+ HtmlUtils.htmlEscape(message.getName())+"!");
    }




}
