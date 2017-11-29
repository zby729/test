<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.legou.modules.user.entity.User" %>
<%@ page import="com.legou.modules.sys.entity.Admin" %>
<%@ page import="com.legou.modules.message.entity.GuangGao" %>
<%
	String path = request.getContextPath();
	ArrayList<GuangGao> list = new ArrayList<GuangGao>();
	list = (ArrayList<GuangGao>)session.getAttribute("guanggaolist");
	Admin admin = (Admin)session.getAttribute("myself");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>乐购购台管理</title>
		<link href="adminassets/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="adminassets/css/font-awesome.min.css" />
		
		<!--<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300" />-->
		
		<link rel="stylesheet" href="adminassets/css/ace.min.css" />
		<link rel="stylesheet" href="adminassets/laypage/skin/laypage.css" />
		<link rel="stylesheet" href="adminassets/css/ace-rtl.min.css" />
		<link rel="stylesheet" href="adminassets/css/ace-skins.min.css" />
		<link rel="stylesheet" href="admincss/guanggao_management.css" />
		<script src="adminassets/js/ace-extra.min.js"></script>
		<link rel="stylesheet" href="assets/sweetalert/sweetalert.css">
		<script src="assets/sweetalert/sweetalert.min.js"></script>
	</head>
	<body>
		<div class="navbar navbar-default" id="navbar">
			<script type="text/javascript">
				try{ace.settings.check('navbar' , 'fixed')}catch(e){}
			</script>
			<div class="navbar-container" id="navbar-container">
				<div class="navbar-header pull-left">
					<a href="#" class="navbar-brand">
						<small>
							<i class="icon-leaf"></i>
							乐购后台管理系统
						</small>
					</a><!-- /.brand -->
				</div><!-- /.navbar-header -->

				<div class="navbar-header pull-right" role="navigation">
					<ul class="nav ace-nav">

						<li class="light-blue">
							<a data-toggle="dropdown" href="#" class="dropdown-toggle">
								<img class="nav-user-photo" src="adminassets/avatars/user.jpg" alt="Jason's Photo" />
								<span class="user-info">
									<small>欢迎光临,</small>
									<%=admin.getName() %>
								</span>

								<i class="icon-caret-down"></i>
							</a>

							<ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
								
								<li>
									<a href="#" data-toggle="modal" data-target="#info">
										<i class="icon-user"></i>
										个人资料
									</a>
								</li>

								<li class="divider"></li>

								<li>
									<a href="<%=path%>/exit">
										<i class="icon-off"></i>
										退出
									</a>
								</li>
							</ul>
						</li>
					</ul><!-- /.ace-nav -->
				</div><!-- /.navbar-header -->
			</div><!-- /.container -->
		</div>
		
		<div class="main-container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>

			<div class="main-container-inner">
				<a class="menu-toggler" id="menu-toggler" href="#">
					<span class="menu-text"></span>
				</a>

				<div class="sidebar" id="sidebar">
					<script type="text/javascript">
						try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
					</script>

					<div class="sidebar-shortcuts" id="sidebar-shortcuts">
						<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
							<button class="btn btn-success">
								<i class="icon-signal"></i>
							</button>

							<button class="btn btn-info">
								<i class="icon-pencil"></i>
							</button>

							<button class="btn btn-warning">
								<i class="icon-group"></i>
							</button>

							<button class="btn btn-danger">
								<i class="icon-cogs"></i>
							</button>
						</div>

						<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
							<span class="btn btn-success"></span>

							<span class="btn btn-info"></span>

							<span class="btn btn-warning"></span>

							<span class="btn btn-danger"></span>
						</div>
					</div><!-- #sidebar-shortcuts -->
					
					<ul class="nav nav-list">
						<li>
							<a href="adminindex.jsp">
								<i class="icon-edit"></i> 
								<span class="menu-text">用户管理</span>
							</a>
						</li>
						
						<li>
							<a href="" class="dropdown-toggle">
								<i class="icon-edit"></i> 
								<span class="menu-text">商品管理</span>
								
								<b class="arrow icon-angle-down"></b>
							</a>
							
							<ul class="submenu">
								<li>
									<a href="shangpin_management.jsp">
										<i class="icon-double-angle-right"></i>
										商品管理
									</a>
								</li>
								<li>
									<a href="shangpinType_1.jsp">
										<i class="icon-double-angle-right"></i>
										商品类别一级管理
									</a>
								</li>
								<li>
									<a href="shangpinType_2.jsp">
										<i class="icon-double-angle-right"></i>
										商品类别二级管理
									</a>
								</li>
								<li>
									<a href="shangpinType_3.jsp">
										<i class="icon-double-angle-right"></i>
										商品类别三级管理
									</a>
								</li>
							</ul>
						</li>
						
						<li>
							<a href="dingdan_management.jsp" >
								<i class="icon-edit"></i> 
								<span class="menu-text">订单管理</span>
							</a>	
						</li>
						
						<li>
							<a href="#" class="dropdown-toggle">
								<i class="icon-edit"></i> 
								<span class="menu-text">信息管理</span>
								
								<b class="arrow icon-angle-down"></b>
							</a>
							
							<ul class="submenu">
								<li>
									<a href="<%=path %>/pinglun">
										<i class="icon-double-angle-right"></i>
										商品评论管理
									</a>
								</li>
								<li>
									<a href="<%=path %>/gonggao">
										<i class="icon-double-angle-right"></i>
										系统公告管理
									</a>
								</li>
								<li>
									<a href="huifu_management.jsp">
										<i class="icon-double-angle-right"></i>
										留言回复管理
									</a>
								</li>
							</ul>
						</li>
						
						<li>
							<a href="<%=path %>/guanggao">
								<i class="icon-edit"></i>
								<span class="menu-text">首页广告管理</span>
							</a>
						</li>
					</ul><!-- /.nav-list -->

					<div class="sidebar-collapse" id="sidebar-collapse">
						<i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i>
					</div>

					<script type="text/javascript">
						try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
					</script>
				</div>
				
				
				
				<div class="main-content">
					<div class="breadcrumbs" id="breadcrumbs">
						<script type="text/javascript">
							try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
						</script>

						<ul class="breadcrumb">
							<li>
								<i class="icon-home home-icon"></i>
								<a href="index.html">首页</a>
							</li>
							<li>
								<a href="#">图片管理</a>
							</li>
							<li class="active">广告管理</li>
						</ul><!-- .breadcrumb -->

						<div class="nav-search" id="nav-search">
							
						</div><!-- #nav-search -->
					</div>
					
					<div class="page-content">
						<div class="page-header">
							<h1>
								广告管理
							</h1>
						</div><!-- /.page-header -->
						
						<div class="row">
							<div class="col-xs-12">
								
								<div class="row">
									<div class="col-xs-12">
										<div class="contenter-wrap">
											<div class="add-button">
												<button class="add-btn" data-toggle="modal" data-target="#add">添加图片</button>
			
											</div>
											<div class="table-responsive">
												<table id="sample-table-1" class="table table-striped table-hover ">
													<thead>
											
														<tr>
															<th>序号</th>
															<th>路径</th>
															<th>URL</th>
															<th>宽</th>
															<th>高</th>
															<th>
																操作
															</th>
														</tr>
													</thead>
													<tbody>
													<input type="hidden" id="item_nums" value="<%=list.size() %>">
													<%
														for (int i=0; i<list.size(); i++){
															%>
															<tr id="tr<%=i %>">
														
																<td><%=i+1 %></td>
																<td><%=list.get(i).getPath() %></td>
																<td><%=list.get(i).getUrl() %></td>
																<td><%=list.get(i).getWidth() %></td>
																<td><%=list.get(i).getHeight() %></td>
													
																<td>
																	<div class="button">
																		<button class="btton look-btn" data-toggle="modal" data-target="#myModal" id=<%=list.get(i).getId() %> path=<%=list.get(i).getPath() %> url=<%=list.get(i).getUrl() %> width=<%=list.get(i).getWidth() %> height=<%=list.get(i).getHeight() %> onclick="editInfo(this)">修改</button>
																		<button class="btton remove-btn" id="del_btn" userId=<%=list.get(i).getId() %> onclick="delUser(this)">删除</button>
																	</div>
																</td>
															</tr>
															<%
														}
													%>
							
													</tbody>
												</table>
											</div>
											<div id="page-content">
												
											</div>
											<form action="<%=path %>/delguanggao" name="delfrm" method="post">
												<input type="hidden" name="del_id" id="del_id">
											</form>
											<!--查看信息模态框-->
											<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
												<div class="modal-dialog">
													<div class="modal-content">
														<div class="modal-header">
															<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
															<h4 class="modal-title" id="myModalLabel">广告信息</h4>
														</div>
														<div class="modal-body">
															<form role="form" name="upcmdfrm" action="<%=path %>/upguanggao" enctype="multipart/form-data" method="post">
																<input type="hidden" name="ggid" id="ggid" value="">
																<div class="from-group">
																	<label class="control-label"><h5>图片路径</h5></label>
																	<img alt="广告图片" width="540px" height="280px" id="ctupian" src=""><div id="ctupian2"></div>
																	<input type="file" id="ggimg" name="ggimg" onchange="changeimg2(this)">
															
																</div>
																<div class="from-group">
																	<label class="control-label"><h5>广告作用的URL</h5></label>
																	<input class="form-control " id="ggurl" name="ggurl" value="" type="text">
																</div>
																<div class="from-group">
																	<label class="control-label"><h5>图片的宽</h5></label>
																	<input class="form-control " id="ggwidth" name="ggwidth" value="" type="text">
																</div>
																<div class="from-group">
																	<label class="control-label"><h5>图片的高</h5></label>
																	<input class="form-control " id="ggheight" name="ggheight" value="" type="text">
																</div>
																
															</form>
														</div>
														<div class="modal-footer">
															<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
															<button type="button" class="btn btn-xiugai" data-dismiss="modal" onclick="update()">修改</button>
														</div>
													</div>
													<!-- /.modal-content -->
												</div>
												<!-- /.modal -->
											</div>
											<div class="modal fade" id="info" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
						<h4 class="modal-title">管理员信息</h4>
					</div>
					<form action="<%=path%>/upadminpwd" name="uppfrm" method="post">
					<div class="modal-body">
						<div class="from-group">
							<label class="control-label"><h5>管理员账号</h5></label>
							<input class="form-control " value="<%=admin.getName() %>" disabled="disabled">
							<input type="hidden" value="<%=admin.getId() %>" id="adminid" name="adminid">
						</div>
						<div class="from-group">
							<label class="control-label"><h5>登录次数</h5></label>
							<input class="form-control " value="<%=application.getAttribute("change") %>" disabled="disabled">
						</div>
						<div class="from-group">
							<label class="control-label"><h5>密码</h5></label>
							<input id="adminpwd" name="adminpwd" class="form-control " value="<%=admin.getPwd() %>">
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-xiugai" data-dismiss="modal" onclick="upadminpwd()">修改</button>
					</div>
					</form>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal -->
			</div>
											<!--添加信息模态框-->
											<div class="modal fade" id="add" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
												<div class="modal-dialog">
													<div class="modal-content">
														<div class="modal-header">
															<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
															<h4 class="modal-title" id="myModalLabel">广告信息</h4>
														</div>
														<div class="modal-body">
															<form role="form" name="addfrm" action="<%=path%>/addguanggao" method="post" enctype="multipart/form-data">
																<div class="from-group">
																	<label class="control-label"><h5>广告图片</h5></label>
																	<div id="dd"></div>
																	
																	<input class="form-control" required="required" name="pho-path" id="pho-path" type="file" onchange="changeimg(this)" />
																</div>
																<div class="from-group">
																	<label class="control-label"><h5>广告作用的URL</h5></label>
																	<input class="form-control " required="required" name="pho-url" id="pho-url" type="text">
																</div>
																<div class="from-group">
																	<label class="control-label"><h5>图片的宽</h5></label>
																	<input class="form-control " required="required" name="pho-width" id="pho-width" type="text" >
																</div>
																<div class="from-group">
																	<label class="control-label"><h5>图片的高</h5></label>
																	<input class="form-control " required="required" name="pho-height" id="pho-height" type="text" >
																</div>
																
															</form>
														</div>
														<div class="modal-footer">
															<button type="button" class="btn btn-save" onclick="addItem()">确定</button>
															<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
														</div>
													</div>
													<!-- /.modal-content -->
												</div>
												<!-- /.modal -->
											</div>
											
										</div>
									</div>
									
								</div>
							</div>
						</div>
					</div><!-- /.page-content -->
				</div><!-- /.main-content -->
				</div><!-- /.main-content -->

				
				<div class="ace-settings-container" id="ace-settings-container">
					<div class="btn btn-app btn-xs btn-warning ace-settings-btn" id="ace-settings-btn">
						<i class="icon-cog bigger-150"></i>
					</div>

					<div class="ace-settings-box" id="ace-settings-box">
						<div>
							<div class="pull-left">
								<select id="skin-colorpicker" class="hide">
									<option data-skin="default" value="#438EB9">#438EB9</option>
									<option data-skin="skin-1" value="#222A2D">#222A2D</option>
									<option data-skin="skin-2" value="#C6487E">#C6487E</option>
									<option data-skin="skin-3" value="#D0D0D0">#D0D0D0</option>
								</select>
							</div>
							<span>&nbsp; 选择皮肤</span>
						</div>

						<div>
							<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-navbar" />
							<label class="lbl" for="ace-settings-navbar"> 固定导航条</label>
						</div>

						<div>
							<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-sidebar" />
							<label class="lbl" for="ace-settings-sidebar"> 固定滑动条</label>
						</div>

						<div>
							<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-breadcrumbs" />
							<label class="lbl" for="ace-settings-breadcrumbs">固定面包屑</label>
						</div>

						<div>
							<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-rtl" />
							<label class="lbl" for="ace-settings-rtl">切换到左边</label>
						</div>

						<div>
							<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-add-container" />
							<label class="lbl" for="ace-settings-add-container">
								切换窄屏
								<b></b>
							</label>
						</div>
					</div>
				</div><!-- /#ace-settings-container -->
			</div><!-- /.main-container-inner -->

			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="icon-double-angle-up icon-only bigger-110"></i>
			</a>
		</div><!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->

		<!--<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>-->

		<!-- <![endif]-->

		<!--[if IE]>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<![endif]-->

		<!--[if !IE]> -->

		<script type="text/javascript">
			window.jQuery || document.write("<script src='adminassets/js/jquery-2.0.3.min.js'>"+"<"+"script>");
		</script>

		<!-- <![endif]-->

		<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='assets/js/jquery-1.10.2.min.js'>"+"<"+"script>");
</script>
<![endif]-->

		<script type="text/javascript">
			if("ontouchend" in document) document.write("<script src='adminassets/js/jquery.mobile.custom.min.js'>"+"<"+"script>");
		</script>
		<script src="adminassets/js/bootstrap.min.js"></script>
		<script src="adminassets/js/typeahead-bs2.min.js"></script>

		<!-- page specific plugin scripts -->

		<!--[if lte IE 8]>
		  <script src="assets/js/excanvas.min.js"></script>
		<![endif]-->

		<script src="adminassets/js/jquery-ui-1.10.3.custom.min.js"></script>
		<script src="adminassets/js/jquery.ui.touch-punch.min.js"></script>
		<script src="adminassets/js/jquery.slimscroll.min.js"></script>
		<script src="adminassets/js/jquery.easy-pie-chart.min.js"></script>
		<script src="adminassets/js/jquery.sparkline.min.js"></script>
		<script src="adminassets/js/flot/jquery.flot.min.js"></script>
		<script src="adminassets/js/flot/jquery.flot.pie.min.js"></script>
		<script src="adminassets/js/flot/jquery.flot.resize.min.js"></script>

		<!-- ace scripts -->

		<script src="adminassets/js/ace-elements.min.js"></script>
		<script src="adminassets/js/ace.min.js"></script>

		<!-- inline scripts related to this page -->

		<script type="text/javascript">
			jQuery(function($) {
				$('.easy-pie-chart.percentage').each(function(){
					var $box = $(this).closest('.infobox');
					var barColor = $(this).data('color') || (!$box.hasClass('infobox-dark') ? $box.css('color') : 'rgba(255,255,255,0.95)');
					var trackColor = barColor == 'rgba(255,255,255,0.95)' ? 'rgba(255,255,255,0.25)' : '#E2E2E2';
					var size = parseInt($(this).data('size')) || 50;
					$(this).easyPieChart({
						barColor: barColor,
						trackColor: trackColor,
						scaleColor: false,
						lineCap: 'butt',
						lineWidth: parseInt(size/10),
						animate: /msie\s*(8|7|6)/.test(navigator.userAgent.toLowerCase()) ? false : 1000,
						size: size
					});
				})
			
				$('.sparkline').each(function(){
					var $box = $(this).closest('.infobox');
					var barColor = !$box.hasClass('infobox-dark') ? $box.css('color') : '#FFF';
					$(this).sparkline('html', {tagValuesAttribute:'data-values', type: 'bar', barColor: barColor , chartRangeMin:$(this).data('min') || 0} );
				});
			
			
			
			
			  var placeholder = $('#piechart-placeholder').css({'width':'90%' , 'min-height':'150px'});
			  var data = [
				{ label: "social networks",  data: 38.7, color: "#68BC31"},
				{ label: "search engines",  data: 24.5, color: "#2091CF"},
				{ label: "ad campaigns",  data: 8.2, color: "#AF4E96"},
				{ label: "direct traffic",  data: 18.6, color: "#DA5430"},
				{ label: "other",  data: 10, color: "#FEE074"}
			  ]
			  function drawPieChart(placeholder, data, position) {
			 	  $.plot(placeholder, data, {
					series: {
						pie: {
							show: true,
							tilt:0.8,
							highlight: {
								opacity: 0.25
							},
							stroke: {
								color: '#fff',
								width: 2
							},
							startAngle: 2
						}
					},
					legend: {
						show: true,
						position: position || "ne", 
						labelBoxBorderColor: null,
						margin:[-30,15]
					}
					,
					grid: {
						hoverable: true,
						clickable: true
					}
				 })
			 }
			 drawPieChart(placeholder, data);
			
			 /**
			 we saved the drawing function and the data to redraw with different position later when switching to RTL mode dynamically
			 so that's not needed actually.
			 */
			 placeholder.data('chart', data);
			 placeholder.data('draw', drawPieChart);
			
			
			
			  var $tooltip = $("<div class='tooltip top in'><div class='tooltip-inner'></div></div>").hide().appendTo('body');
			  var previousPoint = null;
			
			  placeholder.on('plothover', function (event, pos, item) {
				if(item) {
					if (previousPoint != item.seriesIndex) {
						previousPoint = item.seriesIndex;
						var tip = item.series['label'] + " : " + item.series['percent']+'%';
						$tooltip.show().children(0).text(tip);
					}
					$tooltip.css({top:pos.pageY + 10, left:pos.pageX + 10});
				} else {
					$tooltip.hide();
					previousPoint = null;
				}
				
			 });
			
			
			
			
			
			
				var d1 = [];
				for (var i = 0; i < Math.PI * 2; i += 0.5) {
					d1.push([i, Math.sin(i)]);
				}
			
				var d2 = [];
				for (var i = 0; i < Math.PI * 2; i += 0.5) {
					d2.push([i, Math.cos(i)]);
				}
			
				var d3 = [];
				for (var i = 0; i < Math.PI * 2; i += 0.2) {
					d3.push([i, Math.tan(i)]);
				}
				
			
				var sales_charts = $('#sales-charts').css({'width':'100%' , 'height':'220px'});
				$.plot("#sales-charts", [
					{ label: "Domains", data: d1 },
					{ label: "Hosting", data: d2 },
					{ label: "Services", data: d3 }
				], {
					hoverable: true,
					shadowSize: 0,
					series: {
						lines: { show: true },
						points: { show: true }
					},
					xaxis: {
						tickLength: 0
					},
					yaxis: {
						ticks: 10,
						min: -2,
						max: 2,
						tickDecimals: 3
					},
					grid: {
						backgroundColor: { colors: [ "#fff", "#fff" ] },
						borderWidth: 1,
						borderColor:'#555'
					}
				});
			
			
				$('#recent-box [data-rel="tooltip"]').tooltip({placement: tooltip_placement});
				function tooltip_placement(context, source) {
					var $source = $(source);
					var $parent = $source.closest('.tab-content')
					var off1 = $parent.offset();
					var w1 = $parent.width();
			
					var off2 = $source.offset();
					var w2 = $source.width();
			
					if( parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2) ) return 'right';
					return 'left';
				}
			
			
				$('.dialogs,.comments').slimScroll({
					height: '300px'
			    });
				
				
				//Android's default browser somehow is confused when tapping on label which will lead to dragging the task
				//so disable dragging when clicking on label
				var agent = navigator.userAgent.toLowerCase();
				if("ontouchstart" in document && /applewebkit/.test(agent) && /android/.test(agent))
				  $('#tasks').on('touchstart', function(e){
					var li = $(e.target).closest('#tasks li');
					if(li.length == 0)return;
					var label = li.find('label.inline').get(0);
					if(label == e.target || $.contains(label, e.target)) e.stopImmediatePropagation() ;
				});
			
				$('#tasks').sortable({
					opacity:0.8,
					revert:true,
					forceHelperSize:true,
					placeholder: 'draggable-placeholder',
					forcePlaceholderSize:true,
					tolerance:'pointer',
					stop: function( event, ui ) {//just for Chrome!!!! so that dropdowns on items don't appear below other items after being moved
						$(ui.item).css('z-index', 'auto');
					}
					}
				);
				$('#tasks').disableSelection();
				$('#tasks input:checkbox').removeAttr('checked').on('click', function(){
					if(this.checked) $(this).closest('li').addClass('selected');
					else $(this).closest('li').removeClass('selected');
				});
				
			
			})
		</script>
	<!--<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>-->
	</body>
	<script type="text/javascript" src="adminassets/laypage/laypage.js"></script> 
	<script type="text/javascript" src="adminjs/guanggao_management.js"></script> 

<script type="text/javascript">
function editInfo(obj) {  
    var id = $(obj).attr("id");
    var path = $(obj).attr("path");
    var url = $(obj).attr("url");
    var width = $(obj).attr("width");
    var height = $(obj).attr("height");
    //向模态框中传值  
    $("#ggid").val(id);
    $("#ggurl").val(url); 
    $('#ggwidth').val(width);
    $('#ggheight').val(height); 
    var t = document.getElementById('ctupian');


    t.src="img"+path; 
}  
//提交更改  
function update() {  
	upcmdfrm.submit();
} 
function delUser(obj) {
	swal({
		title:"您确定要删除此广告吗！",
		type:"warning",
		showCancelButton: true,
        closeOnConfirm: false,
        confirmButtonText: "是的，我要删除",
        confirmButtonColor: "#ec6c62"
	},function(){
		 var userid = $(obj).attr("userId");
		    //向模态框中传值  
		    $('#del_id').val(userid);
		    delfrm.submit();
	})
} 
//提交更改  
function addItem() {  
	if($("input[name=pho-path]").val() == null || $("input[name=pho-path]").val() == ""){
		swal({
			title:"请选择广告图片！",
			type:"error",
			confirmButtonText:"ok",
			timer:5000,
		})
		return;
	}
	    //获取模态框数据  
		addfrm.submit();
}
	
	var pages = $('#item_nums').val();
	laypage({
		cont:'page-content',
	    pages: Math.ceil(pages/10),  
	    groups:5,
	  jump:function(obj){
		var currpage = obj.curr; 
		for (var i = 0; i < pages; i++) {
			if (i >=  (currpage-1)*10 && i <((currpage-1)*10+10)){
				document.getElementById('tr'+i).style.display = 'table-row';
			} else{
				document.getElementById('tr'+i).style.display = 'none';
			}
	    }
	  }
	})
	function show(page){
		
	}
	function upadminpwd(){
		uppfrm.submit();
	}
	function reads(fil){
		var reader = new FileReader();
		reader.readAsDataURL(fil);
		reader.onload = function()
		{
			document.getElementById("dd").innerHTML += "<img width='240px' height='240px' src='"+reader.result+"'>";
		};
	}
	function changeimg(obj) {
		var f = document.getElementById("pho-path").files;
		for (var i = 0; i < f.length; i++) {
			reads(f[i]);
		}
	}
	function reads2(fil){
		var reader = new FileReader();
		reader.readAsDataURL(fil);
		reader.onload = function()
		{
			document.getElementById("ctupian2").innerHTML += "<img width='170px' height='170px' src='"+reader.result+"'>";
		};
	}
	function changeimg2(obj) {
		var f = document.getElementById("ggimg").files;
		for (var i = 0; i < f.length; i++) {
			reads2(f[i]);
		}
	}
	</script>
</html>