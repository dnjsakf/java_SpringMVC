<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>model(jstl): ${myTest}</h1>
	<h1>model: <%= request.getAttribute("myTest") %></h1>
	<h1>ModelAndView: <%= request.getAttribute("mvTest")%></h1>
	<img src="/<%= request.getAttribute("mvTest")%>.png" alt="tomcat">
</body>
</html>