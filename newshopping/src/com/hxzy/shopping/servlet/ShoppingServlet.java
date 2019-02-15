package com.hxzy.shopping.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.google.gson.Gson;
import com.hxzy.shopping.entity.Admin;
import com.hxzy.shopping.entity.Orders;
import com.hxzy.shopping.entity.Product;
import com.hxzy.shopping.entity.ProductPage;
import com.hxzy.shopping.entity.Subtypes;
import com.hxzy.shopping.page.OrderdetailsPage;
import com.hxzy.shopping.service.AdminService;
import com.hxzy.shopping.service.OrderdetailsService;
import com.hxzy.shopping.service.OrdersService;
import com.hxzy.shopping.service.ProductService;
import com.hxzy.shopping.service.SubtypesService;
import com.hxzy.shopping.service.impl.AdminServiceImpl;
import com.hxzy.shopping.service.impl.OrderdetailsServiceImpl;
import com.hxzy.shopping.service.impl.OrdersServiceImpl;
import com.hxzy.shopping.service.impl.ProductServiceImpl;
import com.hxzy.shopping.service.impl.SubtypesServiceImpl;

public class ShoppingServlet extends HttpServlet {
	AdminService adminService = new AdminServiceImpl();
	ProductService productService = new ProductServiceImpl();
	SubtypesService subtypesService = new SubtypesServiceImpl();
	OrdersService ordersService = new OrdersServiceImpl();
	OrderdetailsService orderdetailsService = new OrderdetailsServiceImpl();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	PrintWriter writer;
	String path;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("shopping+++++++++++++++++++++++++++++++++++++++++++++++++");
		String type = request.getParameter("type");
		path=request.getServletContext().getContextPath();//获取根目录
		writer = response.getWriter();
		if(type.equals("login")){
			login(request, response);
		}else if(type.equals("product")){
			PageProduct(request, response);
		}else if(type.equals("showsubtypes")){
			showsubtypes(request, response);
		}else if(type.equals("showOrders")){
			showOrders(request, response);
		}else if(type.equals("ajax")){
			ajax(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	// 登录
	public void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String adminid = request.getParameter("username");
		String password = request.getParameter("password");
		Admin admin = adminService.Login(adminid, password);
		if(admin!=null){
			request.getSession().setAttribute("admin", admin);
			response.sendRedirect("admin/home.jsp");
		}else{
			writer.print("<script type='text/javascript'>alert('用户名或密码不正确');location.href='admin/index.jsp';</script>");
		}
	}
	
	
	//分页展示商品
	public void PageProduct(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProductPage page = new ProductPage();
		//需要当前页（从前台传递过来） PageIndex
		String pageIndex = request.getParameter("pageIndex");
		if(pageIndex == null){
			pageIndex = "1";
		}
		page.setPageIndex(Integer.parseInt(pageIndex));
		//数据一共多少条 totalCout
		page.setTotalCount(productService.count());
		//需要一页几条数据（自己设置） pageCount
		page.setPageCount(2);
		//数据
		 page.setProducts(productService.showAllProducts(page.getPageIndex(), page.getPageCount())); 
		 request.getSession().setAttribute("pageproduct", page);
		 response.sendRedirect(path+"/admin/product/list.jsp");   //   /newshopping/admin/product/list.jsp
	}
	//显示修改商品下拉列表
	public void showsubtypes(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取下拉列表
		List<Subtypes> list = subtypesService.showAllSubtypes();
		request.getSession().setAttribute("showSubtype", list);
		
		
		//获取其他数据
		String productPid = request.getParameter("pid"); //获取需要编辑的商品的主键
		System.out.println(productPid);
		Product list2 = productService.showOneProductByID(Integer.parseInt(productPid));
		request.getSession().setAttribute("showProduct", list2);
		//返回
		response.sendRedirect(path+"/admin/product/edit.jsp");
	}
	
	//获取全部的订单
	public void showOrders(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取订单
		List<Orders> list = ordersService.showAllOrders();
		request.getSession().setAttribute("showOrders", list);
		
		response.sendRedirect(path+"/admin/order/list.jsp");
		OrderdetailsPage page = new OrderdetailsPage();
		String pageIndex = request.getParameter("pageIndex");
		if(pageIndex == null){	
			pageIndex = "1";
		}
		page.setPageIndex(Integer.parseInt(pageIndex));
		page.setTotalCount(orderdetailsService.count());
		page.setPageCount(2);
		page.setOrderdetails(orderdetailsService.showOrderdetails(page.getPageIndex(), page.getPageCount())); 
		request.getSession().setAttribute("orderdetailsPage", page);
	}
	
	
	public void ajax(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取详情订单
		OrderdetailsPage page = new OrderdetailsPage();
		String pageIndex = request.getParameter("pageIndex");
		if(pageIndex == null){
			pageIndex = "1";
		}
		page.setPageIndex(Integer.parseInt(pageIndex));
		page.setTotalCount(orderdetailsService.count());
		page.setPageCount(2);
		page.setOrderdetails(orderdetailsService.showOrderdetails(page.getPageIndex(), page.getPageCount())); 
		Gson gson = new Gson();
		String json = gson.toJson(page);
		request.getSession().setAttribute("orderdetailsPage", page);
		writer.print(json);
	}
	
}