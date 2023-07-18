package com.cn.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @title: SqlSessionUtils
 * @Description //TODO
 * @Author Crocodile
 * @Date: 2023/7/16 0016 16:48
 * @Version 1.0
 */
public class SqlSessionUtils {

    public static SqlSession getSqlSession() {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            return sqlSession;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}