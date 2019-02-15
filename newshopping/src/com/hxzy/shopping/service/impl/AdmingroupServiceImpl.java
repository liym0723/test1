package com.hxzy.shopping.service.impl;

import com.hxzy.shopping.dao.AdmingroupDao;
import com.hxzy.shopping.dao.BaseDao;
import com.hxzy.shopping.dao.impl.AdmingroupDaoImpl;
import com.hxzy.shopping.service.AdmingroupService;
/**
 * 管理员组表
 * @author Administrator
 *
 */
public class AdmingroupServiceImpl extends BaseDao implements AdmingroupService{
	AdmingroupDao aDao = new AdmingroupDaoImpl();
}
