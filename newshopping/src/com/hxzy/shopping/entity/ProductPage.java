package com.hxzy.shopping.entity;

import java.util.List;

/**
 * ��ҳ
 * @author Administrator
 *
 */
public class ProductPage {
	//????
	/*
	 * ��ǰҳ��pageIndex��,ÿҳ������(PageCount)����ҳ��(totalPage)���ܼ�¼����(totalCount), ���ݼ���
	 */
	private Integer pageIndex; //��ǰҳ��
	private Integer pageCount; //ÿҳ����
	private Integer totalPage; //��ҳ��
	private Integer totalCount; // ������
	private List<Product> products; //����
	
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Integer getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
		//��ȡ�������������Լ�ӻ�ȡ��ҳ�� totalCount
		//��ҳ�� = ������/ÿҳ����
		this.totalPage = (int)Math.ceil(totalCount/pageCount)+1;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	
	
}
