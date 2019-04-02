package com.example.service;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;

/**
 * Created by Kelly on 2019/1/30.
 */
@JsonRpcService("/calculator")
public interface ExampleServerAPI {
    int multiplier(@JsonRpcParam(value = "a") int a, @JsonRpcParam(value = "b") int b);
}
