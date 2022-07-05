<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>두두몰</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="../assets/favicon.ico" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="../css/styles.css" rel="stylesheet" />
        <link href="../css/logo.css" rel="stylesheet" />
    </head>
    <body>
		<%@ include file="../includes/navigation.jsp" %>
		
        <%@ include file="../includes/header.jsp" %>
        
        <!-- Section-->
        <section class="py-5">
            <div class="container col-xxl-8 px-4 py-5">
                <div class="row flex-lg-row-reverse align-items-center g-5 py-5">
                  <div class="col-10 col-sm-8 col-lg-6">
                  	<c:set var="imgFileName" value="${productInfo.img }" />
                  	<c:if test="${empty imgFileName}">
                  		<c:set var="imgFileName" value="no-image.png" />
                  	</c:if>
                  	
                    <img src="http://localhost/dodomall/images/product/${imgFileName }" class="d-block mx-lg-auto img-fluid" alt="Bootstrap Themes" width="700" height="500" loading="lazy">
                  </div>
                  <div class="col-lg-6">
                    <h1 class="display-5 fw-bold lh-1 mb-3">${productInfo.name }</h1>
                    <p class="lead">상품 소개 / Quickly design and customize responsive mobile-first sites with Bootstrap, the world’s most popular front-end open source toolkit, featuring Sass variables and mixins, responsive grid system, extensive prebuilt components, and powerful JavaScript plugins.</p>
                    <p class="lead">${productInfo.category }</p>
                    <p class="lead">${productInfo.price }</p>
                    <div class="d-grid gap-2 d-md-flex justify-content-md-start">
                      <button type="button" class="btn btn-primary btn-lg px-4 me-md-2" id="product_buy_btn">구매 하기</button>
                       
                       <c:if test="${memberInfo.id == 'Admin1' }">
                       	<button type="button" class="btn btn-warning btn-lg px-4 me-md-2" id="product_update_btn">정보 수정</button>
                       	<button type="button" class="btn btn-danger btn-lg px-4 me-md-2" id="product_delete_btn">상품 삭제</button>
                       </c:if>
                	</div>
                  </div>
                </div>
              </div>
        </section>
        
        <%@ include file="../includes/footer.jsp" %>
        
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
        
        <script src="../js/jquery-3.6.0.min.js"></script>
        <script>
        	$("#product_buy_btn").on("click", function() {
        		let stock = ${productInfo.stock};
        		
        		if(stock == 0) {
        			alert("재고가 없는 상품입니다.");
        		} else {
        			let productIdx = ${param.productIdx};
            		
            		location.href = "/dodomall/buy/form.jsp?page=buy&productIdx="+productIdx;
        		}
        	});
        
        	$("#product_update_btn").on("click", function() {
        		let productIdx = ${param.productIdx};
        		
        		// 상품 정보 수정 페이지로 이동
        		location.href = "/dodomall/view/product/update?page=product_update&productIdx=" + productIdx;
        	});
        
        	$("#product_delete_btn").on("click", function() {
        		let productIdx = ${param.productIdx};
        		
        		$.ajax({
        			url: "/dodomall/mng/product/delete",
        			type: "POST",
        			data: "productIdx=" + productIdx,
        			success: function() {
        				alert("상품을 삭제했습니다.");
        				
        				location.href = "/dodomall/product/list";
        			},
        			error: function() {
        				
        			}
        		});
        	});
        </script>
    </body>
</html>







