package com.hxzy.shopping.service.impl;

import com.hxzy.shopping.dao.AdmingroupPrivilageDao;
import com.hxzy.shopping.dao.BaseDao;
import com.hxzy.shopping.dao.impl.AdmingroupPrivilageDaoImpl;
import com.hxzy.shopping.service.AdmingroupPrivilageService;
/**
 * ����Ա��-Ȩ�޹�ϵ��
 * @author Administrator
 *
 */
public class AdmingroupPrivilageServiceImpl extends BaseDao implements  AdmingroupPrivilageService{
	AdmingroupPrivilageDao aDao = new AdmingroupPrivilageDaoImpl();
}
