<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>アカウント削除確認画面</title>
</head>
<body>

	<br>
	<br>
	<p>本当にアカウントを削除しますか？</p>

	<form action="/SunselcoR2/AccountDelete" method="POST">
		<input type="submit" class="btn" value="はい">
	</form>

	<form action="/SunselcoR2/LoginControllerServlet" method="POST">
		<input type="submit" class="btn" value="MENUに戻る">
	</form>

</body>
</html>