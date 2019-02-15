package com.hxzy.shopping.service.impl;

import java.util.List;

import com.hxzy.shopping.dao.BaseDao;
import com.hxzy.shopping.dao.SubtypesDao;
import com.hxzy.shopping.dao.impl.SubtypesDaoImpl;
import com.hxzy.shopping.entity.Subtypes;
import com.hxzy.shopping.service.SubtypesService;

public class SubtypesServiceImpl extends BaseDao implements SubtypesService{
	SubtypesDao sDao = new SubtypesDaoImpl();
	/**
	 * ²éÑ¯È«²¿
	 */
	@Override
	public List<Subtypes> showAllSubtypes() {
		List<Subtypes> list = null;
		try {
			list = sDao.showAllSubtypes();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
