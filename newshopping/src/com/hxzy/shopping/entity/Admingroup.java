package com.hxzy.shopping.entity;
/**
 * Admingroup 管理员组表
 * @author Administrator
 *
 */
public class Admingroup {
	/*
	 *  Admingroup 管理员组表
Groupid   number       pk        管理员组编号，序列生成
Name     varchar2(50)             管理员组名称
Note      varchar2(200)            管理员组简介
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
