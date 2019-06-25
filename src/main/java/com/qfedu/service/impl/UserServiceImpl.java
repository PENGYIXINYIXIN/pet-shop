package com.qfedu.service.impl;


import com.qfedu.dao.UserDao;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import com.qfedu.vo.JsonBean;
import com.qiniu.util.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl  implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public JsonBean findUser(User user) {
        User user1=userDao.findByPhone(user.getPhone());
        Map<String,Object> map= new HashMap<>();
        if(user1!=null){
            User user2 =userDao.findByPassword(user);
            if(user2!=null){
                return new JsonBean(1,user2.getId());
            }else{
                return new JsonBean(0,"密码错误");
            }
        }
        return new JsonBean(0,"账号不存在");
    }
}