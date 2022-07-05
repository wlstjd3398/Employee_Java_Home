<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="btnTitle" value="공지사항 작성" />
<c:set var="action" value="/web_2022-05-23/notice/write" />

<c:if test="${not empty param['idx'] }">
	<c:set var="btnTitle" value="공지사항 수정" />
	<c:set var="action" value="/web_2022-05-23/notice/update" />
</c:if>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet Project</title>
<link rel="stylesheet" href="../css/header.css">
<link rel="stylesheet" href="../css/footer.css">
<link rel="stylesheet" href="../css/notice_form.css">
</head>
<body>
	<%@ include file="../includes/header.jsp" %>
	
	<div id="wrapper">
        <h2>공지사항</h2>

		<form action="${action }" method="POST">
			<c:if test="${not empty param['idx'] }">
				<input type="hidden" name="idx" value="${param['idx'] }">
			</c:if>
		
			<div id="title_wrapper">
				<label>제목&nbsp;&nbsp;&nbsp;&nbsp;: <input type="text" name="title" id="title" value="${noticeInfo.title }"></label>
			</div>
			
			<div id="contents_wrapper">
				<label>내용<br><textarea name="contents" cols="100" rows="10" id="contents">${noticeInfo.contents }</textarea> </label>
			</div>
			
			<div>
				<label>첨부파일 : <input type="file" name="file"></label>
			</div>

	        <div id="btn_wrapper">
	            <button type="submit">${btnTitle }</button>
	        </div>
        </form>
	</div>
	
	<%@ include file="../includes/footer.jsp" %>
</body>
</html>
















