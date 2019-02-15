package com.hxzy.shopping.page;

import java.util.List;

import com.hxzy.shopping.entity.Product;

public class OrderdetailsPage {
	/*
	 * 当前页（pageIndex）,每页数据数(PageCount)，总页数(totalPage)，总记录条数(totalCount), 数据集合
	 */
	private Integer pageIndex; //当前页数
	private Integer pageCount; //每页条数
	private Integer totalPage; //总页数
	private Integer totalCount; // 总条数
	private List<Product> orderdetails; //数据
	
	
	
	
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
		//获取到了总条数可以间接获取总页数 totalCount
		//总页数 = 总条数/每页条数
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
