package com.hxzy.shopping.service.impl;

import com.hxzy.shopping.dao.BaseDao;
import com.hxzy.shopping.dao.MenberDao;
import com.hxzy.shopping.dao.impl.MenberDaoImpl;
import com.hxzy.shopping.service.MenberService;
/**
 * ≥…‘±±Ì
 * @author Administrator
 *
 */
public class MenberServiceImpl extends BaseDao implements MenberService{
	MenberDao mdDao = new MenberDaoImpl();
}
