package com.cn.mybatis.mapper;

import com.cn.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @title: SQLMapper
 * @Description //TODO
 * @Author Crocodile
 * @Date: 2023/7/17 0017 8:39
 * @Version 1.0
 */
public interface SQLMapper {

    List<User> getUserByLike(@Param("username")String username);

    int deleteMore(@Param("ids") String ids);

    List<User> getUserByTableName(@Param("tableName") String tableName);

    void insertUser(User user);
}
