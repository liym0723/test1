package com.hxzy.shopping.entity;

import java.util.Date;

/**
 *  Emp   ��Ա��
 * @author Administrator
 *
 */
public class Emp {
	/*
	 * Emp   ��Ա��
	Empno      number(4)    pk          ��Ա��ţ�ʹ�����ֱ�ʾ��������4λ����
	Ename      varchar2(10)               ��Ա����,ʹ���ַ�����ʾ��������10λ�ַ���
	Job         varchar2(9)                ��Ա����
	Hiredate     date                     ��Ա���ڣ�ʹ��������ʽ��ʾ
	Sal         number(7,2)              ��������
	Comm      number(7,2)              ����ʹ��С����ʾ
	Mgr        number(4)               ��Ա��Ӧ���쵼���
	Deptno     number(2)    fk          һ����Ա��Ӧ�Ĳ��ű��
	Photo      varchar2(100)             �����Ա����Ƭ;��
	Note       varchar2(200)             ��Ա���
	Lockflag    number                  ��Ա�������  �lockflag=0  ���� lockflag=1
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
