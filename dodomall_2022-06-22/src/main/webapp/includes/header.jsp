<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="header_title" value="홈" />
<c:choose>
	<c:when test="${param.page == 'all_product' }">
		<c:set var="header_title" value="모든 상품" />
	</c:when>
	<c:when test="${param.page == 'smartphone' }">
		<c:set var="header_title" value="스마트폰" />
	</c:when>
	<c:when test="${param.page == 'notebook' }">
		<c:set var="header_title" value="노트북" />
	</c:when>
	<c:when test="${param.page == 'tablet' }">
		<c:set var="header_title" value="테블릿" />
	</c:when>
	<c:when test="${param.page == 'product_detail' }">
		<c:set var="header_title" value="상세 정보" />
	</c:when>
	<c:when test="${param.page == 'product_update' }">
		<c:set var="header_title" value="상품 정보 수정" />
	</c:when>
	<c:when test="${param.page == 'buy' }">
		<c:set var="header_title" value="상품 구매" />
	</c:when>
</c:choose>

<!-- Header-->
<header class="bg-dark py-5">
    <div class="container px-4 px-lg-5 my-5">
        <div class="text-center text-white">
            <h1 class="display-4 fw-bolder">${header_title }</h1>
            <p class="lead fw-normal text-white-50 mb-0">With this shop hompeage template</p>
        </div>
    </div>
</header>






