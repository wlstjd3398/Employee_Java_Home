<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입(2)</title>
</head>
<body>

	<form action="/spring_2022-05-23/register/step3" method="POST">
		<div>
			<label>이메일 : <input type="text" name="email" id="email"> </label>
		</div>
		
		<div>
			<label>이름 : <input type="text" name="name" id="name"> </label>
		</div>
		
		<div>
			<label>비밀번호 : <input type="password" name="password" id="password"> </label>
		</div>
		
		<div>
			<label>비밀번호 확인 : <input type="password" name="confirmPassword" id="confirmPassword"> </label>
		</div>
		
		<input type="submit" value="가입 완료">
	</form>
</body>
</html>