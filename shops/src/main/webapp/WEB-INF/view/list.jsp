<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>快来享受</title>
<link href="/resource/css/global.css" type="text/css" rel="stylesheet" />
<link href="/resource/css/style.css" type="text/css" rel="stylesheet" />
<link href="/resource/js/sweetalert/sweetalert.css" rel="stylesheet"/>
<script type="text/javascript" src="/resource/js/wangweizhengalert.js"></script>
<script type="text/javascript" src="/resource/js/jquery-3.0.0.min.js"></script>


<script type="text/javascript">

function tolike(id){
 $.ajax({
		type:"post",
		data:{id:id},
		url:"tolike",
		success:function(obj){
			if(obj){
				 swal("啧啧啧", " 小伙子你他娘的很有眼力见啊", "success");
				 location.href="/list";
			}else{
				 swal("", "有缘江湖再见吧", "error");
			}
			
			
		}	
	})
}

function toshou(id){
	 $.ajax({
			type:"post",
			data:{id:id},
			url:"toshou",
			success:function(obj){
				if(obj){
					swal("啧啧啧", " 小伙子成功的将这个宝贝收藏了", "success");
					location.href="/list";
				}else{
					swal("", "可能没缘", "error");
				}
			}	
		})
	}
	
function gobuy() {
	swal("卖完了", "有缘江湖再见吧", "error");
}	



</script>
</head>
<body>
	<div class="content">
		<div class="l_under">
			<!--under_banner end-->
			<c:forEach items="${list }" var="b">
				<div class="item">

					<div class="title">
						<h1 class="mark7"></h1>
						<h2>
							${b.name }&nbsp;&nbsp;<span>原价${b.yuanprice }元</span>&nbsp;&nbsp;<i>现价${b.xianprice }元</i>
						</h2>
					</div>
					<!--title end-->
					<div class="item_l">
						<a title="" target="_blank"><img alt="未找到图片"
							src="/pic/${b.pic }" width="300px" height="300px" alt="" /></a>
					</div>
					<!--item_l end-->
					<div class="item_r">
						<div class="tj">
							<span>小编推荐：<span><i>${b.jieshao }</i>
						</div>
						<!--小编推荐结束-->
						<div class="gou">
							<p>&yen;${b.xianprice }</p>
							<a class="gbtn" title="" target="_blank" href="javascript:gobuy()"></a>
						</div>
						<!--gou end-->
						<div class="want">
							已有<i>${b.like }</i>人想买
						</div>
						<!--want end-->
						<div class="like_sc">
							<div class="like">
								<div class="like_l">
									<a title="" onclick="tolike(${b.id})"></a>
								</div>
								<div class="like_r">${b.like }</div>
							</div>
							<!--喜欢-->
							<div class="sc">
								<div class="sc_l">
									<a title="" onclick="toshou(${b.id})"></a>
								</div>
								<div class="sc_r">${b.shoucang }</div>
							</div>
							<!--收藏-->
						</div>
						<!--like_sc end-->
					</div>
					<!--item_r end-->
					<div class="cb"></div>
					<!--清除浮动-->
				</div>
				<!--item end 第一个商品信息结束-->
			</c:forEach>

			<!--u_banner end 下面的说明文字结束-->
		</div>
		<!--l_under end-->
	</div>
	<!--整体部分结束-->

	<!--脚部结束-->

</body>
</html>