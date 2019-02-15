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
		path=request.getServletContext().getContextPath();//��ȡ��Ŀ¼
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
	// ��¼
	public void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String adminid = request.getParameter("username");
		String password = request.getParameter("password");
		Admin admin = adminService.Login(adminid, password);
		if(admin!=null){
			request.getSession().setAttribute("admin", admin);
			response.sendRedirect("admin/home.jsp");
		}else{
			writer.print("<script type='text/javascript'>alert('�û��������벻��ȷ');location.href='admin/index.jsp';</script>");
		}
	}
	
	
	//��ҳչʾ��Ʒ
	public void PageProduct(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProductPage page = new ProductPage();
		//��Ҫ��ǰҳ����ǰ̨���ݹ����� PageIndex
		String pageIndex = request.getParameter("pageIndex");
		if(pageIndex == null){
			pageIndex = "1";
		}
		page.setPageIndex(Integer.parseInt(pageIndex));
		//����һ�������� totalCout
		page.setTotalCount(productService.count());
		//��Ҫһҳ�������ݣ��Լ����ã� pageCount
		page.setPageCount(2);
		//����
		 page.setProducts(productService.showAllProducts(page.getPageIndex(), page.getPageCount())); 
		 request.getSession().setAttribute("pageproduct", page);
		 response.sendRedirect(path+"/admin/product/list.jsp");   //   /newshopping/admin/product/list.jsp
	}
	//��ʾ�޸���Ʒ�����б�
	public void showsubtypes(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��ȡ�����б�
		List<Subtypes> list = subtypesService.showAllSubtypes();
		request.getSession().setAttribute("showSubtype", list);
		
		
		//��ȡ��������
		String productPid = request.getParameter("pid"); //��ȡ��Ҫ�༭����Ʒ������
		System.out.println(productPid);
		Product list2 = productService.showOneProductByID(Integer.parseInt(productPid));
		request.getSession().setAttribute("showProduct", list2);
		//����
		response.sendRedirect(path+"/admin/product/edit.jsp");
	}
	
	//��ȡȫ���Ķ���
	public void showOrders(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��ȡ����
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
		//��ȡ���鶩��
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