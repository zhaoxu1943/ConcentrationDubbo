package com.zhaoxu;


import com.zhaoxu.config.DubboConsumerConfig;
import com.zhaoxu.consumer.EchoConsumer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @author zhaoxu
 * @className AnnotationConsumer
 * @projectName ConcentrationDubbo
 * @date 2020/5/21 12:22
 */
public class AnnotationConsumer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DubboConsumerConfig.class);
        context.start();
        EchoConsumer echoConsumer = (EchoConsumer) context.getBean(EchoConsumer.class);
        echoConsumer.testAnnotationCallDubbo("zhaoxu");

    }
}
