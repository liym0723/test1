package com.hxzy.shopping.service.impl;

import com.hxzy.shopping.dao.BaseDao;
import com.hxzy.shopping.dao.EmpDao;
import com.hxzy.shopping.dao.impl.EmpDaoImpl;
import com.hxzy.shopping.service.EmpService;
/**
 * πÕ‘±±Ì
 * @author Administrator
 *
 */
public class EmpServiceImpl extends BaseDao implements EmpService{
	EmpDao eDao  = new EmpDaoImpl();
}
