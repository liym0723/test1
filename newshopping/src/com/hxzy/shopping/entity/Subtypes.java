package com.hxzy.shopping.entity;
/**
 *  Subtypes      ��Ʒ������
 * @author Administrator
 *
 */
public class Subtypes {
	/*
	 * Subtypes      ��Ʒ������
Stid         number        pk          ������ţ������Զ�����
Tid          number        fk          ��Ӧ�������
Title         varchar2(50)                ���������
Note        varchar2(200)                �������
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
