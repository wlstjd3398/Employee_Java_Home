package service;

import java.util.List;

import dao.BoardInfoDao;
import vo.BoardInfo;
import vo.BoardReviewInfo;

public class BoardService {

	// 새로운 자유게시판 저장
	public boolean addBoard(BoardInfo newBoardInfo) {
		
		BoardInfoDao dao = new BoardInfoDao();
		
		boolean result = dao.insertBoardInfo(newBoardInfo);
		
		return result;
	}
	
	// 자유게시판 목록 불러오기(페이지 번호에 맞는 pageNumber 불러오기)
	public String loadBoardInfoListToJson(int pageNumber) {
		// 자유게시판 목록을 불러온다.(페이지 번호에 맞는 페이지넘버를 불러옴)
		BoardInfoDao dao = new BoardInfoDao();
		List<BoardInfo> BoardInfoList = dao.selectBoardInfo(pageNumber);
		
		int amount = dao.getAmountOfBoard();
		
		// 불러온 자유게시판 목록을 JSON으로 구성한다.
		String data = "{\"amount\": " + amount + ",";
		data += "\"BoardList\":[";
		for(BoardInfo BoardInfo : BoardInfoList) {
			
			int idx = BoardInfo.getIdx();
			String title = BoardInfo.getTitle();
			String content = BoardInfo.getContent();
			
			data = data + "{\"idx\": " + idx + ",\"title\":\"" + title + "\",\"content\":\"" + content + "\"},";
		}
		data = data.substring(0, data.length()-1);
		data = data + "]}";
		
		return data;
	}
	

	// 상세 정보 불러오기
	public String loadBoardInfoToJson(int idx) {
		// 자유게시판의 상세 정보를 DB에서 불러옴
		BoardInfoDao dao = new BoardInfoDao();
		
		BoardInfo BoardInfo = dao.selectBoardInfoByIdx(idx);
		
		// 불러온 상세 정보를 클라이언트에게 전달하기 위해 JSON으로 구성
		String data = null;
		
		if(BoardInfo != null) {
			// 자유게시판의 상세정보를 확인했다면 
			data = "{\"idx\": " + BoardInfo.getIdx() + ",\"title\":\"" + BoardInfo.getTitle() + "\",\"content\":\"" + BoardInfo.getContent() + "\"}";
		}
		
			return data;
	}
	
	// 자유게시판 수정
	public boolean updateBoardInfo(BoardInfo newBoardInfo) {
		
		BoardInfoDao dao = new BoardInfoDao();
		return dao.updateBoardInfo(newBoardInfo);
	}
	
	
//	=========================================================================
	
	
	// 자유게시판댓글 목록 불러오기(페이지 번호에 맞는 pageNumber 불러오기)
	public String loadBoardReviewInfoListToJson(int pageNumber) {
		// 자유게시판 목록을 불러온다.(페이지 번호에 맞는 페이지넘버를 불러옴)
		BoardInfoDao dao = new BoardInfoDao();
		
		@SuppressWarnings("unchecked")
		List<BoardReviewInfo> BoardReviewInfoList = (List<BoardReviewInfo>) dao.selectReviewByIdx(pageNumber);
		
		int amount = dao.getAmountOfBoardReview();
		
		// 불러온 자유게시판 목록을 JSON으로 구성한다.
		String data = "{\"amount\": " + amount + ",";
		data += "\"BoardReviewList\":[";
		for(BoardReviewInfo BoardReviewInfo : BoardReviewInfoList) {
			
			int idx = BoardReviewInfo.getIdx();
			String reviewWriter = BoardReviewInfo.getReviewWriter();
			String reviewContent = BoardReviewInfo.getReviewContent();
			
			data = data + "{\"idx\": " + idx + ",\"reviewWriter\":\"" + reviewWriter + "\",\"reviewContent\":\"" + reviewContent + "\"},";
		}
		data = data.substring(0, data.length()-1);
		data = data + "]}";
		
		return data;
	}
	
	
	// 새로운 자유게시판댓글 저장
	public boolean addBoardReview(BoardReviewInfo newBoardReviewInfo) {
		
		BoardInfoDao dao = new BoardInfoDao();
		
		boolean result = dao.insertBoardReviewInfo(newBoardReviewInfo);
		
		return result;
	}
	
	// 자유게시판댓글 수정
	public boolean updateBoardReviewInfo(BoardReviewInfo newBoardReviewInfo) {
		
		BoardInfoDao dao = new BoardInfoDao();
		return dao.updateBoardReviewInfo(newBoardReviewInfo);
	}
	
}
