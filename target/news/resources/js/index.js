$(document).ready(function(){
	//导航栏动态效果
	$(".nav_right_ul li").mouseover(function(){
			$(this).addClass("nav_center_on");
			$(this).css("height","57px")
	});
	$(".nav_right_ul li").mouseleave(function(){
		$(this).removeClass("nav_center_on");
	});
	$(".signIn").mouseover(function(){
		$(this).css("color","royalblue");	
	});
	$(".signIn").mouseleave(function(){
		$(this).css("color","black");	
	});
	
	//轮播图动态效果
	var a=0;
	var timer=setInterval(function(){
		a++;
		a=(a+5)%5;
		$(".scroll_img").animate({marginTop:-307*a},"slow");
		$(".scroll_num li").eq(a).addClass("scroll_num_li_on").siblings().removeClass("scroll_num_li_on");
	},3000);
	
	//手动切换轮播图
	$(".scroll_num_li").mouseover(function(){
		a=$(this).index();
		$(this).addClass("scroll_num_li_on").siblings().removeClass("scroll_num_li_on");
		$(".scroll_img").animate({marginTop:-307*a},"faster");
	});
	
	//选项卡切换
	$(".tab_box li").mouseover(function(){
		$(this).addClass("tab_box_li_style").siblings().removeClass("tab_box_li_style");
		$(this).css("color","black").siblings().css("color","gray");
	})
	$("#tab_student").mouseover(function(){
		$("#tab_01").show().siblings().hide();
	})
	$("#tab_friend").mouseover(function(){
		$("#tab_02").show().siblings().hide();
	});
	
	//卡片选中
	$(".box1").mouseover(function(){
		$(this).css("margin-top","0px").siblings().css("margin-top","10px");
		$(".box2").css("margin-top","10px");
		$(".box2").css("box-shadow","3px 3px 5px darkgray");
		$(this).css("box-shadow","5px 5px 7px darkgray").siblings().css("box-shadow","3px 3px 5px darkgray");
	});
	$(".box1").mouseleave(function(){
		$(this).css("margin-top","10px");
		
	});
	$(".box2").mouseover(function(){
		$(this).css("margin-top","0px").siblings().css("margin-top","10px");
		$(".box1").css("margin-top","10px");
		$(".box1").css("box-shadow","3px 3px 5px darkgray");
		$(this).css("box-shadow","5px 5px 7px darkgray").siblings().css("box-shadow","3px 3px 5px darkgray");
	});
	$(".box2").mouseleave(function(){
		$(this).css("margin-top","10px");
	});
	
	//新闻标题动态效果
	$(".content li div a").mouseover(function(){
		$(this).addClass("style_title");
		$(this).css("color","black");
		$(this).parent().siblings().css("color","black");
		$(this).parent().parent().css("color","black");
		$(this).parent().parent().css("border-bottom","1px #204D74 solid");
	});
	$(".content li div a").mouseleave(function(){
		$(this).removeClass("style_title");
		$(this).css("color","#333333");
		$(this).parent().siblings().css("color","#333333");
		$(this).parent().parent().css("color","#204D74");
		$(this).parent().parent().css("border-bottom","1px #204D74 dashed")
	});
	$(".content_2 li div a").mouseover(function(){
		$(this).addClass("style_title");
		$(this).css("color","black");
		$(this).parent().siblings().css("color","black");
		$(this).parent().parent().css("color","black");
		$(this).parent().parent().css("border-bottom","1px #204D74 solid");
	});
	$(".content_2 li div a").mouseleave(function(){
		$(this).removeClass("style_title");
		$(this).css("color","#333333");
		$(this).parent().siblings().css("color","#333333");
		$(this).parent().parent().css("color","#204D74");
		$(this).parent().parent().css("border-bottom","1px #204D74 dashed")
	});
	
	//优秀校友鼠标特效
	$(".content_3_li").mouseover(function(){
		$(this).addClass("style_content");
	})
	$(".content_3_li").mouseleave(function(){
		$(this).removeClass("style_content");
	})
	
	var b=0;
	var timer=setInterval(function(){
		b++;
		b=(b+6)%6;
		$(".picture_scroll").animate({marginTop:-410*b},"slow");
	},3000);
	
	var count=0;
	
	
	$(".company_left").click(function(){
		count=count-1;
		if(count<=0){
			count=0;
		}
		$(".company_box").animate({marginLeft:-275*count},"faster");
		
		
	})
	$(".company_right").click(function(){
		
		count=count+1;
		if(count>=2){
			count=2;
		}
		$(".company_box").animate({marginLeft:-275*count},"faster");
	})
});
			