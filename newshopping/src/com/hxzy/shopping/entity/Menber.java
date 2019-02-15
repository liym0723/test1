package com.hxzy.shopping.entity;

import java.util.Date;
/**
 * Member  成员表
 * @author Administrator
 *
 */
public class Menber {
	/*Member  成员表
Mid        varchar2(50)     pk      用户登录id
Password   varchar2(32)            用户登录密码
Name      varchar2(30)             真实姓名
Address    varchar2(200)            用户的住址
Telephone   varchar2(100)           联系电话
Zipcode     varchar2(6)             邮政编码
Lastdate     date                  最后一次登录时间
Lockflag     number               用户锁定标记  lockflag=0 活动  lockflag=1   
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
