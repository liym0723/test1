package com.hxzy.shopping.entity;
/**
 *  PrivilageȨ�ޱ�
 * @author Administrator
 *
 */
public class Privilage {
	/*
	 * PrivilageȨ�ޱ�
Pid       number      pk          Ȩ�ޱ�ţ���������
Name     varchar2(50)              Ȩ������
Note      varchar2(200)             Ȩ�޼��
	 * 
	 */
	
	private Integer pid;
	private String name;
	private String note;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
}
