package com.hxzy.shopping.dao;
import com.hxzy.shopping.entity.*;
/**
 * ����Ա��
 * @author Administrator
 *
 */
public interface AdminDao {
	/**
	 * ��¼
	 */
	public Admin Login(String adminid,String password) throws Exception;
}
