import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ProviderService;

/**
 * @author zhaoxu
 */
public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo-consumer.xml");
        context.start();
        ProviderService demoService = (ProviderService)context.getBean("provideService"); // 获取远程服务代理
        System.out.printf(demoService.getHashMapInfo().get(0).get("name"));
        System.out.printf(demoService.getUserInfo().getUserName());
        System.out.println(demoService.echo("123"));

    }
}
