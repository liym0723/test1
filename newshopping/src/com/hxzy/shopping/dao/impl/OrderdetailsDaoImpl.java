package com.hxzy.shopping.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.hxzy.shopping.dao.BaseDao;
import com.hxzy.shopping.dao.OrderdetailsDao;
import com.hxzy.shopping.entity.Product;
/**
 * ∂©µ•œÍ«È±Ì
 * @author Administrator
 *
 */
public class OrderdetailsDaoImpl extends BaseDao implements OrderdetailsDao{

	@Override
	public List<Product> showOrderdetails(Integer pageIndex,
			Integer pageCount) throws Exception {
		String sql = "SELECT * FROM (SELECT rownum r,o.quantity,p.name,p.price,p.photo FROM ORDERDETAILS o LEFT JOIN product p ON o.pid=p.pid) WHERE r>=? AND r<=?";
		Object[] objects = {(pageIndex-1)*pageCount+1,pageIndex*pageCount};
		rs = executQuery(sql, objects);
		List<Product> list = new ArrayList<Product>();
		while(rs.next()){
			Product p = new Product();
			p.setName(rs.getString("name"));
			p.setPrice(rs.getDouble("price"));
			p.setPhoto(rs.getString("photo"));
			p.setShoppingNumber(rs.getInt("quantity"));
			p.setSubtotal(rs.getDouble("price")*rs.getInt("quantity"));
			list.add(p);
		}
		return list;
	}

	
	
	@Override
	public int count() throws Exception {
		String sql = "SELECT COUNT(*) FROM (SELECT rownum r,o.quantity,p.name,p.price,p.photo FROM ORDERDETAILS o LEFT JOIN product p ON o.pid=p.pid)";
		executQuery(sql, null);
		int num = 0;
		while(rs.next()){
			num = rs.getInt(1);
		}
		return num;
	}

}
