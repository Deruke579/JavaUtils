package com.web.hello;

import com.googlecode.jsonrpc4j.JsonRpcServer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Kelly on 2019/1/30.
 */
public class JsonRpcService extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private JsonRpcServer rpcServer = null;

    public JsonRpcService() {
        super();

        //服务端生成HelloWorldServiceImpl对象，并且提供对应的方法
//        rpcServer = new JsonRpcServer(new HelloWorldServiceImpl(), HelloworldService.class );
    }

//    @Override
//    protected void service(HttpServletRequest request,
//                           HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("JsonRpcService service being call");
//        rpcServer.handle(request, response);
//    }

}
