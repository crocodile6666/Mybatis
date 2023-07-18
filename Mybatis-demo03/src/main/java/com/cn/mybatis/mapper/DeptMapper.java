package com.cn.mybatis.mapper;

import com.cn.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @title: DeptMapper
 * @Description //TODO
 * @Author Crocodile
 * @Date: 2023/7/17 0017 9:30
 * @Version 1.0
 */
public interface DeptMapper {

    Dept getEmpDeptStepTwo(@Param("did") Integer did);

    Dept getDeptAndEmp(@Param("did") Integer did);

    Dept getDeptAndEmpByStep(@Param("did") Integer did);
}
