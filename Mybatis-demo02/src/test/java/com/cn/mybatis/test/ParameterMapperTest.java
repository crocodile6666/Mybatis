package com.cn.mybatis.test;

import com.cn.mybatis.mapper.ParameterMapper;
import com.cn.mybatis.pojo.User;
import com.cn.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @title: ParameterMapperTest
 * @Description //TODO
 * @Author Crocodile
 * @Date: 2023/7/16 0016 16:31
 * @Version 1.0
 */
public class ParameterMapperTest {

    @Test
    public void testGetAllUser() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> userList = mapper.getAllUser();
        userList.forEach(user -> System.out.println(user));
    }

    @Test
    public void testGetUserByUsername() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.getUserByUsername("李四");
        System.out.println(user);
    }

    @Test
    public void testCheckLogin() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.checkLogin("李四", "123");
        System.out.println(user);
    }

    @Test
    public void testCheckLoginByMap() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username", "李四");
        map.put("password", "123");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);
    }

    @Test
    public void testInsertUser() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        int result = mapper.insertUser(new User(null, "王五", "123", 23, "男", "wangwu@163.com"));
        System.out.println(result);
    }
}