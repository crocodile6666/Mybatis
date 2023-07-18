package com.cn.mybatis.test;

import com.cn.mybatis.bean.Emp;
import com.cn.mybatis.mapper.EmpMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @title: PageHelperTest
 * @Description //TODO
 * @Author Crocodile
 * @Date: 2023/7/17 0017 16:59
 * @Version 1.0
 */
public class PageHelperTest {

    @Test
    public void testPageHelper() {
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//            Page<Object> page = PageHelper.startPage(2, 4);
            PageHelper.startPage(7, 4);
            List<Emp> empList = mapper.selectByExample(null);
            PageInfo<Emp> page = new PageInfo<>(empList, 5);
            System.out.println(page);
//            empList.forEach(emp -> System.out.println(emp));
//            System.out.println(page);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}