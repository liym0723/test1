package com.hxzy.shopping.dao;

import java.util.List;

import com.hxzy.shopping.entity.Product;

/**
 * 订单详情表
 * @author Administrator
 *
 */
public interface OrderdetailsDao {
	/**
	 * 显示全部订单
	 */
	public List<Product> showOrderdetails(Integer pageIndex , Integer pageCount) throws Exception;

	public int count() throws Exception;
}
