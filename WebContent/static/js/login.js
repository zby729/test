$(document).ready(function(){
	$("#user").css({"z-index":"1"});
	$("#admin").css({"z-index":"0"});
	
	$(".jump").click(function(){
		var s = $(".in").attr("id");
		var sh = $(this).jsp();
		if(sh == "普通用户"){
			$("#user").removeClass("active in");
			$("#user").css({"z-index":"1"}); 
			$("#admin").css({"z-index":"0"}); 
		}
		if(sh == "管理员"){
			$("#admin").removeClass("active in");
			$("#user").css({"z-index":"0"}); 
			$("#admin").css({"z-index":"1"});
		}
	})
})