package com.zh.tmall.admin.web.controller;

import com.zh.tmall.admin.rpc.api.TestRpcApi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Controller
public class TestRpcController {

    //@Reference(version = "1.0.0")
    TestRpcApi testRpcApi;

    @RequestMapping("/in")
    String index(){
        System.out.println("controller:dubbo" + testRpcApi);
        if (testRpcApi != null) {
            System.out.println("testRpcApi say:" + testRpcApi.hello());
        }
        //System.out.println("refService = " + refService.say());
        return "index";
    }
    @RequestMapping("/{data}")
    String data(@PathVariable String data){
        return  data;
    }
    @RequestMapping("/index")
    String inde(){
        return "index";
    }

    @RequestMapping("/template")
    String temp(Model model){
        List<String> ls = Arrays.asList(new String[]{"a", "b", "c", "d", "e", "f"});
        model.addAttribute("array",ls);
        return "template";
    }
}
