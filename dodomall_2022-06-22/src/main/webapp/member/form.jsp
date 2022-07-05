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
    <link rel="stylesheet" href="../css/join.css" />
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
        <input type="text" class="form-control" id="floatingInput" placeholder="아이디" value="${memberInfo.id }" disabled="disabled">
        <label for="floatingInput">아이디</label>
      </div>
      <div class="form-floating">
        <input type="password" class="form-control" id="floatingOldPassword" placeholder="Password">
        <label for="floatingOldPassword">현재 비밀번호</label>
      </div>
      <div class="form-floating">
        <input type="password" class="form-control" id="floatingNewPassword" placeholder="Password">
        <label for="floatingNewPassword">새 비밀번호</label>
      </div>
      <div class="form-floating">
        <input type="password" class="form-control" id="floatingNewPasswordCheck" placeholder="Password">
        <label for="floatingNewPasswordCheck">새 비밀번호 확인</label>
      </div>
      <div class="form-floating">
        <input type="text" class="form-control" id="floatingName" placeholder="Name" value="${memberInfo.name }">
        <label for="floatingName">이름</label>
      </div>
      <div class="form-floating">
        <input type="text" class="form-control" id="floatingTel" placeholder="Tel" value="${memberInfo.tel }">
        <label for="floatingTel">연락처</label>
      </div>
      <div class="form-floating">
        <input type="text" class="form-control" id="floatingAddr" placeholder="Address" value="${memberInfo.addr }">
        <label for="floatingAddr">주소</label>
      </div>
      <div class="form-floating">
        <input type="email" class="form-control" id="floatingEmail" placeholder="Email" name="email" value="${memberInfo.email }">
        <label for="floatingEmail">이메일</label>
      </div>
      
      <button class="w-100 btn btn-lg btn-primary" id="update_btn" type="button">정보수정</button>
      <button class="w-100 btn btn-lg btn-secondary" id="delete_btn" type="button">회원 탈퇴</button>
    </form>
  </main>
  
  <script src="../js/jquery-3.6.0.min.js"></script>
  <script src="../js/validator.js"></script>
  <script>
  	$("#delete_btn").on("click", function() {
  		$.ajax({
  			url: "/dodomall/member/delete",
  			type: "POST",
  			success: function() {
  				alert("탈퇴되었습니다.");
  				
  				location.href = "http://ec2-3-34-132-158.ap-northeast-2.compute.amazonaws.com:8080/dodomall";
  			},
  			error: function() {
  				alert("탈퇴하지 못했습니다. 잠시 후 다시 시도하세요.");
  			}
  		});
  	});
  
  	$("#update_btn").on("click", function() {
  		let oldPw = $("#floatingOldPassword").val();
  		let newPw = $("#floatingNewPassword").val();
  		let newPwChk = $("#floatingNewPasswordCheck").val();
  		let name = $("#floatingName").val();
  		let tel = $("#floatingTel").val();
  		let addr = $("#floatingAddr").val();
  		let email = $("#floatingEmail").val();
  		
  		if(oldPw != "") {
  			// 사용자가 비밀번호를 변경하기 위해서 현재 비밀번호, 새 비밀번호, 새 비밀번호 확인을 입력했다면
  			if(pwValidator(oldPw)) {
  				alert("현재 비밀번호를 확인하세요.");
  				return false;
  			} else if(pwValidator(newPw)) {
  				alert("새 비밀번호를 확인하세요.");
  				return false;
  			} else if(newPw != newPwChk) {
  				alert("새 비밀번호와 새 비밀번호 확인이 일치하지 않습니다.");
  				return false;
  			}
  		}
  		
  		if(nameValidator(name)) {
  			alert("이름을 확인하세요.");
  			return false;
  		} else if(telValidator(tel)) {
  			alert("연락처를 확인하세요.");
  			return false;
  		} else if(addrValidator(addr)) {
  			alert("주소를 확인하세요.");
  			return false;
  		} else if(emailValidator(email)) {
  			alert("이메일을 확인하세요.");
  			return false;
  		}
  		
  		$.ajax({
  			url: "/dodomall/member/update",
  			type: "POST",
  			data: "oldPw="+oldPw+"&newPw="+newPw+"&newPwChk="+newPwChk+"&name="+name+"&tel="+tel+"&addr="+addr+"&email="+email,
  			success: function() {
  				alert("정보를 수정했습니다.");
  				
  				// 페이지 새로고침 등을 활용해서 수정된 정보가 보이도록 정보 수정 페이지를 보여줘야함
  				location.reload();
  			},
  			error: function() {
  				// 연락처 또는 이메일 등이 이미 사용중이여서 정보를 수정하지 못했을 떄
  				alert("연락처 또는 이메일이 이미 사용중입니다.");
  			}
  		});
	});
  </script>
  </body>
</html>










