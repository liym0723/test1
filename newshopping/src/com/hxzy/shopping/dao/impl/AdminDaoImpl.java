package com.hxzy.shopping.dao.impl;

import com.hxzy.shopping.dao.AdminDao;
import com.hxzy.shopping.dao.BaseDao;
import com.hxzy.shopping.entity.Admin;
/**
 * 管理员表
 * @author Administrator
 *
 */
public class AdminDaoImpl extends BaseDao implements AdminDao{
	/**
	 * 登录
	 */
	@Override
	public Admin Login(String adminid, String password) throws Exception {
		String sql = "select * from admin where adminid=? and password=?";
		Object[] objects = {adminid,password};
		rs = executQuery(sql,objects );
		Admin admin = null;
		if(rs.next()){
			admin = new Admin();
			admin.setAdminid(rs.getString(1));
			admin.setPassword(rs.getString(2));
			admin.setNote(rs.getString(3));
			admin.setAdminflag(rs.getInt(4));
		}
		
		closeConnection();
		return admin;
	}

}
