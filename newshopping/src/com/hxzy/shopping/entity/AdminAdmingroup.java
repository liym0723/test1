package com.hxzy.shopping.entity;
/**
 *   Admingroup ����Ա���
 * @author Administrator
 *
 */
public class AdminAdmingroup {

	
	/*
	 * Admin_admingroup  ����Ա-����Ա���ϵ��
Adminid   varchar2(50)  fk          ����Ա���
Groupid   number      fk          ����Ա���� 
	 */
	
	private String adminid;
	private Integer groupid;
	public String getAdminid() {
		return adminid;
	}
	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}
	public Integer getGroupid() {
		return groupid;
	}
	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}
}
