package com.web.quartz;

import java.util.Date;

/**
 * Created by Kelly on 2019/1/31.
 */
public class JobDemo2 {

    public void sayHello(){
        System.out.println(new Date() + " -> Hello,任务二");
    }
}
