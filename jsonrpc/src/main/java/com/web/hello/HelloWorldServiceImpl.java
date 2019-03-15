package com.web.hello;

/**
 * Created by Kelly on 2019/1/30.
 */
public class HelloWorldServiceImpl implements HelloWorldService{

    int  count=0;

    public HelloWorldBean getDemoBean(String code, String msg) {

        System.out.println("HelloWorldBean get");

        HelloWorldBean bean1 = new HelloWorldBean();
        bean1.setCode(Integer.parseInt(code));
        bean1.setMsg(msg+",javaBean is fine!");
        return bean1;
    }

    //计算服务端count值与客户端传进来的code值的和
    public Integer getInt(Integer code) {
        return code+count;
    }

    //返回某种字符串操作的结果
    public String getString(String msg) {
        return msg+",server is fine!";
    }

    //服务端接受调用，执行某些业务动作。这里是count进行技术
    public void doSomething() {
        count++;
        System.out.println("do something"+"; count=>"+count);
    }

}
