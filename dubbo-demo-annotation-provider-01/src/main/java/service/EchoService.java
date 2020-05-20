package service;

/**
 * @author zhaoxu
 * @className EchoService
 * @projectName ConcentrationDubbo
 * @date 2020/5/20 12:08
 */
public interface EchoService {

    /**
     * dubbo测试方法,返回字符串
     * @author zhaoxu
     * @param str
     * @return  String
     */
    String echo(String str);


}
