package com.hxzy.shopping.entity;
/**
 * Admingroup_privilage  管理员组-权限关系表  
 * @author Administrator
 *
 */
public class AdmingroupPrivilage {
	/*
	 * 
	 *  Admingroup_privilage  管理员组-权限关系表  
Pid       number      fk          权限编号      
Groupid   number      fk          组编号
	 */
	private Integer pid;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getGroupid() {
		return groupid;
	}
	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}
	private Integer groupid;
}
