<%@page import="java.util.ArrayList"%>
<%@page import="dto.NoticeInfo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	List<NoticeInfo> noticeInfoList = (ArrayList<NoticeInfo>) request.getAttribute("noticeInfoList");
	
	int noticeInfoAmount = noticeInfoList.size();
	
	request.setAttribute("noticeInfoAmount", noticeInfoAmount);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet Project</title>
<link rel="stylesheet" href="../css/header.css">
<link rel="stylesheet" href="../css/footer.css">
<link rel="stylesheet" href="../css/notice_list.css">
</head>
<body>
	<%@ include file="../includes/header.jsp" %>
	
	<div id="wrapper">
        <h2>공지사항</h2>
		
        <div id="notice_wrapper">
            <div id="title_info_wrapper">
                <span class="order">번호</span>
                <span class="title">제목</span>
            </div>
            <div id="list">
            	<c:choose>
            		<c:when test="${noticeInfoAmount eq 0 }">
            			<div class="contents">
            				<span class="order"></span>
            				<a href="#">
            					<span class="title">작성된 공지사항이 없습니다.</span>
            				</a>
            			</div>
            		</c:when>
            		
            		<c:otherwise>
						<c:set var="startNumber" value="${noticeInfoAmount - ((param['pageNumber']-1)*5)}" />
		            	<%-- 2. 요청 정보에 들어있는 공지사항 목록 출력 --%>
		            	<c:forEach var="noticeInfo" items="${noticeInfoList }" varStatus="status">
		            		<c:set var="order" value="${startNumber - status.index}" />
		            		<c:set var="idx" value="${noticeInfo.noticeId}" />
		            		<c:set var="title" value="${noticeInfo.title }" />
		            		
		            		<div class="contents">
		            			<span class="order">${order }</span>
		            			<a href="/web_2022-05-23/notice/detail?idx=${idx }">
		            				<span class="title">${title }</span>
		            			</a>
		            		</div>
		            	</c:forEach>
            		</c:otherwise>
            	</c:choose>
            </div>
            <div class="pagination">
            	<%-- 1. 요청 정보에 들어있는 등록된 공지사항 개수를 사용해서 페이지네이션 출력 --%>
            	<c:set var="lastPageNumber" value="${noticeAmount / 5 }" />
            	
            	<c:forEach var="pageNumber" begin="1" end="${lastPageNumber }" step="1" >
            		<span>${pageNumber }</span>
            	</c:forEach>
            	
            	<script>
	            	// pagination 안에 페이지 번호를 클릭했을 때
					$(".pagination span").on("click", function() {
						// 현재 클릭한 페이지 번호를 가져옴
						let $span = $(this);
						let clickedPageNumber = $span.text();
						
						location.href = "/web_2022-05-23/notice/list.html?pageNumber="+clickedPageNumber;
					});
            	</script>
            </div>
        </div>
	</div>
	
	<%@ include file="../includes/footer.jsp" %>
</body>
</html>





