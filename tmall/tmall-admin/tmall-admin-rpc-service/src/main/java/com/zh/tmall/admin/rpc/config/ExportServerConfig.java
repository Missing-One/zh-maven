package com.zh.tmall.admin.rpc.config;

import com.zh.tmall.common.config.DubboBaseConfig;
import org.springframework.context.annotation.Configuration;

/**
 * 生产者输出配置
 *
 */
@Configuration
public class ExportServerConfig extends DubboBaseConfig {
    /*@Bean
    public ServiceBean<Person> personServiceExport(Person person) {
        ServiceBean<Person> serviceBean = new ServiceBean<Person>();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion("myversion");
        serviceBean.setInterface(Person.class.getName());
        serviceBean.setRef(person);
        serviceBean.setTimeout(5000);
        serviceBean.setRetries(3);
        return serviceBean;
    }*/
}
