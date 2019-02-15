package com.hxzy.shopping.dao;

import java.util.List;

import com.hxzy.shopping.entity.Orders;

/**
 * 订单表
 * @author Administrator
 *
 */
public interface OrdersDao {
	/**
	 * 展示订单
	 */
	public List<Orders> showAllOrders() throws Exception;
	
}
