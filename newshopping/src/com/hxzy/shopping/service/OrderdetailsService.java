package com.hxzy.shopping.service;

import java.util.List;

import com.hxzy.shopping.entity.Product;

public interface OrderdetailsService {
	/**
	 * ��ʾȫ������
	 */
	public List<Product> showOrderdetails(Integer pageIndex , Integer pageCount);
	
	/**
	 * tiaoshu
	 */
	public Integer count();
}
