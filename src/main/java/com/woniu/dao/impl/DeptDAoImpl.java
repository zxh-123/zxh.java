package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IDeptDAo;
import com.woniu.pojo.Dept;

@Repository
public class DeptDAoImpl implements IDeptDAo{
	@Autowired
    private SessionFactory factory;
	
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public void save(Dept dept) {
		//没有存到数据库
		factory.getCurrentSession().save(dept);
		//HibernateUtil.getSession().save(dept);
	}

	@Override
	public List<Dept> findAll() {
		
		return factory.getCurrentSession().createQuery("from Dept").list();
	}

	@Override
	public void delete(Dept dept) {
		factory.getCurrentSession().delete(dept);
		
	}

	@Override
	public void update(Dept dept) {
		factory.getCurrentSession().update(dept);
	}

	@Override
	public Dept findOne(Integer deptno) {
		
		return (Dept) factory.getCurrentSession().createQuery("from Dept where deptno="+deptno).list().get(0);
	}
   
}
