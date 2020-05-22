package com.zx.dubbo.demo.anno.consumer.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhaoxu
 * @className DubboConsumerConfig
 * @projectName ConcentrationDubbo
 * @date 2020/5/21 12:25
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.zx.dubbo.demo.anno.consumer")
@ComponentScan("com.zx.dubbo.demo.anno.consumer")
public class DubboConsumerConfig {

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-demo-annotation-consumer");
        return  applicationConfig;
    }


    @Bean
    public ConsumerConfig consumerConfig() {
        return new ConsumerConfig();
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("localhost");
        registryConfig.setPort(2181);
        return  registryConfig;
    }


}
