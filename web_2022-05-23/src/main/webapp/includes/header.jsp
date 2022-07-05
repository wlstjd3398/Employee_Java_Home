<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script src="../js/jquery-3.6.0.min.js"></script>
<script src="../js/functions.js"></script>

<header>
	<div id="login_area">
		<form action="#" method="POST">
			<c:choose>
				<c:when test="${loginUserId != null }">
					<%-- 로그인 한 상태라면 로그인한 상태의 헤더를 출력 --%>
					<span>${loginUserName }님 환영합니다!</span>
					<button type="button" id="logout">로그아웃</button>
					
					<script>
						$("#logout").on("click", function() {
							location.href = "/web_2022-05-23/member/logout";
						});
						
						$("#join_btn").remove();
					</script>
				</c:when>
				
				<c:otherwise>
					<%-- 로그인하지 않은 상태라면 로그인하지 않은 상태의 헤더를 출력 --%>
					<input type="text" name="id" placeholder="아이디" id="id">
					<input type="password" name="pw" placeholder="비밀번호" id="pw">
					<input type="submit" value="로그인" id="login_btn">
				</c:otherwise>
			</c:choose>
		</form>
	</div>
	<div id="join_area">
		<c:if test="${empty loginUserId }">
			<button type="button" id="join_btn">회원가입</button>
		</c:if>
		
		<c:if test="${loginUserId == 'admin' }">
			<button type=button id=notice_write>공지사항 작성</button>
			
			<script>
				$("#join_area").on("click", function() {
					location.href = "/web_2022-05-23/notice/form";
				});
			</script>
		</c:if>
	</div>
</header>

<script>
	// header.jsp 안에 있는 스크립트 코드는 Jquery가 추가되기 전에 동작하는데
	// Jquery가 추가되야 사용할 수 있는 코드들이 있으므로
	// 페이지 로드가 완료된 후에 동작하도록 해야함
	// 순수 JavaScript만 사용해서 구현하면 Jquery를 추가하는 코드를 닫는 body 바로 위에 넣을 수 있음
	// 순수 JavaScript만 사용하면 구현하기가 어려우므로
	// Jquery가 제공하는 페이지 로드가 완료된 후에 동작하도록 하는 코드를 사용
	// $(function() { 페이지 로드가 완료된 후 동작할 코드 });
	
	$(function() {
		// 회원 가입 버튼을 클릭했을 때
		// location.href 를 사용해서
		// 회원 가입 페이지로 이동하도록 구현하세요.
		$("#join_btn").on("click", function() {
			location.href = "/web_2022-05-23/member/join";
		});
		
		$("#login_btn").on("click", function(event){
			event.preventDefault();
			
			let id = $("#id").val();
			let pw = $("#pw").val();
			
			$.ajax({
				url: "/web_2022-05-23/member/login",
				type: "POST",
				data: "id="+id+"&pw="+pw,
				success: function(loginUserInfo) {
					setHeader(loginUserInfo);
				},
				error: function() {
					alert("아이디 또는 비밀번호를 확인하세요.");
				}
			});
		});
	});
</script>