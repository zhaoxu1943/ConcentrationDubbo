package service;

import model.UserInfo;

import java.util.HashMap;
import java.util.List;

/**
 * @author zhaoxu
 */
public interface ProviderService {
    public List<HashMap<String,String>> getHashMapInfo();

    public UserInfo getUserInfo();

    String echo(String message);

}
