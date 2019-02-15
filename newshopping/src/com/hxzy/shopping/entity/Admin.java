package com.hxzy.shopping.entity;
/**
 * 管理员表
 * @author Administrator
 *
 */
public class Admin {
	/*
	 * 
	 * Adminid   varchar2(50)   pk        管理员编号
		Password  varchar2(50)             管理员密码
		Note      varchar2(50)             管理员简介
		Adminflag  number                超级管理员标记，adminflag=0,  adminflag=1
	 * 
	 */
	
	private String adminid;
	public String getAdminid() {
		return adminid;
	}
	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Integer getAdminflag() {
		return adminflag;
	}
	public void setAdminflag(Integer adminflag) {
		this.adminflag = adminflag;
	}
	private String password;
	private String note;
	private Integer adminflag;
}
