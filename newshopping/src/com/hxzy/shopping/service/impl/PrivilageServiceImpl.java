package com.hxzy.shopping.service.impl;

import com.hxzy.shopping.dao.BaseDao;
import com.hxzy.shopping.dao.PrivilageDao;
import com.hxzy.shopping.dao.impl.PrivilageDaoImpl;
import com.hxzy.shopping.service.PrivilageService;
/**
 * È¨ÏÞ±í
 * @author Administrator
 *
 */
public class PrivilageServiceImpl extends BaseDao implements PrivilageService{
	PrivilageDao pDao = new PrivilageDaoImpl();
}
