package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import domain.BoardDTO;
import domain.BoardVO;

public class BoardDAO {
	public Connection connection; //���� ��ü
	public PreparedStatement preparedStatement; //���� ���� ��ü
	public ResultSet resultSet; //��� ���̺� ��ü
	
//	�Խñ� �߰�
//	�Խñ۰�ü�� ���� �޾Ƽ� �߰��� �׸���� value���� �־��ֱ� ���ؼ� boardVO��ü�� �Ű������� ����.
	public void insert(BoardVO boardVO) {
//		���⼱ not null�� ���� �������� �߰���.
//		�Խñ� �ۼ� �ð� �� �Խñ� ������Ʈ �ð��� oracle SYSDATE�� �̿��� ���� �ð��� ����ش�. 
		String query = "INSERT INTO TBL_BOARD"
				+ "(BOARD_ID, BOARD_TITLE, BOARD_CONTENT, BOARD_REGISTER_DATE, BOARD_UPDATE_DATE, USER_ID) "
				+ "VALUES(SEQ_BOARD.NEXTVAL, ?, ?, SYSDATE, SYSDATE, ?)";
//		DBConnecter�� �������ش�.
		connection = DBConnecter.getConnection();
		try {
//			���ᰴü�� ���������޼ҵ忡 �������� ��� ���� ���� ��ü�� ����ش�.
			preparedStatement = connection.prepareStatement(query);
//			�������� ��ü���� ù ��° ����ǥ(�Ķ����), ������ ���� ����, ��� ���� Ÿ������ set���ش�.
			preparedStatement.setString(1, boardVO.getBoardTitle());
			preparedStatement.setString(2, boardVO.getBoardContent());
			preparedStatement.setLong(3, boardVO.getUserId());
//			��ȸ�ؼ� ����ϴ� �������� �ƴϱ� ������ executeUpdate�� �������� ��ü�� ����.
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("insert(BoardVO) SQL�� ����");
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
//	�Խñ� ��ȸ
//	�Խñ� ��ȸ�Ϸ��� �ش� �Խñۿ� PK�� ����Id���� �Ű������� �޴´�.
	public BoardDTO select(Long boardId) {
//		������������ �Խñ��� �� ��, �Խñ� ��ü�� ��� ������ ���� ��ü�� ��� ���� ��θ� �ʿ�� �ϱ� ������
//		�� ���̺��� user_id�� ���� �Ѵ�. 
//		�Խñۿ����� ���� �뵵�� ����ϰ� User��ü�� Board��ü�� DTO��ü�� ��� ��Ƽ� 
//		���������� ��ȸ�� ��� ���� DTO��ü�� ����ش�.
		String query = "SELECT BOARD_ID, BOARD_TITLE, BOARD_CONTENT, BOARD_REGISTER_DATE, "
				+ " BOARD_UPDATE_DATE, U.USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD, "
				+ " USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, USER_GENDER, "
				+ " USER_RECOMMENDER_ID "
				+ "FROM TBL_USER U JOIN TBL_BOARD B "
				+ "ON U.USER_ID = B.USER_ID AND BOARD_ID = ?";
		
//		boardDTO�� null�� �ʱ�ȭ�ؾ߸� ��ü�� ������ �ȴ���� �� null�� ��ȯ�Ͽ�
//		������ ����� �ʾҴٴ� ���� �˷��ش�.
		BoardDTO boardDTO = null;
//		�ε����� ���
		int index = 0;
//		���Ŀ���Ͷ� ����
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
//	�Խñ� ����
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
	
//	�Խñ� ����
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
	
//	�Խñ� ��ü ��ȸ
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




















