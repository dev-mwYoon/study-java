package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import domain.BoardDTO;
import domain.BoardVO;

public class BoardDAO {
	public Connection connection; //연결 객체
	public PreparedStatement preparedStatement; //쿼리 관리 객체
	public ResultSet resultSet; //결과 테이블 객체
	
//	게시글 추가
//	게시글객체를 전부 받아서 추가할 항목들을 value값에 넣어주기 위해서 boardVO객체를 매개변수로 받음.
	public void insert(BoardVO boardVO) {
//		여기선 not null의 값만 쿼리문에 추가함.
//		게시글 작성 시각 및 게시글 업데이트 시각은 oracle SYSDATE를 이용해 현재 시각을 담아준다. 
		String query = "INSERT INTO TBL_BOARD"
				+ "(BOARD_ID, BOARD_TITLE, BOARD_CONTENT, BOARD_REGISTER_DATE, BOARD_UPDATE_DATE, USER_ID) "
				+ "VALUES(SEQ_BOARD.NEXTVAL, ?, ?, SYSDATE, SYSDATE, ?)";
//		DBConnecter를 연결해준다.
		connection = DBConnecter.getConnection();
		try {
//			연결객체의 쿼리관리메소드에 쿼리문을 담고 쿼리 관리 객체에 담아준다.
			preparedStatement = connection.prepareStatement(query);
//			쿼리관리 객체에서 첫 번째 물음표(파라미터), 담고싶은 값을 적고, 담는 값에 타입으로 set해준다.
			preparedStatement.setString(1, boardVO.getBoardTitle());
			preparedStatement.setString(2, boardVO.getBoardContent());
			preparedStatement.setLong(3, boardVO.getUserId());
//			조회해서 출력하는 쿼리문이 아니기 때문에 executeUpdate로 쿼리관리 객체를 실행.
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("insert(BoardVO) SQL문 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}
//	게시글 조회
//	게시글 조회하려면 해당 게시글에 PK인 고유Id값을 매개변수로 받는다.
	public BoardDTO select(Long boardId) {
//		쿼리문에서는 게시글을 볼 때, 게시글 객체에 담긴 정보와 유저 객체에 담긴 정보 모두를 필요로 하기 때문에
//		두 테이블의 user_id로 조인 한다. 
//		게시글에서만 보일 용도로 사용하고 User객체와 Board객체를 DTO객체에 모두 담아서 
//		쿼리문에서 조회한 모든 값을 DTO객체에 담아준다.
		String query = "SELECT BOARD_ID, BOARD_TITLE, BOARD_CONTENT, BOARD_REGISTER_DATE, "
				+ " BOARD_UPDATE_DATE, U.USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD, "
				+ " USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, USER_GENDER, "
				+ " USER_RECOMMENDER_ID "
				+ "FROM TBL_USER U JOIN TBL_BOARD B "
				+ "ON U.USER_ID = B.USER_ID AND BOARD_ID = ?";
		
//		boardDTO를 null로 초기화해야만 객체에 정보가 안담겼을 때 null을 반환하여
//		정보가 담기지 않았다는 것을 알려준다.
		BoardDTO boardDTO = null;
//		인덱스로 사용
		int index = 0;
//		디비커넥터랑 연결
		connection = DBConnecter.getConnection();
		try {
			
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, boardId);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				boardDTO = new BoardDTO();
				boardDTO.setBoardId(resultSet.getLong(++index));
				boardDTO.setBoardTitle(resultSet.getString(++index));
				boardDTO.setBoardContent(resultSet.getString(++index));
				boardDTO.setBoardRegisterDate(resultSet.getString(++index));
				boardDTO.setBoardUpdateDate(resultSet.getString(++index));
				boardDTO.setUserId(resultSet.getLong(++index));
				boardDTO.setUserIdentification(resultSet.getString(++index));
				boardDTO.setUserName(resultSet.getString(++index));
				boardDTO.setUserPassword(resultSet.getString(++index));
				boardDTO.setUserPhone(resultSet.getString(++index));
				boardDTO.setUserNickname(resultSet.getString(++index));
				boardDTO.setUserEmail(resultSet.getString(++index));
				boardDTO.setUserAddress(resultSet.getString(++index));
				boardDTO.setUserBirth(resultSet.getString(++index));
				boardDTO.setUserGender(resultSet.getString(++index));
				boardDTO.setUserRecommenderId(resultSet.getString(++index));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		
		return boardDTO;
	}
//	게시글 수정
	public void update(BoardVO boardVO) {
		String query = "UPDATE TBL_BOARD SET BOARD_TITLE = ?, BOARD_CONTENT = ?, BOARD_UPDATE_DATE = SYSDATE "
				+ "WHERE BOARD_ID = ?";
		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, boardVO.getBoardTitle());
			preparedStatement.setString(2, boardVO.getBoardContent());
			preparedStatement.setLong(3, boardVO.getBoardId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}
	
//	게시글 삭제
	public void delete(Long boardId) {
		String query = "DELETE FROM TBL_BOARD WHERE BOARD_ID = ?";
		
		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, boardId);
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		
	}
	
//	게시글 전체 조회
	public ArrayList<BoardDTO> selectAll(){
		String query = "SELECT BOARD_ID, BOARD_TITLE, BOARD_CONTENT, BOARD_REGISTER_DATE, "
				+ " BOARD_UPDATE_DATE, U.USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD, "
				+ " USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, USER_GENDER, "
				+ " USER_RECOMMENDER_ID "
				+ "FROM TBL_USER U JOIN TBL_BOARD B "
				+ "ON U.USER_ID = B.USER_ID";
		
		
		BoardDTO boardDTO = null;
		ArrayList<BoardDTO> boards = new ArrayList<BoardDTO>();
		int index = 0;
		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				index = 0;
				boardDTO = new BoardDTO();
				boardDTO.setBoardId(resultSet.getLong(++index));
				boardDTO.setBoardTitle(resultSet.getString(++index));
				boardDTO.setBoardContent(resultSet.getString(++index));
				boardDTO.setBoardRegisterDate(resultSet.getString(++index));
				boardDTO.setBoardUpdateDate(resultSet.getString(++index));
				boardDTO.setUserId(resultSet.getLong(++index));
				boardDTO.setUserIdentification(resultSet.getString(++index));
				boardDTO.setUserName(resultSet.getString(++index));
				boardDTO.setUserPassword(resultSet.getString(++index));
				boardDTO.setUserPhone(resultSet.getString(++index));
				boardDTO.setUserNickname(resultSet.getString(++index));
				boardDTO.setUserEmail(resultSet.getString(++index));
				boardDTO.setUserAddress(resultSet.getString(++index));
				boardDTO.setUserBirth(resultSet.getString(++index));
				boardDTO.setUserGender(resultSet.getString(++index));
				boardDTO.setUserRecommenderId(resultSet.getString(++index));
				boards.add(boardDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		
		return boards;
	}
}




















