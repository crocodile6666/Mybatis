package com.cn.mybatis.mapper;

import com.cn.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @title: CacheMapper
 * @Description //TODO
 * @Author Crocodile
 * @Date: 2023/7/17 0017 15:01
 * @Version 1.0
 */
public interface CacheMapper {

    Emp selectEmpById(@Param("eid") Integer eid);
    int insertEmp(@Param("emp") Emp emp);
}
