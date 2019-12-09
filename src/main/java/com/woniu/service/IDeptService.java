package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Dept;

public interface IDeptService {
	void save(Dept dept);
	void delete(Dept dept);
	void update(Dept dpt);
	List<Dept> findAll();
	Dept findOne(Integer deptno);
	

}
