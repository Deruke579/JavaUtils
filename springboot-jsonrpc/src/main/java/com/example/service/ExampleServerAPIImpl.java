package com.example.service;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.stereotype.Service;

/**
 * Created by Kelly on 2019/1/30.
 */
@Service
@AutoJsonRpcServiceImpl
public class ExampleServerAPIImpl  implements ExampleServerAPI{

    public int multiplier(int a, int b) {
        return a * b;
    }
}
