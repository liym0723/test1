package com.hxzy.shopping.service;

import java.util.List;

import com.hxzy.shopping.entity.Product;

public interface ProductService {
	/**
	 * ��ʾȫ����Ʒ --��ҳ��ʾ
	 */
	
	public List<Product> showAllProducts(Integer pageIndex , Integer pageCount);
	/**
	 * ����������
	 */
	public int count();
	/**
	 * ͨ��IDȥ�������Ӧ����
	 * ��
	 */
	public Product showOneProductByID(Integer pid);
}
