package com.hxzy.shopping.entity;
/**
 * Orderdetails  ���������
 * @author Administrator
 *
 */
public class Orderdetails {
	/*
	 * Orderdetails  ���������
Odid       number       pk            ���������ţ������Զ�����
Oid        number       fk            �������
Pid        number       fk            ������Ʒ���
Quantity    number                    �������� 
	 * 
	 */
	private Integer odid;
	private Integer oid;
	private Integer pid;
	private Integer quantity;
	public Integer getOdid() {
		return odid;
	}
	public void setOdid(Integer odid) {
		this.odid = odid;
	}
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
