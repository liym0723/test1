package com.hxzy.shopping.service.impl;

import com.hxzy.shopping.dao.AdminAdmingroupDao;
import com.hxzy.shopping.dao.BaseDao;
import com.hxzy.shopping.dao.impl.AdminAdmingroupDaoImpl;
import com.hxzy.shopping.service.AdminAdmingroupService;
/**
 * ����Ա-����Ա���ϵ��
 * @author Administrator
 *
 */
public class AdminAdmingroupServiceImpl extends BaseDao implements AdminAdmingroupService{
	AdminAdmingroupDao aDao = new AdminAdmingroupDaoImpl();
}
