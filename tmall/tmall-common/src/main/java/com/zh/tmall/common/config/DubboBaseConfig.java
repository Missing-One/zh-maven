package com.zh.tmall.common.config;

import com.alibaba.dubbo.config.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class DubboBaseConfig {

    // ******************************
    @Value("dubbo_app_name")
    private String APPLICATION_NAME = "dubbo-app";
    @Value("dubbo_registry_address")
    private String REGISTRY_ADDRESSES = "118.31.228.83:2181,118.31.228.83:2182,118.31.228.83:2183";
    //private final String APPLICATION_NAME = "";

    // ******************************


    /**
     * 应用名，用于计算依赖关系，不是匹配条件，不要与提供方一样
     */
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(APPLICATION_NAME);
        return applicationConfig;
    }
    /**
     * 使用zookeeper广播,注册中心暴露服务地址
     */
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress(REGISTRY_ADDRESSES);
//        registryConfig.setAddress("localhost:2181,localhost:2182,localhost:2183");
        registryConfig.setClient("curator");
        //registryConfig.setFile("/aa.cache");
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocol() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setPort(20880);
        return protocolConfig;
    }

    @Bean
    public MonitorConfig monitorConfig() {
        MonitorConfig mc = new MonitorConfig();
        mc.setProtocol("registry");
        return mc;
    }

    @Bean
    public ProviderConfig providerConfig() {
        ProviderConfig providerConfig = new ProviderConfig();
        providerConfig.setMonitor(monitorConfig());
        // 表示该服务使用独的五条条长连
        providerConfig.setConnections(5);
        // 固定大小线程池，启动时建立线程，不关闭，一直持有。(缺省)
        providerConfig.setThreadpool("fixed");
        // 配置重试次数，最好只用于读的重试，写操作可能会引起多次写入  默认retries="0"
        providerConfig.setRetries(0);
        // 提供方超时时间
        providerConfig.setTimeout(10000);
        // 提供方版本
        //providerConfig.setVersion("1.0");
        return providerConfig;
    }

    @Bean
    public ConsumerConfig consumerConfig() {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setMonitor(monitorConfig());
        consumerConfig.setTimeout(3000);
        consumerConfig.setCheck(false);
        return consumerConfig;
    }

    @Bean
    public ReferenceConfig referenceConfig() {
        ReferenceConfig referenceConfig = new ReferenceConfig();
        referenceConfig.setMonitor(monitorConfig());
        //referenceConfig.
        return referenceConfig;
    }





}
