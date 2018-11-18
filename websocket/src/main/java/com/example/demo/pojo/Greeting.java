package com.example.demo.pojo;

import lombok.Data;

/**
 * Created by Kelly on 2018/11/18.
 */
@Data
public class Greeting {
    private String content;

    public Greeting() {
    }

    public Greeting(String content) {
        this.content = content;
    }
}
