package com.hxzy.shopping.dao;

import java.util.List;

import com.hxzy.shopping.entity.Subtypes;

/**
 * 商品子类别表
 * @author Administrator
 *
 */
public interface SubtypesDao {
	
	public List<Subtypes> showAllSubtypes() throws Exception;
}
