package com.hxzy.shopping.page;

import java.util.List;

import com.hxzy.shopping.entity.Product;

public class OrderdetailsPage {
	/*
	 * ��ǰҳ��pageIndex��,ÿҳ������(PageCount)����ҳ��(totalPage)���ܼ�¼����(totalCount), ���ݼ���
	 */
	private Integer pageIndex; //��ǰҳ��
	private Integer pageCount; //ÿҳ����
	private Integer totalPage; //��ҳ��
	private Integer totalCount; // ������
	private List<Product> orderdetails; //����
	
	
	
	
	public List<Product> getOrderdetails() {
		return orderdetails;
	}
	public void setOrderdetails(List<Product> orderdetails) {
		this.orderdetails = orderdetails;
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
