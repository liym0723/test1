package com.hxzy.shopping.entity;

import java.util.Date;
/**
 * Orders������
 * @author Administrator
 *
 */
public class Orders {
	/*
	 * Orders������
Oid        number       pk            ������ţ������Զ�����
Mid       varchar2(50)    fk            �û����
Subdate    date                        �����ύ����
Note      varchar2(200)                 ��������
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
