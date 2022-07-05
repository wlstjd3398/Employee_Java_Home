<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>두두몰</title>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="../assets/favicon.ico" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css" />
    <link rel="stylesheet" href="../css/login.css" />
    <link rel="stylesheet" href="../css/logo.css" />
</head>
<body class="text-center">
    
  <main class="form-signin">
    <form>
      <h1 class="h3 mb-3 fw-normal">
        <i class="bi bi-hand-index-thumb" id="rightHandLogo"></i>
        <i class="bi bi-hand-index-thumb" id="leftHandLogo"></i>
        두두몰
      </h1>
  
      <div class="form-floating">
        <input type="text" class="form-control" id="floatingInput" placeholder="아이디">
        <label for="floatingInput">아이디</label>
      </div>
      <div class="form-floating">
        <input type="password" class="form-control" id="floatingPassword" placeholder="Password">
        <label for="floatingPassword">비밀번호</label>
      </div>
  
      <div class="checkbox mb-3">
        <label>
          <input type="checkbox" value="remember-me"> 아이디 기억하기
        </label>
      </div>
      <button class="w-100 btn btn-lg btn-primary" id="login-btn" type="submit">로그인</button>
      <button class="w-100 btn btn-lg btn-secondary" type="button">회원가입</button>
    </form>
  </main>
  
  <script src="../js/jquery-3.6.0.min.js"></script>
  <script src="../js/validator.js"></script>
  <script>
  	$("#login-btn").on("click", function(e) {
  		e.preventDefault();
  		
  		let id = $("#floatingInput").val();
  		let pw = $("#floatingPassword").val();
  		
  		if(idValidator(id)) {
  			alert("아이디를 확인하세요.");
  			return false;
  		} else if(pwValidator(pw)) {
  			alert("비밀번호를 확인하세요.");
  			return false;
  		}
  		
  		$.ajax({
  			url: "/dodomall/member/login",
  			type: "POST",
  			data: "id=" + id + "&pw=" + pw,
  			success: function() {
  				location.href = "http://ec2-3-34-132-158.ap-northeast-2.compute.amazonaws.com:8080/dodomall";
  			},
  			error: function() {
  				alert("아이디 또는 비밀번호를 확인하세요.");
  			}
  		});
  	});
  </script>
  </body>
</html>








