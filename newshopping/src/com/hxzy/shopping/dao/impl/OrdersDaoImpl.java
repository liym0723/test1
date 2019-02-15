package com.hxzy.shopping.dao.impl;
import java.util.ArrayList;
import java.util.List;

import com.hxzy.shopping.dao.BaseDao;
import com.hxzy.shopping.dao.OrdersDao;
import com.hxzy.shopping.entity.Orders;
/**
 * ¶©µ¥±í
 * @author Administrator
 *
 */
public class OrdersDaoImpl extends BaseDao implements OrdersDao{
	
	@Override
	public List<Orders> showAllOrders() throws Exception {
		rs = executQuery("SELECT m.name,o.* FROM MEMBER m INNER JOIN Orders o ON o.mid=m.mid", null);
		List<Orders> list = new ArrayList<Orders>();
		while(rs.next()){
			Orders orders = new Orders();
			orders.setOid(rs.getInt(2));
			orders.setMid(rs.getString(1));
			orders.setSubDate(rs.getTimestamp(4));
			orders.setNote(rs.getString(5));
			list.add(orders);
		}
		closeConnection();
		return list;
	}

	

}
