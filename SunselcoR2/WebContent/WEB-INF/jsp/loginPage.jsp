<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="index.css" type="text/css">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=10.0, user-scalable=yes">
<meta name="apple-mobile-web-app-capable" content="yes">
<title>ログインページ</title>
</head>
<body>
	<h2>ログインページ</h2>
	<p><img src="ログイン画像小.png"></p>

	<form action="/SunselcoR2/LoginControllerServlet" method="POST">

		<p><label for ="id">ID:</label><br>
		<input type="text" name="id" pattern="^[0-9A-Za-z]+$" required></p>

		<p><label for ="password">パスワード:</label><br>
		<input type="password"
					name="password" pattern="^[0-9A-Za-z]+$" required></p>

		<p><input type="submit" class="btn" value="ログイン"></p>

	</form>

	<form action="/SunselcoR2/CreateAccount" method="GET">
	<p><input type="submit" class="btn" value="アカウント作成"></p>

	</form>
</body>
</html>



