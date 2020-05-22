package com.zx.dubbo.demo.anno.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zx.dubbo.common.service.EchoService;


/**
 * @author zhaoxu
 * @className EchoServiceImpl
 * @projectName ConcentrationDubbo
 * @date 2020/5/20 12:09
 */
//dubbo的@service注解,和spring的区分
//使用dubbo的@service之后,由dubbo服务将这个实现类注册为spring的bean,与xml时结果一样
//并且负责配置的初始化和服务暴露
@Service
public class EchoServiceImpl implements EchoService {

    public String echo(String str) {
        return "you say"+ str+"?";
    }
}
