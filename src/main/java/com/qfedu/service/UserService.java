package com.qfedu.service;

import com.qfedu.pojo.User;

/**
 * Created by Administrator on 2019/6/21 0021.
 */
public interface UserService {
    User findUser(String phone,String password);
}
