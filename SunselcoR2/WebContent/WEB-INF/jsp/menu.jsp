<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="index.css" type="text/css">
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=10.0, user-scalable=yes">
<meta name="apple-mobile-web-app-capable" content="yes">
<title>メニュー画面</title>
</head>
<body>
	<%@ include file="header.jsp"%><br><br>

	<form action="/SunselcoR2/GameProgress" method="get">
		<p><input type="submit" class="btn" value="GAME"></p>
	</form>
	<form action="/SunselcoR2/AccountManagement" method="get">
		<p><input type="submit" class="btn" value="アカウント"></p>
	</form>
	<form action="link.jsp" method="POST">
		<p><input type="submit" class="btn" value="外部リンク"></p>
	</form>
	<form action="index.jsp" method="POST">
		<p><input type="submit" class="btn" value="ログアウト"></p>
	</form>
</body>
</html>