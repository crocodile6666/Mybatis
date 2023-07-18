import com.cn.mybatis.mapper.DynamicSQLMapper;
import com.cn.mybatis.pojo.Emp;
import com.cn.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @title: DynamicSQLMapperTest
 * @Description //TODO
 * @Author Crocodile
 * @Date: 2023/7/17 0017 11:31
 * @Version 1.0
 */
public class DynamicSQLMapperTest {

    @Test
    public void testGetEmpByCondition() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> empList = mapper.getEmpByCondition(new Emp(null, "", null, "", "123@qq.com", null));
        empList.forEach(emp -> System.out.println(emp));
    }

    @Test
    public void testGetEmpByChoose() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> empList = mapper.getEmpByChoose(new Emp(null, "", null, "", "wangwu@qq.com", null));
        empList.forEach(emp -> System.out.println(emp));
    }

    @Test
    public void testDeleteMoreByArray() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        int result = mapper.deleteMoreByArray(new Integer[]{7, 8});
        System.out.println(result);
    }

    @Test
    public void testInsertMoreByList() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null, "a1", 23, "男", "123@qq.com", null);
        Emp emp2= new Emp(null, "a2", 23, "男", "123@qq.com", null);
        Emp emp3 = new Emp(null, "a3", 23, "男", "123@qq.com", null);
        List<Emp> emps = Arrays.asList(emp1, emp2, emp3);
        int result = mapper.insertMoreByList(emps);
        System.out.println(result);
    }
}