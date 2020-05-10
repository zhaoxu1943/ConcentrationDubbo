import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhaoxu
 */
public class Application {


    public static void main(String[] args) throws Exception{

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo-provider.xml");
        context.start();
        System.in.read(); // 按任意键退出
    }
}
