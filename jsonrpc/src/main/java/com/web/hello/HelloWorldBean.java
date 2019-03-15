package com.web.hello;

import java.io.Serializable;

/**
 * Created by Kelly on 2019/1/30.
 */
public class HelloWorldBean implements Serializable {
    private static final long serialVersionUID = -12345L;
    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
