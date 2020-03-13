<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="secondary.Fruit" %>
<%Fruit fruit=(Fruit)request.getAttribute("fruit"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p><%=fruit.getName() %>の値段は<%=fruit.getPrice() %>円です。</p>
</body>
</html>