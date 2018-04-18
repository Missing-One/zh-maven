package com.tmall.admin.web.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tmall.admin.rpc.api.TestRpcApi;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RefService {

    @Reference(version = "1.0.0")
    TestRpcApi testRpcApi;

    public String say(){
        //Optional.of(testRpcApi).orElse();
        System.out.println("testRpcApi = " + testRpcApi);
        return "";
    }
}
