package collectionTask;

import java.util.ArrayList;
import java.util.Scanner;

//[심화 실습]
//		   User 클래스 선언
//		   - 이름, 아이디, 비밀번호, 휴대폰번호
//		   - private으로 선언
//		   - 기본 생성자만 선언
//		   - toString() 재정의
//		   
//		   UserField 클래스 선언
//		   - 회원 정보를 담을 DB를 ArrayList로 선언
//		   - 아이디 중복검사
//		   - 회원가입
//		   - 로그인
//		   - 암호화
//		   - 비밀번호 변경(비밀번호 찾기 서비스)
//		   - 인증번호 전송
//
//		   Page 클래스 선언
//		   - main 메소드 선언
//		   - 테스트 진행
public class Page {
	public static void main(String[] args) {
		/*
		 * 회원가입 로그인 비밀번호 변경
		 * 
		 */

		String name = null, id = null, password = null, phoneNumber = null, certificationNumber = null;
		String temp = null;
		String nameMessage = "이름 입력";
		String idMessage = "아이디 입력";
		String reinputIdMessage = "아이디 중복입니다. 다시 입력해주세요.";
		String passwordMessage = "비밀번호 입력";
		String rePasswordMessage = "새로운 비밀번호 입력";
		String phoneNumberMessage = "핸드폰번호 입력";
		String reinputPhoneNumberMessage = "휴대폰번호 중복입니다. 다시 입력해주세요.";
		String certificationMessage = "인증번호를 입력해주세요.";
		UserField userField = new UserField();
		User user = new User();

		ArrayList<User> users = userField.users;

		Scanner sc = new Scanner(System.in);
//		   - 아이디 중복검사
//		   - 회원가입
//		   - 로그인
//		   - 암호화
//		   - 비밀번호 변경(비밀번호 찾기 서비스)
//		   - 인증번호 전송
		int choice = 0;
		boolean flag = false;
		String[] arMsg = { "1. 회원가입", "2. 로그인", "3. 비밀번호 찾기", "4. 나가기" };
		
		for (int i = 0; i < arMsg.length; i++) {
			System.out.println(arMsg[i]);
		}
		choice = sc.nextInt();

		while (true) {
			switch (choice) {
//			회원가입
			case 4: {
				System.out.println("종료합니다.");
				flag = true;
				break;
			}
			case 1: {
//				이름 입력
				System.out.println(nameMessage);
				name = sc.next();
				user.setName(name);

//				아이디 입력
				System.out.println(idMessage);
				id = sc.next();

//				아이디 중복검사
				while (userField.checkId(id) != null) {
					System.out.println(reinputIdMessage);
					id = sc.next();
					System.out.println(userField.checkId(id));
				}
				user.setId(id);

//				비밀번호 입력
				System.out.println(passwordMessage);
				password = sc.next();
				user.setPassword(password);

//				휴대폰번호 입력
				System.out.println(phoneNumberMessage);
				phoneNumber = sc.next();
				user.setPhoneNumber(phoneNumber);
//				while(userField.checkPhoneNumber(phoneNumber) != null) {
//					System.out.println(reinputPhoneNumberMessage);
//					phoneNumber = sc.next();
//				}

//				어레이 리스트 users객체에 user추가
				users.add(user);
				break;
			}
//			로그인
			case 2: {
				while (true) {
					System.out.println(idMessage);
					id = sc.next();
					System.out.println(passwordMessage);
					password = sc.next();
					userField.login(id, password);
					
					if (userField.login(id, password) != null) {
						break;
					}
					System.out.println("로그인 실패");
				}
				
				break;
			}
//			비밀번호 찾기
			case 3: {
				while (true) {
					System.out.println(idMessage);
					id = sc.next();
					if(userField.checkId(id) == null) {
						continue;
					}
					user = userField.checkId(id);
					System.out.println(phoneNumberMessage);
					phoneNumber = sc.next();
					temp = userField.sendCertificationNumber(phoneNumber);
					
					System.out.println(certificationMessage);
					certificationNumber = sc.next();
					
					if (certificationNumber.equals(temp)) {
						System.out.println(rePasswordMessage);
						password = sc.next();
						user.setPassword(password);
						break;
					}
				}
				break;
			}
//			잘못 입력.
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
//			4.나가기 입력 시 flag true로 반환
			if(flag) {break;}
		}

	}
}
