package com.hxzy.shopping.entity;
/**
 * Orderdetails  订单详情表
 * @author Administrator
 *
 */
public class Orderdetails {
	/*
	 * Orderdetails  订单详情表
Odid       number       pk            订单详情编号，序列自动增长
Oid        number       fk            订单编号
Pid        number       fk            购买商品编号
Quantity    number                    购买数量 
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
