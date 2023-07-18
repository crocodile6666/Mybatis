package com.cn.mybatis.test;

import com.cn.mybatis.bean.Emp;
import com.cn.mybatis.bean.EmpExample;
import com.cn.mybatis.mapper.EmpMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @title: MBGTest
 * @Description //TODO
 * @Author Crocodile
 * @Date: 2023/7/17 0017 16:39
 * @Version 1.0
 */
public class MBGTest {

    @Test
    public void testMBG() {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            /*List<Emp> emps = mapper.selectByExample(null);
            emps.forEach(emp -> System.out.println(emp));*/
            /*EmpExample example = new EmpExample();
            example.createCriteria().andEmpNameEqualTo("a1").andSexEqualTo("男");
            example.or().andEmailEqualTo("123@qq.com");
            List<Emp> empList = mapper.selectByExample(example);
            empList.forEach(emp -> System.out.println(emp));*/
            mapper.updateByPrimaryKeySelective(new Emp(11, "aa", 24, null, "456@qq.com", null));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}