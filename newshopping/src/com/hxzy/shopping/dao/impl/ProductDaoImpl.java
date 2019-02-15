package com.hxzy.shopping.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.hxzy.shopping.dao.BaseDao;
import com.hxzy.shopping.dao.ProductDao;
import com.hxzy.shopping.entity.Product;
/**
 * ��Ʒ��
 * @author Administrator
 *
 */
public class ProductDaoImpl extends BaseDao implements ProductDao{
	/**
	 * ���ݷ�ҳ��ʾ��Ʒ
	 */
	@Override
	public List<Product> showAllProducts(Integer pageIndex , Integer pageCount) throws Exception{
		List<Product> list = new ArrayList<Product>();
		String sql = "SELECT * FROM (SELECT rownum r,p	.* FROM product p) WHERE r>=? AND r<=?";
		Object[] objects = {(pageIndex-1)*pageCount+1,pageIndex*pageCount};
		rs = executQuery(sql, objects);
		while(rs.next()){
			Product product = new Product();
			product.setPid(rs.getInt("pid"));
			product.setPhoto(rs.getString("photo"));
			product.setName(rs.getString("name"));
			product.setNote(rs.getString("note"));
			product.setPrice(rs.getDouble("price"));
			product.setAmount(rs.getInt("amount"));
			product.setCount(rs.getInt("count"));
			list.add(product);
		}
		closeConnection();
		return list;
	}
	/**
	 * ����������
	 */
	@Override
	public int count() throws Exception {
		int num =0;
		rs = executQuery("select count(*) from product", null);
		if(rs.next()){
			num=rs.getInt(1);
		}
		closeConnection();
		return num;
		
	}
	/**
	 * ͨ��IDȥ�������Ӧ������
	 */
	@Override
	public Product showOneProductByID(Integer pid) throws Exception {
		Object[] objects = {pid};
		executQuery("select * from product where tid=?", objects);
		Product product= null;
		while(rs.next()){
			product = new Product();
			product.setPid(rs.getInt("pid"));
			product.setPhoto(rs.getString("photo"));
			product.setName(rs.getString("name"));
			product.setNote(rs.getString("note"));
			product.setPrice(rs.getDouble("price"));
			product.setAmount(rs.getInt("amount"));
			product.setCount(rs.getInt("count"));
		}
		closeConnection();
		return product;
	}

}
