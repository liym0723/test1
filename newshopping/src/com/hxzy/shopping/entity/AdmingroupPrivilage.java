package com.hxzy.shopping.entity;
/**
 * Admingroup_privilage  ����Ա��-Ȩ�޹�ϵ��  
 * @author Administrator
 *
 */
public class AdmingroupPrivilage {
	/*
	 * 
	 *  Admingroup_privilage  ����Ա��-Ȩ�޹�ϵ��  
Pid       number      fk          Ȩ�ޱ��      
Groupid   number      fk          ����
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
