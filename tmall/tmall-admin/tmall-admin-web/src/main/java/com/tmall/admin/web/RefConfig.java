package com.tmall.admin.web;

import com.alibaba.dubbo.config.spring.ReferenceBean;
import com.tmall.admin.rpc.api.TestRpcApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 消费者
 */
@Configuration
public class RefConfig extends DubboBaseConfig{

    @Bean
    public ReferenceBean<TestRpcApi> person() {
        ReferenceBean<TestRpcApi> ref = new ReferenceBean<>();
        ref.setInterface(TestRpcApi.class);
        //ref.setInterface("testRpcApi");
        ref.setTimeout(5000);
        ref.setRetries(3);
        ref.setCheck(false);
        return ref;
    }
}
