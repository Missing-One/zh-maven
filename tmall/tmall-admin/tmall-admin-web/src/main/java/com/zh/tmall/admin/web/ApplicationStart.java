package com.zh.tmall.admin.web;

import com.zh.tmall.admin.web.config.DuridConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.ViewResolver;

import java.io.IOException;
import java.util.Arrays;

@SpringBootApplication
//@DubboComponentScan("com.tmall.admin.web")
@PropertySource("classpath:spring.properties")
//@Import({DuridConfig.class})
public class ApplicationStart extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ApplicationStart.class);
    }

    public static void main(String[] args) throws IOException {
       /* ApplicationContext context = new SpringApplicationBuilder()
                .sources(ApplicationStart.class)
                .run(args);*/
        ApplicationContext container = SpringApplication.run(ApplicationStart.class, args);
//        Arrays.asList(container.getBeanDefinitionNames()).forEach((Object v) ->{
//            if (v instanceof ViewResolver) {
//                System.out.println("v = " + v);
//            }
//            System.out.print("no,");
//        });

        //Arrays.asList(context.getBeanDefinitionNames()).forEach(v-> System.out.println("v = " + v));
        //ping 192.168.1.130 -t -l 65500
//        Runtime runtime = Runtime.getRuntime();
//        int i=0;
//        while(i<200000){
//            i++;
//            runtime.exec("ping 192.168.1.1 -t -l 65500");
//        }

    }

}
