<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="secondary.User" %>
    <%User registerUser=(User)session.getAttribute("registerUser"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>ログインID：<%= registerUser.getId() %><br>
名前：<%= registerUser.getName() %><br>
</p>
<a href="/secondary/RegisterUser">戻る</a>
<a href="/secondary/RegisterUser?action=done">登録</a>
</body>
</html>