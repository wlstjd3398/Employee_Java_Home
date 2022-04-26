<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="../includes/URLConfig.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet Project</title>
<link rel="stylesheet" href="/web_31/css/footer.css">
<link rel="stylesheet" href="/web_31/css/member_join.css">
</head>
<body>
	<div id="wrapper">
        <h3>회원가입</h3>

		<form action="${SERVLET_JOIN_URL }" method="POST">
			<div>
				<label>아이디&nbsp;&nbsp;&nbsp;&nbsp;: <input type="text" name="id"></label>
			</div>
			
			<div>
				<label>비밀번호 : <input type="password" name="pw"></label>
			</div>
			
			<div>
				<label>이름&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <input type="text" name="name"></label>
			</div>
			
			<input type="submit" value="회원가입">
		</form>
	</div>
	
	<footer>메가스터디 IT 아카데미 웹개발 취업반 Servlet 프로젝트</footer>
</body>
</html>