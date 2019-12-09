package com.woniu.action;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Dept;
import com.woniu.service.IDeptService;

@Controller
public class DeptAction {
	
    private Dept dept;
    private List<Dept> depts;
    @Autowired
    private IDeptService deptService;
    
	public List<Dept> getDepts() {
		return depts;
	}

	public void setDepts(List<Dept> depts) {
		this.depts = depts;
	}

	public IDeptService getDeptService() {
		return deptService;
	}

	public void setDeptService(IDeptService deptService) {
		this.deptService = deptService;
	}

	public Dept getDept() {
		return dept;
	}
	
	public void setDept(Dept dept) {
		this.dept = dept;
	}
    
	public String save() {
		deptService.save(dept);
		return "ok";
	}
	public String delete() {
		deptService.delete(dept);
		return "ok";
	}
	public String update() {
		System.out.println("123");
		System.out.println(dept);
		deptService.update(dept);
		System.out.println("234");
		return "ok";
	}
	public String findAll() {
		
		depts=deptService.findAll();
		
		return "deptList";
	}
	public String findOne() {
		
		dept=deptService.findOne(dept.getDeptNo());
		
		return "deptOne";
	}
}
