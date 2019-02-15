package com.hxzy.shopping.service.impl;

import com.hxzy.shopping.dao.AdminAdmingroupDao;
import com.hxzy.shopping.dao.BaseDao;
import com.hxzy.shopping.dao.impl.AdminAdmingroupDaoImpl;
import com.hxzy.shopping.service.AdminAdmingroupService;
/**
 * 管理员-管理员组关系表
 * @author Administrator
 *
 */
public class AdminAdmingroupServiceImpl extends BaseDao implements AdminAdmingroupService{
	AdminAdmingroupDao aDao = new AdminAdmingroupDaoImpl();
}
