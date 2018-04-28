package com.zh.tmall.admin.rpc;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@DubboComponentScan(basePackages = "com.tmall.admin.rpc.service.impl")
public class RpcServiceStart extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(RpcServiceStart.class);
    }
    // 不参与序列化
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





}
