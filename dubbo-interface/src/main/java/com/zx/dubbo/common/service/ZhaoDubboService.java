package com.zx.dubbo.common.service;

import com.zx.dubbo.common.model.UserInfo;

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


    public UserInfo getUserInfo();


    String echo(String message);
}
