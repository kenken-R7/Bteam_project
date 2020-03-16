<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>アカウント作成</title>
<body>
	<h2>アカウント作成</h2>
	<form action="/sunselcoR1/CreateAccount" method="post">
		<label> 
		ID:<input type="text" name="id" pattern="^[0-9A-Za-z]+$" required>（半角英数）※必須
		</label><br> 
		<label>
		 パスワード:<input type="text" name="password" pattern="^[0-9A-Za-z]+$" required>（半角英数）※必須
		</label><br> 
		<label>
		 名前:<input type="text" name="name" required>※必須
		</label><br> 
		<input type="submit" value="アカウント作成"><br>
	</form>

	<form action="loginPage.jsp" method="POST">
		<input type="submit" value="ログイン画面に戻る">
	</form>
</body>
</html>