package com.hxzy.shopping.service.impl;

import com.hxzy.shopping.dao.AdminDao;
import com.hxzy.shopping.dao.BaseDao;
import com.hxzy.shopping.dao.impl.AdminDaoImpl;
import com.hxzy.shopping.entity.Admin;
import com.hxzy.shopping.service.AdminService;
/**
 * 管理员表
 * @author Administrator
 *
 */
public class AdminServiceImpl extends BaseDao implements AdminService{
	AdminDao adDao = new AdminDaoImpl();
	/**
	 * 登录
	 */
	@Override
	public Admin Login(String adminid, String password) {
		Admin admin = null;
		try {
			admin = adDao.Login(adminid, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return admin;
	}
}
