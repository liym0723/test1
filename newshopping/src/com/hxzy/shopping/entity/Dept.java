package com.hxzy.shopping.entity;
/**
 * Dept   部门表
 * @author Administrator
 *
 */
public class Dept {
/*
 * Dept   部门表
Deptno      number(2)    pk          部门编号，使用数字表示，长度是4位数字
Dname      varchar2(14)              部门名称，使用字符串表示，长度是14位字符串
Loc         varchar2(13)              部门位置，使用字符串表示，长度是13位字符串
 * 
 */
	private Integer deptno;
	private String dname;
	private String loc;
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
}
