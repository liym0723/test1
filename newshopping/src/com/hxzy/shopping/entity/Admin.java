package com.hxzy.shopping.entity;
/**
 * ����Ա��
 * @author Administrator
 *
 */
public class Admin {
	/*
	 * 
	 * Adminid   varchar2(50)   pk        ����Ա���
		Password  varchar2(50)             ����Ա����
		Note      varchar2(50)             ����Ա���
		Adminflag  number                ��������Ա��ǣ�adminflag=0,  adminflag=1
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
