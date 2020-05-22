package com.zx.dubbo.demo.anno.provider;

import com.zx.dubbo.demo.anno.provider.config.DubboConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 配置一个注解方式的dubbo客户端
 * 1.编写通用接口,如本demo中的service.EchoService,实际中会把这些通用接口抽离出来供统一引用
 * 2.在provider中编写接口实现类,EchoServiceImpl,实现接口方法,并打上dubbo的@service注解将其提升为Bean
 * 3.添加配置信息,其实还是spring.xml中配置的东西,这里使用@Configuration代码配置,见dubboConfig
 * 4.启动springIOC上下文,执行Bean的加载
 *
 * @author zhaoxu
 * @className AnnotationProvider
 * @projectName ConcentrationDubbo
 * @date 2020/5/20 12:15
 */
public class AnnotationProviderApplication {
    public static void main(String[] args) throws  Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DubboConfig.class);
        context.start();
        System.in.read();
    }
}
