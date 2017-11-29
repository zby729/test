$(document).ready(function(){
		
	var a = $("input[class*=page]").val();
	var pages = Math.ceil(a/10);
	laypage({
		cont:'page-content',
	    pages: pages,
	    groups:10,
	    jump:function(obj){
	    	var cp = obj.curr;
	    	for(var i=0;i<a;i++){
	    		if(i>=(cp-1)*10 && i<=cp*10-1){
	    			var s = "#tr"+i;
	    			$(s).show();
	    		}else{
	    			var s = "#tr"+i;
	    			$(s).hide();
	    		}
	    	}
	    }
	})
})
function look(obj){
	var id = $(obj).attr("id");
	var title = $(obj).attr("title");
	var content = $(obj).attr("content");
	var time = $(obj).attr("time");
	$("input[name=ctitle]").val(title);
	$("input[name=cid]").val(id);
	$("textarea[name=ccontent]").val(content);
	$("textarea[name=ctime]").html(time);
}

function update(obj){
	if($("input[name=ctitle]").val() == null || $("input[name=ctitle]").val() == ""){
		swal({
			title:"公告标题不能为空，请重填！",
			type:"error",
			confirmButtonText:"ok",
			timer:5000,
		})
		return;
	}
	cfrm.submit();
	return true;
}
function addgonggao(obj){
	if($("input[name=gg-title]").val() == null || $("input[name=gg-title]").val() == ""){
		swal({
			title:"公告标题不能为空，请重填！",
			type:"error",
			confirmButtonText:"ok",
			timer:5000,
		})
		return;
	}
	addfrm.submit();
	return true;
}

