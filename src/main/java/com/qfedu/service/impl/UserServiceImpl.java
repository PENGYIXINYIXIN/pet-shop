package com.qfedu.service.impl;


import com.qfedu.dao.UserDao;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public User findUser(String phone, String password) {
        userDao.findByPhone(phone);
        return null;
    }
}