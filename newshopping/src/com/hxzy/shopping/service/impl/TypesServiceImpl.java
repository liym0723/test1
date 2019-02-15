package com.hxzy.shopping.service.impl;

import com.hxzy.shopping.dao.BaseDao;
import com.hxzy.shopping.dao.TypesDao;
import com.hxzy.shopping.dao.impl.TypesDaoImpl;
import com.hxzy.shopping.service.TypesService;

public class TypesServiceImpl extends BaseDao implements TypesService{
	TypesDao tDao = new TypesDaoImpl();
}
