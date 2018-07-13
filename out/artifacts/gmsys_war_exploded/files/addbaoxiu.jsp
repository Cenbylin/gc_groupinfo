<%@page import="java.util.Iterator"%>
<%@page import="com.neuedu.model.*"%>
<%@page import="java.util.List" isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>集团化资产管理系统 by www.mycodes.net</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}

.tabfont01 {
	font-family: "宋体";
	font-size: 9px;
	color: #555555;
	text-decoration: none;
	text-align: center;
}

.font051 {
	font-family: "宋体";
	font-size: 12px;
	color: #333333;
	text-decoration: none;
	line-height: 20px;
}

.font201 {
	font-family: "宋体";
	font-size: 12px;
	color: #FF0000;
	text-decoration: none;
}

.button {
	font-family: "宋体";
	font-size: 14px;
	height: 37px;
}

html {
	overflow-x: auto;
	overflow-y: auto;
	border: 0;
}

-->
.atten {
	font-size: 12px;
	font-weight: normal;
	color: #F00;
}
</style>
<link rel="icon" type="image/png" href="assets/i/favicon.png">
<link rel="apple-touch-icon-precomposed"
	href="${pageContext.request.contextPath}/assets/i/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/amazeui.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/admin.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/app.css">
<script
	src="${pageContext.request.contextPath}/assets/js/echarts.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.js"></script>
<link href="${pageContext.request.contextPath}/css/style.css"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/jquery-ui-1.12.1/jquery-ui.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/jquery-ui-1.12.1/jquery-ui.theme.min.css">

<script
	src="${pageContext.request.contextPath}/jquery-ui-1.12.1/external/jquery/jquery.js"></script>
<script
	src="${pageContext.request.contextPath}/jquery-ui-1.12.1/jquery-ui.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.js"></script>
</head>
<SCRIPT language=JavaScript>
	function sousuo() {
		window.open("gaojisousuo.htm", "", "depended=0,alwaysRaised=1,width=800,height=510,location=0,menubar=0,resizable=0,scrollbars=0,status=0,toolbar=0");
	}
	function selectAll() {
		var obj = document.fom.elements;
		for (var i = 0; i < obj.length; i++) {
			if (obj[i].name == "delid") {
				obj[i].checked = true;
			}
		}
	}

	function unselectAll() {
		var obj = document.fom.elements;
		for (var i = 0; i < obj.length; i++) {
			if (obj[i].name == "delid") {
				if (obj[i].checked == true)
					obj[i].checked = false;
				else
					obj[i].checked = true;
			}
		}
	}

	function link() {
		document.getElementById("fom").action = "${pageContext.request.contextPath}/files/addcaigou.jsp";
		document.getElementById("fom").submit();
	}/* 
	function tishi() {
		var a = confirm('数据库中保存有该人员基本信息，您可以修改或保留该信息。');
		if (a != true) return false;
		window.open("冲突页.htm", "", "depended=0,alwaysRaised=1,width=800,height=400,location=0,menubar=0,resizable=0,scrollbars=0,status=0,toolbar=0");
	}

	function check() {
		document.getElementById("aa").style.display = "";
	}
	function verification() {
		var _reTimeReg = /^(\d{4})-(0\d{1}|1[0-2])-(0\d{1}|[12]\d{1}|3[01])$/;
		;
		var jhsjq = $("#TRTIME").val();
		var tcount = $('#TCOUNT').val().trim();
		var bid = $("#bidSelect").children("option:selected").val();

		if (tcount == "") {
			alert('调配数量不能为空!');
			return false;
		}
		if ($('#TRTIME').val() == "" && !_reTimeReg.test(jhsjq)) {
			alert('调配时间不能为空!且格式为：yyyy-MM-dd');
			return false;
		}
		return true;
	}
	$(function() {
		$("#bidSelect").change(function() {
			var value = $(this).children("option:selected").val();
			$.ajax({
				url : '${pageContext.request.contextPath}/buy/checkBalance.do',
				type : 'GET',
				dataType : 'JSON',
				async : false,
				data : {
					id : value
				},
			})
				.done(function(res) {
					$("#note").text("当前剩余数量为：" + res.count);
				});
		})
	}) */
</SCRIPT>
<body class="ContentBody" data-type="index">
	<header class="am-topbar am-topbar-inverse admin-header">
	<div class="am-topbar-brand">
		<a href="javascript:;" class="tpl-logo" style="margin-top: 30px;">
			<img src="${pageContext.request.contextPath}/assets/img/logo.png"
			alt="">
		</a>
	</div>
	<div
		class="am-icon-list tpl-header-nav-hover-ico am-fl am-margin-right"
		style="margin-top: 35px;"></div>

	<button
		class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only"
		data-am-collapse="{target: '#topbar-collapse'}">
		<span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span>
	</button>

	<div class="am-collapse am-topbar-collapse" id="topbar-collapse">

		<ul
			class="am-nav am-nav-pills am-topbar-nav am-topbar-right admin-header-list tpl-header-list">
			<li class="am-dropdown" data-am-dropdown data-am-dropdown-toggle>
				<a class="am-dropdown-toggle tpl-header-list-link"
				href="javascript:;"> <span class="am-icon-bell-o"></span> 提醒 <span
					class="am-badge tpl-badge-success am-round">5</span></span>
			</a>
				<ul class="am-dropdown-content tpl-dropdown-content">
					<li class="tpl-dropdown-content-external">
						<h3>
							你有 <span class="tpl-color-success">5</span> 条提醒
						</h3> <a href="###">全部</a>
					</li>
					<li class="tpl-dropdown-list-bdbc"><a href="#"
						class="tpl-dropdown-list-fl"><span
							class="am-icon-btn am-icon-plus tpl-dropdown-ico-btn-size tpl-badge-success"></span>
							【预览模块】移动端 查看时 手机、电脑框隐藏。</a> <span class="tpl-dropdown-list-fr">3小时前</span>
					</li>
					<li class="tpl-dropdown-list-bdbc"><a href="#"
						class="tpl-dropdown-list-fl"><span
							class="am-icon-btn am-icon-check tpl-dropdown-ico-btn-size tpl-badge-danger"></span>
							移动端，导航条下边距处理</a> <span class="tpl-dropdown-list-fr">15分钟前</span></li>
					<li class="tpl-dropdown-list-bdbc"><a href="#"
						class="tpl-dropdown-list-fl"><span
							class="am-icon-btn am-icon-bell-o tpl-dropdown-ico-btn-size tpl-badge-warning"></span>
							追加统计代码</a> <span class="tpl-dropdown-list-fr">2天前</span></li>
				</ul>
			</li>
			<li class="am-dropdown" data-am-dropdown data-am-dropdown-toggle>
				<a class="am-dropdown-toggle tpl-header-list-link"
				href="javascript:;"> <span class="am-icon-comment-o"></span> 消息
					<span class="am-badge tpl-badge-danger am-round">9</span></span>
			</a>
				<ul class="am-dropdown-content tpl-dropdown-content">
					<li class="tpl-dropdown-content-external">
						<h3>
							你有 <span class="tpl-color-danger">9</span> 条新消息
						</h3> <a href="###">全部</a>
					</li>
					<li><a href="#" class="tpl-dropdown-content-message"> <span
							class="tpl-dropdown-content-photo"> <img
								src="assets/img/user02.png" alt="">
						</span> <span class="tpl-dropdown-content-subject"> <span
								class="tpl-dropdown-content-from"> 禁言小张 </span> <span
								class="tpl-dropdown-content-time">10分钟前 </span>
						</span> <span class="tpl-dropdown-content-font"> Amaze UI 的诞生，依托于
								GitHub 及其他技术社区上一些优秀的资源；Amaze UI 的成长，则离不开用户的支持。 </span>
					</a> <a href="#" class="tpl-dropdown-content-message"> <span
							class="tpl-dropdown-content-photo"> <img
								src="assets/img/user03.png" alt="">
						</span> <span class="tpl-dropdown-content-subject"> <span
								class="tpl-dropdown-content-from"> Steam </span> <span
								class="tpl-dropdown-content-time">18分钟前</span>
						</span> <span class="tpl-dropdown-content-font"> 为了能最准确的传达所描述的问题，
								建议你在反馈时附上演示，方便我们理解。 </span>
					</a></li>

				</ul>
			</li>
			<li class="am-dropdown" data-am-dropdown data-am-dropdown-toggle>
				<a class="am-dropdown-toggle tpl-header-list-link"
				href="javascript:;"> <span class="am-icon-calendar"></span> 进度 <span
					class="am-badge tpl-badge-primary am-round">4</span></span>
			</a>
				<ul class="am-dropdown-content tpl-dropdown-content">
					<li class="tpl-dropdown-content-external">
						<h3>
							你有 <span class="tpl-color-primary">4</span> 个任务进度
						</h3> <a href="###">全部</a>
					</li>
					<li><a href="javascript:;"
						class="tpl-dropdown-content-progress"> <span class="task">
								<span class="desc">Amaze UI 用户中心 v1.2 </span> <span
								class="percent">45%</span>
						</span> <span class="progress">
								<div class="am-progress tpl-progress am-progress-striped">
									<div class="am-progress-bar am-progress-bar-success"
										style="width:45%"></div>
								</div>
						</span>
					</a></li>
					<li><a href="javascript:;"
						class="tpl-dropdown-content-progress"> <span class="task">
								<span class="desc">新闻内容页 </span> <span class="percent">30%</span>
						</span> <span class="progress">
								<div class="am-progress tpl-progress am-progress-striped">
									<div class="am-progress-bar am-progress-bar-secondary"
										style="width:30%"></div>
								</div>
						</span>
					</a></li>
					<li><a href="javascript:;"
						class="tpl-dropdown-content-progress"> <span class="task">
								<span class="desc">管理中心 </span> <span class="percent">60%</span>
						</span> <span class="progress">
								<div class="am-progress tpl-progress am-progress-striped">
									<div class="am-progress-bar am-progress-bar-warning"
										style="width:60%"></div>
								</div>
						</span>
					</a></li>

				</ul>
			</li>
			<li class="am-hide-sm-only"><a href="javascript:;"
				id="admin-fullscreen" class="tpl-header-list-link"><span
					class="am-icon-arrows-alt"></span> <span class="admin-fullText">开启全屏</span></a></li>

			<li class="am-dropdown" data-am-dropdown data-am-dropdown-toggle>
				<a class="am-dropdown-toggle tpl-header-list-link"
				href="javascript:;"> <span class="tpl-header-list-user-nick">用户id</span><span
					class="tpl-header-list-user-ico"> <img
						src="assets/img/user01.png"></span>
			</a>
				<ul class="am-dropdown-content">
					<li><a href="#"><span class="am-icon-bell-o"></span> 资料</a></li>
					<li><a href="#"><span class="am-icon-cog"></span> 设置</a></li>
					<li><a href="#"><span class="am-icon-power-off"></span> 退出</a></li>
				</ul>
			</li>
			<li><a href="###" class="tpl-header-list-link"><span
					class="am-icon-sign-out tpl-header-list-ico-out-size"></span></a></li>
		</ul>
	</div>
	</header>




        <div class="tpl-left-nav tpl-left-nav-hover">
            <div class="tpl-left-nav-title">
                Amaze UI 列表
            </div>
            <div class="tpl-left-nav-list">
                <ul class="tpl-left-nav-menu">
                    <li class="tpl-left-nav-item">
                        <a href="javascript:;" class="nav-link tpl-left-nav-link-list">
                            <i class="am-icon-home"></i>
                            <span>基础数据管理</span>
			    <i class="am-icon-angle-right tpl-left-nav-more-ico am-fr am-margin-right"></i>
                        </a>
			<ul class="tpl-left-nav-sub-menu">
                            <li>
                                <a href="${pageContext.request.contextPath}/category/findAll.do">
                                    <i class="am-icon-angle-right"></i>
                                    <span>资产分类设置</span>
                                    <i class="tpl-left-nav-content tpl-badge-success"></i>
                                </a>
                                <a href="${pageContext.request.contextPath}/department/findAll.do">
                                    <i class="am-icon-angle-right"></i>
                                    <span>部门设置</span>
                                    <i class="tpl-left-nav-content tpl-badge-success"></i>
                                <a href="${pageContext.request.contextPath}/files/addzc.jsp">
                                     <i class="am-icon-angle-right"></i>
                                        <span>资产录入</span>
                                     <i class="tpl-left-nav-content tpl-badge-primary"></i>
                                <a href="${pageContext.request.contextPath}/area/list.do">
                                     <i class="am-icon-angle-right"></i>
                                     <span>区域管理</span>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li class="tpl-left-nav-item">
                        <a href="javascript:;" class="nav-link tpl-left-nav-link-list">
                            <i class="am-icon-bar-chart"></i>
                            <span>资产管理</span>
                            <i class="am-icon-angle-right tpl-left-nav-more-ico am-fr am-margin-right"></i>
                        </a>
    			<ul class="tpl-left-nav-sub-menu">
                            <li>
                                <a href="${pageContext.request.contextPath}/buy/findAll.do">
                                    <i class="am-icon-angle-right"></i>
                                    <span>采购管理</span>
                                    <i class="tpl-left-nav-content tpl-badge-success"></i>
                                </a>
                                <a href="${pageContext.request.contextPath}/check/findAll.do">
                                    <i class="am-icon-angle-right"></i>
                                    <span>盘点管理</span>
                                    <i class="tpl-left-nav-content tpl-badge-success"></i>
                                <a href="${pageContext.request.contextPath}/translate/findAll.do">
                                     <i class="am-icon-angle-right"></i>
                                        <span>跨部门调配管理</span>
                                     <i class="tpl-left-nav-content tpl-badge-primary"></i>
                                <a href="${pageContext.request.contextPath}/Repair/findAll2.do">
                                     <i class="am-icon-angle-right"></i>
                                     <span>报修管理</span>
                                </a>
								<a href="${pageContext.request.contextPath}/scrap/findAll2.do">
                                     <i class="am-icon-angle-right"></i>
                                     <span>报废管理</span>
                                </a>
                            </li>
                        </ul>
                    </li>

                    <li class="tpl-left-nav-item">
                        <a href="javascript:;" class="nav-link tpl-left-nav-link-list">
                            <i class="am-icon-table"></i>
                            <span>使用统计</span>
                            <i class="am-icon-angle-right tpl-left-nav-more-ico am-fr am-margin-right"></i>
                        </a>
                        <ul class="tpl-left-nav-sub-menu">
                            <li>
                                <a href="${pageContext.request.contextPath}/Balance/findAll.do">
                                    <i class="am-icon-angle-right"></i>
                                    <span>资产总数</span>
                                    <i class="tpl-left-nav-content tpl-badge-success"></i>
                                </a>
                                <a href="${pageContext.request.contextPath}/buy/findAll2.do">
                                    <i class="am-icon-angle-right"></i>
                                    <span>采购记录</span>
                                    <i class="tpl-left-nav-content tpl-badge-success"></i>
                                <a href="${pageContext.request.contextPath}/translate/findAll2.do">
                                     <i class="am-icon-angle-right"></i>
                                        <span>跨部门调配记录</span>
                                     <i class="tpl-left-nav-content tpl-badge-primary"></i>
                                <a href="${pageContext.request.contextPath}/Repair/findAll.do">
                                     <i class="am-icon-angle-right"></i>
                                     <span>报修记录</span>
                                </a>
								<a href="${pageContext.request.contextPath}/scrap/findAll.do">
                                     <i class="am-icon-angle-right"></i>
                                     <span>报废记录</span>
                                </a>
                            </li>
                        </ul>
                    </li>

                    <li class="tpl-left-nav-item">
                        <a href="javascript:;" class="nav-link tpl-left-nav-link-list">
                            <i class="am-icon-wpforms"></i>
                            <span>供应商管理</span>
                            <i class="am-icon-angle-right tpl-left-nav-more-ico am-fr am-margin-right"></i>
                        </a>
                        <ul class="tpl-left-nav-sub-menu">
                            <li>
                                <a href="${pageContext.request.contextPath}/provider/findAll.do">
                                    <i class="am-icon-angle-right"></i>
                                    <span>供应商信息查看</span>
                                    <i class="tpl-left-nav-content tpl-badge-success"></i>
                                </a>
                                <a href="${pageContext.request.contextPath}/product/findAll.do">
                                    <i class="am-icon-angle-right"></i>
                                    <span>产品信息查看</span>
                                    <i class="tpl-left-nav-content tpl-badge-success"></i>
                            </li>
                        </ul>
                    </li>

                    <li class="tpl-left-nav-item">
                        <a href="login.html" class="nav-link tpl-left-nav-link-list">
                            <i class="am-icon-key"></i>
                            <span>登录</span>

                        </a>
                    </li>
                </ul>
            </div>
        </div>






		<%--内容 --%>
		<div class="tpl-content-wrapper">

			<form action="${pageContext.request.contextPath}/Repair/add.do"
				method="post" name="form" >
				<div class="MainDiv">
					<table width="99%" border="0" cellpadding="0" cellspacing="0"
						class="CContent">
						<tr>
							<th class="tablestyle_title">报修记录添加页面</th>
						</tr>
						<tr>
							<td class="CPanel">

								<table border="0" cellpadding="0" cellspacing="0"
									style="width:100%"></table>
							</td>
						</tr>
						<tr>
							<td align="left">
								<!-- <input type="button" name="Submit" value="保存" class="button" onclick="alert('保存成功！');" />  -->
								<input type="button" name="Submit2" value="返回" class="button"
								onclick="window.history.go(-1);" />
							</td>
						</tr>

						<TR>
							<TD width="100%">
								<fieldset style="height:100%;">
									<legend>添加报修信息</legend>
									<table border="0" cellpadding="2" cellspacing="1"
										style="width:100%">
										<tr>

											<td width="16%" align="right" nowrap="nowrap">报修数量:</td>
											<td width="34%"><input class="text" id="rcount"
												name='rcount' style="width:154px" value="" /></td>
										</tr>

										<tr>

											<td nowrap="nowrap" align="right">报修时间:</td>
											<td><input class="text" id="rtime" name='rtime'
												style="width:154px" value="" /></td>
										</tr>
										<tr>
											<td align="right">产品编号:</td>
											<td><select name="bid" style="width:154px">
													<%
														List<Balance> list1 = (List<Balance>) request.getAttribute("balanceList");
														Iterator<Balance> it1 = list1.iterator();
														while (it1.hasNext()) {

															Balance d = it1.next();
													%>


													<option value="<%=d.getBid()%>"><%=d.getBid()%></option>
													<%
														}
													%>
											</select></td>
										<tr>
											<td align="right">部门编号:</td>
											<td><select name="departid" style="width:154px">
													<%
														List<Department> list2 = (List<Department>) request.getAttribute("departmentList");
														Iterator<Department> it2 = list2.iterator();
														while (it2.hasNext()) {

															Department d = it2.next();
													%>


													<option value="<%=d.getDepartid()%>"><%=d.getDepartid()%></option>
													<%
														}
													%>
											</select></td>


										</tr>
										<tr><td><c:out  value="${msg }" /></td></tr>
									</table>
									<br />
								</fieldset>
							</TD>
						</TR>
						<TR>
							<TD colspan="2" align="center" height="50px"><input
								type="submit" name="Submit" value="保存" class="button" /> <input
								type="button" name="Submit2" value="返回" class="button"
								onclick="window.history.go(-1);" /></TD>
						</TR>
					</table>
				</div>
			</form>
			<script>
			
				/*
				 在网页中使用第三方js组件的开发步骤：
				    1.下载js源代码，可能包含一些主题文件(css,images,js,flash)
				    2.拷贝到项目中，项目目录下面
				    3.在页面中引入js和css
				    4.编写代码进行调用
				*/
				$(function() {
					//插件的调用  
					$("#datevalue21").datepicker({
						//在这里进行插件的属性设置 
						dateFormat : "yy-mm-dd"
					});
			
				});
			</script>



		</div>


		<script
			src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
		<script
			src="${pageContext.request.contextPath}/assets/js/amazeui.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/iscroll.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/app.js"></script>
</body>
</html>