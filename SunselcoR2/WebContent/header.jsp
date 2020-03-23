<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- セッションスコープから名前を取得 -->
<%	String name = (String)session.getAttribute("name");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ヘッダー</title>
</head>
<body>
ログインユーザ：<%=name %>
</body>
</html>