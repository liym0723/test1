package com.hxzy.shopping.entity;
/**
 * Dept   ���ű�
 * @author Administrator
 *
 */
public class Dept {
/*
 * Dept   ���ű�
Deptno      number(2)    pk          ���ű�ţ�ʹ�����ֱ�ʾ��������4λ����
Dname      varchar2(14)              �������ƣ�ʹ���ַ�����ʾ��������14λ�ַ���
Loc         varchar2(13)              ����λ�ã�ʹ���ַ�����ʾ��������13λ�ַ���
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
