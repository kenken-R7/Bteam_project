<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.UserBean" %>
<!-- セッションスコープから名前を取得 -->
<% UserBean user=(UserBean)session.getAttribute("user");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ヘッダー</title>
</head>
<body>
ログインユーザ：<%= user.getName() %>
</body>
</html>