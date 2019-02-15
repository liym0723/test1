package com.hxzy.shopping.entity;
/**
 *  Product   产品表
 * @author Administrator
 *
 */
public class Product {
/*
 * 
 * Product   产品表
Pid         number        pk           产品编号，序列自动增长
Tid         number        fk            商品所属的类别编号
Stid        number         fk           商品所属的子类编号
Adminid    varchar2(50)     fk           添加此产品的管理员
Name      varchar2(50)                  产品名称
Note       varchar2(200)                 产品简介
Price       number(10,2)                 产品单价
Amount    number(5)                    产品数量
Count      number                      产品点击量
Photo      varchar2(100)                 图片        

 */
	
	private Integer pid;
	private Integer tid;
	private Integer stid;
	private String adminid;
	private String name;
	private String note;
	private Double price;
	private Integer amount;
	private Integer count;
	private String photo;
	
	private Integer shoppingNumber;	//购买数量
	private Double subtotal; //小计
	
	public Integer getShoppingNumber() {
		return shoppingNumber;
	}
	public void setShoppingNumber(Integer shoppingNumber) {
		this.shoppingNumber = shoppingNumber;
	}
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Integer getStid() {
		return stid;
	}
	public void setStid(Integer stid) {
		this.stid = stid;
	}
	public String getAdminid() {
		return adminid;
	}
	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
}
