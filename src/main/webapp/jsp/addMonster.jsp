<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>怪物角色添加页面</title>

<script charset="utf-8"
	src="${pageContext.request.contextPath}/js/addMonster.js">
</script>

</head>
<style>
	.layui-form-label{
		width: 100px;
	}
	.layui-input-block {
		margin-left: 130px;
		min-height: 36px
	}
</style>
<body>
	<div style="padding: 15px; background-color: #FFFFFF">
		<form class="layui-form" action="">
			<div class="layui-form-item">
				<label class="layui-form-label">怪物基本信息</label>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">怪物中文名</label>
				<div class="layui-input-inline">
					<input style="width: 270px" type="text" name="cnName"
						class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">怪物英文名</label>
				<div class="layui-input-inline">
					<input style="width: 270px" type="text" name="enName"
						   class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">阵营</label>
				<div class="layui-input-inline">
					<input style="width: 270px" type="text" name="alignment"
						   class="layui-input">
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label">种类与附标</label>
				<div class="layui-input-inline">
					<input type="text" name="typeAndTags" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">体型</label>
				<div class="layui-input-inline">
					<input type="text" name=" size" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">生命骰</label>
				<div class="layui-input-inline">
					<input type="text" name="hitDice" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">护甲等级</label>
				<div class="layui-input-inline">
					<input type="text" name="ac" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">生命值</label>
				<div class="layui-input-inline">
					<input type="text" name="hitPoints" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">怪物图片</label>
				<div class="layui-input-block">
					<div class="layui-upload">
						<button type="button" class="layui-btn" id="test2">上传图片</button>
						<blockquote class="layui-elem-quote layui-quote-nm"
							style="margin-top: 10px;">
							预览图：
							<div class="layui-upload-list" id="demo2"></div>
						</blockquote>
						<input type="hidden" name="image" id="imageUpload" />
					</div>
				</div>
			</div>
			<div class="layui-form-item">
				<div class="layui-input-block">
					<button type="submit" class="layui-btn" lay-submit=""
						lay-filter="formDemo">立即提交</button>
					<button type="reset" class="layui-btn layui-btn-primary">重置</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>