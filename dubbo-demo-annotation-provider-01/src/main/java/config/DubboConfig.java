package config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhaoxu
 * @className DubboConfig
 * @projectName ConcentrationDubbo
 * @date 2020/5/20 12:17
 */
@Configuration
@EnableDubbo(scanBasePackages = "service")
public class DubboConfig {


    /**
     * dubbo服务提供者的配置文件,配置了provider方的信息
     * @author zhaoxu
     * @param
     * @return
     * @throws
     */
    @Bean
    public ProviderConfig providerConfig() {
        return new ProviderConfig();
    }




    /**
     * 应用名称
     * @author zhaoxu
     * @param
     * @return
     * @throws
     */
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("echo-annotation-provider-01");
        return applicationConfig;
    }



    /**
     * 设置注册中心
     * @author zhaoxu
     * @param
     * @return
     * @throws
     */
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("localhost");
        registryConfig.setPort(2181);
        return registryConfig;
    }




    /**
     * 设置协议和端口
     * @author zhaoxu
     * @param
     * @return
     * @throws
     */
    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20881);
        return protocolConfig;
    }
}
