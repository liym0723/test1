package com.hxzy.shopping.entity;

import java.util.Date;
/**
 * Member  ��Ա��
 * @author Administrator
 *
 */
public class Menber {
	/*Member  ��Ա��
Mid        varchar2(50)     pk      �û���¼id
Password   varchar2(32)            �û���¼����
Name      varchar2(30)             ��ʵ����
Address    varchar2(200)            �û���סַ
Telephone   varchar2(100)           ��ϵ�绰
Zipcode     varchar2(6)             ��������
Lastdate     date                  ���һ�ε�¼ʱ��
Lockflag     number               �û��������  lockflag=0 �  lockflag=1   
	 * 
	 * 
	 */
	
	private String Mid;
	private String Password;
	private String Name;
	private String Address;
	private String Telephone;
	private String Zipcode;
	private Date Lastdate;
	private Integer Lockflag;
	
	public String getMid() {
		return Mid;
	}
	public void setMid(String mid) {
		Mid = mid;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getTelephone() {
		return Telephone;
	}
	public void setTelephone(String telephone) {
		Telephone = telephone;
	}
	public String getZipcode() {
		return Zipcode;
	}
	public void setZipcode(String zipcode) {
		Zipcode = zipcode;
	}
	public Date getLastdate() {
		return Lastdate;
	}
	public void setLastdate(Date lastdate) {
		Lastdate = lastdate;
	}
	public Integer getLockflag() {
		return Lockflag;
	}
	public void setLockflag(Integer lockflag) {
		Lockflag = lockflag;
	}
	
}	
