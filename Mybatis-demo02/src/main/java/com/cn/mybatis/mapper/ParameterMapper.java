package com.cn.mybatis.mapper;

import com.cn.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @title: ParameterMapper
 * @Description //TODO
 * @Author Crocodile
 * @Date: 2023/7/16 0016 16:26
 * @Version 1.0
 */

public interface ParameterMapper {

    List<User> getAllUser();

    User getUserByUsername(String username);

    User checkLogin(@Param("username")String username, @Param("password")String password);

    User checkLoginByMap(Map<String, Object> map);

    int insertUser(User user);
}