package com.cn.mybatis.mapper;

import com.cn.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @title: SelectMapper
 * @Description //TODO
 * @Author Crocodile
 * @Date: 2023/7/17 0017 8:05
 * @Version 1.0
 */
public interface SelectMapper {

    List<User> getUserById(@Param("id") Integer id);

    List<User> getAllUser();

    Integer getCount();

    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

//    List<Map<String, Object>> getAllUserToMap();

    @MapKey("id")
    Map<String, Object> getAllUserToMap();
}
