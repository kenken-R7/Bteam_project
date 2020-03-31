<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="index.css" type="text/css">
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=10.0, user-scalable=yes">
<meta name="apple-mobile-web-app-capable" content="yes">
<title>ログアウト画面</title>
</head>
<body>
<br>
	<p>ログアウトしますか？</p>
	<form action="index.jsp" method="POST">
		<p><input type="submit" class="btn" value="はい"></p>
	</form>
	<form action="menu.jsp" method="POST">
		<p><input type="submit" class="btn"  value="いいえ"></p>
	</form>
</body>
</html>