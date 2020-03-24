<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログインページ</title>
</head>
<body>
	<h2>ログインページ</h2>
	<form action="/SunselcoR2/LoginControllerServlet" method="POST">
		<label>
		ID:<input type="text" name="id" pattern="^[0-9A-Za-z]+$" required>（半角英数）※必須
		</label><br>
		<label>
		 パスワード:<input type="password" name="password" pattern="^[0-9A-Za-z]+$" required>（半角英数）※必須
		</label><br>
		<input type="submit" value="ログイン"><br>
	</form>

	<form action="createAccount.jsp" method="POST">
		<input type="submit" value="アカウント作成">
	</form>
</body>
</html>



