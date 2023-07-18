package com.cn.mybatis.test;

import com.cn.mybatis.mapper.SQLMapper;
import com.cn.mybatis.pojo.User;
import com.cn.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @title: SQLMapperTest
 * @Description //TODO
 * @Author Crocodile
 * @Date: 2023/7/17 0017 8:42
 * @Version 1.0
 */
public class SQLMapperTest {

    @Test
    public void testGetUserByLike() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        System.out.println(mapper.getUserByLike("五"));
    }

    @Test
    public void testDeleteMore() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        System.out.println(mapper.deleteMore("1,2,3,4"));
    }

    @Test
    public void testGetUserByTableName() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        System.out.println(mapper.getUserByTableName("t_user"));
    }

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        User user = new User(null, "赵六", "123456", 24, "男", "zhaoliu@163.com");
        mapper.insertUser(user);
        System.out.println(user);
    }
}