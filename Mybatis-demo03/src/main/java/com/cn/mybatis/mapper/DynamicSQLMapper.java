package com.cn.mybatis.mapper;

import com.cn.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @title: DynamicSQLMapper
 * @Description //TODO
 * @Author Crocodile
 * @Date: 2023/7/17 0017 11:27
 * @Version 1.0
 */
public interface DynamicSQLMapper {

    List<Emp> getEmpByCondition(Emp emp);

    List<Emp> getEmpByChoose(Emp emp);

    int deleteMoreByArray(@Param("eids") Integer[] eids);

    int insertMoreByList(@Param("emps") List<Emp> emps);
}
