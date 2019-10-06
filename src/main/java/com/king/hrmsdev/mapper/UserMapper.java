package com.king.hrmsdev.mapper;

import com.king.hrmsdev.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {
    public User loginCheck(String username);
    public List<User> findall();
}
