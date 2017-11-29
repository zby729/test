<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="com.legou.modules.user.entity.User" %>
<%@ page import="java.util.Date" %>
<%
	String path = request.getContextPath();
	User myself = new User();
	myself = (User)session.getAttribute("myself");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>乐购</title>
<link rel="stylesheet" href="<%=path%>/static/assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="<%=path%>/static/css/header.css">
<link rel="stylesheet" href="<%=path%>/static/css/index.css">
<link rel="stylesheet" href="<%=path%>/static/css/footer.css">
<link rel="stylesheet" href="<%=path%>/static/css/common.css">
</head>
<body>
	<div id="max-wai">
		<div id="header">
			<div id="header-top">
				<div class="header-top-left">
				<%if (myself == null){ %>
					<span><a href="<%=path %>/login">亲，请登录</a></span> <span><a
						href="<%=path %>/register">免费注册</a></span>
				<%} else{
					%>
						<span><a href="#"><%
						Date d = new Date();
						int hours = d.getHours();
						if (hours >= 0 && hours<6){
							%>
							<%="&nbsp;&nbsp;&nbsp;&nbsp; 凌晨好!" %>
							<%
						} else if (hours < 12){
							%>
							<%="&nbsp;&nbsp;&nbsp;&nbsp; 上午好!" %>
							<%
						} else if (hours < 14){
							%>
							<%="&nbsp;&nbsp;&nbsp;&nbsp; 中午好!" %>
							<%
						} else if (hours < 18){
							%>
							<%="&nbsp;&nbsp;&nbsp;&nbsp; 下午好!" %>
							<%
						} else {
							%>
							<%="&nbsp;&nbsp;&nbsp;&nbsp; 晚上好!" %>
							<%
							
						}
						%><%=myself.getName() %></a></span>
					<%
				} %>
				</div>
				<div class="header-top-right">
					<div class="header-box">
						<a href="index.html">商城首页</a>
					</div>
					<div class="header-box">
						<span></span> <a href="html/personal_information.html"
							target="_blank">个人中心</a>
					</div>
					<div class="header-box">
						<span></span> <a href="html/shoppingCar.html" target="_blank">购物车</a>
					</div>
				</div>
			</div>
			<div id="header-center">
				<div class="header-logo">
					<div class="logo-img">
						<img src="<%=path%>/static/img/logo.png">
					</div>
					<div class="logo-word">
						<span>乐购</span>
					</div>
				</div>
				<div class="header-search">
					<input type="text" class="simple-search" name="simple-search"
						placeholder="搜索">
					<button class="in-btn">搜索</button>
				</div>
			</div>
			<div class="long-title">
				<div class="all-goods">
					<ul>
						<li>全部分类</li>
					</ul>
				</div>
			</div>
			<div id="header-bottom">
				<div class="pro subpage">
					<ul class="prosul clearfix" id="proinfo">
						<!--1-->
						<li class="prosul-li"><a href="#" id="">服装</a><i>&gt;</i> <a
							href="#" id="">鞋靴</a><i>&gt;</i> <a href="#" id="">箱包</a><i>&gt;</i>
							<div class="prosmore hide">
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女装</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">羽绒服</a></li>
											<li><a href="#" id="">棉衣</a></li>
											<li><a href="#" id="">连衣裙</a></li>
											<li><a href="#" id="">卫衣</a></li>
											<li><a href="#" id="">短外套</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男装</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">羽绒服</a></li>
											<li><a href="#" id="">棉衣</a></li>
											<li><a href="#" id="">针织衫</a></li>
											<li><a href="#" id="">夹克</a></li>
											<li><a href="#" id="">羊毛衫</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">内衣</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">保暖内衣</a></li>
											<li><a href="#" id="">秋衣秋裤</a></li>
											<li><a href="#" id="">睡衣/家居服</a></li>
											<li><a href="#" id="">打底裤袜</a></li>
											<li><a href="#" id="">休闲棉袜</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女鞋</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">单鞋</a></li>
											<li><a href="#" id="">休闲鞋</a></li>
											<li><a href="#" id="">运动鞋</a></li>
											<li><a href="#" id="">凉鞋</a></li>
											<li><a href="#" id="">靴子</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男鞋</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">休闲包</a></li>
											<li><a href="#" id="">商务休闲鞋</a></li>
											<li><a href="#" id="">皮鞋</a></li>
											<li><a href="#" id="">帆布鞋</a></li>
											<li><a href="#" id="">拖鞋/人字拖</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">单肩包</a></li>
											<li><a href="#" id="">手提包</a></li>
											<li><a href="#" id="">斜挎包</a></li>
											<li><a href="#" id="">双肩包</a></li>
											<li><a href="#" id="">钱包/卡包</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">公文包</a></li>
											<li><a href="#" id="">单肩/斜挎包</a></li>
											<li><a href="#" id="">男士手包</a></li>
											<li><a href="#" id="">双肩包</a></li>
											<li><a href="#" id="">钱包/卡包</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">功能箱包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">拉杆箱钱包/卡包拉杆包</a></li>
											<li><a href="#" id="">旅行包</a></li>
											<li><a href="#" id="">电脑包</a></li>
											<li><a href="#" id="">休闲运动包</a></li>
											<li><a href="#" id="">相机包</a></li>
										</ul>
									</div>
								</div>
							</div></li>

						<!--2-->
						<li class="prosul-li"><a href="#" id="">服装</a><i>&gt;</i> <a
							href="#" id="">鞋靴</a><i>&gt;</i> <a href="#" id="">箱包</a><i>&gt;</i>
							<div class="prosmore hide">
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女装</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">羽绒服</a></li>
											<li><a href="#" id="">棉衣</a></li>
											<li><a href="#" id="">连衣裙</a></li>
											<li><a href="#" id="">卫衣</a></li>
											<li><a href="#" id="">短外套</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男装</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">羽绒服</a></li>
											<li><a href="#" id="">棉衣</a></li>
											<li><a href="#" id="">针织衫</a></li>
											<li><a href="#" id="">夹克</a></li>
											<li><a href="#" id="">羊毛衫</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">内衣</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">保暖内衣</a></li>
											<li><a href="#" id="">秋衣秋裤</a></li>
											<li><a href="#" id="">睡衣/家居服</a></li>
											<li><a href="#" id="">打底裤袜</a></li>
											<li><a href="#" id="">休闲棉袜</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女鞋</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">单鞋</a></li>
											<li><a href="#" id="">休闲鞋</a></li>
											<li><a href="#" id="">运动鞋</a></li>
											<li><a href="#" id="">凉鞋</a></li>
											<li><a href="#" id="">靴子</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男鞋</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">休闲包</a></li>
											<li><a href="#" id="">商务休闲鞋</a></li>
											<li><a href="#" id="">皮鞋</a></li>
											<li><a href="#" id="">帆布鞋</a></li>
											<li><a href="#" id="">拖鞋/人字拖</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">单肩包</a></li>
											<li><a href="#" id="">手提包</a></li>
											<li><a href="#" id="">斜挎包</a></li>
											<li><a href="#" id="">双肩包</a></li>
											<li><a href="#" id="">钱包/卡包</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">公文包</a></li>
											<li><a href="#" id="">单肩/斜挎包</a></li>
											<li><a href="#" id="">男士手包</a></li>
											<li><a href="#" id="">双肩包</a></li>
											<li><a href="#" id="">钱包/卡包</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">功能箱包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">拉杆箱钱包/卡包拉杆包</a></li>
											<li><a href="#" id="">旅行包</a></li>
											<li><a href="#" id="">电脑包</a></li>
											<li><a href="#" id="">休闲运动包</a></li>
											<li><a href="#" id="">相机包</a></li>
										</ul>
									</div>
								</div>
							</div></li>

						<!--3-->
						<li class="prosul-li"><a href="#" id="">服装</a><i>&gt;</i> <a
							href="#" id="">鞋靴</a><i>&gt;</i> <a href="#" id="">箱包</a><i>&gt;</i>
							<div class="prosmore hide">
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女装</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">羽绒服</a></li>
											<li><a href="#" id="">棉衣</a></li>
											<li><a href="#" id="">连衣裙</a></li>
											<li><a href="#" id="">卫衣</a></li>
											<li><a href="#" id="">短外套</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男装</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">羽绒服</a></li>
											<li><a href="#" id="">棉衣</a></li>
											<li><a href="#" id="">针织衫</a></li>
											<li><a href="#" id="">夹克</a></li>
											<li><a href="#" id="">羊毛衫</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">内衣</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">保暖内衣</a></li>
											<li><a href="#" id="">秋衣秋裤</a></li>
											<li><a href="#" id="">睡衣/家居服</a></li>
											<li><a href="#" id="">打底裤袜</a></li>
											<li><a href="#" id="">休闲棉袜</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女鞋</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">单鞋</a></li>
											<li><a href="#" id="">休闲鞋</a></li>
											<li><a href="#" id="">运动鞋</a></li>
											<li><a href="#" id="">凉鞋</a></li>
											<li><a href="#" id="">靴子</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男鞋</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">休闲包</a></li>
											<li><a href="#" id="">商务休闲鞋</a></li>
											<li><a href="#" id="">皮鞋</a></li>
											<li><a href="#" id="">帆布鞋</a></li>
											<li><a href="#" id="">拖鞋/人字拖</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">单肩包</a></li>
											<li><a href="#" id="">手提包</a></li>
											<li><a href="#" id="">斜挎包</a></li>
											<li><a href="#" id="">双肩包</a></li>
											<li><a href="#" id="">钱包/卡包</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">公文包</a></li>
											<li><a href="#" id="">单肩/斜挎包</a></li>
											<li><a href="#" id="">男士手包</a></li>
											<li><a href="#" id="">双肩包</a></li>
											<li><a href="#" id="">钱包/卡包</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">功能箱包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">拉杆箱钱包/卡包拉杆包</a></li>
											<li><a href="#" id="">旅行包</a></li>
											<li><a href="#" id="">电脑包</a></li>
											<li><a href="#" id="">休闲运动包</a></li>
											<li><a href="#" id="">相机包</a></li>
										</ul>
									</div>
								</div>
							</div></li>

						<!--4-->
						<li class="prosul-li"><a href="#" id="">服装</a><i>&gt;</i> <a
							href="#" id="">鞋靴</a><i>&gt;</i> <a href="#" id="">箱包</a><i>&gt;</i>
							<div class="prosmore hide">
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女装</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">羽绒服</a></li>
											<li><a href="#" id="">棉衣</a></li>
											<li><a href="#" id="">连衣裙</a></li>
											<li><a href="#" id="">卫衣</a></li>
											<li><a href="#" id="">短外套</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男装</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">羽绒服</a></li>
											<li><a href="#" id="">棉衣</a></li>
											<li><a href="#" id="">针织衫</a></li>
											<li><a href="#" id="">夹克</a></li>
											<li><a href="#" id="">羊毛衫</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">内衣</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">保暖内衣</a></li>
											<li><a href="#" id="">秋衣秋裤</a></li>
											<li><a href="#" id="">睡衣/家居服</a></li>
											<li><a href="#" id="">打底裤袜</a></li>
											<li><a href="#" id="">休闲棉袜</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女鞋</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">单鞋</a></li>
											<li><a href="#" id="">休闲鞋</a></li>
											<li><a href="#" id="">运动鞋</a></li>
											<li><a href="#" id="">凉鞋</a></li>
											<li><a href="#" id="">靴子</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男鞋</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">休闲包</a></li>
											<li><a href="#" id="">商务休闲鞋</a></li>
											<li><a href="#" id="">皮鞋</a></li>
											<li><a href="#" id="">帆布鞋</a></li>
											<li><a href="#" id="">拖鞋/人字拖</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">单肩包</a></li>
											<li><a href="#" id="">手提包</a></li>
											<li><a href="#" id="">斜挎包</a></li>
											<li><a href="#" id="">双肩包</a></li>
											<li><a href="#" id="">钱包/卡包</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">公文包</a></li>
											<li><a href="#" id="">单肩/斜挎包</a></li>
											<li><a href="#" id="">男士手包</a></li>
											<li><a href="#" id="">双肩包</a></li>
											<li><a href="#" id="">钱包/卡包</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">功能箱包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">拉杆箱钱包/卡包拉杆包</a></li>
											<li><a href="#" id="">旅行包</a></li>
											<li><a href="#" id="">电脑包</a></li>
											<li><a href="#" id="">休闲运动包</a></li>
											<li><a href="#" id="">相机包</a></li>
										</ul>
									</div>
								</div>
							</div></li>

						<!--5-->
						<li class="prosul-li"><a href="#" id="">服装</a><i>&gt;</i> <a
							href="#" id="">鞋靴</a><i>&gt;</i> <a href="#" id="">箱包</a><i>&gt;</i>
							<div class="prosmore hide">
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女装</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">羽绒服</a></li>
											<li><a href="#" id="">棉衣</a></li>
											<li><a href="#" id="">连衣裙</a></li>
											<li><a href="#" id="">卫衣</a></li>
											<li><a href="#" id="">短外套</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男装</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">羽绒服</a></li>
											<li><a href="#" id="">棉衣</a></li>
											<li><a href="#" id="">针织衫</a></li>
											<li><a href="#" id="">夹克</a></li>
											<li><a href="#" id="">羊毛衫</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">内衣</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">保暖内衣</a></li>
											<li><a href="#" id="">秋衣秋裤</a></li>
											<li><a href="#" id="">睡衣/家居服</a></li>
											<li><a href="#" id="">打底裤袜</a></li>
											<li><a href="#" id="">休闲棉袜</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女鞋</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">单鞋</a></li>
											<li><a href="#" id="">休闲鞋</a></li>
											<li><a href="#" id="">运动鞋</a></li>
											<li><a href="#" id="">凉鞋</a></li>
											<li><a href="#" id="">靴子</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男鞋</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">休闲包</a></li>
											<li><a href="#" id="">商务休闲鞋</a></li>
											<li><a href="#" id="">皮鞋</a></li>
											<li><a href="#" id="">帆布鞋</a></li>
											<li><a href="#" id="">拖鞋/人字拖</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">单肩包</a></li>
											<li><a href="#" id="">手提包</a></li>
											<li><a href="#" id="">斜挎包</a></li>
											<li><a href="#" id="">双肩包</a></li>
											<li><a href="#" id="">钱包/卡包</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">公文包</a></li>
											<li><a href="#" id="">单肩/斜挎包</a></li>
											<li><a href="#" id="">男士手包</a></li>
											<li><a href="#" id="">双肩包</a></li>
											<li><a href="#" id="">钱包/卡包</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">功能箱包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">拉杆箱钱包/卡包拉杆包</a></li>
											<li><a href="#" id="">旅行包</a></li>
											<li><a href="#" id="">电脑包</a></li>
											<li><a href="#" id="">休闲运动包</a></li>
											<li><a href="#" id="">相机包</a></li>
										</ul>
									</div>
								</div>
							</div></li>

						<!--6-->
						<li class="prosul-li"><a href="#" id="">服装</a><i>&gt;</i> <a
							href="#" id="">鞋靴</a><i>&gt;</i> <a href="#" id="">箱包</a><i>&gt;</i>
							<div class="prosmore hide">
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女装</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">羽绒服</a></li>
											<li><a href="#" id="">棉衣</a></li>
											<li><a href="#" id="">连衣裙</a></li>
											<li><a href="#" id="">卫衣</a></li>
											<li><a href="#" id="">短外套</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男装</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">羽绒服</a></li>
											<li><a href="#" id="">棉衣</a></li>
											<li><a href="#" id="">针织衫</a></li>
											<li><a href="#" id="">夹克</a></li>
											<li><a href="#" id="">羊毛衫</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">内衣</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">保暖内衣</a></li>
											<li><a href="#" id="">秋衣秋裤</a></li>
											<li><a href="#" id="">睡衣/家居服</a></li>
											<li><a href="#" id="">打底裤袜</a></li>
											<li><a href="#" id="">休闲棉袜</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女鞋</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">单鞋</a></li>
											<li><a href="#" id="">休闲鞋</a></li>
											<li><a href="#" id="">运动鞋</a></li>
											<li><a href="#" id="">凉鞋</a></li>
											<li><a href="#" id="">靴子</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男鞋</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">休闲包</a></li>
											<li><a href="#" id="">商务休闲鞋</a></li>
											<li><a href="#" id="">皮鞋</a></li>
											<li><a href="#" id="">帆布鞋</a></li>
											<li><a href="#" id="">拖鞋/人字拖</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">单肩包</a></li>
											<li><a href="#" id="">手提包</a></li>
											<li><a href="#" id="">斜挎包</a></li>
											<li><a href="#" id="">双肩包</a></li>
											<li><a href="#" id="">钱包/卡包</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">公文包</a></li>
											<li><a href="#" id="">单肩/斜挎包</a></li>
											<li><a href="#" id="">男士手包</a></li>
											<li><a href="#" id="">双肩包</a></li>
											<li><a href="#" id="">钱包/卡包</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">功能箱包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">拉杆箱钱包/卡包拉杆包</a></li>
											<li><a href="#" id="">旅行包</a></li>
											<li><a href="#" id="">电脑包</a></li>
											<li><a href="#" id="">休闲运动包</a></li>
											<li><a href="#" id="">相机包</a></li>
										</ul>
									</div>
								</div>
							</div></li>

						<!--7-->
						<li class="prosul-li"><a href="#" id="">服装</a><i>&gt;</i> <a
							href="#" id="">鞋靴</a><i>&gt;</i> <a href="#" id="">箱包</a><i>&gt;</i>
							<div class="prosmore hide">
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女装</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">羽绒服</a></li>
											<li><a href="#" id="">棉衣</a></li>
											<li><a href="#" id="">连衣裙</a></li>
											<li><a href="#" id="">卫衣</a></li>
											<li><a href="#" id="">短外套</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男装</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">羽绒服</a></li>
											<li><a href="#" id="">棉衣</a></li>
											<li><a href="#" id="">针织衫</a></li>
											<li><a href="#" id="">夹克</a></li>
											<li><a href="#" id="">羊毛衫</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">内衣</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">保暖内衣</a></li>
											<li><a href="#" id="">秋衣秋裤</a></li>
											<li><a href="#" id="">睡衣/家居服</a></li>
											<li><a href="#" id="">打底裤袜</a></li>
											<li><a href="#" id="">休闲棉袜</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女鞋</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">单鞋</a></li>
											<li><a href="#" id="">休闲鞋</a></li>
											<li><a href="#" id="">运动鞋</a></li>
											<li><a href="#" id="">凉鞋</a></li>
											<li><a href="#" id="">靴子</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男鞋</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">休闲包</a></li>
											<li><a href="#" id="">商务休闲鞋</a></li>
											<li><a href="#" id="">皮鞋</a></li>
											<li><a href="#" id="">帆布鞋</a></li>
											<li><a href="#" id="">拖鞋/人字拖</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">单肩包</a></li>
											<li><a href="#" id="">手提包</a></li>
											<li><a href="#" id="">斜挎包</a></li>
											<li><a href="#" id="">双肩包</a></li>
											<li><a href="#" id="">钱包/卡包</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">公文包</a></li>
											<li><a href="#" id="">单肩/斜挎包</a></li>
											<li><a href="#" id="">男士手包</a></li>
											<li><a href="#" id="">双肩包</a></li>
											<li><a href="#" id="">钱包/卡包</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">功能箱包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">拉杆箱钱包/卡包拉杆包</a></li>
											<li><a href="#" id="">旅行包</a></li>
											<li><a href="#" id="">电脑包</a></li>
											<li><a href="#" id="">休闲运动包</a></li>
											<li><a href="#" id="">相机包</a></li>
										</ul>
									</div>
								</div>
							</div></li>

						<!--8-->
						<li class="prosul-li"><a href="#" id="">服装</a><i>&gt;</i> <a
							href="#" id="">鞋靴</a><i>&gt;</i> <a href="#" id="">箱包</a><i>&gt;</i>
							<div class="prosmore hide">
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女装</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">羽绒服</a></li>
											<li><a href="#" id="">棉衣</a></li>
											<li><a href="#" id="">连衣裙</a></li>
											<li><a href="#" id="">卫衣</a></li>
											<li><a href="#" id="">短外套</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男装</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">羽绒服</a></li>
											<li><a href="#" id="">棉衣</a></li>
											<li><a href="#" id="">针织衫</a></li>
											<li><a href="#" id="">夹克</a></li>
											<li><a href="#" id="">羊毛衫</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">内衣</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">保暖内衣</a></li>
											<li><a href="#" id="">秋衣秋裤</a></li>
											<li><a href="#" id="">睡衣/家居服</a></li>
											<li><a href="#" id="">打底裤袜</a></li>
											<li><a href="#" id="">休闲棉袜</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女鞋</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">单鞋</a></li>
											<li><a href="#" id="">休闲鞋</a></li>
											<li><a href="#" id="">运动鞋</a></li>
											<li><a href="#" id="">凉鞋</a></li>
											<li><a href="#" id="">靴子</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男鞋</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">休闲包</a></li>
											<li><a href="#" id="">商务休闲鞋</a></li>
											<li><a href="#" id="">皮鞋</a></li>
											<li><a href="#" id="">帆布鞋</a></li>
											<li><a href="#" id="">拖鞋/人字拖</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">单肩包</a></li>
											<li><a href="#" id="">手提包</a></li>
											<li><a href="#" id="">斜挎包</a></li>
											<li><a href="#" id="">双肩包</a></li>
											<li><a href="#" id="">钱包/卡包</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">公文包</a></li>
											<li><a href="#" id="">单肩/斜挎包</a></li>
											<li><a href="#" id="">男士手包</a></li>
											<li><a href="#" id="">双肩包</a></li>
											<li><a href="#" id="">钱包/卡包</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">功能箱包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">拉杆箱钱包/卡包拉杆包</a></li>
											<li><a href="#" id="">旅行包</a></li>
											<li><a href="#" id="">电脑包</a></li>
											<li><a href="#" id="">休闲运动包</a></li>
											<li><a href="#" id="">相机包</a></li>
										</ul>
									</div>
								</div>
							</div></li>

						<!--9-->
						<li class="prosul-li"><a href="#" id="">服装</a><i>&gt;</i> <a
							href="#" id="">鞋靴</a><i>&gt;</i> <a href="#" id="">箱包</a><i>&gt;</i>
							<div class="prosmore hide">
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女装</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">羽绒服</a></li>
											<li><a href="#" id="">棉衣</a></li>
											<li><a href="#" id="">连衣裙</a></li>
											<li><a href="#" id="">卫衣</a></li>
											<li><a href="#" id="">短外套</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男装</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">羽绒服</a></li>
											<li><a href="#" id="">棉衣</a></li>
											<li><a href="#" id="">针织衫</a></li>
											<li><a href="#" id="">夹克</a></li>
											<li><a href="#" id="">羊毛衫</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">内衣</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">保暖内衣</a></li>
											<li><a href="#" id="">秋衣秋裤</a></li>
											<li><a href="#" id="">睡衣/家居服</a></li>
											<li><a href="#" id="">打底裤袜</a></li>
											<li><a href="#" id="">休闲棉袜</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女鞋</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">单鞋</a></li>
											<li><a href="#" id="">休闲鞋</a></li>
											<li><a href="#" id="">运动鞋</a></li>
											<li><a href="#" id="">凉鞋</a></li>
											<li><a href="#" id="">靴子</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男鞋</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">休闲包</a></li>
											<li><a href="#" id="">商务休闲鞋</a></li>
											<li><a href="#" id="">皮鞋</a></li>
											<li><a href="#" id="">帆布鞋</a></li>
											<li><a href="#" id="">拖鞋/人字拖</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">女包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">单肩包</a></li>
											<li><a href="#" id="">手提包</a></li>
											<li><a href="#" id="">斜挎包</a></li>
											<li><a href="#" id="">双肩包</a></li>
											<li><a href="#" id="">钱包/卡包</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">男包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">公文包</a></li>
											<li><a href="#" id="">单肩/斜挎包</a></li>
											<li><a href="#" id="">男士手包</a></li>
											<li><a href="#" id="">双肩包</a></li>
											<li><a href="#" id="">钱包/卡包</a></li>
										</ul>
									</div>
								</div>
								<div class="prosmore-row">
									<div class="prosmore-row-title">
										<a href="#" id="">功能箱包</a>
									</div>
									<div class="prosmore-row-title-content">
										<ul>
											<li><a href="#" id="">拉杆箱钱包/卡包拉杆包</a></li>
											<li><a href="#" id="">旅行包</a></li>
											<li><a href="#" id="">电脑包</a></li>
											<li><a href="#" id="">休闲运动包</a></li>
											<li><a href="#" id="">相机包</a></li>
										</ul>
									</div>
								</div>
							</div></li>
					</ul>

				</div>

				<div class="banner">
					<div class="flexslider">
						<ul class="slides">
							<li class="banner1"><a href="#"><img
									src="<%=path%>/static/img/banners/ad1.jpg" /></a></li>
							<li class="banner2"><a><img
									src="<%=path%>/static/img/banners/ad2.jpg" /></a></li>
							<li class="banner3"><a><img
									src="<%=path%>/static/img/banners/ad3.jpg" /></a></li>
						</ul>
					</div>

				</div>

				<div class="show">
					<div class="show-wrap">
						<div class="member-in">
							<div class="member-show">
								<div class="member-show-img">
									<img src="<%=path%>/static/img/member-img.jpg">
								</div>
								<div class="member-show-word">hi,你好！</div>
							</div>
							<div class="member-choose">
								<button class="choose-btn">
									<a href="html/login.html">登录</a>
								</button>
								<button class="choose-btn">
									<a href="html/register.html">注册</a>
								</button>
							</div>
						</div>
						<div class="infrom">
							<div class="infrom-title">
								<span>商城头条</span>
							</div>
							<div class="infrom-content">
								<ul>
									<li><a href="#">12.12活动</a></li>
									<li><a href="#">12.12活动</a></li>
									<li><a href="#">12.12活动</a></li>
									<li><a href="#">12.12活动</a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div id="main">
			<div class="goods-show">
				<div class="row">
					<div class="row-title">
						<div class="row-title-left">
							<span class="title-all">女装</span> <span class="title-detail">每一个女孩都有一个梦</span>
						</div>
						<div class="row-title-right">
							<ul>
								<li><a href="#">上衣</a></li>
								<li><a href="#">连衣裙</a></li>
								<li><a href="#">半身裙</a></li>
								<li><a class="know-more" href="html/allGoodsShow.html"
									target="_blank">查看更多></a></li>
							</ul>
						</div>
					</div>
					<div class="row-show">
						<div class="row-show-pho">
							<div class="show-pho">
								<img src="<%=path%>/static/img/home-goods-show.png">
							</div>
						</div>
						<div class="row-show-detail">
							<div class="box">
								<div class="box-wrap">
									<div class="box-img">
										<img src="<%=path%>/static/img/1.jpg">
									</div>
									<div class="box-word">
										<div class="box-name">xxxxx</div>
										<div class="box-money">¥120</div>
									</div>
								</div>
							</div>
							<div class="box">
								<div class="box-wrap">
									<div class="box-img">
										<img src="<%=path%>/static/img/1.jpg">
									</div>
									<div class="box-word">
										<div class="box-name">xxxxx</div>
										<div class="box-money">¥120</div>
									</div>
								</div>
							</div>
							<div class="box">
								<div class="box-wrap">
									<div class="box-img">
										<img src="<%=path%>/static/img/1.jpg">
									</div>
									<div class="box-word">
										<div class="box-name">xxxxx</div>
										<div class="box-money">¥120</div>
									</div>
								</div>
							</div>
							<div class="box">
								<div class="box-wrap">
									<div class="box-img">
										<img src="<%=path%>/static/img/1.jpg">
									</div>
									<div class="box-word">
										<div class="box-name">xxxxx</div>
										<div class="box-money">¥120</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="row-title">
						<div class="row-title-left">
							<span class="title-all">女装</span> <span class="title-detail">每一个女孩都有一个梦</span>
						</div>
						<div class="row-title-right">
							<ul>
								<li><a href="#">上衣</a></li>
								<li><a href="#">连衣裙</a></li>
								<li><a href="#">半身裙</a></li>
								<li><a class="know-more">查看更多></a></li>
							</ul>
						</div>
					</div>
					<div class="row-show">
						<div class="row-show-pho">
							<div class="show-pho">
								<img src="<%=path%>/static/img/home-goods-show.png">
							</div>
						</div>
						<div class="row-show-detail">
							<div class="box">
								<div class="box-wrap">
									<div class="box-img">
										<img src="<%=path%>/static/img/1.jpg">
									</div>
									<div class="box-word">
										<div class="box-name">xxxxx</div>
										<div class="box-money">¥120</div>
									</div>
								</div>
							</div>
							<div class="box">
								<div class="box-wrap">
									<div class="box-img">
										<img src="<%=path%>/static/img/1.jpg">
									</div>
									<div class="box-word">
										<div class="box-name">xxxxx</div>
										<div class="box-money">¥120</div>
									</div>
								</div>
							</div>
							<div class="box">
								<div class="box-wrap">
									<div class="box-img">
										<img src="<%=path%>/static/img/1.jpg">
									</div>
									<div class="box-word">
										<div class="box-name">xxxxx</div>
										<div class="box-money">¥120</div>
									</div>
								</div>
							</div>
							<div class="box">
								<div class="box-wrap">
									<div class="box-img">
										<img src="<%=path%>/static/img/1.jpg">
									</div>
									<div class="box-word">
										<div class="box-name">xxxxx</div>
										<div class="box-money">¥120</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="row-title">
						<div class="row-title-left">
							<span class="title-all">女装</span> <span class="title-detail">每一个女孩都有一个梦</span>
						</div>
						<div class="row-title-right">
							<ul>
								<li><a href="#">上衣</a></li>
								<li><a href="#">连衣裙</a></li>
								<li><a href="#">半身裙</a></li>
								<li><a class="know-more">查看更多></a></li>
							</ul>
						</div>
					</div>
					<div class="row-show">
						<div class="row-show-pho">
							<div class="show-pho">
								<img src="<%=path%>/static/img/home-goods-show.png">
							</div>
						</div>
						<div class="row-show-detail">
							<div class="box">
								<div class="box-wrap">
									<div class="box-img">
										<img src="<%=path%>/static/img/1.jpg">
									</div>
									<div class="box-word">
										<div class="box-name">xxxxx</div>
										<div class="box-money">¥120</div>
									</div>
								</div>
							</div>
							<div class="box">
								<div class="box-wrap">
									<div class="box-img">
										<img src="<%=path%>/static/img/1.jpg">
									</div>
									<div class="box-word">
										<div class="box-name">xxxxx</div>
										<div class="box-money">¥120</div>
									</div>
								</div>
							</div>
							<div class="box">
								<div class="box-wrap">
									<div class="box-img">
										<img src="<%=path%>/static/img/1.jpg">
									</div>
									<div class="box-word">
										<div class="box-name">xxxxx</div>
										<div class="box-money">¥120</div>
									</div>
								</div>
							</div>
							<div class="box">
								<div class="box-wrap">
									<div class="box-img">
										<img src="<%=path%>/static/img/1.jpg">
									</div>
									<div class="box-word">
										<div class="box-name">xxxxx</div>
										<div class="box-money">¥120</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="row-title">
						<div class="row-title-left">
							<span class="title-all">女装</span> <span class="title-detail">每一个女孩都有一个梦</span>
						</div>
						<div class="row-title-right">
							<ul>
								<li><a href="#">上衣</a></li>
								<li><a href="#">连衣裙</a></li>
								<li><a href="#">半身裙</a></li>
								<li><a class="know-more">查看更多></a></li>
							</ul>
						</div>
					</div>
					<div class="row-show">
						<div class="row-show-pho">
							<div class="show-pho">
								<img src="<%=path%>/static/img/home-goods-show.png">
							</div>
						</div>
						<div class="row-show-detail">
							<div class="box">
								<div class="box-wrap">
									<div class="box-img">
										<img src="<%=path%>/static/img/1.jpg">
									</div>
									<div class="box-word">
										<div class="box-name">xxxxx</div>
										<div class="box-money">¥120</div>
									</div>
								</div>
							</div>
							<div class="box">
								<div class="box-wrap">
									<div class="box-img">
										<img src="<%=path%>/static/img/1.jpg">
									</div>
									<div class="box-word">
										<div class="box-name">xxxxx</div>
										<div class="box-money">¥120</div>
									</div>
								</div>
							</div>
							<div class="box">
								<div class="box-wrap">
									<div class="box-img">
										<img src="<%=path%>/static/img/1.jpg">
									</div>
									<div class="box-word">
										<div class="box-name">xxxxx</div>
										<div class="box-money">¥120</div>
									</div>
								</div>
							</div>
							<div class="box">
								<div class="box-wrap">
									<div class="box-img">
										<img src="<%=path%>/static/img/1.jpg">
									</div>
									<div class="box-word">
										<div class="box-name">xxxxx</div>
										<div class="box-money">¥120</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="row-title">
						<div class="row-title-left">
							<span class="title-all">女装</span> <span class="title-detail">每一个女孩都有一个梦</span>
						</div>
						<div class="row-title-right">
							<ul>
								<li><a href="#">上衣</a></li>
								<li><a href="#">连衣裙</a></li>
								<li><a href="#">半身裙</a></li>
								<li><a class="know-more">查看更多></a></li>
							</ul>
						</div>
					</div>
					<div class="row-show">
						<div class="row-show-pho">
							<div class="show-pho">
								<img src="<%=path%>/static/img/home-goods-show.png">
							</div>
						</div>
						<div class="row-show-detail">
							<div class="box">
								<div class="box-wrap">
									<div class="box-img">
										<img src="<%=path%>/static/img/1.jpg">
									</div>
									<div class="box-word">
										<div class="box-name">xxxxx</div>
										<div class="box-money">¥120</div>
									</div>
								</div>
							</div>
							<div class="box">
								<div class="box-wrap">
									<div class="box-img">
										<img src="<%=path%>/static/img/1.jpg">
									</div>
									<div class="box-word">
										<div class="box-name">xxxxx</div>
										<div class="box-money">¥120</div>
									</div>
								</div>
							</div>
							<div class="box">
								<div class="box-wrap">
									<div class="box-img">
										<img src="<%=path%>/static/img/1.jpg">
									</div>
									<div class="box-word">
										<div class="box-name">xxxxx</div>
										<div class="box-money">¥120</div>
									</div>
								</div>
							</div>
							<div class="box">
								<div class="box-wrap">
									<div class="box-img">
										<img src="<%=path%>/static/img/1.jpg">
									</div>
									<div class="box-word">
										<div class="box-name">xxxxx</div>
										<div class="box-money">¥120</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div id="footer">
			<div class="footer1">
				<ul>
					<li>成都信息工程大学</li>
					<li>乐购商城</li>
					<li>支付宝</li>
					<li>微信</li>
					<li>物流</li>
				</ul>
			</div>
			<div class="footer2">
				<span>关于成都信息工程大学</span> <span>合作伙伴</span> <span>联系我们</span> <span>1111235</span>
			</div>
		</div>
	</div>
</body>
	<script type="text/javascript" src="<%=path%>/static/assets/jquery/jquery-3.2.0.js"></script>
	<script type="text/javascript" src="<%=path%>/static/assets/bootstrap/js/bootstrap.min.js" ></script>
	<script type="text/javascript" src="<%=path%>/static/assets/FlexSlider/jquery.flexslider.js"></script>
	<script type="text/javascript" src="<%=path%>/static/assets/unslider/js/unslider.js"></script>
	<script type="text/javascript" charset="utf-8" src="<%=path%>/static/js/index.js" ></script>
</html>