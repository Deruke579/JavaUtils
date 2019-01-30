package com.web.demo;

import com.googlecode.jsonrpc4j.JsonRpcHttpClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

/**
 * Created by Kelly on 2019/1/30.
 */
//@RunWith(SpringRunner.class)
public class TestGetHello {

    @Test
    public void test(){
//        String url = "http://localhost/test.json?method=hello&id=1";
//        String result = HttpUtil.get(url);
//        System.out.println(result);
    }

    @Test
    public void testPost() {
        try {
            JsonRpcHttpClient client = new JsonRpcHttpClient(new URL("http://localhost:8080/test.json"));
            String result = client.invoke("helloName", new Object[]{"王五", "赵六"}, String.class);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
