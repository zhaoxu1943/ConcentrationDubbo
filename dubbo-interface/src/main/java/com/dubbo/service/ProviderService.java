package com.dubbo.service;

import com.dubbo.model.UserInfo;

import java.util.HashMap;
import java.util.List;

/**
 * @author zhaoxu
 */
public interface ProviderService {

    /**
     * @author zhaoxu
     */
    public List<HashMap<String,String>> getHashMapInfo();


    public List<UserInfo> getUserInfo();
}
