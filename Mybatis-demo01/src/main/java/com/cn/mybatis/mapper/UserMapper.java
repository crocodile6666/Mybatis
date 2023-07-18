package com.cn.mybatis.mapper;

import com.cn.mybatis.pojo.User;

import java.util.List;

/**
 * @title: UserMapper
 * @Description //TODO 
 * @Author Crocodile
 * @Date: 2023/7/16 0016 10:26
 * @Version 1.0
 */
public interface UserMapper {

    int insertUser();

    int updateUser();
    int deleteUser();

    User getUserById();

    List<User> getAllUser();
}
