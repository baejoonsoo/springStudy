<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script type="text/javascript">
window.onload=function(){
	const btn_idCheck=document.getElementById("idCheck")
	btn_idCheck.onlick=function(event){
		event.preventDefault()
		console.log("onclick...")
	}
}

</script>
</head>
<body>
	<h1>회원가입</h1>
	<form action="insertOK.do" method="post">
		<table>
			<tr>
				<th>이름</th>
				<td><input name='name' value="kim"></td>
			</tr>
			<tr>
				<th>폰번</th>
				<td><input name='phone' value="010"></td>
			</tr>
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
					<button id="idCheck">가입완료</button>
				</th>
			</tr>
		</table>
	</form>
</body>
</html>