package com.woniu.dao;

import java.util.List;

import com.woniu.action.DeptAction;
import com.woniu.pojo.Dept;

public interface IDeptDAo {
    void save(Dept dept);
    void delete(Dept dept);
    void update(Dept dept);
    List<Dept> findAll();
    Dept findOne(Integer deptno);
}
