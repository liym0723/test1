package com.hxzy.shopping.entity;
/**
 * Admingroup ����Ա���
 * @author Administrator
 *
 */
public class Admingroup {
	/*
	 *  Admingroup ����Ա���
Groupid   number       pk        ����Ա���ţ���������
Name     varchar2(50)             ����Ա������
Note      varchar2(200)            ����Ա����
	 * 
	 */

	private Integer groupid;
	private String name;
	private String note;
	public Integer getGroupid() {
		return groupid;
	}
	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
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
