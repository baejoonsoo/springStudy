<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>로그인</h1>
	<form action="loginOK.do" method="post">
		<table>
			<tr>
				<th>아이디</th>
				<td><input name='id' value="admin"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input name='password' type='password' value="1234"></td>
			</tr>
			<tr>
				<th>
					<button id="idCheck">로그인</button>
				</th>
			</tr>
		</table>
	</form>
	<a href="/member/insert.do">
		<p>회원가입</p>
	</a>
</body>
</html>
