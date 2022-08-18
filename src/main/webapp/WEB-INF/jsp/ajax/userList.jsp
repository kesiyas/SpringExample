<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 정보</title>
</head>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous">
</script>
<body>
	<table border="1" >
		<thead>
			<tr>
				<th>이름</th>
				<th>생년월일</th>
				<th>이메일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${userList }">
			<tr>
				<td>${user.name }</td>
				<td>${user.yyyymmdd }</td>
				<td>${user.email }</td>
			</tr>
			</c:forEach>
		</tbody>
	
	</table>


</body>
</html>