package com.tmall.admin.rpc.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tmall.admin.rpc.api.TestRpcApi;
import org.springframework.stereotype.Component;

@Component
@Service(version = "1.0.0")
public class TestRpcApiService implements TestRpcApi {
    @Override
    public String hello() {
        return "hello rpc";
    }
}
