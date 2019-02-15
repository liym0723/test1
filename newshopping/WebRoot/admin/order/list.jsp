<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<HTML>
	<HEAD>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link href="${pageContext.request.contextPath}/css/Style1.css" rel="stylesheet" type="text/css" />
		<script language="javascript" src="${pageContext.request.contextPath}/js/public.js"></script>
		
		<!-- 弹出层插件 -->
		<link href="${pageContext.request.contextPath}/css/popup_layer.css" type="text/css" rel="stylesheet"/>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/popup_layer.js"></script>	
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.0.0min.js"></script>	
		
		
	</HEAD>
	<body>
		<c:if test="${empty showOrders }">
			<jsp:forward page="../../shopping?type=showOrders"></jsp:forward>
		</c:if>
		<form id="Form1" name="Form1" action="${pageContext.request.contextPath}/user/list.jsp" method="post">
			<table cellSpacing="1" cellPadding="0" width="100%" align="center" bgColor="#f5fafe" border="0">
				<TBODY>
					<tr>
						<td class="ta_01" align="center" bgColor="#afd1f3">
							<strong>订单列表</strong>
						</TD>
					</tr>
					
					<tr>
						<td class="ta_01" align="center" bgColor="#f5fafe">
							<table cellspacing="0" cellpadding="1" rules="all"
								bordercolor="gray" border="1" id="DataGrid1"
								style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
								<tr
									style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">

									<td align="center" width="10%">
										序号
									</td>
									<td align="center" width="10%">
										订单编号
									</td>
									<td align="center" width="10%">
										提交日期
									</td>
									<td align="center" width="10%">
										收货人
									</td>
									<td align="center" width="10%">
										订单留言
									</td>
									<td align="center" width="50%">
										订单详情
									</td>
								</tr>
								<c:forEach  items="${showOrders}" var="show"  varStatus="num">
									<tr onmouseover="this.style.backgroundColor = 'white'"
									onmouseout="this.style.backgroundColor = '#F5FAFE';">
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="18%">
										${num.count }
									</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="17%">
										${show.oid }
									</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="17%">
										${show.subDate}
									</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="17%">
										${show.mid}
									</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="17%">
										${show.note}
									</td>
									<td align="center" style="HEIGHT: 22px">
										<input type="button" value="订单详情" class="clickedElement" />
									</td>
					
								</tr>
							</c:forEach>
								
								
							</table>
						</td>
					</tr>
					
				</TBODY>
			</table>
		</form>
		
		<!-- 弹出层 HaoHao added -->
        <div id="showDiv" class="blk" style="display:none;">
            <div class="main">
                <h2>订单编号：<span id="shodDivOid" style="font-size: 13px;color: #999">123456789</span></h2>
                <a href="javascript:void(0);" id="closeBtn" class="closeBtn">关闭</a>
               
				<div style="padding:20px;">
					<table id="showDivTab" style="width:100%">
							<th width='20%'>图片</th>
							<th width='25%'>商品</th>
							<th width='20%'>价格</th>
							<th width='15%'>数量</th>
							<th width='20%'>小计</th>
						</tr>
						
						
						<c:forEach var="list" items="${orderdetailsPage.orderdetails}" varStatus="num">
							<tr style='text-align: center;' id="showProduct">
								<td>
									<img src='${pageContext.request.contextPath }/${list.photo}' width='70' height='60'>
								</td>
								<td><a target='_blank'>${list.name }</a></td>
								<td>${list.price }</td>
								<td>${list.shoppingNumber }</td>
								<td><span class='subtotal'>${list.subtotal}元</span></td>
							</tr>
						</c:forEach>
				
								
						[当前页<span id="ind">${orderdetailsPage.pageIndex }</span>/总页数${orderdetailsPage.totalPage}]
							<c:choose>
								<c:when test="${orderdetailsPage.pageIndex > 1}">
									<b id="1">首页</b>
									<b id="${orderdetailsPage.pageIndex - 1 }">上一页</b>
								</c:when>
								<c:otherwise>
							首页 
							上一页
						</c:otherwise>
							</c:choose>
							<c:choose>
								<c:when test="${orderdetailsPage.pageIndex < orderdetailsPage.totalPage}">
									<b id="${orderdetailsPage.pageIndex + 1 }">下一页</b>
									<b id="${orderdetailsPage.totalPage }">尾页</b>
								</c:when>
								<c:otherwise>
							下一页
							尾页
						</c:otherwise>
						</c:choose>
					</table>
				</div>
            </div>
            
        </div>
		<!-- 调用插件弹出层的方法 -->
		<script type="text/javascript">
			var index;
			$(function(){
				//弹出层插件调用
				new PopupLayer({
					trigger:".clickedElement",
					popupBlk:"#showDiv",
					closeBtn:"#closeBtn",
					useOverlay:true
				});
				
			});
			
			$("b").click(function(){
				index = $(this).attr("id");
				alert(index);
				var con="";
				
				$.post(
						'${pageContext.request.contextPath}/shopping?type=ajax',
						'pageIndex='+index,
						function(date){
							for(var i=0;i<date.orderdetails.length;i++){
								alert(date.orderdetails[i].name+"====="+date.orderdetails[i].price);
								con+="<td>"+
								"<img src='${pageContext.request.contextPath }/"+date.orderdetails.photo+"' width='70' height='60'>"+
								"</td>"+
								"<td><a target='_blank'>"+date.orderdetails.name+"</a></td>"+
								"<td>￥"+date.orderdetails.price+"</td>"+
								"<td>"+date.orderdetails.shoppingNumber+"</td>"+
								"<td><span class='subtotal'>￥"+date.orderdetails.subtotal+"</span></td>"
							}
						},"json"
						)
					$("#showProduct").html(con);
					$("#ind").html(index);
			})
			
		</script>
		
	</body>
 

