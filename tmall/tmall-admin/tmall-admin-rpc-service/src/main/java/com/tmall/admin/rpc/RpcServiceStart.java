package com.tmall.admin.rpc;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import javafx.scene.Parent;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import javax.xml.ws.RequestWrapper;

@SpringBootApplication
@DubboComponentScan(basePackages = "com.tmall.admin.rpc.service.impl")
public class RpcServiceStart {
    String index(){return "index";}
    transient int i =0;
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(RpcServiceStart.class)
                .properties("server.port:8081")
                //关闭启动标识
                //如果想自定义标识,在src/main/resources路径下新建一个banner.txt文件,并输入想要的内容即可
                //在线生成图案的网站 <a>http://patorjk.com/software/taag/</a>
                .bannerMode(Banner.Mode.OFF)
                .run(args);

        //SpringApplication.run(RpcServiceStart.class, args);
    }

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo");
        return applicationConfig;
    }

    // @Bean
    public ProviderConfig providerConfig() {
        ProviderConfig providerConfig = new ProviderConfig();
        // 表示该服务使用独的五条条长连
        providerConfig.setConnections(5);
        // 固定大小线程池，启动时建立线程，不关闭，一直持有。(缺省)
        providerConfig.setThreadpool("fixed");
        // 配置重试次数，最好只用于读的重试，写操作可能会引起多次写入  默认retries="0"
        providerConfig.setRetries(0);
        // 提供方超时时间
        providerConfig.setTimeout(10000);
        // 提供方版本
        providerConfig.setVersion("1.0");
        return providerConfig;
    }

    /**
     * zookeeper注册中心配置
     */
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("192.168.1.130:2181,192.168.1.130:2182,192.168.1.130:2183");
        registryConfig.setClient("curator");
        return registryConfig;
    }



}
