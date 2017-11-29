$(document).ready(function(){
	$("#reduce").click(function(){
		var num = $(".good-number").text();
		num--;
		$(".good-number").jsp("");
		$(".good-number").append(num);
	})
	$("#add").click(function(){
		var num = $(".good-number").text();
		num++;
		$(".good-number").jsp("");
		$(".good-number").append(num);
	})
})
