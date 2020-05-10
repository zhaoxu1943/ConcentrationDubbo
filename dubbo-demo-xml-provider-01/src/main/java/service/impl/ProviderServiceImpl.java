package service.impl;


import model.UserInfo;
import service.ProviderService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author zhaoxu
 */
public class ProviderServiceImpl implements ProviderService {

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

    public UserInfo getUserInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(1);
        userInfo.setUserName("发财");
        return userInfo;


    }





}
