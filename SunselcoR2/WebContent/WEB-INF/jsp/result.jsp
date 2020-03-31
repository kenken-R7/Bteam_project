<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="model.UserBean,model.SaveLogic" %>

<%
//解答フォームから解答を取得
String Ans1 = request.getParameter("quiz1");
String Ans2 = request.getParameter("quiz2");
String Ans3 = request.getParameter("quiz3");
String Ans4 = request.getParameter("quiz4");
String Ans5 = request.getParameter("quiz5");

//int型に変換
int ans1 = Integer.parseInt(Ans1);
int ans2 = Integer.parseInt(Ans2);
int ans3 = Integer.parseInt(Ans3);
int ans4 = Integer.parseInt(Ans4);
int ans5 = Integer.parseInt(Ans5);

//解答を表示
String a1;
String a2;
String a3;
String a4;
String a5;

if(ans1 == 0){a1 = "正解";}else {a1 = "不正解";}
if(ans2 == 0){a2 = "正解";}else {a2 = "不正解";}
if(ans3 == 0){a3 = "正解";}else {a3 = "不正解";}
if(ans4 == 0){a4 = "正解";}else {a4 = "不正解";}
if(ans5 == 0){a5 = "正解";}else {a5 = "不正解";}

//画面表示
String img = null;

int hantei =ans1 + ans2 + ans3 + ans4 + ans5;

if(hantei > 2){

	//失敗時の表示
	img = null;

}else if(hantei <= 2){

	//成功時の表示
	img = null;

}


%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="index.css" type="text/css">
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=10.0, user-scalable=yes">
<meta name="apple-mobile-web-app-capable" content="yes">
<title>ゲーム結果画面</title>
</head>

<body>

	<%@ include file="header.jsp"%><br>
	<p>ここにゲームの結果がでるよ</p>

	<%-- クイズ結果を表示 --%>
	第１問は<%=a1 %>！！！<br>

	第２問は<%=a2 %>！！！<br>

	第３問は<%=a3 %>！！！<br>

	第４問は<%=a4 %>！！！<br>

	第５問は<%=a5 %>！！！<br>

	<img src="<%= img %>" alt="ステージストーリー"  title="ストーリー"><br>

	<%if(hantei > 2){%>
		<a href = "/GameProgress" >もう一度する</a><br>
		<%}else if(hantei <= 2){%>
		<a href = "/Levelup2">次のステージへすすむ</a><br>
		<%}%>

	<a href = "/menu">メニューに戻る</a>

</body>
</html>