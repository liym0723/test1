package com.hxzy.shopping.dao;

import java.util.List;

import com.hxzy.shopping.entity.Orders;

/**
 * ������
 * @author Administrator
 *
 */
public interface OrdersDao {
	/**
	 * չʾ����
	 */
	public List<Orders> showAllOrders() throws Exception;
	
}
