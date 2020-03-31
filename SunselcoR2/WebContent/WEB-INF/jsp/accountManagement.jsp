<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import = "model.UserBean" %>

<%

	//セッションスコープからユーザー情報を取得
	UserBean user = (UserBean) session.getAttribute("user");

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="index.css" type="text/css">
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=10.0, user-scalable=yes">
<meta name="apple-mobile-web-app-capable" content="yes">
<title>アカウント情報変更</title>

<body>

	<h2>アカウント情報変更</h2>

	<p><img src="女性.png"></p>

	<form action="/SunselcoR2/AccountManagement" method="post">

		<!-- 現在のIDを表示 -->
		現在のID：<%=user.getId() %><br>
		<p><label for ="id">ID:</label><br>
		<input type="text" name="id" pattern="^[0-9A-Za-z]+$" required></p>

		<!-- 現在のパスワードを表示 -->
		現在のパスワード：<%=user.getPassword() %><br>
		<p><label for ="password">パスワード:</label><br>
		<input type="password" name="password" pattern="^[0-9A-Za-z]+$" required></p>

		<!-- 現在の名前を表示 -->
		現在の名前：<%=user.getName() %><br>
		 <p><label for ="name">名前:</label><br>
		 <input type="text" name="name" required></p>

		<p><input type="submit" class="btn" value="変更"></p>
	</form>

	<form action="/SunselcoR2/AccountDelete" method="get">
		<p><input type="submit" class="btn" value="アカウント削除"></p>
	</form>

	<form action="/SunselcoR2/menu-servlet" method="post">
		<p><input type="submit" class="btn" value="メニューに戻る"></p>
	</form>

</body>
</html>