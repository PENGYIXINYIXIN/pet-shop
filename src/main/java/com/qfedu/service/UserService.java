package com.qfedu.service;

import com.qfedu.pojo.User;
import com.qfedu.vo.JsonBean;

import java.util.Map;

/**
 * Created by Administrator on 2019/6/21 0021.
 */
public interface UserService {
    JsonBean findUser(User user);
}
