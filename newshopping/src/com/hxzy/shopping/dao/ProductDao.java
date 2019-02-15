package com.hxzy.shopping.dao;

import java.util.List;

import com.hxzy.shopping.entity.Product;

/**
 * 产品表
 * @author Administrator
 *
 */
public interface ProductDao {
	/**
	 * 显示全部商品 --分页显示
	 */
	
	public List<Product> showAllProducts(Integer pageIndex , Integer pageCount) throws Exception;
	/**
	 * 多少条数据
	 */
	public int count() throws Exception;
	
	/**
	 * 通过ID去查找相对应的数
	 * 据
	 */
	public Product showOneProductByID(Integer pid) throws Exception;
}
