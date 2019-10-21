$(function() {
	$(".tab_1").hide();
	$(".tab_2").hide();
	var flag_1=false;
	$(".tab_box_1").click(function(){
		$(".tab_1 ul li").removeClass("meun-item-active");
		if(flag_1==false){
			$(".tab_1").show();
			flag_1=true;
		}else{
			$(".tab_1").hide();
			flag_1=false;
		}
		
	});
	var flag_2=false;
	$(".tab_box_2").click(function(){
		$(".tab_2 ul li").removeClass("meun-item-active");
		if(flag_2==false){
			$(".tab_2").show();
			flag_2=true;
		}else{
			$(".tab_2").hide();
			flag_2=false;
		}
	});
	$(".tab_box_0").click(function(){
		$(".tab_1").hide();
		flag_1=false;
		$(".tab_2").hide();
		flag_2=false;
	})
	
	$(".meun-item,.tab_1 li,.tab_2 li").click(function() {
		$(this).siblings().removeClass("meun-item-active");
		$(this).addClass("meun-item-active");
	});
	$("#menu_1").click(function(){
		$(".manage_1").css("display","block");
		$(".manage_1").siblings().css("display","none")
	});
	
	$(".tab_box_1").click(function(){
		$(".manage_2").show()
	})
	$(".manage_2").css("display","block");
	$("#menu_2").click(function(){
		$(".manage_2").show().siblings().hide();
	})
	$("#menu_3").click(function(){
		$(".manage_3").show().siblings().hide();
	})
	$("#menu_4").click(function(){
		$(".manage_4").show().siblings().hide();
	})
	$("#menu_5").click(function(){
		$(".manage_5").show().siblings().hide();
	})
	$("#menu_6").click(function(){
		$(".manage_6").show().siblings().hide();
	})
	$("#menu_7").click(function(){
		$(".manage_7").show().siblings().hide();
	})
	$("#menu_8").click(function(){
		$(".manage_8").show().siblings().hide();
	})
	$("#menu_9").click(function(){
		$(".manage_9").show().siblings().hide();
	})
})