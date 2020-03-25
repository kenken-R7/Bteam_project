<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メニュー画面</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<form action="gameStart.jsp" method="POST">
		<input type="submit" value="GAME">
	</form>
	<form action="/SunselcoR2/AccountManagement" method="GET">
		<input type="submit" value="アカウント">
	</form>
	<form action="link.jsp" method="POST">
		<input type="submit" value="外部リンク">
	</form>
	<form action="/SunselcoR2/" method="POST">
		<input type="submit" value="ログアウト">
	</form>
</body>
</html>