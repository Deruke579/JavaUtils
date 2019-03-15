package com.web.demo;

/**
 * Created by Kelly on 2019/1/30.
 */
public class TestManagerImpl implements TestManager{
    public String hello() {
        return "hello";
    }
    public String helloName(String name, String content) {
        return "name：" + name + "，content：" + content;
    }

}
