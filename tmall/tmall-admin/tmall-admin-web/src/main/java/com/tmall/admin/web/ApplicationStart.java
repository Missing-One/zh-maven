package com.tmall.admin.web;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
@DubboComponentScan("com.tmall.admin.web")
@Import(value = {RefConfig.class})
public class ApplicationStart {
    public static void main(String[] args) {
       /* ApplicationContext context = new SpringApplicationBuilder()
                .sources(ApplicationStart.class)
                .run(args);*/
        SpringApplication.run(ApplicationStart.class, args);

        //Arrays.asList(context.getBeanDefinitionNames()).forEach(v-> System.out.println("v = " + v));
        
    }

}
