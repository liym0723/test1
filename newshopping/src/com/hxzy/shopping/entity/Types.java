package com.hxzy.shopping.entity;
/**
 * Types    ��Ʒ����
 * @author Administrator
 *
 */
public class Types {
	/*
	 * Types    ��Ʒ����
Tid         number         pk         ��Ʒ����ţ������Զ�����
Title        varchar2(50)                ��Ʒ�������
Note        varchar2(200)               ��Ʒ�����
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
