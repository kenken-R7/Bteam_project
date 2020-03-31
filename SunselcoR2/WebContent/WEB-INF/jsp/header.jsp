<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import = "model.UserBean" %>

<!-- セッションスコープから名前を取得 -->
<%	UserBean user = (UserBean) session.getAttribute("user");%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="header.css" type="text/css">
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=10.0, user-scalable=yes">
<meta name="apple-mobile-web-app-capable" content="yes">
<title>ヘッダー</title>
</head>
<body>
<div class="right">ログインユーザ：<%= user.getName() %></div>
</body>
</html>