package com.woniu.service.ipml;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IDeptDAo;
import com.woniu.pojo.Dept;
import com.woniu.service.IDeptService;
@Service
//切入点，对方法和类进行管理（spring配置好，就有事务了）
@Transactional
public class DeptServiceImp implements IDeptService{
    
	@Autowired
	IDeptDAo deptDao;
	
	public IDeptDAo getDeptDao() {
		return deptDao;
	}

	public void setDeptDao(IDeptDAo deptDao) {
		this.deptDao = deptDao;
	}

	@Override
	public void save(Dept dept) {
		deptDao.save(dept);
		
	}

	@Override
	public void delete(Dept dept) {
		deptDao.delete(dept);
		
	}

	@Override
	public void update(Dept dept) {
		deptDao.update(dept);
		
	}

	@Override
	public List<Dept> findAll() {
		
		return deptDao.findAll();
	}

	@Override
	public Dept findOne(Integer deptno) {
		
		return deptDao.findOne(deptno);
	}

}
