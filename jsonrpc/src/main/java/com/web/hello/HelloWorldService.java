package com.web.hello;

/**
 * Created by Kelly on 2019/1/30.
 */
public interface HelloWorldService {

    public HelloWorldBean getDemoBean(String code, String msg);

    public Integer getInt(Integer code);

    public String getString(String msg);

    public void doSomething();

}
