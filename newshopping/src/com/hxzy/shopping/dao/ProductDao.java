package com.hxzy.shopping.dao;

import java.util.List;

import com.hxzy.shopping.entity.Product;

/**
 * ��Ʒ��
 * @author Administrator
 *
 */
public interface ProductDao {
	/**
	 * ��ʾȫ����Ʒ --��ҳ��ʾ
	 */
	
	public List<Product> showAllProducts(Integer pageIndex , Integer pageCount) throws Exception;
	/**
	 * ����������
	 */
	public int count() throws Exception;
	
	/**
	 * ͨ��IDȥ�������Ӧ����
	 * ��
	 */
	public Product showOneProductByID(Integer pid) throws Exception;
}
