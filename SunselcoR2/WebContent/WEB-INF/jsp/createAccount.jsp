<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="index.css" type="text/css">
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=10.0, user-scalable=yes">
<meta name="apple-mobile-web-app-capable" content="yes">
<title>アカウント作成</title>
<body>
	<h2>アカウント作成</h2>
	<p><img src="男性.png"></p>
	<form action="/SunselcoR2/CreateAccount" method="post">

		<p><label for ="id">ID:</label><br>
		<input type="text" name="id" pattern="^[0-9A-Za-z]+$" required></p>

		 <p><label for ="password">パスワード:</label><br>
		 <input type="password" name="password" pattern="^[0-9A-Za-z]+$" required></p>

		 <p><label for ="name">名前:</label><br>
		<input type="text" name="name" required></p>


		<input type="submit" class="btn" value="アカウント作成">
	</form>

	<form action="/SunselcoR2/loginservlet" method="POST">
		<p><input type="submit" class="btn" value="ログイン画面に戻る"></p>
	</form>
</body>
</html>