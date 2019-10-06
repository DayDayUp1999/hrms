package com.king.hrmsdev.service;


import com.king.hrmsdev.entity.User;
import com.king.hrmsdev.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserService {
    @Resource
    private UserMapper UserMapper;

    public User loginCheck(String username){
        User user = UserMapper.loginCheck(username);
        return user;
    }

    public List<User> findall(){
        List<User> userList = UserMapper.findall();
        return userList;
    }
}
