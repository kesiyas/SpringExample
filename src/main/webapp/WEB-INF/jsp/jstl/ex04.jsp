<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL fn 예제</title>
</head>
<body>
	<c:set var="str1" value="NO pain. NO gain." />
	
	<h2>길이 구하기</h2>
	<h4>${fn:length(str1)}</h4>
	
	<h2>특정 문자열이 존재하는지?</h2>
	<h4>NO가 존재하는가 ? ${fn:contains(str1, "NO") }</h4>
	<h4>no가 존재하는가 ? ${fn:contains(str1, "no") }</h4>
	
	<c:if test="${fn:containsIgnoreCase(str1, 'no')}">
		<h4>no라는 단어가 대소문자 구분 없이 포함되어 있다</h4>
	</c:if>
	
	<h2>특정 문자열로 시작, 끝나는지</h2>
	<h4>No로 시작하는지 ? ${fn:startsWith(str1, "No")}</h4>
	<h4>gain. 으로 끝나는지 ? ${fn:endsWith(str1, "gain.")}</h4>
	
	<h2>문자열 치환</h2>
	<c:set var="str2" value="I Love chicken" />
	<h4>${fn:replace(str2, "chicken", "bread") }</h4>
	
	<h2>문자열 쪼개기</h2>
	<h4>${fn:split(str2, " ")[0] } ${fn:split(str2, " ")[1] } ${fn:split(str2, " ")[2] }</h4>
	
	<h2>문자열 자르기</h2>
	${fn:substring(str2, 2, 6) }
	
	<h2>앞 뒤 공백 제거</h2>
	<c:set var="str3" value="          hello      " />
	<pre>${str3 }</pre>
	<pre>${fn:trim(str3) }</pre>
	

</body>
</html>