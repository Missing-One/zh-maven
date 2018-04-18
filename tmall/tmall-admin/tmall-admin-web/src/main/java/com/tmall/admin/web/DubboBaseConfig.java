package com.tmall.admin.web;

import com.alibaba.dubbo.config.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboBaseConfig {
    /**
     * 消费方应用名，用于计算依赖关系，不是匹配条件，不要与提供方一样
     */
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubboApp");
        return applicationConfig;
    }
    /**
     * 使用zookeeper广播注册中心暴露服务地址
     */
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("192.168.1.130:2181,192.168.1.130:2182,192.168.1.130:2183");
        registryConfig.setClient("curator");
        return registryConfig;
    }

    @Bean
    public ConsumerConfig consumerConfig() {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setTimeout(3000);
        return consumerConfig;
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
        //providerConfig.setMonitor(monitorConfig());
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
    public ReferenceConfig referenceConfig() {
        ReferenceConfig referenceConfig = new ReferenceConfig();
        referenceConfig.setMonitor(monitorConfig());
        //referenceConfig.
        return referenceConfig;
    }





}
