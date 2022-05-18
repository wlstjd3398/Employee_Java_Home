<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>두두몰</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="../css/styles.css" rel="stylesheet" />
        <link href="../css/logo.css" rel="stylesheet" />
        <link href="../css/product_list.css" rel="stylesheet" />
    </head>
    <body>
        <!-- Navigation-->
        <%@ include file="../includes/header_nav.jsp" %>
        
        <!-- Header-->
        <%@ include file="../includes/header.jsp" %>
        
        <!-- Section-->
        <section class="py-5">
            <div class="container px-4 px-lg-5 mt-5">
                <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center" id="product_list_wrapper"></div>
                
                <nav id="pagination_wrapper" aria-label="Page navigation example">
				  <ul class="pagination pagination-lg"></ul>
				</nav>
            </div>
        </section>
        <!-- Footer-->
        <footer class="py-5 bg-dark">
            <div class="container"><p class="m-0 text-center text-white">Copyright &copy; Your Website 2022</p></div>
        </footer>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="../js/scripts.js"></script>
        
        <script src="../js/jquery-3.6.0.min.js"></script>
        <script>
        	// pageNumber 파라미터의 값을 꺼내서
        	// ajax의 pageNumber 데이터로 전달
        	let pageNumber = 1;
			
        	let parameters = location.search;
        	parameters = parameters.substr(1);
        	parameters = parameters.split("&");

        	let pageNumberParam = parameters[1];
        	if(pageNumberParam != undefined) {
        		pageNumberParam = pageNumberParam.split("=");
            	
            	pageNumber = pageNumberParam[1];
        	}
        	
        	$.ajax({
        		url: "/shoppingmall/product/list",
        		type: "GET",
        		data: "pageNumber="+pageNumber,
        		success: function(productInfo) {
        			
        			// productInfo.amount는 전체 페이지 
            		// 8은 한페이지에 보여줄 갯수
        			let pageCount = Math.ceil(productInfo.amount / 8);
        			for(let count=1; count<=pageCount; count++) {
        				$("ul.pagination").append("<li class=\"page-item\"><a class=\"page-link\" href=\"/shoppingmall/shop/product_list.jsp?active=product_list&pageNumber=" + count + "\">" + count + "</a></li>");
        			}
        			
        			let tag = 
		        		"<div class=\"col mb-5\">" + 
		                    "<div class=\"card h-100\">" + 
		                        "<img class=\"card-img-top\" src=\"http://localhost:8080/shoppingmall/images/product/(1)\" alt=\"...\" />" +
		                        "<div class=\"card-body p-4\">" +
		                            "<div class=\"text-center\">" +
		                                "<h5 class=\"fw-bolder\">(2)</h5>" +
		                                "(3)" +
		                            "</div>" +
		                        "</div>" +
		                        "<div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">" +
		                            "<div class=\"text-center\">" +
		                            	"<a class=\"btn btn-outline-dark mt-auto\" href=\"/shoppingmall/shop/product_detail.jsp?active=product_detail&idx=(4)\">상세 정보</a>" +
		                            	"<a class=\"btn btn-outline-dark mt-auto\" href=\"#\">카드에 담기</a>" +
		                            "</div>" +
		                        "</div>" +
		                    "</div>" +
		                "</div>";
		            
		            for(let i=0; i<productInfo.list.length; i++) {
		            	let nthProduct = productInfo.list[i];
		            	
		            	let nthTag = tag.replace("(1)", nthProduct.img);
		            	nthTag = nthTag.replace("(2)", nthProduct.name);
		            	nthTag = nthTag.replace("(3)", nthProduct.price);
		            	
		            	nthTag = nthTag.replace("(4)", nthProduct.idx);
		            	
		            	$("#product_list_wrapper").append(nthTag);
		            }
        		},
        		error: function(response) {
        			console.log("에러 발생");
        			console.log(response);
        		}
        	});
        </script>
    </body>
</html>









