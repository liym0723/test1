package com.hxzy.shopping.service.impl;


import java.util.List;

import com.hxzy.shopping.dao.BaseDao;
import com.hxzy.shopping.dao.OrdersDao;
import com.hxzy.shopping.dao.impl.OrdersDaoImpl;
import com.hxzy.shopping.entity.Orders;
import com.hxzy.shopping.service.OrdersService;
/**
 * 订单表
 * @author Administrator
 *
 */
public class OrdersServiceImpl extends BaseDao implements OrdersService{
	OrdersDao oDao = new OrdersDaoImpl();
	/**
	 * 显示全部顶部单
	 */
	@Override
	public List<Orders> showAllOrders() {
		List<Orders> list = null;
		try {
			list = oDao.showAllOrders();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
}
