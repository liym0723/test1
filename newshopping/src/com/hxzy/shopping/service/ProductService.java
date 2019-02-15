package com.hxzy.shopping.service;

import java.util.List;

import com.hxzy.shopping.entity.Product;

public interface ProductService {
	/**
	 * 显示全部商品 --分页显示
	 */
	
	public List<Product> showAllProducts(Integer pageIndex , Integer pageCount);
	/**
	 * 多少条数据
	 */
	public int count();
	/**
	 * 通过ID去查找相对应的数
	 * 据
	 */
	public Product showOneProductByID(Integer pid);
}
