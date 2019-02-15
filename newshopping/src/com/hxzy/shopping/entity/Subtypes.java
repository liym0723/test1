package com.hxzy.shopping.entity;
/**
 *  Subtypes      商品子类别表
 * @author Administrator
 *
 */
public class Subtypes {
	/*
	 * Subtypes      商品子类别表
Stid         number        pk          子类别编号，序列自动增长
Tid          number        fk          对应父类别编号
Title         varchar2(50)                子类别名称
Note        varchar2(200)                子类别简介
	 * 
	 */
	
	private Integer stid;
	private Integer tid;
	private String title;
	private String note;
	public Integer getStid() {
		return stid;
	}
	public void setStid(Integer stid) {
		this.stid = stid;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
}
