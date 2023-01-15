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

//	ȸ�� ������ ���� DB�� ArrayList�� ����

//	�޴��� �ߺ��˻�
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
	
//	���̵� �ߺ��˻�
	public User checkId(String id) {
		User user = null;

		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getId().equals(id)) {
				user = users.get(i);
			}
		}

		return user;
	}

//	ȸ������
	public void signUp(User user) {
//		���⼭ ��ȣȭ�� ���� set�������.
		user.setPassword(encrypt(user.getPassword())); // �ڡڡ�user�ڡڡ� ��ģ �κ�.
		users.add(user);
	}

//	��ȣȭ > ���⼭�� ����ϹǷ� public -> private�� ����.
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
//	�α��� �ڡڿ��� �κ� �ٸ�.
	public User login(String id, String password) { // �Ű������� �ʵ���̶� ��ġ�ϴ°� ����.
		User user = checkId(id);
		if(user != null) {
			if (user.getPassword().equals(encrypt(password))) {
				return user;
			}
		}
		return null;
		
////		���̵�� ��й�ȣ�� �Է�.
//		if (users.contains(id) && users.contains(password)) {
//			return true;
//		}
//		return false;
	}

//	idã��
	public String findId(String name, String phoneNumber) {
		String yourId = null;
		if (users.contains(name) && users.contains(phoneNumber)) {
			yourId = user.getId();
		}
		return yourId;
	}
//		4�ڸ� ������ȣ ����. �ڡ��� �κ��� ������ȣ ���� �޼ҵ带 private���� ���� ����ϱ�.
	private String certificationNumber() {
		String certificationNumber = "";
		Random random = new Random();
		
		for (int i = 0; i < NUMBER_LENGTH; i++) {
			certificationNumber += random.nextInt(10);
		}
		
		return certificationNumber;
	}

//	���� ������ �Ϸ� ��, ������ȣ �޼ҵ� ����� ȭ�鿡�� ����.
//	������ȣ ����
	public String sendCertificationNumber(String phoneNumber) {
		String certificationNumber = certificationNumber();

		String api_key = "NCSOI8BWPFVQSSKZ";
		String api_secret = "Y35VV7M6OADT2TO3HVCZWM8KIDGMPBQL";
		Message coolsms = new Message(api_key, api_secret);


		// 4 params(to, from, type, text) are mandatory. must be filled
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("to", phoneNumber); // �赿��"01020024879" �輼�� "01056337014"
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

//	��й�ȣ ����
	public void changePassword(User user) {
//		������ȣ�� �Է� ���� ������.
		User requestUser = checkId(user.getId());
		requestUser.setPassword(encrypt(user.getPassword()));
//		if (user.getCertificationNumber().equals(certificationNumber)) {
//				if(user.getPhoneNumber().equals(phoneNum)){
//					encryptedPassword(password);
//			}
//				�Է��� ��й�ȣ�� �� ����.
//		}
	}
}
