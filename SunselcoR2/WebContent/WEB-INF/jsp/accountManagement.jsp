<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%--セッションスコープからユーザー情報を取得--%>
<% 	String id = (String)session.getAttribute("id");
	String password = (String)session.getAttribute("password");
	String name = (String)session.getAttribute("name");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>アカウント情報変更</title>
<body>
<h2>アカウント情報変更</h2>
	<form action="/sunselcoR1/CreateAccount" method="post">
		<label> 
		<!-- 現在のIDを表示 -->
		現在のID：<%=id %><br>
		ID:<input type="text" name="id" pattern="^[0-9A-Za-z]+$" required>（半角英数）※必須
		</label><br> 
		<label>
		<!-- 現在のパスワードを表示 -->
		現在のパスワード：<%=password %><br>
		 パスワード:<input type="password" name="password" pattern="^[0-9A-Za-z]+$" required>（半角英数）※必須
		</label><br> 
		<label>
		<!-- 現在の名前を表示 -->
		現在の名前：<%=name %><br>
		 名前:<input type="text" name="name" required>※必須
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