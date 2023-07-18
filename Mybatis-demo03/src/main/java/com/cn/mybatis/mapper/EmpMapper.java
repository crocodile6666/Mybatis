package com.cn.mybatis.mapper;

import com.cn.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.UUID;

/**
 * @title: EmpMapper
 * @Description //TODO
 * @Author Crocodile
 * @Date: 2023/7/17 0017 9:30
 * @Version 1.0
 */
public interface EmpMapper {

    List<Emp> getAllEmp();

    List<Emp> getEmpAndDept(@Param("eid") Integer eid);

    Emp getEmpByStep(@Param("eid") Integer eid);

    Emp getDeptAndEmpByStepTwo(@Param("eid") Integer eid);
}
