package com.woniu.pojo;
// Generated 2019-11-22 13:44:39 by Hibernate Tools 5.2.12.Final

/**
 * Dept generated by hbm2java
 */
public class Dept implements java.io.Serializable {

	

	private Integer deptNo;
	private String dname;
	private String loc;

	public Dept() {
	}

	public Dept(String dname, String loc) {
		this.dname = dname;
		this.loc = loc;
	}

	public Integer getDeptNo() {
		return this.deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return this.loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Dept [deptNo=" + deptNo + ", dname=" + dname + ", loc=" + loc + "]";
	}
}