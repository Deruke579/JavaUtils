package com.example.demo.pojo;

import lombok.Data;

/**
 * Created by Kelly on 2018/11/18.
 */
@Data
public class HelloMessage {

    private String name;

    public HelloMessage() {
    }

    public HelloMessage(String name) {
        this.name = name;
    }
}
