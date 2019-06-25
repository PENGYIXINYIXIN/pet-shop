package com.qfedu.dao;

import com.qfedu.pojo.User;

/**
 * Created by Administrator on 2019/6/21 0021.
 */
public interface UserDao {
    User findByPhone(String phone);

    User findByPassword(User user);
}
