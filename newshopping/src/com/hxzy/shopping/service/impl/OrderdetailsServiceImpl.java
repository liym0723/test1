package com.hxzy.shopping.service.impl;

import java.util.List;

import com.hxzy.shopping.dao.BaseDao;
import com.hxzy.shopping.dao.OrderdetailsDao;
import com.hxzy.shopping.dao.impl.OrderdetailsDaoImpl;
import com.hxzy.shopping.entity.Product;
import com.hxzy.shopping.service.OrderdetailsService;
/**
 * ∂©µ•œÍ«È±Ì
 * @author Administrator
 *
 */
public class OrderdetailsServiceImpl extends BaseDao implements OrderdetailsService{
	OrderdetailsDao odDao = new OrderdetailsDaoImpl();
	
	@Override
	public List<Product> showOrderdetails(Integer pageIndex, Integer pageCount) {
		List<Product> list = null;
		try {
			list = odDao.showOrderdetails(pageIndex, pageCount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Integer count() {
		int num=0;
		try {
			num = odDao.count();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}


}
