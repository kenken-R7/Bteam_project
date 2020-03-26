<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.UserBean" %>
<% UserBean user=(UserBean)session.getAttribute("user"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>アカウント情報変更</title>
</head>
<body>
<h1>アカウント情報変更</h1>
<form action="/SunselcoR2/changeAccount" method="POST">
<label>
現在のID：<%=user.getId() %><br>
ID:<input type="text" name="id" pattern="[0-9A-Za-z]+$" required>（半角英数）※必須
</label><br>
<label>
現在のパスワード：<%=user.getPassword() %><br>
パスワード：<input type="password" name="password" pattern="[0-9A-Za-z]+$" required>（半角英数）※必須
</label><br>
<label>
現在の名前：<%=user.getName() %><br>
名前：<input type="text" name="name" required>※必須
</label><br>
<input type="submit" value="変更"><br>
</form>

<form action="accountDeleteResult.jsp" method="POST">
		<input type="submit" value="アカウント削除">
	</form>
	<form action="menu.jsp" method="POST">
		<input type="submit" value="メニューに戻る">
	</form>
</body>
</html>