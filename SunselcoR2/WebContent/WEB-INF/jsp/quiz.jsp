<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="quiz.css" type="text/css">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=10.0, user-scalable=yes">
<meta name="apple-mobile-web-app-capable" content="yes">
<title>クイズ画面</title>

</head>
<body>
	<%@ include file="header.jsp"%><br><br>
	
	<p>	<img src="おおたくん.png"> </p><br>
	<p>ここに問題文が入る</p><br>

	<form action="quiz.jsp" method="POST">
		<p><input type="submit" class="btn-sticky" value="解答１"></p>
	</form>

	<form action="quiz.jsp" method="POST">
		<p><input type="submit" class="btn-sticky" value="解答２"></p>
	</form>

	<form action="quiz.jsp" method="POST">
		<p><input type="submit" class="btn-sticky" value="解答３"></p>
	</form>

	<form action="quiz.jsp" method="POST">
		<p><input type="submit" class="btn-sticky" value="解答４"></p>
	</form>
<br>
	<form action="menu.jsp" method="POST">
		<p><input type="submit" class="btn" value="メニューに戻る"></p>
	</form>

</body>
</html>