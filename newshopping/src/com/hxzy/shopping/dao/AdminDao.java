package com.hxzy.shopping.dao;
import com.hxzy.shopping.entity.*;
/**
 * 管理员表
 * @author Administrator
 *
 */
public interface AdminDao {
	/**
	 * 登录
	 */
	public Admin Login(String adminid,String password) throws Exception;
}
