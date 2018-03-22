<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello</title>
</head>
<body>
	<%
		String name=(String)request.getAttribute("name");
	%>
	<h3>Hello Page</h3> 
	${name}
</body>
</html>