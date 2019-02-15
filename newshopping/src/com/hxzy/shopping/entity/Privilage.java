package com.hxzy.shopping.entity;
/**
 *  Privilage权限表
 * @author Administrator
 *
 */
public class Privilage {
	/*
	 * Privilage权限表
Pid       number      pk          权限编号，序列生成
Name     varchar2(50)              权限名称
Note      varchar2(200)             权限简介
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
