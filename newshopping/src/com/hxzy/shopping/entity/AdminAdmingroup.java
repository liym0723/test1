package com.hxzy.shopping.entity;
/**
 *   Admingroup 管理员组表
 * @author Administrator
 *
 */
public class AdminAdmingroup {

	
	/*
	 * Admin_admingroup  管理员-管理员组关系表
Adminid   varchar2(50)  fk          管理员编号
Groupid   number      fk          管理员组编号 
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
