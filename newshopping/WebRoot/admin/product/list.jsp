<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<HTML>
<HEAD>
	<base href="<%=basePath%>">
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/Style1.css"
	rel="stylesheet" type="text/css" />
<script language="javascript"
	src="${pageContext.request.contextPath}/js/public.js"></script>
<script type="text/javascript">
	function addProduct() {
		window.location.href = "${pageContext.request.contextPath}/admin/product/add.jsp";
	}
</script>
</HEAD>
<body>
	<c:if test="${empty pageproduct}">
		<jsp:forward page="../../shopping?type=product"/>
	</c:if>
	<br>
	<form id="Form1" name="Form1"
		action="${pageContext.request.contextPath}/user/list.jsp"
		method="post">
		<table cellSpacing="1" cellPadding="0" width="100%" align="center"
			bgColor="#f5fafe" border="0">
			<TBODY>
				<tr>
					<td class="ta_01" align="center" bgColor="#afd1f3"><strong>商品列表</strong>
					</TD>
				</tr>
				<tr>
					<td class="ta_01" align="right">
						<button type="button" id="add" name="add" value="添加"
							class="button_add" onclick="addProduct()">
							&#28155;&#21152;</button>

					</td>
				</tr>
				<tr>
					<td class="ta_01" align="center" bgColor="#f5fafe">
						<table cellspacing="0" cellpadding="1" rules="all"
							bordercolor="gray" border="1" id="DataGrid1"
							style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">

							[当前页${pageproduct.pageIndex }/总页数${pageproduct.totalPage }]
							<c:choose>
								<c:when test="${pageproduct.pageIndex > 1}">
									<a href="shopping?type=product&pageIndex=1">首页</a>
									<a
										href="shopping?type=product&pageIndex=${pageproduct.pageIndex - 1 }">上一页</a>
								</c:when>
								<c:otherwise>
							首页 
							上一页
						</c:otherwise>
							</c:choose>
							<c:choose>
								<c:when test="${pageproduct.pageIndex < pageproduct.totalPage}">
									<a
										href="shopping?type=product&pageIndex=${pageproduct.pageIndex + 1 }">下一页</a>
									<a
										href="shopping?type=product&pageIndex=${pageproduct.totalPage }">尾页</a>
								</c:when>
								<c:otherwise>
							下一页
							尾页
						</c:otherwise>
							</c:choose>
							<tr
								style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">

								<td align="center" width="18%">序号</td>
								<td align="center" width="17%">商品图片</td>
								<td align="center" width="17%">商品名称</td>
								<td align="center" width="17%">商品价格</td>
								<td align="center" width="17%">库存数量</td>
								<td width="7%" align="center">编辑</td>
								<td width="7%" align="center">删除</td>
							</tr>
							<c:forEach items="${pageproduct.products }" var="products"
								varStatus="str">
								<tr onmouseover="this.style.backgroundColor = 'white'"
									onmouseout="this.style.backgroundColor = '#F5FAFE';">
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="18%">${str.count }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="17%"><img width="40" height="45"
										src="${products.photo }"></td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="17%">${products.name }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="17%">${products.price }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="17%">${products.amount }</td>
									<!-- 修改 -->
									<td align="center" style="HEIGHT: 22px"><a
										href="${ pageContext.request.contextPath }/shopping?type=showsubtypes&pid=${products.pid}">
											<img
											src="${pageContext.request.contextPath}/images/i_edit.gif"
											border="0" style="CURSOR: hand">
									</a></td>
									<!-- 删除 -->
									<td align="center" style="HEIGHT: 22px"><a href="#"> <img
											src="${pageContext.request.contextPath}/images/i_del.gif"
											width="16" height="16" border="0" style="CURSOR: hand">
									</a></td>
								</tr>
							</c:forEach>



						</table>
					</td>
				</tr>

			</TBODY>
		</table>
	</form>
</body>
</HTML>

