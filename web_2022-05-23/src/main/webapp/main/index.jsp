<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet Project</title>
<link rel="stylesheet" href="../css/header.css">
<link rel="stylesheet" href="../css/footer.css">
<link rel="stylesheet" href="../css/main_index.css">
</head>
<body>
	<%@ include file="../includes/header.jsp" %>
	
	<main>
		<div id="notice_title">
			<h2>공지사항</h2>
			<a href="/web_2022-05-23/notice/list?pageNumber=1"> [ 더보기 ] </a>
		</div>
		
		<c:if test="${noticeAmount == 0 }">
			<div id="notice_list">공지사항이 없습니다.</div>
		</c:if>
		
		<c:if test="${noticeAmount gt 0 }">
			<div id="notice_list">
				<c:forEach items="${noticeInfoList }" var="noticeInfo">
					<div class="contents">
						<a href="/web_2022-05-23/notice/detail?idx=${noticeInfo.noticeId }">
							<span class="title">${noticeInfo.title }</span>
						</a>
					</div>
				</c:forEach>
			</div>
		</c:if>
	</main>
	
	<%@ include file="../includes/footer.jsp" %>
</body>
</html>





