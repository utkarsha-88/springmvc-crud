<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Customer - CRM</title>
<link href="<c:url value="/resources/css/style1.css" />"
	rel="stylesheet">
</head>
<body background="<c:url value="/resources/images/back1.jpg"/>" />
<img src="<c:url value="/resources/images/coforge.jpg"/>" width=200px; height=100px; />
<h2 align="center">CRM - Customer Relationship Manager</h2>
<hr color="pink" size="3" />
<c:url var="travelLink" value="/travel/travelForm">
	<c:param name="customerId" value="${usr.id}" />
</c:url>
<c:url var="leaveLink" value="/leave/leaaveForm">
	<c:param name="customerId" value="${usr.id}" />
</c:url>
<div style="color: blue" align="center">Welcome Employee ID:
	${usr.id} User: ${usr.email}</div>
<a href="${travelLink}">Travel</a>
<br>
<br>
<br>
<a href="${Link}">Leave</a>
</body>
</html>