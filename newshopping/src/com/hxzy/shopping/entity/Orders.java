package com.hxzy.shopping.entity;

import java.util.Date;
/**
 * Orders订单表
 * @author Administrator
 *
 */
public class Orders {
	/*
	 * Orders订单表
Oid        number       pk            订单编号，序列自动增长
Mid       varchar2(50)    fk            用户编号
Subdate    date                        订单提交日期
Note      varchar2(200)                 订单留言
	 * 
	 */
	
	private Integer oid;
	private String mid;
	private Date subDate;
	private String note;
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public Date getSubDate() {
		return subDate;
	}
	public void setSubDate(Date subDate) {
		this.subDate = subDate;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
}
