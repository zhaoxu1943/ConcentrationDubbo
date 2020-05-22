package com.zx.dubbo.service;



import com.zx.dubbo.model.UserInfo;

import java.util.HashMap;
import java.util.List;

/**
 * @author zhaoxu
 */
public interface ZhaoDubboService {

    /**
     * @author zhaoxu
     */
    public List<HashMap<String,String>> getHashMapInfo();


    public List<UserInfo> getUserInfo();
}
