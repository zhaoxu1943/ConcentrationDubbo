package com.zx.dubbo.demo.xml.provider.service.impl;

import com.alibaba.dubbo.rpc.RpcContext;
import com.zx.dubbo.common.model.UserInfo;
import com.zx.dubbo.common.service.ZhaoDubboService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author zhaoxu
 */
public class ZhaoDubboServiceImpl implements ZhaoDubboService {

    @Override
    public List<HashMap<String, String>> getHashMapInfo() {
        HashMap<String,String> hashMap1= new HashMap<String, String>(1);
        hashMap1.put("name","RPC call 成功!");
        hashMap1.put("job","java");


        HashMap<String,String> hashMap2 = new HashMap<String, String>(1);
        hashMap2.put("name","fafu");
        hashMap2.put("job","go");

        List<HashMap<String, String>> result = new ArrayList<HashMap<String, String>>();
        result.add(hashMap1);
        result.add(hashMap2);

        return result;
    }

    @Override
    public UserInfo getUserInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(1);
        userInfo.setUserName("test@");
        return userInfo;


    }


    @Override
    public String echo(String message) {
        System.out.println(RpcContext.getContext().getRemoteAddress());
        return "wo diao ni ma de !"+message;
    }
}
