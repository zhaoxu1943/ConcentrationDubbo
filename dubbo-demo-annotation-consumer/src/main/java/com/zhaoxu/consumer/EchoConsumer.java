package com.zhaoxu.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhaoxu.service.EchoService;

import org.springframework.stereotype.Component;


/**
 *
 * 通过注解使用Dubbo的服务,一个Reference即可
 * @author zhaoxu
 * @className EchoConsumer
 * @projectName ConcentrationDubbo
 * @date 2020/5/21 12:19
 */
@Component
public class EchoConsumer {

    @Reference
    EchoService echoService;

    public void testAnnotationCallDubbo (String str) {
        System.out.println(echoService.echo(str));
    }




}
