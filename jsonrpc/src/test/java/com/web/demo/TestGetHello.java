package com.web.demo;

import com.googlecode.jsonrpc4j.JsonRpcHttpClient;
import com.web.model.User;
import org.junit.Test;


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

    @Test
    public void testPostUser() {
        try {
            JsonRpcHttpClient client = new JsonRpcHttpClient(new URL("http://localhost:8080/UserService.json"));
//            String result = client.invoke("createUser", new Object[]{"王五", "赵六"}, new User("","",""));
//            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testPost1() {
        try {
            JsonRpcHttpClient client = new JsonRpcHttpClient(new URL("http://localhost:8080/UserService.json"));
//            String[] params = new String[] { String.valueOf(1), "ffffffff" };
            String result = client.invoke("createUser", new Object[]{"王五","fff"}, String.class);
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPost2() {
        try {
            JsonRpcHttpClient client = new JsonRpcHttpClient(new URL("http://localhost:8080/UserService.json"));
//            String[] params = new String[] { String.valueOf(1), "ffffffff" };
            String result = client.invoke("createUser", new Object[]{"王五","fff","ffffff"}, String.class);
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }


}
