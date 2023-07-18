import com.cn.mybatis.mapper.DeptMapper;
import com.cn.mybatis.mapper.EmpMapper;
import com.cn.mybatis.pojo.Dept;
import com.cn.mybatis.pojo.Emp;
import com.cn.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.List;

/**
 * @title: ResultMapTest
 * @Description //TODO
 * @Author Crocodile
 * @Date: 2023/7/17 0017 9:34
 * @Version 1.0
 */
public class ResultMapTest {

    @Test
    public void testGetAllEmp() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> empList = mapper.getAllEmp();
        empList.forEach(emp -> System.out.println(emp));
    }

    @Test
    public void testGetEmpAndDept() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> empList = mapper.getEmpAndDept(3);
        empList.forEach(emp -> System.out.println(emp));
    }

    @Test
    public void testGetEmpByStep() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpByStep(3);
        System.out.println(emp.getEmpName());
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println(emp.getDept());
    }

    @Test
    public void testGetDeptAndEmp() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmp(1);
        System.out.println(dept);
    }

    @Test
    public void testGetDeptAndEmpByStep() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpByStep(1);
        System.out.println(dept);
    }
}