package com.hxzy.shopping.dao;

import java.util.List;

import com.hxzy.shopping.entity.Product;

/**
 * ���������
 * @author Administrator
 *
 */
public interface OrderdetailsDao {
	/**
	 * ��ʾȫ������
	 */
	public List<Product> showOrderdetails(Integer pageIndex , Integer pageCount) throws Exception;

	public int count() throws Exception;
}
