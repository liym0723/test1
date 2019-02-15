package com.hxzy.shopping.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.hxzy.shopping.dao.BaseDao;
import com.hxzy.shopping.dao.SubtypesDao;
import com.hxzy.shopping.entity.Subtypes;
/**
 * 商品子类别表
 * @author Administrator
 *
 */
public class SubtypesDaoImpl extends BaseDao implements SubtypesDao{
	/**
	 * 查询全部的子分类
	 */
	@Override
	public List<Subtypes> showAllSubtypes() throws Exception {
		rs = executQuery("select * from SUBTYPES", null);
		List<Subtypes> list = new ArrayList<Subtypes>();
		while(rs.next()){
			Subtypes subtypes =new Subtypes();
			subtypes.setStid(rs.getInt(1));
			subtypes.setTid(rs.getInt(2));
			subtypes.setTitle(rs.getString(3));
			subtypes.setNote(rs.getString(4));
			list.add(subtypes);
		}
		closeConnection();
		return list;
	}

}
