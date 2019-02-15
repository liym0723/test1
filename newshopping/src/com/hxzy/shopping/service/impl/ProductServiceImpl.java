package com.hxzy.shopping.service.impl;

import java.util.List;

import com.hxzy.shopping.dao.BaseDao;
import com.hxzy.shopping.dao.ProductDao;
import com.hxzy.shopping.dao.impl.ProductDaoImpl;
import com.hxzy.shopping.entity.Product;
import com.hxzy.shopping.service.ProductService;
/**
 * 产品表
 * @author Administrator
 *
 */
public class ProductServiceImpl extends BaseDao implements ProductService{
	ProductDao pDao = new ProductDaoImpl();
	/**
	 * 全部数据分页
	 */
	@Override
	public List<Product> showAllProducts(Integer pageIndex, Integer pageCount){
		List<Product> list = null;
		try {
			list = pDao.showAllProducts(pageIndex, pageCount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	/**
	 * 多少条数据
	 */
	@Override
	public int count(){
		int num=0;
		try {
			num = pDao.count();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}
	/**
	 * 通过ID去查找数据
	 */
	@Override
	public Product showOneProductByID(Integer pid){
		Product product = null;
		try {
			product = pDao.showOneProductByID(pid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return product;
	}
}
