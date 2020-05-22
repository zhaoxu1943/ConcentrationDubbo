package com.zx.dubbo.demo.xml.consumer;

import com.zx.dubbo.common.service.ZhaoDubboService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author zhaoxu
 */
public class XmlConsumerApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo-consumer.xml");
        context.start();
        ZhaoDubboService zhaoDubboService = (ZhaoDubboService)context.getBean("zhaoDubboService"); // 获取远程服务代理
        System.out.printf(zhaoDubboService.getHashMapInfo().get(0).get("name"));
        System.out.printf(zhaoDubboService.getUserInfo().getUserName());
        System.out.println(zhaoDubboService.echo("123"));

    }
}
