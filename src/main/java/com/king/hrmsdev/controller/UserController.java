package com.king.hrmsdev.controller;

import com.king.hrmsdev.entity.User;
import com.king.hrmsdev.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class UserController {


    @Resource
    private UserService userService;


    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> userList() {
        List<User> userlist = userService.findall();
        return userlist;
    }
}
