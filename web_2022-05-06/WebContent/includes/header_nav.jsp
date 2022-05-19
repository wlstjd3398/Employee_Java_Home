<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- ${loginUserInfo} --%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
   <div class="container px-4 px-lg-5">
       <a class="navbar-brand" href="/shoppingmall?active=home">
      		<i class="bi bi-hand-index-thumb" id="rightHandLogo"></i>
      		<i class="bi bi-hand-index-thumb" id="leftHandLogo"></i>
       	두두몰1
       </a>
       <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
       <div class="collapse navbar-collapse" id="navbarSupportedContent">
           <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
               <li class="nav-item"><a class="nav-link active" aria-current="page" href="/shoppingmall?active=home">홈</a></li>
               <li class="nav-item"><a class="nav-link" href="#!">브랜드 소개</a></li>
               
	<!--                로그인을 한 상태에서 보여지는 메뉴 -->
<%-- 			<c:if test="${loginUserInfo ne null}"> --%>
<!--                <li class="nav-item"><a class="nav-link" href="/shoppingmall/login/login.jsp">회원정보 수정</a></li> -->
<!--                <li class="nav-item"><a class="nav-link" href="/shoppingmall/join/join.jsp">회원 탈퇴</a></li> -->
<!--                <li class="nav-item"><a class="nav-link" href="/shoppingmall/login/login.jsp">로그아웃</a></li> -->
            	
<%--             	<c:if test="${loginUserInfo.id eq 'Admin1234' }"> --%>
<!--             	 	<li class="nav-item"><a class="nav-link" href="/shoppingmall/manager/product_form.jsp?actvie=product_add">상품 추가</a></li> -->
<%--             	</c:if> --%>
<%--             </c:if> --%>
               
<!--                               로그인을 하지 않는 상태에서 보여지는 메뉴 -->
<%-- 			<c:if test="${loginUserInfo eq null}"> --%>
<!--                <li class="nav-item"><a class="nav-link" href="/shoppingmall/login/login.jsp">로그인</a></li> -->
<!--                <li class="nav-item"><a class="nav-link" href="/shoppingmall/join/join.jsp">회원가입</a></li> -->
<%--             </c:if> --%>
            
               
               <li class="nav-item dropdown">
                   <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">쇼핑</a>
                   <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                       <li><a class="dropdown-item" href="/shoppingmall/shop/product_list.jsp?active=product_list">모든 상품</a></li>
                       <li><hr class="dropdown-divider" /></li>
                       <li><a class="dropdown-item" href="#!">인기 상품</a></li>
                       <li><a class="dropdown-item" href="#!">새로운 상품</a></li>
                   </ul>
               </li>
               
               <li class="nav-item">
               	<div class="dropdown text-end">
	          		<a href="#" class="d-block link-dark text-decoration-none dropdown-toggle" id="dropdownUser1" data-bs-toggle="dropdown" aria-expanded="false">
	           	 		<i class="bi bi-person-circle" style="font-size:24px;"></i>
         		 	</a>
		          <ul class="dropdown-menu text-small" aria-labelledby="dropdownUser1">

<!-- 		            로그인이 되어있다면 -->
					<c:if test="${loginUserInfo ne null}">
						<li><a class="dropdown-item" href="/shoppingmall/member/form.jsp">회원정보 수정</a></li>
						<li><a class="dropdown-item" href="/shoppingmall/login/login.jsp">로그아웃</a></li>
					
						<c:if test="${loginUserInfo.id eq 'Admin1234' }">
							<li><a class="dropdown-item" href="/shoppingmall/manager/product_form.jsp?actvie=product_add">상품 추가</a></li>
		           	 	</c:if>
		            </c:if>
		            
<!-- 		            로그인이 되어있지 않다면 -->
					<c:if test="${loginUserInfo eq null}" />
					<li><a class="dropdown-item" href="/shoppingmall/login/login.jsp">로그인</a></li>
					<li><a class="dropdown-item" href="/shoppingmall/join/join.jsp">회원가입</a></li>
		          </ul>
	        	</div>
               </li>
           </ul>
           <form class="d-flex">
               <button class="btn btn-outline-dark" type="submit">
                   <i class="bi-cart-fill me-1"></i>
                   장바구니
                   <span class="badge bg-dark text-white ms-1 rounded-pill">0</span>
               </button>
           </form>
       </div>
   </div>
</nav>