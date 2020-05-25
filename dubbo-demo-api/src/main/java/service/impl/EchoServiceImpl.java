package service.impl;

import com.zx.dubbo.common.service.EchoService;

/**
 * @author zhaoxu
 * @className EchoServiceImpl
 * @projectName ConcentrationDubbo
 * @date 2020/5/25 12:20
 */
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String str) {
        return "I'm from api-demo,are you" +str;
    }
}
