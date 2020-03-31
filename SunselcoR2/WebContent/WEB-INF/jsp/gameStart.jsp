<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="model.UserBean,model.SaveLogic" %>
<%
String img = null;
String stage = null;
UserBean u = (UserBean) session.getAttribute("user");
int level = u.getLevel();

//セーブシステムクラスの呼び出し
SaveLogic save = new SaveLogic();

//セーブの可否判定
//boolean SR = save.saveLogic();

switch(level){
	case 1:
		img = " ";  //１面の画像を入れる
		stage = "/stage1";//１面に分岐
		break;

	case 2:
		img = " ";  //２面の画像を入れる
		stage = "/stage2";//２面に分岐
		break;

	case 3:
		img = " ";  //３面の画像を入れる
		stage = "/stage3";//３面に分岐
		break;

	case 4:
		img = " ";  //４面の画像を入れる
		stage = "/stage4";//に分岐
		break;
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>僕のサンセルコ・ライフ～幸せなサンセルコの見つけ方～</title>
</head>
<body>

<img src="<%= img %>" alt="ステージストーリー"  title="ストーリー">

<a href= "<%= stage %>" >スタート！</a>

</body>
</html>