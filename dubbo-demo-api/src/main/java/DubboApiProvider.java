import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.zx.dubbo.common.service.EchoService;
import service.impl.EchoServiceImpl;

/**
 * Dubbo原生API方式,构建provider
 * @author zhaoxu
 * @className DubboApiApplication
 * @projectName ConcentrationDubbo
 * @date 2020/5/25 12:12
 */
public class DubboApiProvider {
    public static void main(String[] args) throws Exception {
        ServiceConfig<EchoService>  service= new ServiceConfig<>();
        //还是老四样
        //第一样:设置Application名称
        service.setApplication(new ApplicationConfig("dubbo-demo-api-provider"));
        //第二样:协议dubbo和端口
        //service.setProtocol(new ProtocolConfig("dubbo",28880));
        //第三样:注册中心
        service.setRegistry(new RegistryConfig("zookeeper://127.0.0.1:2181"));
        //第四:设置端口和暴露的实现类
        service.setInterface(EchoService.class);
        service.setRef(new EchoServiceImpl());

        //暴露服务
        service.export();
        System.in.read();


    }
}
