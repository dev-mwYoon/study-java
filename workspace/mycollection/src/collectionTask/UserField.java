package collectionTask;

import java.awt.desktop.UserSessionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class UserField {

	public ArrayList<User> users = DBConnecter.users;
	private final int KEY = 3;
	private final int NUMBER_LENGTH = 4;
	User user;

//	회원 정보를 담을 DB를 ArrayList로 선언

//	휴대폰 중복검사
//	public User checkPhoneNumber(String phoneNumber) {
//		User user = null;
//		
//		for (int i = 0; i < users.size(); i++) {
//			if (users.get(i).getId().equals(phoneNumber)) {
//				user = users.get(i);
//			}
//		}
//
//		return user;
//	}
	
//	아이디 중복검사
	public User checkId(String id) {
		User user = null;

		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getId().equals(id)) {
				user = users.get(i);
			}
		}

		return user;
	}

//	회원가입
	public void signUp(User user) {
//		여기서 암호화한 값을 set해줘야함.
		user.setPassword(encrypt(user.getPassword())); // ★★★user★★★ 놓친 부분.
		users.add(user);
	}

//	암호화 > 여기서만 사용하므로 public -> private이 좋음.
	private String encrypt(String password) {
		String encryptedPassword = "";

		for (int i = 0; i < password.length(); i++) {
			encryptedPassword += (char) (password.charAt(i) * KEY);
		}

		return encryptedPassword;
	}
//	public User login(String id, String password) {
//		User user = checkId(id);
//		if(user != null) {
//			if(user.getPassword().equals(encrypt(password))) {
//				return user;
//			}
//		}
//		return null;
//	}
//	로그인 ★★여기 부분 다름.
	public User login(String id, String password) { // 매개변수랑 필드명이랑 일치하는게 좋음.
		User user = checkId(id);
		if(user != null) {
			if (user.getPassword().equals(encrypt(password))) {
				return user;
			}
		}
		return null;
		
////		아이디와 비밀번호를 입력.
//		if (users.contains(id) && users.contains(password)) {
//			return true;
//		}
//		return false;
	}

//	id찾기
	public String findId(String name, String phoneNumber) {
		String yourId = null;
		if (users.contains(name) && users.contains(phoneNumber)) {
			yourId = user.getId();
		}
		return yourId;
	}
//		4자리 인증번호 생성. ★★이 부분은 인증번호 생성 메소드를 private으로 만들어서 사용하기.
	private String certificationNumber() {
		String certificationNumber = "";
		Random random = new Random();
		
		for (int i = 0; i < NUMBER_LENGTH; i++) {
			certificationNumber += random.nextInt(10);
		}
		
		return certificationNumber;
	}

//	전송 조건은 완료 시, 인증번호 메소드 출력을 화면에서 결정.
//	인증번호 전송
	public String sendCertificationNumber(String phoneNumber) {
		String certificationNumber = certificationNumber();

		String api_key = "NCSOI8BWPFVQSSKZ";
		String api_secret = "Y35VV7M6OADT2TO3HVCZWM8KIDGMPBQL";
		Message coolsms = new Message(api_key, api_secret);


		// 4 params(to, from, type, text) are mandatory. must be filled
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("to", phoneNumber); // 김동한"01020024879" 김세윤 "01056337014"
		params.put("from", "01037091903");
		params.put("type", "SMS");
		params.put("text", certificationNumber);
		params.put("app_version", "test app 1.2"); // application name and version

		try {
			JSONObject obj = (JSONObject) coolsms.send(params);
//			System.out.println(obj.toString());
		} catch (CoolsmsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCode());
		}

//		users.set(0, user)
		return certificationNumber;

	}

//	비밀번호 변경
	public void changePassword(User user) {
//		인증번호와 입력 값이 같은지.
		User requestUser = checkId(user.getId());
		requestUser.setPassword(encrypt(user.getPassword()));
//		if (user.getCertificationNumber().equals(certificationNumber)) {
//				if(user.getPhoneNumber().equals(phoneNum)){
//					encryptedPassword(password);
//			}
//				입력한 비밀번호로 값 변경.
//		}
	}
}
