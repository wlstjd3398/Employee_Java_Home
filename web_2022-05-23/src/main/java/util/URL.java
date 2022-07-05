package util;

public class URL {
	// 1. 메인 페이지
	public static String MAIN_PAGE = "/main/index.jsp";
	
	// 2. 회원 가입 페이지
	public static String JOIN_PAGE = "/member/join.jsp";
	
	// 3. 회원 가입 완료 페이지
	public static String JOIN_SUCCESS_PAGE = "/member/joinSuccess.jsp";
	
	// 4. 공지사항 목록 페이지
	public static String NOTICE_LIST_PAGE = "http://localhost/web_2022-05-23/notice/list?pageNumber=1";
	
	// 5. 공지사항 상세 정보 페이지
	public static String NOTICE_DETAIL_PAGE = "/notice/detail.jsp";
	
	// 6. 공지사항 작성 페이지
	public static String NOTICE_WRITE_PAGE = "/notice/form.jsp";
	
	// 7. 공지사항 수정 페이지
	public static String NOTICE_UPDATE_PAGE = "http://localhost/web_2022-05-23/notice/detail?idx=9&requestPage=update";
}
