package com.hxzy.shopping.service.impl;

import com.hxzy.shopping.dao.BaseDao;
import com.hxzy.shopping.dao.DeptDao;
import com.hxzy.shopping.dao.impl.DeptDaoImpl;
import com.hxzy.shopping.service.DeptService;
/**
 * ���ű�
 * @author Administrator
 *
 */
public class DeptServiceImpl extends BaseDao implements DeptService{
	DeptDao deptDao = new DeptDaoImpl();
}
