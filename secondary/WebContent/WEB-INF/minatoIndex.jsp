<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="sex.SiteEV" %>
    <% SiteEV siteEV=(SiteEV)application.getAttribute("siteEV"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>湊くんのページへようこそ</h1>
<p>
<a href="/sex/MinatoIndex.java?action=like">よいね</a>:<%= siteEV.getLike() %>人
<a href="/sex/MinatoIndex.java?action=dislike">よくないね</a>:<%= siteEV.getDislike() %>人
</p>
<h2>湊くんとは！？</h2>
<p>・・・・・</p>
</body>
</html>