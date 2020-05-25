import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.zx.dubbo.common.service.EchoService;
import service.impl.EchoServiceImpl;

import java.lang.ref.Reference;

/**
 * Dubbo原生API方式,构建provider
 * @author zhaoxu
 * @className DubboApiApplication
 * @projectName ConcentrationDubbo
 * @date 2020/5/25 12:12
 */
public class DubboApiConsumer {
    public static void main(String[] args) throws Exception {
        ReferenceConfig<EchoService> reference = new ReferenceConfig<>();
        //名称
        reference.setApplication(new ApplicationConfig("dubbo-demo-api-consumer"));
        //注册中心
        reference.setRegistry(new RegistryConfig("zookeeper://127.0.0.1:2181"));
        //接口
        reference.setInterface(EchoService.class);

        //使用
        EchoService echoService = reference.get();
        String message = echoService.echo(" zhaoxu");
        System.out.println(message);



    }
}
