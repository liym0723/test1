package com.hxzy.shopping.entity;
/**
 *  Product   ��Ʒ��
 * @author Administrator
 *
 */
public class Product {
/*
 * 
 * Product   ��Ʒ��
Pid         number        pk           ��Ʒ��ţ������Զ�����
Tid         number        fk            ��Ʒ�����������
Stid        number         fk           ��Ʒ������������
Adminid    varchar2(50)     fk           ��Ӵ˲�Ʒ�Ĺ���Ա
Name      varchar2(50)                  ��Ʒ����
Note       varchar2(200)                 ��Ʒ���
Price       number(10,2)                 ��Ʒ����
Amount    number(5)                    ��Ʒ����
Count      number                      ��Ʒ�����
Photo      varchar2(100)                 ͼƬ        

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
	
	private Integer shoppingNumber;	//��������
	private Double subtotal; //С��
	
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
