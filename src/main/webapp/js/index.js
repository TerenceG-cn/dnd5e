$(function() {
	//JavaScript代码区域
	layui.use('element', function(){
		var element = layui.element;

	});
	$("#showMonster").click(function(){
		$("#content").load("/jsp/showMonster.jsp");
	})
	$("#addMonster").click(function(){
		$("#content").load("/jsp/addMonster.jsp");
	})

})
	
