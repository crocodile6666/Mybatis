package com.cn.mybatis.pojo;

import javax.swing.*;
import java.util.List;

/**
 * @title: Dept
 * @Description //TODO
 * @Author Crocodile
 * @Date: 2023/7/17 0017 9:29
 * @Version 1.0
 */
public class Dept {
    private Integer did;
    private String deptName;
    private List<Emp> emps;

    public Dept() {
    }

    public Dept(Integer did, String deptName, List<Emp> emps) {
        this.did = did;
        this.deptName = deptName;
        this.emps = emps;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "did=" + did +
                ", deptName='" + deptName + '\'' +
                ", emps=" + emps +
                '}';
    }

}