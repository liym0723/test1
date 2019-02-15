package com.hxzy.shopping.entity;

import java.util.Date;

/**
 *  Emp   雇员表
 * @author Administrator
 *
 */
public class Emp {
	/*
	 * Emp   雇员表
	Empno      number(4)    pk          雇员编号，使用数字表示，长度是4位数字
	Ename      varchar2(10)               雇员姓名,使用字符串表示，长度是10位字符串
	Job         varchar2(9)                雇员工作
	Hiredate     date                     雇员日期，使用日期形式表示
	Sal         number(7,2)              基本工资
	Comm      number(7,2)              奖金，使用小数表示
	Mgr        number(4)               雇员对应的领导编号
	Deptno     number(2)    fk          一个雇员对应的部门编号
	Photo      varchar2(100)             保存雇员的照片途径
	Note       varchar2(200)             雇员简介
	Lockflag    number                  雇员锁定标记  活动lockflag=0  锁定 lockflag=1
	 * 
	 */
	
	private Integer empno;
	private String ename;
	private String job;
	private Date hiredate;
	private Double sal;
	private Double somm;
	private Integer mgr;
	private Integer deptno;
	private String photo;
	private String note;
	private Integer lockflag;
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Double getSomm() {
		return somm;
	}
	public void setSomm(Double somm) {
		this.somm = somm;
	}
	public Integer getMgr() {
		return mgr;
	}
	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Integer getLockflag() {
		return lockflag;
	}
	public void setLockflag(Integer lockflag) {
		this.lockflag = lockflag;
	}
	
}
