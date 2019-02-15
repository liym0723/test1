package com.hxzy.shopping.entity;
/**
 * Types    商品类别表
 * @author Administrator
 *
 */
public class Types {
	/*
	 * Types    商品类别表
Tid         number         pk         商品类别编号，序列自动增长
Title        varchar2(50)                商品类别名称
Note        varchar2(200)               商品类别简介
	 * 
	 */
	
	private Integer tid;
	private String title;
	private String note;
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
