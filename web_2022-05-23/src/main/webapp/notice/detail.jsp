<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet Project</title>
<link rel="stylesheet" href="../css/header.css">
<link rel="stylesheet" href="../css/footer.css">
<link rel="stylesheet" href="../css/notice_detail.css">
</head>
<body>
	<%@ include file="../includes/header.jsp" %>
	
    <div id="wrapper">
        <h2>공지사항</h2>

		<div id="title_wrapper">
			<span>${noticeInfo.title }</span>
		</div>
		
		<div id="contents_wrapper">
			<p>${noticeInfo.contents }</p>
		</div>
		
		<div id="file_wrapper">
			<img src="../images/img.png" alt=""><a href="#">첨부파일</a>
		</div>

        <div id="btn_wrapper">
            <button type="button" id="goToList">목록으로</button>
            
            <c:if test="${loginUserId eq 'admin' }">
            	<button type="button" id="goToDelete">공지사항 삭제</button>
            	<button type="button" id="goToUpdate">공지사항 수정</button>
            	
            	<script type="text/javascript">
	            	// idx 파라미터의 값을 꺼낸다.
	        		let parameter = location.search.substr(1);
	        		parameter = parameter.split("=");
	        		
	        		let idx = parameter[1];
	        		
	            	$("#goToUpdate").on("click", function() {
						location.href = "/web_2022-05-23/notice/detail?idx="+idx+"&requestPage=update";
					});
					
					$("#goToDelete").on("click", function() {
						location.href = "/web_2022-05-23/notice/delete?idx="+idx;
					});
            	</script>
            </c:if>

        </div>
	</div>
	
	<%@ include file="../includes/footer.jsp" %>
	
	<script>
		$("#btn_wrapper #goToList").on("click", function() {
			location.href = "/web_2022-05-23/notice/list?pageNumber=1";
		});
	</script>
</body>
</html>













