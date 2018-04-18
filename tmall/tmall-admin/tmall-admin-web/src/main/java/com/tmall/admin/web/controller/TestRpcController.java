package com.tmall.admin.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tmall.admin.rpc.api.TestRpcApi;
import com.tmall.admin.web.service.RefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestRpcController {

    @Autowired
    RefService refService;

    @Reference(version = "1.0.0")
    TestRpcApi testRpcApi;

    @RequestMapping("/in")
    public String index(){
        System.out.println("controller:dubbo" + testRpcApi);
        System.out.println("testRpcApi = " + refService.say());return "index";}
}
