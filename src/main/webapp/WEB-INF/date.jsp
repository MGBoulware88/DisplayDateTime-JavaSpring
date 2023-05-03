<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Today's Date</title>
<link rel="stylesheet" href="/css/styles.css" />
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body class="d-flex justify-content-center align-content-center py-5">
	<div >
		<div class="card d-flex justify-content-center align-content-center p-3">
			<h1 class="text-primary" id="date"><c:out value="${date}" /></h1>
		</div>
	</div>
	
	<script src="/js/app.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>