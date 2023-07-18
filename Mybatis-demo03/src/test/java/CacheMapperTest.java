import com.cn.mybatis.mapper.CacheMapper;
import com.cn.mybatis.pojo.Emp;
import com.cn.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @title: CacheMapperTest
 * @Description //TODO
 * @Author Crocodile
 * @Date: 2023/7/17 0017 15:02
 * @Version 1.0
 */
public class CacheMapperTest {

    @Test
    public void testSelectEmpById() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        CacheMapper mapper1 = sqlSession.getMapper(CacheMapper.class);
        Emp emp1 = mapper1.selectEmpById(5);
        System.out.println(emp1);
        mapper1.insertEmp(new Emp(null, "a", 22, "女", "123@qq.com", null));
        CacheMapper mapper2 = sqlSession.getMapper(CacheMapper.class);
        Emp emp2 = mapper2.selectEmpById(5);
        System.out.println(emp2);
    }

    @Test
    public void testCache() {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
            CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
            System.out.println(mapper1.selectEmpById(5));
            sqlSession1.close();
            SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
            CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
            System.out.println(mapper2.selectEmpById(5));
            sqlSession2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}