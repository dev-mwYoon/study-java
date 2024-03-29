package view;

import dao.BoardDAO;
import dao.LikeDAO;
import dao.ReplyDAO;
import dao.UserDAO;
import domain.BoardDTO;
import domain.BoardVO;
import domain.ReplyDTO;
import domain.ReplyVO;
import domain.UserVO;

public class Test {
	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
//		if(userDAO.checkId("hds1234")) {
//			System.out.println("사용 가능한 아이디");
//			return;
//		}
//		System.out.println("중복된 아이디");
		
//		System.out.println(userDAO.select(1L));
		
		
//		[실습] 메소드 전체 검증
//		회원가입
		UserVO userVO = new UserVO();
//		userVO.setUserIdentification("lss1234");
//		userVO.setUserName("이순신");
//		userVO.setUserPassword("1234");
//		userVO.setUserAddress("경기도 파주시");
//		userVO.setUserBirth("1545-04-08");
//		userVO.setUserEmail("lss1234@naver.com");
//		userVO.setUserPhone("01099998888");
//		userVO.setUserRecommenderId(null);
		
//		userVO.setUserIdentification("jbg1234");
//		userVO.setUserName("장보고");
//		userVO.setUserPassword("9999");
//		userVO.setUserAddress("서울특별시 관악구");
//		userVO.setUserBirth("2000-12-04");
//		userVO.setUserEmail("jbg1234@gmail.com");
//		userVO.setUserPhone("01099991234");
//		userVO.setUserRecommenderId("lss1234");
		
//		userVO.setUserIdentification("phgs1234");
//		userVO.setUserName("박혁거세");
//		userVO.setUserPassword("7890");
//		userVO.setUserAddress("강원도 강릉시");
//		userVO.setUserBirth("2010-12-04");
//		userVO.setUserEmail("phgs1234@gmail.com");
//		userVO.setUserPhone("01032291234");
//		userVO.setUserRecommenderId("lss1234");
		
//		if(userDAO.checkId(userVO.getUserIdentification())) {
//			userDAO.insert(userVO);
//		}else {
//			System.out.println("중복된 아이디");
//		}
		
//		로그인
		if(userDAO.login("phgs1234", "7890")) {
			System.out.println("로그인 성공");
			System.out.println(UserDAO.userId);
		}else {
			System.out.println("로그인 실패");
		}
		
//		아이디 찾기
//		System.out.println(userDAO.findIdentification("01099991234"));
		
//		비밀번호 변경
//		userDAO.updateUserPassword("3333");
		
//		if(userDAO.login("lss1234", "3333")) {
//			System.out.println("로그인 성공");
//			System.out.println(UserDAO.userId);
//		}else {
//			System.out.println("로그인 실패");
//		}
		
//		회원정보 조회
//		UserVO user = userDAO.select();
		
//		회원정보 수정
//		user.setUserNickname("거북왕");
//		userDAO.update(user);
		
//		추천 수
//		System.out.println(userDAO.getCountOfRecommenderId("jbg1234"));
		
//		나를 추천한 사람
//		userDAO.selectRecommenders().stream().map(UserVO::toString).forEach(System.out::println);
		
//		내가 추천한 사람
		
//		if(userDAO.login("jbg1234", "9999")) {
//			System.out.println("로그인 성공");
//			System.out.println(UserDAO.userId);
//		}else {
//			System.out.println("로그인 실패");
//		}
		
//		UserVO user = userDAO.getMyRecommender();
//		if(user != null) {
//			System.out.println(user);
//			
//		}else {
//			System.out.println("추천한 사람이 없습니다.");
//		}
		
//		회원 탈퇴
//		userDAO.delete();
//		==========================================================================
		BoardDAO boardDAO = new BoardDAO();
		LikeDAO likeDAO = new LikeDAO();
//		게시글 추가
		BoardVO boardVO = new BoardVO();
//		
//		if(userDAO.login("lss1234", "1234")) {
//			System.out.println("로그인 성공");
//			System.out.println(UserDAO.userId);
//		}else {
//			System.out.println("로그인 실패");
//		}
//		
//		boardVO.setBoardTitle("거북선에서 태어나");
//		boardVO.setBoardContent("장군으로 강림하다.");
//		boardVO.setUserId(UserDAO.userId);

//		boardVO.setBoardTitle("알에서 태어나");
//		boardVO.setBoardContent("왕으로 강림하다.");
//		boardVO.setUserId(UserDAO.userId);
//
//		boardDAO.insert(boardVO);
		
//		게시글 추천 클릭
//		if (likeDAO.checkLike(2L)) {
//			likeDAO.insert(2L);
//			boardDAO.updateLike(2L);
//		} else {
//			System.out.println("이미 추천했습니다.");
//		}
		
//		게시글에 좋아요한 사람들
//		likeDAO.likeWho(1L).stream().map(UserVO::toString).forEach(System.out::println);
		
//		내가 좋아요한 게시글
//		likeDAO.likeBoard().stream().map(BoardVO::toString).forEach(System.out::println);
		
		
		
		
//		게시글 조회
//		System.out.println(boardDAO.select(1L));
//		BoardDTO boardDTO = boardDAO.select(2L);
		
//		게시글 수정
//		if(UserDAO.userId == boardDTO.getUserId()) {
//			boardDTO.setBoardTitle("수정된 제목");
//			boardDAO.update(boardDTO.toBoardVO());
//		}else {
//			System.out.println("작성자만 수정이 가능합니다.");
//		}
		
//		게시글 삭제
//		if(UserDAO.userId == boardDTO.getUserId()) {
//			boardDAO.delete(boardDTO.getBoardId());
//		}else {
//			System.out.println("작성자만 삭제가 가능합니다.");
//		}
		
//		게시글 전체 조회
//		boardDAO.selectAll().stream().map(BoardDTO::toString).forEach(System.out::println);
//		==========================================================================
//		UserDAO userDAO = new UserDAO();
//		BoardDAO boardDAO = new BoardDAO();
//		ReplyDAO replyDAO = new ReplyDAO();
//		
//		if(userDAO.login("phgs1234", "7890")) {
//			System.out.println("로그인 성공");
//		}else {
//			System.out.println("로그인 실패");
//		}
//		
//		BoardDTO boardDTO = boardDAO.select(1L);
//		System.out.println(boardDTO);
		
//		댓글 추가
//		ReplyVO replyVO = new ReplyVO();
//		replyVO.setBoardId(boardDTO.getBoardId());
//		replyVO.setReplyContent("두번째 댓글");
//		
//		replyDAO.insert(replyVO);
		
//		대댓글 추가
//		ReplyVO replyVO = new ReplyVO();
//		replyVO.setBoardId(boardDTO.getBoardId());
////		replyVO.setReplyContent("첫번째 댓글의 첫번째 대댓글");
////		replyVO.setReplyContent("첫번째 댓글의 두번째 대댓글");
//		replyVO.setReplyContent("두번째 댓글의 첫번째 대댓글");
//		
//		replyDAO.insert(replyVO, 5L);
		
//		댓글 전체 조회
//		replyDAO.selectAll().stream().filter(dto -> dto.getReplyGroup() == 1).map(ReplyDTO::toString).forEach(System.out::println);
//		replyDAO.selectAll().stream().filter(dto -> dto.getReplyGroup() == 5).map(ReplyDTO::toString).forEach(System.out::println);
		
//		대댓글 삭제
//		replyDAO.deleteReReply(4L);
		
//		댓글 삭제
//		replyDAO.deleteReply(1L);
		
//		댓글 수정
//		replyDAO.selectAll().stream().filter(dto -> dto.getReplyId() == 5).map(ReplyDTO::toReplyVO).forEach(vo -> {
//			vo.setReplyContent("수정된 댓글");
//			replyDAO.update(vo);
//		});
		
		
	}
}































