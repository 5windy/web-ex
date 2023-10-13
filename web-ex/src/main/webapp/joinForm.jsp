<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 	<form method="POST" action="joinFormPro.jsp">
 		<input type="text" name="username" id="username">
 	
 		<!-- <input type="submit"> -->
 		<!-- <button>가입</button> -->
 		<!-- form 안에 있는 button 태그는 디폴트 submit 동작을 하게됨 -->
 		<input type="button" value="join" onclick="checkForm(form)">
	</form>
	
	<script src="resources/script/validation.js"></script>
</body>
</html>