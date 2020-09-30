<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DND 5后台</title>
<style type="text/css">
body, html, #allmap {
	width: 100%;
	height: 100%;
	overflow: hidden;
	margin: 0;
	font-family: "微软雅黑";
}
</style>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/layui/css/layui.css">
<script type="text/javascript"
	src="//api.map.baidu.com/api?v=2.0&ak=6x4Mzp8ArLpNLD1UgtPT3694bUScigwc"></script>
<script src="${pageContext.request.contextPath }/layui/layui.js"></script>
<script src="${pageContext.request.contextPath }/js/jquery-2.1.0.min.js"></script>
<script
	src="${pageContext.request.contextPath }/js/echarts-en.common.min.js"></script>
<script src="${pageContext.request.contextPath }/js/index.js"></script>

</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<div class="layui-header">
			<div class="layui-logo">DND 5E 后台</div>
			<!-- 头部区域（可配合layui已有的水平导航） -->

			<ul class="layui-nav layui-layout-right">
				<li class="layui-nav-item"><a href="javascript:;"> <img
						src="http://t.cn/RCzsdCq" class="layui-nav-img"> admin
				</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="">个人中心</a>
						</dd>
						<dd>
							<a href="">安全设置</a>
						</dd>
					</dl></li>
				<li class="layui-nav-item"><a href="">注销</a></li>
			</ul>
		</div>

		<div class="layui-side layui-bg-black">
			<div class="layui-side-scroll">
				<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
				<ul class="layui-nav layui-nav-tree" lay-filter="test">
					<li class="layui-nav-item"><a class="" href="javascript:;">怪物角色管理</a>
						<dl class="layui-nav-child">
							<%--<dd>--%>
								<%--<a id="initSolr" href="javascript:;">商品数据初始化</a>--%>
							<%--</dd>--%>

							<dd>
								<a id="addItem" href="javascript:;">怪物角色添加</a>
							</dd>
							<dd>
								<a id="showItem" href="javascript:;">怪物角色查询</a>
							</dd>
						</dl></li>
				</ul>
			</div>
		</div>

		<div class="layui-body" aligen="center" text-aligen="center">
                欢迎使用DND 5E 后台！
                <img src="/pictures/dnd5e-bg.jpg">
		</div>

		<div class="layui-footer" style="background-color: #2F4056">
			<span style="color: #01AAED">©www.clive.com - 淘淘商城</span>
		</div>
	</div>
	<script type="text/javascript">
		var myChart1 = echarts.init(document.getElementById('echartsMain1'));
		var weatherIcons = {};
		$.get('/itemCat/statisticsItem').done(function(resule) {
			myChart1.setOption({
				title : {
					text : '商品分类统计',
					left : 'center'
				},
				tooltip : {
					trigger : 'item',
					formatter : '{a} <br/>{b} : {c} ({d}%)'
				},
				series : [ {
					type : 'pie',
					radius : '65%',
					center : [ '50%', '50%' ],
					selectedMode : 'single',
					data : resule
				} ]
			});
		})

		//	百度地图API功能
		var map = new BMap.Map("allmap"); // 创建Map实例
		map.centerAndZoom(new BMap.Point(104.06, 30.67), 11); // 初始化地图,设置中心点坐标和地图级别
		//	添加地图类型控件
		map.addControl(new BMap.MapTypeControl({
			mapTypes : [ BMAP_NORMAL_MAP, BMAP_HYBRID_MAP ]
		}));
		map.setCurrentCity("成都"); // 设置地图显示的城市 此项是必须设置的
		map.enableScrollWheelZoom(true); //开启鼠标滚轮缩放
	</script>

</body>
</html>

